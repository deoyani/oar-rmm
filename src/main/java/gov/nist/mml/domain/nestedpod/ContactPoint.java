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
package gov.nist.mml.domain.nestedpod;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
/***
 * ContactPoint Domain Class for Mongo
 * @author dsn1
 *
 */
public class ContactPoint{
	@Id private String id;
	@JsonProperty("@type")
	private String type;
	private String hasmail;
	private String fn;
	
	/***
	 * Get Type
	 * @return String Type
	 */
	public String getType(){
		return type;
	}
	/***
	 * Set Type
	 * @param type String
	 */
	public void setType(String type){
		this.type = type;
	}
	
	/***
	 * Get Hasmail
	 * @return String hasmail
	 */
	public String getHasmail(){
		return hasmail;
	}
	/***
	 * Set hasmail
	 * @param hasmail
	 */
	public void sethasmail(String hasmail){
		this.hasmail = hasmail;
	}
	
	/***
	 * Get Fn
	 * @return String Fn
	 */
	public String getFn(){
		return fn;
	}
	
	/***
	 * Set Fn
	 * @param fn String
	 */
	public void setFn(String fn){
		this.fn = fn;
	}
}
