package p000;

import android.view.View;
import android.view.Window;

/* renamed from: i3 */
public class C0600i3 implements View.OnClickListener {

    /* renamed from: b */
    public final C1138t0 f2529b;

    /* renamed from: c */
    public final /* synthetic */ C0661j3 f2530c;

    public C0600i3(C0661j3 j3Var) {
        this.f2530c = j3Var;
        this.f2529b = new C1138t0(j3Var.f2802a.getContext(), 0, 16908332, 0, j3Var.f2810i);
    }

    public void onClick(View view) {
        C0661j3 j3Var = this.f2530c;
        Window.Callback callback = j3Var.f2813l;
        if (callback != null && j3Var.f2814m) {
            callback.onMenuItemSelected(0, this.f2529b);
        }
    }
}
