package br.com.jacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMessageBuilder {

	@Test
	public void testNameNotEmpty() {
		MessageBuilder obj = new MessageBuilder();
		assertEquals("Hello JohnDoe", obj.getMessage("JohnDoe"));
	}

	@Test
	public void testNameEmpty() {
		MessageBuilder obj = new MessageBuilder();

		assertEquals("Please provide a name!", obj.getMessage(" "));
	}

	@Test
	public void testNameNull() {
		MessageBuilder obj = new MessageBuilder();

		assertEquals("Please provide a name!", obj.getMessage(null));
	}
}
