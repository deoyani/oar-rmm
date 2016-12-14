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


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = { "gov.nist.mml" })
@PropertySource(value = "classpath:restapi.properties")
@EnableWebMvc
@ComponentScan(basePackages = "gov.nist.mml")
/**
 * Class sets MongoDB Configuration
 * @author dsn1
 *
 */
public class MongoDBConfiguration extends AbstractMongoConfiguration {

	@Autowired
	private Environment env;
	private Logger logger = LoggerFactory.getLogger(MongoDBConfiguration.class);
	

	@Override 
	@Bean(name="metadataTemplate")
	/**
	 * Connect to Mongodb getting server and db configuration
	 */
	public Mongo mongo() throws Exception {
		
		logger.info("MongoDBConfiguration:"+env.getProperty("mongodb.host")+" :"+env.getProperty("mongodb.port"));
		return new MongoClient(new ServerAddress(env.getProperty("mongodb.host"),
				Integer.valueOf(env.getProperty("mongodb.port"))));
//		return new MongoClient(new ServerAddress(env.getProperty("MONGODB_1_PORT_3333_TCP_ADDR"),
//				Integer.valueOf(env.getProperty("MONGODB_1_PORT_3333_TCP_PORT"))));
	}	
	
	@Override
	/**
	 * Get Database name
	 * @return string db name
	 */
	protected String getDatabaseName() {
		return env.getProperty("mongodb.name");
	}

	@Override
	/**
	 * Get package Name
	 * @return string package name
 	 */
	public String getMappingBasePackage() {
		return "gov.nist.mml";
	}
	
	
	

}
