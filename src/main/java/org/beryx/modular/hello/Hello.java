package org.beryx.modular.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
	private static final Logger logger = LoggerFactory.getLogger(Hello.class);

	public static void main(String[] args) {
		logger.info("""
				Hello,
				I'm a text block.
				I'm still a preview feature in Java 14.
				""");
	}
}
