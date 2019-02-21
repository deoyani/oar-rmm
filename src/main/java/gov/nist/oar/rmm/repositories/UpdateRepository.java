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
package gov.nist.oar.rmm.repositories;

import java.util.Map;

import org.bson.Document;

import gov.nist.oar.rmm.utilities.entities.EditableRecords;
import gov.nist.oar.rmm.utilities.entities.UpdateRecord;

/**
 * This interface declares methods which can be used to access record data and perform the operations defined.
 * @author Deoyani Nandrekar-Heinis
 *
 */
public interface UpdateRepository {
    
    public boolean updateRecord(UpdateRecord record, String recordid);

    public String getRecordStatus(String recordid);

    public Document getNERDmRecord(String recordid);
    
    //public EditableRecords[] getEditableRecords(String userid);

    public void processRequest(Map<String, String> params);
}
