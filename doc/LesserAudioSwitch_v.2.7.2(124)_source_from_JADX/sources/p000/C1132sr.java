package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: sr */
public final /* synthetic */ class C1132sr implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f4323b;

    public /* synthetic */ C1132sr(MainActivity mainActivity) {
        this.f4323b = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity mainActivity = this.f4323b;
        mainActivity.getClass();
        C0728kh.m2289e(mainActivity, R.string.mute_unmute_help_title, R.string.mute_unmute_help_content, R.string.button_understood);
    }
}
