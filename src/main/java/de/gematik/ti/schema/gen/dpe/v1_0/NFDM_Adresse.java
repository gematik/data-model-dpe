//
//  This is a generated file, do not edit!
//  This file was generated from an xsd file and represents a simple or complex type of it.
//  Generated by a fork of xsd2cocoa (see https://github.com/Daij-Djan/xsd2cocoa) and a specified custom transform template.
//
package de.gematik.ti.schema.gen.dpe.v1_0;

import de.gematik.ti.schema.gen.utils.*;

import java.util.*;
import org.w3c.dom.*;

/** Generated Java class */
public class NFDM_Adresse  {
    
    public static final String NAMESPACE = "NFDM";
    
    // attributes:
    
    // elements:
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Postleitzahl;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Ort;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Strasse;
    
    /*@isNotSingleOrNotOptionalValue*/
    
    public String Hausnummer;
    
    /*@isSingleAndOptionalValue*/
    
    public String Anschriftenzusatz;
    
    /*@isSingleAndOptionalValue*/
    
    public String Wohnsitzlaendercode;
    
    // default Constructor
    public NFDM_Adresse() {
        
        this.Postleitzahl = new String();
        
        this.Ort = new String();
        
        this.Strasse = new String();
        
        this.Hausnummer = new String();
        
        this.Anschriftenzusatz = null;
        
        this.Wohnsitzlaendercode = null;
        
    }
    
    // copy Constructor
    public NFDM_Adresse(NFDM_Adresse _NFDM_Adresse) {
        
        this.Postleitzahl = _NFDM_Adresse.Postleitzahl;
        this.Ort = _NFDM_Adresse.Ort;
        this.Strasse = _NFDM_Adresse.Strasse;
        this.Hausnummer = _NFDM_Adresse.Hausnummer;
        this.Anschriftenzusatz = _NFDM_Adresse.Anschriftenzusatz;
        this.Wohnsitzlaendercode = _NFDM_Adresse.Wohnsitzlaendercode;
    }
    
    public static NFDM_Adresse deserialize(Node node) {
        if (node == null) {
            return null;
        }
        Element element = (Element) node;
        //NFDM_Adresse _NFDM_Adresse = new NFDM_Adresse();
        
        NFDM_Adresse _NFDM_Adresse = new NFDM_Adresse();
        
        String uriPostleitzahl = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListPostleitzahl = element.getElementsByTagNameNS(uriPostleitzahl ,"Postleitzahl");
        // element is optional, so check for existence
        
        if (nodeListPostleitzahl.getLength() == 0) {
            _NFDM_Adresse.Postleitzahl = null;
        } else {
            _NFDM_Adresse.Postleitzahl = String.valueOf(((Element) nodeListPostleitzahl.item(0)).getTextContent());
        }
        
        String uriOrt = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListOrt = element.getElementsByTagNameNS(uriOrt ,"Ort");
        // element is optional, so check for existence
        
        if (nodeListOrt.getLength() == 0) {
            _NFDM_Adresse.Ort = null;
        } else {
            _NFDM_Adresse.Ort = String.valueOf(((Element) nodeListOrt.item(0)).getTextContent());
        }
        
        String uriStrasse = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListStrasse = element.getElementsByTagNameNS(uriStrasse ,"Strasse");
        // element is optional, so check for existence
        
        if (nodeListStrasse.getLength() == 0) {
            _NFDM_Adresse.Strasse = null;
        } else {
            _NFDM_Adresse.Strasse = String.valueOf(((Element) nodeListStrasse.item(0)).getTextContent());
        }
        
        String uriHausnummer = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListHausnummer = element.getElementsByTagNameNS(uriHausnummer ,"Hausnummer");
        // element is optional, so check for existence
        
        if (nodeListHausnummer.getLength() == 0) {
            _NFDM_Adresse.Hausnummer = null;
        } else {
            _NFDM_Adresse.Hausnummer = String.valueOf(((Element) nodeListHausnummer.item(0)).getTextContent());
        }
        
        String uriAnschriftenzusatz = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListAnschriftenzusatz = element.getElementsByTagNameNS(uriAnschriftenzusatz ,"Anschriftenzusatz");
        // element is optional, so check for existence
        
        if (nodeListAnschriftenzusatz.getLength() == 0) {
            _NFDM_Adresse.Anschriftenzusatz = null;
        } else {
            _NFDM_Adresse.Anschriftenzusatz = String.valueOf(((Element) nodeListAnschriftenzusatz.item(0)).getTextContent());
        }
        
        String uriWohnsitzlaendercode = element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) != null ? element.lookupNamespaceURI(NFDM_Adresse.NAMESPACE) : element.lookupNamespaceURI(null);
        NodeList nodeListWohnsitzlaendercode = element.getElementsByTagNameNS(uriWohnsitzlaendercode ,"Wohnsitzlaendercode");
        // element is optional, so check for existence
        
        if (nodeListWohnsitzlaendercode.getLength() == 0) {
            _NFDM_Adresse.Wohnsitzlaendercode = null;
        } else {
            _NFDM_Adresse.Wohnsitzlaendercode = String.valueOf(((Element) nodeListWohnsitzlaendercode.item(0)).getTextContent());
        }
        
        return _NFDM_Adresse;
    }
    
    public static List deserializeToList(List<Node> nodeList) {
        List result = new ArrayList<NFDM_Adresse>();
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
        
        elemArray.put("Postleitzahl", this.Postleitzahl);
        elemArray.put("Ort", this.Ort);
        elemArray.put("Strasse", this.Strasse);
        elemArray.put("Hausnummer", this.Hausnummer);
        elemArray.put("Anschriftenzusatz", this.Anschriftenzusatz);
        elemArray.put("Wohnsitzlaendercode", this.Wohnsitzlaendercode);
        
        return elemArray;
    }
}
