package org.sireum.cli.launcher

import java.io._
import org.sireum.option._
import org.sireum.util._

/**
 * @author <a href="mailto:jjedrys@k-state.edu">Jakub Jedryszek</a>
 */
object GpsLauncher {
  def run(elmode : LaunchBakarV1GpsMode) {
    new GpsLauncher().execute
  }
  
  def run(elmode : LaunchBakarGpsMode) {
    new GpsLauncher().execute
  }
}

/**
 * @author <a href="mailto:jjedrys@k-state.edu">Jakub Jedryszek</a>
 */
class GpsLauncher {
  def execute {
    var gpsRelPath = "apps/gnat/2014/bin/"
    gpsRelPath = gpsRelPath + "gps"
    val gps = new File(System.getenv("SIREUM_HOME"), gpsRelPath).getCanonicalPath()
    val e = new Exec
    e.run(-1, ivector(gps), None)
  }
}