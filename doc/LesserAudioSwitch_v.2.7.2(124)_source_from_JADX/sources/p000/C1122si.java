package p000;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: si */
public class C1122si extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f4260a;

    public C1122si(Chip chip) {
        this.f4260a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C1170ti tiVar = this.f4260a.f1550e;
        if (tiVar != null) {
            tiVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
