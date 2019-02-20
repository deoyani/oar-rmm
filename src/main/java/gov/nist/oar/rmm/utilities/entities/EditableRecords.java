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

/**
 * This object represnts the recordid that current user can edit. Once the
 * request to list the records which can be edited by current authorized users.`
 * 
 * @author Deoyani Nandrekar-Heinis
 *
 */

public class EditableRecords {

    public String title;
    public String modified;
    public String version;
    public String recordid;

    public EditableRecords(String title, String modified, String version, String recordid) {
	this.title = title;
	this.modified = modified;
	this.version = version;
	this.recordid = recordid;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public void setModified(String modified) {
	this.modified = modified;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public void setRecordid(String recordid) {
	this.recordid = recordid;
    }

    public String getTitle() {
	return this.title;
    }

    public String getModified() {
	return this.modified;
    }

    public String getVersion() {
	return this.version;
    }

    public String getRecordid() {
	return this.recordid;
    }
}
