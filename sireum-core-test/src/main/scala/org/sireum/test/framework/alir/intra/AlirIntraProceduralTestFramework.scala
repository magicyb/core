/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.test.framework.alir.intra

import java.io.OutputStreamWriter
import org.sireum.test.framework._
import org.sireum.core.module._
import org.sireum.pilar.ast._
import org.sireum.pilar.parser._
import org.sireum.pilar.symbol._
import org.sireum.alir._
import org.sireum.util._
import org.sireum.pipeline._
import java.io.PrintWriter

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait AlirIntraProceduralTestFramework extends TestFramework {

  def Analyzing : this.type = this

  def title(s : String) : this.type = {
    _title = caseString + s
    this
  }

  def model(code : String) =
    AlirConfiguration(title, ivector(Left(code)))

  def file(fileUri : FileResourceUri) =
    AlirConfiguration(title, ivector(Right(fileUri)))

  case class AlirConfiguration //
  (title : String, srcs : ISeq[Either[String, FileResourceUri]]) {

    test(title) {

      val job = PipelineJob()
      
      {
        import PilarParserModule.ProducerView._
        import PilarSymbolResolverModule.ProducerView._

        job.sources = srcs
        job.hasExistingModels = None
        job.hasExistingSymbolTable = None
        job.parallel = false
        
        //PilarParserModule.setSources(options, srcs)
        //PilarSymbolResolverModule.setHasExistingModels(options, None)
        //PilarSymbolResolverModule.setHasExistingSymbolTable(options, None)
        //PilarSymbolResolverModule.setParallel(options, false)
        
        import AlirIntraProceduralModule.ProducerView._
        
        job.shouldBuildCfg = true
        job.shouldBuildCdg = true
        job.shouldBuildRda = true
        job.shouldBuildDdg = true
        job.shouldBuildPdg = true
        job.shouldBuildDfg = true
        job.shouldBuildIdg = true
        job.procedureAbsUriIterator = None
        
        //AlirIntraProceduralModule.setShouldBuildCfg(options, true)
        //AlirIntraProceduralModule.setShouldBuildCdg(options, true)
        //AlirIntraProceduralModule.setShouldBuildRda(options, true)
        //AlirIntraProceduralModule.setShouldBuildDdg(options, true)
        //AlirIntraProceduralModule.setShouldBuildPdg(options, true)
        //AlirIntraProceduralModule.setShouldBuildDfg(options, true)
        //AlirIntraProceduralModule.setShouldBuildIdg(options, true)
        //AlirIntraProceduralModule.setProcedureAbsUriIterator(options, None)
      }
      
      pipeline.compute(job)

      if (job.lastStageInfo.hasError) {
        val pwOut = new PrintWriter(Console.out)
        val pwErr = new PrintWriter(Console.err)
        println("Errors from stage: " + job.lastStageInfo.title)
        val stageTags = job.lastStageInfo.tags.toList
        PipelineUtil.printTags(stageTags, pwOut, pwErr)
        pwErr.println(Tag.collateAsString(job.lastStageInfo.tags.toList))
        pwErr.flush
        for (m <- job.lastStageInfo.info) {
          val mTags = m.tags.toList
          PipelineUtil.printTags(mTags, pwOut, pwErr)
          pwErr.println(Tag.collateAsString(mTags))
          pwErr.flush
        }
      }

      import PilarSymbolResolverModule.ConsumerView._
      val st = job.symbolTable 
      
      import AlirIntraProceduralModule.ConsumerView._
      val r = job.result

      //val st = PilarSymbolResolverModule.getSymbolTable(options)
      //val r = AlirIntraProceduralModule.getResult(options)

      r.foreach { p =>
        val (procedureUri, result) = p
        alirF.foreach { f =>
          f(st.procedureSymbolTable(procedureUri), result)
        }
      }
    }

    def satisfies(f : (ProcedureSymbolTable, AlirIntraProcedural.AlirIntraproceduralAnalysisResult) => Unit) : this.type = {
      alirF += f
      this
    }

    val alirF = marrayEmpty[(ProcedureSymbolTable, AlirIntraProcedural.AlirIntraproceduralAnalysisResult) => Unit]
  }

  protected var _title : String = null
  protected var num = 0
  protected def title() = if (_title == null) {
    num += 1
    "Analysis #" + num
  } else _title

  protected val pipeline =
    PipelineConfiguration(
      "Parser Test Pipeline",
      false,
      PipelineStage(
        "Pilar Parsing",
        false,
        PilarParserModule),
      PipelineStage(
        "Pilar Symbol Resolution",
        false,
        PilarSymbolResolverModule),
      PipelineStage(
        "Alir IntraProcedural Analysis",
        false,
        AlirIntraProceduralModule))
}
