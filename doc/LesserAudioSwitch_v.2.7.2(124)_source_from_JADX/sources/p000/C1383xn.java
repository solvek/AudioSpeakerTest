package p000;

import android.content.Context;
import p000.C0735ko;

/* renamed from: xn */
public final /* synthetic */ class C1383xn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f5116b;

    /* renamed from: c */
    public final /* synthetic */ C1129so f5117c;

    /* renamed from: d */
    public final /* synthetic */ C0735ko.C0740e f5118d;

    public /* synthetic */ C1383xn(Context context, C1129so soVar, C0735ko.C0740e eVar) {
        this.f5116b = context;
        this.f5117c = soVar;
        this.f5118d = eVar;
    }

    public final void run() {
        Context context = this.f5116b;
        C1129so soVar = this.f5117c;
        C0735ko.C0740e eVar = this.f5118d;
        try {
            C0936oo.m2713y(context, soVar);
        } catch (Exception e) {
            C0279ch.m1110g(-35608257189036L, C0200av.m970a(-35578192417964L), e);
        }
        if (eVar != null) {
            eVar.mo2960a();
        }
    }
}
