package net.granoeste.validator;

import com.iangclifton.android.floatlabel.R;

import android.content.Context;
import android.text.TextUtils;

public class EmptyValidator extends BaseValidator {

	public EmptyValidator(final Context context) {
		 super(context.getString(R.string.errors_msg_not_empty));
	}
	
	public EmptyValidator(String message) {
		super(message);
	}

	@Override
	protected boolean condition(String value) {
		return ! TextUtils.isEmpty(value);
	}

}
