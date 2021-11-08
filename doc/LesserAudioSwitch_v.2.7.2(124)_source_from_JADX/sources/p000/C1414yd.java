package p000;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;
import p000.C0821mb;
import p000.C1359xd;

/* renamed from: yd */
public final class C1414yd {

    /* renamed from: a */
    public final C1452zd f5186a;

    /* renamed from: b */
    public final C1359xd f5187b = new C1359xd();

    public C1414yd(C1452zd zdVar) {
        this.f5186a = zdVar;
    }

    /* renamed from: a */
    public void mo5208a(Bundle bundle) {
        C0821mb a = this.f5186a.mo124a();
        if (((C1011qb) a).f3809b == C0821mb.C0823b.INITIALIZED) {
            a.mo3678a(new Recreator(this.f5186a));
            C1359xd xdVar = this.f5187b;
            if (!xdVar.f5073c) {
                if (bundle != null) {
                    xdVar.f5072b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a.mo3678a(new SavedStateRegistry$1(xdVar));
                xdVar.f5073c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void mo5209b(Bundle bundle) {
        C1359xd xdVar = this.f5187b;
        xdVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = xdVar.f5072b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1141t3<K, V>.C0355d b = xdVar.f5071a.mo4602b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            bundle2.putBundle((String) entry.getKey(), ((C1359xd.C1361b) entry.getValue()).mo1463a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
