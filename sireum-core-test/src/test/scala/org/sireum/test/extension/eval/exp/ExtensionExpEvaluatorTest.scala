/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.test.extension.eval.exp

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.sireum.test.framework.pilar.eval._
import org.sireum.pilar.state._
import org.sireum.extension._
import org.sireum.konkrit.extension._
import org.sireum.util._
import org.sireum.test.konkrit.eval._
import org.sireum.pilar.eval._
import org.sireum.extension._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
@RunWith(classOf[JUnitRunner])
class ExtensionExpEvaluatorTest
    extends ExpEvaluatorTestFramework[BasicState, (BasicState, Value), ISeq[(BasicState, Value)]] {

  type S = BasicState
  type V = Value
  type Re = (S, Value)
  type R = ISeq[Re]
  type C = ISeq[(S, Boolean)]
  type SR = ISeq[S]

  import language.implicitConversions
  import language.reflectiveCalls

  import KonkritEvaluatorTestUtil._

  implicit def p2rc(p : Re) : Result = RC(p._2)

  implicit def rf2erf(rf : Re => Unit) : R => Unit = { r => r.foreach { rf(_) } }

  Evaluating expression "one()" gives "1" satisfying { r : Re =>
    r.value should equal(n(1))
  }

  Evaluating expression "id(1)" gives "1" satisfying { r : Re =>
    r.value should equal(n(1))
  }

  Evaluating expression "id()" gives "ill-formed model" failing { t =>
    t.getMessage should equal("ill-formed model")
  }

  Evaluating expression "fst(1)" gives "1" satisfying { r : Re =>
    r.value should equal(n(1))
  }

  Evaluating expression "fst(1,2)" gives "1" satisfying { r : Re =>
    r.value should equal(n(1))
  }

  Evaluating expression "last(1)" gives "1" satisfying { r : Re =>
    r.value should equal(n(1))
  }

  Evaluating expression "last(1,@@x)" gives "error" failing { t =>
    assert(t.isInstanceOf[NullPointerException])
  }

  Evaluating expression "last(1,@@x,3+2)" gives "5" satisfying { r : Re =>
    r.value should equal(n(5))
  }

  def state = BasicState()

  def newExpEvaluator(s : S) =
    KonkritEvaluatorTestUtil.newEvaluator[S](None,
      TestExtension,
      UriValueExtension,
      KonkritVariableAccessExtension,
      KonkritIntegerExtension)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object TestExtension extends ExtensionCompanion {
  def apply(ec : ExtensionConfig) = new TestExtension(ec)
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
final class TestExtension[S <: State[S]](ec : ExtensionConfig)
    extends Extension {
  import KonkritEvaluatorTestUtil._

  type V = Value
  type R = ISeq[(S, Value)]
  type C = ISeq[(S, Boolean)]
  type SR = ISeq[S]

  def uriPath = "org/sireum/test/extension/exp/Test"

  @ExpExt
  @TopLevel
  def last : (S, V, ISeq[S => R]) --> R = {
    case (s, v, vs) =>
      if (vs.length == 0) ivector((s, v))
      else vs(vs.length - 1)(s)
  }

  @ExpExt
  @TopLevel
  def fst : (S, V, ISeq[V]) --> R = {
    case (s, v, vs) =>
      ivector((s, v))
  }

  @ExpExt
  @TopLevel
  def id : (S, V) --> R = {
    case (s, v) => ivector((s, v))
  }

  @ExpExt
  @TopLevel
  def one : S --> R = {
    case s => ivector((s, n(1)))
  }
}
