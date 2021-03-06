/*
Copyright (c) 2011-2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package org.sireum.kiasan

import scala.annotation.meta._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
package object extension {
  type FreshKiasanValueProvider = org.sireum.kiasan.extension.annotation.FreshKiasanValueProvider @getter
  type Rep = org.sireum.kiasan.extension.annotation.Rep @getter
  type Rep2 = org.sireum.kiasan.extension.annotation.Rep2 @getter
}