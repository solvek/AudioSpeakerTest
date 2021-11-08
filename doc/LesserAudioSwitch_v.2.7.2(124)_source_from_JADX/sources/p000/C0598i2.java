package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: i2 */
public class C0598i2 {

    /* renamed from: a */
    public final TextView f2512a;

    /* renamed from: b */
    public C0452f3 f2513b;

    /* renamed from: c */
    public C0452f3 f2514c;

    /* renamed from: d */
    public C0452f3 f2515d;

    /* renamed from: e */
    public C0452f3 f2516e;

    /* renamed from: f */
    public C0452f3 f2517f;

    /* renamed from: g */
    public C0452f3 f2518g;

    /* renamed from: h */
    public C0452f3 f2519h;

    /* renamed from: i */
    public final C0706k2 f2520i;

    /* renamed from: j */
    public int f2521j = 0;

    /* renamed from: k */
    public int f2522k = -1;

    /* renamed from: l */
    public Typeface f2523l;

    /* renamed from: m */
    public boolean f2524m;

    /* renamed from: i2$a */
    public class C0599a extends C0757l6 {

        /* renamed from: a */
        public final /* synthetic */ int f2525a;

        /* renamed from: b */
        public final /* synthetic */ int f2526b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f2527c;

        public C0599a(int i, int i2, WeakReference weakReference) {
            this.f2525a = i;
            this.f2526b = i2;
            this.f2527c = weakReference;
        }

        /* renamed from: c */
        public void mo2733c(int i) {
        }

        /* renamed from: d */
        public void mo2734d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f2525a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f2526b & 2) != 0);
            }
            C0598i2 i2Var = C0598i2.this;
            WeakReference weakReference = this.f2527c;
            if (i2Var.f2524m) {
                i2Var.f2523l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, i2Var.f2521j);
                }
            }
        }
    }

    public C0598i2(TextView textView) {
        this.f2512a = textView;
        this.f2520i = new C0706k2(textView);
    }

    /* renamed from: c */
    public static C0452f3 m1901c(Context context, C1231v1 v1Var, int i) {
        ColorStateList d = v1Var.mo4803d(context, i);
        if (d == null) {
            return null;
        }
        C0452f3 f3Var = new C0452f3();
        f3Var.f2092d = true;
        f3Var.f2089a = d;
        return f3Var;
    }

    /* renamed from: a */
    public final void mo3112a(Drawable drawable, C0452f3 f3Var) {
        if (drawable != null && f3Var != null) {
            C1231v1.m3416f(drawable, f3Var, this.f2512a.getDrawableState());
        }
    }

    /* renamed from: b */
    public void mo3113b() {
        if (!(this.f2513b == null && this.f2514c == null && this.f2515d == null && this.f2516e == null)) {
            Drawable[] compoundDrawables = this.f2512a.getCompoundDrawables();
            mo3112a(compoundDrawables[0], this.f2513b);
            mo3112a(compoundDrawables[1], this.f2514c);
            mo3112a(compoundDrawables[2], this.f2515d);
            mo3112a(compoundDrawables[3], this.f2516e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f2517f != null || this.f2518g != null) {
            Drawable[] compoundDrawablesRelative = this.f2512a.getCompoundDrawablesRelative();
            mo3112a(compoundDrawablesRelative[0], this.f2517f);
            mo3112a(compoundDrawablesRelative[2], this.f2518g);
        }
    }

    /* renamed from: d */
    public boolean mo3114d() {
        C0706k2 k2Var = this.f2520i;
        return k2Var.mo3501j() && k2Var.f2951a != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03c1, code lost:
        if (r3[2] != null) goto L_0x03c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011a  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3115e(android.util.AttributeSet r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r8 = r26
            r9 = r27
            android.widget.TextView r1 = r0.f2512a
            android.content.Context r10 = r1.getContext()
            v1 r11 = p000.C1231v1.m3413a()
            int[] r3 = p000.C0440f.f2054h
            r12 = 0
            h3 r13 = p000.C0555h3.m1825q(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.f2512a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.f2425b
            r7 = 0
            r4 = r26
            r6 = r27
            p000.C0813m8.m2456E(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.mo3032l(r12, r14)
            r15 = 3
            boolean r2 = r13.mo3035o(r15)
            if (r2 == 0) goto L_0x003d
            int r2 = r13.mo3032l(r15, r12)
            f3 r2 = m1901c(r10, r11, r2)
            r0.f2513b = r2
        L_0x003d:
            r7 = 1
            boolean r2 = r13.mo3035o(r7)
            if (r2 == 0) goto L_0x004e
            int r2 = r13.mo3032l(r7, r12)
            f3 r2 = m1901c(r10, r11, r2)
            r0.f2514c = r2
        L_0x004e:
            r6 = 4
            boolean r2 = r13.mo3035o(r6)
            if (r2 == 0) goto L_0x005f
            int r2 = r13.mo3032l(r6, r12)
            f3 r2 = m1901c(r10, r11, r2)
            r0.f2515d = r2
        L_0x005f:
            r5 = 2
            boolean r2 = r13.mo3035o(r5)
            if (r2 == 0) goto L_0x0070
            int r2 = r13.mo3032l(r5, r12)
            f3 r2 = m1901c(r10, r11, r2)
            r0.f2516e = r2
        L_0x0070:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 6
            r3 = 5
            r7 = 17
            if (r2 < r7) goto L_0x0098
            boolean r17 = r13.mo3035o(r3)
            if (r17 == 0) goto L_0x0088
            int r5 = r13.mo3032l(r3, r12)
            f3 r5 = m1901c(r10, r11, r5)
            r0.f2517f = r5
        L_0x0088:
            boolean r5 = r13.mo3035o(r4)
            if (r5 == 0) goto L_0x0098
            int r5 = r13.mo3032l(r4, r12)
            f3 r5 = m1901c(r10, r11, r5)
            r0.f2518g = r5
        L_0x0098:
            android.content.res.TypedArray r5 = r13.f2425b
            r5.recycle()
            android.widget.TextView r5 = r0.f2512a
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r13 = 23
            r4 = 14
            if (r1 == r14) goto L_0x0122
            int[] r7 = p000.C0440f.f2070x
            h3 r14 = new h3
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r7)
            r14.<init>(r10, r1)
            if (r5 != 0) goto L_0x00c4
            boolean r1 = r14.mo3035o(r4)
            if (r1 == 0) goto L_0x00c4
            boolean r1 = r14.mo3021a(r4, r12)
            r7 = 1
            goto L_0x00c6
        L_0x00c4:
            r1 = 0
            r7 = 0
        L_0x00c6:
            r0.mo3122l(r10, r14)
            if (r2 >= r13) goto L_0x00f2
            boolean r20 = r14.mo3035o(r15)
            if (r20 == 0) goto L_0x00d6
            android.content.res.ColorStateList r20 = r14.mo3023c(r15)
            goto L_0x00d8
        L_0x00d6:
            r20 = 0
        L_0x00d8:
            boolean r21 = r14.mo3035o(r6)
            if (r21 == 0) goto L_0x00e3
            android.content.res.ColorStateList r21 = r14.mo3023c(r6)
            goto L_0x00e5
        L_0x00e3:
            r21 = 0
        L_0x00e5:
            boolean r22 = r14.mo3035o(r3)
            if (r22 == 0) goto L_0x00f6
            android.content.res.ColorStateList r22 = r14.mo3023c(r3)
            r3 = 15
            goto L_0x00fa
        L_0x00f2:
            r20 = 0
            r21 = 0
        L_0x00f6:
            r3 = 15
            r22 = 0
        L_0x00fa:
            boolean r18 = r14.mo3035o(r3)
            if (r18 == 0) goto L_0x0107
            java.lang.String r23 = r14.mo3033m(r3)
            r3 = 26
            goto L_0x010b
        L_0x0107:
            r3 = 26
            r23 = 0
        L_0x010b:
            if (r2 < r3) goto L_0x011a
            r3 = 13
            boolean r19 = r14.mo3035o(r3)
            if (r19 == 0) goto L_0x011a
            java.lang.String r24 = r14.mo3033m(r3)
            goto L_0x011c
        L_0x011a:
            r24 = 0
        L_0x011c:
            android.content.res.TypedArray r3 = r14.f2425b
            r3.recycle()
            goto L_0x012e
        L_0x0122:
            r1 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x012e:
            int[] r3 = p000.C0440f.f2070x
            h3 r14 = new h3
            android.content.res.TypedArray r3 = r10.obtainStyledAttributes(r8, r3, r9, r12)
            r14.<init>(r10, r3)
            if (r5 != 0) goto L_0x0146
            boolean r3 = r14.mo3035o(r4)
            if (r3 == 0) goto L_0x0146
            boolean r1 = r14.mo3021a(r4, r12)
            r7 = 1
        L_0x0146:
            if (r2 >= r13) goto L_0x0167
            boolean r3 = r14.mo3035o(r15)
            if (r3 == 0) goto L_0x0152
            android.content.res.ColorStateList r20 = r14.mo3023c(r15)
        L_0x0152:
            boolean r3 = r14.mo3035o(r6)
            if (r3 == 0) goto L_0x015c
            android.content.res.ColorStateList r21 = r14.mo3023c(r6)
        L_0x015c:
            r3 = 5
            boolean r13 = r14.mo3035o(r3)
            if (r13 == 0) goto L_0x0167
            android.content.res.ColorStateList r22 = r14.mo3023c(r3)
        L_0x0167:
            r13 = r20
            r3 = r21
            r4 = r22
            r6 = 15
            boolean r21 = r14.mo3035o(r6)
            if (r21 == 0) goto L_0x0179
            java.lang.String r23 = r14.mo3033m(r6)
        L_0x0179:
            r6 = r23
            r15 = 26
            if (r2 < r15) goto L_0x018c
            r15 = 13
            boolean r19 = r14.mo3035o(r15)
            if (r19 == 0) goto L_0x018e
            java.lang.String r24 = r14.mo3033m(r15)
            goto L_0x018e
        L_0x018c:
            r15 = 13
        L_0x018e:
            r21 = r11
            r15 = r24
            r11 = 28
            if (r2 < r11) goto L_0x01a9
            boolean r11 = r14.mo3035o(r12)
            if (r11 == 0) goto L_0x01a9
            r11 = -1
            int r22 = r14.mo3026f(r12, r11)
            if (r22 != 0) goto L_0x01a9
            android.widget.TextView r11 = r0.f2512a
            r8 = 0
            r11.setTextSize(r12, r8)
        L_0x01a9:
            r0.mo3122l(r10, r14)
            android.content.res.TypedArray r8 = r14.f2425b
            r8.recycle()
            if (r13 == 0) goto L_0x01b8
            android.widget.TextView r8 = r0.f2512a
            r8.setTextColor(r13)
        L_0x01b8:
            if (r3 == 0) goto L_0x01bf
            android.widget.TextView r8 = r0.f2512a
            r8.setHintTextColor(r3)
        L_0x01bf:
            if (r4 == 0) goto L_0x01c6
            android.widget.TextView r3 = r0.f2512a
            r3.setLinkTextColor(r4)
        L_0x01c6:
            if (r5 != 0) goto L_0x01cf
            if (r7 == 0) goto L_0x01cf
            android.widget.TextView r3 = r0.f2512a
            r3.setAllCaps(r1)
        L_0x01cf:
            android.graphics.Typeface r1 = r0.f2523l
            if (r1 == 0) goto L_0x01e5
            int r3 = r0.f2522k
            r4 = -1
            if (r3 != r4) goto L_0x01e0
            android.widget.TextView r3 = r0.f2512a
            int r4 = r0.f2521j
            r3.setTypeface(r1, r4)
            goto L_0x01e5
        L_0x01e0:
            android.widget.TextView r3 = r0.f2512a
            r3.setTypeface(r1)
        L_0x01e5:
            if (r15 == 0) goto L_0x01ec
            android.widget.TextView r1 = r0.f2512a
            r1.setFontVariationSettings(r15)
        L_0x01ec:
            r8 = 24
            if (r6 == 0) goto L_0x0213
            if (r2 < r8) goto L_0x01fc
            android.widget.TextView r1 = r0.f2512a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r6)
            r1.setTextLocales(r2)
            goto L_0x0213
        L_0x01fc:
            r1 = 21
            if (r2 < r1) goto L_0x0213
            r1 = 44
            int r1 = r6.indexOf(r1)
            java.lang.String r1 = r6.substring(r12, r1)
            android.widget.TextView r2 = r0.f2512a
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            r2.setTextLocale(r1)
        L_0x0213:
            k2 r11 = r0.f2520i
            android.content.Context r1 = r11.f2960j
            int[] r3 = p000.C0440f.f2055i
            r13 = r26
            android.content.res.TypedArray r14 = r1.obtainStyledAttributes(r13, r3, r9, r12)
            android.widget.TextView r1 = r11.f2959i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r15 = 5
            r5 = 6
            r6 = 14
            r4 = r26
            r8 = 2
            r5 = r14
            r8 = 4
            r6 = r27
            r9 = 1
            p000.C0813m8.m2456E(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r14.hasValue(r15)
            if (r1 == 0) goto L_0x0241
            int r1 = r14.getInt(r15, r12)
            r11.f2951a = r1
        L_0x0241:
            boolean r1 = r14.hasValue(r8)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x024e
            float r1 = r14.getDimension(r8, r2)
            goto L_0x0250
        L_0x024e:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0250:
            r3 = 2
            boolean r4 = r14.hasValue(r3)
            if (r4 == 0) goto L_0x025c
            float r4 = r14.getDimension(r3, r2)
            goto L_0x025e
        L_0x025c:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x025e:
            boolean r3 = r14.hasValue(r9)
            if (r3 == 0) goto L_0x0269
            float r3 = r14.getDimension(r9, r2)
            goto L_0x026b
        L_0x0269:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x026b:
            r5 = 3
            boolean r6 = r14.hasValue(r5)
            if (r6 == 0) goto L_0x02a1
            int r6 = r14.getResourceId(r5, r12)
            if (r6 <= 0) goto L_0x02a1
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.TypedArray r5 = r5.obtainTypedArray(r6)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x029e
            r8 = 0
        L_0x0289:
            if (r8 >= r6) goto L_0x0295
            r15 = -1
            int r16 = r5.getDimensionPixelSize(r8, r15)
            r7[r8] = r16
            int r8 = r8 + 1
            goto L_0x0289
        L_0x0295:
            int[] r6 = r11.mo3496c(r7)
            r11.f2956f = r6
            r11.mo3500i()
        L_0x029e:
            r5.recycle()
        L_0x02a1:
            r14.recycle()
            boolean r5 = r11.mo3501j()
            if (r5 == 0) goto L_0x02e0
            int r5 = r11.f2951a
            if (r5 != r9) goto L_0x02e2
            boolean r5 = r11.f2957g
            if (r5 != 0) goto L_0x02dc
            android.content.Context r5 = r11.f2960j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02c8
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = 2
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
            goto L_0x02c9
        L_0x02c8:
            r6 = 2
        L_0x02c9:
            int r7 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x02d3
            r3 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r6, r3, r5)
        L_0x02d3:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x02d9
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02d9:
            r11.mo3502k(r4, r3, r1)
        L_0x02dc:
            r11.mo3499h()
            goto L_0x02e2
        L_0x02e0:
            r11.f2951a = r12
        L_0x02e2:
            boolean r1 = p000.C0214b9.f1256a
            if (r1 == 0) goto L_0x031f
            k2 r1 = r0.f2520i
            int r3 = r1.f2951a
            if (r3 == 0) goto L_0x031f
            int[] r1 = r1.f2956f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x031f
            android.widget.TextView r3 = r0.f2512a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x031a
            android.widget.TextView r1 = r0.f2512a
            k2 r2 = r0.f2520i
            float r2 = r2.f2954d
            int r2 = java.lang.Math.round(r2)
            k2 r3 = r0.f2520i
            float r3 = r3.f2955e
            int r3 = java.lang.Math.round(r3)
            k2 r4 = r0.f2520i
            float r4 = r4.f2953c
            int r4 = java.lang.Math.round(r4)
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r12)
            goto L_0x031f
        L_0x031a:
            android.widget.TextView r2 = r0.f2512a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r12)
        L_0x031f:
            int[] r1 = p000.C0440f.f2055i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r13, r1)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0337
            r4 = r21
            android.graphics.drawable.Drawable r7 = r4.mo4802b(r10, r2)
            r2 = 13
            goto L_0x033c
        L_0x0337:
            r4 = r21
            r2 = 13
            r7 = 0
        L_0x033c:
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0347
            android.graphics.drawable.Drawable r2 = r4.mo4802b(r10, r2)
            goto L_0x0348
        L_0x0347:
            r2 = 0
        L_0x0348:
            r5 = 9
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0355
            android.graphics.drawable.Drawable r5 = r4.mo4802b(r10, r5)
            goto L_0x0356
        L_0x0355:
            r5 = 0
        L_0x0356:
            r6 = 6
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x0362
            android.graphics.drawable.Drawable r6 = r4.mo4802b(r10, r6)
            goto L_0x0363
        L_0x0362:
            r6 = 0
        L_0x0363:
            r8 = 10
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x0370
            android.graphics.drawable.Drawable r8 = r4.mo4802b(r10, r8)
            goto L_0x0371
        L_0x0370:
            r8 = 0
        L_0x0371:
            r11 = 7
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x037d
            android.graphics.drawable.Drawable r3 = r4.mo4802b(r10, r11)
            goto L_0x037e
        L_0x037d:
            r3 = 0
        L_0x037e:
            int r4 = android.os.Build.VERSION.SDK_INT
            r11 = 17
            if (r4 < r11) goto L_0x03aa
            if (r8 != 0) goto L_0x0388
            if (r3 == 0) goto L_0x03aa
        L_0x0388:
            android.widget.TextView r5 = r0.f2512a
            android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawablesRelative()
            android.widget.TextView r7 = r0.f2512a
            if (r8 == 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r8 = r5[r12]
        L_0x0395:
            if (r2 == 0) goto L_0x0398
            goto L_0x039a
        L_0x0398:
            r2 = r5[r9]
        L_0x039a:
            if (r3 == 0) goto L_0x039d
            goto L_0x03a0
        L_0x039d:
            r3 = 2
            r3 = r5[r3]
        L_0x03a0:
            if (r6 == 0) goto L_0x03a3
            goto L_0x03a6
        L_0x03a3:
            r6 = 3
            r6 = r5[r6]
        L_0x03a6:
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r3, r6)
            goto L_0x03fb
        L_0x03aa:
            if (r7 != 0) goto L_0x03b2
            if (r2 != 0) goto L_0x03b2
            if (r5 != 0) goto L_0x03b2
            if (r6 == 0) goto L_0x03fb
        L_0x03b2:
            if (r4 < r11) goto L_0x03da
            android.widget.TextView r3 = r0.f2512a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r8 = r3[r12]
            if (r8 != 0) goto L_0x03c4
            r8 = 2
            r13 = r3[r8]
            if (r13 == 0) goto L_0x03da
            goto L_0x03c5
        L_0x03c4:
            r8 = 2
        L_0x03c5:
            android.widget.TextView r5 = r0.f2512a
            r7 = r3[r12]
            if (r2 == 0) goto L_0x03cc
            goto L_0x03ce
        L_0x03cc:
            r2 = r3[r9]
        L_0x03ce:
            r8 = r3[r8]
            if (r6 == 0) goto L_0x03d3
            goto L_0x03d6
        L_0x03d3:
            r6 = 3
            r6 = r3[r6]
        L_0x03d6:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r2, r8, r6)
            goto L_0x03fb
        L_0x03da:
            android.widget.TextView r3 = r0.f2512a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r8 = r0.f2512a
            if (r7 == 0) goto L_0x03e5
            goto L_0x03e7
        L_0x03e5:
            r7 = r3[r12]
        L_0x03e7:
            if (r2 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            r2 = r3[r9]
        L_0x03ec:
            if (r5 == 0) goto L_0x03ef
            goto L_0x03f2
        L_0x03ef:
            r5 = 2
            r5 = r3[r5]
        L_0x03f2:
            if (r6 == 0) goto L_0x03f5
            goto L_0x03f8
        L_0x03f5:
            r6 = 3
            r6 = r3[r6]
        L_0x03f8:
            r8.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
        L_0x03fb:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0430
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0416
            int r3 = r1.getResourceId(r2, r12)
            if (r3 == 0) goto L_0x0416
            android.content.res.ColorStateList r3 = p000.C0399e0.m1529a(r10, r3)
            if (r3 == 0) goto L_0x0416
            goto L_0x041a
        L_0x0416:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x041a:
            android.widget.TextView r2 = r0.f2512a
            r2.getClass()
            r5 = 24
            if (r4 < r5) goto L_0x0427
            r2.setCompoundDrawableTintList(r3)
            goto L_0x0430
        L_0x0427:
            boolean r5 = r2 instanceof p000.C0458f9
            if (r5 == 0) goto L_0x0430
            f9 r2 = (p000.C0458f9) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0430:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0458
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = p000.C0912o2.m2667d(r2, r3)
            android.widget.TextView r3 = r0.f2512a
            r3.getClass()
            r5 = 24
            if (r4 < r5) goto L_0x044f
            r3.setCompoundDrawableTintMode(r2)
            goto L_0x0458
        L_0x044f:
            boolean r4 = r3 instanceof p000.C0458f9
            if (r4 == 0) goto L_0x0458
            f9 r3 = (p000.C0458f9) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x0458:
            r2 = 14
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            int r4 = r1.getDimensionPixelSize(r11, r3)
            r5 = 18
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x0473
            android.widget.TextView r1 = r0.f2512a
            p000.C1344x5.m3738T(r1, r2)
        L_0x0473:
            if (r4 == r3) goto L_0x047a
            android.widget.TextView r1 = r0.f2512a
            p000.C1344x5.m3741W(r1, r4)
        L_0x047a:
            if (r5 == r3) goto L_0x0481
            android.widget.TextView r1 = r0.f2512a
            p000.C1344x5.m3743Y(r1, r5)
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0598i2.mo3115e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void mo3116f(Context context, int i) {
        String m;
        ColorStateList c;
        C0555h3 h3Var = new C0555h3(context, context.obtainStyledAttributes(i, C0440f.f2070x));
        if (h3Var.mo3035o(14)) {
            this.f2512a.setAllCaps(h3Var.mo3021a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 && h3Var.mo3035o(3) && (c = h3Var.mo3023c(3)) != null) {
            this.f2512a.setTextColor(c);
        }
        if (h3Var.mo3035o(0) && h3Var.mo3026f(0, -1) == 0) {
            this.f2512a.setTextSize(0, 0.0f);
        }
        mo3122l(context, h3Var);
        if (i2 >= 26 && h3Var.mo3035o(13) && (m = h3Var.mo3033m(13)) != null) {
            this.f2512a.setFontVariationSettings(m);
        }
        h3Var.f2425b.recycle();
        Typeface typeface = this.f2523l;
        if (typeface != null) {
            this.f2512a.setTypeface(typeface, this.f2521j);
        }
    }

    /* renamed from: g */
    public void mo3117g(int i, int i2, int i3, int i4) {
        C0706k2 k2Var = this.f2520i;
        if (k2Var.mo3501j()) {
            DisplayMetrics displayMetrics = k2Var.f2960j.getResources().getDisplayMetrics();
            k2Var.mo3502k(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (k2Var.mo3499h()) {
                k2Var.mo3495b();
            }
        }
    }

    /* renamed from: h */
    public void mo3118h(int[] iArr, int i) {
        C0706k2 k2Var = this.f2520i;
        if (k2Var.mo3501j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = k2Var.f2960j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                k2Var.f2956f = k2Var.mo3496c(iArr2);
                if (!k2Var.mo3500i()) {
                    StringBuilder c = C0279ch.m1106c("None of the preset sizes is valid: ");
                    c.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(c.toString());
                }
            } else {
                k2Var.f2957g = false;
            }
            if (k2Var.mo3499h()) {
                k2Var.mo3495b();
            }
        }
    }

    /* renamed from: i */
    public void mo3119i(int i) {
        C0706k2 k2Var = this.f2520i;
        if (!k2Var.mo3501j()) {
            return;
        }
        if (i == 0) {
            k2Var.f2951a = 0;
            k2Var.f2954d = -1.0f;
            k2Var.f2955e = -1.0f;
            k2Var.f2953c = -1.0f;
            k2Var.f2956f = new int[0];
            k2Var.f2952b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = k2Var.f2960j.getResources().getDisplayMetrics();
            k2Var.mo3502k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (k2Var.mo3499h()) {
                k2Var.mo3495b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* renamed from: j */
    public void mo3120j(ColorStateList colorStateList) {
        if (this.f2519h == null) {
            this.f2519h = new C0452f3();
        }
        C0452f3 f3Var = this.f2519h;
        f3Var.f2089a = colorStateList;
        f3Var.f2092d = colorStateList != null;
        this.f2513b = f3Var;
        this.f2514c = f3Var;
        this.f2515d = f3Var;
        this.f2516e = f3Var;
        this.f2517f = f3Var;
        this.f2518g = f3Var;
    }

    /* renamed from: k */
    public void mo3121k(PorterDuff.Mode mode) {
        if (this.f2519h == null) {
            this.f2519h = new C0452f3();
        }
        C0452f3 f3Var = this.f2519h;
        f3Var.f2090b = mode;
        f3Var.f2091c = mode != null;
        this.f2513b = f3Var;
        this.f2514c = f3Var;
        this.f2515d = f3Var;
        this.f2516e = f3Var;
        this.f2517f = f3Var;
        this.f2518g = f3Var;
    }

    /* renamed from: l */
    public final void mo3122l(Context context, C0555h3 h3Var) {
        String m;
        Typeface typeface;
        Typeface typeface2;
        this.f2521j = h3Var.mo3030j(2, this.f2521j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int j = h3Var.mo3030j(11, -1);
            this.f2522k = j;
            if (j != -1) {
                this.f2521j = (this.f2521j & 2) | 0;
            }
        }
        int i2 = 10;
        if (h3Var.mo3035o(10) || h3Var.mo3035o(12)) {
            this.f2523l = null;
            if (h3Var.mo3035o(12)) {
                i2 = 12;
            }
            int i3 = this.f2522k;
            int i4 = this.f2521j;
            if (!context.isRestricted()) {
                try {
                    Typeface i5 = h3Var.mo3029i(i2, this.f2521j, new C0599a(i3, i4, new WeakReference(this.f2512a)));
                    if (i5 != null) {
                        if (i >= 28 && this.f2522k != -1) {
                            i5 = Typeface.create(Typeface.create(i5, 0), this.f2522k, (this.f2521j & 2) != 0);
                        }
                        this.f2523l = i5;
                    }
                    this.f2524m = this.f2523l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2523l == null && (m = h3Var.mo3033m(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f2522k == -1) {
                    typeface = Typeface.create(m, this.f2521j);
                } else {
                    Typeface create = Typeface.create(m, 0);
                    int i6 = this.f2522k;
                    if ((this.f2521j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.f2523l = typeface;
            }
        } else if (h3Var.mo3035o(1)) {
            this.f2524m = false;
            int j2 = h3Var.mo3030j(1, 1);
            if (j2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f2523l = typeface2;
        }
    }
}
