package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: tm */
public class C1177tm implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1220um f4517b;

    public C1177tm(C1220um umVar) {
        this.f4517b = umVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj;
        C1220um umVar = this.f4517b;
        if (i < 0) {
            C1189u2 u2Var = umVar.f4671e;
            obj = !u2Var.mo3108a() ? null : u2Var.f4550d.getSelectedItem();
        } else {
            obj = umVar.getAdapter().getItem(i);
        }
        C1220um.m3408a(this.f4517b, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f4517b.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                C1189u2 u2Var2 = this.f4517b.f4671e;
                view = !u2Var2.mo3108a() ? null : u2Var2.f4550d.getSelectedView();
                C1189u2 u2Var3 = this.f4517b.f4671e;
                i = !u2Var3.mo3108a() ? -1 : u2Var3.f4550d.getSelectedItemPosition();
                C1189u2 u2Var4 = this.f4517b.f4671e;
                j = !u2Var4.mo3108a() ? Long.MIN_VALUE : u2Var4.f4550d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f4517b.f4671e.f4550d, view, i, j);
        }
        this.f4517b.f4671e.dismiss();
    }
}
