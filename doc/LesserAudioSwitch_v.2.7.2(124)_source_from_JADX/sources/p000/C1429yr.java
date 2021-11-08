package p000;

import com.nordskog.LesserAudioSwitch.p002ui.PurchaseItemView;
import p000.C0796lu;

/* renamed from: yr */
public final /* synthetic */ class C1429yr implements C0796lu.C0797a {

    /* renamed from: a */
    public final /* synthetic */ C0235bt f5217a;

    public /* synthetic */ C1429yr(C0235bt btVar) {
        this.f5217a = btVar;
    }

    /* renamed from: a */
    public final void mo1471a(Object obj) {
        C0231bp bpVar;
        PurchaseItemView purchaseItemView;
        C0235bt btVar = this.f5217a;
        C1468zo zoVar = (C1468zo) obj;
        if (!btVar.f1305p0 && (bpVar = zoVar.f5343g.get(C1384xo.f5119a)) != null && (purchaseItemView = btVar.f1297h0) != null) {
            purchaseItemView.setItem(bpVar);
        }
    }
}
