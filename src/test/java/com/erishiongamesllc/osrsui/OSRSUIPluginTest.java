package com.erishiongamesllc.osrsui;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OSRSUIPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OSRSUIPlugin.class);
		RuneLite.main(args);
	}
}