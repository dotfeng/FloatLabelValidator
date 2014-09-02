package net.granoeste.validator;

import android.content.Context;

public class NumericRangeValidator extends BaseValidator {

	int mMin;
    int mMax;
	
	public NumericRangeValidator(final int min, final int max, final Context context) {
    	super(context.getString(R.string.errors_msg_digits_range_value, min, max));
        mMin = min;
        mMax = max;
    }
	
	public NumericRangeValidator(final int min, final int max, String message) {
		super(message);
		mMin = min;
        mMax = max;
	}

	@Override
	protected boolean condition(String value) {
		try {
			int v = Integer.parseInt(value);
			return v >= mMin && v <= mMax;
		} catch(NumberFormatException e) {
			return false;
		}
	}

}
