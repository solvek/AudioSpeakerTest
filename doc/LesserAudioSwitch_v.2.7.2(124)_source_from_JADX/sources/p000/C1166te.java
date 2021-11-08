package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import p000.C1453ze;

/* renamed from: te */
public class C1166te extends C1453ze implements C1260ve {
    public C1166te(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    /* renamed from: a */
    public void mo4643a(View view) {
        C1453ze.C1454a aVar = this.f5285a;
        aVar.removeView(view);
        aVar.mo5283a();
    }

    /* renamed from: b */
    public void mo4644b(View view) {
        C1453ze.C1454a aVar = this.f5285a;
        if (!aVar.f5290f) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == aVar.f5286b || viewGroup.getParent() == null || !C0813m8.m2485s(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    aVar.f5286b.getLocationOnScreen(iArr2);
                    C0813m8.m2488v(view, iArr[0] - iArr2[0]);
                    C0813m8.m2489w(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            aVar.addView(view);
            return;
        }
        throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }
}
