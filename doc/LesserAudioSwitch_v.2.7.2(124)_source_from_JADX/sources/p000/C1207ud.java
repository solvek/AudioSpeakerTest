package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ud */
public class C1207ud extends C0676jd {

    /* renamed from: q */
    public final /* synthetic */ C1164td f4617q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1207ud(C1164td tdVar, Context context) {
        super(context);
        this.f4617q = tdVar;
    }

    /* renamed from: b */
    public void mo1389b(View view, RecyclerView.C0179x xVar, RecyclerView.C0176w.C0177a aVar) {
        C1164td tdVar = this.f4617q;
        RecyclerView recyclerView = tdVar.f4428a;
        if (recyclerView != null) {
            int[] a = tdVar.mo3550a(recyclerView.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            double f = (double) mo3431f(Math.max(Math.abs(i), Math.abs(i2)));
            Double.isNaN(f);
            Double.isNaN(f);
            Double.isNaN(f);
            int ceil = (int) Math.ceil(f / 0.3356d);
            if (ceil > 0) {
                aVar.mo1392b(i, i2, ceil, this.f2867j);
            }
        }
    }

    /* renamed from: e */
    public float mo3430e(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
