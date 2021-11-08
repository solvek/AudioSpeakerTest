package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.nordskog.LesserAudioSwitch.R;

public class ListPreference extends DialogPreference {

    /* renamed from: T */
    public CharSequence[] f770T;

    /* renamed from: U */
    public CharSequence[] f771U;

    /* renamed from: V */
    public String f772V;

    /* renamed from: W */
    public String f773W;

    /* renamed from: X */
    public boolean f774X;

    /* renamed from: androidx.preference.ListPreference$a */
    public static class C0114a extends Preference.C0120b {
        public static final Parcelable.Creator<C0114a> CREATOR = new C0115a();

        /* renamed from: b */
        public String f775b;

        /* renamed from: androidx.preference.ListPreference$a$a */
        public static class C0115a implements Parcelable.Creator<C0114a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0114a(parcel);
            }

            public Object[] newArray(int i) {
                return new C0114a[i];
            }
        }

        public C0114a(Parcel parcel) {
            super(parcel);
            this.f775b = parcel.readString();
        }

        public C0114a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f775b);
        }
    }

    /* renamed from: androidx.preference.ListPreference$b */
    public static final class C0116b implements Preference.C0125f<ListPreference> {

        /* renamed from: a */
        public static C0116b f776a;

        /* renamed from: a */
        public CharSequence mo925a(Preference preference) {
            ListPreference listPreference = (ListPreference) preference;
            return TextUtils.isEmpty(listPreference.mo927J()) ? listPreference.f794b.getString(R.string.not_set) : listPreference.mo927J();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m6.m2440a(context, R.attr.dialogPreferenceStyle, 16842897), 0);
    }

    /* renamed from: I */
    public int mo926I(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f771U) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f771U[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public CharSequence mo927J() {
        CharSequence[] charSequenceArr;
        int I = mo926I(this.f772V);
        if (I < 0 || (charSequenceArr = this.f770T) == null) {
            return null;
        }
        return charSequenceArr[I];
    }

    /* renamed from: K */
    public void mo928K(String str) {
        boolean z = !TextUtils.equals(this.f772V, str);
        if (z || !this.f774X) {
            this.f772V = str;
            this.f774X = true;
            mo937B(str);
            if (z) {
                mo913l();
            }
        }
    }

    /* renamed from: i */
    public CharSequence mo929i() {
        Preference.C0125f fVar = this.f792L;
        if (fVar != null) {
            return fVar.mo925a(this);
        }
        Object J = mo927J();
        CharSequence i = super.mo929i();
        String str = this.f773W;
        if (str == null) {
            return i;
        }
        Object[] objArr = new Object[1];
        if (J == null) {
            J = "";
        }
        objArr[0] = J;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, i) ? i : format;
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0114a.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0114a aVar = (C0114a) parcelable;
        super.mo919w(aVar.getSuperState());
        mo928K(aVar.f775b);
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        Parcelable x = super.mo920x();
        if (this.f810r) {
            return x;
        }
        C0114a aVar = new C0114a(x);
        aVar.f775b = this.f772V;
        return aVar;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
        mo928K(mo949f((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4419e, i, i2);
        this.f770T = C0806m6.m2446g(obtainStyledAttributes, 2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(3);
        this.f771U = textArray == null ? obtainStyledAttributes.getTextArray(1) : textArray;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0116b.f776a == null) {
                C0116b.f776a = new C0116b();
            }
            this.f792L = C0116b.f776a;
            mo913l();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1163tc.f4421g, i, i2);
        this.f773W = C0806m6.m2445f(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
