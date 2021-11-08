package p000;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: rm */
public abstract class C1070rm {

    /* renamed from: a */
    public TextInputLayout f4024a;

    /* renamed from: b */
    public Context f4025b;

    /* renamed from: c */
    public CheckableImageButton f4026c;

    public C1070rm(TextInputLayout textInputLayout) {
        this.f4024a = textInputLayout;
        this.f4025b = textInputLayout.getContext();
        this.f4026c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    public abstract void mo2797a();

    /* renamed from: b */
    public boolean mo3704b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo2798c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo3705d() {
        return false;
    }
}
