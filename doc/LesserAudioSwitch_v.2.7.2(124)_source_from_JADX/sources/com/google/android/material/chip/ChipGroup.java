package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import p000.C1347x8;

public class ChipGroup extends C1066rk {

    /* renamed from: f */
    public int f1568f;

    /* renamed from: g */
    public int f1569g;

    /* renamed from: h */
    public boolean f1570h;

    /* renamed from: i */
    public boolean f1571i;

    /* renamed from: j */
    public C0315d f1572j;

    /* renamed from: k */
    public final C0313b f1573k = new C0313b((C0312a) null);

    /* renamed from: l */
    public C0316e f1574l = new C0316e((C0312a) null);

    /* renamed from: m */
    public int f1575m = -1;

    /* renamed from: n */
    public boolean f1576n = false;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C0313b implements CompoundButton.OnCheckedChangeListener {
        public C0313b(C0312a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.f1576n) {
                if (chipGroup.getCheckedChipIds().isEmpty()) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.f1571i) {
                        chipGroup2.mo2150c(compoundButton.getId(), true);
                        ChipGroup chipGroup3 = ChipGroup.this;
                        chipGroup3.f1575m = compoundButton.getId();
                        C0315d dVar = chipGroup3.f1572j;
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup4 = ChipGroup.this;
                    int i = chipGroup4.f1575m;
                    if (!(i == -1 || i == id || !chipGroup4.f1570h)) {
                        chipGroup4.mo2150c(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup5 = ChipGroup.this;
                if (chipGroup5.f1575m == id) {
                    chipGroup5.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C0314c extends ViewGroup.MarginLayoutParams {
        public C0314c(int i, int i2) {
            super(i, i2);
        }

        public C0314c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0314c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C0315d {
        /* renamed from: a */
        void mo2180a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C0316e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f1578a;

        public C0316e(C0312a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f1573k);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1578a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1578a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.chipGroupStyle, 2131755674), attributeSet, R.attr.chipGroupStyle);
        TypedArray d = C1315wk.m3654d(getContext(), attributeSet, C0781lh.f3152d, R.attr.chipGroupStyle, 2131755674, new int[0]);
        int dimensionPixelOffset = d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d.getBoolean(5, false));
        setSingleSelection(d.getBoolean(6, false));
        setSelectionRequired(d.getBoolean(4, false));
        int resourceId = d.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f1575m = resourceId;
        }
        d.recycle();
        super.setOnHierarchyChangeListener(this.f1574l);
        C0813m8.m2462K(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f1575m = i;
        C0315d dVar = this.f1572j;
        if (dVar != null && this.f1570h) {
            dVar.mo2180a(this, i);
        }
    }

    /* renamed from: a */
    public boolean mo2148a() {
        return this.f3975d;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f1575m;
                if (i2 != -1 && this.f1570h) {
                    mo2150c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public final void mo2150c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f1576n = true;
            ((Chip) findViewById).setChecked(z);
            this.f1576n = false;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0314c);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0314c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0314c(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0314c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f1570h) {
            return this.f1575m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f1570h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f1568f;
    }

    public int getChipSpacingVertical() {
        return this.f1569g;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1575m;
        if (i != -1) {
            mo2150c(i, true);
            setCheckedId(this.f1575m);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1347x8.C1349b a = C1347x8.C1349b.m3798a(getRowCount(), this.f3975d ? getChipCount() : -1, false, this.f1570h ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a.f5053a);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f1568f != i) {
            this.f1568f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f1569g != i) {
            this.f1569g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C0315d dVar) {
        this.f1572j = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1574l.f1578a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f1571i = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f1570h != z) {
            this.f1570h = z;
            this.f1576n = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f1576n = false;
            setCheckedId(-1);
        }
    }
}
