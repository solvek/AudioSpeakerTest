package p000;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import p000.C0521g7;

/* renamed from: w9 */
public final class C1300w9 implements C0521g7.C0522a {

    /* renamed from: a */
    public final /* synthetic */ Fragment f4932a;

    public C1300w9(Fragment fragment) {
        this.f4932a = fragment;
    }

    /* renamed from: a */
    public void mo4977a() {
        if (this.f4932a.mo864j() != null) {
            View j = this.f4932a.mo864j();
            this.f4932a.mo875o0((View) null);
            j.clearAnimation();
        }
        this.f4932a.mo880p0((Animator) null);
    }
}
