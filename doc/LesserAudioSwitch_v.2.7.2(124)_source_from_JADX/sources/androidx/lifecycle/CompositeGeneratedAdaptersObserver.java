package androidx.lifecycle;

import p000.C0821mb;

public class CompositeGeneratedAdaptersObserver implements C0868nb {

    /* renamed from: a */
    public final C0768lb[] f730a;

    public CompositeGeneratedAdaptersObserver(C0768lb[] lbVarArr) {
        this.f730a = lbVarArr;
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        C1162tb tbVar = new C1162tb();
        for (C0768lb a : this.f730a) {
            a.mo3621a(pbVar, aVar, false, tbVar);
        }
        for (C0768lb a2 : this.f730a) {
            a2.mo3621a(pbVar, aVar, true, tbVar);
        }
    }
}
