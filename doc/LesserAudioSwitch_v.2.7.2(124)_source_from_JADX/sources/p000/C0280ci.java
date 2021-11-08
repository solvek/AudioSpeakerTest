package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ci */
public class C0280ci<V extends View> extends CoordinatorLayout.C0088c<V> {

    /* renamed from: a */
    public C0380di f1388a;

    /* renamed from: b */
    public int f1389b = 0;

    public C0280ci() {
    }

    public C0280ci(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    public int mo1765B() {
        C0380di diVar = this.f1388a;
        if (diVar != null) {
            return diVar.f1899d;
        }
        return 0;
    }

    /* renamed from: C */
    public void mo1602C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo679r(v, i);
    }

    /* renamed from: D */
    public boolean mo1766D(int i) {
        C0380di diVar = this.f1388a;
        if (diVar == null) {
            this.f1389b = i;
            return false;
        } else if (diVar.f1899d == i) {
            return false;
        } else {
            diVar.f1899d = i;
            diVar.mo2660a();
            return true;
        }
    }

    /* renamed from: k */
    public boolean mo707k(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo1602C(coordinatorLayout, v, i);
        if (this.f1388a == null) {
            this.f1388a = new C0380di(v);
        }
        C0380di diVar = this.f1388a;
        diVar.f1897b = diVar.f1896a.getTop();
        diVar.f1898c = diVar.f1896a.getLeft();
        this.f1388a.mo2660a();
        int i2 = this.f1389b;
        if (i2 == 0) {
            return true;
        }
        C0380di diVar2 = this.f1388a;
        if (diVar2.f1899d != i2) {
            diVar2.f1899d = i2;
            diVar2.mo2660a();
        }
        this.f1389b = 0;
        return true;
    }
}
