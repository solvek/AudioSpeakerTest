package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: cr */
public final /* synthetic */ class C0350cr implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C1129so f1834b;

    public /* synthetic */ C0350cr(C1129so soVar) {
        this.f1834b = soVar;
    }

    public final void onClick(View view) {
        ViewParent parent;
        ViewParent parent2;
        C1129so soVar = this.f1834b;
        int[] iArr = MainActivity.f1762E;
        C1430ys ysVar = new C1430ys(view.getContext(), soVar);
        ysVar.f5218a.show();
        try {
            ViewGroup viewGroup = ysVar.f5219b;
            if (viewGroup != null && (parent = viewGroup.getParent()) != null && (parent2 = parent.getParent()) != null) {
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams.weight = 1.0f;
                viewGroup2.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
