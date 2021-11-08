package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: t2 */
public class C1140t2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C1189u2 f4348b;

    public C1140t2(C1189u2 u2Var) {
        this.f4348b = u2Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0951p2 p2Var;
        if (i != -1 && (p2Var = this.f4348b.f4550d) != null) {
            p2Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
