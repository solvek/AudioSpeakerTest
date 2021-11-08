package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.nordskog.LesserAudioSwitch.R;

public class MaterialTextView extends C0660j2 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z = true;
        if (C0728kh.m2274C(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C0781lh.f3165q;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int e = m1347e(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(e == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    mo2511c(theme, resourceId);
                }
            }
        }
    }

    /* renamed from: e */
    public static int m1347e(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo2511c(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C0781lh.f3164p);
        int e = m1347e(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (e >= 0) {
            setLineHeight(e);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C0728kh.m2274C(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            mo2511c(context.getTheme(), i);
        }
    }
}
