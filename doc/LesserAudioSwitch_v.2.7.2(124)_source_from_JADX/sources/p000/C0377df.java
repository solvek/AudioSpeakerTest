package p000;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: df */
public class C0377df extends C0276cf {

    /* renamed from: h */
    public static boolean f1895h = true;

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo2650d(View view, int i, int i2, int i3, int i4) {
        if (f1895h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f1895h = false;
            }
        }
    }
}
