package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p000.C0901o;

/* renamed from: jc */
public class C0674jc extends C0723kc {

    /* renamed from: p0 */
    public Set<String> f2861p0 = new HashSet();

    /* renamed from: q0 */
    public boolean f2862q0;

    /* renamed from: r0 */
    public CharSequence[] f2863r0;

    /* renamed from: s0 */
    public CharSequence[] f2864s0;

    /* renamed from: jc$a */
    public class C0675a implements DialogInterface.OnMultiChoiceClickListener {
        public C0675a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean z3;
            C0674jc jcVar = C0674jc.this;
            if (z) {
                z2 = jcVar.f2862q0;
                z3 = jcVar.f2861p0.add(jcVar.f2864s0[i].toString());
            } else {
                z2 = jcVar.f2862q0;
                z3 = jcVar.f2861p0.remove(jcVar.f2864s0[i].toString());
            }
            jcVar.f2862q0 = z3 | z2;
        }
    }

    /* renamed from: F0 */
    public void mo2941F0(boolean z) {
        if (z && this.f2862q0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) mo3547B0();
            multiSelectListPreference.getClass();
            multiSelectListPreference.mo933I(this.f2861p0);
        }
        this.f2862q0 = false;
    }

    /* renamed from: G0 */
    public void mo3260G0(C0901o.C0902a aVar) {
        int length = this.f2864s0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f2861p0.contains(this.f2864s0[i].toString());
        }
        CharSequence[] charSequenceArr = this.f2863r0;
        C0675a aVar2 = new C0675a();
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f201l = charSequenceArr;
        bVar.f209t = aVar2;
        bVar.f205p = zArr;
        bVar.f206q = true;
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) mo3547B0();
            if (multiSelectListPreference.f777T == null || multiSelectListPreference.f778U == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f2861p0.clear();
            this.f2861p0.addAll(multiSelectListPreference.f779V);
            this.f2862q0 = false;
            this.f2863r0 = multiSelectListPreference.f777T;
            this.f2864s0 = multiSelectListPreference.f778U;
            return;
        }
        this.f2861p0.clear();
        this.f2861p0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f2862q0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f2863r0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f2864s0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        super.mo850b0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f2861p0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2862q0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2863r0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2864s0);
    }
}
