package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e0 */
public final class C0399e0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1931a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<C0400a>> f1932b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f1933c = new Object();

    /* renamed from: e0$a */
    public static class C0400a {

        /* renamed from: a */
        public final ColorStateList f1934a;

        /* renamed from: b */
        public final Configuration f1935b;

        public C0400a(ColorStateList colorStateList, Configuration configuration) {
            this.f1934a = colorStateList;
            this.f1935b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1529a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0400a aVar;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f1933c) {
            SparseArray sparseArray = f1932b.get(context);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (C0400a) sparseArray.get(i)) == null)) {
                if (aVar.f1935b.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = aVar.f1934a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f1931a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = C1344x5.m3768m(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception unused) {
            }
        }
        if (colorStateList != null) {
            synchronized (f1933c) {
                WeakHashMap<Context, SparseArray<C0400a>> weakHashMap = f1932b;
                SparseArray sparseArray2 = weakHashMap.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(context, sparseArray2);
                }
                sparseArray2.append(i, new C0400a(colorStateList, context.getResources().getConfiguration()));
            }
            return colorStateList;
        }
        Object obj = C0408e6.f1978a;
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m1530b(Context context, int i) {
        return C1334x2.m3686d().mo5042f(context, i);
    }
}
