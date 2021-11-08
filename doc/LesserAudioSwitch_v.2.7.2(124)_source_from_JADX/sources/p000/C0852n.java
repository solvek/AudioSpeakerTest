package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: n */
public class C0852n implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f3326b;

    /* renamed from: c */
    public final /* synthetic */ AlertController f3327c;

    /* renamed from: d */
    public final /* synthetic */ AlertController.C0039b f3328d;

    public C0852n(AlertController.C0039b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f3328d = bVar;
        this.f3326b = recycleListView;
        this.f3327c = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f3328d.f205p;
        if (zArr != null) {
            zArr[i] = this.f3326b.isItemChecked(i);
        }
        this.f3328d.f209t.onClick(this.f3327c.f162b, i, this.f3326b.isItemChecked(i));
    }
}
