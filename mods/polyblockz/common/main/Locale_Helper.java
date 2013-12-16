package mods.polyblockz.common.main;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class Locale_Helper 
{
	public static boolean isXMLLanguageFile(String fileName) 
	{
		return fileName.endsWith(".xml");
	}

	public static String getLocaleFromFileName(String fileName) 
	{
		return fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
	}

	public static void loadLanguages() 
	{
		for (String localizationFile : Reference.localeFiles) 
		{
			LanguageRegistry.instance().loadLocalization(localizationFile, getLocaleFromFileName(localizationFile),	isXMLLanguageFile(localizationFile));
		}
	}
}