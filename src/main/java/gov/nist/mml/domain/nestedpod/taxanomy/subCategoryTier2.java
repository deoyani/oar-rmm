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
package gov.nist.mml.domain.nestedpod.taxanomy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;

/**
 * SubCategoryTier2  is part of taxanomy
 * @author dsn1
 *
 */
public class SubCategoryTier2 {

	@Id private String id;
	@TextIndexed private  String researchCategory;
	
	/***
	 * Get Sub ReserahcCategory
	 * @return
	 */
	public String getresearchCategory(){
		return researchCategory;
	}
	
	/***
	 * Set ResearchCategory
	 * @param researchCategory
	 */
	public void setresearchCategory(String researchCategory){
		this.researchCategory = researchCategory;
	}
}
