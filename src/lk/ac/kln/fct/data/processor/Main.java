package lk.ac.kln.fct.data.processor;

import java.util.ArrayList;

import lk.ac.kln.fct.data.pojo.Record;

public class Main {
	private static final String FILE_PATH = "C:/Users/Chamini/eclipse-workspace/Excercise1/src/covid-19-info.json";
	private static final String DATE = "18/05/2020";
	
	public static void main(String[] args) {
		DataProcessor processor = new DataProcessor();
		
		ArrayList<Record> covidCount=processor.getDataByDate(FILE_PATH, DATE); // getDataByDate method and get the returning array list.
		sortAndPrint(covidCount);     //sortAndPrint method for array list        
	}
		
	public static void sortAndPrint(ArrayList<Record> records) {
		records.sort((record1, record2)-> Integer.compare(record2.getCases(), record1.getCases()));
		
        System.out.println("Country:  TotalCases:  Deaths \n");
		
		  //iterate the array list
		for(Record info: records) {
			if(info.getCases()>=1000) {
				
				System.out.println(info.getCountriesAndTerritories()+" : "+info.getCases()+" : "+info.getDeaths());
				
			}
			
		}
		
	}
}
