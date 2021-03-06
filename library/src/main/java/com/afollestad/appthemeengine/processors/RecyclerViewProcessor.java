package com.afollestad.appthemeengine.processors;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.afollestad.appthemeengine.Config;
import com.afollestad.appthemeengine.util.EdgeGlowUtil;

/**
 * @author Aidan Follestad (afollestad)
 */
public class RecyclerViewProcessor implements Processor<RecyclerView, Void> {

    @Override
    public void process(@NonNull Context context, @Nullable String key, @Nullable RecyclerView target, @Nullable Void extra) {
        if (target == null) return;
        EdgeGlowUtil.setEdgeGlowColor(target, Config.accentColor(context, key), null);
    }
}
