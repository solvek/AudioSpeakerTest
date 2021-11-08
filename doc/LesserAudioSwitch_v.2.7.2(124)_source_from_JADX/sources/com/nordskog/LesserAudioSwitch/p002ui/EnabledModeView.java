package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.EnabledModeView */
public class EnabledModeView extends BoundedFrameLayout implements View.OnClickListener {

    /* renamed from: d */
    public View f1758d = findViewById(R.id.enabled_mode_bluetooth);

    /* renamed from: e */
    public View f1759e = findViewById(R.id.enabled_mode_usb);

    /* renamed from: f */
    public View f1760f = findViewById(R.id.enabled_mode_cast);

    public EnabledModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_enabled_modes, this, true);
        this.f1758d.setOnClickListener(this);
        this.f1759e.setOnClickListener(this);
        this.f1760f.setOnClickListener(this);
    }

    public void onClick(View view) {
        getContext().startActivity(new Intent(getContext(), SettingsActivity.class));
    }
}
