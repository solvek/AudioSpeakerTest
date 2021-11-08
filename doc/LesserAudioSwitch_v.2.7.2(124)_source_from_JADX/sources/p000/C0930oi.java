package p000;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: oi */
public class C0930oi extends C1434z {
    /* renamed from: B0 */
    public void mo3847B0() {
        Dialog dialog = this.f4405d0;
        if (dialog instanceof C0880ni) {
            C0880ni niVar = (C0880ni) dialog;
            if (niVar.f3386d == null) {
                niVar.mo3786e();
            }
            boolean z = niVar.f3386d.f1511u;
        }
        mo4635w0(false, false);
    }

    /* renamed from: x0 */
    public Dialog mo1615x0(Bundle bundle) {
        return new C0880ni(mo868l(), this.f4400Y);
    }
}
