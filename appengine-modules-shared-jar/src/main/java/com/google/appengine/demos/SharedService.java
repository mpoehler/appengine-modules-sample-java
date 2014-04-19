package com.google.appengine.demos;

public class SharedService {

	private static int globalcounter = 0;

	/**
	 * ATTENTION: The globalcounter is not global across modules !!!
	 * Every module is deployed in a different servlet container!
	 * Synchronization must be done using appengine APIs!
	 */
	public static String doSomething() {
		globalcounter++;
		return "Response from SharedService, globalcounter: " + globalcounter;
	}
}