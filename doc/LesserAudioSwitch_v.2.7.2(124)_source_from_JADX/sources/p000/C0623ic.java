package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.preference.ListPreference;
import p000.C0901o;

/* renamed from: ic */
public class C0623ic extends C0723kc {

    /* renamed from: p0 */
    public int f2678p0;

    /* renamed from: q0 */
    public CharSequence[] f2679q0;

    /* renamed from: r0 */
    public CharSequence[] f2680r0;

    /* renamed from: ic$a */
    public class C0624a implements DialogInterface.OnClickListener {
        public C0624a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0623ic icVar = C0623ic.this;
            icVar.f2678p0 = i;
            icVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: F0 */
    public void mo2941F0(boolean z) {
        int i;
        if (z && (i = this.f2678p0) >= 0) {
            String charSequence = this.f2680r0[i].toString();
            ListPreference listPreference = (ListPreference) mo3547B0();
            listPreference.getClass();
            listPreference.mo928K(charSequence);
        }
    }

    /* renamed from: G0 */
    public void mo3260G0(C0901o.C0902a aVar) {
        CharSequence[] charSequenceArr = this.f2679q0;
        int i = this.f2678p0;
        C0624a aVar2 = new C0624a();
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f201l = charSequenceArr;
        bVar.f203n = aVar2;
        bVar.f208s = i;
        bVar.f207r = true;
        bVar.f196g = null;
        bVar.f197h = null;
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) mo3547B0();
            if (listPreference.f770T == null || listPreference.f771U == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f2678p0 = listPreference.mo926I(listPreference.f772V);
            this.f2679q0 = listPreference.f770T;
            this.f2680r0 = listPreference.f771U;
            return;
        }
        this.f2678p0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f2679q0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f2680r0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        super.mo850b0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2678p0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2679q0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2680r0);
    }
}
