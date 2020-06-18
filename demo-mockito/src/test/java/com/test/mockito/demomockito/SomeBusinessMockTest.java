package com.test.mockito.demomockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class SomeBusinessMockTest {

	// here we just create Mock for interfaces. we can create Mock for classes also 
	@Test
	public void testfindGreatestFromAll() {

	     DataService dataServiceMock =  mock(DataService.class);   // we need to import static mock // we can remove this one by using mockito annotation(@Mock DataService dataServiceMock)
	     //dataServiceMock.retriveAllData() =>   new int[] {40,2,67}                    // We want to return an array with set of valuse  
	     // In Junit testign we used to create a complete class stub but in mock we dont create a seperate class
	    
	     when(dataServiceMock.retriveAllData()).thenReturn(new int[] {40,2,67});
	     
	     // here we are passing mock by creating constractor 
		SomeBusinessImp busineImp = new SomeBusinessImp(dataServiceMock);    // we can remove this line by using  mockanotation(@InjectMocks SomeBusinessImp busineImp;) 
		int result = busineImp.findGreatestFromAll();
		assertEquals(67, result);
	}

	
	@Test
	public void testfindGreatestForOneValue() {

	     DataService dataServiceMock =  mock(DataService.class);   
	     
	     when(dataServiceMock.retriveAllData()).thenReturn(new int[] {40});
	
		SomeBusinessImp busineImp = new SomeBusinessImp(dataServiceMock);
		int result = busineImp.findGreatestFromAll();
		assertEquals(67, result);
	}
}
