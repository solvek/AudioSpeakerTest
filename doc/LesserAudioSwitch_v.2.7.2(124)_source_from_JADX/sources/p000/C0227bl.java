package p000;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: bl */
public class C0227bl extends ImageButton {

    /* renamed from: b */
    public int f1286b;

    /* renamed from: b */
    public final void mo1605b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1286b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1286b;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f1286b = i;
    }
}
