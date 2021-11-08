package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import p000.C0500g0;
import p000.C0595i0;

@SuppressLint({"RestrictedAPI"})
/* renamed from: f0 */
public class C0441f0 extends C0595i0 implements C1400y6 {

    /* renamed from: q */
    public C0444c f2073q;

    /* renamed from: r */
    public C0448g f2074r;

    /* renamed from: s */
    public int f2075s;

    /* renamed from: t */
    public int f2076t;

    /* renamed from: u */
    public boolean f2077u;

    /* renamed from: f0$b */
    public static class C0443b extends C0448g {

        /* renamed from: a */
        public final Animatable f2078a;

        public C0443b(Animatable animatable) {
            super((C0442a) null);
            this.f2078a = animatable;
        }

        /* renamed from: c */
        public void mo2752c() {
            this.f2078a.start();
        }

        /* renamed from: d */
        public void mo2753d() {
            this.f2078a.stop();
        }
    }

    /* renamed from: f0$c */
    public static class C0444c extends C0595i0.C0596a {

        /* renamed from: K */
        public C0518g4<Long> f2079K;

        /* renamed from: L */
        public C0713k4<Integer> f2080L;

        public C0444c(C0444c cVar, C0441f0 f0Var, Resources resources) {
            super(cVar, f0Var, resources);
            C0713k4<Integer> k4Var;
            if (cVar != null) {
                this.f2079K = cVar.f2079K;
                k4Var = cVar.f2080L;
            } else {
                this.f2079K = new C0518g4<>();
                k4Var = new C0713k4<>(10);
            }
            this.f2080L = k4Var;
        }

        /* renamed from: h */
        public static long m1620h(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* renamed from: e */
        public void mo2754e() {
            this.f2079K = this.f2079K.clone();
            this.f2080L = this.f2080L.clone();
        }

        /* renamed from: i */
        public int mo2755i(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f2080L.mo3519e(i, 0).intValue();
        }

        public Drawable newDrawable() {
            return new C0441f0(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0441f0(this, resources);
        }
    }

    /* renamed from: f0$d */
    public static class C0445d extends C0448g {

        /* renamed from: a */
        public final C0874nf f2081a;

        public C0445d(C0874nf nfVar) {
            super((C0442a) null);
            this.f2081a = nfVar;
        }

        /* renamed from: c */
        public void mo2752c() {
            this.f2081a.start();
        }

        /* renamed from: d */
        public void mo2753d() {
            this.f2081a.stop();
        }
    }

    /* renamed from: f0$e */
    public static class C0446e extends C0448g {

        /* renamed from: a */
        public final ObjectAnimator f2082a;

        /* renamed from: b */
        public final boolean f2083b;

        public C0446e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((C0442a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0447f fVar = new C0447f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.f2086c);
            ofInt.setInterpolator(fVar);
            this.f2083b = z2;
            this.f2082a = ofInt;
        }

        /* renamed from: a */
        public boolean mo2758a() {
            return this.f2083b;
        }

        /* renamed from: b */
        public void mo2759b() {
            this.f2082a.reverse();
        }

        /* renamed from: c */
        public void mo2752c() {
            this.f2082a.start();
        }

        /* renamed from: d */
        public void mo2753d() {
            this.f2082a.cancel();
        }
    }

    /* renamed from: f0$f */
    public static class C0447f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f2084a;

        /* renamed from: b */
        public int f2085b;

        /* renamed from: c */
        public int f2086c;

        public C0447f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2085b = numberOfFrames;
            int[] iArr = this.f2084a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2084a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2084a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2086c = i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f2086c)) + 0.5f);
            int i2 = this.f2085b;
            int[] iArr = this.f2084a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2086c) : 0.0f);
        }
    }

    /* renamed from: f0$g */
    public static abstract class C0448g {
        public C0448g(C0442a aVar) {
        }

        /* renamed from: a */
        public boolean mo2758a() {
            return false;
        }

        /* renamed from: b */
        public void mo2759b() {
        }

        /* renamed from: c */
        public abstract void mo2752c();

        /* renamed from: d */
        public abstract void mo2753d();
    }

    static {
        Class<C0441f0> cls = C0441f0.class;
    }

    public C0441f0() {
        this((C0444c) null, (Resources) null);
    }

    public C0441f0(C0444c cVar, Resources resources) {
        super((C0595i0.C0596a) null);
        this.f2075s = -1;
        this.f2076t = -1;
        C0444c cVar2 = new C0444c(cVar, this, resources);
        super.mo2745e(cVar2);
        this.f2073q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(p000.C0279ch.m1124u(r1, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0441f0 m1614g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = r21.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0240
            f0 r4 = new f0
            r5 = 0
            r4.<init>(r5, r5)
            int[] r5 = p000.C0656j0.f2773a
            android.content.res.TypedArray r5 = p000.C0806m6.m2449j(r0, r3, r2, r5)
            r6 = 1
            boolean r7 = r5.getBoolean(r6, r6)
            r4.setVisible(r7, r6)
            f0$c r7 = r4.f2073q
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x0039
            int r8 = r7.f2212d
            int r9 = r5.getChangingConfigurations()
            r8 = r8 | r9
            r7.f2212d = r8
        L_0x0039:
            boolean r8 = r7.f2217i
            r9 = 2
            boolean r8 = r5.getBoolean(r9, r8)
            r7.f2217i = r8
            boolean r8 = r7.f2220l
            r10 = 3
            boolean r8 = r5.getBoolean(r10, r8)
            r7.f2220l = r8
            int r8 = r7.f2200A
            r11 = 4
            int r8 = r5.getInt(r11, r8)
            r7.f2200A = r8
            r8 = 5
            int r11 = r7.f2201B
            int r8 = r5.getInt(r8, r11)
            r7.f2201B = r8
            boolean r7 = r7.f2232x
            r8 = 0
            boolean r7 = r5.getBoolean(r8, r7)
            r4.setDither(r7)
            g0$c r7 = r4.f2186b
            r7.mo2858f(r0)
            r5.recycle()
            int r5 = r21.getDepth()
            int r5 = r5 + r6
            r11 = r19
            r7 = r0
            r12 = r4
        L_0x0078:
            int r13 = r21.next()
            if (r13 == r6) goto L_0x0238
            int r14 = r21.getDepth()
            if (r14 >= r5) goto L_0x0086
            if (r13 == r10) goto L_0x0238
        L_0x0086:
            if (r13 == r9) goto L_0x0089
            goto L_0x0078
        L_0x0089:
            if (r14 <= r5) goto L_0x008c
            goto L_0x0078
        L_0x008c:
            java.lang.String r9 = r21.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            r10 = -1
            if (r9 == 0) goto L_0x0151
            int[] r9 = p000.C0656j0.f2774b
            android.content.res.TypedArray r9 = p000.C0806m6.m2449j(r7, r3, r2, r9)
            int r13 = r9.getResourceId(r8, r8)
            int r6 = r9.getResourceId(r6, r10)
            if (r6 <= 0) goto L_0x00b2
            x2 r10 = p000.C1334x2.m3686d()
            android.graphics.drawable.Drawable r6 = r10.mo5042f(r11, r6)
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            r9.recycle()
            int r9 = r22.getAttributeCount()
            int[] r10 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00be:
            if (r14 >= r9) goto L_0x00e6
            int r0 = r2.getAttributeNameResource(r14)
            r16 = r5
            if (r0 == 0) goto L_0x00df
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r0 == r5) goto L_0x00df
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r0 == r5) goto L_0x00df
            int r5 = r15 + 1
            boolean r17 = r2.getAttributeBooleanValue(r14, r8)
            if (r17 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            int r0 = -r0
        L_0x00dc:
            r10[r15] = r0
            r15 = r5
        L_0x00df:
            int r14 = r14 + 1
            r0 = r20
            r5 = r16
            goto L_0x00be
        L_0x00e6:
            r16 = r5
            int[] r0 = android.util.StateSet.trimStateSet(r10, r15)
            java.lang.String r5 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x012b
        L_0x00f0:
            int r6 = r21.next()
            r8 = 4
            if (r6 != r8) goto L_0x00f8
            goto L_0x00f0
        L_0x00f8:
            r8 = 2
            if (r6 != r8) goto L_0x011c
            java.lang.String r6 = r21.getName()
            java.lang.String r8 = "vector"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x010c
            sf r6 = p000.C1110sf.m3171a(r20, r21, r22, r23)
            goto L_0x012b
        L_0x010c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r6 < r8) goto L_0x0117
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L_0x012b
        L_0x0117:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
            goto L_0x012b
        L_0x011c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = p000.C0279ch.m1124u(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x012b:
            if (r6 == 0) goto L_0x0142
            f0$c r5 = r12.f2073q
            int r6 = r5.mo2853a(r6)
            int[][] r8 = r5.f2511J
            r8[r6] = r0
            k4<java.lang.Integer> r0 = r5.f2080L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r0.mo3521g(r6, r5)
            goto L_0x022e
        L_0x0142:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = p000.C0279ch.m1124u(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r16 = r5
            java.lang.String r0 = r21.getName()
            java.lang.String r5 = "transition"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0229
            int[] r0 = p000.C0656j0.f2775c
            android.content.res.TypedArray r0 = p000.C0806m6.m2449j(r7, r3, r2, r0)
            r5 = 2
            int r5 = r0.getResourceId(r5, r10)
            r6 = 1
            int r6 = r0.getResourceId(r6, r10)
            int r9 = r0.getResourceId(r8, r10)
            if (r9 <= 0) goto L_0x017e
            x2 r13 = p000.C1334x2.m3686d()
            android.graphics.drawable.Drawable r9 = r13.mo5042f(r11, r9)
            goto L_0x017f
        L_0x017e:
            r9 = 0
        L_0x017f:
            r13 = 3
            boolean r8 = r0.getBoolean(r13, r8)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r9 != 0) goto L_0x01cc
        L_0x018b:
            int r9 = r21.next()
            r13 = 4
            if (r9 != r13) goto L_0x0193
            goto L_0x018b
        L_0x0193:
            r13 = 2
            if (r9 != r13) goto L_0x01bd
            java.lang.String r9 = r21.getName()
            java.lang.String r13 = "animated-vector"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x01ac
            nf r9 = new nf
            r13 = 0
            r9.<init>(r11, r13, r13)
            r9.inflate(r7, r1, r2, r3)
            goto L_0x01cc
        L_0x01ac:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r7 < r9) goto L_0x01b7
            android.graphics.drawable.Drawable r7 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22, r23)
            goto L_0x01bb
        L_0x01b7:
            android.graphics.drawable.Drawable r7 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
        L_0x01bb:
            r9 = r7
            goto L_0x01cc
        L_0x01bd:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = p000.C0279ch.m1124u(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x01cc:
            if (r9 == 0) goto L_0x021a
            if (r5 == r10) goto L_0x0209
            if (r6 == r10) goto L_0x0209
            f0$c r0 = r12.f2073q
            int r7 = r0.mo2853a(r9)
            long r9 = p000.C0441f0.C0444c.m1620h(r5, r6)
            if (r8 == 0) goto L_0x01e4
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01e6
        L_0x01e4:
            r11 = 0
        L_0x01e6:
            g4<java.lang.Long> r13 = r0.f2079K
            long r14 = (long) r7
            long r17 = r14 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            r13.mo2922a(r9, r7)
            if (r8 == 0) goto L_0x0229
            long r5 = p000.C0441f0.C0444c.m1620h(r6, r5)
            g4<java.lang.Long> r0 = r0.f2079K
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 | r14
            long r7 = r7 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.mo2922a(r5, r7)
            goto L_0x0229
        L_0x0209:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = p000.C0279ch.m1124u(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x021a:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = p000.C0279ch.m1124u(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x0229:
            r11 = r19
            r7 = r20
            r12 = r4
        L_0x022e:
            r6 = 1
            r8 = 0
            r9 = 2
            r10 = 3
            r0 = r20
            r5 = r16
            goto L_0x0078
        L_0x0238:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0240:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r21.getPositionDescription()
            r2.append(r1)
            java.lang.String r1 = ": invalid animated-selector tag "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x025f
        L_0x025e:
            throw r0
        L_0x025f:
            goto L_0x025e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0441f0.m1614g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f0");
    }

    /* renamed from: b */
    public C0500g0.C0503c mo2744b() {
        return new C0444c(this.f2073q, this, (Resources) null);
    }

    /* renamed from: e */
    public void mo2745e(C0500g0.C0503c cVar) {
        super.mo2745e(cVar);
        if (cVar instanceof C0444c) {
            this.f2073q = (C0444c) cVar;
        }
    }

    /* renamed from: f */
    public C0595i0.C0596a mo2746f() {
        return new C0444c(this.f2073q, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0448g gVar = this.f2074r;
        if (gVar != null) {
            gVar.mo2753d();
            this.f2074r = null;
            mo2820d(this.f2075s);
            this.f2075s = -1;
            this.f2076t = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f2077u) {
            super.mutate();
            if (this == this) {
                this.f2073q.mo2754e();
                this.f2077u = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        C0448g gVar;
        int[] iArr2 = iArr;
        C0444c cVar = this.f2073q;
        int g = cVar.mo3107g(iArr2);
        if (g < 0) {
            g = cVar.mo3107g(StateSet.WILD_CARD);
        }
        int i = this.f2192h;
        boolean z2 = false;
        if (g != i) {
            C0448g gVar2 = this.f2074r;
            if (gVar2 != null) {
                if (g != this.f2075s) {
                    if (g != this.f2076t || !gVar2.mo2758a()) {
                        i = this.f2075s;
                        gVar2.mo2753d();
                    } else {
                        gVar2.mo2759b();
                        this.f2075s = this.f2076t;
                        this.f2076t = g;
                    }
                }
                z = true;
                if (z || mo2820d(g)) {
                    z2 = true;
                }
            }
            this.f2074r = null;
            this.f2076t = -1;
            this.f2075s = -1;
            C0444c cVar2 = this.f2073q;
            int i2 = cVar2.mo2755i(i);
            int i3 = cVar2.mo2755i(g);
            if (!(i3 == 0 || i2 == 0)) {
                int longValue = (int) cVar2.f2079K.mo2928f(C0444c.m1620h(i2, i3), -1L).longValue();
                if (longValue >= 0) {
                    boolean z3 = (cVar2.f2079K.mo2928f(C0444c.m1620h(i2, i3), -1L).longValue() & 8589934592L) != 0;
                    mo2820d(longValue);
                    Drawable drawable = this.f2188d;
                    if (drawable instanceof AnimationDrawable) {
                        gVar = new C0446e((AnimationDrawable) drawable, (cVar2.f2079K.mo2928f(C0444c.m1620h(i2, i3), -1L).longValue() & 4294967296L) != 0, z3);
                    } else if (drawable instanceof C0874nf) {
                        gVar = new C0445d((C0874nf) drawable);
                    } else if (drawable instanceof Animatable) {
                        gVar = new C0443b((Animatable) drawable);
                    }
                    gVar.mo2752c();
                    this.f2074r = gVar;
                    this.f2076t = i;
                    this.f2075s = g;
                    z = true;
                    z2 = true;
                }
            }
            z = false;
            z2 = true;
        }
        Drawable drawable2 = this.f2188d;
        return drawable2 != null ? z2 | drawable2.setState(iArr2) : z2;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C0448g gVar = this.f2074r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo2752c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
