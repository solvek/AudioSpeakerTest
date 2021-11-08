package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.nordskog.LesserAudioSwitch.R;

public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.toolbarStyle, 2131755727), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C1067rl rlVar = new C1067rl();
            rlVar.mo4300p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            rlVar.f3979b.f4003b = new C0383dk(context2);
            rlVar.mo4309w();
            rlVar.mo4297o(C0813m8.m2474h(this));
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(rlVar);
            } else {
                setBackgroundDrawable(rlVar);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1067rl) {
            C0728kh.m2281J(this, (C1067rl) background);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C0728kh.m2279H(this, f);
    }
}
