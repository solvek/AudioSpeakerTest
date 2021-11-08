package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: T */
    public CharSequence[] f777T;

    /* renamed from: U */
    public CharSequence[] f778U;

    /* renamed from: V */
    public Set<String> f779V = new HashSet();

    /* renamed from: androidx.preference.MultiSelectListPreference$a */
    public static class C0117a extends Preference.C0120b {
        public static final Parcelable.Creator<C0117a> CREATOR = new C0118a();

        /* renamed from: b */
        public Set<String> f780b;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a */
        public static class C0118a implements Parcelable.Creator<C0117a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0117a(parcel);
            }

            public Object[] newArray(int i) {
                return new C0117a[i];
            }
        }

        public C0117a(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f780b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f780b, strArr);
        }

        public C0117a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f780b.size());
            Set<String> set = this.f780b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903276(0x7f0300ec, float:1.7413365E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p000.C0806m6.m2440a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.f779V = r2
            int[] r2 = p000.C1163tc.f4420f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            java.lang.CharSequence[] r5 = p000.C0806m6.m2446g(r4, r5, r1)
            r3.f777T = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x002e
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L_0x002e:
            r3.f778U = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: I */
    public void mo933I(Set<String> set) {
        this.f779V.clear();
        this.f779V.addAll(set);
        if (mo942H() && !set.equals(mo950g((Set<String>) null))) {
            mo951h();
            SharedPreferences.Editor a = this.f795c.mo4009a();
            a.putStringSet(this.f804l, set);
            if (!this.f795c.f3611e) {
                a.apply();
            }
        }
        mo913l();
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0117a.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0117a aVar = (C0117a) parcelable;
        super.mo919w(aVar.getSuperState());
        mo933I(aVar.f780b);
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        Parcelable x = super.mo920x();
        if (this.f810r) {
            return x;
        }
        C0117a aVar = new C0117a(x);
        aVar.f780b = this.f779V;
        return aVar;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
        mo933I(mo950g((Set) obj));
    }
}
