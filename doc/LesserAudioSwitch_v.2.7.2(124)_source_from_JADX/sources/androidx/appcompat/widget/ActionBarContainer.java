package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f242b;

    /* renamed from: c */
    public View f243c;

    /* renamed from: d */
    public View f244d;

    /* renamed from: e */
    public View f245e;

    /* renamed from: f */
    public Drawable f246f;

    /* renamed from: g */
    public Drawable f247g;

    /* renamed from: h */
    public Drawable f248h;

    /* renamed from: i */
    public boolean f249i;

    /* renamed from: j */
    public boolean f250j;

    /* renamed from: k */
    public int f251k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0854n1 n1Var = new C0854n1(this);
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(n1Var);
        } else {
            setBackgroundDrawable(n1Var);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2047a);
        boolean z = false;
        this.f246f = obtainStyledAttributes.getDrawable(0);
        this.f247g = obtainStyledAttributes.getDrawable(2);
        this.f251k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f249i = true;
            this.f248h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f249i ? this.f246f == null && this.f247g == null : this.f248h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int mo182a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean mo183b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f246f;
        if (drawable != null && drawable.isStateful()) {
            this.f246f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f247g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f247g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f248h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f248h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f243c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f246f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f247g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f248h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f244d = findViewById(R.id.action_bar);
        this.f245e = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f242b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f243c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f249i) {
            Drawable drawable3 = this.f248h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f246f != null) {
                if (this.f244d.getVisibility() == 0) {
                    drawable2 = this.f246f;
                    left = this.f244d.getLeft();
                    top = this.f244d.getTop();
                    right = this.f244d.getRight();
                    view = this.f244d;
                } else {
                    View view3 = this.f245e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f246f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f246f;
                        left = this.f245e.getLeft();
                        top = this.f245e.getTop();
                        right = this.f245e.getRight();
                        view = this.f245e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f250j = z4;
            if (!z4 || (drawable = this.f247g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f244d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f251k
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f244d
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f243c
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f244d
            boolean r0 = r3.mo183b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f244d
        L_0x0042:
            int r0 = r3.mo182a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f245e
            boolean r0 = r3.mo183b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f245e
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f243c
            int r1 = r3.mo182a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f246f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f246f);
        }
        this.f246f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f244d;
            if (view != null) {
                this.f246f.setBounds(view.getLeft(), this.f244d.getTop(), this.f244d.getRight(), this.f244d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f249i ? !(this.f246f == null && this.f247g == null) : this.f248h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f248h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f248h);
        }
        this.f248h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f249i && (drawable2 = this.f248h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f249i ? this.f246f == null && this.f247g == null : this.f248h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f247g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f247g);
        }
        this.f247g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f250j && (drawable2 = this.f247g) != null) {
                drawable2.setBounds(this.f243c.getLeft(), this.f243c.getTop(), this.f243c.getRight(), this.f243c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f249i ? !(this.f246f == null && this.f247g == null) : this.f248h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0005a3 a3Var) {
        View view = this.f243c;
        if (view != null) {
            removeView(view);
        }
        this.f243c = a3Var;
        if (a3Var != null) {
            addView(a3Var);
            ViewGroup.LayoutParams layoutParams = a3Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            a3Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f242b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f246f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f247g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f248h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f246f && !this.f249i) || (drawable == this.f247g && this.f250j) || ((drawable == this.f248h && this.f249i) || super.verifyDrawable(drawable));
    }
}
