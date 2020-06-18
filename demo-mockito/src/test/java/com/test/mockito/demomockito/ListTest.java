package com.test.mockito.demomockito;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

	@Test
	public void testSize() {
		
		List listMock = mock(List.class);
		 
		when(listMock.size()).thenReturn(10);
		
		assertEquals(10, listMock.size());
		assertEquals(10, listMock.size());

	}

	
	@Test
	public void testSizeMultiTime() {
		
		List listMock = mock(List.class);
		 
		when(listMock.size()).thenReturn(20).thenReturn(30);
		
		assertEquals(20, listMock.size());
		assertEquals(30, listMock.size());
		assertEquals(30, listMock.size());

	}
	
	
	@Test
	public void testGetSpecificParameter() {
		
		List listMock = mock(List.class);
		 
		when(listMock.get(0)).thenReturn("SomeThing"); //** here parameter is specific as per the below test when we use a generic test then all other test shoud be generic  
		
		assertEquals("SomeThing", listMock.get(0));
		assertEquals(null, listMock.get(1)); // for all other parameter return null
	}
	
	
	
	@Test
	public void testGetGenericParameterInt() {
		
		List listMock = mock(List.class);
		 
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeThing"); //** (Mockito.anyInt())-> this generic. When one parameter is generic then all other parameter needs to be generic
		
		assertEquals("SomeThing", listMock.get(0));
		assertEquals("SomeThing", listMock.get(1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
