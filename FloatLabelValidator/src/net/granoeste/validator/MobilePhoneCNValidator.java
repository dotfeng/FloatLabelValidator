package net.granoeste.validator;

import java.util.regex.Pattern;
/**
 * It validates phone numbers.
 * Regexp was taken from the android source code.
 * @author Andrea Baccega <me@andreabaccega.com>
 *
 */
public class MobilePhoneCNValidator extends PatternValidator{
	public MobilePhoneCNValidator(String _customErrorMessage) {

		super(_customErrorMessage, Pattern.compile(                                  
				"^[1][3,4,5,7,8][0-9]{9}$"));
	}
}