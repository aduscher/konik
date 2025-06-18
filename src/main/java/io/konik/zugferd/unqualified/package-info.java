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
/**
 * ZUGFeRD unqualified data types. 
 */
@XmlSchema(elementFormDefault = QUALIFIED, namespace = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15", xmlns = {
      @XmlNs(prefix = "udt", namespaceURI = "urn:un:unece:uncefact:data:standard:UnqualifiedDataType:15") })
@XmlJavaTypeAdapters({ @XmlJavaTypeAdapter(value = TwoDigitRoundingAdapter.class, type = Amount.class) })
@XmlAccessorType(NONE)
package io.konik.zugferd.unqualified;

import io.konik.jaxb.adapter.TwoDigitRoundingAdapter;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlSchema;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static jakarta.xml.bind.annotation.XmlAccessType.NONE;
import static jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED;
