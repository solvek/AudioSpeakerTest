package p000;

import android.content.Context;
import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: yt */
public final /* synthetic */ class C1432yt implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f5223b;

    public /* synthetic */ C1432yt(Context context) {
        this.f5223b = context;
    }

    public final void run() {
        Toast.makeText(this.f5223b, R.string.warning_threadpool_unresponsive_toast_primary, 1).show();
    }
}
