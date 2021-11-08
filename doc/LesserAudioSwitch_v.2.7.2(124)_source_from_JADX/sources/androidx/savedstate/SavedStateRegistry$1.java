package androidx.savedstate;

import p000.C0821mb;

public class SavedStateRegistry$1 implements C0868nb {

    /* renamed from: a */
    public final /* synthetic */ C1359xd f1162a;

    public SavedStateRegistry$1(C1359xd xdVar) {
        this.f1162a = xdVar;
    }

    /* renamed from: g */
    public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
        C1359xd xdVar;
        boolean z;
        if (aVar == C0821mb.C0822a.ON_START) {
            xdVar = this.f1162a;
            z = true;
        } else if (aVar == C0821mb.C0822a.ON_STOP) {
            xdVar = this.f1162a;
            z = false;
        } else {
            return;
        }
        xdVar.f5075e = z;
    }
}
