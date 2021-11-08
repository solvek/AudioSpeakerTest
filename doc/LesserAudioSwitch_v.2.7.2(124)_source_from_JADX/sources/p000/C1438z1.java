package p000;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: z1 */
public class C1438z1 extends PopupWindow {

    /* renamed from: b */
    public static final boolean f5249b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    public boolean f5250a;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1438z1(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = p000.C0440f.f2065s
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x001f
            boolean r4 = r3.getBoolean(r4, r0)
            boolean r5 = f5249b
            if (r5 == 0) goto L_0x001c
            r1.f5250a = r4
            goto L_0x001f
        L_0x001c:
            p000.C1344x5.m3744Z(r1, r4)
        L_0x001f:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0030
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0030
            android.graphics.drawable.Drawable r2 = p000.C0399e0.m1530b(r2, r4)
            goto L_0x0034
        L_0x0030:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x0034:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1438z1.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f5249b && this.f5250a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f5249b && this.f5250a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f5249b && this.f5250a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
