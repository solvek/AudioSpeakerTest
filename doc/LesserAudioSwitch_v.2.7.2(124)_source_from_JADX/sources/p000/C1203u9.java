package p000;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: u9 */
public class C1203u9 extends C0215ba {

    /* renamed from: a */
    public final /* synthetic */ Fragment f4607a;

    public C1203u9(Fragment fragment) {
        this.f4607a = fragment;
    }

    /* renamed from: b */
    public View mo1591b(int i) {
        View view = this.f4607a.f680E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    /* renamed from: f */
    public boolean mo1592f() {
        return this.f4607a.f680E != null;
    }
}
