package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: od */
public abstract class C0924od {

    /* renamed from: a */
    public final RecyclerView.C0160m f3497a;

    /* renamed from: b */
    public int f3498b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f3499c = new Rect();

    public C0924od(RecyclerView.C0160m mVar, C0827md mdVar) {
        this.f3497a = mVar;
    }

    /* renamed from: a */
    public static C0924od m2678a(RecyclerView.C0160m mVar, int i) {
        if (i == 0) {
            return new C0827md(mVar);
        }
        if (i == 1) {
            return new C0870nd(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo3687b(View view);

    /* renamed from: c */
    public abstract int mo3688c(View view);

    /* renamed from: d */
    public abstract int mo3689d(View view);

    /* renamed from: e */
    public abstract int mo3690e(View view);

    /* renamed from: f */
    public abstract int mo3691f();

    /* renamed from: g */
    public abstract int mo3692g();

    /* renamed from: h */
    public abstract int mo3693h();

    /* renamed from: i */
    public abstract int mo3694i();

    /* renamed from: j */
    public abstract int mo3695j();

    /* renamed from: k */
    public abstract int mo3696k();

    /* renamed from: l */
    public abstract int mo3697l();

    /* renamed from: m */
    public int mo3843m() {
        if (Integer.MIN_VALUE == this.f3498b) {
            return 0;
        }
        return mo3697l() - this.f3498b;
    }

    /* renamed from: n */
    public abstract int mo3698n(View view);

    /* renamed from: o */
    public abstract int mo3699o(View view);

    /* renamed from: p */
    public abstract void mo3700p(int i);
}
