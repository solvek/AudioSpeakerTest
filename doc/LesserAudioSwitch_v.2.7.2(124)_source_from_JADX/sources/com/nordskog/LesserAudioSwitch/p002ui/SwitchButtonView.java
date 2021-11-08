package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.SwitchButtonView */
public class SwitchButtonView extends BoundedFrameLayout {
    public SwitchButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.single_button_layout, this, true);
    }
}
