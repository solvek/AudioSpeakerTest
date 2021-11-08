package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.StatusView */
public class StatusView extends BoundedLinearLayout {

    /* renamed from: d */
    public AppCompatImageView f1800d = ((AppCompatImageView) findViewById(R.id.status_output_icon));

    /* renamed from: e */
    public AppCompatImageView f1801e = ((AppCompatImageView) findViewById(R.id.status_input_icon));

    /* renamed from: f */
    public TextView f1802f = ((TextView) findViewById(R.id.status_output_text));

    /* renamed from: g */
    public TextView f1803g = ((TextView) findViewById(R.id.status_input_text));

    /* renamed from: h */
    public View f1804h = findViewById(R.id.status_output_loading_icon);

    /* renamed from: i */
    public View f1805i = findViewById(R.id.status_input_loading_icon);

    /* renamed from: j */
    public View f1806j = findViewById(R.id.status_view_top_background_container);

    public StatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_status_layout, this, true);
        setOutput(C1129so.DEFAULT);
        setInput(C1072ro.DEFAULT);
        mo2581a();
    }

    private void setInput(C1072ro roVar) {
        this.f1801e.setImageResource(roVar.f4039d);
        this.f1803g.setText(roVar.f4037b);
        this.f1801e.setAlpha(1.0f);
        this.f1803g.setAlpha(1.0f);
        this.f1805i.setVisibility(8);
    }

    private void setOutput(C1129so soVar) {
        this.f1800d.setImageResource(soVar.f4318e);
        this.f1802f.setText(soVar.f4315b);
        this.f1800d.setAlpha(1.0f);
        this.f1802f.setAlpha(1.0f);
        this.f1804h.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2581a() {
        this.f1801e.setAlpha(0.5f);
        this.f1803g.setAlpha(0.5f);
        this.f1800d.setAlpha(0.5f);
        this.f1802f.setAlpha(0.5f);
        this.f1805i.setVisibility(0);
        this.f1804h.setVisibility(0);
        mo2582b();
    }

    /* renamed from: b */
    public void mo2582b() {
        int i;
        View view;
        int i2 = getContext().getResources().getConfiguration().orientation;
        if (i2 == 1 || i2 == 0) {
            view = this.f1806j;
            i = R.drawable.status_view_background_top_sandwiched;
        } else {
            view = this.f1806j;
            i = R.drawable.status_view_background_top;
        }
        view.setBackgroundResource(i);
    }

    public void setStatus(C0788lo loVar) {
        setOutput(loVar.f3182a);
        setInput(loVar.f3183b);
        mo2582b();
    }
}
