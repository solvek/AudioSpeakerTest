package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: fj */
public final class C0473fj<S> extends C1314wj<S> {

    /* renamed from: e0 */
    public static final /* synthetic */ int f2133e0 = 0;

    /* renamed from: U */
    public int f2134U;

    /* renamed from: V */
    public C0281cj<S> f2135V;

    /* renamed from: W */
    public C1459zi f2136W;

    /* renamed from: X */
    public C1064rj f2137X;

    /* renamed from: Y */
    public C0478e f2138Y;

    /* renamed from: Z */
    public C0224bj f2139Z;

    /* renamed from: a0 */
    public RecyclerView f2140a0;

    /* renamed from: b0 */
    public RecyclerView f2141b0;

    /* renamed from: c0 */
    public View f2142c0;

    /* renamed from: d0 */
    public View f2143d0;

    /* renamed from: fj$a */
    public class C0474a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f2144b;

        public C0474a(int i) {
            this.f2144b = i;
        }

        public void run() {
            RecyclerView.C0160m mVar;
            RecyclerView recyclerView = C0473fj.this.f2141b0;
            int i = this.f2144b;
            if (!recyclerView.f992y && (mVar = recyclerView.f970n) != null) {
                mVar.mo1050V0(recyclerView, recyclerView.f959h0, i);
            }
        }
    }

    /* renamed from: fj$b */
    public class C0475b extends C1444z7 {
        public C0475b(C0473fj fjVar) {
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
            x8Var.mo5063i((Object) null);
        }
    }

    /* renamed from: fj$c */
    public class C0476c extends C1372xj {

        /* renamed from: G */
        public final /* synthetic */ int f2146G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0476c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f2146G = i2;
        }

        /* renamed from: Y0 */
        public void mo1051Y0(RecyclerView.C0179x xVar, int[] iArr) {
            if (this.f2146G == 0) {
                iArr[0] = C0473fj.this.f2141b0.getWidth();
                iArr[1] = C0473fj.this.f2141b0.getWidth();
                return;
            }
            iArr[0] = C0473fj.this.f2141b0.getHeight();
            iArr[1] = C0473fj.this.f2141b0.getHeight();
        }
    }

    /* renamed from: fj$d */
    public class C0477d implements C0479f {
        public C0477d() {
        }
    }

    /* renamed from: fj$e */
    public enum C0478e {
        DAY,
        YEAR
    }

    /* renamed from: fj$f */
    public interface C0479f {
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        if (bundle == null) {
            bundle = this.f698f;
        }
        this.f2134U = bundle.getInt("THEME_RES_ID_KEY");
        this.f2135V = (C0281cj) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f2136W = (C1459zi) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f2137X = (C1064rj) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x013b, code lost:
        r13 = new p000.C0724kd();
        r0 = r10.f2141b0;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo837O(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.mo868l()
            int r1 = r10.f2134U
            r13.<init>(r0, r1)
            bj r0 = new bj
            r0.<init>(r13)
            r10.f2139Z = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            zi r0 = r10.f2136W
            rj r0 = r0.f5315b
            boolean r1 = p000.C0885nj.m2605C0(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0027
            r1 = 2131427410(0x7f0b0052, float:1.8476435E38)
            r9 = 1
            goto L_0x002b
        L_0x0027:
            r1 = 2131427405(0x7f0b004d, float:1.8476425E38)
            r9 = 0
        L_0x002b:
            android.view.View r11 = r11.inflate(r1, r12, r3)
            r12 = 2131230937(0x7f0800d9, float:1.807794E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            fj$b r1 = new fj$b
            r1.<init>(r10)
            p000.C0813m8.m2457F(r12, r1)
            ej r1 = new ej
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f3970f
            r12.setNumColumns(r0)
            r12.setEnabled(r3)
            r12 = 2131230940(0x7f0800dc, float:1.8077947E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f2141b0 = r12
            fj$c r12 = new fj$c
            android.content.Context r6 = r10.mo868l()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2141b0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f2141b0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            uj r12 = new uj
            cj<S> r0 = r10.f2135V
            zi r1 = r10.f2136W
            fj$d r4 = new fj$d
            r4.<init>()
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2141b0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131296270(0x7f09000e, float:1.8210452E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131230943(0x7f0800df, float:1.8077953E38)
            android.view.View r4 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f2140a0 = r4
            if (r4 == 0) goto L_0x00c0
            r4.setHasFixedSize(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f2140a0
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>((android.content.Context) r13, (int) r0, (int) r2, (boolean) r3)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2140a0
            bk r2 = new bk
            r2.<init>(r10)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2140a0
            gj r2 = new gj
            r2.<init>(r10)
            r0.mo1150g(r2)
        L_0x00c0:
            r0 = 2131230932(0x7f0800d4, float:1.807793E38)
            android.view.View r2 = r11.findViewById(r0)
            if (r2 == 0) goto L_0x0135
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            hj r2 = new hj
            r2.<init>(r10)
            p000.C0813m8.m2457F(r0, r2)
            r2 = 2131230934(0x7f0800d6, float:1.8077935E38)
            android.view.View r2 = r11.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r3 = "NAVIGATION_PREV_TAG"
            r2.setTag(r3)
            r3 = 2131230933(0x7f0800d5, float:1.8077933E38)
            android.view.View r3 = r11.findViewById(r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            java.lang.String r4 = "NAVIGATION_NEXT_TAG"
            r3.setTag(r4)
            android.view.View r1 = r11.findViewById(r1)
            r10.f2142c0 = r1
            r1 = 2131230936(0x7f0800d8, float:1.8077939E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f2143d0 = r1
            fj$e r1 = p000.C0473fj.C0478e.DAY
            r10.mo2795z0(r1)
            rj r1 = r10.f2137X
            java.lang.String r1 = r1.f3967c
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f2141b0
            ij r4 = new ij
            r4.<init>(r10, r12, r0)
            r1.mo1172h(r4)
            jj r1 = new jj
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            kj r0 = new kj
            r0.<init>(r10, r12)
            r3.setOnClickListener(r0)
            lj r0 = new lj
            r0.<init>(r10, r12)
            r2.setOnClickListener(r0)
        L_0x0135:
            boolean r13 = p000.C0885nj.m2605C0(r13)
            if (r13 != 0) goto L_0x018c
            kd r13 = new kd
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2141b0
            androidx.recyclerview.widget.RecyclerView r1 = r13.f4428a
            if (r1 != r0) goto L_0x0147
            goto L_0x018c
        L_0x0147:
            if (r1 == 0) goto L_0x0158
            androidx.recyclerview.widget.RecyclerView$q r2 = r13.f4430c
            java.util.List<androidx.recyclerview.widget.RecyclerView$q> r1 = r1.f963j0
            if (r1 == 0) goto L_0x0152
            r1.remove(r2)
        L_0x0152:
            androidx.recyclerview.widget.RecyclerView r1 = r13.f4428a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x0158:
            r13.f4428a = r0
            if (r0 == 0) goto L_0x018c
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x0184
            androidx.recyclerview.widget.RecyclerView r0 = r13.f4428a
            androidx.recyclerview.widget.RecyclerView$q r1 = r13.f4430c
            r0.mo1172h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f4428a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.f4428a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.f4429b = r0
            r13.mo4642c()
            goto L_0x018c
        L_0x0184:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x018c:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f2141b0
            rj r0 = r10.f2137X
            int r12 = r12.mo4779h(r0)
            r13.mo1180j0(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0473fj.mo837O(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2134U);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f2135V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2136W);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2137X);
    }

    /* renamed from: w0 */
    public LinearLayoutManager mo2792w0() {
        return (LinearLayoutManager) this.f2141b0.getLayoutManager();
    }

    /* renamed from: x0 */
    public final void mo2793x0(int i) {
        this.f2141b0.post(new C0474a(i));
    }

    /* renamed from: y0 */
    public void mo2794y0(C1064rj rjVar) {
        RecyclerView recyclerView;
        int i;
        C1213uj ujVar = (C1213uj) this.f2141b0.getAdapter();
        int p = ujVar.f4629c.f5315b.mo4265p(rjVar);
        int h = p - ujVar.mo4779h(this.f2137X);
        boolean z = true;
        boolean z2 = Math.abs(h) > 3;
        if (h <= 0) {
            z = false;
        }
        this.f2137X = rjVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f2141b0;
                i = p + 3;
            }
            mo2793x0(p);
        }
        recyclerView = this.f2141b0;
        i = p - 3;
        recyclerView.mo1180j0(i);
        mo2793x0(p);
    }

    /* renamed from: z0 */
    public void mo2795z0(C0478e eVar) {
        this.f2138Y = eVar;
        if (eVar == C0478e.YEAR) {
            this.f2140a0.getLayoutManager().mo1047L0(((C0225bk) this.f2140a0.getAdapter()).mo1604g(this.f2137X.f3969e));
            this.f2142c0.setVisibility(0);
            this.f2143d0.setVisibility(8);
        } else if (eVar == C0478e.DAY) {
            this.f2142c0.setVisibility(8);
            this.f2143d0.setVisibility(0);
            mo2794y0(this.f2137X);
        }
    }
}
