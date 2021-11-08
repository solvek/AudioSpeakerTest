package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.WarningButton */
public class WarningButton extends BoundedFrameLayout {
    public WarningButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.alert_button_layout, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0734kn.f3013c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                ((Button) findViewById(R.id.warningButton)).setText(string);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
