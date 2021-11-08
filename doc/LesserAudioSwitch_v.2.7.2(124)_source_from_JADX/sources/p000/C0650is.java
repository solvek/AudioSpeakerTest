package p000;

import android.content.Context;
import android.widget.CompoundButton;
import p000.C0652iu;
import p000.C0735ko;

/* renamed from: is */
public final /* synthetic */ class C0650is implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Context f2767a;

    public /* synthetic */ C0650is(Context context) {
        this.f2767a = context;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Context context = this.f2767a;
        C0652iu.C0653a aVar = C0697ju.f2933a;
        C0697ju.m2202y(context, C0200av.m970a(-110448062321836L), z);
        if (!z && C0728kh.m2302r(context)) {
            C0936oo.m2712x(context, C0544go.f2372f, true, (C0735ko.C0740e) null);
            C1426yp.m3892g(context);
        }
    }
}
