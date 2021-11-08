package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0087b {

    /* renamed from: W */
    public static final /* synthetic */ int f1462W = 0;

    /* renamed from: O */
    public Animator f1463O;

    /* renamed from: P */
    public Animator f1464P;

    /* renamed from: Q */
    public int f1465Q;

    /* renamed from: R */
    public int f1466R;

    /* renamed from: S */
    public boolean f1467S;

    /* renamed from: T */
    public int f1468T;

    /* renamed from: U */
    public boolean f1469U;

    /* renamed from: V */
    public Behavior f1470V;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f1471e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f1472f;

        /* renamed from: g */
        public int f1473g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f1474h = new C0296a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C0296a implements View.OnLayoutChangeListener {
            public C0296a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (((BottomAppBar) Behavior.this.f1472f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f1471e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: k */
        public boolean mo707k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f1472f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.f1462W;
            View y = bottomAppBar.mo1894y();
            if (y == null || C0813m8.m2486t(y)) {
                coordinatorLayout.mo679r(bottomAppBar, i);
                this.f1444a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
                return false;
            }
            CoordinatorLayout.C0091f fVar = (CoordinatorLayout.C0091f) y.getLayoutParams();
            fVar.f614d = 49;
            this.f1473g = fVar.bottomMargin;
            if (y instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) y;
                floatingActionButton.addOnLayoutChangeListener(this.f1474h);
                floatingActionButton.mo2214d((Animator.AnimatorListener) null);
                floatingActionButton.mo2216e(new C0685ji(bottomAppBar));
                floatingActionButton.mo2217f((C1263vh<? extends FloatingActionButton>) null);
            }
            bottomAppBar.mo1875C();
            throw null;
        }

        /* renamed from: x */
        public boolean mo720x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public static class C0297a extends C0718k9 {
        public static final Parcelable.Creator<C0297a> CREATOR = new C0298a();

        /* renamed from: d */
        public int f1476d;

        /* renamed from: e */
        public boolean f1477e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        public static class C0298a implements Parcelable.ClassLoaderCreator<C0297a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0297a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0297a[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0297a(parcel, classLoader);
            }
        }

        public C0297a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1476d = parcel.readInt();
            this.f1477e = parcel.readInt() != 0;
        }

        public C0297a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeInt(this.f1476d);
            parcel.writeInt(this.f1477e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return mo1873A(this.f1465Q);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f3006d;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private C0729ki getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: v */
    public static void m1190v(BottomAppBar bottomAppBar) {
        bottomAppBar.f1468T--;
    }

    /* renamed from: A */
    public final float mo1873A(int i) {
        boolean t = C0728kh.m2304t(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (t) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: B */
    public final boolean mo1874B() {
        FloatingActionButton x = mo1893x();
        return x != null && x.mo2239k();
    }

    /* renamed from: C */
    public final void mo1875C() {
        getTopEdgeTreatment().f3007e = getFabTranslationX();
        mo1894y();
        if (this.f1469U) {
            boolean B = mo1874B();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f1470V == null) {
            this.f1470V = new Behavior();
        }
        return this.f1470V;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f3006d;
    }

    public int getFabAlignmentMode() {
        return this.f1465Q;
    }

    public int getFabAnimationMode() {
        return this.f1466R;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f3005c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f3004b;
    }

    public boolean getHideOnScroll() {
        return this.f1467S;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.f1464P;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f1463O;
            if (animator2 != null) {
                animator2.cancel();
            }
            mo1875C();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo1874B()) {
                i5 = mo1895z(actionMenuView, 0, false);
            } else {
                i5 = mo1895z(actionMenuView, this.f1465Q, this.f1469U);
            }
            actionMenuView.setTranslationX((float) i5);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0297a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0297a aVar = (C0297a) parcelable;
        super.onRestoreInstanceState(aVar.f2988b);
        this.f1465Q = aVar.f1476d;
        this.f1469U = aVar.f1477e;
    }

    public Parcelable onSaveInstanceState() {
        C0297a aVar = new C0297a(super.onSaveInstanceState());
        aVar.f1476d = this.f1465Q;
        aVar.f1477e = this.f1469U;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C1344x5.m3752d0((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            C0729ki topEdgeTreatment = getTopEdgeTreatment();
            topEdgeTreatment.getClass();
            if (f >= 0.0f) {
                topEdgeTreatment.f3006d = f;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        if (this.f1465Q != i && C0813m8.m2486t(this)) {
            Animator animator = this.f1463O;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f1466R == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo1893x(), "translationX", new float[]{mo1873A(i)});
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            } else {
                mo1892w(i);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f1463O = animatorSet;
            animatorSet.addListener(new C0472fi(this));
            this.f1463O.start();
        }
        boolean z = this.f1469U;
        if (C0813m8.m2486t(this)) {
            Animator animator2 = this.f1464P;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!mo1874B()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) mo1895z(actionMenuView, i2, z))) > 1.0f) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat3.addListener(new C0632ii(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.playSequentially(new Animator[]{ofFloat3, ofFloat2});
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f1464P = animatorSet3;
            animatorSet3.addListener(new C0576hi(this));
            this.f1464P.start();
        }
        this.f1465Q = i;
    }

    public void setFabAnimationMode(int i) {
        this.f1466R = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().f3005c = f;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f3004b = f;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f1467S = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: w */
    public void mo1892w(int i) {
        FloatingActionButton x = mo1893x();
        if (x != null && !x.mo2237j()) {
            this.f1468T++;
            x.mo2236i(new C0537gi(this, i), true);
        }
    }

    /* renamed from: x */
    public final FloatingActionButton mo1893x() {
        View y = mo1894y();
        if (y instanceof FloatingActionButton) {
            return (FloatingActionButton) y;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo1894y() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo654e(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo1894y():android.view.View");
    }

    /* renamed from: z */
    public int mo1895z(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean t = C0728kh.m2304t(this);
        int measuredWidth = t ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0079e) && (((Toolbar.C0079e) childAt.getLayoutParams()).f2184a & 8388615) == 8388611) {
                measuredWidth = t ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((t ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }
}
