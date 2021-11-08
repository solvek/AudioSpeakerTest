package p000;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: a9 */
public abstract class C0013a9 implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f55r = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    public final C0014a f56b;

    /* renamed from: c */
    public final Interpolator f57c = new AccelerateInterpolator();

    /* renamed from: d */
    public final View f58d;

    /* renamed from: e */
    public Runnable f59e;

    /* renamed from: f */
    public float[] f60f = {0.0f, 0.0f};

    /* renamed from: g */
    public float[] f61g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    public int f62h;

    /* renamed from: i */
    public int f63i;

    /* renamed from: j */
    public float[] f64j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f65k = {0.0f, 0.0f};

    /* renamed from: l */
    public float[] f66l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    public boolean f67m;

    /* renamed from: n */
    public boolean f68n;

    /* renamed from: o */
    public boolean f69o;

    /* renamed from: p */
    public boolean f70p;

    /* renamed from: q */
    public boolean f71q;

    /* renamed from: a9$a */
    public static class C0014a {

        /* renamed from: a */
        public int f72a;

        /* renamed from: b */
        public int f73b;

        /* renamed from: c */
        public float f74c;

        /* renamed from: d */
        public float f75d;

        /* renamed from: e */
        public long f76e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f77f = 0;

        /* renamed from: g */
        public int f78g = 0;

        /* renamed from: h */
        public int f79h = 0;

        /* renamed from: i */
        public long f80i = -1;

        /* renamed from: j */
        public float f81j;

        /* renamed from: k */
        public int f82k;

        /* renamed from: a */
        public final float mo96a(long j) {
            long j2 = this.f76e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f80i;
            if (j3 < 0 || j < j3) {
                return C0013a9.m35b(((float) (j - j2)) / ((float) this.f72a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f81j;
            return (C0013a9.m35b(((float) (j - j3)) / ((float) this.f82k), 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: a9$b */
    public class C0015b implements Runnable {
        public C0015b() {
        }

        public void run() {
            View childAt;
            C0013a9 a9Var = C0013a9.this;
            if (a9Var.f70p) {
                if (a9Var.f68n) {
                    a9Var.f68n = false;
                    C0014a aVar = a9Var.f56b;
                    aVar.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f76e = currentAnimationTimeMillis;
                    aVar.f80i = -1;
                    aVar.f77f = currentAnimationTimeMillis;
                    aVar.f81j = 0.5f;
                    aVar.f78g = 0;
                    aVar.f79h = 0;
                }
                C0014a aVar2 = C0013a9.this.f56b;
                if ((aVar2.f80i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f80i + ((long) aVar2.f82k)) || !C0013a9.this.mo94e()) {
                    C0013a9.this.f70p = false;
                    return;
                }
                C0013a9 a9Var2 = C0013a9.this;
                if (a9Var2.f69o) {
                    a9Var2.f69o = false;
                    a9Var2.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    a9Var2.f58d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f77f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar2.mo96a(currentAnimationTimeMillis2);
                    aVar2.f77f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - aVar2.f77f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar2.f78g = (int) (aVar2.f74c * f);
                    int i = (int) (f * aVar2.f75d);
                    aVar2.f79h = i;
                    ListView listView = ((C0261c9) C0013a9.this).f1351s;
                    if (Build.VERSION.SDK_INT >= 19) {
                        listView.scrollListBy(i);
                    } else {
                        int firstVisiblePosition = listView.getFirstVisiblePosition();
                        if (!(firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null)) {
                            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                        }
                    }
                    C0813m8.m2491y(C0013a9.this.f58d, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public C0013a9(View view) {
        C0014a aVar = new C0014a();
        this.f56b = aVar;
        this.f58d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f66l;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f65k;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f62h = 1;
        float[] fArr3 = this.f61g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f60f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f64j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f63i = f55r;
        aVar.f72a = 500;
        aVar.f73b = 500;
    }

    /* renamed from: b */
    public static float m35b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo91a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f60f
            r0 = r0[r4]
            float[] r1 = r3.f61g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m35b(r0, r2, r1)
            float r1 = r3.mo92c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.mo92c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f57c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f57c
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m35b(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.f64j
            r6 = r6[r4]
            float[] r0 = r3.f65k
            r0 = r0[r4]
            float[] r1 = r3.f66l
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = m35b(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = m35b(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0013a9.mo91a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float mo92c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f62h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f70p || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public final void mo93d() {
        int i = 0;
        if (this.f68n) {
            this.f70p = false;
            return;
        }
        C0014a aVar = this.f56b;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.f76e);
        int i3 = aVar.f73b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f82k = i;
        aVar.f81j = aVar.mo96a(currentAnimationTimeMillis);
        aVar.f80i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo94e() {
        /*
            r9 = this;
            a9$a r0 = r9.f56b
            float r1 = r0.f75d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f74c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            c9 r4 = (p000.C0261c9) r4
            android.widget.ListView r4 = r4.f1351s
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0013a9.mo94e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f71q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.mo93d()
            goto L_0x007d
        L_0x001a:
            r5.f69o = r2
            r5.f67m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f58d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo91a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f58d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo91a(r2, r7, r6, r3)
            a9$a r7 = r5.f56b
            r7.f74c = r0
            r7.f75d = r6
            boolean r6 = r5.f70p
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.mo94e()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.f59e
            if (r6 != 0) goto L_0x0061
            a9$b r6 = new a9$b
            r6.<init>()
            r5.f59e = r6
        L_0x0061:
            r5.f70p = r2
            r5.f68n = r2
            boolean r6 = r5.f67m
            if (r6 != 0) goto L_0x0076
            int r6 = r5.f63i
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.f58d
            java.lang.Runnable r0 = r5.f59e
            long r3 = (long) r6
            p000.C0813m8.m2492z(r7, r0, r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.f59e
            r6.run()
        L_0x007b:
            r5.f67m = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0013a9.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
