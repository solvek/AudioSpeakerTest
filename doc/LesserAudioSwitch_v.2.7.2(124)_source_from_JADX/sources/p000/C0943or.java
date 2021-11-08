package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: or */
public final /* synthetic */ class C0943or implements View.OnClickListener {

    /* renamed from: b */
    public static final /* synthetic */ C0943or f3515b = new C0943or();

    public final void onClick(View view) {
        ViewParent parent;
        ViewParent parent2;
        int[] iArr = MainActivity.f1762E;
        C1388xs xsVar = new C1388xs(view.getContext());
        xsVar.f5138a.show();
        try {
            ViewGroup viewGroup = xsVar.f5139b;
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
