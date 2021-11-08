package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: gf */
public class C0534gf {

    /* renamed from: a */
    public static Method f2319a;

    /* renamed from: b */
    public static boolean f2320b;

    /* renamed from: c */
    public static Field f2321c;

    /* renamed from: d */
    public static boolean f2322d;

    /* renamed from: a */
    public void mo1597a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: b */
    public float mo1598b(View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: c */
    public void mo1599c(View view) {
        if (view.getTag(R.id.save_non_transition_alpha) == null) {
            view.setTag(R.id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: d */
    public void mo2650d(View view, int i, int i2, int i3, int i4) {
        if (!f2320b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f2319a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2320b = true;
        }
        Method method = f2319a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: e */
    public void mo1600e(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: f */
    public void mo2724f(View view, int i) {
        if (!f2322d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2321c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2322d = true;
        }
        Field field = f2321c;
        if (field != null) {
            try {
                f2321c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public void mo1762g(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1762g(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: h */
    public void mo1763h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo1763h(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
