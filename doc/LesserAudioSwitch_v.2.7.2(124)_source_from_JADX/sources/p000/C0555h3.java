package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: h3 */
public class C0555h3 {

    /* renamed from: a */
    public final Context f2424a;

    /* renamed from: b */
    public final TypedArray f2425b;

    /* renamed from: c */
    public TypedValue f2426c;

    public C0555h3(Context context, TypedArray typedArray) {
        this.f2424a = context;
        this.f2425b = typedArray;
    }

    /* renamed from: p */
    public static C0555h3 m1824p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0555h3(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: q */
    public static C0555h3 m1825q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0555h3(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo3021a(int i, boolean z) {
        return this.f2425b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo3022b(int i, int i2) {
        return this.f2425b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p000.C0399e0.m1529a(r2.f2424a, (r0 = r2.f2425b.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo3023c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2425b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f2425b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f2424a
            android.content.res.ColorStateList r0 = p000.C0399e0.m1529a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f2425b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0555h3.mo3023c(int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public float mo3024d(int i, float f) {
        return this.f2425b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo3025e(int i, int i2) {
        return this.f2425b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo3026f(int i, int i2) {
        return this.f2425b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f2425b.getResourceId(r3, 0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo3027g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f2425b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f2425b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f2424a
            android.graphics.drawable.Drawable r3 = p000.C0399e0.m1530b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f2425b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0555h3.mo3027g(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: h */
    public Drawable mo3028h(int i) {
        int resourceId;
        Drawable g;
        if (!this.f2425b.hasValue(i) || (resourceId = this.f2425b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C1231v1 a = C1231v1.m3413a();
        Context context = this.f2424a;
        synchronized (a) {
            g = a.f4696a.mo5043g(context, resourceId, true);
        }
        return g;
    }

    /* renamed from: i */
    public Typeface mo3029i(int i, int i2, C0757l6 l6Var) {
        int resourceId = this.f2425b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2426c == null) {
            this.f2426c = new TypedValue();
        }
        Context context = this.f2424a;
        TypedValue typedValue = this.f2426c;
        if (context.isRestricted()) {
            return null;
        }
        return C0806m6.m2448i(context, resourceId, typedValue, i2, l6Var, (Handler) null, true);
    }

    /* renamed from: j */
    public int mo3030j(int i, int i2) {
        return this.f2425b.getInt(i, i2);
    }

    /* renamed from: k */
    public int mo3031k(int i, int i2) {
        return this.f2425b.getLayoutDimension(i, i2);
    }

    /* renamed from: l */
    public int mo3032l(int i, int i2) {
        return this.f2425b.getResourceId(i, i2);
    }

    /* renamed from: m */
    public String mo3033m(int i) {
        return this.f2425b.getString(i);
    }

    /* renamed from: n */
    public CharSequence mo3034n(int i) {
        return this.f2425b.getText(i);
    }

    /* renamed from: o */
    public boolean mo3035o(int i) {
        return this.f2425b.hasValue(i);
    }
}
