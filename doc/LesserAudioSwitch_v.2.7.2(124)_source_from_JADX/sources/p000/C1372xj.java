package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: xj */
public class C1372xj extends LinearLayoutManager {

    /* renamed from: xj$a */
    public class C1373a extends C0676jd {
        public C1373a(C1372xj xjVar, Context context) {
            super(context);
        }

        /* renamed from: e */
        public float mo3430e(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public C1372xj(Context context, int i, boolean z) {
        super(i, z);
    }

    /* renamed from: V0 */
    public void mo1050V0(RecyclerView recyclerView, RecyclerView.C0179x xVar, int i) {
        C1373a aVar = new C1373a(this, recyclerView.getContext());
        aVar.f1070a = i;
        mo1332W0(aVar);
    }
}
