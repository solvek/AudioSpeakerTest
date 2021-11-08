package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p000.C1151t7;
import p000.C1215uk;

/* renamed from: pk */
public final class C0981pk {

    /* renamed from: T */
    public static final boolean f3662T = (Build.VERSION.SDK_INT < 18);

    /* renamed from: A */
    public Bitmap f3663A;

    /* renamed from: B */
    public Paint f3664B;

    /* renamed from: C */
    public float f3665C;

    /* renamed from: D */
    public float f3666D;

    /* renamed from: E */
    public int[] f3667E;

    /* renamed from: F */
    public boolean f3668F;

    /* renamed from: G */
    public final TextPaint f3669G;

    /* renamed from: H */
    public final TextPaint f3670H;

    /* renamed from: I */
    public TimeInterpolator f3671I;

    /* renamed from: J */
    public TimeInterpolator f3672J;

    /* renamed from: K */
    public float f3673K;

    /* renamed from: L */
    public float f3674L;

    /* renamed from: M */
    public float f3675M;

    /* renamed from: N */
    public ColorStateList f3676N;

    /* renamed from: O */
    public StaticLayout f3677O;

    /* renamed from: P */
    public float f3678P;

    /* renamed from: Q */
    public float f3679Q;

    /* renamed from: R */
    public float f3680R;

    /* renamed from: S */
    public CharSequence f3681S;

    /* renamed from: a */
    public final View f3682a;

    /* renamed from: b */
    public boolean f3683b;

    /* renamed from: c */
    public float f3684c;

    /* renamed from: d */
    public final Rect f3685d;

    /* renamed from: e */
    public final Rect f3686e;

    /* renamed from: f */
    public final RectF f3687f;

    /* renamed from: g */
    public int f3688g = 16;

    /* renamed from: h */
    public int f3689h = 16;

    /* renamed from: i */
    public float f3690i = 15.0f;

    /* renamed from: j */
    public float f3691j = 15.0f;

    /* renamed from: k */
    public ColorStateList f3692k;

    /* renamed from: l */
    public ColorStateList f3693l;

    /* renamed from: m */
    public float f3694m;

    /* renamed from: n */
    public float f3695n;

    /* renamed from: o */
    public float f3696o;

    /* renamed from: p */
    public float f3697p;

    /* renamed from: q */
    public float f3698q;

    /* renamed from: r */
    public float f3699r;

    /* renamed from: s */
    public Typeface f3700s;

    /* renamed from: t */
    public Typeface f3701t;

    /* renamed from: u */
    public Typeface f3702u;

    /* renamed from: v */
    public C0384dl f3703v;

    /* renamed from: w */
    public CharSequence f3704w;

    /* renamed from: x */
    public CharSequence f3705x;

    /* renamed from: y */
    public boolean f3706y;

    /* renamed from: z */
    public boolean f3707z;

    public C0981pk(View view) {
        this.f3682a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f3669G = textPaint;
        this.f3670H = new TextPaint(textPaint);
        this.f3686e = new Rect();
        this.f3685d = new Rect();
        this.f3687f = new RectF();
    }

    /* renamed from: a */
    public static int m2867a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    /* renamed from: i */
    public static float m2868i(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = C0831mh.f3286a;
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: l */
    public static boolean m2869l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    public float mo4028b() {
        if (this.f3704w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f3670H;
        textPaint.setTextSize(this.f3691j);
        textPaint.setTypeface(this.f3700s);
        TextPaint textPaint2 = this.f3670H;
        CharSequence charSequence = this.f3704w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final boolean mo4029c(CharSequence charSequence) {
        boolean z = true;
        if (C0813m8.m2478l(this.f3682a) != 1) {
            z = false;
        }
        return ((C1151t7.C1154c) (z ? C1151t7.f4391d : C1151t7.f4390c)).mo4633b(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public final void mo4030d(float f) {
        int i;
        TextPaint textPaint;
        this.f3687f.left = m2868i((float) this.f3685d.left, (float) this.f3686e.left, f, this.f3671I);
        this.f3687f.top = m2868i(this.f3694m, this.f3695n, f, this.f3671I);
        this.f3687f.right = m2868i((float) this.f3685d.right, (float) this.f3686e.right, f, this.f3671I);
        this.f3687f.bottom = m2868i((float) this.f3685d.bottom, (float) this.f3686e.bottom, f, this.f3671I);
        this.f3698q = m2868i(this.f3696o, this.f3697p, f, this.f3671I);
        this.f3699r = m2868i(this.f3694m, this.f3695n, f, this.f3671I);
        mo4040p(m2868i(this.f3690i, this.f3691j, f, this.f3672J));
        TimeInterpolator timeInterpolator = C0831mh.f3287b;
        this.f3678P = 1.0f - m2868i(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        C0813m8.m2490x(this.f3682a);
        this.f3679Q = m2868i(1.0f, 0.0f, f, timeInterpolator);
        C0813m8.m2490x(this.f3682a);
        ColorStateList colorStateList = this.f3693l;
        ColorStateList colorStateList2 = this.f3692k;
        if (colorStateList != colorStateList2) {
            textPaint = this.f3669G;
            i = m2867a(mo4034h(colorStateList2), mo4033g(), f);
        } else {
            textPaint = this.f3669G;
            i = mo4033g();
        }
        textPaint.setColor(i);
        this.f3669G.setShadowLayer(m2868i(0.0f, this.f3673K, f, (TimeInterpolator) null), m2868i(0.0f, this.f3674L, f, (TimeInterpolator) null), m2868i(0.0f, this.f3675M, f, (TimeInterpolator) null), m2867a(mo4034h((ColorStateList) null), mo4034h(this.f3676N), f));
        C0813m8.m2490x(this.f3682a);
    }

    /* renamed from: e */
    public final void mo4031e(float f) {
        float f2;
        boolean z;
        StaticLayout staticLayout;
        if (this.f3704w != null) {
            float width = (float) this.f3686e.width();
            float width2 = (float) this.f3685d.width();
            if (Math.abs(f - this.f3691j) < 0.001f) {
                f2 = this.f3691j;
                this.f3665C = 1.0f;
                Typeface typeface = this.f3702u;
                Typeface typeface2 = this.f3700s;
                if (typeface != typeface2) {
                    this.f3702u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f3690i;
                Typeface typeface3 = this.f3702u;
                Typeface typeface4 = this.f3701t;
                if (typeface3 != typeface4) {
                    this.f3702u = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(f - f3) < 0.001f) {
                    this.f3665C = 1.0f;
                } else {
                    this.f3665C = f / this.f3690i;
                }
                float f4 = this.f3691j / this.f3690i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z = this.f3666D != f2 || this.f3668F || z;
                this.f3666D = f2;
                this.f3668F = false;
            }
            if (this.f3705x == null || z) {
                this.f3669G.setTextSize(this.f3666D);
                this.f3669G.setTypeface(this.f3702u);
                this.f3669G.setLinearText(this.f3665C != 1.0f);
                boolean c = mo4029c(this.f3704w);
                this.f3706y = c;
                try {
                    C1215uk ukVar = new C1215uk(this.f3704w, this.f3669G, (int) width);
                    ukVar.f4646i = TextUtils.TruncateAt.END;
                    ukVar.f4645h = c;
                    ukVar.f4642e = Layout.Alignment.ALIGN_NORMAL;
                    ukVar.f4644g = false;
                    ukVar.f4643f = 1;
                    staticLayout = ukVar.mo4780a();
                } catch (C1215uk.C1216a e) {
                    e.getCause().getMessage();
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.f3677O = staticLayout;
                this.f3705x = staticLayout.getText();
            }
        }
    }

    /* renamed from: f */
    public float mo4032f() {
        TextPaint textPaint = this.f3670H;
        textPaint.setTextSize(this.f3691j);
        textPaint.setTypeface(this.f3700s);
        return -this.f3670H.ascent();
    }

    /* renamed from: g */
    public int mo4033g() {
        return mo4034h(this.f3693l);
    }

    /* renamed from: h */
    public final int mo4034h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f3667E;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: j */
    public void mo4035j() {
        this.f3683b = this.f3686e.width() > 0 && this.f3686e.height() > 0 && this.f3685d.width() > 0 && this.f3685d.height() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4036k() {
        /*
            r13 = this;
            android.view.View r0 = r13.f3682a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x012c
            android.view.View r0 = r13.f3682a
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L_0x012c
            float r0 = r13.f3666D
            float r1 = r13.f3691j
            r13.mo4031e(r1)
            java.lang.CharSequence r1 = r13.f3705x
            if (r1 == 0) goto L_0x002e
            android.text.StaticLayout r2 = r13.f3677O
            if (r2 == 0) goto L_0x002e
            android.text.TextPaint r3 = r13.f3669G
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.f3681S = r1
        L_0x002e:
            java.lang.CharSequence r1 = r13.f3681S
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x003f
            android.text.TextPaint r4 = r13.f3669G
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            int r4 = r13.f3689h
            boolean r5 = r13.f3706y
            int r4 = p000.C1344x5.m3775t(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x007a
            if (r5 == r6) goto L_0x006b
            android.text.TextPaint r5 = r13.f3669G
            float r5 = r5.descent()
            android.text.TextPaint r9 = r13.f3669G
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r13.f3686e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            goto L_0x0077
        L_0x006b:
            android.graphics.Rect r5 = r13.f3686e
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r13.f3669G
            float r9 = r9.ascent()
            float r9 = r9 + r5
        L_0x0077:
            r13.f3695n = r9
            goto L_0x0081
        L_0x007a:
            android.graphics.Rect r5 = r13.f3686e
            int r5 = r5.top
            float r5 = (float) r5
            r13.f3695n = r5
        L_0x0081:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0099
            if (r4 == r9) goto L_0x0093
            android.graphics.Rect r1 = r13.f3686e
            int r1 = r1.left
            float r1 = (float) r1
            r13.f3697p = r1
            goto L_0x00a4
        L_0x0093:
            android.graphics.Rect r4 = r13.f3686e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x00a1
        L_0x0099:
            android.graphics.Rect r4 = r13.f3686e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x00a1:
            float r4 = r4 - r1
            r13.f3697p = r4
        L_0x00a4:
            float r1 = r13.f3690i
            r13.mo4031e(r1)
            android.text.StaticLayout r1 = r13.f3677O
            if (r1 == 0) goto L_0x00b3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            java.lang.CharSequence r4 = r13.f3705x
            if (r4 == 0) goto L_0x00c3
            android.text.TextPaint r11 = r13.f3669G
            int r12 = r4.length()
            float r4 = r11.measureText(r4, r2, r12)
            goto L_0x00c4
        L_0x00c3:
            r4 = 0
        L_0x00c4:
            android.text.StaticLayout r11 = r13.f3677O
            if (r11 == 0) goto L_0x00cc
            float r3 = r11.getLineLeft(r2)
        L_0x00cc:
            r13.f3680R = r3
            int r2 = r13.f3688g
            boolean r3 = r13.f3706y
            int r2 = p000.C1344x5.m3775t(r2, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto L_0x00f6
            if (r3 == r6) goto L_0x00e8
            float r1 = r1 / r8
            android.graphics.Rect r3 = r13.f3685d
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r1
            r13.f3694m = r3
            goto L_0x00fd
        L_0x00e8:
            android.graphics.Rect r3 = r13.f3685d
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            android.text.TextPaint r1 = r13.f3669G
            float r1 = r1.descent()
            float r1 = r1 + r3
            goto L_0x00fb
        L_0x00f6:
            android.graphics.Rect r1 = r13.f3685d
            int r1 = r1.top
            float r1 = (float) r1
        L_0x00fb:
            r13.f3694m = r1
        L_0x00fd:
            r1 = r2 & r5
            if (r1 == r10) goto L_0x010f
            if (r1 == r9) goto L_0x0109
            android.graphics.Rect r1 = r13.f3685d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0118
        L_0x0109:
            android.graphics.Rect r1 = r13.f3685d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0117
        L_0x010f:
            android.graphics.Rect r1 = r13.f3685d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r4 = r4 / r8
        L_0x0117:
            float r1 = r1 - r4
        L_0x0118:
            r13.f3696o = r1
            android.graphics.Bitmap r1 = r13.f3663A
            if (r1 == 0) goto L_0x0124
            r1.recycle()
            r1 = 0
            r13.f3663A = r1
        L_0x0124:
            r13.mo4040p(r0)
            float r0 = r13.f3684c
            r13.mo4030d(r0)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0981pk.mo4036k():void");
    }

    /* renamed from: m */
    public void mo4037m(ColorStateList colorStateList) {
        if (this.f3693l != colorStateList) {
            this.f3693l = colorStateList;
            mo4036k();
        }
    }

    /* renamed from: n */
    public void mo4038n(int i) {
        if (this.f3689h != i) {
            this.f3689h = i;
            mo4036k();
        }
    }

    /* renamed from: o */
    public void mo4039o(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f3684c) {
            this.f3684c = f;
            mo4030d(f);
        }
    }

    /* renamed from: p */
    public final void mo4040p(float f) {
        mo4031e(f);
        boolean z = f3662T && this.f3665C != 1.0f;
        this.f3707z = z;
        if (z && this.f3663A == null && !this.f3685d.isEmpty() && !TextUtils.isEmpty(this.f3705x)) {
            mo4030d(0.0f);
            int width = this.f3677O.getWidth();
            int height = this.f3677O.getHeight();
            if (width > 0 && height > 0) {
                this.f3663A = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f3677O.draw(new Canvas(this.f3663A));
                if (this.f3664B == null) {
                    this.f3664B = new Paint(3);
                }
            }
        }
        C0813m8.m2490x(this.f3682a);
    }

    /* renamed from: q */
    public void mo4041q(Typeface typeface) {
        boolean z;
        C0384dl dlVar = this.f3703v;
        boolean z2 = true;
        if (dlVar != null) {
            dlVar.f1908c = true;
        }
        if (this.f3700s != typeface) {
            this.f3700s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f3701t != typeface) {
            this.f3701t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            mo4036k();
        }
    }
}
