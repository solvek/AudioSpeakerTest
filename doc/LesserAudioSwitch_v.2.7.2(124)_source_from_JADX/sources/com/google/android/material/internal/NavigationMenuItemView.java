package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import p000.C0504g1;
import p000.C1095s2;

public class NavigationMenuItemView extends C1124sk implements C0504g1.C0505a {

    /* renamed from: G */
    public static final int[] f1606G = {16842912};

    /* renamed from: A */
    public FrameLayout f1607A;

    /* renamed from: B */
    public C0203b1 f1608B;

    /* renamed from: C */
    public ColorStateList f1609C;

    /* renamed from: D */
    public boolean f1610D;

    /* renamed from: E */
    public Drawable f1611E;

    /* renamed from: F */
    public final C1444z7 f1612F;

    /* renamed from: w */
    public int f1613w;

    /* renamed from: x */
    public boolean f1614x;

    /* renamed from: y */
    public boolean f1615y;

    /* renamed from: z */
    public final CheckedTextView f1616z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C0324a extends C1444z7 {
        public C0324a() {
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
            x8Var.f5038a.setCheckable(NavigationMenuItemView.this.f1615y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0324a aVar = new C0324a();
        this.f1612F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f1616z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0813m8.m2457F(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1607A == null) {
                this.f1607A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f1607A.removeAllViews();
            this.f1607A.addView(view);
        }
    }

    /* renamed from: d */
    public void mo146d(C0203b1 b1Var, int i) {
        int i2;
        C1095s2.C1096a aVar;
        StateListDrawable stateListDrawable;
        this.f1608B = b1Var;
        int i3 = b1Var.f1181a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(b1Var.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1606G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(stateListDrawable);
            } else {
                setBackgroundDrawable(stateListDrawable);
            }
        }
        setCheckable(b1Var.isCheckable());
        setChecked(b1Var.isChecked());
        setEnabled(b1Var.isEnabled());
        setTitle(b1Var.f1185e);
        setIcon(b1Var.getIcon());
        setActionView(b1Var.getActionView());
        setContentDescription(b1Var.f1197q);
        C0398e.m1527k(this, b1Var.f1198r);
        C0203b1 b1Var2 = this.f1608B;
        if (!(b1Var2.f1185e == null && b1Var2.getIcon() == null && this.f1608B.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f1616z.setVisibility(8);
            FrameLayout frameLayout = this.f1607A;
            if (frameLayout != null) {
                aVar = (C1095s2.C1096a) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.f1616z.setVisibility(0);
            FrameLayout frameLayout2 = this.f1607A;
            if (frameLayout2 != null) {
                aVar = (C1095s2.C1096a) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        aVar.width = i2;
        this.f1607A.setLayoutParams(aVar);
    }

    public C0203b1 getItemData() {
        return this.f1608B;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0203b1 b1Var = this.f1608B;
        if (b1Var != null && b1Var.isCheckable() && this.f1608B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f1606G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1615y != z) {
            this.f1615y = z;
            this.f1612F.mo4236h(this.f1616z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f1616z.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1610D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1344x5.m3764j0(drawable).mutate();
                C1344x5.m3752d0(drawable, this.f1609C);
            }
            int i = this.f1613w;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1614x) {
            if (this.f1611E == null) {
                Resources resources = getResources();
                Drawable drawable2 = Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(R.drawable.navigation_empty_icon, getContext().getTheme()) : resources.getDrawable(R.drawable.navigation_empty_icon);
                this.f1611E = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f1613w;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1611E;
        }
        C1344x5.m3736R(this.f1616z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f1616z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1613w = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1609C = colorStateList;
        this.f1610D = colorStateList != null;
        C0203b1 b1Var = this.f1608B;
        if (b1Var != null) {
            setIcon(b1Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1616z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1614x = z;
    }

    public void setTextAppearance(int i) {
        C1344x5.m3748b0(this.f1616z, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1616z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1616z.setText(charSequence);
    }
}
