package p000;

import android.widget.AutoCompleteTextView;

/* renamed from: pm */
public class C0983pm implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C0836mm f3708a;

    public C0983pm(C0836mm mmVar) {
        this.f3708a = mmVar;
    }

    public void onDismiss() {
        C0836mm mmVar = this.f3708a;
        mmVar.f3300i = true;
        mmVar.f3302k = System.currentTimeMillis();
        C0836mm.m2534f(this.f3708a, false);
    }
}
