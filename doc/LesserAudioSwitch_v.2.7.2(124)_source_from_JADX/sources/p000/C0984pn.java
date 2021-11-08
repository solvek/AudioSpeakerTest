package p000;

import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: pn */
public final /* synthetic */ class C0984pn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0936oo f3709b;

    public /* synthetic */ C0984pn(C0936oo ooVar) {
        this.f3709b = ooVar;
    }

    public final void run() {
        Toast.makeText(this.f3709b.f3510a, R.string.warning_cast_not_enabled, 0).show();
    }
}
