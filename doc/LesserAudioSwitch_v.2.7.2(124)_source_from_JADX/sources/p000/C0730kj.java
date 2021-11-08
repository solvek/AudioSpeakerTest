package p000;

import android.view.View;

/* renamed from: kj */
public class C0730kj implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1213uj f3008b;

    /* renamed from: c */
    public final /* synthetic */ C0473fj f3009c;

    public C0730kj(C0473fj fjVar, C1213uj ujVar) {
        this.f3009c = fjVar;
        this.f3008b = ujVar;
    }

    public void onClick(View view) {
        int j1 = this.f3009c.mo2792w0().mo1069j1() + 1;
        if (j1 < this.f3009c.f2141b0.getAdapter().mo1273a()) {
            this.f3009c.mo2794y0(this.f3008b.mo4778g(j1));
        }
    }
}
