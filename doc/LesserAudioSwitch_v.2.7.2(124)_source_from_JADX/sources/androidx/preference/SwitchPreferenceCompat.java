package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.nordskog.LesserAudioSwitch.R;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: S */
    public final C0133a f850S = new C0133a();

    /* renamed from: T */
    public CharSequence f851T;

    /* renamed from: U */
    public CharSequence f852U;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    public class C0133a implements CompoundButton.OnCheckedChangeListener {
        public C0133a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreferenceCompat.this.getClass();
            SwitchPreferenceCompat.this.mo989I(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4427m, R.attr.switchPreferenceCompatStyle, 0);
        mo991K(C0806m6.m2445f(obtainStyledAttributes, 7, 0));
        String string = obtainStyledAttributes.getString(6);
        mo990J(string == null ? obtainStyledAttributes.getString(1) : string);
        String string2 = obtainStyledAttributes.getString(9);
        this.f851T = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        mo913l();
        String string3 = obtainStyledAttributes.getString(8);
        this.f852U = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        mo913l();
        this.f858R = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public void mo907A(View view) {
        super.mo907A(view);
        if (((AccessibilityManager) this.f794b.getSystemService("accessibility")).isEnabled()) {
            mo987N(view.findViewById(R.id.switchWidget));
            mo992L(view.findViewById(16908304));
        }
    }

    /* renamed from: N */
    public final void mo987N(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f854N);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f851T);
            switchCompat.setTextOff(this.f852U);
            switchCompat.setOnCheckedChangeListener(this.f850S);
        }
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        mo987N(rcVar.mo4232w(R.id.switchWidget));
        mo993M(rcVar);
    }
}
