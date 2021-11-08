package p000;

import android.os.Handler;
import p000.C0796lu;

/* renamed from: bs */
public final /* synthetic */ class C0234bs implements C0796lu.C0797a {

    /* renamed from: a */
    public final /* synthetic */ C0235bt f1294a;

    /* renamed from: b */
    public final /* synthetic */ C1468zo f1295b;

    public /* synthetic */ C0234bs(C0235bt btVar, C1468zo zoVar) {
        this.f1294a = btVar;
        this.f1295b = zoVar;
    }

    /* renamed from: a */
    public final void mo1471a(Object obj) {
        Runnable runnable;
        C0235bt btVar = this.f1294a;
        C1468zo zoVar = this.f1295b;
        C0490fp fpVar = (C0490fp) obj;
        if (!btVar.f1305p0) {
            zoVar.f5348l.mo3649e();
            Handler handler = btVar.f1300k0;
            if (!(handler == null || (runnable = btVar.f1303n0) == null)) {
                handler.removeCallbacks(runnable);
                btVar.f1303n0 = null;
            }
            btVar.f1299j0 = false;
            btVar.f1298i0.setVisibility(8);
            int i = fpVar.f2179b;
            if (i == 0) {
                btVar.mo1611C0();
            } else if (i != 2) {
                btVar.mo1612D0(fpVar, false);
            }
        }
    }
}
