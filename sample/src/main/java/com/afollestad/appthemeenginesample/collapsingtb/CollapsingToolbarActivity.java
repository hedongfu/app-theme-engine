package com.afollestad.appthemeenginesample.collapsingtb;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.afollestad.appthemeenginesample.R;
import com.afollestad.appthemeenginesample.base.BaseThemedActivity;

/**
 * @author Aidan Follestad (afollestad)
 */
public class CollapsingToolbarActivity extends BaseThemedActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsingtoolbar);

        final CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        collapsingToolbar.setTitle(getTitle());

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}