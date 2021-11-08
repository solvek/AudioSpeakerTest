package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;

public class ActionBarContextView extends C0800m1 {

    /* renamed from: j */
    public CharSequence f252j;

    /* renamed from: k */
    public CharSequence f253k;

    /* renamed from: l */
    public View f254l;

    /* renamed from: m */
    public View f255m;

    /* renamed from: n */
    public LinearLayout f256n;

    /* renamed from: o */
    public TextView f257o;

    /* renamed from: p */
    public TextView f258p;

    /* renamed from: q */
    public int f259q;

    /* renamed from: r */
    public int f260r;

    /* renamed from: s */
    public boolean f261s;

    /* renamed from: t */
    public int f262t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0044a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C0750l0 f263b;

        public C0044a(ActionBarContextView actionBarContextView, C0750l0 l0Var) {
            this.f263b = l0Var;
        }

        public void onClick(View view) {
            this.f263b.mo2607c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903067(0x7f03001b, float:1.7412942E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = p000.C0440f.f2050d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = p000.C0399e0.m1530b(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.lang.reflect.Field r0 = p000.C0813m8.f3234a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x002e
            r3.setBackground(r4)
            goto L_0x0031
        L_0x002e:
            r3.setBackgroundDrawable(r4)
        L_0x0031:
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f259q = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f260r = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f3205f = r4
            r4 = 2
            r0 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.f262t = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo202f(p000.C0750l0 r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f254l
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f262t
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f254l = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f254l
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f254l
            r2 = 2131230778(0x7f08003a, float:1.8077618E38)
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.mo2609e()
            z0 r7 = (p000.C1435z0) r7
            o1 r0 = r6.f3204e
            if (r0 == 0) goto L_0x003f
            r0.mo3820a()
        L_0x003f:
            o1 r0 = new o1
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f3204e = r0
            r2 = 1
            r0.f3447m = r2
            r0.f3448n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            o1 r3 = r6.f3204e
            android.content.Context r4 = r6.f3202c
            r7.mo5235b(r3, r4)
            o1 r7 = r6.f3204e
            g1 r3 = r7.f4537i
            if (r3 != 0) goto L_0x0077
            android.view.LayoutInflater r4 = r7.f4533e
            int r5 = r7.f4535g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            g1 r1 = (p000.C0504g1) r1
            r7.f4537i = r1
            z0 r4 = r7.f4532d
            r1.mo166c(r4)
            r7.mo593h(r2)
        L_0x0077:
            g1 r1 = r7.f4537i
            if (r3 == r1) goto L_0x0081
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f3203d = r1
            r7 = 0
            p000.C0813m8.m2459H(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f3203d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo202f(l0):void");
    }

    /* renamed from: g */
    public final void mo203g() {
        if (this.f256n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f256n = linearLayout;
            this.f257o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f258p = (TextView) this.f256n.findViewById(R.id.action_bar_subtitle);
            if (this.f259q != 0) {
                this.f257o.setTextAppearance(getContext(), this.f259q);
            }
            if (this.f260r != 0) {
                this.f258p.setTextAppearance(getContext(), this.f260r);
            }
        }
        this.f257o.setText(this.f252j);
        this.f258p.setText(this.f253k);
        boolean z = !TextUtils.isEmpty(this.f252j);
        boolean z2 = !TextUtils.isEmpty(this.f253k);
        int i = 0;
        this.f258p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f256n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f256n.getParent() == null) {
            addView(this.f256n);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f253k;
    }

    public CharSequence getTitle() {
        return this.f252j;
    }

    /* renamed from: h */
    public void mo210h() {
        removeAllViews();
        this.f255m = null;
        this.f3203d = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0904o1 o1Var = this.f3204e;
        if (o1Var != null) {
            o1Var.mo3822i();
            this.f3204e.mo3823l();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f252j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0856n3.m2571a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f254l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f254l.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a ? paddingRight - i5 : paddingRight + i5;
            int d = i7 + mo3652d(this.f254l, i7, paddingTop, paddingTop2, a);
            paddingRight = a ? d - i6 : d + i6;
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f256n;
        if (!(linearLayout == null || this.f255m != null || linearLayout.getVisibility() == 8)) {
            i8 += mo3652d(this.f256n, i8, paddingTop, paddingTop2, a);
        }
        int i9 = i8;
        View view2 = this.f255m;
        if (view2 != null) {
            mo3652d(view2, i9, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3203d;
        if (actionMenuView != null) {
            mo3652d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f3205f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f254l;
            if (view != null) {
                int c = mo3651c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f254l.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f3203d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo3651c(this.f3203d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f256n;
            if (linearLayout != null && this.f255m == null) {
                if (this.f261s) {
                    this.f256n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f256n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f256n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo3651c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f255m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f255m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f3205f <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f3205f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f255m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f255m = view;
        if (!(view == null || (linearLayout = this.f256n) == null)) {
            removeView(linearLayout);
            this.f256n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f253k = charSequence;
        mo203g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f252j = charSequence;
        mo203g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f261s) {
            requestLayout();
        }
        this.f261s = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
