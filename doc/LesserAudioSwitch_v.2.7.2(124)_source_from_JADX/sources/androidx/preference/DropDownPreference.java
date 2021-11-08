package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.nordskog.LesserAudioSwitch.R;

public class DropDownPreference extends ListPreference {

    /* renamed from: Y */
    public final Context f762Y;

    /* renamed from: Z */
    public final ArrayAdapter f763Z;

    /* renamed from: a0 */
    public Spinner f764a0;

    /* renamed from: b0 */
    public final AdapterView.OnItemSelectedListener f765b0 = new C0110a();

    /* renamed from: androidx.preference.DropDownPreference$a */
    public class C0110a implements AdapterView.OnItemSelectedListener {
        public C0110a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.f771U[i].toString();
                if (!charSequence.equals(DropDownPreference.this.f772V)) {
                    DropDownPreference.this.getClass();
                    DropDownPreference.this.mo928K(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.f762Y = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f763Z = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f770T;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f763Z.add(charSequence.toString());
            }
        }
    }

    /* renamed from: l */
    public void mo913l() {
        super.mo913l();
        ArrayAdapter arrayAdapter = this.f763Z;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        Spinner spinner = (Spinner) rcVar.f996a.findViewById(R.id.spinner);
        this.f764a0 = spinner;
        spinner.setAdapter(this.f763Z);
        this.f764a0.setOnItemSelectedListener(this.f765b0);
        Spinner spinner2 = this.f764a0;
        String str = this.f772V;
        CharSequence[] charSequenceArr = this.f771U;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo909p(rcVar);
    }

    /* renamed from: q */
    public void mo911q() {
        this.f764a0.performClick();
    }
}
