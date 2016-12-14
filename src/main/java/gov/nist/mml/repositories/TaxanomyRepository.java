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
package gov.nist.mml.repositories;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gov.nist.mml.domain.Taxanomy;

@RepositoryRestResource
/***
 * TaxanomyRespository interface for taxanomy data
 * @author dsn1
 *
 */
public interface TaxanomyRepository extends MongoRepository<Taxanomy, String> {
	
	///These are HATEOS format serach api
	List<Taxanomy> findByResearchCategory(@Param("researchCategory") String researchCategory);
	
	
	//Generic Search
	List<Taxanomy> findAllBy(TextCriteria criteria,Pageable pageable);
	
   List<Taxanomy> findByResearchCategoryContainingIgnoreCase(String researchCategory);
	
   
}

