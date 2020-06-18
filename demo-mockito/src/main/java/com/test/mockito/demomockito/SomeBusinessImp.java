package com.test.mockito.demomockito;


public class SomeBusinessImp{
	
	
	private DataService dataservice;  
	
	//using constructor to inject dataservice
	public  SomeBusinessImp(DataService dataservice) {  // creating constuctor to access data service
		this.dataservice = dataservice;
		
	}
		
	public int findGreatestFromAll() {
		
		int[] retriveData = dataservice.retriveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for (int value: retriveData) {
			if(value>greatest) {
				greatest = value;
			}
		}
		
		return greatest;
	}

}

