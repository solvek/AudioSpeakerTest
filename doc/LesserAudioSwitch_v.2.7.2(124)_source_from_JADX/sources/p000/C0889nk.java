package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: nk */
public class C0889nk extends C1444z7 {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f3416d;

    public C0889nk(CheckableImageButton checkableImageButton) {
        this.f3416d = checkableImageButton;
    }

    /* renamed from: c */
    public void mo816c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5273a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f3416d.isChecked());
    }

    /* renamed from: d */
    public void mo817d(View view, C1347x8 x8Var) {
        this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
        x8Var.f5038a.setCheckable(this.f3416d.f1603e);
        x8Var.f5038a.setChecked(this.f3416d.isChecked());
    }
}
