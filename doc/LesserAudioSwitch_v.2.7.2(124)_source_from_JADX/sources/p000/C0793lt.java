package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: lt */
public abstract class C0793lt {

    /* renamed from: a */
    public AlertDialog f3189a = null;

    /* renamed from: lt$a */
    public class C0794a extends C0746kt {
        public C0794a(Context context, C0795b bVar) {
            super(context, bVar);
        }
    }

    /* renamed from: lt$b */
    public enum C0795b {
        AUTO_SWITCH,
        RESTORE_ON_BOOT
    }

    public C0793lt(Context context, C0795b bVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.auto_config_action_dialog, (ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewGroup.getChildAt(0);
        recyclerView.setAdapter(new C0794a(context, bVar));
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        builder.setView(viewGroup);
        builder.setTitle(R.string.auto_text_pick_action);
        if (bVar.ordinal() == 1) {
            builder.setMessage(R.string.auto_text_restore_on_boot_pick_action_details);
        }
        this.f3189a = builder.create();
    }

    /* renamed from: a */
    public abstract boolean mo2567a(Dialog dialog, C1129so soVar);
}
