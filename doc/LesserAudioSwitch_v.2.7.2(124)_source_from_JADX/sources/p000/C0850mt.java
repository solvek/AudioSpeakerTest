package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.auto.AutoActivity;

/* renamed from: mt */
public class C0850mt implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AutoActivity f3324b;

    public C0850mt(AutoActivity autoActivity) {
        this.f3324b = autoActivity;
    }

    public void onClick(View view) {
        AutoActivity autoActivity = this.f3324b;
        if (autoActivity.f1817r && C0697ju.m2178a(autoActivity)) {
            C0550gu.m1820b("LAS AutoAct", "Auto config modified");
            C1426yp b = C1426yp.m3890b(this.f3324b);
            if (b.f5211c) {
                b.mo5222h();
                b.mo5219c();
            }
        }
        this.f3324b.finish();
    }
}
