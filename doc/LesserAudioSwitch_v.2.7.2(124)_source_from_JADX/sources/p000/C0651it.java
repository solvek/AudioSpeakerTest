package p000;

import android.content.Intent;
import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.SettingsActivity;
import com.nordskog.LesserAudioSwitch.p002ui.auto.AutoActivity;

/* renamed from: it */
public final /* synthetic */ class C0651it implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AutoActivity f2768b;

    public /* synthetic */ C0651it(AutoActivity autoActivity) {
        this.f2768b = autoActivity;
    }

    public final void onClick(View view) {
        AutoActivity autoActivity = this.f2768b;
        autoActivity.getClass();
        autoActivity.startActivity(new Intent(autoActivity, SettingsActivity.class));
    }
}
