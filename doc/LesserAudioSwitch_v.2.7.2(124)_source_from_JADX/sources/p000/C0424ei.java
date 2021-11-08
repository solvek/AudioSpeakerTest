package p000;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.C1446z8;

/* renamed from: ei */
public class C0424ei implements C1446z8 {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f2001a;

    public C0424ei(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2001a = swipeDismissBehavior;
    }

    /* renamed from: a */
    public boolean mo1921a(View view, C1446z8.C1447a aVar) {
        boolean z = false;
        if (!this.f2001a.mo1863B(view)) {
            return false;
        }
        boolean z2 = C0813m8.m2478l(view) == 1;
        int i = this.f2001a.f1451c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        C0813m8.m2488v(view, width);
        view.setAlpha(0.0f);
        this.f2001a.getClass();
        return true;
    }
}
