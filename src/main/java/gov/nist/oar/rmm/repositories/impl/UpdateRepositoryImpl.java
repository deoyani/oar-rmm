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
package gov.nist.oar.rmm.repositories.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import gov.nist.oar.rmm.config.MongoConfig;
import gov.nist.oar.rmm.repositories.UpdateRepository;
import gov.nist.oar.rmm.utilities.entities.EditableRecords;
import gov.nist.oar.rmm.utilities.entities.UpdateRecord;
import io.swagger.annotations.Api;

/**
 * @author Deoyani Nandrekar-Heinis
 */

@Service
public class UpdateRepositoryImpl implements UpdateRepository {

    private Logger logger = LoggerFactory.getLogger(UpdateRepositoryImpl.class);
//    @Autowired
//    MongoConfig mconfig;

    @Override
    public void processRequest(Map<String, String> params) {
     
    }

    /*
     * Update the record of given id with the updatedRecord
     */
 
    public boolean updateRecord(String recordid, Map<String, UpdateRecord> mpObj) {

	
//	MongoOperations mongoOperation = (MongoOperations) mconfig.getMongoDb();
//	Query select = Query.query(Criteria.where("recordid").is(recordid));
//	Update update = new Update();
//	update.set(mObj.getKey(), "");
//	update.set("", "");
//	mongoOperation.findAndModify(select, update, UpdateRecord.class);

	return false;
    }

    /*
     * 
     */
    @Override
    public String recordStatus(String recordid) {

	return null;
    }

    /* 
     *
     **/
    @Override
    public EditableRecords[] getEditableRecords(String userid) {
	return null;
    }

    /* (non-Javadoc)
     * @see gov.nist.oar.rmm.repositories.UpdateRepository#updateRecord(java.lang.String)
     */
    @Override
    public boolean updateRecord(String recordid) {
	// TODO Auto-generated method stub
	return false;
    }

}
