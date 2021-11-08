package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zc */
public class C1451zc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f5283b;

    /* renamed from: c */
    public final /* synthetic */ C0465fd f5284c;

    public C1451zc(C0465fd fdVar, ArrayList arrayList) {
        this.f5284c = fdVar;
        this.f5283b = arrayList;
    }

    public void run() {
        Iterator it = this.f5283b.iterator();
        while (it.hasNext()) {
            RecyclerView.C0145a0 a0Var = (RecyclerView.C0145a0) it.next();
            C0465fd fdVar = this.f5284c;
            fdVar.getClass();
            View view = a0Var.f996a;
            ViewPropertyAnimator animate = view.animate();
            fdVar.f2117o.add(a0Var);
            animate.alpha(1.0f).setDuration(fdVar.f1020c).setListener(new C0218bd(fdVar, a0Var, view, animate)).start();
        }
        this.f5283b.clear();
        this.f5284c.f2114l.remove(this.f5283b);
    }
}
