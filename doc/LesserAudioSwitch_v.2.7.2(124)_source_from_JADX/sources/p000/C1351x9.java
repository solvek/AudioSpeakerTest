package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import p000.C0614ia;
import p000.C1353xa;

/* renamed from: x9 */
public final class C1351x9 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f5055a;

    /* renamed from: b */
    public final /* synthetic */ Fragment f5056b;

    /* renamed from: c */
    public final /* synthetic */ C1353xa.C1354a f5057c;

    /* renamed from: d */
    public final /* synthetic */ C0521g7 f5058d;

    /* renamed from: x9$a */
    public class C1352a implements Runnable {
        public C1352a() {
        }

        public void run() {
            if (C1351x9.this.f5056b.mo864j() != null) {
                C1351x9.this.f5056b.mo875o0((View) null);
                C1351x9 x9Var = C1351x9.this;
                ((C0614ia.C0616b) x9Var.f5057c).mo3254a(x9Var.f5056b, x9Var.f5058d);
            }
        }
    }

    public C1351x9(ViewGroup viewGroup, Fragment fragment, C1353xa.C1354a aVar, C0521g7 g7Var) {
        this.f5055a = viewGroup;
        this.f5056b = fragment;
        this.f5057c = aVar;
        this.f5058d = g7Var;
    }

    public void onAnimationEnd(Animation animation) {
        this.f5055a.post(new C1352a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
