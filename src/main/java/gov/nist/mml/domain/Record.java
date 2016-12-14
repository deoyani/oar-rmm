
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


import com.fasterxml.jackson.annotation.JsonProperty;

import gov.nist.mml.domain.nestedpod.ContactPoint;
import gov.nist.mml.domain.nestedpod.Distribution;
import gov.nist.mml.domain.nestedpod.Publisher;

/***
 * It is a dataset field in the Open data schema
 * @author dsn1
 *
 */
public class Record {

	@Id private String id;

	@JsonProperty("@type")
	@TextIndexed private  String type;
	@TextIndexed(weight=2) private  String title;
	@TextIndexed(weight=3) private String description;
	@TextIndexed private  String[] keyword;
	@TextIndexed private  String modified;
	@TextIndexed private  Publisher publisher;
	@TextIndexed private  ContactPoint contactPoint;
	@TextIndexed private String identifier;
	@TextIndexed private String accessLevel;
	@TextIndexed private String[] bureauCode;
	@TextIndexed private String[] programCode;
	@TextIndexed private String license;
	@TextIndexed private String rights;
	@TextIndexed private String spatial;
	@TextIndexed private String temporal;
	@TextIndexed private Distribution[] distribution;
	@TextIndexed private String accuralPeriodicity;
	@TextIndexed private  String conformsTo;
	@TextIndexed private  boolean dataQuality;
	@TextIndexed  private String describedBy; //url
	@TextIndexed private  String describedByType;
	@TextIndexed private String isPartOf;
	@TextIndexed private String issued;
	@TextIndexed private String[] language;
	@TextIndexed private String landingPage;
	@TextIndexed private String primaryITInvestmentUII;
	@TextIndexed private String[] references;
	@TextIndexed private String systemOfRecords;
	@TextIndexed private String[] theme;
	
	/***
	 * Get Type
	 * @return String type
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
	 * Get Title
	 * @return String Title
	 */
	public String getTitle() {
		return title;
	}
	/***
	 * Set Title
	 * @param title String
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/***
	 * Get Description
	 * @return String
	 */
	public String getDescription() {
		return description;
	}
	/***
	 * Set Descriptions
	 * @param description String
	 */
	public void setDescription(String description ) {
		this.description = description;
	}
	
	/***
	 * Get Keywords
	 * @return String[] keywords
	 */
	public String[] getKeyword() {
		return keyword;
	}
	/***
	 * Set Keywords
	 * @param keyword String[]
	 */
	public void setKeyword(String[] keyword) {
		this.keyword = keyword;
	}
	
	/***
	 * Get Modified
	 * @return String
	 */
	public String getModified() {
		return modified;
	}
	/***
	 * Set Modified
	 * @param modified String
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}
	
	/*** 
	 * Get Publisher
	 * @return Publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}
	/***
	 * Set Publisher
	 * @param publisher String
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	/***
	 * Get ContactPoint
	 * @return ContactPoint
	 */
	public ContactPoint getContactPoint() {
		return contactPoint;
	}
	/***
	 * Set ContactPoint
	 * @param contactPoint ContactPoint
	 */
	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}
	
	/***
	 * Get Identifier
	 * @return String
	 */
	public String getIdentifier() {
		return identifier;
	}
	/***
	 * Set Identifier
	 * @param identifier String
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	/***
	 * Get AccessLevel
	 * @return String accessLevel
	 */
	public String getAccessLevel() {
		return accessLevel;
	}
	/***
	 * set accessLevel
	 * @param accessLevel
	 */
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	/***
	 * Get BureauCode
	 * @return String[] BureauCode
	 */
	public String[] getBureauCode() {
		return bureauCode;
	}
	/***
	 * Set BureauCode
	 * @param bureauCode String[]
	 */
	public void setBureauCode(String[] bureauCode) {
		this.bureauCode = bureauCode;
	}
	
	/***
	 * Get ProgramCode
	 * @return String[]
	 */
	public String[] getProgramCode() {
		return programCode;
	}
	/***
	 * Set ProgramCode
	 * @param programCode
	 */
	public void setProgramCode(String[] programCode) {
		this.programCode = programCode;
	}

	/***
	 * Get License
	 * @return String license
	 */
	public String getLicense() {
		return license;
	}
	/**
	 * Set License
	 * @param license String 
	 */
	public void setLicense(String license) {
		this.license = license;
	}
	
	/*** 
	 * Get Rights
	 * @return String rights
	 */
	public String getRights() {
		return rights;
	}
	/***
	 * Set Rights
	 * @param rights string
	 */
	public void setRights(String rights) {
		this.rights = rights;
	}
	
	/***
	 * Get Spatial
	 * @return String spatial
	 */
	public String getSpatial() {
		return spatial;
	}
	/***
	 * set spatial
	 * @param spatial String
	 */
	public void setSpatial(String spatial) {
		this.spatial = spatial;
	}
	
	/***
	 * Get Temporal
	 * @return String temporal
	 */
	public String getTemporal() {
		return temporal;
	}
	/***
	 * Set temporal
	 * @param temporal String
	 */
	public void setTemporal(String temporal) {
		this.temporal = temporal;
	}
	
	/***
	 * Get Distribution
	 * @return String 
	 */
	public Distribution[] getDistribution() {
		return distribution;
	}
	/***
	 * Set Distribution
	 * @param distribution String
	 */
	public void setDistribution(Distribution[] distribution) {
		this.distribution = distribution;
	}
	
	/***
	 * Get accuralPeriodicity
	 * @return String accuralPeriodicity
	 */
	public String getAccuralPeriodicity() {
		return this.accuralPeriodicity;
	}
	/***
	 * Set AccuralPeriodicity 
	 * @param accuralPeriodicity string
	 */
	public void setAccuralPeriodicity(String accuralPeriodicity) {
		this.accuralPeriodicity =  accuralPeriodicity;
	}
	
	/***
	 * GEt conformsTo
	 * @return String
	 */
	public String getConformsTo() {
		return conformsTo;
	}
	/***
	 * set conformsTo 
	 * @param conformsTo String
	 */
	public void setConformsTo(String conformsTo) {
		this.conformsTo = conformsTo;
	}
	
	/***
	 * Get DataQuality
	 * @return String dataQuality
	 */
	public boolean getDataQuality() {
		return dataQuality;
	}
	/***
	 * Set dataQuality
	 * @param dataQuality
	 */
	public void setDataQuality(boolean dataQuality) {
		this.dataQuality = dataQuality;
	}
	
	/***
	 * Get DescribedBy
	 * @return String describedBy
	 */
	public String getDescribedBy() {
		return describedBy;
	}
	/***
	 * Set DescribedBy
	 * @param describedBy String
	 */
	public void setDescribedBy(String describedBy) {
		this.describedBy = describedBy;
	}
	

	/***
	 * Get DescribedByType
	 * @return String DescribedByType
	 */
	public String getDescribedByType() {
		return describedByType;
	}

	/***
	 * Set describedByType field
	 * @param describedByType String
	 */
	public void setDescribedByType(String describedByType) {
		this.describedByType = describedByType;
	}

	/***
	 * get Ispartof
	 * @return String Ispartof
	 */
	public String getIsPartOf() {
		return isPartOf;
	}
	/***
	 * Set ispartof
	 * @param isPartOf string
	 */
	public void setIsPartOf(String isPartOf) {
		this.isPartOf = isPartOf;
	}
	
	/***
	 * GEt Issued
	 * @return String Issued
	 */
	public String getIssued() {
		return issued;
	}
	/***
	 * Set Issued
	 * @param issued String
	 */
	public void setIssued(String issued) {
		this.issued = issued;
	}
	
	/***
	 * Get Languages
	 * @return String[] languages
	 */
	public String[] getLanguage() {
		return language;
	}
	/***
	 * Set Languages
	 * @param language String[]
	 */
	public void setLanguage(String[] language) {
		this.language = language;
	}
	
	/***
	 * Get landingpage
	 * @return Landingpage String
	 */
	public String getLandingPage() {
		return landingPage;
	}
	
	/***
	 * Set landingpage
	 * @param landingPage String
	 */
	public void setLandingPage(String landingPage) {
		this.landingPage = landingPage;
	}
	
	/***
	 * GEt primaryITInvestmentUII
	 * @return String primaryITInvestmentUII
	 */
	public String getPrimaryITInvestmentUII() {
		return primaryITInvestmentUII;
	}

	/***
	 * Set primaryITInvestmentUII
	 * @param primaryITInvestmentUII String
	 */
	public void setPrimaryITInvestmentUII(String primaryITInvestmentUII) {
		this.primaryITInvestmentUII = primaryITInvestmentUII;
	}
	
	/***
	 * Get References
	 * @return String[] 
	 */
	public String[] getReferences() {
		return references;
	}
	/***
	 * 
	 * Set String[] references
	 * @param references String[]
	 */
	public void setReferences(String[] references) {
		this.references = references;
	}
	
	/***
	 * get SystemOfRecords
	 * @return String systemOfRecords
	 */
	public String getSystemOfRecords() {
		return this.systemOfRecords;
	}

	/***
	 * Set the system records
	 * @param systemOfRecords string
	 */
	public void setSystemOfRecords(String systemOfRecords) {
		this.systemOfRecords = systemOfRecords;
	}
	
	/****
	 * Get theme name
	 * @return string[]
	 */
	public String[] getTheme() {
		return theme;
	}

	/***
	 * Set the theme name
	 * @param theme String 
	 */
	public void setTheme(String[] theme) {
		this.theme = theme;
	}
}

