package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: lr */
public final /* synthetic */ class C0791lr implements View.OnClickListener {

    /* renamed from: b */
    public static final /* synthetic */ C0791lr f3187b = new C0791lr();

    public final void onClick(View view) {
        ViewParent parent;
        int[] iArr = MainActivity.f1762E;
        Context context = view.getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.compatibility_warning_dialog_layout, (ViewGroup) null, false);
        builder.setView(viewGroup);
        builder.setTitle(R.string.warning_compatibility_dialog_title);
        builder.setPositiveButton(R.string.button_understood, C0491fq.f2180b);
        builder.create().show();
        if (viewGroup != null) {
            try {
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 != null && (parent = parent2.getParent()) != null) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                    layoutParams.weight = 1.0f;
                    viewGroup2.setLayoutParams(layoutParams);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
