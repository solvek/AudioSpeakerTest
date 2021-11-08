package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: ef */
public class C0421ef extends C0377df {

    /* renamed from: i */
    public static boolean f1999i = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo2724f(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2724f(view, i);
        } else if (f1999i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f1999i = false;
            }
        }
    }
}
