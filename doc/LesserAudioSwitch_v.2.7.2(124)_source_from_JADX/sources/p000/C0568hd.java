package p000;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: hd */
public final class C0568hd implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<C0568hd> f2454f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<C0571c> f2455g = new C0569a();

    /* renamed from: b */
    public ArrayList<RecyclerView> f2456b = new ArrayList<>();

    /* renamed from: c */
    public long f2457c;

    /* renamed from: d */
    public long f2458d;

    /* renamed from: e */
    public ArrayList<C0571c> f2459e = new ArrayList<>();

    /* renamed from: hd$a */
    public static class C0569a implements Comparator<C0571c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                hd$c r7 = (p000.C0568hd.C0571c) r7
                hd$c r8 = (p000.C0568hd.C0571c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2467d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2467d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.f2464a
                boolean r3 = r8.f2464a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.f2465b
                int r1 = r7.f2465b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.f2466c
                int r8 = r8.f2466c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0568hd.C0569a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: hd$b */
    public static class C0570b implements RecyclerView.C0160m.C0163c {

        /* renamed from: a */
        public int f2460a;

        /* renamed from: b */
        public int f2461b;

        /* renamed from: c */
        public int[] f2462c;

        /* renamed from: d */
        public int f2463d;

        /* renamed from: a */
        public void mo3077a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2463d * 2;
                int[] iArr = this.f2462c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2462c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f2462c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2462c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f2463d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* renamed from: b */
        public void mo3078b(RecyclerView recyclerView, boolean z) {
            this.f2463d = 0;
            int[] iArr = this.f2462c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0160m mVar = recyclerView.f970n;
            if (recyclerView.f968m != null && mVar != null && mVar.f1037k) {
                if (z) {
                    if (!recyclerView.f952e.mo4890g()) {
                        mVar.mo1068j(recyclerView.f968m.mo1273a(), this);
                    }
                } else if (!recyclerView.mo1111M()) {
                    mVar.mo1065i(this.f2460a, this.f2461b, recyclerView.f959h0, this);
                }
                int i = this.f2463d;
                if (i > mVar.f1038l) {
                    mVar.f1038l = i;
                    mVar.f1039m = z;
                    recyclerView.f948c.mo1382m();
                }
            }
        }

        /* renamed from: c */
        public boolean mo3079c(int i) {
            if (this.f2462c != null) {
                int i2 = this.f2463d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2462c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: hd$c */
    public static class C0571c {

        /* renamed from: a */
        public boolean f2464a;

        /* renamed from: b */
        public int f2465b;

        /* renamed from: c */
        public int f2466c;

        /* renamed from: d */
        public RecyclerView f2467d;

        /* renamed from: e */
        public int f2468e;
    }

    /* renamed from: a */
    public void mo3072a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2457c == 0) {
            this.f2457c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0570b bVar = recyclerView.f957g0;
        bVar.f2460a = i;
        bVar.f2461b = i2;
    }

    /* renamed from: b */
    public void mo3073b(long j) {
        C0571c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0571c cVar2;
        int size = this.f2456b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f2456b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f957g0.mo3078b(recyclerView3, false);
                i += recyclerView3.f957g0.f2463d;
            }
        }
        this.f2459e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f2456b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0570b bVar = recyclerView4.f957g0;
                int abs = Math.abs(bVar.f2461b) + Math.abs(bVar.f2460a);
                for (int i5 = 0; i5 < bVar.f2463d * 2; i5 += 2) {
                    if (i3 >= this.f2459e.size()) {
                        cVar2 = new C0571c();
                        this.f2459e.add(cVar2);
                    } else {
                        cVar2 = this.f2459e.get(i3);
                    }
                    int[] iArr = bVar.f2462c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f2464a = i6 <= abs;
                    cVar2.f2465b = abs;
                    cVar2.f2466c = i6;
                    cVar2.f2467d = recyclerView4;
                    cVar2.f2468e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2459e, f2455g);
        for (int i7 = 0; i7 < this.f2459e.size() && (recyclerView = cVar.f2467d) != null; i7++) {
            RecyclerView.C0145a0 c = mo3074c(recyclerView, (cVar = this.f2459e.get(i7)).f2468e, cVar.f2464a ? Long.MAX_VALUE : j);
            if (!(c == null || c.f997b == null || !c.mo1255j() || c.mo1256k() || (recyclerView2 = (RecyclerView) c.f997b.get()) == null)) {
                if (recyclerView2.f925D && recyclerView2.f954f.mo4987h() != 0) {
                    recyclerView2.mo1146e0();
                }
                C0570b bVar2 = recyclerView2.f957g0;
                bVar2.mo3078b(recyclerView2, true);
                if (bVar2.f2463d != 0) {
                    try {
                        C0559h7.m1850a("RV Nested Prefetch");
                        RecyclerView.C0179x xVar = recyclerView2.f959h0;
                        RecyclerView.C0149e eVar = recyclerView2.f968m;
                        xVar.f1088d = 1;
                        xVar.f1089e = eVar.mo1273a();
                        xVar.f1091g = false;
                        xVar.f1092h = false;
                        xVar.f1093i = false;
                        for (int i8 = 0; i8 < bVar2.f2463d * 2; i8 += 2) {
                            mo3074c(recyclerView2, bVar2.f2462c[i8], j);
                        }
                    } finally {
                        C0559h7.m1851b();
                    }
                }
            }
            cVar.f2464a = false;
            cVar.f2465b = 0;
            cVar.f2466c = 0;
            cVar.f2467d = null;
            cVar.f2468e = 0;
        }
    }

    /* renamed from: c */
    public final RecyclerView.C0145a0 mo3074c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f954f.mo4987h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.C0145a0 K = RecyclerView.m600K(recyclerView.f954f.mo4986g(i2));
            if (K.f998c == i && !K.mo1256k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0171s sVar = recyclerView.f948c;
        try {
            recyclerView.mo1120V();
            RecyclerView.C0145a0 k = sVar.mo1380k(i, false, j);
            if (k != null) {
                if (!k.mo1255j() || k.mo1256k()) {
                    sVar.mo1370a(k, false);
                } else {
                    sVar.mo1377h(k.f996a);
                }
            }
            return k;
        } finally {
            recyclerView.mo1121W(false);
        }
    }

    public void run() {
        try {
            C0559h7.m1850a("RV Prefetch");
            if (!this.f2456b.isEmpty()) {
                int size = this.f2456b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2456b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo3073b(TimeUnit.MILLISECONDS.toNanos(j) + this.f2458d);
                    this.f2457c = 0;
                    C0559h7.m1851b();
                }
            }
        } finally {
            this.f2457c = 0;
            C0559h7.m1851b();
        }
    }
}
