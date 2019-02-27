package com.CarbonProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;	
import org.json.simple.JSONValue;


public class graphSources {
	
	public static void encodeFutureAtCurrentRate () throws JSONException, IOException {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int year1 = year - 2;
		int year2 = year - 1;
		String yearOne = Integer.toString(year1);
		String yearTwo = Integer.toString(year2);
		
		
		JSONObject futureCurrent = new org.json.JSONObject();
		
		
		for (int i = year + 4; i < year + 50; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureCurrent.put(intI, Researcher.getFutureCO2(yearOne, yearTwo, intI) );
		}
		
		File file = new File("FutureAtCurrentRate.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(futureCurrent, fileWriter);
		fileWriter.close();
	}
	
	public static void encodeFutureAtRateLastFiveDecades () throws JSONException, IOException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int year1 = year - 51;
		int year2 = year - 1;
		String yearOne = Integer.toString(year1);
		String yearTwo = Integer.toString(year2);
		
		
		JSONObject futureLastFive = new org.json.JSONObject();
		
		
		for (int i = year + 4; i < year + 50; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureLastFive.put(intI, Researcher.getFutureCO2(yearOne, yearTwo, intI) );
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
		
		
		for (int i = year + 4; i < year + 50; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			futureAtMinus5.put(intI, Researcher.getFutureCO2Minus5(yearOne, yearTwo, intI) );
		}
		
		File file = new File("FutureAtMinus5.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(futureAtMinus5, fileWriter);
		fileWriter.close();
	}
	
	public static void encodePast () throws JSONException, IOException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		JSONObject pastData = new org.json.JSONObject();
		
		for (int i = 1959; i < year ; i = i + 4)
		{
			String intI = Integer.toString(i);
			
			pastData.put(intI, Researcher.getAvgCO2(intI) );
		}
		
		File file = new File("pastData.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(pastData, fileWriter);
		fileWriter.close();
		
	}
	
	public static void encodeCurrent () throws JSONException, IOException {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String yearString = Integer.toString(year);
		JSONObject currentCO2 = new org.json.JSONObject();
		
		currentCO2.put(yearString, Researcher.getCurrentCO2());
		
		File file = new File("currentData.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(currentCO2, fileWriter);
		fileWriter.close();
	}
	
	public static void encodeCO2BP () throws NumberFormatException, JSONException, IOException {
		
		Scanner scnr;
		scnr = null;
		
		File f = new File("CO2BP");
		scnr = new Scanner(f);
			
		double[] co2Year = new double[2000];
		double[] co2Value = new double[2000];
		int year = Calendar.getInstance().get(Calendar.YEAR);
		double yearDifferenceBeforePhysics = (double) (year - 1950);
		
		int count = 0;
		while (count < 139) {
			scnr.nextLine();
			++count;
		}
		count = 0;
		while(count < 1900) {

			co2Year[count] = yearDifferenceBeforePhysics + Double.parseDouble(scnr.next());
			co2Value[count] = Double.parseDouble(scnr.next());
			++count;
			scnr.nextLine();	
		} 
			
		System.out.print(co2Value[500]);
		
		JSONObject co2BPJSON = new org.json.JSONObject();
		count = 0;
		while (count < 1900) {
			co2BPJSON.put(Double.toString(co2Year[count]), co2Value[count]);
			++count;
		}
		
		File file = new File("CO2BP.json");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
	 	JSONValue.writeJSONString(co2BPJSON, fileWriter);
		fileWriter.close();
		
		JSONObject co2YearKeys = new org.json.JSONObject();
		count = 0;
		while (count < 1900) {
			co2YearKeys.put(Integer.toString(count), Double.toString(co2Year[count]) );
			++count;
		}
		
		File file2 = new File("CO2BPKeys.json");
		file2.createNewFile();
		FileWriter fileWriter2 = new FileWriter(file2);
	 	JSONValue.writeJSONString(co2YearKeys, fileWriter2);
		fileWriter.close();
		
	}
	
}
