package com.CarbonProject;

public class mainTester {
	
	public static void main(String[] args) {
		
		System.out.println(Researcher.getAvgCO2("1975"));
		
		System.out.println("Between 1960 and 2018 there was a CO2 ppm increase of: " + Researcher.getRateOfChange("1960", "2018") + " per year on average");
		
		System.out.println("CO2 in 2060 is: " + Researcher.getFutureCO2("2008", "2018", "2060"));
	}

}
