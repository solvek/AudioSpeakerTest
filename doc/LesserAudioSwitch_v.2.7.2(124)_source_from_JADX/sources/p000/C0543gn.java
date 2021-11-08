package p000;

import android.content.BroadcastReceiver;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import p000.C0735ko;

/* renamed from: gn */
public final /* synthetic */ class C0543gn implements C0735ko.C0740e {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2338a;

    public /* synthetic */ C0543gn(BroadcastReceiver.PendingResult pendingResult) {
        this.f2338a = pendingResult;
    }

    /* renamed from: a */
    public final void mo2960a() {
        BroadcastReceiver.PendingResult pendingResult = this.f2338a;
        SoundBroadcastReceiver.C0339a aVar = SoundBroadcastReceiver.f1738a;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
