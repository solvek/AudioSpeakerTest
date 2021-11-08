package p000;

import android.view.ViewTreeObserver;

/* renamed from: kk */
public class C0731kk implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ C0634ik f3010b;

    public C0731kk(C0634ik ikVar) {
        this.f3010b = ikVar;
    }

    public boolean onPreDraw() {
        C0634ik ikVar = this.f3010b;
        float rotation = ikVar.f2742s.getRotation();
        if (ikVar.f2736m == rotation) {
            return true;
        }
        ikVar.f2736m = rotation;
        ikVar.mo3296s();
        return true;
    }
}
