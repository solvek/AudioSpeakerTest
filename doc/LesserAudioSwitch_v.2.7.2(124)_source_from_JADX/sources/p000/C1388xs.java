package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0652iu;

/* renamed from: xs */
public class C1388xs {

    /* renamed from: a */
    public AlertDialog f5138a = null;

    /* renamed from: b */
    public ViewGroup f5139b = null;

    /* renamed from: c */
    public C0946ou f5140c = null;

    /* renamed from: xs$a */
    public class C1389a extends C0946ou {

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f5141c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1389a(C1388xs xsVar, RadioButton[] radioButtonArr, ViewGroup viewGroup) {
            super(radioButtonArr);
            this.f5141c = viewGroup;
        }

        /* renamed from: a */
        public void mo3873a(int i) {
            C0652iu.C0654b<C1129so> bVar;
            C1129so soVar;
            Context context;
            switch (i) {
                case R.id.radioButtonHeadsetConfig3Pole /*2131231034*/:
                    bVar = C0697ju.f2935c;
                    context = this.f5141c.getContext();
                    soVar = C1129so.HEADPHONES;
                    break;
                case R.id.radioButtonHeadsetConfig4Pole /*2131231035*/:
                    bVar = C0697ju.f2935c;
                    context = this.f5141c.getContext();
                    soVar = C1129so.HEADSET;
                    break;
                case R.id.radioButtonHeadsetConfigAutoPole /*2131231036*/:
                    bVar = C0697ju.f2935c;
                    context = this.f5141c.getContext();
                    soVar = C1129so.AUTO;
                    break;
                default:
                    return;
            }
            bVar.mo3312b(context, soVar);
        }
    }

    public C1388xs(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.headphone_config_dialog_layout, (ViewGroup) null, false);
        this.f5139b = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.radio_group);
        builder.setView(this.f5139b);
        CheckBox checkBox = (CheckBox) viewGroup2.findViewById(R.id.checkboxPreventAccidentalDisconnect);
        this.f5140c = new C1389a(this, new RadioButton[]{(RadioButton) viewGroup2.findViewById(R.id.radioButtonHeadsetConfigAutoPole), (RadioButton) viewGroup2.findViewById(R.id.radioButtonHeadsetConfig3Pole), (RadioButton) viewGroup2.findViewById(R.id.radioButtonHeadsetConfig4Pole)}, viewGroup2);
        int ordinal = C0697ju.f2935c.mo3311a(context, C1129so.AUTO).ordinal();
        if (ordinal == 3) {
            this.f5140c.mo3874b(R.id.radioButtonHeadsetConfig3Pole, true);
        } else if (ordinal != 4) {
            this.f5140c.mo3874b(R.id.radioButtonHeadsetConfigAutoPole, true);
        } else {
            this.f5140c.mo3874b(R.id.radioButtonHeadsetConfig4Pole, true);
        }
        boolean a = C0697ju.f2936d.mo3309a(context, false);
        checkBox.setChecked(a);
        checkBox.setOnCheckedChangeListener(new C1181tq(context));
        builder.setPositiveButton(R.string.button_done, new C1224uq(context, a));
        this.f5138a = builder.create();
    }
}
