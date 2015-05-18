#!/bin/bash
#
# This script assumes that Sireum is reachable from the PATH environment variable.
#
export PACKAGE_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )
export VERSION=2.1.0
export DROP_URL=${MIRROR_URL:=http://www.aadl.info/aadl/osate/stable/}$VERSION/products

if [ ! -f osate2-$VERSION-macosx.cocoa.x86_64.zip ]; then
  echo
  echo Downloading Osate2 $VERSION mac64
  echo
  wget $DROP_URL/osate2-$VERSION-macosx.cocoa.x86_64.zip
  echo
fi
if [ ! -f osate2-$VERSION-linux.gtk.x86_64.zip ]; then
  echo Downloading Osate2 $VERSION linux64
  echo
  wget $DROP_URL/osate2-$VERSION-linux.gtk.x86_64.zip
  echo
fi
if [ ! -f osate2-$VERSION-win32.win32.x86_64.zip ]; then
  echo Downloading Osate2 $VERSION win64
  echo
  wget $DROP_URL/osate2-$VERSION-win32.win32.x86_64.zip
  echo
fi
#
echo Packaging osate2-mac64.sapp
#
unzip -q osate2-$VERSION-macosx.cocoa.x86_64.zip 
mv osate2/osate.app/Contents/MacOS/osate osate2/osate.app/Contents/MacOS/osate.orig
cp $PACKAGE_HOME/mac/osate osate2/osate.app/Contents/MacOS/
chmod 755 osate2/osate.app/Contents/MacOS/osate
cp -R $PACKAGE_HOME/links osate2/
sireum tools sapper osate2-mac64.sapp osate2
rm -R osate2
#
echo Packaging osate2-linux64.sapp
#
unzip -q osate2-$VERSION-linux.gtk.x86_64.zip
rm osate2/osate
cp $PACKAGE_HOME/linux/osate osate2/
chmod 755 osate2/osate
cp -R $PACKAGE_HOME/links osate2/
sireum tools sapper osate2-linux64.sapp osate2
#tar cfz osate2-linux64.tar.gz osate2
rm -fR osate2
#
echo Packaging osate2-win64.sapp
#
unzip -q osate2-$VERSION-win32.win32.x86_64.zip
rm osate2/osate.exe
rm osate2/eclipsec.exe*
cp $PACKAGE_HOME/windows/osate.bat osate2/
cp $PACKAGE_HOME/windows/README.TXT osate2/
cp -R $PACKAGE_HOME/links osate2/
zip -q -r osate2-win64.sapp osate2
rm -R osate2
echo
echo ...done!
