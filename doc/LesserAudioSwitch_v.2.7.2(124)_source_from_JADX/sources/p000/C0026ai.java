package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: ai */
public abstract class C0026ai<V extends View> extends C0280ci<V> {

    /* renamed from: c */
    public Runnable f99c;

    /* renamed from: d */
    public OverScroller f100d;

    /* renamed from: e */
    public boolean f101e;

    /* renamed from: f */
    public int f102f = -1;

    /* renamed from: g */
    public int f103g;

    /* renamed from: h */
    public int f104h = -1;

    /* renamed from: i */
    public VelocityTracker f105i;

    /* renamed from: ai$a */
    public class C0027a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f106b;

        /* renamed from: c */
        public final View f107c;

        public C0027a(CoordinatorLayout coordinatorLayout, V v) {
            this.f106b = coordinatorLayout;
            this.f107c = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f107c != null && (overScroller = C0026ai.this.f100d) != null) {
                if (overScroller.computeScrollOffset()) {
                    C0026ai aiVar = C0026ai.this;
                    aiVar.mo115G(this.f106b, this.f107c, aiVar.f100d.getCurrY());
                    C0813m8.m2491y(this.f107c, this);
                    return;
                }
                C0026ai aiVar2 = C0026ai.this;
                CoordinatorLayout coordinatorLayout = this.f106b;
                View view = this.f107c;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) aiVar2;
                baseBehavior.getClass();
                AppBarLayout appBarLayout = (AppBarLayout) view;
                baseBehavior.mo1852O(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1426j) {
                    appBarLayout.mo1813d(appBarLayout.mo1816e(baseBehavior.mo1848K(coordinatorLayout)));
                }
            }
        }
    }

    public C0026ai() {
    }

    public C0026ai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo112A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r8 = 1
            r9 = 0
            r3 = 0
            r4 = -1
            if (r0 == r8) goto L_0x005e
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00d5
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f102f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f103g = r0
            goto L_0x005b
        L_0x0036:
            int r0 = r6.f102f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f103g
            int r3 = r3 - r0
            r6.f103g = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.mo114F(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = 0
            goto L_0x00e3
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f105i
            if (r0 == 0) goto L_0x00d5
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f105i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f105i
            int r5 = r6.f102f
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.f99c
            if (r11 == 0) goto L_0x0087
            r2.removeCallbacks(r11)
            r6.f99c = r3
        L_0x0087:
            android.widget.OverScroller r11 = r6.f100d
            if (r11 != 0) goto L_0x0096
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.f100d = r11
        L_0x0096:
            android.widget.OverScroller r11 = r6.f100d
            r12 = 0
            int r13 = r20.mo1765B()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.f100d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            ai$a r0 = new ai$a
            r0.<init>(r1, r2)
            r6.f99c = r0
            p000.C0813m8.m2491y(r2, r0)
            goto L_0x00d3
        L_0x00be:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.mo1852O(r1, r5)
            boolean r2 = r5.f1426j
            if (r2 == 0) goto L_0x00d3
            android.view.View r0 = r0.mo1848K(r1)
            boolean r0 = r5.mo1816e(r0)
            r5.mo1813d(r0)
        L_0x00d3:
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r6.f101e = r9
            r6.f102f = r4
            android.view.VelocityTracker r1 = r6.f105i
            if (r1 == 0) goto L_0x00e3
            r1.recycle()
            r6.f105i = r3
        L_0x00e3:
            android.view.VelocityTracker r1 = r6.f105i
            if (r1 == 0) goto L_0x00ea
            r1.addMovement(r7)
        L_0x00ea:
            boolean r1 = r6.f101e
            if (r1 != 0) goto L_0x00f2
            if (r0 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r8 = 0
        L_0x00f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0026ai.mo112A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: E */
    public abstract int mo113E();

    /* renamed from: F */
    public final int mo114F(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo116H(coordinatorLayout, v, mo113E() - i, i2, i3);
    }

    /* renamed from: G */
    public int mo115G(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo116H(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: H */
    public abstract int mo116H(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo117j(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f104h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f104h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.f101e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f102f
            if (r0 != r2) goto L_0x0025
            return r3
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r2) goto L_0x002c
            return r3
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f103g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f104h
            if (r1 <= r5) goto L_0x0040
            r7.f103g = r0
            return r4
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x00a5
            r7.f102f = r2
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.f1438p
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0071
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0071
            boolean r2 = r5.canScrollVertically(r2)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r2 = 0
            goto L_0x0074
        L_0x0073:
            r2 = 1
        L_0x0074:
            if (r2 == 0) goto L_0x007e
            boolean r8 = r8.mo677p(r9, r0, r1)
            if (r8 == 0) goto L_0x007e
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            r7.f101e = r8
            if (r8 == 0) goto L_0x00a5
            r7.f103g = r1
            int r8 = r10.getPointerId(r3)
            r7.f102f = r8
            android.view.VelocityTracker r8 = r7.f105i
            if (r8 != 0) goto L_0x0095
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f105i = r8
        L_0x0095:
            android.widget.OverScroller r8 = r7.f100d
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x00a5
            android.widget.OverScroller r8 = r7.f100d
            r8.abortAnimation()
            return r4
        L_0x00a5:
            android.view.VelocityTracker r8 = r7.f105i
            if (r8 == 0) goto L_0x00ac
            r8.addMovement(r10)
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0026ai.mo117j(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
