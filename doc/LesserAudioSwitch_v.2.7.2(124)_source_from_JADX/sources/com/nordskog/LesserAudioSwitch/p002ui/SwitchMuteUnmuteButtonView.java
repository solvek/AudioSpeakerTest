package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.SwitchMuteUnmuteButtonView */
public class SwitchMuteUnmuteButtonView extends BoundedFrameLayout {
    public SwitchMuteUnmuteButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.single_button_mute_unmute_layout, this, true);
    }
}
