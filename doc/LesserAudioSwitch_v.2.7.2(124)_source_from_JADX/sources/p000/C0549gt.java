package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.WidgetConfigActivity;

/* renamed from: gt */
public class C0549gt implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ WidgetConfigActivity f2416b;

    public C0549gt(WidgetConfigActivity widgetConfigActivity) {
        this.f2416b = widgetConfigActivity;
    }

    public void onClick(View view) {
        WidgetConfigActivity widgetConfigActivity = this.f2416b;
        widgetConfigActivity.mo2584u(view, !widgetConfigActivity.f1812q.contains(Integer.valueOf(view.getId())));
    }
}
