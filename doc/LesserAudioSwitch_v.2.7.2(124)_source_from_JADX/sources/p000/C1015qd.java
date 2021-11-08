package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000.C1254vc;

/* renamed from: qd */
public class C1015qd implements C1254vc.C1255a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3821a;

    public C1015qd(RecyclerView recyclerView) {
        this.f3821a = recyclerView;
    }

    /* renamed from: a */
    public void mo4078a(C1254vc.C1256b bVar) {
        int i = bVar.f4807a;
        if (i == 1) {
            RecyclerView recyclerView = this.f3821a;
            recyclerView.f970n.mo1026n0(recyclerView, bVar.f4808b, bVar.f4810d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f3821a;
            recyclerView2.f970n.mo1032q0(recyclerView2, bVar.f4808b, bVar.f4810d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f3821a;
            recyclerView3.f970n.mo1033s0(recyclerView3, bVar.f4808b, bVar.f4810d, bVar.f4809c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f3821a;
            recyclerView4.f970n.mo1031p0(recyclerView4, bVar.f4808b, bVar.f4810d, 1);
        }
    }

    /* renamed from: b */
    public RecyclerView.C0145a0 mo4079b(int i) {
        RecyclerView recyclerView = this.f3821a;
        int h = recyclerView.f954f.mo4987h();
        int i2 = 0;
        RecyclerView.C0145a0 a0Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.C0145a0 K = RecyclerView.m600K(recyclerView.f954f.mo4986g(i2));
            if (K != null && !K.mo1258m() && K.f998c == i) {
                if (!recyclerView.f954f.mo4990k(K.f996a)) {
                    a0Var = K;
                    break;
                }
                a0Var = K;
            }
            i2++;
        }
        if (a0Var != null && !this.f3821a.f954f.mo4990k(a0Var.f996a)) {
            return a0Var;
        }
        return null;
    }

    /* renamed from: c */
    public void mo4080c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3821a;
        int h = recyclerView.f954f.mo4987h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f954f.mo4986g(i6);
            RecyclerView.C0145a0 K = RecyclerView.m600K(g);
            if (K != null && !K.mo1267u() && (i4 = K.f998c) >= i && i4 < i5) {
                K.mo1247b(2);
                K.mo1246a(obj);
                ((RecyclerView.C0165n) g.getLayoutParams()).f1052c = true;
            }
        }
        RecyclerView.C0171s sVar = recyclerView.f948c;
        int size = sVar.f1062c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.C0145a0 a0Var = sVar.f1062c.get(size);
                if (a0Var != null && (i3 = a0Var.f998c) >= i && i3 < i5) {
                    a0Var.mo1247b(2);
                    sVar.mo1376g(size);
                }
            } else {
                this.f3821a.f967l0 = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo4081d(int i, int i2) {
        RecyclerView recyclerView = this.f3821a;
        int h = recyclerView.f954f.mo4987h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.C0145a0 K = RecyclerView.m600K(recyclerView.f954f.mo4986g(i3));
            if (K != null && !K.mo1267u() && K.f998c >= i) {
                K.mo1262q(i2, false);
                recyclerView.f959h0.f1090f = true;
            }
        }
        RecyclerView.C0171s sVar = recyclerView.f948c;
        int size = sVar.f1062c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.C0145a0 a0Var = sVar.f1062c.get(i4);
            if (a0Var != null && a0Var.f998c >= i) {
                a0Var.mo1262q(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f3821a.f965k0 = true;
    }

    /* renamed from: e */
    public void mo4082e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3821a;
        int h = recyclerView.f954f.mo4987h();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.C0145a0 K = RecyclerView.m600K(recyclerView.f954f.mo4986g(i11));
            if (K != null && (i9 = K.f998c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    K.mo1262q(i2 - i, false);
                } else {
                    K.mo1262q(i3, false);
                }
                recyclerView.f959h0.f1090f = true;
            }
        }
        RecyclerView.C0171s sVar = recyclerView.f948c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = sVar.f1062c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.C0145a0 a0Var = sVar.f1062c.get(i12);
            if (a0Var != null && (i8 = a0Var.f998c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    a0Var.mo1262q(i2 - i, false);
                } else {
                    a0Var.mo1262q(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3821a.f965k0 = true;
    }
}
