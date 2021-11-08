package p000;

import android.view.View;
import p000.C0473fj;

/* renamed from: jj */
public class C0686jj implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C0473fj f2907b;

    public C0686jj(C0473fj fjVar) {
        this.f2907b = fjVar;
    }

    public void onClick(View view) {
        C0473fj fjVar = this.f2907b;
        C0473fj.C0478e eVar = C0473fj.C0478e.DAY;
        C0473fj.C0478e eVar2 = fjVar.f2138Y;
        C0473fj.C0478e eVar3 = C0473fj.C0478e.YEAR;
        if (eVar2 == eVar3) {
            fjVar.mo2795z0(eVar);
        } else if (eVar2 == eVar) {
            fjVar.mo2795z0(eVar3);
        }
    }
}
