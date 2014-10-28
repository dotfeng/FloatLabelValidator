package net.granoeste.validator;

import java.util.regex.Pattern;

import android.os.Build;
import android.util.Patterns;
/**
 * It validates phone numbers.
 * Regexp was taken from the android source code.
 * @author Andrea Baccega <me@andreabaccega.com>
 *
 */
public class ChineseMobilePhoneValidator extends PatternValidator{
	public ChineseMobilePhoneValidator(String _customErrorMessage) {

		super(_customErrorMessage, Build.VERSION.SDK_INT>=8?Patterns.PHONE:Pattern.compile(                                  // sdd = space, dot, or dash
				"^(\\+?\\d{2}-?)?(1[0-9])\\d{9}$"));
	}
}