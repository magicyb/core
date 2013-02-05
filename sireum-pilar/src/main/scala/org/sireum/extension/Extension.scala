/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.extension

import org.sireum.pilar.ast._
import org.sireum.util._
import org.sireum.pilar.eval.EvaluatorConfiguration

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object Extension {
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait Extension[S, V, R, C, SR] {
  def uriPath : ResourceUri
}

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
trait ExtensionCompanion {
}
