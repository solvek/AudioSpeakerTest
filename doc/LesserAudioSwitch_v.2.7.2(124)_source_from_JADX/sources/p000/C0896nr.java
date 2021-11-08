package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import com.nordskog.LesserAudioSwitch.p002ui.SpeakerStatusView;

/* renamed from: nr */
public final /* synthetic */ class C0896nr implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f3423b;

    /* renamed from: c */
    public final /* synthetic */ C1129so f3424c;

    public /* synthetic */ C0896nr(MainActivity mainActivity, C1129so soVar) {
        this.f3423b = mainActivity;
        this.f3424c = soVar;
    }

    public final void onClick(View view) {
        MainActivity mainActivity = this.f3423b;
        C1129so soVar = this.f3424c;
        mainActivity.f1776x.mo2581a();
        SpeakerStatusView speakerStatusView = mainActivity.f1777y;
        speakerStatusView.f1796d.setAlpha(0.5f);
        speakerStatusView.f1797e.setAlpha(0.5f);
        speakerStatusView.f1798f.setVisibility(0);
        speakerStatusView.mo2579a();
        mainActivity.mo2565y(soVar);
    }
}
