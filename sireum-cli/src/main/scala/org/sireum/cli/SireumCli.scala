package org.sireum.cli

import org.sireum.option._
import org.sireum.util._
import java.io.PrintWriter

object SireumCli extends App {

  args.foreach(c => print(c + " "))
  println()

  val opt = new SireumCli().parse(args)

  import java.io._
  opt.printTags(new PrintWriter(new OutputStreamWriter(scala.Console.out)),
    new PrintWriter(new OutputStreamWriter(scala.Console.err)))
}

class SireumCli {
  val result = new CliResult()

  def parse(args : Seq[String]) : CliResult = {
    parseSireumMode(args, 0)
    return result
  }

  def parseModeHelper(parentMode : String, modes : Seq[String],
                      args : Seq[String], i : Int)(f : String => Unit) {
    val mode = args(i)
    val modeMatches = modes.filter(_.startsWith(mode))
    if (modeMatches.size == 1) f(modeMatches(0))
    else {
      val lineSep = System.getProperty("line.separator")
      addErrorTag(mode + " is not a mode of " + parentMode)
      val sb = new StringBuilder("Did you mean one of the following modes?")
      sb.append(lineSep)
      for (mm <- modeMatches) {
        sb.append("  ")
        sb.append(mm)
        sb.append(lineSep)
      }
      addInfoTag(sb.toString)
    }
  }

  def parseSireumDistroMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
Sireum Distro
""".trim
      )
    }
  }

  def parseLaunchEclipseMode(args : Seq[String], i : Int) {
    {
      val opt = LaunchEclipseMode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.launcher.EclipseLauncher"
      result.featureName = "Eclipse.sapp"
      val keys = List[String]("--args")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "--args" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--args"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--args"
                }
                opt.args =
                  if (j + 1 == args.length) List()
                  else args.slice(j + 1, args.length).toList
                j = args.length
              case _ =>
            }
          } else {
            k = k + 1
            k match {

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseLaunchSireumDevMode(args : Seq[String], i : Int) {
    {
      val opt = LaunchSireumDevMode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.launcher.EclipseLauncher"
      result.featureName = "SireumDev.sapp"
      val keys = List[String]("--args")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "--args" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--args"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--args"
                }
                opt.args =
                  if (j + 1 == args.length) List()
                  else args.slice(j + 1, args.length).toList
                j = args.length
              case _ =>
            }
          } else {
            k = k + 1
            k match {

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseLaunchCompilerDevMode(args : Seq[String], i : Int) {
    {
      val opt = LaunchCompilerDevMode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.launcher.EclipseLauncher"
      result.featureName = "CompilerDev.sapp"
      val keys = List[String]("--args")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "--args" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--args"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--args"
                }
                opt.args =
                  if (j + 1 == args.length) List()
                  else args.slice(j + 1, args.length).toList
                j = args.length
              case _ =>
            }
          } else {
            k = k + 1
            k match {

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseLaunchBakarV1Mode(args : Seq[String], i : Int) {
    {
      val opt = LaunchBakarV1Mode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.launcher.EclipseLauncher"
      result.featureName = "BakarV1.sapp"
      val keys = List[String]("--args")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "--args" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--args"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--args"
                }
                opt.args =
                  if (j + 1 == args.length) List()
                  else args.slice(j + 1, args.length).toList
                j = args.length
              case _ =>
            }
          } else {
            k = k + 1
            k match {

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseLaunchAntlrWorksMode(args : Seq[String], i : Int) {
    {
      val opt = LaunchAntlrWorksMode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.launcher.AntlrWorksLauncher"
      result.featureName = "Antlr.sapp"
      val keys = List[String]("")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case _ =>
            }
          } else {
            k = k + 1
            k match {

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseSireumLaunchMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
Sireum Launcher
""".trim
          + "\n\n" +
          """
Available Modes:
  antlrworks   Launch ANTLRWorks
  bakar        Launch Eclipse with Bakar Plugins
  compilerdev  Launch Eclipse with Compiler Dev Plugins
  eclipse      Launch Eclipse
  sireumdev    Launch Eclipse with Sireum Dev Plugins
""".trim
      )
    } else {
      parseModeHelper("launch", Seq("eclipse", "sireumdev", "compilerdev", "bakar", "antlrworks"), args, i) {
        _ match {
          case "eclipse" =>
            parseLaunchEclipseMode(args, i + 1)
          case "sireumdev" =>
            parseLaunchSireumDevMode(args, i + 1)
          case "compilerdev" =>
            parseLaunchCompilerDevMode(args, i + 1)
          case "bakar" =>
            parseLaunchBakarV1Mode(args, i + 1)
          case "antlrworks" =>
            parseLaunchAntlrWorksMode(args, i + 1)
        }
      }
    }
  }

  def parseCliGenMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
  Usage:
    sireum tools cligen <>

  -c | --class-name Fully qualified name for the generated class [Default: "Cli"]
  -d | --directory  Directory where generated class should be saved [Default: "."]
  -p | --packages   Package name prefixes used to filter which classes to process
                    [Separator: ";", Default: ISeq[String]]
  --max-col         Maximum number of characters per line [Default: 80]
  --min-col         Column where description should begin [Default: 20]
  """.trim)
    } else {
      val opt = CliGenMode()
      result.options = Some(opt)
      result.className = "org.sireum.cli.gen.CliBuilder"
      result.featureName = "Sireum Tools"
      val keys = List[String]("-d", "--directory", "--min-col", "--max-col", "-c", "--class-name", "-p", "--packages")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "-d" | "--directory" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--directory"
                  r = r || s == "-d"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--directory"
                  seenopts += "-d"
                }
                val v = process(args(j), args(j + 1), keys, ".")
                if (result.status) {
                  opt.dir = v.get.asInstanceOf[java.lang.String]
                  result.status &= new org.sireum.option.CliGenOption().dirCheck(opt, result.tags)
                  j += 1
                }
              case "--min-col" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--min-col"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--min-col"
                }
                val v = process(args(j), args(j + 1), keys, 20)
                if (result.status) {
                  opt.minCol = v.get.asInstanceOf[java.lang.Integer]
                  j += 1
                }
              case "--max-col" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--max-col"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--max-col"
                }
                val v = process(args(j), args(j + 1), keys, 80)
                if (result.status) {
                  opt.maxCol = v.get.asInstanceOf[java.lang.Integer]
                  j += 1
                }
              case "-c" | "--class-name" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--class-name"
                  r = r || s == "-c"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--class-name"
                  seenopts += "-c"
                }
                val v = process(args(j), args(j + 1), keys, "Cli")
                if (result.status) {
                  opt.genClassName = v.get.asInstanceOf[java.lang.String]
                  result.status &= new org.sireum.option.CliGenOption().genClassNameCheck(opt, result.tags)
                  j += 1
                }
              case "-p" | "--packages" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--packages"
                  r = r || s == "-p"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--packages"
                  seenopts += "-p"
                }
                val v = process(args(j), args(j + 1), keys, ilistEmpty[String])
                if (result.status) {
                  opt.packages = v.get.asInstanceOf[ISeq[String]]
                  j += 1
                }
              case _ =>
            }
          } else {
            k = k + 1
            k match {
              case 0 =>
                val v = process(args(j), args(j), keys, "")
                if (result.status) {
                  opt.className = v.get.asInstanceOf[java.lang.String]
                  result.status &= new org.sireum.option.CliGenOption().classNameCheck(opt, result.tags)
                }

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 1) {
        addErrorTag("Missing required arguments")
      }

      result.status &= new org.sireum.option.CliGenOption().check(opt, result.tags)
    }
  }

  def parsePipelineMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
  Usage:
    sireum tools pipeline <>

  -d   | --directory   Directory where generated class should be saved
                       [Default: ""]
  -gcn | --generated-class-name 
                       Name for the generated class [Default: ""]
  -ts  | --type-substitutions 
                       Pairs of fully qualified type names separated by '/' (e.g.
                       java.lang.Boolean/scala.Boolean) [Separator: ",",
                       Default: ISeq[String]]
  """.trim)
    } else {
      val opt = PipelineMode()
      result.options = Some(opt)
      result.className = "org.sireum.pipeline.gen.ModuleGenerator"
      result.featureName = "Sireum Tools"
      val keys = List[String]("-d", "--directory", "-gcn", "--generated-class-name", "-ts", "--type-substitutions")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "-d" | "--directory" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--directory"
                  r = r || s == "-d"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--directory"
                  seenopts += "-d"
                }
                val v = process(args(j), args(j + 1), keys, "")
                if (result.status) {
                  opt.dir = v.get.asInstanceOf[java.lang.String]
                  j += 1
                }
              case "-gcn" | "--generated-class-name" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--generated-class-name"
                  r = r || s == "-gcn"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--generated-class-name"
                  seenopts += "-gcn"
                }
                val v = process(args(j), args(j + 1), keys, "")
                if (result.status) {
                  opt.genClassName = v.get.asInstanceOf[java.lang.String]
                  j += 1
                }
              case "-ts" | "--type-substitutions" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--type-substitutions"
                  r = r || s == "-ts"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--type-substitutions"
                  seenopts += "-ts"
                }
                val v = process(args(j), args(j + 1), keys, ilistEmpty[String])
                if (result.status) {
                  opt.typeSubstitutions = v.get.asInstanceOf[ISeq[String]]
                  j += 1
                }
              case _ =>
            }
          } else {
            k = k + 1
            k match {
              case _ =>
                val v = process(args(j), args(j), keys, "")
                if (result.status) {
                  opt.classNames :+= v.get.asInstanceOf[java.lang.String]
                }

            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 0) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseTreeVisitorGenMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
  Usage:
    sireum tools antlr <>

  -c | --class-name Name for the generated class [Default: "TreeVisitor"]
  -d | --directory  Directory for the generated class [Default: "(parent directory
                    of token file)"]
  -p | --package    Package name for the generated class [Default: "parser"]
  """.trim)
    } else {
      val opt = TreeVisitorGenMode()
      result.options = Some(opt)
      result.className = "org.sireum.tools.antlr.TreeVisitorGen"
      result.featureName = "Sireum Tools"
      val keys = List[String]("-d", "--directory", "-c", "--class-name", "-p", "--package")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case "-d" | "--directory" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--directory"
                  r = r || s == "-d"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--directory"
                  seenopts += "-d"
                }
                val v = process(args(j), args(j + 1), keys, "(parent directory of token file)")
                if (result.status) {
                  opt.dir = v.get.asInstanceOf[java.lang.String]
                  j += 1
                }
              case "-c" | "--class-name" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--class-name"
                  r = r || s == "-c"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--class-name"
                  seenopts += "-c"
                }
                val v = process(args(j), args(j + 1), keys, "TreeVisitor")
                if (result.status) {
                  opt.className = v.get.asInstanceOf[java.lang.String]
                  j += 1
                }
              case "-p" | "--package" =>

                if (seenopts.exists { s =>
                  var r = false
                  r = r || s == "--package"
                  r = r || s == "-p"
                  r
                }) {
                  addWarningTag("Option already set: %s".format(args(j)))
                } else {
                  seenopts += "--package"
                  seenopts += "-p"
                }
                val v = process(args(j), args(j + 1), keys, "parser")
                if (result.status) {
                  opt.packageName = v.get.asInstanceOf[java.lang.String]
                  j += 1
                }
              case _ =>
            }
          } else {
            k = k + 1
            k match {
              case 0 =>
                val v = process(args(j), args(j), keys, "")
                if (result.status) {
                  opt.tokenFile = v.get.asInstanceOf[java.lang.String]
                }

              case _ =>
                addErrorTag("Too many arguments starting at " + args(j))
            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 1) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseSapperMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
  Usage:
    sireum tools sapper <>


  """.trim)
    } else {
      val opt = SapperMode()
      result.options = Some(opt)
      result.className = "org.sireum.tools.sapp.Sapper"
      result.featureName = "Sireum Tools"
      val keys = List[String]("")
      var j = i
      var k = -1
      val seenopts = scala.collection.mutable.ListBuffer.empty[String]

      try {
        while (j < args.length) {
          if (!keys.contains(args(j)) && args(j).startsWith("-")) {
            addErrorTag(args(j) + " is not an option")
          }
          if (k == -1 && keys.contains(args(j))) {
            if (!keys.contains(args(j)) && args(j).startsWith("-")) {
              addErrorTag(args(j) + " is not an option")
            }
            args(j) match {
              case _ =>
            }
          } else {
            k = k + 1
            k match {
              case 0 =>
                val v = process(args(j), args(j), keys, "")
                if (result.status) {
                  opt.sappFile = v.get.asInstanceOf[java.lang.String]
                }
              case _ =>
                val v = process(args(j), args(j), keys, "")
                if (result.status) {
                  opt.files :+= v.get.asInstanceOf[java.lang.String]
                }

            }
          }
          j = j + 1
        }
      } catch {
        case e : Exception => addErrorTag(e.toString)
      }

      if (k + 1 < 1) {
        addErrorTag("Missing required arguments")
      }

    }
  }

  def parseSireumToolsMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
Sireum Tools
""".trim
          + "\n\n" +
          """
Available Modes:
  antlr 
  cligen 
  pipeline 
  sapper 
""".trim
      )
    } else {
      parseModeHelper("tools", Seq("cligen", "pipeline", "antlr", "sapper"), args, i) {
        _ match {
          case "cligen" =>
            parseCliGenMode(args, i + 1)
          case "pipeline" =>
            parsePipelineMode(args, i + 1)
          case "antlr" =>
            parseTreeVisitorGenMode(args, i + 1)
          case "sapper" =>
            parseSapperMode(args, i + 1)
        }
      }
    }
  }

  def parseSireumMode(args : Seq[String], i : Int) {
    if (i == args.length) {
      addInfoTag(
        """
Sireum: A Software Analysis Platform
(c) 2012, SAnToS Laboratory, Kansas State University
""".trim
          + "\n\n" +
          """
Available Modes:
  distro  Sireum Package Manager
  launch  Sireum Launcher
  tools   Sireum Development Tools
""".trim
      )
    } else {
      parseModeHelper("sireum", Seq("distro", "launch", "tools"), args, i) {
        _ match {
          case "distro" =>
            parseSireumDistroMode(args, i + 1)
          case "launch" =>
            parseSireumLaunchMode(args, i + 1)
          case "tools" =>
            parseSireumToolsMode(args, i + 1)
        }
      }
    }
  }

  def process(key : String, value : String, keys : Seq[String], clazz : Any) : scala.Option[Any] = {
    var messages = Seq[Tag]()
    var v : scala.Option[Any] = None

    if (keys.contains(value)) {
      addErrorTag("Error while parsing " + key + ". " + value + " is a key ")
    }

    try {
      clazz match {
        case s : Int =>
          v = Some(Int.box(Integer.parseInt(value)))
        case s : String =>
          v = Some(value)
        case s : java.lang.Boolean =>
          v = Some(true)
        case s : org.sireum.util.Enum#EnumElem =>
          s.elements collectFirst
            { case s if s.toString.toLowerCase == value.toLowerCase => s } match {
              case Some(valid) =>
                v = Some(valid)
              case _ =>
                addErrorTag(value + " is not a member")
            }
        case s : Seq[_] =>
          v = Some(value.split(",").toList)
        case _ =>
          addErrorTag("Unknown option type " + clazz)
      }
    } catch {
      case e =>
        addErrorTag("wrong argument type supplied " + e.toString())
    }
    return v
  }

  def addErrorTag(desc : String) {
    result.tags += OptionUtil.genTag(OptionUtil.ErrorMarker, desc)
    result.status = false
  }

  def addInfoTag(desc : String) {
    result.tags += OptionUtil.genTag(OptionUtil.InfoMarker, desc)
  }

  def addWarningTag(desc : String) {
    result.tags += OptionUtil.genTag(OptionUtil.WarningMarker, desc)
  }
}

class CliResult {
  var status : Boolean = true
  var className : String = ""
  var featureName : String = ""
  var options : scala.Option[AnyRef] = None
  val tags : MBuffer[Tag] = marrayEmpty[Tag]

  def printTags(out : PrintWriter, err : PrintWriter) {
    for (t @ InfoTag(mt, Some(desc)) <- tags) {
      mt match {
        case OptionUtil.ErrorMarker =>
          err.println(desc)
          err.flush
        case _ =>
          out.println(desc)
          out.flush
      }
    }
  }
}