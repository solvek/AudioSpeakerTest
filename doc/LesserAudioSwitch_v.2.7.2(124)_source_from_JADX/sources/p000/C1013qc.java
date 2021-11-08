package p000;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* renamed from: qc */
public class C1013qc extends C1057rd {

    /* renamed from: f */
    public final RecyclerView f3817f;

    /* renamed from: g */
    public final C1444z7 f3818g = this.f3951e;

    /* renamed from: h */
    public final C1444z7 f3819h = new C1014a();

    /* renamed from: qc$a */
    public class C1014a extends C1444z7 {
        public C1014a() {
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            Preference i;
            C1013qc.this.f3818g.mo817d(view, x8Var);
            C1013qc.this.f3817f.getClass();
            RecyclerView.C0145a0 K = RecyclerView.m600K(view);
            int e = K != null ? K.mo1250e() : -1;
            RecyclerView.C0149e adapter = C1013qc.this.f3817f.getAdapter();
            if ((adapter instanceof C0824mc) && (i = ((C0824mc) adapter).mo3681i(e)) != null) {
                i.mo960u(x8Var);
            }
        }

        /* renamed from: g */
        public boolean mo818g(View view, int i, Bundle bundle) {
            return C1013qc.this.f3818g.mo818g(view, i, bundle);
        }
    }

    public C1013qc(RecyclerView recyclerView) {
        super(recyclerView);
        this.f3817f = recyclerView;
    }

    /* renamed from: j */
    public C1444z7 mo4077j() {
        return this.f3819h;
    }
}
