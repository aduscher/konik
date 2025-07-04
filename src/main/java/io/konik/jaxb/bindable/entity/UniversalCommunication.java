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
package io.konik.jaxb.bindable.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@SuppressWarnings("javadoc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalCommunicationType", propOrder = { "email", "number" })
public class UniversalCommunication {

   @XmlElement(name = "URIID")
   private String email;

   @XmlElement(name = "CompleteNumber")
   private String number;

   public UniversalCommunication(String email) {
      this.email = email;
   }

   public UniversalCommunication() {
   }

   public String getMail() {
      return email;
   }

   public void setMail(String uriid) {
      this.email = uriid;
   }

   public String getCompleteNumber() {
      return number;
   }

   public void setCompleteNumber(String uri) {
      this.number = uri;
   }

}
