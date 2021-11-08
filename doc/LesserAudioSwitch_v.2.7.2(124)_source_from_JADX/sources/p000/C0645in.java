package p000;

import android.content.BroadcastReceiver;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import p000.C0735ko;

/* renamed from: in */
public final /* synthetic */ class C0645in implements C0735ko.C0740e {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2760a;

    public /* synthetic */ C0645in(BroadcastReceiver.PendingResult pendingResult) {
        this.f2760a = pendingResult;
    }

    /* renamed from: a */
    public final void mo2960a() {
        BroadcastReceiver.PendingResult pendingResult = this.f2760a;
        SoundBroadcastReceiver.C0339a aVar = SoundBroadcastReceiver.f1738a;
        pendingResult.finish();
    }
}
