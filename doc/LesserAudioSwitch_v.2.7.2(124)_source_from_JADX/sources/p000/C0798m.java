package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: m */
public class C0798m implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController f3199b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0039b f3200c;

    public C0798m(AlertController.C0039b bVar, AlertController alertController) {
        this.f3200c = bVar;
        this.f3199b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3200c.f203n.onClick(this.f3199b.f162b, i);
        if (!this.f3200c.f207r) {
            this.f3199b.f162b.dismiss();
        }
    }
}
