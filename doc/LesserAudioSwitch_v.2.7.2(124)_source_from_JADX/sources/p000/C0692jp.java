package p000;

import android.content.Context;
import android.content.Intent;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;

/* renamed from: jp */
public final /* synthetic */ class C0692jp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1274vp f2925b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2926c;

    public /* synthetic */ C0692jp(C1274vp vpVar, boolean z) {
        this.f2925b = vpVar;
        this.f2926c = z;
    }

    public final void run() {
        C1274vp vpVar = this.f2925b;
        boolean z = this.f2926c;
        C1324wp wpVar = vpVar.f4839b;
        if (wpVar.f4984f == z || !wpVar.f4983e) {
            wpVar.f4984f = z;
            return;
        }
        wpVar.f4984f = z;
        if (!z) {
            Context context = wpVar.f4979a;
            SoundBroadcastReceiver.C0339a aVar = SoundBroadcastReceiver.f1738a;
            Intent intent = new Intent(context, SoundBroadcastReceiver.class);
            intent.setAction(C0200av.m970a(-90609608381612L));
            intent.putExtra(C0200av.m970a(-90815766811820L), true);
            context.sendBroadcast(intent);
        }
    }
}
