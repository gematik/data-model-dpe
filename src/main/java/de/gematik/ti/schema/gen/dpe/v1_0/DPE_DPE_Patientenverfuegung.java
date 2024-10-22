/*
* Copyright (c) 2020 gematik GmbH
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* 
*    http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

//
//  This is a generated file, do not edit.
//  This file was generated from an xsd file and represents a simple or complex type of it.
//  Generated by a fork of xsd2cocoa (see https://github.com/Daij-Djan/xsd2cocoa) and a specified custom transform template.
//
package de.gematik.ti.schema.gen.dpe.v1_0;

import de.gematik.ti.schema.gen.dpe.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class DPE_DPE_Patientenverfuegung  {
    
    public static final String NAMESPACE_PREFIX = "DPE";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/DPE_Document/v1.0";
    
    // attributes:
    /*@isRequired*/
    public String DPE_PV_letzte_Aktualisierung;
    
    // elements:
    /*@isSingleAndOptionalValue*/
    
    public DPE_DPE_AdresseType DPE_PV_Ablageort;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DPE_PV_Beschreibung;
    
    // default Constructor
    public DPE_DPE_Patientenverfuegung() {
        
        this.DPE_PV_letzte_Aktualisierung = new String();
        
        this.DPE_PV_Ablageort = null;
        
        this.DPE_PV_Beschreibung = new String();
        
    }
    
    // copy Constructor
    public DPE_DPE_Patientenverfuegung(DPE_DPE_Patientenverfuegung _DPE_DPE_Patientenverfuegung) {
        
        this.DPE_PV_letzte_Aktualisierung = _DPE_DPE_Patientenverfuegung.DPE_PV_letzte_Aktualisierung;
        
        this.DPE_PV_Ablageort = _DPE_DPE_Patientenverfuegung.DPE_PV_Ablageort;
        this.DPE_PV_Beschreibung = _DPE_DPE_Patientenverfuegung.DPE_PV_Beschreibung;
    }
    
    public static DPE_DPE_Patientenverfuegung deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        DPE_DPE_Patientenverfuegung _DPE_DPE_Patientenverfuegung = new DPE_DPE_Patientenverfuegung();
        
        _DPE_DPE_Patientenverfuegung.DPE_PV_letzte_Aktualisierung = element.getAttributeNode("DPE_PV_letzte_Aktualisierung") != null ? element.getAttributeNode("DPE_PV_letzte_Aktualisierung").getValue() : null;
        
        NodeList nodeListDPE_PV_Ablageort = element.getElementsByTagNameNS(DPE_DPE_AdresseType.NAMESPACE_URI ,"DPE_PV_Ablageort");
        Node nodeDPE_PV_Ablageort = nodeListDPE_PV_Ablageort.item(0);
        _DPE_DPE_Patientenverfuegung.DPE_PV_Ablageort = DPE_DPE_AdresseType.deserialize(nodeDPE_PV_Ablageort);
        
        NodeList nodeListDPE_PV_Beschreibung = element.getElementsByTagNameNS(DPE_DPE_Patientenverfuegung.NAMESPACE_URI ,"DPE_PV_Beschreibung");
        
        if (nodeListDPE_PV_Beschreibung.getLength() == 0) {
            _DPE_DPE_Patientenverfuegung.DPE_PV_Beschreibung = null;
        } else {
            _DPE_DPE_Patientenverfuegung.DPE_PV_Beschreibung = String.valueOf(((Element) nodeListDPE_PV_Beschreibung.item(0)).getTextContent());
        }
        
        return _DPE_DPE_Patientenverfuegung;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<DPE_DPE_Patientenverfuegung>();
        for( Node node : nodeList) {
            result.add(deserialize(node));
        }
        return result;
    }
    
    /**
    * Returns a map of attributes
    */
    public Map<String, Object> getAttributes() {
        HashMap<String, Object> attributesDict = new HashMap<>();
        
        attributesDict.put("DPE_PV_letzte_Aktualisierung", this.DPE_PV_letzte_Aktualisierung);
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("DPE_PV_Ablageort", this.DPE_PV_Ablageort);
        elemArray.put("DPE_PV_Beschreibung", this.DPE_PV_Beschreibung);
        
        return elemArray;
    }
}

