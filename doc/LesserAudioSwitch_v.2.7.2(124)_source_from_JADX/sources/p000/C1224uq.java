package p000;

import android.content.Context;
import android.content.DialogInterface;
import p000.C0735ko;

/* renamed from: uq */
public final /* synthetic */ class C1224uq implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Context f4680b;

    /* renamed from: c */
    public final /* synthetic */ boolean f4681c;

    public /* synthetic */ C1224uq(Context context, boolean z) {
        this.f4680b = context;
        this.f4681c = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1129so soVar;
        Context context = this.f4680b;
        if (C0697ju.f2936d.mo3309a(context, false) != this.f4681c && C0697ju.m2193p(context) == (soVar = C1129so.HEADPHONES)) {
            C0936oo.m2711v(context, soVar, (C0735ko.C0740e) null);
        }
    }
}
