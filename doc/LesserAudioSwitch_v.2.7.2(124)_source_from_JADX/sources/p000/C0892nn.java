package p000;

import android.widget.Toast;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: nn */
public final /* synthetic */ class C0892nn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0936oo f3418b;

    public /* synthetic */ C0892nn(C0936oo ooVar) {
        this.f3418b = ooVar;
    }

    public final void run() {
        Toast.makeText(this.f3418b.f3510a, R.string.warning_usb_not_enabled, 0).show();
    }
}
