package p000;

import android.content.Context;
import android.widget.CompoundButton;
import p000.C0652iu;
import p000.C0735ko;

/* renamed from: hs */
public final /* synthetic */ class C0591hs implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Context f2501a;

    public /* synthetic */ C0591hs(Context context) {
        this.f2501a = context;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Context context = this.f2501a;
        C0652iu.C0653a aVar = C0697ju.f2933a;
        C0697ju.m2202y(context, C0200av.m970a(-110542551602348L), z);
        if (!z) {
            C0936oo.m2712x(context, C0544go.f2370e, true, (C0735ko.C0740e) null);
            C1426yp.m3892g(context);
        }
    }
}
