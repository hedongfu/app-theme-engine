package com.afollestad.appthemeenginesample;

import android.content.Context;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import android.util.TypedValue;

/**
 * @author Aidan Follestad (afollestad)
 */
public class Util {

    public static String resolveString(@NonNull Context context, @AttrRes int attr) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attr, typedValue, true);
        return (String) typedValue.coerceToString();
    }

    private Util() {
    }
}