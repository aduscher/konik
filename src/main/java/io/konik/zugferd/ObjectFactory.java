/*
 * Copyright (C) 2014 konik.io
 *
 * This file is part of Konik library.
 *
 * Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Konik library.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.zugferd;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

   /** The Constant QNAME. */
   private static final QName QNAME = new QName("urn:ferd:CrossIndustryDocument:invoice:1p0", "CrossIndustryDocument");

   /**
    * Creates a new Object object.
    *
    * @return the invoice
    */
   public Invoice createInvoice() {
      return new Invoice();
   }

   /**
    * Creates a new Object object.
    *
    * @param invoice the invoice
    * @return the JAXB element
    */
   @XmlElementDecl(namespace = "urn:ferd:CrossIndustryDocument:invoice:1p0", name = "CrossIndustryDocument")
   public JAXBElement<Invoice> createInvoice(Invoice invoice) {
      return new JAXBElement<Invoice>(QNAME, Invoice.class, null, invoice);
   }

}
