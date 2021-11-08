package p000;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p000.C0500g0;

@SuppressLint({"RestrictedAPI"})
/* renamed from: i0 */
public class C0595i0 extends C0500g0 {

    /* renamed from: o */
    public C0596a f2509o;

    /* renamed from: p */
    public boolean f2510p;

    /* renamed from: i0$a */
    public static class C0596a extends C0500g0.C0503c {

        /* renamed from: J */
        public int[][] f2511J;

        public C0596a(C0596a aVar, C0595i0 i0Var, Resources resources) {
            super(aVar, i0Var, resources);
            if (aVar != null) {
                this.f2511J = aVar.f2511J;
            } else {
                this.f2511J = new int[this.f2215g.length][];
            }
        }

        /* renamed from: e */
        public void mo2754e() {
            int[][] iArr = this.f2511J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f2511J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f2511J = iArr2;
        }

        /* renamed from: g */
        public int mo3107g(int[] iArr) {
            int[][] iArr2 = this.f2511J;
            int i = this.f2216h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0595i0(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0595i0(this, resources);
        }
    }

    public C0595i0(C0596a aVar) {
    }

    public C0595i0(C0596a aVar, Resources resources) {
        mo2745e(new C0596a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: e */
    public void mo2745e(C0500g0.C0503c cVar) {
        this.f2186b = cVar;
        int i = this.f2192h;
        if (i >= 0) {
            Drawable d = cVar.mo2857d(i);
            this.f2188d = d;
            if (d != null) {
                mo2818c(d);
            }
        }
        this.f2189e = null;
        if (cVar instanceof C0596a) {
            this.f2509o = (C0596a) cVar;
        }
    }

    /* renamed from: f */
    public C0596a mo2744b() {
        return new C0596a(this.f2509o, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f2510p) {
            super.mutate();
            if (this == this) {
                this.f2509o.mo2754e();
                this.f2510p = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g = this.f2509o.mo3107g(iArr);
        if (g < 0) {
            g = this.f2509o.mo3107g(StateSet.WILD_CARD);
        }
        return mo2820d(g) || onStateChange;
    }
}
