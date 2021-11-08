package p000;

import android.content.Context;
import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: au */
public final /* synthetic */ class C0199au implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f1171b;

    public /* synthetic */ C0199au(Context context) {
        this.f1171b = context;
    }

    public final void run() {
        Toast.makeText(this.f1171b, R.string.warning_threadpool_unresponsive_toast_secondary, 1).show();
    }
}
