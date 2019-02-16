package com.CarbonProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import org.json.JSONException;
import org.json.JSONObject;	
import org.json.simple.JSONValue;


public class graphSources {
	
	public static void encodeFutureAtCurrentRate () throws JSONException, IOException {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int year1 = year - 51;
		int year2 = year - 1;
		String yearOne = Integer.toString(year1);
		String yearTwo = Integer.toString(year2);
		
		
		JSONObject futureCurrent = new org.json.JSONObject();
		
		
		for (int i = 2023; i < 2070; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureCurrent.put(intI, Double.toString(Researcher.getFutureCO2(yearOne, yearTwo, intI)) );
		}
		
		File file = new File("FutureAtCurrentRate.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(futureCurrent, fileWriter);
		fileWriter.close();
	}
	
	public static void encodeFutureAtRateLastFiveDecades () throws JSONException, IOException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int year1 = year - 2;
		int year2 = year - 1;
		String yearOne = Integer.toString(year1);
		String yearTwo = Integer.toString(year2);
		
		
		JSONObject futureLastFive = new org.json.JSONObject();
		
		
		for (int i = 2023; i < 2070; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureLastFive.put(intI, Double.toString(Researcher.getFutureCO2(yearOne, yearTwo, intI)) );
		}
		
		File file = new File("FutureAtRateLastFiveDecades.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(futureLastFive, fileWriter);
		fileWriter.close();
	}

	public static void encodeFutureAtMinus5 () throws JSONException, IOException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int year1 = year - 2;
		int year2 = year - 1;
		String yearOne = Integer.toString(year1);
		String yearTwo = Integer.toString(year2);
		
		
		JSONObject futureAtMinus5 = new org.json.JSONObject();
		
		
		for (int i = 2023; i < 2070; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureAtMinus5.put(intI, Double.toString(Researcher.getFutureCO2Minus5(yearOne, yearTwo, intI)) );
		}
		
		File file = new File("FutureAtMinus5.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(futureAtMinus5, fileWriter);
		fileWriter.close();
	}
	
}
