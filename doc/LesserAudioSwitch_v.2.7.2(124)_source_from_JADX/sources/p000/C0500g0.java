package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p000.C0595i0;

/* renamed from: g0 */
public class C0500g0 extends Drawable implements Drawable.Callback {

    /* renamed from: n */
    public static final /* synthetic */ int f2185n = 0;

    /* renamed from: b */
    public C0503c f2186b;

    /* renamed from: c */
    public Rect f2187c;

    /* renamed from: d */
    public Drawable f2188d;

    /* renamed from: e */
    public Drawable f2189e;

    /* renamed from: f */
    public int f2190f = 255;

    /* renamed from: g */
    public boolean f2191g;

    /* renamed from: h */
    public int f2192h = -1;

    /* renamed from: i */
    public boolean f2193i;

    /* renamed from: j */
    public Runnable f2194j;

    /* renamed from: k */
    public long f2195k;

    /* renamed from: l */
    public long f2196l;

    /* renamed from: m */
    public C0502b f2197m;

    /* renamed from: g0$a */
    public class C0501a implements Runnable {
        public C0501a() {
        }

        public void run() {
            C0500g0.this.mo2816a(true);
            C0500g0.this.invalidateSelf();
        }
    }

    /* renamed from: g0$b */
    public static class C0502b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f2199b;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f2199b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2199b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: g0$c */
    public static abstract class C0503c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f2200A;

        /* renamed from: B */
        public int f2201B;

        /* renamed from: C */
        public boolean f2202C;

        /* renamed from: D */
        public ColorFilter f2203D;

        /* renamed from: E */
        public boolean f2204E;

        /* renamed from: F */
        public ColorStateList f2205F;

        /* renamed from: G */
        public PorterDuff.Mode f2206G;

        /* renamed from: H */
        public boolean f2207H;

        /* renamed from: I */
        public boolean f2208I;

        /* renamed from: a */
        public final C0500g0 f2209a;

        /* renamed from: b */
        public Resources f2210b;

        /* renamed from: c */
        public int f2211c = 160;

        /* renamed from: d */
        public int f2212d;

        /* renamed from: e */
        public int f2213e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f2214f;

        /* renamed from: g */
        public Drawable[] f2215g;

        /* renamed from: h */
        public int f2216h;

        /* renamed from: i */
        public boolean f2217i;

        /* renamed from: j */
        public boolean f2218j;

        /* renamed from: k */
        public Rect f2219k;

        /* renamed from: l */
        public boolean f2220l;

        /* renamed from: m */
        public boolean f2221m;

        /* renamed from: n */
        public int f2222n;

        /* renamed from: o */
        public int f2223o;

        /* renamed from: p */
        public int f2224p;

        /* renamed from: q */
        public int f2225q;

        /* renamed from: r */
        public boolean f2226r;

        /* renamed from: s */
        public int f2227s;

        /* renamed from: t */
        public boolean f2228t;

        /* renamed from: u */
        public boolean f2229u;

        /* renamed from: v */
        public boolean f2230v;

        /* renamed from: w */
        public boolean f2231w;

        /* renamed from: x */
        public boolean f2232x;

        /* renamed from: y */
        public boolean f2233y;

        /* renamed from: z */
        public int f2234z;

        public C0503c(C0503c cVar, C0500g0 g0Var, Resources resources) {
            int i = 160;
            this.f2217i = false;
            this.f2220l = false;
            this.f2232x = true;
            this.f2200A = 0;
            this.f2201B = 0;
            this.f2209a = g0Var;
            this.f2210b = resources != null ? resources : cVar != null ? cVar.f2210b : null;
            int i2 = cVar != null ? cVar.f2211c : 0;
            int i3 = C0500g0.f2185n;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i = i2 != 0 ? i2 : i;
            this.f2211c = i;
            if (cVar != null) {
                this.f2212d = cVar.f2212d;
                this.f2213e = cVar.f2213e;
                this.f2230v = true;
                this.f2231w = true;
                this.f2217i = cVar.f2217i;
                this.f2220l = cVar.f2220l;
                this.f2232x = cVar.f2232x;
                this.f2233y = cVar.f2233y;
                this.f2234z = cVar.f2234z;
                this.f2200A = cVar.f2200A;
                this.f2201B = cVar.f2201B;
                this.f2202C = cVar.f2202C;
                this.f2203D = cVar.f2203D;
                this.f2204E = cVar.f2204E;
                this.f2205F = cVar.f2205F;
                this.f2206G = cVar.f2206G;
                this.f2207H = cVar.f2207H;
                this.f2208I = cVar.f2208I;
                if (cVar.f2211c == i) {
                    if (cVar.f2218j) {
                        this.f2219k = new Rect(cVar.f2219k);
                        this.f2218j = true;
                    }
                    if (cVar.f2221m) {
                        this.f2222n = cVar.f2222n;
                        this.f2223o = cVar.f2223o;
                        this.f2224p = cVar.f2224p;
                        this.f2225q = cVar.f2225q;
                        this.f2221m = true;
                    }
                }
                if (cVar.f2226r) {
                    this.f2227s = cVar.f2227s;
                    this.f2226r = true;
                }
                if (cVar.f2228t) {
                    this.f2229u = cVar.f2229u;
                    this.f2228t = true;
                }
                Drawable[] drawableArr = cVar.f2215g;
                this.f2215g = new Drawable[drawableArr.length];
                this.f2216h = cVar.f2216h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f2214f;
                this.f2214f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2216h);
                int i4 = this.f2216h;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5] != null) {
                        Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                        if (constantState != null) {
                            this.f2214f.put(i5, constantState);
                        } else {
                            this.f2215g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.f2215g = new Drawable[10];
            this.f2216h = 0;
        }

        /* renamed from: a */
        public final int mo2853a(Drawable drawable) {
            int i = this.f2216h;
            if (i >= this.f2215g.length) {
                int i2 = i + 10;
                C0595i0.C0596a aVar = (C0595i0.C0596a) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(aVar.f2215g, 0, drawableArr, 0, i);
                aVar.f2215g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f2511J, 0, iArr, 0, i);
                aVar.f2511J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2209a);
            this.f2215g[i] = drawable;
            this.f2216h++;
            this.f2213e = drawable.getChangingConfigurations() | this.f2213e;
            this.f2226r = false;
            this.f2228t = false;
            this.f2219k = null;
            this.f2218j = false;
            this.f2221m = false;
            this.f2230v = false;
            return i;
        }

        /* renamed from: b */
        public void mo2854b() {
            this.f2221m = true;
            mo2855c();
            int i = this.f2216h;
            Drawable[] drawableArr = this.f2215g;
            this.f2223o = -1;
            this.f2222n = -1;
            this.f2225q = 0;
            this.f2224p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2222n) {
                    this.f2222n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2223o) {
                    this.f2223o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2224p) {
                    this.f2224p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2225q) {
                    this.f2225q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo2855c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2214f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f2214f.keyAt(i);
                    Drawable[] drawableArr = this.f2215g;
                    Drawable newDrawable = this.f2214f.valueAt(i).newDrawable(this.f2210b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.f2234z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f2209a);
                    drawableArr[keyAt] = mutate;
                }
                this.f2214f = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f2216h;
            Drawable[] drawableArr = this.f2215g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2214f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable mo2857d(int i) {
            int indexOfKey;
            Drawable drawable = this.f2215g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2214f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f2214f.valueAt(indexOfKey).newDrawable(this.f2210b);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.f2234z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f2209a);
            this.f2215g[i] = mutate;
            this.f2214f.removeAt(indexOfKey);
            if (this.f2214f.size() == 0) {
                this.f2214f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo2754e();

        /* renamed from: f */
        public final void mo2858f(Resources resources) {
            if (resources != null) {
                this.f2210b = resources;
                int i = C0500g0.f2185n;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = 160;
                }
                int i3 = this.f2211c;
                this.f2211c = i2;
                if (i3 != i2) {
                    this.f2221m = false;
                    this.f2218j = false;
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f2212d | this.f2213e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2816a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2191g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2188d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f2195k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f2190f
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g0$c r9 = r13.f2186b
            int r9 = r9.f2200A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2190f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f2195k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f2189e
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f2196l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2189e = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g0$c r4 = r13.f2186b
            int r4 = r4.f2201B
            int r3 = r3 / r4
            int r4 = r13.f2190f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f2196l = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f2194j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0500g0.mo2816a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C0503c cVar = this.f2186b;
        cVar.getClass();
        if (theme != null) {
            cVar.mo2855c();
            int i = cVar.f2216h;
            Drawable[] drawableArr = cVar.f2215g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f2213e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            cVar.mo2858f(theme.getResources());
        }
    }

    /* renamed from: b */
    public C0503c mo2744b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo2818c(Drawable drawable) {
        if (this.f2197m == null) {
            this.f2197m = new C0502b();
        }
        C0502b bVar = this.f2197m;
        bVar.f2199b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f2186b.f2200A <= 0 && this.f2191g) {
                drawable.setAlpha(this.f2190f);
            }
            C0503c cVar = this.f2186b;
            if (cVar.f2204E) {
                drawable.setColorFilter(cVar.f2203D);
            } else {
                if (cVar.f2207H) {
                    C1344x5.m3752d0(drawable, cVar.f2205F);
                }
                C0503c cVar2 = this.f2186b;
                if (cVar2.f2208I) {
                    C1344x5.m3754e0(drawable, cVar2.f2206G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2186b.f2232x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f2186b.f2202C);
            }
            Rect rect = this.f2187c;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0502b bVar2 = this.f2197m;
            Drawable.Callback callback = bVar2.f2199b;
            bVar2.f2199b = null;
            drawable.setCallback(callback);
        }
    }

    public boolean canApplyTheme() {
        return this.f2186b.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2820d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2192h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            g0$c r0 = r9.f2186b
            int r0 = r0.f2201B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f2189e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f2188d
            if (r0 == 0) goto L_0x0029
            r9.f2189e = r0
            g0$c r0 = r9.f2186b
            int r0 = r0.f2201B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2196l = r0
            goto L_0x0035
        L_0x0029:
            r9.f2189e = r4
            r9.f2196l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f2188d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            g0$c r0 = r9.f2186b
            int r1 = r0.f2216h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo2857d(r10)
            r9.f2188d = r0
            r9.f2192h = r10
            if (r0 == 0) goto L_0x005a
            g0$c r10 = r9.f2186b
            int r10 = r10.f2200A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2195k = r2
        L_0x0051:
            r9.mo2818c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f2188d = r4
            r10 = -1
            r9.f2192h = r10
        L_0x005a:
            long r0 = r9.f2195k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f2196l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f2194j
            if (r0 != 0) goto L_0x0073
            g0$a r0 = new g0$a
            r0.<init>()
            r9.f2194j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo2816a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0500g0.mo2820d(int):boolean");
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2189e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo2745e(C0503c cVar) {
        throw null;
    }

    public int getAlpha() {
        return this.f2190f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2186b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        boolean z;
        C0503c cVar = this.f2186b;
        synchronized (cVar) {
            z = false;
            if (cVar.f2230v) {
                z = cVar.f2231w;
            } else {
                cVar.mo2855c();
                cVar.f2230v = true;
                int i = cVar.f2216h;
                Drawable[] drawableArr = cVar.f2215g;
                int i2 = 0;
                while (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        cVar.f2231w = false;
                    } else {
                        i2++;
                    }
                }
                cVar.f2231w = true;
                z = true;
            }
            break;
        }
        if (!z) {
            return null;
        }
        this.f2186b.f2212d = getChangingConfigurations();
        return this.f2186b;
    }

    public Drawable getCurrent() {
        return this.f2188d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2187c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C0503c cVar = this.f2186b;
        if (cVar.f2220l) {
            if (!cVar.f2221m) {
                cVar.mo2854b();
            }
            return cVar.f2223o;
        }
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        C0503c cVar = this.f2186b;
        if (cVar.f2220l) {
            if (!cVar.f2221m) {
                cVar.mo2854b();
            }
            return cVar.f2222n;
        }
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        C0503c cVar = this.f2186b;
        if (cVar.f2220l) {
            if (!cVar.f2221m) {
                cVar.mo2854b();
            }
            return cVar.f2225q;
        }
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        C0503c cVar = this.f2186b;
        if (cVar.f2220l) {
            if (!cVar.f2221m) {
                cVar.mo2854b();
            }
            return cVar.f2224p;
        }
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2188d;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0503c cVar = this.f2186b;
        if (cVar.f2226r) {
            return cVar.f2227s;
        }
        cVar.mo2855c();
        int i2 = cVar.f2216h;
        Drawable[] drawableArr = cVar.f2215g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.f2227s = i;
        cVar.f2226r = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        C0503c cVar = this.f2186b;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.f2217i) {
            Rect rect3 = cVar.f2219k;
            if (rect3 != null || cVar.f2218j) {
                rect2 = rect3;
            } else {
                cVar.mo2855c();
                Rect rect4 = new Rect();
                int i = cVar.f2216h;
                Drawable[] drawableArr = cVar.f2215g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f2218j = true;
                cVar.f2219k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f2188d;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.f2186b.f2202C || C1344x5.m3780y(this) != 1) {
            z2 = false;
        }
        if (z2) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0503c cVar = this.f2186b;
        if (cVar != null) {
            cVar.f2226r = false;
            cVar.f2228t = false;
        }
        if (drawable == this.f2188d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2186b.f2202C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f2189e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2189e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f2188d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2191g) {
                this.f2188d.setAlpha(this.f2190f);
            }
        }
        if (this.f2196l != 0) {
            this.f2196l = 0;
            z = true;
        }
        if (this.f2195k != 0) {
            this.f2195k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f2193i && super.mutate() == this) {
            C0503c b = mo2744b();
            b.mo2754e();
            mo2745e(b);
            this.f2193i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2189e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2188d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        C0503c cVar = this.f2186b;
        int i2 = this.f2192h;
        int i3 = cVar.f2216h;
        Drawable[] drawableArr = cVar.f2215g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f2234z = i;
        return z;
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f2189e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f2188d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2189e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2188d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f2188d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f2191g || this.f2190f != i) {
            this.f2191g = true;
            this.f2190f = i;
            Drawable drawable = this.f2188d;
            if (drawable == null) {
                return;
            }
            if (this.f2195k == 0) {
                drawable.setAlpha(i);
            } else {
                mo2816a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0503c cVar = this.f2186b;
        if (cVar.f2202C != z) {
            cVar.f2202C = z;
            Drawable drawable = this.f2188d;
            if (drawable != null) {
                C1344x5.m3734P(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0503c cVar = this.f2186b;
        cVar.f2204E = true;
        if (cVar.f2203D != colorFilter) {
            cVar.f2203D = colorFilter;
            Drawable drawable = this.f2188d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0503c cVar = this.f2186b;
        if (cVar.f2232x != z) {
            cVar.f2232x = z;
            Drawable drawable = this.f2188d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            C1344x5.m3739U(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f2187c;
        if (rect == null) {
            this.f2187c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f2188d;
        if (drawable != null) {
            C1344x5.m3740V(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0503c cVar = this.f2186b;
        cVar.f2207H = true;
        if (cVar.f2205F != colorStateList) {
            cVar.f2205F = colorStateList;
            C1344x5.m3752d0(this.f2188d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0503c cVar = this.f2186b;
        cVar.f2208I = true;
        if (cVar.f2206G != mode) {
            cVar.f2206G = mode;
            C1344x5.m3754e0(this.f2188d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f2189e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f2188d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2188d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
