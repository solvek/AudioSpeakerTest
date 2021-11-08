package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* renamed from: gc */
public class C0527gc extends C0723kc {

    /* renamed from: p0 */
    public EditText f2275p0;

    /* renamed from: q0 */
    public CharSequence f2276q0;

    /* renamed from: C0 */
    public boolean mo2939C0() {
        return true;
    }

    /* renamed from: D0 */
    public void mo2940D0(View view) {
        super.mo2940D0(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f2275p0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f2275p0.setText(this.f2276q0);
            EditText editText2 = this.f2275p0;
            editText2.setSelection(editText2.getText().length());
            mo2942H0().getClass();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* renamed from: F0 */
    public void mo2941F0(boolean z) {
        if (z) {
            String obj = this.f2275p0.getText().toString();
            EditTextPreference H0 = mo2942H0();
            H0.getClass();
            H0.mo917I(obj);
        }
    }

    /* renamed from: H0 */
    public final EditTextPreference mo2942H0() {
        return (EditTextPreference) mo3547B0();
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        CharSequence charSequence;
        super.mo834L(bundle);
        if (bundle == null) {
            charSequence = mo2942H0().f767T;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.f2276q0 = charSequence;
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        super.mo850b0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2276q0);
    }
}
