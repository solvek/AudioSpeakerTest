package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.BitSet;
import p000.C1269vl;
import p000.C1375xl;

/* renamed from: rl */
public class C1067rl extends Drawable implements C1400y6, C1422yl {

    /* renamed from: x */
    public static final String f3977x = C1067rl.class.getSimpleName();

    /* renamed from: y */
    public static final Paint f3978y = new Paint(1);

    /* renamed from: b */
    public C1069b f3979b;

    /* renamed from: c */
    public final C1375xl.C1381f[] f3980c;

    /* renamed from: d */
    public final C1375xl.C1381f[] f3981d;

    /* renamed from: e */
    public final BitSet f3982e;

    /* renamed from: f */
    public boolean f3983f;

    /* renamed from: g */
    public final Matrix f3984g;

    /* renamed from: h */
    public final Path f3985h;

    /* renamed from: i */
    public final Path f3986i;

    /* renamed from: j */
    public final RectF f3987j;

    /* renamed from: k */
    public final RectF f3988k;

    /* renamed from: l */
    public final Region f3989l;

    /* renamed from: m */
    public final Region f3990m;

    /* renamed from: n */
    public C1217ul f3991n;

    /* renamed from: o */
    public final Paint f3992o;

    /* renamed from: p */
    public final Paint f3993p;

    /* renamed from: q */
    public final C0688jl f3994q;

    /* renamed from: r */
    public final C1269vl.C1270a f3995r;

    /* renamed from: s */
    public final C1269vl f3996s;

    /* renamed from: t */
    public PorterDuffColorFilter f3997t;

    /* renamed from: u */
    public PorterDuffColorFilter f3998u;

    /* renamed from: v */
    public final RectF f3999v;

    /* renamed from: w */
    public boolean f4000w;

    /* renamed from: rl$a */
    public class C1068a implements C1269vl.C1270a {
        public C1068a() {
        }
    }

    /* renamed from: rl$b */
    public static final class C1069b extends Drawable.ConstantState {

        /* renamed from: a */
        public C1217ul f4002a;

        /* renamed from: b */
        public C0383dk f4003b;

        /* renamed from: c */
        public ColorFilter f4004c;

        /* renamed from: d */
        public ColorStateList f4005d = null;

        /* renamed from: e */
        public ColorStateList f4006e = null;

        /* renamed from: f */
        public ColorStateList f4007f = null;

        /* renamed from: g */
        public ColorStateList f4008g = null;

        /* renamed from: h */
        public PorterDuff.Mode f4009h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f4010i = null;

        /* renamed from: j */
        public float f4011j = 1.0f;

        /* renamed from: k */
        public float f4012k = 1.0f;

        /* renamed from: l */
        public float f4013l;

        /* renamed from: m */
        public int f4014m = 255;

        /* renamed from: n */
        public float f4015n = 0.0f;

        /* renamed from: o */
        public float f4016o = 0.0f;

        /* renamed from: p */
        public float f4017p = 0.0f;

        /* renamed from: q */
        public int f4018q = 0;

        /* renamed from: r */
        public int f4019r = 0;

        /* renamed from: s */
        public int f4020s = 0;

        /* renamed from: t */
        public int f4021t = 0;

        /* renamed from: u */
        public boolean f4022u = false;

        /* renamed from: v */
        public Paint.Style f4023v = Paint.Style.FILL_AND_STROKE;

        public C1069b(C1069b bVar) {
            this.f4002a = bVar.f4002a;
            this.f4003b = bVar.f4003b;
            this.f4013l = bVar.f4013l;
            this.f4004c = bVar.f4004c;
            this.f4005d = bVar.f4005d;
            this.f4006e = bVar.f4006e;
            this.f4009h = bVar.f4009h;
            this.f4008g = bVar.f4008g;
            this.f4014m = bVar.f4014m;
            this.f4011j = bVar.f4011j;
            this.f4020s = bVar.f4020s;
            this.f4018q = bVar.f4018q;
            this.f4022u = bVar.f4022u;
            this.f4012k = bVar.f4012k;
            this.f4015n = bVar.f4015n;
            this.f4016o = bVar.f4016o;
            this.f4017p = bVar.f4017p;
            this.f4019r = bVar.f4019r;
            this.f4021t = bVar.f4021t;
            this.f4007f = bVar.f4007f;
            this.f4023v = bVar.f4023v;
            if (bVar.f4010i != null) {
                this.f4010i = new Rect(bVar.f4010i);
            }
        }

        public C1069b(C1217ul ulVar, C0383dk dkVar) {
            this.f4002a = ulVar;
            this.f4003b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C1067rl rlVar = new C1067rl(this);
            rlVar.f3983f = true;
            return rlVar;
        }
    }

    public C1067rl() {
        this(new C1217ul());
    }

    public C1067rl(C1069b bVar) {
        this.f3980c = new C1375xl.C1381f[4];
        this.f3981d = new C1375xl.C1381f[4];
        this.f3982e = new BitSet(8);
        this.f3984g = new Matrix();
        this.f3985h = new Path();
        this.f3986i = new Path();
        this.f3987j = new RectF();
        this.f3988k = new RectF();
        this.f3989l = new Region();
        this.f3990m = new Region();
        Paint paint = new Paint(1);
        this.f3992o = paint;
        Paint paint2 = new Paint(1);
        this.f3993p = paint2;
        this.f3994q = new C0688jl();
        this.f3996s = new C1269vl();
        this.f3999v = new RectF();
        this.f4000w = true;
        this.f3979b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f3978y;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo4308v();
        mo4307u(getState());
        this.f3995r = new C1068a();
    }

    public C1067rl(C1217ul ulVar) {
        this(new C1069b(ulVar, (C0383dk) null));
    }

    /* renamed from: b */
    public final void mo4276b(RectF rectF, Path path) {
        mo4277c(rectF, path);
        if (this.f3979b.f4011j != 1.0f) {
            this.f3984g.reset();
            Matrix matrix = this.f3984g;
            float f = this.f3979b.f4011j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f3984g);
        }
        path.computeBounds(this.f3999v, true);
    }

    /* renamed from: c */
    public final void mo4277c(RectF rectF, Path path) {
        C1269vl vlVar = this.f3996s;
        C1069b bVar = this.f3979b;
        C1217ul ulVar = bVar.f4002a;
        float f = bVar.f4012k;
        vlVar.mo4919a(ulVar, f, rectF, this.f3995r, path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
        r3 = mo4279e(r2);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter mo4278d(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.mo4279e(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.mo4279e(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1067rl.mo4278d(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        if ((r4 < 21 || (!r2.f4002a.mo4781d(mo4287h()) && !r12.f3985h.isConvex() && r4 < 29)) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.f3992o
            android.graphics.PorterDuffColorFilter r1 = r12.f3997t
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r12.f3992o
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r12.f3992o
            rl$b r2 = r12.f3979b
            int r2 = r2.f4014m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r12.f3993p
            android.graphics.PorterDuffColorFilter r2 = r12.f3998u
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r12.f3993p
            rl$b r2 = r12.f3979b
            float r2 = r2.f4013l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.f3993p
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r12.f3993p
            rl$b r3 = r12.f3979b
            int r3 = r3.f4014m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r12.f3983f
            r3 = 0
            if (r2 == 0) goto L_0x00c6
            float r2 = r12.mo4292k()
            float r2 = -r2
            rl$b r4 = r12.f3979b
            ul r4 = r4.f4002a
            r4.getClass()
            ul$b r5 = new ul$b
            r5.<init>(r4)
            nl r6 = r4.f4651e
            boolean r7 = r6 instanceof p000.C1125sl
            if (r7 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            ml r7 = new ml
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0066:
            r5.f4663e = r6
            nl r6 = r4.f4652f
            boolean r7 = r6 instanceof p000.C1125sl
            if (r7 == 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            ml r7 = new ml
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0075:
            r5.f4664f = r6
            nl r6 = r4.f4654h
            boolean r7 = r6 instanceof p000.C1125sl
            if (r7 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            ml r7 = new ml
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0084:
            r5.f4666h = r6
            nl r4 = r4.f4653g
            boolean r6 = r4 instanceof p000.C1125sl
            if (r6 == 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            ml r6 = new ml
            r6.<init>(r2, r4)
            r4 = r6
        L_0x0093:
            r5.f4665g = r4
            ul r7 = r5.mo4783a()
            r12.f3991n = r7
            vl r6 = r12.f3996s
            rl$b r2 = r12.f3979b
            float r8 = r2.f4012k
            android.graphics.RectF r2 = r12.f3988k
            android.graphics.RectF r4 = r12.mo4287h()
            r2.set(r4)
            float r2 = r12.mo4292k()
            android.graphics.RectF r4 = r12.f3988k
            r4.inset(r2, r2)
            android.graphics.RectF r9 = r12.f3988k
            android.graphics.Path r11 = r12.f3986i
            r10 = 0
            r6.mo4919a(r7, r8, r9, r10, r11)
            android.graphics.RectF r2 = r12.mo4287h()
            android.graphics.Path r4 = r12.f3985h
            r12.mo4276b(r2, r4)
            r12.f3983f = r3
        L_0x00c6:
            rl$b r2 = r12.f3979b
            int r4 = r2.f4018q
            r5 = 21
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L_0x00fa
            int r8 = r2.f4019r
            if (r8 <= 0) goto L_0x00fa
            if (r4 == r6) goto L_0x00f8
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L_0x00f5
            ul r2 = r2.f4002a
            android.graphics.RectF r8 = r12.mo4287h()
            boolean r2 = r2.mo4781d(r8)
            if (r2 != 0) goto L_0x00f3
            android.graphics.Path r2 = r12.f3985h
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00f3
            r2 = 29
            if (r4 >= r2) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r2 = 0
            goto L_0x00f6
        L_0x00f5:
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fa
        L_0x00f8:
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            if (r2 != 0) goto L_0x00ff
            goto L_0x01ae
        L_0x00ff:
            r13.save()
            int r2 = r12.mo4288i()
            int r4 = r12.mo4291j()
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 >= r5) goto L_0x0126
            boolean r5 = r12.f4000w
            if (r5 == 0) goto L_0x0126
            android.graphics.Rect r5 = r13.getClipBounds()
            rl$b r8 = r12.f3979b
            int r8 = r8.f4019r
            int r8 = -r8
            r5.inset(r8, r8)
            r5.offset(r2, r4)
            android.graphics.Region$Op r8 = android.graphics.Region.Op.REPLACE
            r13.clipRect(r5, r8)
        L_0x0126:
            float r2 = (float) r2
            float r4 = (float) r4
            r13.translate(r2, r4)
            boolean r2 = r12.f4000w
            if (r2 != 0) goto L_0x0133
            r12.mo4280f(r13)
            goto L_0x01ab
        L_0x0133:
            android.graphics.RectF r2 = r12.f3999v
            float r2 = r2.width()
            android.graphics.Rect r4 = r12.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r12.f3999v
            float r4 = r4.height()
            android.graphics.Rect r5 = r12.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01fc
            if (r4 < 0) goto L_0x01fc
            android.graphics.RectF r5 = r12.f3999v
            float r5 = r5.width()
            int r5 = (int) r5
            rl$b r8 = r12.f3979b
            int r8 = r8.f4019r
            int r8 = r8 * 2
            int r8 = r8 + r5
            int r8 = r8 + r2
            android.graphics.RectF r5 = r12.f3999v
            float r5 = r5.height()
            int r5 = (int) r5
            rl$b r9 = r12.f3979b
            int r9 = r9.f4019r
            int r9 = r9 * 2
            int r9 = r9 + r5
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.left
            rl$b r9 = r12.f3979b
            int r9 = r9.f4019r
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.top
            rl$b r9 = r12.f3979b
            int r9 = r9.f4019r
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r6.translate(r8, r9)
            r12.mo4280f(r6)
            r6 = 0
            r13.drawBitmap(r5, r2, r4, r6)
            r5.recycle()
        L_0x01ab:
            r13.restore()
        L_0x01ae:
            rl$b r2 = r12.f3979b
            android.graphics.Paint$Style r4 = r2.f4023v
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x01ba
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x01bb
        L_0x01ba:
            r3 = 1
        L_0x01bb:
            if (r3 == 0) goto L_0x01cc
            android.graphics.Paint r6 = r12.f3992o
            android.graphics.Path r7 = r12.f3985h
            ul r8 = r2.f4002a
            android.graphics.RectF r9 = r12.mo4287h()
            r4 = r12
            r5 = r13
            r4.mo4281g(r5, r6, r7, r8, r9)
        L_0x01cc:
            boolean r2 = r12.mo4294m()
            if (r2 == 0) goto L_0x01f1
            android.graphics.Paint r5 = r12.f3993p
            android.graphics.Path r6 = r12.f3986i
            ul r7 = r12.f3991n
            android.graphics.RectF r2 = r12.f3988k
            android.graphics.RectF r3 = r12.mo4287h()
            r2.set(r3)
            float r2 = r12.mo4292k()
            android.graphics.RectF r3 = r12.f3988k
            r3.inset(r2, r2)
            android.graphics.RectF r8 = r12.f3988k
            r3 = r12
            r4 = r13
            r3.mo4281g(r4, r5, r6, r7, r8)
        L_0x01f1:
            android.graphics.Paint r13 = r12.f3992o
            r13.setAlpha(r0)
            android.graphics.Paint r13 = r12.f3993p
            r13.setAlpha(r1)
            return
        L_0x01fc:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1067rl.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final int mo4279e(int i) {
        C1069b bVar = this.f3979b;
        float f = bVar.f4016o + bVar.f4017p + bVar.f4015n;
        C0383dk dkVar = bVar.f4003b;
        if (dkVar == null || !dkVar.f1902a) {
            return i;
        }
        if (!(C0859n6.m2574c(i, 255) == dkVar.f1904c)) {
            return i;
        }
        float f2 = dkVar.f1905d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return C0859n6.m2574c(C0728kh.m2306v(C0859n6.m2574c(i, 255), dkVar.f1903b, f3), Color.alpha(i));
    }

    /* renamed from: f */
    public final void mo4280f(Canvas canvas) {
        this.f3982e.cardinality();
        if (this.f3979b.f4020s != 0) {
            canvas.drawPath(this.f3985h, this.f3994q.f2913a);
        }
        for (int i = 0; i < 4; i++) {
            C1375xl.C1381f fVar = this.f3980c[i];
            C0688jl jlVar = this.f3994q;
            int i2 = this.f3979b.f4019r;
            Matrix matrix = C1375xl.C1381f.f5113a;
            fVar.mo5011a(matrix, jlVar, i2, canvas);
            this.f3981d[i].mo5011a(matrix, this.f3994q, this.f3979b.f4019r, canvas);
        }
        if (this.f4000w) {
            int i3 = mo4288i();
            int j = mo4291j();
            canvas.translate((float) (-i3), (float) (-j));
            canvas.drawPath(this.f3985h, f3978y);
            canvas.translate((float) i3, (float) j);
        }
    }

    /* renamed from: g */
    public final void mo4281g(Canvas canvas, Paint paint, Path path, C1217ul ulVar, RectF rectF) {
        if (ulVar.mo4781d(rectF)) {
            float a = ulVar.f4652f.mo3635a(rectF) * this.f3979b.f4012k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3979b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        C1069b bVar = this.f3979b;
        if (bVar.f4018q != 2) {
            if (bVar.f4002a.mo4781d(mo4287h())) {
                outline.setRoundRect(getBounds(), mo4293l() * this.f3979b.f4012k);
                return;
            }
            mo4276b(mo4287h(), this.f3985h);
            if (this.f3985h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f3985h);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f3979b.f4010i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f3989l.set(getBounds());
        mo4276b(mo4287h(), this.f3985h);
        this.f3990m.setPath(this.f3985h, this.f3989l);
        this.f3989l.op(this.f3990m, Region.Op.DIFFERENCE);
        return this.f3989l;
    }

    /* renamed from: h */
    public RectF mo4287h() {
        this.f3987j.set(getBounds());
        return this.f3987j;
    }

    /* renamed from: i */
    public int mo4288i() {
        C1069b bVar = this.f3979b;
        double d = (double) bVar.f4020s;
        double sin = Math.sin(Math.toRadians((double) bVar.f4021t));
        Double.isNaN(d);
        return (int) (sin * d);
    }

    public void invalidateSelf() {
        this.f3983f = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f3979b.f4006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f3979b.f4005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3979b.f4008g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f3979b.f4007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            rl$b r0 = r1.f3979b
            android.content.res.ColorStateList r0 = r0.f4008g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            rl$b r0 = r1.f3979b
            android.content.res.ColorStateList r0 = r0.f4007f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            rl$b r0 = r1.f3979b
            android.content.res.ColorStateList r0 = r0.f4006e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            rl$b r0 = r1.f3979b
            android.content.res.ColorStateList r0 = r0.f4005d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1067rl.isStateful():boolean");
    }

    /* renamed from: j */
    public int mo4291j() {
        C1069b bVar = this.f3979b;
        double d = (double) bVar.f4020s;
        double cos = Math.cos(Math.toRadians((double) bVar.f4021t));
        Double.isNaN(d);
        return (int) (cos * d);
    }

    /* renamed from: k */
    public final float mo4292k() {
        if (mo4294m()) {
            return this.f3993p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public float mo4293l() {
        return this.f3979b.f4002a.f4651e.mo3635a(mo4287h());
    }

    /* renamed from: m */
    public final boolean mo4294m() {
        Paint.Style style = this.f3979b.f4023v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3993p.getStrokeWidth() > 0.0f;
    }

    public Drawable mutate() {
        this.f3979b = new C1069b(this.f3979b);
        return this;
    }

    /* renamed from: n */
    public void mo4296n(Context context) {
        this.f3979b.f4003b = new C0383dk(context);
        mo4309w();
    }

    /* renamed from: o */
    public void mo4297o(float f) {
        C1069b bVar = this.f3979b;
        if (bVar.f4016o != f) {
            bVar.f4016o = f;
            mo4309w();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f3983f = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = mo4307u(iArr) || mo4308v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void mo4300p(ColorStateList colorStateList) {
        C1069b bVar = this.f3979b;
        if (bVar.f4005d != colorStateList) {
            bVar.f4005d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: q */
    public void mo4301q(float f) {
        C1069b bVar = this.f3979b;
        if (bVar.f4012k != f) {
            bVar.f4012k = f;
            this.f3983f = true;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo4302r(float f, int i) {
        this.f3979b.f4013l = f;
        invalidateSelf();
        mo4306t(ColorStateList.valueOf(i));
    }

    /* renamed from: s */
    public void mo4303s(float f, ColorStateList colorStateList) {
        this.f3979b.f4013l = f;
        invalidateSelf();
        mo4306t(colorStateList);
    }

    public void setAlpha(int i) {
        C1069b bVar = this.f3979b;
        if (bVar.f4014m != i) {
            bVar.f4014m = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3979b.f4004c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(C1217ul ulVar) {
        this.f3979b.f4002a = ulVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3979b.f4008g = colorStateList;
        mo4308v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1069b bVar = this.f3979b;
        if (bVar.f4009h != mode) {
            bVar.f4009h = mode;
            mo4308v();
            super.invalidateSelf();
        }
    }

    /* renamed from: t */
    public void mo4306t(ColorStateList colorStateList) {
        C1069b bVar = this.f3979b;
        if (bVar.f4006e != colorStateList) {
            bVar.f4006e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: u */
    public final boolean mo4307u(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f3979b.f4005d == null || (color2 = this.f3992o.getColor()) == (colorForState2 = this.f3979b.f4005d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f3992o.setColor(colorForState2);
            z = true;
        }
        if (this.f3979b.f4006e == null || (color = this.f3993p.getColor()) == (colorForState = this.f3979b.f4006e.getColorForState(iArr, color))) {
            return z;
        }
        this.f3993p.setColor(colorForState);
        return true;
    }

    /* renamed from: v */
    public final boolean mo4308v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f3997t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3998u;
        C1069b bVar = this.f3979b;
        this.f3997t = mo4278d(bVar.f4008g, bVar.f4009h, this.f3992o, true);
        C1069b bVar2 = this.f3979b;
        this.f3998u = mo4278d(bVar2.f4007f, bVar2.f4009h, this.f3993p, false);
        C1069b bVar3 = this.f3979b;
        if (bVar3.f4022u) {
            this.f3994q.mo3465a(bVar3.f4008g.getColorForState(getState(), 0));
        }
        return !C1344x5.m3773r(porterDuffColorFilter, this.f3997t) || !C1344x5.m3773r(porterDuffColorFilter2, this.f3998u);
    }

    /* renamed from: w */
    public final void mo4309w() {
        C1069b bVar = this.f3979b;
        float f = bVar.f4016o + bVar.f4017p;
        bVar.f4019r = (int) Math.ceil((double) (0.75f * f));
        this.f3979b.f4020s = (int) Math.ceil((double) (f * 0.25f));
        mo4308v();
        super.invalidateSelf();
    }
}
