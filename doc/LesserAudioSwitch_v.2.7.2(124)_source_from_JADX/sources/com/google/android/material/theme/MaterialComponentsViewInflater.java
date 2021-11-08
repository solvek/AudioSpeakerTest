package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater extends C0001a0 {
    /* renamed from: a */
    public C0950p1 mo1a(Context context, AttributeSet attributeSet) {
        return new C1220um(context, attributeSet);
    }

    /* renamed from: b */
    public C1038r1 mo2b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* renamed from: c */
    public C1094s1 mo3c(Context context, AttributeSet attributeSet) {
        return new C1063ri(context, attributeSet);
    }

    /* renamed from: d */
    public C0205b2 mo4d(Context context, AttributeSet attributeSet) {
        return new C0283cl(context, attributeSet);
    }

    /* renamed from: e */
    public C0660j2 mo5e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
