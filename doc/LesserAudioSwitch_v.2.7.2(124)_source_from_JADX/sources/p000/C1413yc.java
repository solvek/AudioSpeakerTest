package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0465fd;

/* renamed from: yc */
public class C1413yc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f5184b;

    /* renamed from: c */
    public final /* synthetic */ C0465fd f5185c;

    public C1413yc(C0465fd fdVar, ArrayList arrayList) {
        this.f5185c = fdVar;
        this.f5184b = arrayList;
    }

    public void run() {
        Iterator it = this.f5184b.iterator();
        while (it.hasNext()) {
            C0465fd.C0466a aVar = (C0465fd.C0466a) it.next();
            C0465fd fdVar = this.f5185c;
            fdVar.getClass();
            RecyclerView.C0145a0 a0Var = aVar.f2121a;
            View view = null;
            View view2 = a0Var == null ? null : a0Var.f996a;
            RecyclerView.C0145a0 a0Var2 = aVar.f2122b;
            if (a0Var2 != null) {
                view = a0Var2.f996a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(fdVar.f1023f);
                fdVar.f2120r.add(aVar.f2121a);
                duration.translationX((float) (aVar.f2125e - aVar.f2123c));
                duration.translationY((float) (aVar.f2126f - aVar.f2124d));
                duration.alpha(0.0f).setListener(new C0373dd(fdVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                fdVar.f2120r.add(aVar.f2122b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(fdVar.f1023f).alpha(1.0f).setListener(new C0415ed(fdVar, aVar, animate, view)).start();
            }
        }
        this.f5184b.clear();
        this.f5185c.f2116n.remove(this.f5184b);
    }
}
