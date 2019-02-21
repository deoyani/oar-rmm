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
package gov.nist.oar.rmm.utilities.entities;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Deoyani Nandrekar-Heinis
 */
public class UpdateRecord {

    @NotEmpty @NotNull
    private String title;
    
    @NotEmpty @NotNull
    private String[] description;
    
    private String[] keywords;
    private String[] researchTopics;
    private String[] authors;

    public UpdateRecord(String title, String[] description, String[] keywords,
	    String[] researchTopics, String[] authors) {
	this.title = title;
	this.description = description;
	this.keywords = keywords;
	this.researchTopics = researchTopics;
	this.authors = authors;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void setDescription(String[] description) {
	this.description = description;
    }

    public void setKeywords(String[] keywords) {
	this.keywords = keywords;
    }
    
    public void setResearchTopics(String[] researchTopics){
	this.researchTopics = researchTopics;
    }
    
    public void setAuthors(String[] authors){
	this.authors = authors;
    }
    
    public String[] getAuthors(){
	return this.authors;
    }
    
    public String[] getResearchTopics(){
	return this.researchTopics;
    }
    
    public String[] getKeywords(){
	return this.keywords;
    }
    
    public String[] getDescription(){
	return this.description;
    }
    
    public String getTitle(){
	return this.title;
    }
}
