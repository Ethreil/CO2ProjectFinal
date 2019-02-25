package com.CarbonProject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;

import org.json.JSONException;

public class mainTester {
	
	public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
	
		
		graphSources.encodePast();
		graphSources.encodeFutureAtCurrentRate();
		graphSources.encodeFutureAtRateLastFiveDecades();
		graphSources.encodeFutureAtMinus5();
		
	}

}
