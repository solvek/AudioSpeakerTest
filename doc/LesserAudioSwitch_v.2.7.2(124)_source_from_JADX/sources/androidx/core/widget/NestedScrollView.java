package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p000.C1347x8;

public class NestedScrollView extends FrameLayout implements C0523g8, C0368d8 {

    /* renamed from: B */
    public static final C0097a f646B = new C0097a();

    /* renamed from: C */
    public static final int[] f647C = {16843130};

    /* renamed from: A */
    public C0098b f648A;

    /* renamed from: b */
    public long f649b;

    /* renamed from: c */
    public final Rect f650c = new Rect();

    /* renamed from: d */
    public OverScroller f651d = new OverScroller(getContext());

    /* renamed from: e */
    public EdgeEffect f652e;

    /* renamed from: f */
    public EdgeEffect f653f;

    /* renamed from: g */
    public int f654g;

    /* renamed from: h */
    public boolean f655h = true;

    /* renamed from: i */
    public boolean f656i = false;

    /* renamed from: j */
    public View f657j = null;

    /* renamed from: k */
    public boolean f658k = false;

    /* renamed from: l */
    public VelocityTracker f659l;

    /* renamed from: m */
    public boolean f660m;

    /* renamed from: n */
    public boolean f661n = true;

    /* renamed from: o */
    public int f662o;

    /* renamed from: p */
    public int f663p;

    /* renamed from: q */
    public int f664q;

    /* renamed from: r */
    public int f665r = -1;

    /* renamed from: s */
    public final int[] f666s = new int[2];

    /* renamed from: t */
    public final int[] f667t = new int[2];

    /* renamed from: u */
    public int f668u;

    /* renamed from: v */
    public int f669v;

    /* renamed from: w */
    public C0099c f670w;

    /* renamed from: x */
    public final C0611i8 f671x;

    /* renamed from: y */
    public final C0410e8 f672y;

    /* renamed from: z */
    public float f673z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0097a extends C1444z7 {
        /* renamed from: c */
        public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
            this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            int i = Build.VERSION.SDK_INT;
            if (i >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int scrollRange = nestedScrollView.getScrollRange();
            if (i >= 15) {
                accessibilityEvent.setMaxScrollY(scrollRange);
            }
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            int scrollRange;
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            x8Var.f5038a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                x8Var.f5038a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    x8Var.mo5055a(C1347x8.C1348a.f5043g);
                    x8Var.mo5055a(C1347x8.C1348a.f5047k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    x8Var.mo5055a(C1347x8.C1348a.f5042f);
                    x8Var.mo5055a(C1347x8.C1348a.f5048l);
                }
            }
        }

        /* renamed from: g */
        public boolean mo818g(View view, int i, Bundle bundle) {
            int min;
            if (super.mo818g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo745B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo745B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0098b {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0099c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0099c> CREATOR = new C0100a();

        /* renamed from: b */
        public int f674b;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class C0100a implements Parcelable.Creator<C0099c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0099c(parcel);
            }

            public Object[] newArray(int i) {
                return new C0099c[i];
            }
        }

        public C0099c(Parcel parcel) {
            super(parcel);
            this.f674b = parcel.readInt();
        }

        public C0099c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("HorizontalScrollView.SavedState{");
            c.append(Integer.toHexString(System.identityHashCode(this)));
            c.append(" scrollPosition=");
            c.append(this.f674b);
            c.append("}");
            return c.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f674b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f662o = viewConfiguration.getScaledTouchSlop();
        this.f663p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f664q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f647C, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f671x = new C0611i8();
        this.f672y = new C0410e8(this);
        setNestedScrollingEnabled(true);
        C0813m8.m2457F(this, f646B);
    }

    /* renamed from: c */
    public static int m258c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f673z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f673z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f673z;
    }

    /* renamed from: s */
    public static boolean m259s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m259s((View) parent, view2);
    }

    /* renamed from: A */
    public final void mo744A(View view) {
        view.getDrawingRect(this.f650c);
        offsetDescendantRectToMyCoords(view, this.f650c);
        int d = mo761d(this.f650c);
        if (d != 0) {
            scrollBy(0, d);
        }
    }

    /* renamed from: B */
    public final void mo745B(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f649b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f651d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo814y(z);
            } else {
                if (!this.f651d.isFinished()) {
                    mo748a();
                }
                scrollBy(i, i2);
            }
            this.f649b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: C */
    public boolean mo746C(int i, int i2) {
        return this.f672y.mo2717j(i, i2);
    }

    /* renamed from: D */
    public void mo747D(int i) {
        this.f672y.mo2718k(i);
    }

    /* renamed from: a */
    public final void mo748a() {
        this.f651d.abortAnimation();
        this.f672y.mo2718k(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo753b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo809t(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo769f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f650c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f650c);
            mo769f(mo761d(this.f650c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!mo809t(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f651d.isFinished()) {
            this.f651d.computeScrollOffset();
            int currY = this.f651d.getCurrY();
            int i = currY - this.f669v;
            this.f669v = currY;
            int[] iArr = this.f667t;
            boolean z = false;
            iArr[1] = 0;
            mo768e(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f667t[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo812w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f667t;
                iArr2[1] = 0;
                this.f672y.mo2713f(0, scrollY2, 0, i3, this.f666s, 1, iArr2);
                i2 = i3 - this.f667t[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    mo776h();
                    if (i2 < 0) {
                        if (this.f652e.isFinished()) {
                            edgeEffect = this.f652e;
                        }
                    } else if (this.f653f.isFinished()) {
                        edgeEffect = this.f653f;
                    }
                    edgeEffect.onAbsorb((int) this.f651d.getCurrVelocity());
                }
                mo748a();
            }
            if (!this.f651d.isFinished()) {
                Field field = C0813m8.f3234a;
                if (Build.VERSION.SDK_INT >= 16) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidate();
                }
            } else {
                this.f672y.mo2718k(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public int mo761d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo779j(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f672y.mo2708a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f672y.mo2709b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo768e(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f672y.mo2712e(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f652e != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f652e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f652e.setSize(width, height);
                if (this.f652e.draw(canvas)) {
                    Field field = C0813m8.f3234a;
                    if (i3 >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
                canvas.restoreToCount(save);
            }
            if (!this.f653f.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f653f.setSize(width2, height2);
                if (this.f653f.draw(canvas)) {
                    Field field2 = C0813m8.f3234a;
                    if (i4 >= 16) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidate();
                    }
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo768e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f672y.mo2710c(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: f */
    public final void mo769f(int i) {
        if (i == 0) {
            return;
        }
        if (this.f661n) {
            mo745B(0, i, 250, false);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: g */
    public final void mo770g() {
        this.f658k = false;
        mo813x();
        this.f672y.mo2718k(0);
        EdgeEffect edgeEffect = this.f652e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f653f.onRelease();
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f671x.mo3188a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final void mo776h() {
        if (getOverScrollMode() == 2) {
            this.f652e = null;
            this.f653f = null;
        } else if (this.f652e == null) {
            Context context = getContext();
            this.f652e = new EdgeEffect(context);
            this.f653f = new EdgeEffect(context);
        }
    }

    public boolean hasNestedScrollingParent() {
        return mo796r(0);
    }

    /* renamed from: i */
    public void mo240i(View view, View view2, int i, int i2) {
        C0611i8 i8Var = this.f671x;
        if (i2 == 1) {
            i8Var.f2635b = i;
        } else {
            i8Var.f2634a = i;
        }
        mo746C(2, i2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f672y.f1983d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo779j(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f650c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ec
            r4 = 20
            if (r0 == r4) goto L_0x00dc
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fb
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00bf
            android.graphics.Rect r7 = r6.f650c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f650c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d1
            int r1 = r1 - r0
            goto L_0x00cf
        L_0x00bf:
            android.graphics.Rect r7 = r6.f650c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f650c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d1
            r1 = 0
        L_0x00cf:
            r7.top = r1
        L_0x00d1:
            android.graphics.Rect r7 = r6.f650c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.mo815z(r5, r1, r0)
            goto L_0x00fb
        L_0x00dc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e7
            boolean r2 = r6.mo753b(r3)
            goto L_0x00fb
        L_0x00e7:
            boolean r2 = r6.mo795q(r3)
            goto L_0x00fb
        L_0x00ec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f7
            boolean r2 = r6.mo753b(r5)
            goto L_0x00fb
        L_0x00f7:
            boolean r2 = r6.mo795q(r5)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo779j(android.view.KeyEvent):boolean");
    }

    /* renamed from: k */
    public void mo242k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo810u(i4, i5, iArr);
    }

    /* renamed from: l */
    public void mo243l(View view, int i, int i2, int i3, int i4, int i5) {
        mo810u(i4, i5, (int[]) null);
    }

    /* renamed from: m */
    public void mo244m(View view, int i) {
        C0611i8 i8Var = this.f671x;
        if (i == 1) {
            i8Var.f2635b = 0;
        } else {
            i8Var.f2634a = 0;
        }
        this.f672y.mo2718k(i);
    }

    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo245n(View view, int i, int i2, int[] iArr, int i3) {
        mo768e(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: o */
    public boolean mo246o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f656i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f658k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r11.f658k
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x009d
            r4 = -1
            if (r0 == r1) goto L_0x006a
            if (r0 == r2) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0106
        L_0x001f:
            r11.mo811v(r12)
            goto L_0x0106
        L_0x0024:
            int r0 = r11.f665r
            if (r0 != r4) goto L_0x002a
            goto L_0x0106
        L_0x002a:
            int r0 = r12.findPointerIndex(r0)
            if (r0 != r4) goto L_0x0032
            goto L_0x0106
        L_0x0032:
            float r0 = r12.getY(r0)
            int r0 = (int) r0
            int r4 = r11.f654g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f662o
            if (r4 <= r5) goto L_0x0106
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L_0x0106
            r11.f658k = r1
            r11.f654g = r0
            android.view.VelocityTracker r0 = r11.f659l
            if (r0 != 0) goto L_0x0058
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f659l = r0
        L_0x0058:
            android.view.VelocityTracker r0 = r11.f659l
            r0.addMovement(r12)
            r11.f668u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0106
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0106
        L_0x006a:
            r11.f658k = r3
            r11.f665r = r4
            r11.mo813x()
            android.widget.OverScroller r4 = r11.f651d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x0097
            java.lang.reflect.Field r12 = p000.C0813m8.f3234a
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r12 < r0) goto L_0x0094
            r11.postInvalidateOnAnimation()
            goto L_0x0097
        L_0x0094:
            r11.postInvalidate()
        L_0x0097:
            e8 r12 = r11.f672y
            r12.mo2718k(r3)
            goto L_0x0106
        L_0x009d:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00d1
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00d1
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00d1
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00d1
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00d1
            r4 = 1
            goto L_0x00d2
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            if (r4 != 0) goto L_0x00da
            r11.f658k = r3
            r11.mo813x()
            goto L_0x0106
        L_0x00da:
            r11.f654g = r0
            int r0 = r12.getPointerId(r3)
            r11.f665r = r0
            android.view.VelocityTracker r0 = r11.f659l
            if (r0 != 0) goto L_0x00ed
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f659l = r0
            goto L_0x00f0
        L_0x00ed:
            r0.clear()
        L_0x00f0:
            android.view.VelocityTracker r0 = r11.f659l
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f651d
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f651d
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r1
            r11.f658k = r12
            r11.mo746C(r2, r3)
        L_0x0106:
            boolean r12 = r11.f658k
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f655h = false;
        View view = this.f657j;
        if (view != null && m259s(view, this)) {
            mo744A(this.f657j);
        }
        this.f657j = null;
        if (!this.f656i) {
            if (this.f670w != null) {
                scrollTo(getScrollX(), this.f670w.f674b);
                this.f670w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c = m258c(scrollY, paddingTop, i5);
            if (c != scrollY) {
                scrollTo(getScrollX(), c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f656i = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f660m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo794p((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo768e(i, i2, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo810u(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f671x.f2634a = i;
        mo746C(2, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(true ^ mo809t(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0099c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0099c cVar = (C0099c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f670w = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0099c cVar = new C0099c(super.onSaveInstanceState());
        cVar.f674b = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0098b bVar = this.f648A;
        if (bVar != null) {
            C0551h hVar = (C0551h) bVar;
            AlertController.m64c(this, hVar.f2418a, hVar.f2419b);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo809t(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f650c);
            offsetDescendantRectToMyCoords(findFocus, this.f650c);
            mo769f(mo761d(this.f650c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f671x.f2634a = 0;
        mo747D(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020b, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 16) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        postInvalidate();
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r9 = r28
            r10 = r29
            android.view.VelocityTracker r0 = r9.f659l
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f659l = r0
        L_0x000e:
            int r0 = r29.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.f668u = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r29)
            int r1 = r9.f668u
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x021a
            r3 = -1
            r14 = 16
            if (r0 == r13) goto L_0x01c1
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x005d
            r1 = 5
            if (r0 == r1) goto L_0x004a
            r1 = 6
            if (r0 == r1) goto L_0x0038
            goto L_0x0250
        L_0x0038:
            r28.mo811v(r29)
            int r0 = r9.f665r
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f654g = r0
            goto L_0x0250
        L_0x004a:
            int r0 = r29.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f654g = r1
            int r0 = r10.getPointerId(r0)
            r9.f665r = r0
            goto L_0x0250
        L_0x005d:
            boolean r0 = r9.f658k
            if (r0 == 0) goto L_0x0214
            int r0 = r28.getChildCount()
            if (r0 <= 0) goto L_0x0214
            android.widget.OverScroller r15 = r9.f651d
            int r16 = r28.getScrollX()
            int r17 = r28.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r28.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x0214
            java.lang.reflect.Field r0 = p000.C0813m8.f3234a
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r14) goto L_0x0211
            goto L_0x020d
        L_0x0089:
            int r0 = r9.f665r
            int r15 = r10.findPointerIndex(r0)
            if (r15 != r3) goto L_0x0093
            goto L_0x0250
        L_0x0093:
            float r0 = r10.getY(r15)
            int r6 = (int) r0
            int r0 = r9.f654g
            int r0 = r0 - r6
            boolean r1 = r9.f658k
            if (r1 != 0) goto L_0x00b9
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f662o
            if (r1 <= r2) goto L_0x00b9
            android.view.ViewParent r1 = r28.getParent()
            if (r1 == 0) goto L_0x00b0
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x00b0:
            r9.f658k = r13
            int r1 = r9.f662o
            if (r0 <= 0) goto L_0x00b8
            int r0 = r0 - r1
            goto L_0x00b9
        L_0x00b8:
            int r0 = r0 + r1
        L_0x00b9:
            r7 = r0
            boolean r0 = r9.f658k
            if (r0 == 0) goto L_0x0250
            r1 = 0
            int[] r3 = r9.f667t
            int[] r4 = r9.f666s
            r5 = 0
            r0 = r28
            r2 = r7
            boolean r0 = r0.mo768e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00db
            int[] r0 = r9.f667t
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f668u
            int[] r1 = r9.f666s
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f668u = r0
        L_0x00db:
            r16 = r7
            int[] r0 = r9.f666s
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f654g = r6
            int r17 = r28.getScrollY()
            int r8 = r28.getScrollRange()
            int r0 = r28.getOverScrollMode()
            if (r0 == 0) goto L_0x00fa
            if (r0 != r13) goto L_0x00f7
            if (r8 <= 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            r18 = 0
            goto L_0x00fc
        L_0x00fa:
            r18 = 1
        L_0x00fc:
            r1 = 0
            r3 = 0
            int r4 = r28.getScrollY()
            r5 = 0
            r7 = 0
            r19 = 0
            r0 = r28
            r2 = r16
            r6 = r8
            r14 = r8
            r8 = r19
            boolean r0 = r0.mo812w(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r9.mo796r(r11)
            if (r0 != 0) goto L_0x011f
            android.view.VelocityTracker r0 = r9.f659l
            r0.clear()
        L_0x011f:
            int r0 = r28.getScrollY()
            int r3 = r0 - r17
            int r5 = r16 - r3
            int[] r8 = r9.f667t
            r8[r13] = r11
            r2 = 0
            r4 = 0
            int[] r6 = r9.f666s
            r7 = 0
            e8 r1 = r9.f672y
            r1.mo2713f(r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.f654g
            int[] r1 = r9.f666s
            r2 = r1[r13]
            int r0 = r0 - r2
            r9.f654g = r0
            int r0 = r9.f668u
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f668u = r0
            if (r18 == 0) goto L_0x0250
            int[] r0 = r9.f667t
            r0 = r0[r13]
            int r0 = r16 - r0
            r28.mo776h()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0175
            android.widget.EdgeEffect r1 = r9.f652e
            float r0 = (float) r0
            int r2 = r28.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r10.getX(r15)
            int r3 = r28.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            p000.C1344x5.m3731M(r1, r0, r2)
            android.widget.EdgeEffect r0 = r9.f653f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x019d
            android.widget.EdgeEffect r0 = r9.f653f
            goto L_0x019a
        L_0x0175:
            if (r1 <= r14) goto L_0x019d
            android.widget.EdgeEffect r1 = r9.f653f
            float r0 = (float) r0
            int r2 = r28.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r10.getX(r15)
            int r4 = r28.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            p000.C1344x5.m3731M(r1, r0, r2)
            android.widget.EdgeEffect r0 = r9.f652e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x019d
            android.widget.EdgeEffect r0 = r9.f652e
        L_0x019a:
            r0.onRelease()
        L_0x019d:
            android.widget.EdgeEffect r0 = r9.f652e
            if (r0 == 0) goto L_0x0250
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01af
            android.widget.EdgeEffect r0 = r9.f653f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0250
        L_0x01af:
            java.lang.reflect.Field r0 = p000.C0813m8.f3234a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01bc
            r28.postInvalidateOnAnimation()
            goto L_0x0250
        L_0x01bc:
            r28.postInvalidate()
            goto L_0x0250
        L_0x01c1:
            android.view.VelocityTracker r0 = r9.f659l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f664q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f665r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f663p
            if (r1 < r4) goto L_0x01e9
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x0214
            r9.dispatchNestedFling(r2, r1, r13)
            r9.mo794p(r0)
            goto L_0x0214
        L_0x01e9:
            android.widget.OverScroller r0 = r9.f651d
            int r22 = r28.getScrollX()
            int r23 = r28.getScrollY()
            r24 = 0
            r25 = 0
            r26 = 0
            int r27 = r28.getScrollRange()
            r21 = r0
            boolean r0 = r21.springBack(r22, r23, r24, r25, r26, r27)
            if (r0 == 0) goto L_0x0214
            java.lang.reflect.Field r0 = p000.C0813m8.f3234a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0211
        L_0x020d:
            r28.postInvalidateOnAnimation()
            goto L_0x0214
        L_0x0211:
            r28.postInvalidate()
        L_0x0214:
            r9.f665r = r3
            r28.mo770g()
            goto L_0x0250
        L_0x021a:
            int r0 = r28.getChildCount()
            if (r0 != 0) goto L_0x0221
            return r11
        L_0x0221:
            android.widget.OverScroller r0 = r9.f651d
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r13
            r9.f658k = r0
            if (r0 == 0) goto L_0x0235
            android.view.ViewParent r0 = r28.getParent()
            if (r0 == 0) goto L_0x0235
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x0235:
            android.widget.OverScroller r0 = r9.f651d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0240
            r28.mo748a()
        L_0x0240:
            float r0 = r29.getY()
            int r0 = (int) r0
            r9.f654g = r0
            int r0 = r10.getPointerId(r11)
            r9.f665r = r0
            r9.mo746C(r1, r11)
        L_0x0250:
            android.view.VelocityTracker r0 = r9.f659l
            if (r0 == 0) goto L_0x0257
            r0.addMovement(r12)
        L_0x0257:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo794p(int i) {
        if (getChildCount() > 0) {
            this.f651d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo814y(true);
        }
    }

    /* renamed from: q */
    public boolean mo795q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f650c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f650c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f650c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f650c;
        return mo815z(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean mo796r(int i) {
        return this.f672y.mo2714g(i) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f655h) {
            mo744A(view2);
        } else {
            this.f657j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d = mo761d(rect);
        boolean z2 = d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, d);
            } else {
                mo745B(0, d, 250, false);
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo813x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f655h = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c = m258c(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c2 = m258c(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c != getScrollX() || c2 != getScrollY()) {
                super.scrollTo(c, c2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f660m) {
            this.f660m = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f672y.mo2716i(z);
    }

    public void setOnScrollChangeListener(C0098b bVar) {
        this.f648A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f661n = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f672y.mo2717j(i, 0);
    }

    public void stopNestedScroll() {
        this.f672y.mo2718k(0);
    }

    /* renamed from: t */
    public final boolean mo809t(View view, int i, int i2) {
        view.getDrawingRect(this.f650c);
        offsetDescendantRectToMyCoords(view, this.f650c);
        return this.f650c.bottom + i >= getScrollY() && this.f650c.top - i <= getScrollY() + i2;
    }

    /* renamed from: u */
    public final void mo810u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f672y.mo2711d(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: v */
    public final void mo811v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f665r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f654g = (int) motionEvent.getY(i);
            this.f665r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f659l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo812w(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo796r(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f651d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo812w(int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: x */
    public final void mo813x() {
        VelocityTracker velocityTracker = this.f659l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f659l = null;
        }
    }

    /* renamed from: y */
    public final void mo814y(boolean z) {
        if (z) {
            mo746C(2, 1);
        } else {
            this.f672y.mo2718k(1);
        }
        this.f669v = getScrollY();
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 16) {
            postInvalidateOnAnimation();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: z */
    public final boolean mo815z(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z2 = i4 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z4 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (!z5) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            mo769f(z2 ? i5 - scrollY : i6 - i7);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }
}
