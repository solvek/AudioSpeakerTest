package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: c3 */
public class C0253c3 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1330a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1331b = {-16842910};

    /* renamed from: c */
    public static final int[] f1332c = {16842908};

    /* renamed from: d */
    public static final int[] f1333d = {16842919};

    /* renamed from: e */
    public static final int[] f1334e = {16842912};

    /* renamed from: f */
    public static final int[] f1335f = new int[0];

    /* renamed from: g */
    public static final int[] f1336g = new int[1];

    /* renamed from: a */
    public static void m1047a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0440f.f2056j);
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1048b(Context context, int i) {
        ColorStateList d = m1050d(context, i);
        if (d != null && d.isStateful()) {
            return d.getColorForState(f1331b, d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1330a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int c = m1049c(context, i);
        return C0859n6.m2574c(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: c */
    public static int m1049c(Context context, int i) {
        int[] iArr = f1336g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m1050d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1336g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0399e0.m1529a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
