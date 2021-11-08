package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: q5 */
public class C1004q5 {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f3775a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f3776b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m2910a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2910a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
