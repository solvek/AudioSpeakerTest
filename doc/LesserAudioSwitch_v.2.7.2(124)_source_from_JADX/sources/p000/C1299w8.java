package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: w8 */
public final class C1299w8 extends ClickableSpan {

    /* renamed from: b */
    public final int f4929b;

    /* renamed from: c */
    public final C1347x8 f4930c;

    /* renamed from: d */
    public final int f4931d;

    public C1299w8(int i, C1347x8 x8Var, int i2) {
        this.f4929b = i;
        this.f4930c = x8Var;
        this.f4931d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4929b);
        C1347x8 x8Var = this.f4930c;
        int i = this.f4931d;
        x8Var.getClass();
        if (Build.VERSION.SDK_INT >= 16) {
            x8Var.f5038a.performAction(i, bundle);
        }
    }
}
