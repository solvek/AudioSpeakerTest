package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: r2 */
public abstract class C1039r2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f3892b;

    /* renamed from: c */
    public final int f3893c;

    /* renamed from: d */
    public final int f3894d;

    /* renamed from: e */
    public final View f3895e;

    /* renamed from: f */
    public Runnable f3896f;

    /* renamed from: g */
    public Runnable f3897g;

    /* renamed from: h */
    public boolean f3898h;

    /* renamed from: i */
    public int f3899i;

    /* renamed from: j */
    public final int[] f3900j = new int[2];

    /* renamed from: r2$a */
    public class C1040a implements Runnable {
        public C1040a() {
        }

        public void run() {
            ViewParent parent = C1039r2.this.f3895e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: r2$b */
    public class C1041b implements Runnable {
        public C1041b() {
        }

        public void run() {
            C1039r2 r2Var = C1039r2.this;
            r2Var.mo4182a();
            View view = r2Var.f3895e;
            if (view.isEnabled() && !view.isLongClickable() && r2Var.mo164c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                r2Var.f3898h = true;
            }
        }
    }

    public C1039r2(View view) {
        this.f3895e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3892b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3893c = tapTimeout;
        this.f3894d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void mo4182a() {
        Runnable runnable = this.f3897g;
        if (runnable != null) {
            this.f3895e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f3896f;
        if (runnable2 != null) {
            this.f3895e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract C0597i1 mo163b();

    /* renamed from: c */
    public abstract boolean mo164c();

    /* renamed from: d */
    public boolean mo3829d() {
        C0597i1 b = mo163b();
        if (b == null || !b.mo3108a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f3898h
            r0 = 3
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.f3895e
            i1 r4 = r11.mo163b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.mo3108a()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.mo3110e()
            p2 r4 = (p000.C0951p2) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f3900j
            r3.getLocationOnScreen(r6)
            r3 = r6[r1]
            float r3 = (float) r3
            r6 = r6[r2]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f3900j
            r4.getLocationOnScreen(r3)
            r6 = r3[r1]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r2]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f3899i
            boolean r3 = r4.mo3935b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r2) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = 1
            goto L_0x0062
        L_0x0061:
            r13 = 0
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.mo3829d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = 0
            goto L_0x0128
        L_0x006e:
            r13 = 1
            goto L_0x0128
        L_0x0071:
            android.view.View r3 = r11.f3895e
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007c
        L_0x0079:
            r13 = 0
            goto L_0x0106
        L_0x007c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r2) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0079
        L_0x008a:
            int r0 = r11.f3899i
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0079
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f3892b
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = 1
            goto L_0x00c6
        L_0x00c5:
            r13 = 0
        L_0x00c6:
            if (r13 != 0) goto L_0x0079
            r11.mo4182a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r2)
            r13 = 1
            goto L_0x0106
        L_0x00d4:
            r11.mo4182a()
            goto L_0x0079
        L_0x00d8:
            int r13 = r13.getPointerId(r1)
            r11.f3899i = r13
            java.lang.Runnable r13 = r11.f3896f
            if (r13 != 0) goto L_0x00e9
            r2$a r13 = new r2$a
            r13.<init>()
            r11.f3896f = r13
        L_0x00e9:
            java.lang.Runnable r13 = r11.f3896f
            int r0 = r11.f3893c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f3897g
            if (r13 != 0) goto L_0x00fc
            r2$b r13 = new r2$b
            r13.<init>()
            r11.f3897g = r13
        L_0x00fc:
            java.lang.Runnable r13 = r11.f3897g
            int r0 = r11.f3894d
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0079
        L_0x0106:
            if (r13 == 0) goto L_0x0110
            boolean r13 = r11.mo164c()
            if (r13 == 0) goto L_0x0110
            r13 = 1
            goto L_0x0111
        L_0x0110:
            r13 = 0
        L_0x0111:
            if (r13 == 0) goto L_0x0128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f3895e
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0128:
            r11.f3898h = r13
            if (r13 != 0) goto L_0x012e
            if (r12 == 0) goto L_0x012f
        L_0x012e:
            r1 = 1
        L_0x012f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1039r2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f3898h = false;
        this.f3899i = -1;
        Runnable runnable = this.f3896f;
        if (runnable != null) {
            this.f3895e.removeCallbacks(runnable);
        }
    }
}
