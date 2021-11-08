package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0769lc;
import p000.C0968pc;

public abstract class DialogPreference extends Preference {

    /* renamed from: N */
    public CharSequence f756N;

    /* renamed from: O */
    public CharSequence f757O;

    /* renamed from: P */
    public Drawable f758P;

    /* renamed from: Q */
    public CharSequence f759Q;

    /* renamed from: R */
    public CharSequence f760R;

    /* renamed from: S */
    public int f761S;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C0109a {
        /* renamed from: b */
        <T extends Preference> T mo912b(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m6.m2440a(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    /* renamed from: q */
    public void mo911q() {
        C1157t9 t9Var;
        C0968pc.C0969a aVar = this.f795c.f3615i;
        if (aVar != null) {
            C0769lc lcVar = (C0769lc) aVar;
            if (!(lcVar.mo862i() instanceof C0769lc.C0773d ? ((C0769lc.C0773d) lcVar.mo862i()).mo3627a(lcVar, this) : false) && lcVar.mo885s().mo3199H("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    String str = this.f804l;
                    t9Var = new C0527gc();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", str);
                    t9Var.mo882q0(bundle);
                } else if (this instanceof ListPreference) {
                    String str2 = this.f804l;
                    t9Var = new C0623ic();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", str2);
                    t9Var.mo882q0(bundle2);
                } else if (this instanceof MultiSelectListPreference) {
                    String str3 = this.f804l;
                    t9Var = new C0674jc();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", str3);
                    t9Var.mo882q0(bundle3);
                } else {
                    StringBuilder c = C0279ch.m1106c("Cannot display dialog for an unknown Preference type: ");
                    c.append(getClass().getSimpleName());
                    c.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(c.toString());
                }
                t9Var.mo893v0(lcVar, 0);
                t9Var.mo4634A0(lcVar.mo885s(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4417c, i, i2);
        String f = C0806m6.m2445f(obtainStyledAttributes, 9, 0);
        this.f756N = f;
        if (f == null) {
            this.f756N = this.f800h;
        }
        String string = obtainStyledAttributes.getString(8);
        this.f757O = string == null ? obtainStyledAttributes.getString(1) : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f758P = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = obtainStyledAttributes.getString(11);
        this.f759Q = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        String string3 = obtainStyledAttributes.getString(10);
        this.f760R = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        this.f761S = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
