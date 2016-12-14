
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

import gov.nist.mml.domain.nestedpod.taxanomy.SubCategory;

/***
 * Taxamony domain class to represent data in Mongo
 * @author dsn1
 *
 */
public class Taxanomy {

	@Id private String id;
	@TextIndexed private String keyIdentifier;
	@TextIndexed private String researchCategory;
	@TextIndexed private SubCategory[] subCategories;

	/***
	 * GEt Research category
	 * @return String
	 */
	public String getresearchCategory() {
		return researchCategory;
	}
	
	/***
	 * Set Research Category
	 * @param researchCategory String
	 */
	public void setresearchCategory(String researchCategory) {
		this.researchCategory = researchCategory;
	}
	
	/***
	 * Get SubCategories
	 * @return SubCategory[]
	 */
	public SubCategory[] getsubCategories() {
		return this.subCategories;
	}
	/***
	 * Set SubCategories
	 * @param subcategories SubCategory[]
	 */
	public void setSubCategories(SubCategory[] subcategories) {
		this.subCategories = subcategories;
	}
	
	/***
	 * Get KeyIdentifier
	 * @return String keyIdentifier
	 */
	public String getkeyIdentifier() {
		return keyIdentifier;
	}
	/***
	 * Set KeyIdentifier
	 * @param keyIdentifier String
	 */
	public void setkeyIdentifier(String keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}
}

