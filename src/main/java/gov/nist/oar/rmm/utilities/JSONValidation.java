/**
 * This software was developed at the National Institute of Standards and Technology by employees of
 * the Federal Government in the course of their official duties. Pursuant to title 17 Section 105
 * of the United States Code this software is not subject to copyright protection and is in the
 * public domain. This is an experimental system. NIST assumes no responsibility whatsoever for its
 * use by other parties, and makes no guarantees, expressed or implied, about its quality,
 * reliability, or any other characteristic. We would appreciate acknowledgement if the software is
 * used. This software can be redistributed and/or modified freely provided that any derivative
 * works bear some notice that they are derived from it, and any modified versions bear some notice
 * that they have been modified.
 * @author: Deoyani Nandrekar-Heinis
 */
package gov.nist.oar.rmm.utilities;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gov.nist.oar.rmm.utilities.entities.UpdateRecord;


/**
 * JSONValidation class provides some static functions to parse and validate json
 * data.
 * 
 * @author Deoyani Nandrekar-Heinis
 */
public class JSONValidation {


    private JSONValidation() {
	// Default
    }

    /**
     * Read jsonstring to check validity
     *
     * @param jsonInString
     * @return boolean
     */
    public static boolean isJSONValid(String jsonInString) {
	try {
	    final ObjectMapper mapper = new ObjectMapper();
	    mapper.readTree(jsonInString);
	    return true;
	} catch (IOException e) {
	    return false;
	}
    }

    /**
     * Check if input is valid json
     * 
     * @param jsonInString
     * @return boolean
     */
    public static boolean isJSONValid(UpdateRecord inputJson) {
	try {
	    final ObjectMapper mapper = new ObjectMapper();
	    String test = mapper.writeValueAsString(inputJson);
	    List<UpdateRecord> myObjects = Arrays.asList(inputJson);
	    if (myObjects.contains(null))
		throw new IOException("There are null values in the input");
	    return true;
	} catch (IOException e) {
	    return false;
	}
    }

  
}

