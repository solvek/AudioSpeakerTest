package p000;

import android.content.DialogInterface;

/* renamed from: nt */
public final /* synthetic */ class C0898nt implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Runnable f3426b;

    public /* synthetic */ C0898nt(Runnable runnable) {
        this.f3426b = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Runnable runnable = this.f3426b;
        dialogInterface.dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }
}
