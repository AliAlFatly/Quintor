package com.example.demo;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringReverseControllerTests {

	@Autowired
	private StringReverseController stringReverseController;

	@Test
	public void testStringReverse(){
		String message = stringReverseController.stringReverse("test");
		Assert.assertEquals("tset", message);
	}

}
