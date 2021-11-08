package p000;

import android.widget.RadioGroup;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0735ko;

/* renamed from: zp */
public final /* synthetic */ class C1473zp implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0991ps f5361a;

    public /* synthetic */ C1473zp(C0991ps psVar) {
        this.f5361a = psVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C0735ko.C0736a aVar;
        C0991ps psVar = this.f5361a;
        psVar.getClass();
        switch (i) {
            case R.id.radioButtonAddressableOverrideAddressable /*2131231025*/:
                aVar = C0735ko.C0736a.f3024d;
                break;
            case R.id.radioButtonAddressableOverrideAuto /*2131231026*/:
                aVar = C0735ko.C0736a.f3022b;
                break;
            case R.id.radioButtonAddressableOverrideNormal /*2131231027*/:
                aVar = C0735ko.C0736a.f3023c;
                break;
            default:
                return;
        }
        psVar.f3720b = aVar;
    }
}
