package p000;

import android.annotation.SuppressLint;
import android.view.View;
import p000.C0506g2;

/* renamed from: f2 */
public class C0451f2 extends C1039r2 {

    /* renamed from: k */
    public final /* synthetic */ C0506g2.C0510d f2087k;

    /* renamed from: l */
    public final /* synthetic */ C0506g2 f2088l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0451f2(C0506g2 g2Var, View view, C0506g2.C0510d dVar) {
        super(view);
        this.f2088l = g2Var;
        this.f2087k = dVar;
    }

    /* renamed from: b */
    public C0597i1 mo163b() {
        return this.f2087k;
    }

    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public boolean mo164c() {
        if (this.f2088l.getInternalPopup().mo2887a()) {
            return true;
        }
        this.f2088l.mo2861b();
        return true;
    }
}
