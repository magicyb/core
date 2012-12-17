package org.sireum.bakar.xml

import org.sireum.util._

object WideWideImageAttributeEx {
  def unapply(o : org.sireum.bakar.xml.WideWideImageAttribute) = {
    Some(
      o.getSloc(),
      o.getPrefixQ(),
      o.getAttributeDesignatorIdentifierQ(),
      o.getType()
    )
  }
}