package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: qj */
public final class C1022qj<S> extends C1314wj<S> {

    /* renamed from: U */
    public C0281cj<S> f3833U;

    /* renamed from: V */
    public C1459zi f3834V;

    /* renamed from: qj$a */
    public class C1023a extends C1265vj<S> {
        public C1023a() {
        }

        /* renamed from: a */
        public void mo3803a(S s) {
            Iterator it = C1022qj.this.f4962T.iterator();
            while (it.hasNext()) {
                ((C1265vj) it.next()).mo3803a(s);
            }
        }
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        if (bundle == null) {
            bundle = this.f698f;
        }
        this.f3833U = (C0281cj) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3834V = (C1459zi) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f3833U.mo1771e(layoutInflater, viewGroup, bundle, this.f3834V, new C1023a());
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3833U);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3834V);
    }
}
