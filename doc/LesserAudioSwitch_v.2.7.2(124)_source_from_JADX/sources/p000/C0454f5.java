package p000;

import java.util.ArrayList;

/* renamed from: f5 */
public class C0454f5 extends C1236v4 {

    /* renamed from: i0 */
    public ArrayList<C1236v4> f2096i0 = new ArrayList<>();

    /* renamed from: D */
    public void mo2762D() {
        int i = this.f4711I;
        int i2 = this.f4712J;
        this.f4715M = i;
        this.f4716N = i2;
        ArrayList<C1236v4> arrayList = this.f2096i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1236v4 v4Var = this.f2096i0.get(i3);
                v4Var.mo2766z(this.f4715M + this.f4717O, this.f4716N + this.f4718P);
                if (!(v4Var instanceof C1292w4)) {
                    v4Var.mo2762D();
                }
            }
        }
    }

    /* renamed from: F */
    public void mo2763F() {
        mo2762D();
        ArrayList<C1236v4> arrayList = this.f2096i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1236v4 v4Var = this.f2096i0.get(i);
                if (v4Var instanceof C0454f5) {
                    ((C0454f5) v4Var).mo2763F();
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2764r() {
        this.f2096i0.clear();
        super.mo2764r();
    }

    /* renamed from: t */
    public void mo2765t(C0857n4 n4Var) {
        super.mo2765t(n4Var);
        int size = this.f2096i0.size();
        for (int i = 0; i < size; i++) {
            this.f2096i0.get(i).mo2765t(n4Var);
        }
    }

    /* renamed from: z */
    public void mo2766z(int i, int i2) {
        this.f4717O = i;
        this.f4718P = i2;
        int size = this.f2096i0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f2096i0.get(i3).mo2766z(this.f4711I + this.f4717O, this.f4712J + this.f4718P);
        }
    }
}
