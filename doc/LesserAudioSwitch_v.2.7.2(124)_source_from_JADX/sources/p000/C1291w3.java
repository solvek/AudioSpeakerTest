package p000;

import android.content.res.ColorStateList;
import android.graphics.Rect;

/* renamed from: w3 */
public class C1291w3 implements C1440z3 {
    /* renamed from: a */
    public float mo4945a(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: b */
    public float mo4946b(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: c */
    public void mo4947c(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: d */
    public void mo4948d(C1397y3 y3Var, ColorStateList colorStateList) {
        throw null;
    }

    /* renamed from: e */
    public float mo4949e(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: f */
    public float mo4950f(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: g */
    public float mo4951g(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: h */
    public void mo4952h(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: i */
    public ColorStateList mo4953i(C1397y3 y3Var) {
        throw null;
    }

    /* renamed from: j */
    public void mo4954j(C1397y3 y3Var, float f) {
        throw null;
    }

    /* renamed from: k */
    public void mo4955k(C1397y3 y3Var, float f) {
        C0007a4 n = mo4957n(y3Var);
        boolean a = y3Var.mo5179a();
        boolean d = y3Var.mo5182d();
        if (f != n.f22b || n.f23c != a || n.f24d != d) {
            n.f22b = f;
            n.f23c = a;
            n.f24d = d;
            n.mo31b((Rect) null);
            throw null;
        } else if (!y3Var.mo5179a()) {
            y3Var.mo5180b(0, 0, 0, 0);
        } else {
            float f2 = mo4957n(y3Var).f22b;
            float f3 = mo4957n(y3Var).f21a;
            int ceil = (int) Math.ceil((double) C0208b4.m994a(f2, f3, y3Var.mo5182d()));
            int ceil2 = (int) Math.ceil((double) C0208b4.m995b(f2, f3, y3Var.mo5182d()));
            y3Var.mo5180b(ceil, ceil2, ceil, ceil2);
        }
    }

    /* renamed from: l */
    public void mo4810l() {
    }

    /* renamed from: m */
    public void mo4956m(C1397y3 y3Var, float f) {
        throw null;
    }

    /* renamed from: n */
    public final C0007a4 mo4957n(C1397y3 y3Var) {
        return (C0007a4) y3Var.mo5181c();
    }
}
