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
package gov.nist.mml.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;

/**
 * ResourceApi is a domain class for ResourceApi data in momngodb.
 * @author dsn1
 *
 */
public class ResourceApi {

	@Id private String id;
	@TextIndexed private String name;
	@TextIndexed private String infoUrl;
	@TextIndexed private String documentUrl;
	@TextIndexed private String apiUrl;
	
	/***
	 * Get Name of the resource
	 * @return String Name
	 */
	public String getName() {
		return name;
	}
	/***
	 * Set Name if the resource
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * GEt InfoURL
	 * @return String infoUrl
	 */
	public String getInfoUrl() {
		return infoUrl;
	}
	/***
	 * SetInfoUrl 
	 * @param infoUrl String
	 */
	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}
	
	/***
	 * Get DocumentUrl
	 * @return String
	 */
	public String getDocumentUrl() {
		return documentUrl;
	}
	/***
	 * Set DocumentUrl 
	 * @param documentUrl String
	 */
	public void setDocumentUrl(String documentUrl ) {
		this.documentUrl = documentUrl;
	}
	
	/***
	 * Get Api Url
	 * @return String
	 */
	public String getApiUrl() {
		return apiUrl;
	}
	/***
	 * Set Api Url
	 * @param apiUrl String
	 */
	public void setApiUrl(String apiUrl ) {
		this.apiUrl = apiUrl;
	}
	
}
