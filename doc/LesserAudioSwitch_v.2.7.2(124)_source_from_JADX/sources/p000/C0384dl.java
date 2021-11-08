package p000;

import android.graphics.Typeface;

/* renamed from: dl */
public final class C0384dl extends C0541gl {

    /* renamed from: a */
    public final Typeface f1906a;

    /* renamed from: b */
    public final C0385a f1907b;

    /* renamed from: c */
    public boolean f1908c;

    /* renamed from: dl$a */
    public interface C0385a {
    }

    public C0384dl(C0385a aVar, Typeface typeface) {
        this.f1906a = typeface;
        this.f1907b = aVar;
    }

    /* renamed from: a */
    public void mo2140a(int i) {
        mo2668c(this.f1906a);
    }

    /* renamed from: b */
    public void mo2141b(Typeface typeface, boolean z) {
        mo2668c(typeface);
    }

    /* renamed from: c */
    public final void mo2668c(Typeface typeface) {
        if (!this.f1908c) {
            C0981pk pkVar = ((C0932ok) this.f1907b).f3503a;
            C0384dl dlVar = pkVar.f3703v;
            boolean z = true;
            if (dlVar != null) {
                dlVar.f1908c = true;
            }
            if (pkVar.f3700s != typeface) {
                pkVar.f3700s = typeface;
            } else {
                z = false;
            }
            if (z) {
                pkVar.mo4036k();
            }
        }
    }
}
