package p000;

import android.widget.TextView;

/* renamed from: oq */
public final /* synthetic */ class C0942oq implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1277vs f3513b;

    /* renamed from: c */
    public final /* synthetic */ C0985po[] f3514c;

    public /* synthetic */ C0942oq(C1277vs vsVar, C0985po[] poVarArr) {
        this.f3513b = vsVar;
        this.f3514c = poVarArr;
    }

    public final void run() {
        C1277vs vsVar = this.f3513b;
        C0985po[] poVarArr = this.f3514c;
        vsVar.f4849Z.setText("", TextView.BufferType.SPANNABLE);
        for (C0985po a : poVarArr) {
            vsVar.f4849Z.append(a.mo4044a());
            vsVar.f4849Z.append("\n");
        }
    }
}
