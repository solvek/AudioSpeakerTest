package p000;

import android.content.Context;
import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: pp */
public final /* synthetic */ class C0988pp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f3716b;

    public /* synthetic */ C0988pp(Context context) {
        this.f3716b = context;
    }

    public final void run() {
        Toast.makeText(this.f3716b, R.string.speaker_unexpectedly_unmuted_notification_warning_title, 1).show();
    }
}
