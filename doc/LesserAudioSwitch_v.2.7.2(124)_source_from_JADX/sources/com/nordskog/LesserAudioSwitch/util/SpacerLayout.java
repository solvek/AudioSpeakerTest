package com.nordskog.LesserAudioSwitch.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SpacerLayout extends FrameLayout {

    /* renamed from: b */
    public int f1825b = 0;

    /* renamed from: c */
    public int f1826c = 0;

    public SpacerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0734kn.f3012b);
        this.f1825b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1826c = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() >= 1) {
            View childAt = getChildAt(0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth();
            int i5 = this.f1825b;
            int i6 = ((measuredWidth2 - ((i5 * 2) + measuredWidth)) * -1) / 2;
            int i7 = (measuredWidth2 / 2) - (measuredWidth / 2);
            if (i6 > 0) {
                int min = Math.min(i5, i6);
                int i8 = this.f1826c;
                if (i8 == 1) {
                    i7 -= min;
                } else if (i8 == 4097) {
                    i7 += min;
                }
            }
            childAt.layout(i7, 0, measuredWidth + i7, childAt.getMeasuredHeight());
        }
    }
}
