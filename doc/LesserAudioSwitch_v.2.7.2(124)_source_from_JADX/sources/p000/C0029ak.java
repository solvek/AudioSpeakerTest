package p000;

import android.view.View;
import p000.C0473fj;

/* renamed from: ak */
public class C0029ak implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f115b;

    /* renamed from: c */
    public final /* synthetic */ C0225bk f116c;

    public C0029ak(C0225bk bkVar, int i) {
        this.f116c = bkVar;
        this.f115b = i;
    }

    public void onClick(View view) {
        C1064rj k = C1064rj.m3027k(this.f115b, this.f116c.f1284c.f2137X.f3968d);
        C1459zi ziVar = this.f116c.f1284c.f2136W;
        if (k.compareTo(ziVar.f5315b) < 0) {
            k = ziVar.f5315b;
        } else if (k.compareTo(ziVar.f5316c) > 0) {
            k = ziVar.f5316c;
        }
        this.f116c.f1284c.mo2794y0(k);
        this.f116c.f1284c.mo2795z0(C0473fj.C0478e.DAY);
    }
}
