package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0634ik;

public class FloatingActionButton extends C0227bl implements C0761l8, C0524g9, C0426ek, C1422yl, CoordinatorLayout.C0087b {

    /* renamed from: c */
    public ColorStateList f1585c;

    /* renamed from: d */
    public PorterDuff.Mode f1586d;

    /* renamed from: e */
    public ColorStateList f1587e;

    /* renamed from: f */
    public PorterDuff.Mode f1588f;

    /* renamed from: g */
    public ColorStateList f1589g;

    /* renamed from: h */
    public int f1590h;

    /* renamed from: i */
    public int f1591i;

    /* renamed from: j */
    public int f1592j;

    /* renamed from: k */
    public boolean f1593k;

    /* renamed from: l */
    public C0634ik f1594l;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0088c<T> {

        /* renamed from: a */
        public Rect f1595a;

        /* renamed from: b */
        public boolean f1596b;

        public BaseBehavior() {
            this.f1596b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3154f);
            this.f1596b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: B */
        public boolean mo2279B(FloatingActionButton floatingActionButton, Rect rect) {
            floatingActionButton.getClass();
            floatingActionButton.getLeft();
            throw null;
        }

        /* renamed from: C */
        public final boolean mo2280C(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0091f fVar = (CoordinatorLayout.C0091f) floatingActionButton.getLayoutParams();
            if (this.f1596b && fVar.f616f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: D */
        public final boolean mo2281D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo2280C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1595a == null) {
                this.f1595a = new Rect();
            }
            Rect rect = this.f1595a;
            C1024qk.m2942a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo2236i((C0319a) null, false);
                return true;
            }
            floatingActionButton.mo2241m((C0319a) null, false);
            return true;
        }

        /* renamed from: E */
        public final boolean mo2282E(View view, FloatingActionButton floatingActionButton) {
            if (!mo2280C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0091f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo2236i((C0319a) null, false);
                return true;
            }
            floatingActionButton.mo2241m((C0319a) null, false);
            return true;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo698a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return mo2279B((FloatingActionButton) view, rect);
        }

        /* renamed from: f */
        public void mo703f(CoordinatorLayout.C0091f fVar) {
            if (fVar.f618h == 0) {
                fVar.f618h = 80;
            }
        }

        /* renamed from: g */
        public boolean mo704g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo2281D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0091f ? ((CoordinatorLayout.C0091f) layoutParams).f611a instanceof BottomSheetBehavior : false) {
                    mo2282E(view2, floatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: k */
        public boolean mo707k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d = coordinatorLayout.mo651d(floatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0091f ? ((CoordinatorLayout.C0091f) layoutParams).f611a instanceof BottomSheetBehavior : false) && mo2282E(view2, floatingActionButton)) {
                        break;
                    }
                } else if (mo2281D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo679r(floatingActionButton, i);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public static abstract class C0319a {
        /* renamed from: a */
        public void mo2283a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo2284b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public class C0320b implements C0732kl {
        public C0320b() {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C0321c<T extends FloatingActionButton> implements C0634ik.C0639e {

        /* renamed from: a */
        public final C1263vh<T> f1598a;

        public C0321c(C1263vh<T> vhVar) {
            this.f1598a = vhVar;
        }

        /* renamed from: a */
        public void mo2285a() {
            this.f1598a.mo4905a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo2286b() {
            this.f1598a.mo4906b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0321c) && ((C0321c) obj).f1598a.equals(this.f1598a);
        }

        public int hashCode() {
            return this.f1598a.hashCode();
        }
    }

    private C0634ik getImpl() {
        if (this.f1594l == null) {
            this.f1594l = Build.VERSION.SDK_INT >= 21 ? new C0784lk(this, new C0320b()) : new C0634ik(this, new C0320b());
        }
        return this.f1594l;
    }

    /* renamed from: a */
    public boolean mo2213a() {
        throw null;
    }

    /* renamed from: d */
    public void mo2214d(Animator.AnimatorListener animatorListener) {
        C0634ik impl = getImpl();
        if (impl.f2740q == null) {
            impl.f2740q = new ArrayList<>();
        }
        impl.f2740q.add((Object) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo3286i(getDrawableState());
    }

    /* renamed from: e */
    public void mo2216e(Animator.AnimatorListener animatorListener) {
        C0634ik impl = getImpl();
        if (impl.f2739p == null) {
            impl.f2739p = new ArrayList<>();
        }
        impl.f2739p.add(animatorListener);
    }

    /* renamed from: f */
    public void mo2217f(C1263vh<? extends FloatingActionButton> vhVar) {
        C0634ik impl = getImpl();
        C0321c cVar = new C0321c((C1263vh) null);
        if (impl.f2741r == null) {
            impl.f2741r = new ArrayList<>();
        }
        impl.f2741r.add(cVar);
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo2218g(Rect rect) {
        if (!C0813m8.m2486t(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public ColorStateList getBackgroundTintList() {
        return this.f1585c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1586d;
    }

    public CoordinatorLayout.C0088c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo3280c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f2728e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f2729f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f1591i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C1121sh getHideMotionSpec() {
        return getImpl().f2735l;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1589g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1589g;
    }

    public C1217ul getShapeAppearanceModel() {
        C1217ul ulVar = getImpl().f2724a;
        ulVar.getClass();
        return ulVar;
    }

    public C1121sh getShowMotionSpec() {
        return getImpl().f2734k;
    }

    public int getSize() {
        return this.f1590h;
    }

    public int getSizeDimension() {
        return mo2235h(this.f1590h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1587e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1588f;
    }

    public boolean getUseCompatPadding() {
        return this.f1593k;
    }

    /* renamed from: h */
    public final int mo2235h(int i) {
        int i2 = this.f1591i;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? mo2235h(1) : mo2235h(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    /* renamed from: i */
    public void mo2236i(C0319a aVar, boolean z) {
        C0634ik impl = getImpl();
        C0480fk fkVar = aVar == null ? null : new C0480fk(this, aVar);
        if (!impl.mo3282e()) {
            Animator animator = impl.f2733j;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo3294q()) {
                C1121sh shVar = impl.f2735l;
                if (shVar == null) {
                    if (impl.f2732i == null) {
                        impl.f2732i = C1121sh.m3186b(impl.f2742s.getContext(), R.animator.design_fab_hide_motion_spec);
                    }
                    shVar = impl.f2732i;
                    shVar.getClass();
                }
                AnimatorSet a = impl.mo3278a(shVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C0540gk(impl, z, fkVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2740q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f2742s.mo1605b(z ? 8 : 4, z);
            if (fkVar != null) {
                fkVar.f2152a.mo2283a(fkVar.f2153b);
            }
        }
    }

    /* renamed from: j */
    public boolean mo2237j() {
        return getImpl().mo3282e();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo3284g();
    }

    /* renamed from: k */
    public boolean mo2239k() {
        return getImpl().mo3283f();
    }

    /* renamed from: l */
    public final void mo2240l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f1587e;
            if (colorStateList == null) {
                C1344x5.m3761i(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f1588f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C1231v1.m3414c(colorForState, mode));
        }
    }

    /* renamed from: m */
    public void mo2241m(C0319a aVar, boolean z) {
        C0634ik impl = getImpl();
        C0480fk fkVar = aVar == null ? null : new C0480fk(this, aVar);
        if (!impl.mo3283f()) {
            Animator animator = impl.f2733j;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.mo3294q()) {
                if (impl.f2742s.getVisibility() != 0) {
                    impl.f2742s.setAlpha(0.0f);
                    impl.f2742s.setScaleY(0.0f);
                    impl.f2742s.setScaleX(0.0f);
                    impl.mo3291n(0.0f);
                }
                C1121sh shVar = impl.f2734k;
                if (shVar == null) {
                    if (impl.f2731h == null) {
                        impl.f2731h = C1121sh.m3186b(impl.f2742s.getContext(), R.animator.design_fab_show_motion_spec);
                    }
                    shVar = impl.f2731h;
                    shVar.getClass();
                }
                AnimatorSet a = impl.mo3278a(shVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C0578hk(impl, z, fkVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2739p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            impl.f2742s.mo1605b(0, z);
            impl.f2742s.setAlpha(1.0f);
            impl.f2742s.setScaleY(1.0f);
            impl.f2742s.setScaleX(1.0f);
            impl.mo3291n(1.0f);
            if (fkVar != null) {
                fkVar.f2152a.mo2284b(fkVar.f2153b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0634ik impl = getImpl();
        if (impl.mo3290m()) {
            ViewTreeObserver viewTreeObserver = impl.f2742s.getViewTreeObserver();
            if (impl.f2748y == null) {
                impl.f2748y = new C0731kk(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f2748y);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0634ik impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f2742s.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f2748y;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f2748y = null;
        }
    }

    public void onMeasure(int i, int i2) {
        this.f1592j = (getSizeDimension() + 0) / 2;
        getImpl().mo3297t();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0429em)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0429em emVar = (C0429em) parcelable;
        super.onRestoreInstanceState(emVar.f2988b);
        Bundle orDefault = emVar.f2020d.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        C0718k9 k9Var = C0718k9.f2987c;
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            mo2218g((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1585c != colorStateList) {
            this.f1585c = colorStateList;
            getImpl().getClass();
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1586d != mode) {
            this.f1586d = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        C0634ik impl = getImpl();
        if (impl.f2727d != f) {
            impl.f2727d = f;
            impl.mo3287j(f, impl.f2728e, impl.f2729f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C0634ik impl = getImpl();
        if (impl.f2728e != f) {
            impl.f2728e = f;
            impl.mo3287j(impl.f2727d, f, impl.f2729f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C0634ik impl = getImpl();
        if (impl.f2729f != f) {
            impl.f2729f = f;
            impl.mo3287j(impl.f2727d, impl.f2728e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f1591i) {
            this.f1591i = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f2725b) {
            getImpl().f2725b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C1121sh shVar) {
        getImpl().f2735l = shVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1121sh.m3186b(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C0634ik impl = getImpl();
            impl.mo3291n(impl.f2737n);
            if (this.f1587e != null) {
                mo2240l();
            }
        }
    }

    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1589g != colorStateList) {
            this.f1589g = colorStateList;
            getImpl().mo3292o(this.f1589g);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo3288k();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo3288k();
    }

    public void setShadowPaddingEnabled(boolean z) {
        C0634ik impl = getImpl();
        impl.f2726c = z;
        impl.mo3297t();
        throw null;
    }

    public void setShapeAppearanceModel(C1217ul ulVar) {
        getImpl().f2724a = ulVar;
    }

    public void setShowMotionSpec(C1121sh shVar) {
        getImpl().f2734k = shVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1121sh.m3186b(getContext(), i));
    }

    public void setSize(int i) {
        this.f1591i = 0;
        if (i != this.f1590h) {
            this.f1590h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1587e != colorStateList) {
            this.f1587e = colorStateList;
            mo2240l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1588f != mode) {
            this.f1588f = mode;
            mo2240l();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo3289l();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo3289l();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo3289l();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1593k != z) {
            this.f1593k = z;
            getImpl().mo3285h();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
