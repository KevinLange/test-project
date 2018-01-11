package de.kla.logging;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * 
 * @author Kevin Lange
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class LambdaLoggerTest {

	private LambdaLogger lambdaLogger;

	@Before
	public void setUp() {
		lambdaLogger = new LambdaLogger(LambdaLoggerTest.class);
	}

	@After
	public void tearDown() {

	}

	@Test
	public void info() {
		lambdaLogger.info("no arguments");
	}

	@Test
	public void info_ObjectVarargs() {
		lambdaLogger.info("object varargs; arg0: {}, arg1: {}", getInteger(), getInteger(1));
	}

	@Test
	public void info_SupplierVarargs() {
		lambdaLogger.info("supplier varargs; arg0: {}, arg1: {}", this::getInteger, this::getInteger);
	}
	
	@Test
	public void info_MixedVarargs() {
//		Does not work
//		lambdaLogger.info("arg0: {}, arg1: {}", this::getInteger, getInteger()); 
	}
	
	@Test
	public void error() {
		lambdaLogger.error("no arguments");
	}
	
	private Integer getInteger() {
		return getInteger(0);
	}
	
	private Integer getInteger(Integer integer) {
		return integer;
	}
}
