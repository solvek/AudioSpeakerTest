package p000;

import android.app.AlertDialog;
import android.view.View;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: zq */
public final /* synthetic */ class C1474zq implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f5362b;

    public /* synthetic */ C1474zq(MainActivity mainActivity) {
        this.f5362b = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity mainActivity = this.f5362b;
        mainActivity.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        builder.setTitle(R.string.warning_compatibility_hide_dialog_title);
        builder.setMessage(R.string.warning_compatibility_hide_dialog_message);
        builder.setPositiveButton(R.string.button_hide, new C1182tr(mainActivity));
        builder.setNeutralButton(R.string.button_cancel, C0547gr.f2414b);
        builder.create().show();
    }
}
