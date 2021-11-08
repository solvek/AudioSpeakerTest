package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.PurchaseItemView;

/* renamed from: dt */
public class C0395dt implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ PurchaseItemView f1919b;

    public C0395dt(PurchaseItemView purchaseItemView) {
        this.f1919b = purchaseItemView;
    }

    public void onClick(View view) {
        PurchaseItemView purchaseItemView = this.f1919b;
        PurchaseItemView.C0344a aVar = purchaseItemView.f1795l;
        if (aVar != null) {
            C0490fp fpVar = purchaseItemView.f1787d;
            C0235bt btVar = C0235bt.this;
            int i = C0235bt.f1296q0;
            btVar.mo1612D0(fpVar, false);
        }
    }
}
