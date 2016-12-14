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
import org.springframework.data.mongodb.core.index.TextIndexed;

import com.fasterxml.jackson.annotation.JsonProperty;
/***
 * Distribution domain class represents data in Mongo
 * @author dsn1
 *
 */
public class Distribution{
	@Id private String id;
	@JsonProperty("@type")
	@TextIndexed private String type;
	@TextIndexed private String accessURL;
	@TextIndexed private String conformsTo;
	@TextIndexed private String describedBy;
	@TextIndexed private String describedByType;
	@TextIndexed private String description;
	@TextIndexed private String downloadURL;
	@TextIndexed private String mediaType;
	@TextIndexed private String format;
	@TextIndexed private String title;
	
	/**
	 * Get Type
	 * @return String type
	 */
	public String getType() {
		return type;
	}
	/**
	 * Set Type
	 * @param type String
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/***
	 * Get AccessURL
	 * @return String accessURL
	 */
	public String getAccessURL(){
		return accessURL;
	}
	/***
	 * Set AccessURL
	 * @param durl 
	 */
	public void setAccessURL(String aurl){
		accessURL = aurl;
	}
	
	/***
	 * get conformsTo
	 * @return
	 */
	public String getConformsTo() {
		return conformsTo;
	}
	/***
	 * Set conformsTo
	 * @param conformsTo String
	 */
	public void setConformsTo(String conformsTo) {
		this.conformsTo = conformsTo;
	}
	
	/***
	 * GEt DescribedBy
	 * @return describedBy String
	 */
	public String getDescribedBy() {
		return describedBy;
	}
	/***
	 * Set DEscribedBy
	 * @param describedBy String
	 */
	public void setDescribedBy(String describedBy) {
		this.describedBy = describedBy;
	}
	
	/***
	 * Get DescribedByType
	 * @return String describedByType
	 */
	public String getDescribedByType() {
		return describedByType;
	}
	/***
	 * Set describedByType
	 * @param describedByType String
	 */
	public void setDescribedByType(String describedByType) {
		this.describedByType = describedByType;
	}
	
	/***
	 * Get Description
	 * @return String description
	 */
	public String getDescription(){
		return description;
	}
	/***
	 * Set Description 
	 * @param desc String
	 */
	public void setDescription(String desc){
		description = desc;
	}
	
	/***
	 * GEt DownloadURL
	 * @return
	 */
	public String getdownloadURL(){
		return downloadURL;
	}
	/***
	 * Set DownloadURL
	 * @param durl String
	 */
	public void setDownloadURL(String durl){
		downloadURL = durl;
	}
	
	/***
	 * GetMediaType
	 * @return String mediaType
	 */
	public String getmediaType(){
		return mediaType;
	}
	/***
	 * Set MediaType
	 * @param mtype String
	 */
	public void setMediaType(String mtype){
		this.mediaType = mtype;
	}
	
	/***
	 * Get Format
	 * @return String
	 */
	public String getFormat() {
		return format;
	}
	/***
	 * Set Format
	 * @param format String
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	
	/***
	 * Get Title
	 * @return String Title
	 */
	public String getTitle() {
		return title;
	}
	/***
	 * Set title
	 * @param title String
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}