package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;

/* renamed from: fn */
public final /* synthetic */ class C0488fn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SoundBroadcastReceiver f2168b;

    /* renamed from: c */
    public final /* synthetic */ Context f2169c;

    /* renamed from: d */
    public final /* synthetic */ C0489fo f2170d;

    /* renamed from: e */
    public final /* synthetic */ boolean f2171e;

    /* renamed from: f */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2172f;

    public /* synthetic */ C0488fn(SoundBroadcastReceiver soundBroadcastReceiver, Context context, C0489fo foVar, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f2168b = soundBroadcastReceiver;
        this.f2169c = context;
        this.f2170d = foVar;
        this.f2171e = z;
        this.f2172f = pendingResult;
    }

    public final void run() {
        this.f2168b.mo2537m(this.f2169c, this.f2170d, this.f2171e, this.f2172f);
    }
}
