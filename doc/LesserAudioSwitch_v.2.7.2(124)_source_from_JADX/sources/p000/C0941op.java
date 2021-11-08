package p000;

import android.content.Context;
import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: op */
public final /* synthetic */ class C0941op implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f3512b;

    public /* synthetic */ C0941op(Context context) {
        this.f3512b = context;
    }

    public final void run() {
        Toast.makeText(this.f3512b, R.string.speaker_unexpectedly_unmuted_notification_warning_content, 1).show();
    }
}
