/*
 * Copyright (C) 2012 granoeste@gmail.com (https://github.com/granoeste)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.granoeste.validator;

import android.content.Context;
import android.text.TextUtils;

public class RangeValidator extends BaseValidator {
    int mMin;
    int mMax;

    public RangeValidator(final int min, final int max, final Context context) {
    	super(context.getString(R.string.errors_msg_range_value, min, max));
        mMin = min;
        mMax = max;
    }
    
    public RangeValidator(final int min, final int max, final String errorMessage) {
        super(errorMessage);
        mMin = min;
        mMax = max;
    }

    @Override
    protected boolean condition(final String value) {
        return TextUtils.isEmpty(value) || (mMin <= value.length() && value.length() <= mMax);
    }

}
