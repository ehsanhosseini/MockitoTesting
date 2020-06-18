package com.test.mockito.demomockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testfindGreatestFromAll() {

		SomeBusinessImp busineImp = new SomeBusinessImp(new DataServicestub());
		int result = busineImp.findGreatestFromAll();
		assertEquals(232, result);
	}
	
public class DataServicestub implements DataService{   // there is problem using stub, because if we have {1} or{} then we need to create new stub so here is the best way to use mockito
	
	public int[] retriveAllData() {
		return new int[] {23,2,14};
	}
	
}

}
