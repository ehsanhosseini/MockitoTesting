package com.test.mockito.demomockito;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.mockito.Mockito.when;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks // create this and inject dataservice
	SomeBusinessImp busineImp;
	
	@Test
	public void testfindGreatestFromAll() {

	     
	     when(dataServiceMock.retriveAllData()).thenReturn(new int[] {40,2,67});
		//int result = busineImp.findGreatestFromAll();
		assertEquals(672, busineImp.findGreatestFromAll());
	}

	
	@Test
	public void testfindGreatestForOneValue() {
	     
	     when(dataServiceMock.retriveAllData()).thenReturn(new int[] {40});
	
		//int result = busineImp.findGreatestFromAll();
		assertEquals(40, busineImp.findGreatestFromAll());
	}
	
	
	@Test
	public void testfindGreatestForNoData() {
	     
	     when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
	
		//int result = busineImp.findGreatestFromAll();
		assertEquals(Integer.MIN_VALUE, busineImp.findGreatestFromAll());
	}
	
}
