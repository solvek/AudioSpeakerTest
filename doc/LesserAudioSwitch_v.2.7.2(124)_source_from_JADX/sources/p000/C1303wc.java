package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wc */
public class C1303wc {

    /* renamed from: a */
    public final C1305b f4945a;

    /* renamed from: b */
    public final C1304a f4946b = new C1304a();

    /* renamed from: c */
    public final List<View> f4947c = new ArrayList();

    /* renamed from: wc$a */
    public static class C1304a {

        /* renamed from: a */
        public long f4948a = 0;

        /* renamed from: b */
        public C1304a f4949b;

        /* renamed from: a */
        public void mo4993a(int i) {
            if (i >= 64) {
                C1304a aVar = this.f4949b;
                if (aVar != null) {
                    aVar.mo4993a(i - 64);
                    return;
                }
                return;
            }
            this.f4948a &= (1 << i) ^ -1;
        }

        /* renamed from: b */
        public int mo4994b(int i) {
            long j;
            C1304a aVar = this.f4949b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f4948a;
                }
                j = this.f4948a & ((1 << i) - 1);
            } else {
                if (i >= 64) {
                    return Long.bitCount(this.f4948a) + aVar.mo4994b(i - 64);
                }
                j = this.f4948a & ((1 << i) - 1);
            }
            return Long.bitCount(j);
        }

        /* renamed from: c */
        public final void mo4995c() {
            if (this.f4949b == null) {
                this.f4949b = new C1304a();
            }
        }

        /* renamed from: d */
        public boolean mo4996d(int i) {
            if (i < 64) {
                return (this.f4948a & (1 << i)) != 0;
            }
            mo4995c();
            return this.f4949b.mo4996d(i - 64);
        }

        /* renamed from: e */
        public void mo4997e(int i, boolean z) {
            if (i >= 64) {
                mo4995c();
                this.f4949b.mo4997e(i - 64, z);
                return;
            }
            long j = this.f4948a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4948a = ((j & (j2 ^ -1)) << 1) | (j & j2);
            if (z) {
                mo5000h(i);
            } else {
                mo4993a(i);
            }
            if (z2 || this.f4949b != null) {
                mo4995c();
                this.f4949b.mo4997e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo4998f(int i) {
            if (i >= 64) {
                mo4995c();
                return this.f4949b.mo4998f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4948a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f4948a = j3;
            long j4 = j - 1;
            this.f4948a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C1304a aVar = this.f4949b;
            if (aVar != null) {
                if (aVar.mo4996d(0)) {
                    mo5000h(63);
                }
                this.f4949b.mo4998f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo4999g() {
            this.f4948a = 0;
            C1304a aVar = this.f4949b;
            if (aVar != null) {
                aVar.mo4999g();
            }
        }

        /* renamed from: h */
        public void mo5000h(int i) {
            if (i >= 64) {
                mo4995c();
                this.f4949b.mo5000h(i - 64);
                return;
            }
            this.f4948a |= 1 << i;
        }

        public String toString() {
            if (this.f4949b == null) {
                return Long.toBinaryString(this.f4948a);
            }
            return this.f4949b.toString() + "xx" + Long.toBinaryString(this.f4948a);
        }
    }

    /* renamed from: wc$b */
    public interface C1305b {
    }

    public C1303wc(C1305b bVar) {
        this.f4945a = bVar;
    }

    /* renamed from: a */
    public void mo4980a(View view, int i, boolean z) {
        int b = i < 0 ? ((C0972pd) this.f4945a).mo4013b() : mo4985f(i);
        this.f4946b.mo4997e(b, z);
        if (z) {
            mo4988i(view);
        }
        C0972pd pdVar = (C0972pd) this.f4945a;
        pdVar.f3617a.addView(view, b);
        RecyclerView recyclerView = pdVar.f3617a;
        recyclerView.getClass();
        RecyclerView.m600K(view);
        recyclerView.mo1118T();
    }

    /* renamed from: b */
    public void mo4981b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b = i < 0 ? ((C0972pd) this.f4945a).mo4013b() : mo4985f(i);
        this.f4946b.mo4997e(b, z);
        if (z) {
            mo4988i(view);
        }
        C0972pd pdVar = (C0972pd) this.f4945a;
        pdVar.getClass();
        RecyclerView.C0145a0 K = RecyclerView.m600K(view);
        if (K != null) {
            if (K.mo1260o() || K.mo1267u()) {
                K.f1005j &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(C0279ch.m1116m(pdVar.f3617a, sb));
            }
        }
        pdVar.f3617a.attachViewToParent(view, b, layoutParams);
    }

    /* renamed from: c */
    public void mo4982c(int i) {
        RecyclerView.C0145a0 K;
        int f = mo4985f(i);
        this.f4946b.mo4998f(f);
        C0972pd pdVar = (C0972pd) this.f4945a;
        View childAt = pdVar.f3617a.getChildAt(f);
        if (!(childAt == null || (K = RecyclerView.m600K(childAt)) == null)) {
            if (!K.mo1260o() || K.mo1267u()) {
                K.mo1247b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(C0279ch.m1116m(pdVar.f3617a, sb));
            }
        }
        pdVar.f3617a.detachViewFromParent(f);
    }

    /* renamed from: d */
    public View mo4983d(int i) {
        return ((C0972pd) this.f4945a).mo4012a(mo4985f(i));
    }

    /* renamed from: e */
    public int mo4984e() {
        return ((C0972pd) this.f4945a).mo4013b() - this.f4947c.size();
    }

    /* renamed from: f */
    public final int mo4985f(int i) {
        if (i < 0) {
            return -1;
        }
        int b = ((C0972pd) this.f4945a).mo4013b();
        int i2 = i;
        while (i2 < b) {
            int b2 = i - (i2 - this.f4946b.mo4994b(i2));
            if (b2 == 0) {
                while (this.f4946b.mo4996d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* renamed from: g */
    public View mo4986g(int i) {
        return ((C0972pd) this.f4945a).f3617a.getChildAt(i);
    }

    /* renamed from: h */
    public int mo4987h() {
        return ((C0972pd) this.f4945a).mo4013b();
    }

    /* renamed from: i */
    public final void mo4988i(View view) {
        this.f4947c.add(view);
        C0972pd pdVar = (C0972pd) this.f4945a;
        pdVar.getClass();
        RecyclerView.C0145a0 K = RecyclerView.m600K(view);
        if (K != null) {
            RecyclerView recyclerView = pdVar.f3617a;
            int i = K.f1012q;
            if (i == -1) {
                i = C0813m8.m2477k(K.f996a);
            }
            K.f1011p = i;
            recyclerView.mo1181k0(K, 4);
        }
    }

    /* renamed from: j */
    public int mo4989j(View view) {
        int indexOfChild = ((C0972pd) this.f4945a).f3617a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f4946b.mo4996d(indexOfChild)) {
            return indexOfChild - this.f4946b.mo4994b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: k */
    public boolean mo4990k(View view) {
        return this.f4947c.contains(view);
    }

    /* renamed from: l */
    public final boolean mo4991l(View view) {
        if (!this.f4947c.remove(view)) {
            return false;
        }
        C0972pd pdVar = (C0972pd) this.f4945a;
        pdVar.getClass();
        RecyclerView.C0145a0 K = RecyclerView.m600K(view);
        if (K == null) {
            return true;
        }
        pdVar.f3617a.mo1181k0(K, K.f1011p);
        K.f1011p = 0;
        return true;
    }

    public String toString() {
        return this.f4946b.toString() + ", hidden list:" + this.f4947c.size();
    }
}
