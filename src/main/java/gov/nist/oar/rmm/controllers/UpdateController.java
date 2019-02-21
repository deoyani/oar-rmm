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
package gov.nist.oar.rmm.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.nist.oar.rmm.repositories.UpdateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;
import org.springframework.security.access.prepost.PreAuthorize;
/**
 * This controller handles request to get the data from the record metadata database
 * Also allows the changes made by client app to post the changes using api endpoint.
 * This class also takes care of authentication of user input
 * @author Deoyani Nandrekar-Heinis
 */

@RestController
@Api(value = "Api endpoints to Edit EDI/PDL data", tags = "Edit API")

@Validated
@RequestMapping("/custom")
public class UpdateController {

    private Logger logger = LoggerFactory.getLogger(UpdateController.class);
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UpdateRepository uRepo;

    @RequestMapping(value = {
	    "edit/{ediid}" }, method = RequestMethod.GET, produces = "application/json", consumes = "string")
    @ApiOperation(value = ".", nickname = "Access editable Record", notes = "Resource returns a record if it is editable and user is authenticated.")
    public void editRecord(@PathVariable @Valid String ediid,
	    @ApiIgnore @Valid @RequestParam Map<String, String> params) {
	uRepo.processRequest(params);


    }

    @RequestMapping(value = {
	    "save/{ediid}" }, method = RequestMethod.POST, produces = "boolean", consumes = "application/json")
    @ApiOperation(value = ".", nickname = "UpdateRecord", notes = "Resource returns a boolean based on success or failure of the request.")
    public void updateRecord(@PathVariable @Valid String ediid, @ApiIgnore @Valid @RequestParam Map<String, String> params) {
	uRepo.processRequest(params);
	
    }
}
