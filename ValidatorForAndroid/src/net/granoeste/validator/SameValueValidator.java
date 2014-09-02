package net.granoeste.validator;

import android.content.Context;
import android.text.TextUtils;

public class SameValueValidator extends BaseValidator {

	String otherValue;
	
	public SameValueValidator(String otherValue, Context context) {
		super(context.getString(R.string.errors_msg_equals));
		this.otherValue = otherValue;
	}
	
	public SameValueValidator(String otherValue, String message) {
		super(message);
		this.otherValue = otherValue;
	}

	@Override
	protected boolean condition(String value) {
		return TextUtils.equals(value, otherValue);
	}

}
