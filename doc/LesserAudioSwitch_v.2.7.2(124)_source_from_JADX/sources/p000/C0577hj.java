package p000;

import android.view.View;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: hj */
public class C0577hj extends C1444z7 {

    /* renamed from: d */
    public final /* synthetic */ C0473fj f2480d;

    public C0577hj(C0473fj fjVar) {
        this.f2480d = fjVar;
    }

    /* renamed from: d */
    public void mo817d(View view, C1347x8 x8Var) {
        C0473fj fjVar;
        int i;
        this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
        if (this.f2480d.f2143d0.getVisibility() == 0) {
            fjVar = this.f2480d;
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            fjVar = this.f2480d;
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        x8Var.mo5065k(fjVar.mo897z(i));
    }
}
