package net.granoeste.validator;

import java.util.regex.Pattern;

import com.iangclifton.android.floatlabel.R;

import android.content.Context;
/**
 * It validates phone numbers.
 * Regexp was taken from the android source code.
 * @author Andrea Baccega <me@andreabaccega.com>
 *
 */
public class MobilePhoneCNValidator extends PatternValidator{
	
	public MobilePhoneCNValidator(final String phone, final Context context){
		super(context.getString(R.string.errors_msg_mobile_phone, phone), Pattern.compile(                                  
				"^[1][3,4,5,7,8][0-9]{9}$"));
	}
	
	
	public MobilePhoneCNValidator(String _customErrorMessage) {

		super(_customErrorMessage, Pattern.compile(                                  
				"^[1][3,4,5,7,8][0-9]{9}$"));
	}
}