package p000;

import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: td */
public abstract class C1164td extends RecyclerView.C0166o {

    /* renamed from: a */
    public RecyclerView f4428a;

    /* renamed from: b */
    public Scroller f4429b;

    /* renamed from: c */
    public final RecyclerView.C0168q f4430c = new C1165a();

    /* renamed from: td$a */
    public class C1165a extends RecyclerView.C0168q {

        /* renamed from: a */
        public boolean f4431a = false;

        public C1165a() {
        }

        /* renamed from: a */
        public void mo1366a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f4431a) {
                this.f4431a = false;
                C1164td.this.mo4642c();
            }
        }

        /* renamed from: b */
        public void mo1367b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4431a = true;
            }
        }
    }

    /* renamed from: a */
    public abstract int[] mo3550a(RecyclerView.C0160m mVar, View view);

    /* renamed from: b */
    public abstract View mo3551b(RecyclerView.C0160m mVar);

    /* renamed from: c */
    public void mo4642c() {
        RecyclerView.C0160m layoutManager;
        View b;
        RecyclerView recyclerView = this.f4428a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (b = mo3551b(layoutManager)) != null) {
            int[] a = mo3550a(layoutManager, b);
            if (a[0] != 0 || a[1] != 0) {
                this.f4428a.mo1183l0(a[0], a[1], (Interpolator) null, Integer.MIN_VALUE, false);
            }
        }
    }
}
