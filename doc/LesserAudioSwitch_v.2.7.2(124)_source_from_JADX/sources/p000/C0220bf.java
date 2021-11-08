package p000;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: bf */
public class C0220bf extends C0534gf {

    /* renamed from: e */
    public static boolean f1263e = true;

    /* renamed from: a */
    public void mo1597a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo1598b(View view) {
        if (f1263e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1263e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo1599c(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo1600e(View view, float f) {
        if (f1263e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f1263e = false;
            }
        }
        view.setAlpha(f);
    }
}
