package p000;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o2 */
public class C0912o2 {

    /* renamed from: a */
    public static final int[] f3468a = {16842912};

    /* renamed from: b */
    public static final int[] f3469b = new int[0];

    /* renamed from: c */
    public static final Rect f3470c = new Rect();

    /* renamed from: d */
    public static Class<?> f3471d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f3471d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2664a(Drawable drawable) {
        Drawable drawable2;
        int i = Build.VERSION.SDK_INT;
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m2664a(a)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof C1443z6) {
            drawable2 = ((C1443z6) drawable).mo47a();
        } else if (drawable instanceof C0552h0) {
            return m2664a(((C0552h0) drawable).f2420b);
        } else {
            if (!(drawable instanceof ScaleDrawable)) {
                return true;
            }
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return m2664a(drawable2);
    }

    /* renamed from: b */
    public static void m2665b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f3468a);
            } else {
                drawable.setState(f3469b);
            }
            drawable.setState(state);
        }
    }

    /* renamed from: c */
    public static Rect m2666c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f3471d != null) {
            try {
                Drawable i0 = C1344x5.m3762i0(drawable);
                Object invoke = i0.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(i0, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f3471d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f3470c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m2667d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
