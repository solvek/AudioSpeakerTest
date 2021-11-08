package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    public TextView f1619b;

    /* renamed from: c */
    public Button f1620c;

    /* renamed from: d */
    public int f1621d;

    /* renamed from: e */
    public int f1622e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0781lh.f3168t);
        this.f1621d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1622e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo2319a(int i, int i2, int i3) {
        boolean z;
        boolean z2 = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1619b.getPaddingTop() == i2 && this.f1619b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1619b;
        Field field = C0813m8.f3234a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17) {
            z2 = textView.isPaddingRelative();
        }
        if (z2) {
            int p = C0813m8.m2482p(textView);
            int o = C0813m8.m2481o(textView);
            if (i4 >= 17) {
                textView.setPaddingRelative(p, i2, o, i3);
                return true;
            }
            textView.setPadding(p, i2, o, i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1620c;
    }

    public TextView getMessageView() {
        return this.f1619b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1619b = (TextView) findViewById(R.id.snackbar_text);
        this.f1620c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (mo2319a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (mo2319a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f1621d
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f1621d
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131099781(0x7f060085, float:1.7811925E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131099780(0x7f060084, float:1.7811923E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f1619b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = 1
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.f1622e
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.f1620c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1622e
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.mo2319a(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0062
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.mo2319a(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r3 = 1
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            super.onMeasure(r8, r9)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1622e = i;
    }
}
