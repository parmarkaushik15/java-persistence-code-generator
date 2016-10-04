/**
 * 
 */
package com.sivalabs.jpcg.core;

import java.io.InputStream;

import com.sivalabs.jpcg.core.configuration.Configuration;

/**
 * @author Siva
 *
 */
public class JpcgCoreTest 
{

	public static void main(String[] args) throws Exception 
	{
		String configFile = "/config.xml";
		InputStream stream = Configuration.class.getClass().getResourceAsStream(configFile);
		Configuration configuration = ConfigurationBuilder.getConfiguration(stream);
		System.out.println(configuration);
	}

}
