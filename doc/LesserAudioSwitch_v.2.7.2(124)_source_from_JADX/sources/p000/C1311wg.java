package p000;

import com.android.billingclient.api.SkuDetails;
import p000.C0277cg;

/* renamed from: wg */
public final class C1311wg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SkuDetails.C0289a f4958b;

    /* renamed from: c */
    public final /* synthetic */ C1168tg f4959c;

    public C1311wg(C1168tg tgVar, SkuDetails.C0289a aVar) {
        this.f4959c = tgVar;
        this.f4958b = aVar;
    }

    public final void run() {
        C0422eg egVar = this.f4959c.f4438c;
        C0277cg.C0278a a = C0277cg.m1102a();
        SkuDetails.C0289a aVar = this.f4958b;
        a.f1386a = aVar.f1416b;
        a.f1387b = aVar.f1417c;
        ((C1468zo) egVar).mo5311h(a.mo1764a(), this.f4958b.f1415a);
    }
}
