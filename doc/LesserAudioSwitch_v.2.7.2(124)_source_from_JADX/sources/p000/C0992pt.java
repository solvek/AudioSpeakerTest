package p000;

import android.content.DialogInterface;

/* renamed from: pt */
public final /* synthetic */ class C0992pt implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Runnable f3721b;

    public /* synthetic */ C0992pt(Runnable runnable) {
        this.f3721b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable = this.f3721b;
        dialogInterface.dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }
}
