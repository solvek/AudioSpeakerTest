package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: l */
public class C0749l extends ArrayAdapter<CharSequence> {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f3082b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0039b f3083c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0749l(AlertController.C0039b bVar, Context context, int i, int i2, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, i2, charSequenceArr);
        this.f3083c = bVar;
        this.f3082b = recycleListView;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f3083c.f205p;
        if (zArr != null && zArr[i]) {
            this.f3082b.setItemChecked(i, true);
        }
        return view2;
    }
}
