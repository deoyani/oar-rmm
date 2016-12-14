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
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Catalog domain similar to PDL/POD
 * @author dsn1
 *
 */

public class Catalog {
	@Id private String id;
	@JsonProperty("@context")  @Field("@context")
	@TextIndexed private  String context;
	@JsonProperty("@id") @Field("@Id")
	@TextIndexed private  String catalogId;
	@JsonProperty("@type") @Field("@type")
	@TextIndexed private String type;
	@TextIndexed private String conformsTo;
	@TextIndexed private String describedBy;
	@JsonProperty("dataset") @Field("dataset")
	//@DBRef
	@TextIndexed private Record[] records;
	/***
	 * Get Context
	 * @return String context
	 */
	public String getContext() {
		return context;
	}

	/***
	 * SetContext
	 * @param context
	 */
	public void setcontext(String context) {
		this.context = context;
	}
	
	/***
	 * Get Catalog Id
	 * @return String catalog id
	 */
	public String getCatalogId() {
		return catalogId;
	}

	/***
	 * Set catalog id
	 * @param catalogId
	 */
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	
	/***
	 * Get type
	 * @return String get type
	 */
	public String getType() {
		return type;
	}

	/***
	 * Set Type
	 * @param type String
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/***
	 * Get Conforms To
	 * @return String conformsto
	 */
	public String getConformsTo() {
		return conformsTo;
	}

	/***
	 * Set String ConformsTo
	 * @param conformsTo string
	 */
	public void setConformsTo(String conformsTo) {
		this.conformsTo = conformsTo;
	}
	
	/***
	 * Get DescribedBy 
	 * @return String describedBy
	 */
	public String getDescribedBy() {
		return describedBy;
	}

	/***
	 * Set describedby
	 * @param describedBy String
	 */
	public void setDescribedBy(String describedBy) {
		this.describedBy = describedBy;
	}
	
	/***
	 * Set Records array
	 * @param records Record[]
	 */
	public void setRecords(Record[] records)
	{
		this.records = records;
	}
	
	/***
	 * Get Records
	 * @return Record[]
	 */
	public Record[] getRecords(){
		return this.records;
	}
}
