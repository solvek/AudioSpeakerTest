package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.nordskog.LesserAudioSwitch.R;

public class EditTextPreference extends DialogPreference {

    /* renamed from: T */
    public String f767T;

    /* renamed from: androidx.preference.EditTextPreference$a */
    public static class C0111a extends Preference.C0120b {
        public static final Parcelable.Creator<C0111a> CREATOR = new C0112a();

        /* renamed from: b */
        public String f768b;

        /* renamed from: androidx.preference.EditTextPreference$a$a */
        public static class C0112a implements Parcelable.Creator<C0111a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0111a(parcel);
            }

            public Object[] newArray(int i) {
                return new C0111a[i];
            }
        }

        public C0111a(Parcel parcel) {
            super(parcel);
            this.f768b = parcel.readString();
        }

        public C0111a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f768b);
        }
    }

    /* renamed from: androidx.preference.EditTextPreference$b */
    public static final class C0113b implements Preference.C0125f<EditTextPreference> {

        /* renamed from: a */
        public static C0113b f769a;

        /* renamed from: a */
        public CharSequence mo925a(Preference preference) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            if (TextUtils.isEmpty(editTextPreference.f767T)) {
                return editTextPreference.f794b.getString(R.string.not_set);
            }
            return editTextPreference.f767T;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903301(0x7f030105, float:1.7413416E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = p000.C0806m6.m2440a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = p000.C1163tc.f4418d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = p000.C0806m6.m2441b(r4, r1, r1, r1)
            if (r5 == 0) goto L_0x002c
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.C0113b.f769a
            if (r5 != 0) goto L_0x0025
            androidx.preference.EditTextPreference$b r5 = new androidx.preference.EditTextPreference$b
            r5.<init>()
            androidx.preference.EditTextPreference.C0113b.f769a = r5
        L_0x0025:
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.C0113b.f769a
            r3.f792L = r5
            r3.mo913l()
        L_0x002c:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: G */
    public boolean mo916G() {
        return TextUtils.isEmpty(this.f767T) || super.mo916G();
    }

    /* renamed from: I */
    public void mo917I(String str) {
        boolean G = mo916G();
        this.f767T = str;
        mo937B(str);
        boolean G2 = mo916G();
        if (G2 != G) {
            mo954m(G2);
        }
        mo913l();
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0111a.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0111a aVar = (C0111a) parcelable;
        super.mo919w(aVar.getSuperState());
        mo917I(aVar.f768b);
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        Parcelable x = super.mo920x();
        if (this.f810r) {
            return x;
        }
        C0111a aVar = new C0111a(x);
        aVar.f768b = this.f767T;
        return aVar;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
        mo917I(mo949f((String) obj));
    }
}
