package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: vr */
public final /* synthetic */ class C1276vr implements View.OnClickListener {

    /* renamed from: b */
    public static final /* synthetic */ C1276vr f4841b = new C1276vr();

    public final void onClick(View view) {
        ViewParent parent;
        int[] iArr = MainActivity.f1762E;
        Context context = view.getContext();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.speaker_config_dialog_layout, (ViewGroup) null, false);
        builder.setView(viewGroup);
        CheckBox checkBox = (CheckBox) viewGroup.findViewById(R.id.checkboxMuteSpeaker);
        CheckBox checkBox2 = (CheckBox) viewGroup.findViewById(R.id.checkboxDisableEarpiece);
        View findViewById = viewGroup.findViewById(R.id.checkboxMuteSpeakerContainer);
        View findViewById2 = viewGroup.findViewById(R.id.checkboxDisableEarpieceContainer);
        View findViewById3 = viewGroup.findViewById(R.id.checkboxCannotMuteSpeakerContainer);
        checkBox.setChecked(C0697ju.m2194q(context));
        if (C0728kh.m2286b(context)) {
            findViewById3.setVisibility(8);
            if (C0728kh.m2302r(context)) {
                checkBox2.setChecked(C0697ju.m2180c(context, C0200av.m970a(-108455197496492L), false));
            } else {
                findViewById2.setVisibility(8);
            }
            findViewById.setOnClickListener(new C0745ks(checkBox));
            findViewById2.setOnClickListener(new C0695js(checkBox2));
            checkBox.setOnCheckedChangeListener(new C0591hs(context));
            checkBox2.setOnCheckedChangeListener(new C0650is(context));
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
        }
        builder.setTitle(R.string.config_speaker_dialog_title);
        builder.setPositiveButton(R.string.button_done, C0792ls.f3188b);
        builder.create().show();
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
