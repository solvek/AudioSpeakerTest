package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: cf */
public class C0276cf extends C0220bf {

    /* renamed from: f */
    public static boolean f1382f = true;

    /* renamed from: g */
    public static boolean f1383g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo1762g(View view, Matrix matrix) {
        if (f1382f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1382f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo1763h(View view, Matrix matrix) {
        if (f1383g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1383g = false;
            }
        }
    }
}
