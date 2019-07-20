package com.afollestad.appthemeenginesample;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * @author Aidan Follestad (afollestad)
 */
public class AboutDialog extends DialogFragment {

    public static void show(AppCompatActivity context) {
        AboutDialog dialog = new AboutDialog();
        dialog.show(context.getSupportFragmentManager(), "[ABOUT_DIALOG]");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Color theming is handled by ATE's MD integration
        return new MaterialDialog.Builder(getActivity())
                .title(R.string.about)
                .positiveText(R.string.dismiss)
                .content(Html.fromHtml(getString(R.string.about_body)))
                .contentLineSpacing(1.6f)
                .build();
    }
}