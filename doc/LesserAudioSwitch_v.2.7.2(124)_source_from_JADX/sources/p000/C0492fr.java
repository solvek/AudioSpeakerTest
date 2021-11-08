package p000;

import android.app.AlertDialog;
import android.view.View;
import com.nordskog.LesserAudioSwitch.R;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;

/* renamed from: fr */
public final /* synthetic */ class C0492fr implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f2181b;

    public /* synthetic */ C0492fr(MainActivity mainActivity) {
        this.f2181b = mainActivity;
    }

    public final void onClick(View view) {
        MainActivity mainActivity = this.f2181b;
        mainActivity.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        builder.setTitle(R.string.warning_compatibility_hide_dialog_title);
        builder.setMessage(R.string.warning_compatibility_hide_dialog_message);
        builder.setPositiveButton(R.string.button_hide, new C1031qr(mainActivity));
        builder.setNeutralButton(R.string.button_cancel, C0196ar.f1168b);
        builder.create().show();
    }
}
