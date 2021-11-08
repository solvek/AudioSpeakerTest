package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.nordskog.LesserAudioSwitch.R;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: S */
    public final C0108a f754S;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    public class C0108a implements CompoundButton.OnCheckedChangeListener {
        public C0108a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckBoxPreference.this.getClass();
            CheckBoxPreference.this.mo989I(z);
        }
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m6.m2440a(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f754S = new C0108a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4416b, i, i2);
        mo991K(C0806m6.m2445f(obtainStyledAttributes, 5, 0));
        String string = obtainStyledAttributes.getString(4);
        mo990J(string == null ? obtainStyledAttributes.getString(1) : string);
        this.f858R = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public void mo907A(View view) {
        super.mo907A(view);
        if (((AccessibilityManager) this.f794b.getSystemService("accessibility")).isEnabled()) {
            mo908N(view.findViewById(16908289));
            mo992L(view.findViewById(16908304));
        }
    }

    /* renamed from: N */
    public final void mo908N(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f854N);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f754S);
        }
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        mo908N(rcVar.mo4232w(16908289));
        mo993M(rcVar);
    }
}
