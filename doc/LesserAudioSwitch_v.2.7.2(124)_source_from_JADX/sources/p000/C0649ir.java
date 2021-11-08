package p000;

import android.os.Handler;
import android.os.Looper;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import p000.C0735ko;

/* renamed from: ir */
public final /* synthetic */ class C0649ir implements C0735ko.C0740e {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f2766a;

    public /* synthetic */ C0649ir(MainActivity mainActivity) {
        this.f2766a = mainActivity;
    }

    /* renamed from: a */
    public final void mo2960a() {
        MainActivity mainActivity = this.f2766a;
        mainActivity.getClass();
        new Handler(Looper.getMainLooper()).post(new C0435er(mainActivity));
    }
}
