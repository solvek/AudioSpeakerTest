package p000;

import android.content.DialogInterface;
import com.nordskog.LesserAudioSwitch.p002ui.GenericUnlockActivity;

/* renamed from: sq */
public final /* synthetic */ class C1131sq implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ GenericUnlockActivity f4322b;

    public /* synthetic */ C1131sq(GenericUnlockActivity genericUnlockActivity) {
        this.f4322b = genericUnlockActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4322b.finish();
    }
}
