package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p000.C0614ia;
import p000.C1353xa;

/* renamed from: y9 */
public final class C1405y9 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f5166a;

    /* renamed from: b */
    public final /* synthetic */ View f5167b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f5168c;

    /* renamed from: d */
    public final /* synthetic */ C1353xa.C1354a f5169d;

    /* renamed from: e */
    public final /* synthetic */ C0521g7 f5170e;

    public C1405y9(ViewGroup viewGroup, View view, Fragment fragment, C1353xa.C1354a aVar, C0521g7 g7Var) {
        this.f5166a = viewGroup;
        this.f5167b = view;
        this.f5168c = fragment;
        this.f5169d = aVar;
        this.f5170e = g7Var;
    }

    public void onAnimationEnd(Animator animator) {
        this.f5166a.endViewTransition(this.f5167b);
        Fragment fragment = this.f5168c;
        Fragment.C0102a aVar = fragment.f683H;
        Animator animator2 = aVar == null ? null : aVar.f721b;
        fragment.mo880p0((Animator) null);
        if (animator2 != null && this.f5166a.indexOfChild(this.f5167b) < 0) {
            ((C0614ia.C0616b) this.f5169d).mo3254a(this.f5168c, this.f5170e);
        }
    }
}
