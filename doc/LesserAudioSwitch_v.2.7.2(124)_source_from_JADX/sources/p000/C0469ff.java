package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: ff */
public class C0469ff extends C0421ef {
    /* renamed from: b */
    public float mo1598b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: d */
    public void mo2650d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: e */
    public void mo1600e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: f */
    public void mo2724f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: g */
    public void mo1762g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: h */
    public void mo1763h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
