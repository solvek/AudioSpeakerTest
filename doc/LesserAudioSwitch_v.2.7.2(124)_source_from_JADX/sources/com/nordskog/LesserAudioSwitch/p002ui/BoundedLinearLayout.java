package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.BoundedLinearLayout */
public class BoundedLinearLayout extends LinearLayout {

    /* renamed from: b */
    public final int f1756b;

    /* renamed from: c */
    public final int f1757c;

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0734kn.f3011a);
        this.f1756b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1757c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f1756b;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f1756b, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f1757c;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f1757c, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
