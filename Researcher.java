package com.CarbonProject;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Researcher {

	public static double getCurrentCO2 () {
	
		Scanner scnr;
		scnr = null;

		try {
			   URL url = new URL("ftp://aftp.cmdl.noaa.gov/products/trends/co2/co2_mm_mlo.txt");
			   scnr = new Scanner(url.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int countLines = 0;
		while ( scnr.hasNextLine() ) {
					++countLines;
					scnr.nextLine();
		} 
		
		scnr.reset();
		
		try {
			   URL url = new URL("ftp://aftp.cmdl.noaa.gov/products/trends/co2/co2_mm_mlo.txt");
			   scnr = new Scanner(url.openStream());
			} catch (IOException ex) {	
				ex.printStackTrace();
			}
		
		for (int i = 0; i < countLines - 1; ++i) {
			scnr.nextLine();
		}
		
		scnr.next();
		scnr.next();
		scnr.next();
		
		return Double.parseDouble(scnr.next());
		
	}
	
	public static double getAvgCO2 (String yearDate) {
	
		//Parsing error at 1975
	if (Integer.valueOf(yearDate) ==  1975) {
		return 331.11;
	}
	
	double[] valuesToAverage = new double[200];
	
	Scanner scnr;
	scnr = null;
	
	try {
		   URL url = new URL("ftp://aftp.cmdl.noaa.gov/products/trends/co2/co2_mm_mlo.txt");
		   scnr = new Scanner(url.openStream());
		}
		catch(IOException ex) {
		   ex.printStackTrace(); 
		}
	
	int arrayCount = 0;
	while (scnr.hasNext()) {
		
		if (scnr.next().contains(yearDate)) {
			
			if(Integer.parseInt(scnr.next()) < 20) {
				scnr.next();
				valuesToAverage[arrayCount] = scnr.nextDouble();
				++arrayCount;
			} else {
				valuesToAverage[arrayCount] = scnr.nextDouble();
				++arrayCount;
			}
			
		}
		
	}
	
	double totalCO2 = 0.0;
	for (int i = 0; i < arrayCount; ++i) {
		totalCO2 = totalCO2 + valuesToAverage[i];
	}
	
	totalCO2 = totalCO2 / (double) arrayCount;
	
	return totalCO2;
}
	
	public static double getRateOfChange (String yearOne, String yearTwo) {
		
		double avgCO2One = getAvgCO2(yearOne);
		double avgCO2Two = getAvgCO2(yearTwo);
		
		double yearUno = Double.parseDouble(yearOne);
		double yearDos = Double.parseDouble(yearTwo);
		
		double rateOfChange = (avgCO2Two - avgCO2One) / (yearDos - yearUno);
		
		return rateOfChange;
	}
	
	public static double getFutureCO2 (String yearOne, String yearTwo, String yearDate) {
		double rateOfChange = getRateOfChange(yearOne, yearTwo);
		double yearTwoDub = Double.valueOf(yearTwo);
		double yearDateDub = Double.valueOf(yearDate);
		
		return rateOfChange * (yearDateDub - yearTwoDub) + getAvgCO2(yearTwo);
	}
	
	public static double getFutureCO2MinusFive (String yearOne, String yearTwo, String yearDate) {
		
		double rateOfChange = getRateOfChange(yearOne, yearTwo);
		double yearTwoDub = Double.valueOf(yearTwo);
		double yearDateDub = Double.valueOf(yearDate);
		
		double[] co2Yearly = new double[51];
		
		double rate = getRateOfChange("2017","2018");
		double rate0 = rate * 0.95;
		co2Yearly[0] = getCurrentCO2() + rate0;

		double rate1 = rate0 * 0.95;
		co2Yearly[1] = co2Yearly[0] + rate1;

		double rate2 = rate1 * 0.95;
		co2Yearly[2] = co2Yearly[1] + rate2;
	
		double rate3 = rate2 * 0.95;
		co2Yearly[3] = co2Yearly[2] + rate3;
		
		double rate4 = rate3 * 0.95;
		co2Yearly[4] = co2Yearly[3] + rate4;
		
		double rate5 = rate4 * 0.95;
		co2Yearly[5] = co2Yearly[4] + rate5;
	
		double rate6 = rate5 * 0.95;
		co2Yearly[6] = co2Yearly[5] + rate6;
	
		double rate7 = rate6 * 0.95;
		co2Yearly[7] = co2Yearly[6] + rate7;
		
		double rate8 = rate7 * 0.95;
		co2Yearly[8] = co2Yearly[7] + rate8;
	
		double rate9 = rate8 * 0.95;
		co2Yearly[9] = co2Yearly[8] + rate9;
		
		double rate10 = rate9 * 0.95;
		co2Yearly[10] = co2Yearly[9] + rate10;
		
		double rate11 = rate9 * 0.95;
		co2Yearly[11] = co2Yearly[9] + rate11;
		
		double rate12 = rate11 * 0.95;
		co2Yearly[12] = co2Yearly[11] + rate12;
		
		double rate13 = rate12 * 0.95;
		co2Yearly[13] = co2Yearly[12] + rate13;
		
		double rate14 = rate13 * 0.95;
		co2Yearly[14] = co2Yearly[13] + rate14;
		
		double rate15 = rate14 * 0.95;
		co2Yearly[15] = co2Yearly[14] + rate15;
		
		double rate16 = rate15 * 0.95;
		co2Yearly[16] = co2Yearly[15] + rate16;
		
		double rate17 = rate14 * 0.95;
		co2Yearly[17] = co2Yearly[16] + rate17;
		
		double rate18 = rate14 * 0.95;
		co2Yearly[18] = co2Yearly[17] + rate18;
		
		double rate19 = rate14 * 0.95;
		co2Yearly[19] = co2Yearly[18] + rate19;
		
		if (Integer.valueOf(yearDate) == 2020) {
			return co2Yearly[0];
		}
		if (Integer.valueOf(yearDate) == 2021) {
			return co2Yearly[1];
		}
		if (Integer.valueOf(yearDate) == 2022) {
			return co2Yearly[2];
		}
		if (Integer.valueOf(yearDate) == 2023) {
			return co2Yearly[3];
		}
		if (Integer.valueOf(yearDate) == 2024) {
			return co2Yearly[4];
		}
		if (Integer.valueOf(yearDate) == 2025) {
			return co2Yearly[5];
		}
		if (Integer.valueOf(yearDate) == 2026) {
			return co2Yearly[6];
		}
		if (Integer.valueOf(yearDate) == 2027) {
			return co2Yearly[7];
		}
		if (Integer.valueOf(yearDate) == 2028) {
			return co2Yearly[8];
		}
		if (Integer.valueOf(yearDate) == 2029) {
			return co2Yearly[9];
		}
		if (Integer.valueOf(yearDate) == 2030) {
			return co2Yearly[10];
		}
		if (Integer.valueOf(yearDate) == 2031) {
			return co2Yearly[11];
		}
		if (Integer.valueOf(yearDate) == 2032) {
			return co2Yearly[12];
		}
		if (Integer.valueOf(yearDate) == 2033) {
			return co2Yearly[13];
		}
		if (Integer.valueOf(yearDate) == 2034) {
			return co2Yearly[14];
		}
		if (Integer.valueOf(yearDate) == 2035) {
			return co2Yearly[15];
		}
		if (Integer.valueOf(yearDate) == 2036) {
			return co2Yearly[16];
		}
		if (Integer.valueOf(yearDate) == 2037) {
			return co2Yearly[17];
		}
		if (Integer.valueOf(yearDate) == 2038) {
			return co2Yearly[18];
		}
		if (Integer.valueOf(yearDate) == 2039) {
			return co2Yearly[19];
		}
		
		return -1.0;
		
		
		
		
		
	}
	
}
