package p000;

import androidx.recyclerview.widget.RecyclerView;
import p000.C0465fd;

/* renamed from: sd */
public abstract class C1108sd extends RecyclerView.C0154j {

    /* renamed from: g */
    public boolean f4182g = true;

    /* renamed from: a */
    public boolean mo1286a(RecyclerView.C0145a0 a0Var, RecyclerView.C0145a0 a0Var2, RecyclerView.C0154j.C0157c cVar, RecyclerView.C0154j.C0157c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1024a;
        int i4 = cVar.f1025b;
        if (a0Var2.mo1267u()) {
            int i5 = cVar.f1024a;
            i = cVar.f1025b;
            i2 = i5;
        } else {
            i2 = cVar2.f1024a;
            i = cVar2.f1025b;
        }
        C0465fd fdVar = (C0465fd) this;
        if (a0Var == a0Var2) {
            return fdVar.mo2782i(a0Var, i3, i4, i2, i);
        }
        float translationX = a0Var.f996a.getTranslationX();
        float translationY = a0Var.f996a.getTranslationY();
        float alpha = a0Var.f996a.getAlpha();
        fdVar.mo2787n(a0Var);
        a0Var.f996a.setTranslationX(translationX);
        a0Var.f996a.setTranslationY(translationY);
        a0Var.f996a.setAlpha(alpha);
        fdVar.mo2787n(a0Var2);
        a0Var2.f996a.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        a0Var2.f996a.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        a0Var2.f996a.setAlpha(0.0f);
        fdVar.f2113k.add(new C0465fd.C0466a(a0Var, a0Var2, i3, i4, i2, i));
        return true;
    }

    /* renamed from: i */
    public abstract boolean mo2782i(RecyclerView.C0145a0 a0Var, int i, int i2, int i3, int i4);
}
