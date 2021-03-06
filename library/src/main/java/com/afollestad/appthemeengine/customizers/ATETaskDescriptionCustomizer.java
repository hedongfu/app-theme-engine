package com.afollestad.appthemeengine.customizers;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/**
 * @author Aidan Follestad (afollestad)
 */
public interface ATETaskDescriptionCustomizer {

    @ColorInt
    int getTaskDescriptionColor();

    /**
     * Return null to use the default (app's launcher icon)
     */
    @Nullable
    Bitmap getTaskDescriptionIcon();
}
