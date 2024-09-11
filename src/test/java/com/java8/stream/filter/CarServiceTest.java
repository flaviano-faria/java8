package com.java8.stream.filter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {
	
	@InjectMocks
    @Spy
	private CarService carService = new CarService();
	
	

	@Test
	public void isGreatherThanTest() {
		doReturn(true).when(carService).isOverthan(Mockito.anyString(), Mockito.anyString());
		boolean isGreather = carService.isGreatherThan();
		
		assertEquals(true, isGreather);
		
	}

}
