package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p000.C1303wc;

/* renamed from: pd */
public class C0972pd implements C1303wc.C1305b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3617a;

    public C0972pd(RecyclerView recyclerView) {
        this.f3617a = recyclerView;
    }

    /* renamed from: a */
    public View mo4012a(int i) {
        return this.f3617a.getChildAt(i);
    }

    /* renamed from: b */
    public int mo4013b() {
        return this.f3617a.getChildCount();
    }

    /* renamed from: c */
    public void mo4014c(int i) {
        View childAt = this.f3617a.getChildAt(i);
        if (childAt != null) {
            this.f3617a.mo1202p(childAt);
            childAt.clearAnimation();
        }
        this.f3617a.removeViewAt(i);
    }
}
