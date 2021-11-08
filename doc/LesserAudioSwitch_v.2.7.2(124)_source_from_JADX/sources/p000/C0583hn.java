package p000;

import android.content.BroadcastReceiver;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import p000.C0735ko;

/* renamed from: hn */
public final /* synthetic */ class C0583hn implements C0735ko.C0740e {

    /* renamed from: a */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2488a;

    public /* synthetic */ C0583hn(BroadcastReceiver.PendingResult pendingResult) {
        this.f2488a = pendingResult;
    }

    /* renamed from: a */
    public final void mo2960a() {
        BroadcastReceiver.PendingResult pendingResult = this.f2488a;
        SoundBroadcastReceiver.C0339a aVar = SoundBroadcastReceiver.f1738a;
        pendingResult.finish();
    }
}
