package com.baeldung;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import com.baeldung.Syncronizer;

public class SyncronizerTest {
	
	@Test
	public void givenMultiThread_whenNonSyncronizedMethod() throws InterruptedException {
		ExecutorService		service		= Executors.newFixedThreadPool(3);
		Syncronizer			summation	= new Syncronizer();
		
		IntStream.range(0, 1000)
			.forEach(count -> service.submit(summation::calculate));
		
		service.awaitTermination(1000, TimeUnit.MILLISECONDS);
		
		Assert.assertEquals(1000, summation.getSum());
	}
	
}