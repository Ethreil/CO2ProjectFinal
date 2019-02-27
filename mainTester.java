package com.CarbonProject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Calendar;

import org.json.JSONException;

public class mainTester {
	
	public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
	
		//Researcher.saveFileFromUrl("CO2Monthly", "ftp://aftp.cmdl.noaa.gov/products/trends/co2/co2_mm_mlo.txt");
		//Researcher.saveFileFromUrl("CO2BP", "https://www1.ncdc.noaa.gov/pub/data/paleo/icecore/antarctica/antarctica2015co2composite.txt");
		
		graphSources.encodeCO2BP();
		/*
		graphSources.encodeCurrent();
		graphSources.encodePast();
		graphSources.encodeFutureAtCurrentRate();
		graphSources.encodeFutureAtRateLastFiveDecades();
		graphSources.encodeFutureAtMinus5();
		*/
		
	}

}
