package p000;

import android.view.View;

/* renamed from: lj */
public class C0783lj implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1213uj f3174b;

    /* renamed from: c */
    public final /* synthetic */ C0473fj f3175c;

    public C0783lj(C0473fj fjVar, C1213uj ujVar) {
        this.f3175c = fjVar;
        this.f3174b = ujVar;
    }

    public void onClick(View view) {
        int l1 = this.f3175c.mo2792w0().mo1072l1() - 1;
        if (l1 >= 0) {
            this.f3175c.mo2794y0(this.f3174b.mo4778g(l1));
        }
    }
}
