package p000;

import p000.C0277cg;
import p000.C1468zo;

/* renamed from: yg */
public final class C1417yg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5193b;

    /* renamed from: c */
    public final /* synthetic */ String f5194c;

    /* renamed from: d */
    public final /* synthetic */ C1364xg f5195d;

    public C1417yg(C1364xg xgVar, int i, String str) {
        this.f5195d = xgVar;
        this.f5193b = i;
        this.f5194c = str;
    }

    public final void run() {
        C1363xf xfVar = this.f5195d.f5077b;
        C0277cg.C0278a a = C0277cg.m1102a();
        a.f1386a = this.f5193b;
        a.f1387b = this.f5194c;
        ((C1468zo.C1470b) xfVar).mo5316a(a.mo1764a());
    }
}
