package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: af */
public class C0021af {

    /* renamed from: a */
    public static final C0534gf f95a;

    /* renamed from: b */
    public static final Property<View, Float> f96b = new C0022a(Float.class, "translationAlpha");

    /* renamed from: af$a */
    public static class C0022a extends Property<View, Float> {
        public C0022a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(C0021af.m42a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            C0021af.f95a.mo1600e((View) obj, floatValue);
        }
    }

    /* renamed from: af$b */
    public static class C0023b extends Property<View, Rect> {
        public C0023b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            View view = (View) obj;
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 18) {
                return view.getClipBounds();
            }
            return null;
        }

        public void set(Object obj, Object obj2) {
            C0813m8.m2460I((View) obj, (Rect) obj2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f95a = i >= 29 ? new C0469ff() : i >= 23 ? new C0421ef() : i >= 22 ? new C0377df() : i >= 21 ? new C0276cf() : i >= 19 ? new C0220bf() : new C0534gf();
        new C0023b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static float m42a(View view) {
        return f95a.mo1598b(view);
    }

    /* renamed from: b */
    public static C0779lf m43b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C0726kf(view) : new C0682jf(view.getWindowToken());
    }

    /* renamed from: c */
    public static void m44c(View view, int i, int i2, int i3, int i4) {
        f95a.mo2650d(view, i, i2, i3, i4);
    }
}
