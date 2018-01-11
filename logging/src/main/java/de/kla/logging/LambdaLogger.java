package de.kla.logging;

import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 * @author Kevin Lange
 */
public class LambdaLogger {

	private final Logger logger;

	public LambdaLogger(String name) {
		logger = LoggerFactory.getLogger(name);
	}

	public LambdaLogger(@SuppressWarnings("rawtypes") Class clazz) {
		logger = LoggerFactory.getLogger(clazz);
	}

	public void info(String msg) {
		logger.info(msg);
	}

	public void info(String msg, Object... arguments) {
		logger.info(msg, arguments);
	}

	public void info(String msg, Supplier<?>... arguments) {
		logger.info(msg, LambdaWrapper.from(arguments));
	}

	public void error(String msg) {
		logger.error(msg);
	}
}
