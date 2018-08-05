package com.l2d.tuto.springbootwebfluxsecurity.configuration.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

	public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

	@Override
	public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException, JsonProcessingException {
		switch (parser.getCurrentToken()) {
			case VALUE_STRING:
				String rawDate = parser.getText();
				return FORMATTER.parse(rawDate, LocalDateTime::from);
		}
		throw context.wrongTokenException(parser, JsonToken.START_ARRAY, "Expected string.");
	}
}
