package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;
import p000.C0473fj;

/* renamed from: tj */
public class C1172tj implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ MaterialCalendarGridView f4508b;

    /* renamed from: c */
    public final /* synthetic */ C1213uj f4509c;

    public C1172tj(C1213uj ujVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f4509c = ujVar;
        this.f4508b = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1123sj a = this.f4508b.getAdapter();
        if (i >= a.mo4517a() && i <= a.mo4519c()) {
            C0473fj.C0479f fVar = this.f4509c.f4631e;
            long longValue = this.f4508b.getAdapter().getItem(i).longValue();
            C0473fj.C0477d dVar = (C0473fj.C0477d) fVar;
            if (C0473fj.this.f2136W.f5318e.mo2664i(longValue)) {
                C0473fj.this.f2135V.mo1769c(longValue);
                Iterator it = C0473fj.this.f4962T.iterator();
                while (it.hasNext()) {
                    ((C1265vj) it.next()).mo3803a(C0473fj.this.f2135V.mo1767a());
                }
                C0473fj.this.f2141b0.getAdapter().f1016a.mo1280b();
                RecyclerView recyclerView = C0473fj.this.f2140a0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1016a.mo1280b();
                }
            }
        }
    }
}
