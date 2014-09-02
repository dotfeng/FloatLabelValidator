FloatLabelValidator
===================

Android FloatLabel and Validator edittext

Sample for Floatlabelededittext https://github.com/wrapp/floatlabelededittext and ValidatorForAndroid https://github.com/granoeste/ValidatorForAndroid 


        mFloatTextPersonName = findViewByIdAndCast(v, R.id.textPersonName);
        mTextPersonName = mFloatTextPersonName.getEditText();
        
        //with default tips
        mValidators.put(mTextPersonName, new Validator[] {
                    new RequiredValidator(context),
                    new MaxLengthValidator(30, context),
            });
            
            
        //with custom tips
        mValidators.put(mNumberPassword, new Validator[] {
                    new RangeValidator(4, 4, "Be sure to input 4 figures "),
                    new IntRangeValidator(1, 9999, "4 figures of numbers are allowed."),
            });    
