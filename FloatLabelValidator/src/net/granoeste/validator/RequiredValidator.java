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

import com.iangclifton.android.floatlabel.R;

import android.content.Context;

public class RequiredValidator extends BaseValidator {
    static final char IDEOGRAPHICS_SPACE = '\u3000';

    public RequiredValidator(final Context context) {
    	super(context.getString(R.string.errors_msg_required));
    }
    
    public RequiredValidator(final String errorMessage) {
        super(errorMessage);
    }

    @Override
    protected boolean condition(String value) {
        value = value.trim()
                .replaceAll("^[\\s" + IDEOGRAPHICS_SPACE + "]*", "")
                .replaceAll("[\\s" + IDEOGRAPHICS_SPACE + "]*$", "");
        return value.length() > 0;
    }

}
