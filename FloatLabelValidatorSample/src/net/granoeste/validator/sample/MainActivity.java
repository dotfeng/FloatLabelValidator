
package net.granoeste.validator.sample;

import com.iangclifton.android.floatlabel.FloatLabel;

import net.granoeste.validator.DoubleRangeValidator;
import net.granoeste.validator.EmailValidator;
import net.granoeste.validator.IntRangeValidator;
import net.granoeste.validator.MaxLengthValidator;
import net.granoeste.validator.MobilePhoneCNValidator;
import net.granoeste.validator.RangeValidator;
import net.granoeste.validator.RequiredValidator;
import net.granoeste.validator.Validator;
import net.granoeste.validator.Validators;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    ViewHolder mViewHolder;
    Context context;
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this;
        
        mViewHolder = new ViewHolder(getWindow().getDecorView());
    }

    public class ViewHolder {
        Validators mValidators = new Validators();
        
        public FloatLabel mFloatTextPersonName;
        public EditText mTextPersonName;
        
        public FloatLabel mFloatTextPassword;
        public EditText mTextPassword;
        
        public FloatLabel mFloatNumberPassword;
        public EditText mNumberPassword;
        
        public FloatLabel mFloatTextEmailAddress;
        public EditText mTextEmailAddress;
        
        public FloatLabel mFloatPhone;
        public EditText mPhone;
        
        public FloatLabel mFloatTextPostalAddress;
        public EditText mTextPostalAddress;
        
        public FloatLabel mFloatNumber;
        public EditText mNumber;
        
        public FloatLabel mFloatNumberDecimal;
        public EditText mNumberDecimal;
        
        public Button mButton;

        public ViewHolder(final View v) {
        	mFloatTextPersonName = findViewByIdAndCast(v, R.id.textPersonName);
        	mTextPersonName = mFloatTextPersonName.getEditText();
        	
        	mFloatTextPassword = findViewByIdAndCast(v, R.id.textPassword);
        	mTextPassword = mFloatTextPassword.getEditText();
            
        	mFloatNumberPassword = findViewByIdAndCast(v, R.id.numberPassword);
        	mNumberPassword = mFloatNumberPassword.getEditText();
            
        	mFloatTextEmailAddress = findViewByIdAndCast(v, R.id.textEmailAddress);
            mTextEmailAddress = mFloatTextEmailAddress.getEditText();
            
            mFloatPhone = findViewByIdAndCast(v, R.id.phone);
            mPhone = mFloatPhone.getEditText();
            
            mFloatTextPostalAddress = findViewByIdAndCast(v, R.id.textPostalAddress);
            mTextPostalAddress = mFloatTextPostalAddress.getEditText();
            
            mFloatNumber = findViewByIdAndCast(v, R.id.number);
            mNumber = mFloatNumber.getEditText();
            
            mFloatNumberDecimal = findViewByIdAndCast(v, R.id.numberDecimal);
            mNumberDecimal = mFloatNumberDecimal.getEditText();
            
            
            mButton = findViewByIdAndCast(v, R.id.button);

            //with default tips
            mValidators.put(mTextPersonName, new Validator[] {
                    new RequiredValidator(context),
                    new MaxLengthValidator(30, context),
            });
            mValidators.put(mTextPassword, new Validator[] {
                    new RequiredValidator(context),
                    new RangeValidator(8, 16, context),
            });
            //with custom tips
            mValidators.put(mNumberPassword, new Validator[] {
                    new RangeValidator(4, 4, "Be sure to input 4 figures "),
                    new IntRangeValidator(1, 9999, "4 figures of numbers are allowed."),
            });
            mValidators.put(mTextEmailAddress, new Validator[] {
                    new EmailValidator(context),
            });
            mValidators.put(mPhone, new Validator[] {
                    new MobilePhoneCNValidator(mPhone.getEditableText().toString(), context),
            });
            mValidators.put(mTextPostalAddress, new Validator[] {
                    new MaxLengthValidator(7, "Being allowed is to 7 characters. "),
            });
            mValidators.put(mNumber, new Validator[] {
                    new IntRangeValidator(0, Integer.MAX_VALUE, "Input a decimal number. "),
            });
            mValidators.put(mNumberDecimal, new Validator[] {
                    new DoubleRangeValidator(0, Double.MAX_VALUE, "Input an integral number. "),
            });

            mButton.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(final View v) {
                    mValidators.clearError();
                    if (mValidators.isValid()) {
                        Toast.makeText(getApplicationContext(), "It has some errors. ",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        @SuppressWarnings("unchecked")
        private <T> T findViewByIdAndCast(final View v, final int id) {
            return (T) v.findViewById(id);
        }
    }

}
