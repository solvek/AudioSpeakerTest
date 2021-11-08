package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.BoundedFrameLayout */
public class BoundedFrameLayout extends LinearLayout {

    /* renamed from: b */
    public final int f1754b;

    /* renamed from: c */
    public final int f1755c;

    public BoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0734kn.f3011a);
        this.f1754b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1755c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static int m1407a(int i, int i2) {
        if (i <= 0) {
            return i2;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (i >= size) {
            i = size;
        }
        if (mode == 0) {
            mode = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(i, mode);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(m1407a(this.f1754b, i), m1407a(this.f1755c, i2));
    }
}
