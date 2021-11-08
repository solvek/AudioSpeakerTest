package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r0 */
public class C1036r0 {

    /* renamed from: a */
    public final ArrayList<C1049r8> f3881a = new ArrayList<>();

    /* renamed from: b */
    public long f3882b = -1;

    /* renamed from: c */
    public Interpolator f3883c;

    /* renamed from: d */
    public C1102s8 f3884d;

    /* renamed from: e */
    public boolean f3885e;

    /* renamed from: f */
    public final C1156t8 f3886f = new C1037a();

    /* renamed from: r0$a */
    public class C1037a extends C1156t8 {

        /* renamed from: a */
        public boolean f3887a = false;

        /* renamed from: b */
        public int f3888b = 0;

        public C1037a() {
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            int i = this.f3888b + 1;
            this.f3888b = i;
            if (i == C1036r0.this.f3881a.size()) {
                C1102s8 s8Var = C1036r0.this.f3884d;
                if (s8Var != null) {
                    s8Var.mo2606a((View) null);
                }
                this.f3888b = 0;
                this.f3887a = false;
                C1036r0.this.f3885e = false;
            }
        }

        /* renamed from: b */
        public void mo3388b(View view) {
            if (!this.f3887a) {
                this.f3887a = true;
                C1102s8 s8Var = C1036r0.this.f3884d;
                if (s8Var != null) {
                    s8Var.mo3388b((View) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4165a() {
        if (this.f3885e) {
            Iterator<C1049r8> it = this.f3881a.iterator();
            while (it.hasNext()) {
                it.next().mo4212b();
            }
            this.f3885e = false;
        }
    }

    /* renamed from: b */
    public void mo4166b() {
        View view;
        if (!this.f3885e) {
            Iterator<C1049r8> it = this.f3881a.iterator();
            while (it.hasNext()) {
                C1049r8 next = it.next();
                long j = this.f3882b;
                if (j >= 0) {
                    next.mo4213c(j);
                }
                Interpolator interpolator = this.f3883c;
                if (!(interpolator == null || (view = (View) next.f3933a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f3884d != null) {
                    next.mo4214d(this.f3886f);
                }
                View view2 = (View) next.f3933a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f3885e = true;
        }
    }
}
