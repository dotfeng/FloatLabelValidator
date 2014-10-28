
package net.granoeste.validator;

import com.iangclifton.android.floatlabel.R;

import android.content.Context;
import android.text.TextUtils;

public class CreditCardValidator extends BaseValidator {
    private final org.apache.commons.validator.CreditCardValidator mValidator;
    
    public CreditCardValidator(final Context context) {
        super(context.getString(R.string.errors_msg_credit_card));
        mValidator = new org.apache.commons.validator.CreditCardValidator();
    }
    
    public CreditCardValidator(String message) {
        super(message);
        mValidator = new org.apache.commons.validator.CreditCardValidator();
    }

    public CreditCardValidator(int options, String message) {
        super(message);
        mValidator = new org.apache.commons.validator.CreditCardValidator(options);
    }

    @Override
    protected boolean condition(String value) {
        return TextUtils.isEmpty(value) || mValidator.isValid(value);
    }
}
