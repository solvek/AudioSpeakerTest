package p000;

import android.view.View;
import p000.C0813m8;

/* renamed from: p8 */
public class C0961p8 extends C0813m8.C0815b<Boolean> {
    public C0961p8(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    /* renamed from: b */
    public Object mo3668b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    /* renamed from: d */
    public void mo3975d(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    /* renamed from: e */
    public boolean mo3976e(Object obj, Object obj2) {
        return !mo3667a((Boolean) obj, (Boolean) obj2);
    }
}
