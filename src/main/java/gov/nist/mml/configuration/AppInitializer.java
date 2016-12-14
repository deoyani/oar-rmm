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
package gov.nist.mml.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 * AppInitializer class initializes all the configuration classes,
 * connecting database, enabling swagger configuration and webserver settings.
 * @author dsn1
 *
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    /**
     * get the root configuration. 
     * @return Config class 
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { MongoDBConfiguration.class, 
        		WebappConfiguration.class,
        		SwaggerConfiguration.class};
    }
  
    /**
     * Get servlet configuration
     * @return Servlet config class 
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    /**
     * Get Servlet mapping path
     * @return string path mappping
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}
