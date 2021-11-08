package p000;

import android.view.View;

/* renamed from: x */
public class C1330x extends C1156t8 {

    /* renamed from: a */
    public final /* synthetic */ C1079s f4990a;

    public C1330x(C1079s sVar) {
        this.f4990a = sVar;
    }

    /* renamed from: a */
    public void mo2606a(View view) {
        this.f4990a.f4091p.setAlpha(1.0f);
        this.f4990a.f4094s.mo4214d((C1102s8) null);
        this.f4990a.f4094s = null;
    }

    /* renamed from: b */
    public void mo3388b(View view) {
        this.f4990a.f4091p.setVisibility(0);
        this.f4990a.f4091p.sendAccessibilityEvent(32);
        if (this.f4990a.f4091p.getParent() instanceof View) {
            C0813m8.m2455D((View) this.f4990a.f4091p.getParent());
        }
    }
}
