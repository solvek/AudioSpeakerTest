package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.SpeakerStatusView */
public class SpeakerStatusView extends BoundedLinearLayout {

    /* renamed from: d */
    public AppCompatImageView f1796d = ((AppCompatImageView) findViewById(R.id.status_speaker_mute_icon));

    /* renamed from: e */
    public TextView f1797e = ((TextView) findViewById(R.id.status_speaker_mute_text));

    /* renamed from: f */
    public View f1798f = findViewById(R.id.status_speaker_loading_icon);

    /* renamed from: g */
    public View f1799g = findViewById(R.id.status_view_bottom_background_container);

    public SpeakerStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_status_speaker_layout, this, true);
        setStatus(true);
        this.f1796d.setAlpha(0.5f);
        this.f1797e.setAlpha(0.5f);
        this.f1798f.setVisibility(0);
        mo2579a();
        mo2579a();
    }

    private void setStatus(boolean z) {
        this.f1796d.setImageResource((z ? C1129so.SPEAKER : C1129so.MUTE).f4318e);
        this.f1797e.setText(z ? R.string.speaker_mute_status_not_muted : R.string.speaker_mute_status_muted);
        this.f1796d.setAlpha(1.0f);
        this.f1797e.setAlpha(1.0f);
        this.f1798f.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2579a() {
        int i;
        View view;
        int i2 = getContext().getResources().getConfiguration().orientation;
        setVisibility(0);
        if (i2 == 1 || i2 == 0) {
            view = this.f1799g;
            i = R.drawable.status_view_background_outline_sandwiched;
        } else {
            view = this.f1799g;
            i = R.drawable.status_view_background_outline;
        }
        view.setBackgroundResource(i);
    }

    public void setStatus(C0788lo loVar) {
        setStatus(loVar.f3184c);
        mo2579a();
    }
}
