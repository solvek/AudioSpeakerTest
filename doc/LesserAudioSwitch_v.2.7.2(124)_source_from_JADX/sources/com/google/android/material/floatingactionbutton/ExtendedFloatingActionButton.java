package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0087b {

    /* renamed from: r */
    public static final /* synthetic */ int f1581r = 0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0088c<T> {

        /* renamed from: a */
        public Rect f1582a;

        /* renamed from: b */
        public boolean f1583b;

        /* renamed from: c */
        public boolean f1584c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f1583b = false;
            this.f1584c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3153e);
            this.f1583b = obtainStyledAttributes.getBoolean(0, false);
            this.f1584c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: B */
        public final boolean mo2206B(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0091f fVar = (CoordinatorLayout.C0091f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f1583b || this.f1584c) && fVar.f616f == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: C */
        public final boolean mo2207C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo2206B(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f1582a == null) {
                this.f1582a = new Rect();
            }
            Rect rect = this.f1582a;
            C1024qk.m2942a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f1584c) {
                    int i = ExtendedFloatingActionButton.f1581r;
                    extendedFloatingActionButton.getClass();
                } else {
                    int i2 = ExtendedFloatingActionButton.f1581r;
                    extendedFloatingActionButton.getClass();
                }
                ExtendedFloatingActionButton.m1273e(extendedFloatingActionButton, (C0834mk) null);
                return true;
            }
            if (this.f1584c) {
                int i3 = ExtendedFloatingActionButton.f1581r;
                extendedFloatingActionButton.getClass();
            } else {
                int i4 = ExtendedFloatingActionButton.f1581r;
                extendedFloatingActionButton.getClass();
            }
            ExtendedFloatingActionButton.m1273e(extendedFloatingActionButton, (C0834mk) null);
            return true;
        }

        /* renamed from: D */
        public final boolean mo2208D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo2206B(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0091f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.f1584c) {
                    int i = ExtendedFloatingActionButton.f1581r;
                } else {
                    int i2 = ExtendedFloatingActionButton.f1581r;
                }
                ExtendedFloatingActionButton.m1273e(extendedFloatingActionButton, (C0834mk) null);
                return true;
            }
            if (this.f1584c) {
                int i3 = ExtendedFloatingActionButton.f1581r;
            } else {
                int i4 = ExtendedFloatingActionButton.f1581r;
            }
            ExtendedFloatingActionButton.m1273e(extendedFloatingActionButton, (C0834mk) null);
            return true;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo698a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        /* renamed from: f */
        public void mo703f(CoordinatorLayout.C0091f fVar) {
            if (fVar.f618h == 0) {
                fVar.f618h = 80;
            }
        }

        /* renamed from: g */
        public boolean mo704g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                mo2207C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.C0091f ? ((CoordinatorLayout.C0091f) layoutParams).f611a instanceof BottomSheetBehavior : false) {
                    mo2208D(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: k */
        public boolean mo707k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> d = coordinatorLayout.mo651d(extendedFloatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.C0091f ? ((CoordinatorLayout.C0091f) layoutParams).f611a instanceof BottomSheetBehavior : false) && mo2208D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo2207C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo679r(extendedFloatingActionButton, i);
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public static class C0317a extends Property<View, Float> {
        public C0317a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C0318b extends Property<View, Float> {
        public C0318b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    static {
        Class<Float> cls = Float.class;
        new C0317a(cls, "width");
        new C0318b(cls, "height");
    }

    /* renamed from: e */
    public static void m1273e(ExtendedFloatingActionButton extendedFloatingActionButton, C0834mk mkVar) {
        extendedFloatingActionButton.getClass();
        throw null;
    }

    public CoordinatorLayout.C0088c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        return getIconSize() + (Math.min(C0813m8.m2482p(this), C0813m8.m2481o(this)) * 2);
    }

    public C1121sh getExtendMotionSpec() {
        throw null;
    }

    public C1121sh getHideMotionSpec() {
        throw null;
    }

    public C1121sh getShowMotionSpec() {
        throw null;
    }

    public C1121sh getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C1121sh shVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1121sh.m3186b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(C1121sh shVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1121sh.m3186b(getContext(), i));
    }

    public void setShowMotionSpec(C1121sh shVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1121sh.m3186b(getContext(), i));
    }

    public void setShrinkMotionSpec(C1121sh shVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1121sh.m3186b(getContext(), i));
    }
}
