/**
 * 
 */
package in.sivalabs.jpcg.core;

import java.io.InputStream;

import in.sivalabs.jpcg.core.configuration.Configuration;
import in.sivalabs.jpcg.core.utils.Utilities;

/**
 * @author Siva
 *
 */
class ConfigurationBuilder 
{
	
	public static Configuration getConfiguration(String configFile) 
	{
		return Utilities.unmarshal(configFile, Configuration.class);
	}
	
	public static Configuration getConfiguration(InputStream is) 
	{
		return Utilities.unmarshal(is, Configuration.class);
	}
		
}
