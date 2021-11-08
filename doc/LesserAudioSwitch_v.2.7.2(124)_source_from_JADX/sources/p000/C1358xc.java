package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0465fd;

/* renamed from: xc */
public class C1358xc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f5069b;

    /* renamed from: c */
    public final /* synthetic */ C0465fd f5070c;

    public C1358xc(C0465fd fdVar, ArrayList arrayList) {
        this.f5070c = fdVar;
        this.f5069b = arrayList;
    }

    public void run() {
        Iterator it = this.f5069b.iterator();
        while (it.hasNext()) {
            C0465fd.C0467b bVar = (C0465fd.C0467b) it.next();
            C0465fd fdVar = this.f5070c;
            RecyclerView.C0145a0 a0Var = bVar.f2127a;
            int i = bVar.f2128b;
            int i2 = bVar.f2129c;
            int i3 = bVar.f2130d;
            int i4 = bVar.f2131e;
            fdVar.getClass();
            View view = a0Var.f996a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            fdVar.f2118p.add(a0Var);
            animate.setDuration(fdVar.f1022e).setListener(new C0265cd(fdVar, a0Var, i5, view, i6, animate)).start();
        }
        this.f5069b.clear();
        this.f5070c.f2115m.remove(this.f5069b);
    }
}
