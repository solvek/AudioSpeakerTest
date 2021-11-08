package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k2 */
public class C0706k2 {

    /* renamed from: l */
    public static final RectF f2948l = new RectF();

    /* renamed from: m */
    public static ConcurrentHashMap<String, Method> f2949m = new ConcurrentHashMap<>();

    /* renamed from: n */
    public static ConcurrentHashMap<String, Field> f2950n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f2951a = 0;

    /* renamed from: b */
    public boolean f2952b = false;

    /* renamed from: c */
    public float f2953c = -1.0f;

    /* renamed from: d */
    public float f2954d = -1.0f;

    /* renamed from: e */
    public float f2955e = -1.0f;

    /* renamed from: f */
    public int[] f2956f = new int[0];

    /* renamed from: g */
    public boolean f2957g = false;

    /* renamed from: h */
    public TextPaint f2958h;

    /* renamed from: i */
    public final TextView f2959i;

    /* renamed from: j */
    public final Context f2960j;

    /* renamed from: k */
    public final C0709c f2961k;

    /* renamed from: k2$a */
    public static class C0707a extends C0709c {
        /* renamed from: a */
        public void mo3503a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0706k2.m2219f(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: k2$b */
    public static class C0708b extends C0707a {
        /* renamed from: a */
        public void mo3503a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* renamed from: b */
        public boolean mo3504b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: k2$c */
    public static class C0709c {
        /* renamed from: a */
        public void mo3503a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo3504b(TextView textView) {
            return ((Boolean) C0706k2.m2219f(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0706k2(TextView textView) {
        this.f2959i = textView;
        this.f2960j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f2961k = i >= 29 ? new C0708b() : i >= 23 ? new C0707a() : new C0709c();
    }

    /* renamed from: a */
    public static <T> T m2217a(Object obj, String str, T t) {
        Field field;
        try {
            field = f2950n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f2950n.put(str, field);
            }
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        if (field == null) {
            return t;
        }
        try {
            return field.get(obj);
        } catch (IllegalAccessException unused2) {
            return t;
        }
    }

    /* renamed from: e */
    public static Method m2218e(String str) {
        try {
            Method method = f2949m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2949m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        return r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m2219f(java.lang.Object r1, java.lang.String r2, T r3) {
        /*
            java.lang.reflect.Method r2 = m2218e(r2)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r3 = r2.invoke(r1, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            throw r1
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0706k2.m2219f(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public void mo3495b() {
        if (mo3501j() && this.f2951a != 0) {
            if (this.f2952b) {
                if (this.f2959i.getMeasuredHeight() > 0 && this.f2959i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f2961k.mo3504b(this.f2959i) ? 1048576 : (this.f2959i.getMeasuredWidth() - this.f2959i.getTotalPaddingLeft()) - this.f2959i.getTotalPaddingRight();
                    int height = (this.f2959i.getHeight() - this.f2959i.getCompoundPaddingBottom()) - this.f2959i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f2948l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float d = (float) mo3497d(rectF);
                            if (d != this.f2959i.getTextSize()) {
                                mo3498g(0, d);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2952b = true;
        }
    }

    /* renamed from: c */
    public final int[] mo3496c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3497d(android.graphics.RectF r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.f2956f
            int r2 = r2.length
            if (r2 == 0) goto L_0x0171
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x016c
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r0.f2956f
            r7 = r7[r6]
            android.widget.TextView r8 = r0.f2959i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r0.f2959i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r0.f2959i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 16
            r15 = -1
            if (r9 < r10) goto L_0x003e
            android.widget.TextView r11 = r0.f2959i
            int r11 = r11.getMaxLines()
            r14 = r11
            goto L_0x003f
        L_0x003e:
            r14 = -1
        L_0x003f:
            android.text.TextPaint r11 = r0.f2958h
            if (r11 != 0) goto L_0x004b
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>()
            r0.f2958h = r11
            goto L_0x004e
        L_0x004b:
            r11.reset()
        L_0x004e:
            android.text.TextPaint r11 = r0.f2958h
            android.widget.TextView r12 = r0.f2959i
            android.text.TextPaint r12 = r12.getPaint()
            r11.set(r12)
            android.text.TextPaint r11 = r0.f2958h
            float r7 = (float) r7
            r11.setTextSize(r7)
            android.widget.TextView r7 = r0.f2959i
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r12 = "getLayoutAlignment"
            java.lang.Object r7 = m2219f(r7, r12, r11)
            android.text.Layout$Alignment r7 = (android.text.Layout.Alignment) r7
            float r11 = r1.right
            int r13 = java.lang.Math.round(r11)
            r11 = 23
            if (r9 < r11) goto L_0x00c8
            int r9 = r8.length()
            android.text.TextPaint r10 = r0.f2958h
            android.text.StaticLayout$Builder r9 = android.text.StaticLayout.Builder.obtain(r8, r4, r9, r10, r13)
            android.text.StaticLayout$Builder r7 = r9.setAlignment(r7)
            android.widget.TextView r10 = r0.f2959i
            float r10 = r10.getLineSpacingExtra()
            android.widget.TextView r11 = r0.f2959i
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r7 = r7.setLineSpacing(r10, r11)
            android.widget.TextView r10 = r0.f2959i
            boolean r10 = r10.getIncludeFontPadding()
            android.text.StaticLayout$Builder r7 = r7.setIncludePad(r10)
            android.widget.TextView r10 = r0.f2959i
            int r10 = r10.getBreakStrategy()
            android.text.StaticLayout$Builder r7 = r7.setBreakStrategy(r10)
            android.widget.TextView r10 = r0.f2959i
            int r10 = r10.getHyphenationFrequency()
            android.text.StaticLayout$Builder r7 = r7.setHyphenationFrequency(r10)
            if (r14 != r15) goto L_0x00b7
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b8
        L_0x00b7:
            r10 = r14
        L_0x00b8:
            r7.setMaxLines(r10)
            k2$c r7 = r0.f2961k     // Catch:{ ClassCastException -> 0x00c2 }
            android.widget.TextView r10 = r0.f2959i     // Catch:{ ClassCastException -> 0x00c2 }
            r7.mo3503a(r9, r10)     // Catch:{ ClassCastException -> 0x00c2 }
        L_0x00c2:
            android.text.StaticLayout r7 = r9.build()
            r4 = r14
            goto L_0x00ec
        L_0x00c8:
            if (r9 < r10) goto L_0x00ee
            android.widget.TextView r9 = r0.f2959i
            float r9 = r9.getLineSpacingMultiplier()
            android.widget.TextView r10 = r0.f2959i
            float r16 = r10.getLineSpacingExtra()
            android.widget.TextView r10 = r0.f2959i
            boolean r17 = r10.getIncludeFontPadding()
            android.text.StaticLayout r18 = new android.text.StaticLayout
            android.text.TextPaint r12 = r0.f2958h
            r10 = r18
            r11 = r8
            r4 = r14
            r14 = r7
            r7 = -1
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r18
        L_0x00ec:
            r9 = -1
            goto L_0x0134
        L_0x00ee:
            r4 = r14
            r9 = -1
            android.widget.TextView r10 = r0.f2959i
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r12 = "mSpacingMult"
            java.lang.Object r10 = m2217a(r10, r12, r11)
            java.lang.Float r10 = (java.lang.Float) r10
            float r15 = r10.floatValue()
            android.widget.TextView r10 = r0.f2959i
            r11 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.String r12 = "mSpacingAdd"
            java.lang.Object r10 = m2217a(r10, r12, r11)
            java.lang.Float r10 = (java.lang.Float) r10
            float r16 = r10.floatValue()
            android.widget.TextView r10 = r0.f2959i
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.String r12 = "mIncludePad"
            java.lang.Object r10 = m2217a(r10, r12, r11)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r17 = r10.booleanValue()
            android.text.StaticLayout r18 = new android.text.StaticLayout
            android.text.TextPaint r12 = r0.f2958h
            r10 = r18
            r11 = r8
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r18
        L_0x0134:
            if (r4 == r9) goto L_0x014c
            int r9 = r7.getLineCount()
            if (r9 > r4) goto L_0x0157
            int r4 = r7.getLineCount()
            int r4 = r4 - r3
            int r4 = r7.getLineEnd(r4)
            int r8 = r8.length()
            if (r4 == r8) goto L_0x014c
            goto L_0x0157
        L_0x014c:
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r7 = r1.bottom
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0159
        L_0x0157:
            r4 = 0
            goto L_0x015a
        L_0x0159:
            r4 = 1
        L_0x015a:
            if (r4 == 0) goto L_0x0166
            int r6 = r6 + 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x000e
        L_0x0166:
            int r6 = r6 + -1
            r2 = r6
            r4 = 0
            goto L_0x000e
        L_0x016c:
            int[] r1 = r0.f2956f
            r1 = r1[r6]
            return r1
        L_0x0171:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            goto L_0x017a
        L_0x0179:
            throw r1
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0706k2.mo3497d(android.graphics.RectF):int");
    }

    /* renamed from: g */
    public void mo3498g(int i, float f) {
        Context context = this.f2960j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f2959i.getPaint().getTextSize()) {
            this.f2959i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2959i.isInLayout() : false;
            if (this.f2959i.getLayout() != null) {
                this.f2952b = false;
                try {
                    Method e = m2218e("nullLayouts");
                    if (e != null) {
                        e.invoke(this.f2959i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f2959i.requestLayout();
                } else {
                    this.f2959i.forceLayout();
                }
                this.f2959i.invalidate();
            }
        }
    }

    /* renamed from: h */
    public final boolean mo3499h() {
        if (!mo3501j() || this.f2951a != 1) {
            this.f2952b = false;
        } else {
            if (!this.f2957g || this.f2956f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2955e - this.f2954d) / this.f2953c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.f2953c) + this.f2954d);
                }
                this.f2956f = mo3496c(iArr);
            }
            this.f2952b = true;
        }
        return this.f2952b;
    }

    /* renamed from: i */
    public final boolean mo3500i() {
        int[] iArr = this.f2956f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f2957g = z;
        if (z) {
            this.f2951a = 1;
            this.f2954d = (float) iArr[0];
            this.f2955e = (float) iArr[length - 1];
            this.f2953c = -1.0f;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo3501j() {
        return !(this.f2959i instanceof C1288w1);
    }

    /* renamed from: k */
    public final void mo3502k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f2951a = 1;
            this.f2954d = f;
            this.f2955e = f2;
            this.f2953c = f3;
            this.f2957g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }
}
