package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: S */
    public final C0132a f846S = new C0132a();

    /* renamed from: T */
    public CharSequence f847T;

    /* renamed from: U */
    public CharSequence f848U;

    /* renamed from: androidx.preference.SwitchPreference$a */
    public class C0132a implements CompoundButton.OnCheckedChangeListener {
        public C0132a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreference.this.getClass();
            SwitchPreference.this.mo989I(z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903685(0x7f030285, float:1.7414195E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = p000.C0806m6.m2440a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$a r2 = new androidx.preference.SwitchPreference$a
            r2.<init>()
            r3.f846S = r2
            int[] r2 = p000.C1163tc.f4426l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = p000.C0806m6.m2445f(r4, r5, r1)
            r3.mo991K(r5)
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x002f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L_0x002f:
            r3.mo990J(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x003f
            java.lang.String r5 = r4.getString(r0)
        L_0x003f:
            r3.f847T = r5
            r3.mo913l()
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0051
            java.lang.String r5 = r4.getString(r0)
        L_0x0051:
            r3.f848U = r5
            r3.mo913l()
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f858R = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: A */
    public void mo907A(View view) {
        super.mo907A(view);
        if (((AccessibilityManager) this.f794b.getSystemService("accessibility")).isEnabled()) {
            mo985N(view.findViewById(16908352));
            mo992L(view.findViewById(16908304));
        }
    }

    /* renamed from: N */
    public final void mo985N(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f854N);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f847T);
            switchR.setTextOff(this.f848U);
            switchR.setOnCheckedChangeListener(this.f846S);
        }
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        mo985N(rcVar.mo4232w(16908352));
        mo993M(rcVar);
    }
}
