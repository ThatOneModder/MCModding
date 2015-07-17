package com.name.MCModding.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try
        {
            //Load config file
            configuration.load();

            //Read properties from config file
             configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is a test").getBoolean(true);

        }
        catch (Exception e)
        {
            //Log exception
        }
        finally
        {
            //Save file
            configuration.save();
        }

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||"+configValue);
    }
}
