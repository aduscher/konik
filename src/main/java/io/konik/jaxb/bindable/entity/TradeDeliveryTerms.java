/* Copyright (C) 2014 konik.io
 *
 * This file is part of the Konik library.
 *
 * The Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * The Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with the Konik library. If not, see <http://www.gnu.org/licenses/>.
 */

package io.konik.jaxb.bindable.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@SuppressWarnings("javadoc")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDeliveryTermsType", propOrder = { "deliveryTypeCode" })
public class TradeDeliveryTerms {

   @XmlElement(name = "DeliveryTypeCode")
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   private String deliveryTypeCode;

   TradeDeliveryTerms() {
   }

   public TradeDeliveryTerms(String deliveryTypeCode) {
      this.deliveryTypeCode = deliveryTypeCode;
   }

   public String getDeliveryTypeCode() {
      return deliveryTypeCode;
   }

   public void setDeliveryTypeCode(String value) {
      this.deliveryTypeCode = value;
   }

}
