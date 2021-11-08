package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: p9 */
public class C0962p9 {

    /* renamed from: v */
    public static final Interpolator f3582v = new C0963a();

    /* renamed from: a */
    public int f3583a;

    /* renamed from: b */
    public int f3584b;

    /* renamed from: c */
    public int f3585c = -1;

    /* renamed from: d */
    public float[] f3586d;

    /* renamed from: e */
    public float[] f3587e;

    /* renamed from: f */
    public float[] f3588f;

    /* renamed from: g */
    public float[] f3589g;

    /* renamed from: h */
    public int[] f3590h;

    /* renamed from: i */
    public int[] f3591i;

    /* renamed from: j */
    public int[] f3592j;

    /* renamed from: k */
    public int f3593k;

    /* renamed from: l */
    public VelocityTracker f3594l;

    /* renamed from: m */
    public float f3595m;

    /* renamed from: n */
    public float f3596n;

    /* renamed from: o */
    public int f3597o;

    /* renamed from: p */
    public OverScroller f3598p;

    /* renamed from: q */
    public final C0965c f3599q;

    /* renamed from: r */
    public View f3600r;

    /* renamed from: s */
    public boolean f3601s;

    /* renamed from: t */
    public final ViewGroup f3602t;

    /* renamed from: u */
    public final Runnable f3603u = new C0964b();

    /* renamed from: p9$a */
    public static class C0963a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: p9$b */
    public class C0964b implements Runnable {
        public C0964b() {
        }

        public void run() {
            C0962p9.this.mo3995s(0);
        }
    }

    /* renamed from: p9$c */
    public static abstract class C0965c {
        /* renamed from: a */
        public abstract int mo1864a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo1865b(View view, int i, int i2);

        /* renamed from: c */
        public int mo1866c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo1920d(View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo1867e(View view, int i) {
        }

        /* renamed from: f */
        public abstract void mo1868f(int i);

        /* renamed from: g */
        public abstract void mo1869g(View view, int i, int i2, int i3, int i4);

        /* renamed from: h */
        public abstract void mo1870h(View view, float f, float f2);

        /* renamed from: i */
        public abstract boolean mo1871i(View view, int i);
    }

    public C0962p9(Context context, ViewGroup viewGroup, C0965c cVar) {
        if (cVar != null) {
            this.f3602t = viewGroup;
            this.f3599q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3597o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3584b = viewConfiguration.getScaledTouchSlop();
            this.f3595m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3596n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3598p = new OverScroller(context, f3582v);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: a */
    public void mo3977a() {
        this.f3585c = -1;
        float[] fArr = this.f3586d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3587e, 0.0f);
            Arrays.fill(this.f3588f, 0.0f);
            Arrays.fill(this.f3589g, 0.0f);
            Arrays.fill(this.f3590h, 0);
            Arrays.fill(this.f3591i, 0);
            Arrays.fill(this.f3592j, 0);
            this.f3593k = 0;
        }
        VelocityTracker velocityTracker = this.f3594l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3594l = null;
        }
    }

    /* renamed from: b */
    public void mo3978b(View view, int i) {
        if (view.getParent() == this.f3602t) {
            this.f3600r = view;
            this.f3585c = i;
            this.f3599q.mo1867e(view, i);
            mo3995s(1);
            return;
        }
        StringBuilder c = C0279ch.m1106c("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        c.append(this.f3602t);
        c.append(")");
        throw new IllegalArgumentException(c.toString());
    }

    /* renamed from: c */
    public final boolean mo3979c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3590h[i] & i2) != i2 || (0 & i2) == 0 || (this.f3592j[i] & i2) == i2 || (this.f3591i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3584b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f3599q.getClass();
        }
        return (this.f3591i[i] & i2) == 0 && abs > ((float) this.f3584b);
    }

    /* renamed from: d */
    public final boolean mo3980d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3599q.mo1866c(view) > 0;
        boolean z2 = this.f3599q.mo1920d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3584b) : z2 && Math.abs(f2) > ((float) this.f3584b);
        }
        float f3 = f2 * f2;
        int i = this.f3584b;
        return f3 + (f * f) > ((float) (i * i));
    }

    /* renamed from: e */
    public final float mo3981e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: f */
    public final int mo3982f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    public final void mo3983g(int i) {
        float[] fArr = this.f3586d;
        if (fArr != null) {
            int i2 = this.f3593k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f3587e[i] = 0.0f;
                this.f3588f[i] = 0.0f;
                this.f3589g[i] = 0.0f;
                this.f3590h[i] = 0;
                this.f3591i[i] = 0;
                this.f3592j[i] = 0;
                this.f3593k = (i3 ^ -1) & i2;
            }
        }
    }

    /* renamed from: h */
    public final int mo3984h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f3602t.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: i */
    public boolean mo3985i(boolean z) {
        if (this.f3583a == 2) {
            boolean computeScrollOffset = this.f3598p.computeScrollOffset();
            int currX = this.f3598p.getCurrX();
            int currY = this.f3598p.getCurrY();
            int left = currX - this.f3600r.getLeft();
            int top = currY - this.f3600r.getTop();
            if (left != 0) {
                C0813m8.m2488v(this.f3600r, left);
            }
            if (top != 0) {
                C0813m8.m2489w(this.f3600r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3599q.mo1869g(this.f3600r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3598p.getFinalX() && currY == this.f3598p.getFinalY()) {
                this.f3598p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3602t.post(this.f3603u);
                } else {
                    mo3995s(0);
                }
            }
        }
        return this.f3583a == 2;
    }

    /* renamed from: j */
    public final void mo3986j(float f, float f2) {
        this.f3601s = true;
        this.f3599q.mo1870h(this.f3600r, f, f2);
        this.f3601s = false;
        if (this.f3583a == 1) {
            mo3995s(0);
        }
    }

    /* renamed from: k */
    public View mo3987k(int i, int i2) {
        for (int childCount = this.f3602t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f3602t;
            this.f3599q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo3988l(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f3600r.getLeft();
        int top = this.f3600r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3598p.abortAnimation();
            mo3995s(0);
            return false;
        }
        View view = this.f3600r;
        int f5 = mo3982f(i3, (int) this.f3596n, (int) this.f3595m);
        int f6 = mo3982f(i4, (int) this.f3596n, (int) this.f3595m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f5 != 0) {
            f = (float) abs3;
            f2 = (float) i7;
        } else {
            f = (float) abs;
            f2 = (float) i8;
        }
        float f7 = f / f2;
        if (f6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        int h = mo3984h(i5, f5, this.f3599q.mo1866c(view));
        float h2 = ((float) mo3984h(i6, f6, this.f3599q.mo1920d(view))) * (f4 / f3);
        this.f3598p.startScroll(left, top, i5, i6, (int) (h2 + (((float) h) * f7)));
        mo3995s(2);
        return true;
    }

    /* renamed from: m */
    public final boolean mo3989m(int i) {
        return ((1 << i) & this.f3593k) != 0;
    }

    /* renamed from: n */
    public void mo3990n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo3977a();
        }
        if (this.f3594l == null) {
            this.f3594l = VelocityTracker.obtain();
        }
        this.f3594l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3583a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (mo3989m(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f3586d[pointerId];
                                float f2 = y - this.f3587e[pointerId];
                                mo3992p(f, f2, pointerId);
                                if (this.f3583a != 1) {
                                    View k = mo3987k((int) x, (int) y);
                                    if (mo3980d(k, f, f2) && mo3998v(k, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (mo3989m(this.f3585c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3585c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f3588f;
                        int i3 = this.f3585c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f3589g[i3]);
                        int left = this.f3600r.getLeft() + i4;
                        int top = this.f3600r.getTop() + i5;
                        int left2 = this.f3600r.getLeft();
                        int top2 = this.f3600r.getTop();
                        if (i4 != 0) {
                            left = this.f3599q.mo1864a(this.f3600r, left, i4);
                            C0813m8.m2488v(this.f3600r, left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.f3599q.mo1865b(this.f3600r, top, i5);
                            C0813m8.m2489w(this.f3600r, top - top2);
                        }
                        int i7 = top;
                        if (!(i4 == 0 && i5 == 0)) {
                            this.f3599q.mo1869g(this.f3600r, i6, i7, i6 - left2, i7 - top2);
                        }
                    } else {
                        return;
                    }
                    mo3994r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        mo3993q(x3, y3, pointerId2);
                        if (this.f3583a == 0) {
                            mo3998v(mo3987k((int) x3, (int) y3), pointerId2);
                            if ((this.f3590h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i8 = (int) x3;
                            int i9 = (int) y3;
                            View view = this.f3600r;
                            if (view != null && i8 >= view.getLeft() && i8 < view.getRight() && i9 >= view.getTop() && i9 < view.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                mo3998v(this.f3600r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f3583a == 1 && pointerId3 == this.f3585c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f3585c) {
                                    View k2 = mo3987k((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view2 = this.f3600r;
                                    if (k2 == view2 && mo3998v(view2, pointerId4)) {
                                        i = this.f3585c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                mo3991o();
                            }
                        }
                        mo3983g(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f3583a == 1) {
                    mo3986j(0.0f, 0.0f);
                }
            } else if (this.f3583a == 1) {
                mo3991o();
            }
            mo3977a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View k3 = mo3987k((int) x4, (int) y4);
        mo3993q(x4, y4, pointerId5);
        mo3998v(k3, pointerId5);
        if ((this.f3590h[pointerId5] & 0) == 0) {
            return;
        }
        this.f3599q.getClass();
    }

    /* renamed from: o */
    public final void mo3991o() {
        this.f3594l.computeCurrentVelocity(1000, this.f3595m);
        mo3986j(mo3981e(this.f3594l.getXVelocity(this.f3585c), this.f3596n, this.f3595m), mo3981e(this.f3594l.getYVelocity(this.f3585c), this.f3596n, this.f3595m));
    }

    /* renamed from: p */
    public final void mo3992p(float f, float f2, int i) {
        int i2 = 1;
        if (!mo3979c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (mo3979c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (mo3979c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (mo3979c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f3591i;
            iArr[i] = iArr[i] | i2;
            this.f3599q.getClass();
        }
    }

    /* renamed from: q */
    public final void mo3993q(float f, float f2, int i) {
        float[] fArr = this.f3586d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3587e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3588f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3589g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3590h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3591i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3592j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3586d = fArr2;
            this.f3587e = fArr3;
            this.f3588f = fArr4;
            this.f3589g = fArr5;
            this.f3590h = iArr;
            this.f3591i = iArr2;
            this.f3592j = iArr3;
        }
        float[] fArr9 = this.f3586d;
        this.f3588f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f3587e;
        this.f3589g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f3590h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f3602t.getLeft() + this.f3597o) {
            i2 = 1;
        }
        if (i5 < this.f3602t.getTop() + this.f3597o) {
            i2 |= 4;
        }
        if (i4 > this.f3602t.getRight() - this.f3597o) {
            i2 |= 2;
        }
        if (i5 > this.f3602t.getBottom() - this.f3597o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f3593k |= 1 << i;
    }

    /* renamed from: r */
    public final void mo3994r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo3989m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3588f[pointerId] = x;
                this.f3589g[pointerId] = y;
            }
        }
    }

    /* renamed from: s */
    public void mo3995s(int i) {
        this.f3602t.removeCallbacks(this.f3603u);
        if (this.f3583a != i) {
            this.f3583a = i;
            this.f3599q.mo1868f(i);
            if (this.f3583a == 0) {
                this.f3600r = null;
            }
        }
    }

    /* renamed from: t */
    public boolean mo3996t(int i, int i2) {
        if (this.f3601s) {
            return mo3988l(i, i2, (int) this.f3594l.getXVelocity(this.f3585c), (int) this.f3594l.getYVelocity(this.f3585c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3997u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo3977a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3594l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3594l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3594l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0104
            if (r2 == r5) goto L_0x00ff
            if (r2 == r4) goto L_0x006f
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r4 = 6
            if (r2 == r4) goto L_0x0034
            goto L_0x0102
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.mo3983g(r1)
            goto L_0x0102
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo3993q(r7, r1, r2)
            int r3 = r0.f3583a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f3590h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0102
            p9$c r1 = r0.f3599q
            r1.getClass()
            goto L_0x0102
        L_0x005e:
            if (r3 != r4) goto L_0x0102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo3987k(r3, r1)
            android.view.View r3 = r0.f3600r
            if (r1 != r3) goto L_0x0102
            r0.mo3998v(r1, r2)
            goto L_0x0102
        L_0x006f:
            float[] r2 = r0.f3586d
            if (r2 == 0) goto L_0x0102
            float[] r2 = r0.f3587e
            if (r2 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo3989m(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3586d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3587e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo3987k(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.mo3980d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            p9$c r14 = r0.f3599q
            int r12 = r14.mo1864a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            p9$c r6 = r0.f3599q
            int r6 = r6.mo1865b(r7, r15, r14)
            p9$c r14 = r0.f3599q
            int r14 = r14.mo1866c(r7)
            p9$c r15 = r0.f3599q
            int r15 = r15.mo1920d(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fb
            if (r15 <= 0) goto L_0x00e6
            if (r6 != r13) goto L_0x00e6
            goto L_0x00fb
        L_0x00e6:
            r0.mo3992p(r9, r10, r4)
            int r6 = r0.f3583a
            if (r6 != r5) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo3998v(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007e
        L_0x00fb:
            r16.mo3994r(r17)
            goto L_0x0102
        L_0x00ff:
            r16.mo3977a()
        L_0x0102:
            r2 = 0
            goto L_0x0132
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.mo3993q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo3987k(r2, r3)
            android.view.View r3 = r0.f3600r
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f3583a
            if (r3 != r4) goto L_0x0125
            r0.mo3998v(r2, r1)
        L_0x0125:
            int[] r2 = r0.f3590h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0132
            p9$c r1 = r0.f3599q
            r1.getClass()
        L_0x0132:
            int r1 = r0.f3583a
            if (r1 != r5) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r5 = 0
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0962p9.mo3997u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public boolean mo3998v(View view, int i) {
        if (view == this.f3600r && this.f3585c == i) {
            return true;
        }
        if (view == null || !this.f3599q.mo1871i(view, i)) {
            return false;
        }
        this.f3585c = i;
        mo3978b(view, i);
        return true;
    }
}
