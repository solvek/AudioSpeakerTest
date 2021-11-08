package p000;

import p000.C0936oo;

/* renamed from: un */
public final /* synthetic */ class C1221un implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0544go[] f4674b;

    /* renamed from: c */
    public final /* synthetic */ C0936oo.C0937a f4675c;

    public /* synthetic */ C1221un(C0544go[] goVarArr, C0936oo.C0937a aVar) {
        this.f4674b = goVarArr;
        this.f4675c = aVar;
    }

    public final void run() {
        C0544go[] goVarArr = this.f4674b;
        C0936oo.C0937a aVar = this.f4675c;
        C0985po[] poVarArr = new C0985po[0];
        try {
            poVarArr = C0936oo.m2704j(goVarArr);
        } catch (Exception e) {
            C0200av.m970a(-34813688239276L);
            C0200av.m970a(-34843753010348L);
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo3807a(poVarArr);
        }
    }
}
