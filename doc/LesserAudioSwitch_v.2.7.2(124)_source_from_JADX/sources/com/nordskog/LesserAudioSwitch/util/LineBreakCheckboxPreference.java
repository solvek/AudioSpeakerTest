package com.nordskog.LesserAudioSwitch.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;

public class LineBreakCheckboxPreference extends CheckBoxPreference {
    public LineBreakCheckboxPreference(Context context) {
        super(context);
    }

    public LineBreakCheckboxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineBreakCheckboxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LineBreakCheckboxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        TextView textView = (TextView) rcVar.mo4232w(16908310);
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(false);
        }
        TextView textView2 = (TextView) rcVar.mo4232w(16908304);
        if (textView2 != null) {
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setSingleLine(false);
            textView2.setMaxLines(999);
        }
    }
}
