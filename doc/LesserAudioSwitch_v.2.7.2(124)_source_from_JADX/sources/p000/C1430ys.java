package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0735ko;

/* renamed from: ys */
public class C1430ys {

    /* renamed from: a */
    public AlertDialog f5218a = null;

    /* renamed from: b */
    public ViewGroup f5219b = null;

    /* renamed from: c */
    public C0946ou f5220c = null;

    /* renamed from: ys$a */
    public class C1431a extends C0946ou {

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f5221c;

        /* renamed from: d */
        public final /* synthetic */ C1129so f5222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1431a(C1430ys ysVar, RadioButton[] radioButtonArr, ViewGroup viewGroup, C1129so soVar) {
            super(radioButtonArr);
            this.f5221c = viewGroup;
            this.f5222d = soVar;
        }

        /* renamed from: a */
        public void mo3873a(int i) {
            Context context;
            C1072ro roVar;
            C1129so soVar;
            switch (i) {
                case R.id.radioButtonAutoMic /*2131231028*/:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.AUTO;
                    break;
                case R.id.radioButtonBluetoothMicAlways /*2131231030*/:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.BLUETOOTH_FOR_RECORDING;
                    break;
                case R.id.radioButtonHeadsetMicMic /*2131231037*/:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.WIRED_HEADSET;
                    break;
                case R.id.radioButtonInternalMic /*2131231039*/:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.INTERNAL_MIC;
                    break;
                case R.id.radioButtonUsbMic /*2131231041*/:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.USB_MIC;
                    break;
                default:
                    context = this.f5221c.getContext();
                    soVar = this.f5222d;
                    roVar = C1072ro.DEFAULT;
                    break;
            }
            C0697ju.m2173B(context, soVar, roVar);
            if (this.f5222d == C0697ju.m2193p(this.f5221c.getContext())) {
                Context applicationContext = this.f5221c.getContext().getApplicationContext();
                C0899nu nuVar = C0936oo.f3508c;
                C1129so p = C0697ju.m2193p(applicationContext);
                if (p != null) {
                    C0936oo.m2711v(applicationContext, p, (C0735ko.C0740e) null);
                }
            }
        }
    }

    public C1430ys(Context context, C1129so soVar) {
        int i;
        C0946ou ouVar;
        Context context2 = context;
        C1129so soVar2 = soVar;
        LayoutInflater layoutInflater = (LayoutInflater) context2.getSystemService("layout_inflater");
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(soVar2 == C1129so.BLUETOOTH ? R.layout.input_mode_dialog_layout_bluetooth : R.layout.input_mode_dialog_layout, (ViewGroup) null, false);
        this.f5219b = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.radio_group);
        builder.setView(this.f5219b);
        RadioButton radioButton = (RadioButton) viewGroup2.findViewById(R.id.radioButtonAutoMic);
        RadioButton radioButton2 = (RadioButton) viewGroup2.findViewById(R.id.radioButtonHeadsetMicMic);
        RadioButton radioButton3 = (RadioButton) viewGroup2.findViewById(R.id.radioButtonInternalMic);
        RadioButton radioButton4 = (RadioButton) viewGroup2.findViewById(R.id.radioButtonBluetoothMicAlways);
        RadioButton radioButton5 = (RadioButton) viewGroup2.findViewById(R.id.radioButtonUsbMic);
        RadioButton radioButton6 = (RadioButton) viewGroup2.findViewById(R.id.radioButtonDoNothing);
        if (!C0697ju.m2186i(context)) {
            builder.setTitle(R.string.select_mic_not_enabled_message);
            radioButton.setEnabled(false);
            radioButton6.setEnabled(false);
            radioButton2.setEnabled(false);
            radioButton3.setEnabled(false);
            radioButton4.setEnabled(false);
            radioButton5.setEnabled(false);
        } else {
            builder.setTitle(R.string.select_mic_input_message);
            builder.setMessage(R.string.select_mic_input_details_message);
        }
        if (soVar.ordinal() == 1) {
            ((View) radioButton.getParent()).setVisibility(8);
            radioButton.setEnabled(false);
            View findViewById = this.f5219b.findViewById(R.id.inputConfigInternalSeparator);
            findViewById.setVisibility(0);
            ((TextView) findViewById.findViewById(R.id.inputConfigMicrophoneMaybeIgnoredForInputMessage)).setText(C0728kh.m2286b(context) ? R.string.config_message_disable_internal_mic_maybe_required : R.string.config_message_disable_internal_mic_maybe_required_pie);
        }
        this.f5220c = new C1431a(this, new RadioButton[]{radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6}, viewGroup2, soVar2);
        switch (C0697ju.m2187j(context, soVar).ordinal()) {
            case 0:
                this.f5220c.mo3874b(R.id.radioButtonDoNothing, true);
                break;
            case 1:
            case 4:
                ouVar = this.f5220c;
                i = R.id.radioButtonAutoMic;
                break;
            case 2:
                ouVar = this.f5220c;
                i = R.id.radioButtonInternalMic;
                break;
            case 3:
                ouVar = this.f5220c;
                i = R.id.radioButtonHeadsetMicMic;
                break;
            case 5:
                ouVar = this.f5220c;
                i = R.id.radioButtonBluetoothMicAlways;
                break;
            case 6:
                ouVar = this.f5220c;
                i = R.id.radioButtonUsbMic;
                break;
        }
        ouVar.mo3874b(i, true);
        builder.setPositiveButton(R.string.button_done, C1275vq.f4840b);
        this.f5218a = builder.create();
    }
}
