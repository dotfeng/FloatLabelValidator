package net.granoeste.validator;

import android.content.Context;
import android.text.TextUtils;

public class DigitsValidator extends BaseValidator {

	public DigitsValidator(final Context context) {
		super(context.getString(R.string.errors_msg_digits));
	}
	
	public DigitsValidator(String message) {
		super(message);
	}

	@Override
	protected boolean condition(String value) {
		return TextUtils.isDigitsOnly(value);
	}

}
