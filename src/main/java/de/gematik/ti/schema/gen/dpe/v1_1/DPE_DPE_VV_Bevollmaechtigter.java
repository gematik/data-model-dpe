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
package de.gematik.ti.schema.gen.dpe.v1_1;

import de.gematik.ti.schema.gen.dpe.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class DPE_DPE_VV_Bevollmaechtigter  {
    
    public static final String NAMESPACE_PREFIX = "DPE";
    public static final String NAMESPACE_URI = "http://ws.gematik.de/fa/nfds/DPE_Document/v1.1";
    
    // attributes:
    
    // elements:
    /*@isSingleAndOptionalValue*/
    
    public String DPE_VV_EMail;
    
    /*@isSingleAndOptionalValue*/
    
    public String DPE_VV_Faxnummer;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DPE_VV_Name_Bevollmaechtigter;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DPE_VV_Vorname_Bevollmaechtigter;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String DPE_VV_Telefon_Bevollmaechtigter;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public DPE_DPE_AdresseType DPE_VV_Adresse_Bevollmaechtigter;
    
    // default Constructor
    public DPE_DPE_VV_Bevollmaechtigter() {
        
        this.DPE_VV_EMail = null;
        
        this.DPE_VV_Faxnummer = null;
        
        this.DPE_VV_Name_Bevollmaechtigter = new String();
        
        this.DPE_VV_Vorname_Bevollmaechtigter = new String();
        
        this.DPE_VV_Telefon_Bevollmaechtigter = new String();
        
        this.DPE_VV_Adresse_Bevollmaechtigter = new DPE_DPE_AdresseType();
        
    }
    
    // copy Constructor
    public DPE_DPE_VV_Bevollmaechtigter(DPE_DPE_VV_Bevollmaechtigter _DPE_DPE_VV_Bevollmaechtigter) {
        
        this.DPE_VV_EMail = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_EMail;
        this.DPE_VV_Faxnummer = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Faxnummer;
        this.DPE_VV_Name_Bevollmaechtigter = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Name_Bevollmaechtigter;
        this.DPE_VV_Vorname_Bevollmaechtigter = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Vorname_Bevollmaechtigter;
        this.DPE_VV_Telefon_Bevollmaechtigter = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Telefon_Bevollmaechtigter;
        this.DPE_VV_Adresse_Bevollmaechtigter = _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Adresse_Bevollmaechtigter;
    }
    
    public static DPE_DPE_VV_Bevollmaechtigter deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        
        DPE_DPE_VV_Bevollmaechtigter _DPE_DPE_VV_Bevollmaechtigter = new DPE_DPE_VV_Bevollmaechtigter();
        
        NodeList nodeListDPE_VV_EMail = element.getElementsByTagNameNS(DPE_DPE_VV_Bevollmaechtigter.NAMESPACE_URI ,"DPE_VV_E-Mail");
        
        if (nodeListDPE_VV_EMail.getLength() == 0) {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_EMail = null;
        } else {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_EMail = String.valueOf(((Element) nodeListDPE_VV_EMail.item(0)).getTextContent());
        }
        
        NodeList nodeListDPE_VV_Faxnummer = element.getElementsByTagNameNS(DPE_DPE_VV_Bevollmaechtigter.NAMESPACE_URI ,"DPE_VV_Faxnummer");
        
        if (nodeListDPE_VV_Faxnummer.getLength() == 0) {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Faxnummer = null;
        } else {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Faxnummer = String.valueOf(((Element) nodeListDPE_VV_Faxnummer.item(0)).getTextContent());
        }
        
        NodeList nodeListDPE_VV_Name_Bevollmaechtigter = element.getElementsByTagNameNS(DPE_DPE_VV_Bevollmaechtigter.NAMESPACE_URI ,"DPE_VV_Name_Bevollmaechtigter");
        
        if (nodeListDPE_VV_Name_Bevollmaechtigter.getLength() == 0) {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Name_Bevollmaechtigter = null;
        } else {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Name_Bevollmaechtigter = String.valueOf(((Element) nodeListDPE_VV_Name_Bevollmaechtigter.item(0)).getTextContent());
        }
        
        NodeList nodeListDPE_VV_Vorname_Bevollmaechtigter = element.getElementsByTagNameNS(DPE_DPE_VV_Bevollmaechtigter.NAMESPACE_URI ,"DPE_VV_Vorname_Bevollmaechtigter");
        
        if (nodeListDPE_VV_Vorname_Bevollmaechtigter.getLength() == 0) {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Vorname_Bevollmaechtigter = null;
        } else {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Vorname_Bevollmaechtigter = String.valueOf(((Element) nodeListDPE_VV_Vorname_Bevollmaechtigter.item(0)).getTextContent());
        }
        
        NodeList nodeListDPE_VV_Telefon_Bevollmaechtigter = element.getElementsByTagNameNS(DPE_DPE_VV_Bevollmaechtigter.NAMESPACE_URI ,"DPE_VV_Telefon_Bevollmaechtigter");
        
        if (nodeListDPE_VV_Telefon_Bevollmaechtigter.getLength() == 0) {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Telefon_Bevollmaechtigter = null;
        } else {
            _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Telefon_Bevollmaechtigter = String.valueOf(((Element) nodeListDPE_VV_Telefon_Bevollmaechtigter.item(0)).getTextContent());
        }
        
        NodeList nodeListDPE_VV_Adresse_Bevollmaechtigter = element.getElementsByTagNameNS(DPE_DPE_AdresseType.NAMESPACE_URI ,"DPE_VV_Adresse_Bevollmaechtigter");
        Node nodeDPE_VV_Adresse_Bevollmaechtigter = nodeListDPE_VV_Adresse_Bevollmaechtigter.item(0);
        _DPE_DPE_VV_Bevollmaechtigter.DPE_VV_Adresse_Bevollmaechtigter = DPE_DPE_AdresseType.deserialize(nodeDPE_VV_Adresse_Bevollmaechtigter);
        
        return _DPE_DPE_VV_Bevollmaechtigter;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<DPE_DPE_VV_Bevollmaechtigter>();
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
        
        return attributesDict;
    }
    
    /**
    * Returns a LinkedHashMap of the elements. LinkedHashMap is used as a workaround to provide the needed
    * functionality of a ordered array of tuples.
    */
    public LinkedHashMap<String, Object> getElements() {
        LinkedHashMap<String, Object> elemArray = new LinkedHashMap<>();
        
        elemArray.put("DPE_VV_EMail", this.DPE_VV_EMail);
        elemArray.put("DPE_VV_Faxnummer", this.DPE_VV_Faxnummer);
        elemArray.put("DPE_VV_Name_Bevollmaechtigter", this.DPE_VV_Name_Bevollmaechtigter);
        elemArray.put("DPE_VV_Vorname_Bevollmaechtigter", this.DPE_VV_Vorname_Bevollmaechtigter);
        elemArray.put("DPE_VV_Telefon_Bevollmaechtigter", this.DPE_VV_Telefon_Bevollmaechtigter);
        elemArray.put("DPE_VV_Adresse_Bevollmaechtigter", this.DPE_VV_Adresse_Bevollmaechtigter);
        
        return elemArray;
    }
}
