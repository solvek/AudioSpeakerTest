package p000;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: z */
public class C1434z extends C1157t9 {
    /* renamed from: x0 */
    public Dialog mo1615x0(Bundle bundle) {
        return new C1392y(mo868l(), this.f4400Y);
    }

    /* renamed from: z0 */
    public void mo4637z0(Dialog dialog, int i) {
        if (dialog instanceof C1392y) {
            C1392y yVar = (C1392y) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            yVar.mo5116d(1);
            return;
        }
        super.mo4637z0(dialog, i);
    }
}
