package p000;

import android.content.Intent;
import android.view.View;
import com.nordskog.LesserAudioSwitch.p002ui.MainActivity;
import com.nordskog.LesserAudioSwitch.p002ui.auto.AutoActivity;

/* renamed from: at */
public class C0198at implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f1170b;

    public C0198at(MainActivity mainActivity) {
        this.f1170b = mainActivity;
    }

    public void onClick(View view) {
        this.f1170b.startActivity(new Intent(this.f1170b, AutoActivity.class));
    }
}
