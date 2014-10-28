package net.granoeste.validator;

import java.util.regex.Pattern;

public class PatternValidator extends BaseValidator {

	private Pattern pattern;
	public PatternValidator(String _customErrorMessage, Pattern _pattern) {
		super(_customErrorMessage);
		if (_pattern == null) throw new IllegalArgumentException("_pattern must not be null");
		pattern = _pattern;
	}

	@Override
	protected boolean condition(String value) {
		return pattern.matcher(value).matches();
	}

}
