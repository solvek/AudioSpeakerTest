package p000;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* renamed from: gj */
public class C0539gj extends RecyclerView.C0159l {

    /* renamed from: a */
    public final Calendar f2330a = C1463zj.m3974e();

    /* renamed from: b */
    public final Calendar f2331b = C1463zj.m3974e();

    /* renamed from: c */
    public final /* synthetic */ C0473fj f2332c;

    public C0539gj(C0473fj fjVar) {
        this.f2332c = fjVar;
    }

    /* renamed from: e */
    public void mo1295e(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0179x xVar) {
        if ((recyclerView.getAdapter() instanceof C0225bk) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C0225bk bkVar = (C0225bk) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (C1298w7<Long, Long> w7Var : this.f2332c.f2135V.mo1773g()) {
                w7Var.getClass();
            }
        }
    }
}
