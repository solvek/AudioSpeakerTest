package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000.C0449f1;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0802m2, C0560h8, C0457f8, C0523g8 {

    /* renamed from: G */
    public static final int[] f264G = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    public OverScroller f265A;

    /* renamed from: B */
    public ViewPropertyAnimator f266B;

    /* renamed from: C */
    public final AnimatorListenerAdapter f267C;

    /* renamed from: D */
    public final Runnable f268D;

    /* renamed from: E */
    public final Runnable f269E;

    /* renamed from: F */
    public final C0611i8 f270F;

    /* renamed from: b */
    public int f271b;

    /* renamed from: c */
    public int f272c = 0;

    /* renamed from: d */
    public ContentFrameLayout f273d;

    /* renamed from: e */
    public ActionBarContainer f274e;

    /* renamed from: f */
    public C0855n2 f275f;

    /* renamed from: g */
    public Drawable f276g;

    /* renamed from: h */
    public boolean f277h;

    /* renamed from: i */
    public boolean f278i;

    /* renamed from: j */
    public boolean f279j;

    /* renamed from: k */
    public boolean f280k;

    /* renamed from: l */
    public boolean f281l;

    /* renamed from: m */
    public int f282m;

    /* renamed from: n */
    public int f283n;

    /* renamed from: o */
    public final Rect f284o = new Rect();

    /* renamed from: p */
    public final Rect f285p = new Rect();

    /* renamed from: q */
    public final Rect f286q = new Rect();

    /* renamed from: r */
    public final Rect f287r = new Rect();

    /* renamed from: s */
    public final Rect f288s = new Rect();

    /* renamed from: t */
    public final Rect f289t = new Rect();

    /* renamed from: u */
    public final Rect f290u = new Rect();

    /* renamed from: v */
    public C1241v8 f291v;

    /* renamed from: w */
    public C1241v8 f292w;

    /* renamed from: x */
    public C1241v8 f293x;

    /* renamed from: y */
    public C1241v8 f294y;

    /* renamed from: z */
    public C0048d f295z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0045a extends AnimatorListenerAdapter {
        public C0045a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f266B = null;
            actionBarOverlayLayout.f281l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f266B = null;
            actionBarOverlayLayout.f281l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0046b implements Runnable {
        public C0046b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo262q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f266B = actionBarOverlayLayout.f274e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f267C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0047c implements Runnable {
        public C0047c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo262q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f266B = actionBarOverlayLayout.f274e.animate().translationY((float) (-ActionBarOverlayLayout.this.f274e.getHeight())).setListener(ActionBarOverlayLayout.this.f267C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0048d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0049e extends ViewGroup.MarginLayoutParams {
        public C0049e(int i, int i2) {
            super(i, i2);
        }

        public C0049e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0049e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1241v8 v8Var = C1241v8.f4772b;
        this.f291v = v8Var;
        this.f292w = v8Var;
        this.f293x = v8Var;
        this.f294y = v8Var;
        this.f267C = new C0045a();
        this.f268D = new C0046b();
        this.f269E = new C0047c();
        mo263r(context);
        this.f270F = new C0611i8();
    }

    /* renamed from: a */
    public boolean mo223a() {
        mo264s();
        return this.f275f.mo3357a();
    }

    /* renamed from: b */
    public void mo224b(Menu menu, C0449f1.C0450a aVar) {
        mo264s();
        this.f275f.mo3358b(menu, aVar);
    }

    /* renamed from: c */
    public boolean mo225c() {
        mo264s();
        return this.f275f.mo3359c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0049e;
    }

    /* renamed from: d */
    public void mo227d() {
        mo264s();
        this.f275f.mo3361d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f276g != null && !this.f277h) {
            if (this.f274e.getVisibility() == 0) {
                i = (int) (this.f274e.getTranslationY() + ((float) this.f274e.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.f276g.setBounds(0, i, getWidth(), this.f276g.getIntrinsicHeight() + i);
            this.f276g.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo229e() {
        mo264s();
        return this.f275f.mo3362e();
    }

    /* renamed from: f */
    public boolean mo230f() {
        mo264s();
        return this.f275f.mo3363f();
    }

    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo264s();
        boolean p = mo261p(this.f274e, rect, true, true, false, true);
        this.f287r.set(rect);
        Rect rect2 = this.f287r;
        Rect rect3 = this.f284o;
        Method method = C0856n3.f3335a;
        if (method != null) {
            try {
                method.invoke(this, new Object[]{rect2, rect3});
            } catch (Exception unused) {
            }
        }
        if (!this.f288s.equals(this.f287r)) {
            this.f288s.set(this.f287r);
            p = true;
        }
        if (!this.f285p.equals(this.f284o)) {
            this.f285p.set(this.f284o);
            p = true;
        }
        if (p) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo232g() {
        mo264s();
        return this.f275f.mo3364g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0049e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0049e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0049e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f274e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f270F.mo3188a();
    }

    public CharSequence getTitle() {
        mo264s();
        return this.f275f.getTitle();
    }

    /* renamed from: h */
    public void mo239h(int i) {
        mo264s();
        if (i == 2) {
            this.f275f.mo3370l();
        } else if (i == 5) {
            this.f275f.mo3376r();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: i */
    public void mo240i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: j */
    public void mo241j() {
        mo264s();
        this.f275f.mo3366h();
    }

    /* renamed from: k */
    public void mo242k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: l */
    public void mo243l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public void mo244m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: n */
    public void mo245n(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: o */
    public boolean mo246o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo264s();
        windowInsets.getClass();
        C1241v8 v8Var = new C1241v8(windowInsets);
        boolean p = mo261p(this.f274e, new Rect(v8Var.mo4842b(), v8Var.mo4844d(), v8Var.mo4843c(), v8Var.mo4841a()), true, true, false, true);
        Rect rect = this.f284o;
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets g = v8Var.mo4847g();
            if (g != null) {
                C1241v8.m3464h(computeSystemWindowInsets(g, rect));
            } else {
                rect.setEmpty();
            }
        }
        Rect rect2 = this.f284o;
        C1241v8 h = v8Var.f4773a.mo4853h(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f291v = h;
        boolean z = true;
        if (!this.f292w.equals(h)) {
            this.f292w = this.f291v;
            p = true;
        }
        if (!this.f285p.equals(this.f284o)) {
            this.f285p.set(this.f284o);
        } else {
            z = p;
        }
        if (z) {
            requestLayout();
        }
        return v8Var.f4773a.mo4859a().f4773a.mo4856c().f4773a.mo4855b().mo4847g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo263r(getContext());
        C0813m8.m2455D(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo262q();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0049e eVar = (C0049e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.mo264s()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f274e
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f274e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0049e) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f274e
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            r2 = 0
            int r7 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f274e
            int r1 = r1.getMeasuredHeight()
            int r3 = r0.topMargin
            int r1 = r1 + r3
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r8 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r12.f274e
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = p000.C0813m8.m2484r(r12)
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005f
            int r1 = r12.f271b
            boolean r3 = r12.f279j
            if (r3 == 0) goto L_0x0071
            androidx.appcompat.widget.ActionBarContainer r3 = r12.f274e
            android.view.View r3 = r3.getTabContainer()
            if (r3 == 0) goto L_0x0071
            int r3 = r12.f271b
            int r1 = r1 + r3
            goto L_0x0071
        L_0x005f:
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f274e
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L_0x0070
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f274e
            int r1 = r1.getMeasuredHeight()
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            android.graphics.Rect r3 = r12.f286q
            android.graphics.Rect r4 = r12.f284o
            r3.set(r4)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x0083
            v8 r3 = r12.f291v
            r12.f293x = r3
            goto L_0x008a
        L_0x0083:
            android.graphics.Rect r3 = r12.f289t
            android.graphics.Rect r4 = r12.f287r
            r3.set(r4)
        L_0x008a:
            boolean r3 = r12.f278i
            if (r3 != 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            android.graphics.Rect r0 = r12.f286q
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r3 = r0.bottom
            int r3 = r3 + r2
            r0.bottom = r3
            if (r10 < r11) goto L_0x00f8
            v8 r0 = r12.f293x
            v8$h r0 = r0.f4773a
            v8 r0 = r0.mo4853h(r2, r1, r2, r2)
            goto L_0x00e9
        L_0x00a7:
            if (r10 < r11) goto L_0x00ec
            v8 r0 = r12.f293x
            int r0 = r0.mo4842b()
            v8 r3 = r12.f293x
            int r3 = r3.mo4844d()
            int r3 = r3 + r1
            v8 r1 = r12.f293x
            int r1 = r1.mo4843c()
            v8 r4 = r12.f293x
            int r4 = r4.mo4841a()
            int r4 = r4 + r2
            o6 r0 = p000.C0916o6.m2670a(r0, r3, r1, r4)
            v8 r1 = r12.f293x
            r2 = 29
            if (r10 < r2) goto L_0x00d3
            v8$b r2 = new v8$b
            r2.<init>(r1)
            goto L_0x00e2
        L_0x00d3:
            r2 = 20
            if (r10 < r2) goto L_0x00dd
            v8$a r2 = new v8$a
            r2.<init>(r1)
            goto L_0x00e2
        L_0x00dd:
            v8$c r2 = new v8$c
            r2.<init>(r1)
        L_0x00e2:
            r2.mo4850c(r0)
            v8 r0 = r2.mo4849a()
        L_0x00e9:
            r12.f293x = r0
            goto L_0x00f8
        L_0x00ec:
            android.graphics.Rect r0 = r12.f289t
            int r3 = r0.top
            int r3 = r3 + r1
            r0.top = r3
            int r1 = r0.bottom
            int r1 = r1 + r2
            r0.bottom = r1
        L_0x00f8:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f273d
            android.graphics.Rect r2 = r12.f286q
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 1
            r0 = r12
            r0.mo261p(r1, r2, r3, r4, r5, r6)
            if (r10 < r11) goto L_0x012e
            v8 r0 = r12.f294y
            v8 r1 = r12.f293x
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012e
            v8 r0 = r12.f293x
            r12.f294y = r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f273d
            if (r10 < r11) goto L_0x0148
            android.view.WindowInsets r0 = r0.mo4847g()
            if (r0 == 0) goto L_0x0148
            android.view.WindowInsets r1 = r1.dispatchApplyWindowInsets(r0)
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0148
            v8 r1 = new v8
            r1.<init>((android.view.WindowInsets) r0)
            goto L_0x0148
        L_0x012e:
            if (r10 >= r11) goto L_0x0148
            android.graphics.Rect r0 = r12.f290u
            android.graphics.Rect r1 = r12.f289t
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0148
            android.graphics.Rect r0 = r12.f290u
            android.graphics.Rect r1 = r12.f289t
            r0.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f273d
            android.graphics.Rect r1 = r12.f289t
            r0.mo338a(r1)
        L_0x0148:
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f273d
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r12.f273d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0049e) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r12.f273d
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f273d
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r8, r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = r12.f273d
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r9, r2)
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r4 = r4 + r3
            int r4 = r4 + r1
            int r1 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r1
            int r3 = r3 + r0
            int r0 = r12.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = r12.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r4, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r13, r2)
            int r2 = r2 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r2)
            r12.setMeasuredDimension(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f280k || !z) {
            return false;
        }
        this.f265A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f265A.getFinalY() > this.f274e.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo262q();
            this.f269E.run();
        } else {
            mo262q();
            this.f268D.run();
        }
        this.f281l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f282m + i2;
        this.f282m = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (p000.C0356d0) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            i8 r1 = r0.f270F
            r1.f2634a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f282m = r1
            r0.mo262q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f295z
            if (r1 == 0) goto L_0x001d
            d0 r1 = (p000.C0356d0) r1
            r0 r2 = r1.f1861t
            if (r2 == 0) goto L_0x001d
            r2.mo4165a()
            r2 = 0
            r1.f1861t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f274e.getVisibility() != 0) {
            return false;
        }
        return this.f280k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f280k && !this.f281l) {
            if (this.f282m <= this.f274e.getHeight()) {
                mo262q();
                postDelayed(this.f268D, 600);
            } else {
                mo262q();
                postDelayed(this.f269E, 600);
            }
        }
        C0048d dVar = this.f295z;
        if (dVar != null) {
            ((C0356d0) dVar).getClass();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo264s();
        int i2 = this.f283n ^ i;
        this.f283n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        C0048d dVar = this.f295z;
        if (dVar != null) {
            ((C0356d0) dVar).f1857p = !z2;
            if (z || !z2) {
                C0356d0 d0Var = (C0356d0) dVar;
                if (d0Var.f1858q) {
                    d0Var.f1858q = false;
                    d0Var.mo2605g(true);
                }
            } else {
                C0356d0 d0Var2 = (C0356d0) dVar;
                if (!d0Var2.f1858q) {
                    d0Var2.f1858q = true;
                    d0Var2.mo2605g(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f295z != null) {
            C0813m8.m2455D(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f272c = i;
        C0048d dVar = this.f295z;
        if (dVar != null) {
            ((C0356d0) dVar).f1856o = i;
        }
    }

    /* renamed from: p */
    public final boolean mo261p(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0049e eVar = (C0049e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: q */
    public void mo262q() {
        removeCallbacks(this.f268D);
        removeCallbacks(this.f269E);
        ViewPropertyAnimator viewPropertyAnimator = this.f266B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void mo263r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f264G);
        boolean z = false;
        this.f271b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f276g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f277h = z;
        this.f265A = new OverScroller(context);
    }

    /* renamed from: s */
    public void mo264s() {
        C0855n2 n2Var;
        if (this.f273d == null) {
            this.f273d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f274e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C0855n2) {
                n2Var = (C0855n2) findViewById;
            } else if (findViewById instanceof Toolbar) {
                n2Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder c = C0279ch.m1106c("Can't make a decor toolbar out of ");
                c.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(c.toString());
            }
            this.f275f = n2Var;
        }
    }

    public void setActionBarHideOffset(int i) {
        mo262q();
        this.f274e.setTranslationY((float) (-Math.max(0, Math.min(i, this.f274e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0048d dVar) {
        this.f295z = dVar;
        if (getWindowToken() != null) {
            ((C0356d0) this.f295z).f1856o = this.f272c;
            int i = this.f283n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0813m8.m2455D(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f279j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f280k) {
            this.f280k = z;
            if (!z) {
                mo262q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo264s();
        this.f275f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo264s();
        this.f275f.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo264s();
        this.f275f.mo3372n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f278i = z;
        this.f277h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo264s();
        this.f275f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo264s();
        this.f275f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
