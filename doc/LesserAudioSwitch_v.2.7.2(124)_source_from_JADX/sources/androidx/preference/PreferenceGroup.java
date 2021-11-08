package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: N */
    public final C0663j4<String, Long> f821N;

    /* renamed from: O */
    public List<Preference> f822O;

    /* renamed from: P */
    public boolean f823P;

    /* renamed from: Q */
    public int f824Q;

    /* renamed from: R */
    public boolean f825R;

    /* renamed from: S */
    public int f826S;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    public static class C0126a extends Preference.C0120b {
        public static final Parcelable.Creator<C0126a> CREATOR = new C0127a();

        /* renamed from: b */
        public int f827b;

        /* renamed from: androidx.preference.PreferenceGroup$a$a */
        public static class C0127a implements Parcelable.Creator<C0126a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0126a(parcel);
            }

            public Object[] newArray(int i) {
                return new C0126a[i];
            }
        }

        public C0126a(Parcel parcel) {
            super(parcel);
            this.f827b = parcel.readInt();
        }

        public C0126a(Parcelable parcelable, int i) {
            super(parcelable);
            this.f827b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f827b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    /* renamed from: I */
    public <T extends Preference> T mo969I(CharSequence charSequence) {
        T I;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f804l, charSequence)) {
            return this;
        } else {
            int K = mo971K();
            for (int i = 0; i < K; i++) {
                T J = mo970J(i);
                if (TextUtils.equals(J.f804l, charSequence)) {
                    return J;
                }
                if ((J instanceof PreferenceGroup) && (I = ((PreferenceGroup) J).mo969I(charSequence)) != null) {
                    return I;
                }
            }
            return null;
        }
    }

    /* renamed from: J */
    public Preference mo970J(int i) {
        return this.f822O.get(i);
    }

    /* renamed from: K */
    public int mo971K() {
        return this.f822O.size();
    }

    /* renamed from: L */
    public boolean mo972L() {
        return true;
    }

    /* renamed from: a */
    public void mo943a(Bundle bundle) {
        super.mo943a(bundle);
        int K = mo971K();
        for (int i = 0; i < K; i++) {
            mo970J(i).mo943a(bundle);
        }
    }

    /* renamed from: b */
    public void mo944b(Bundle bundle) {
        super.mo944b(bundle);
        int K = mo971K();
        for (int i = 0; i < K; i++) {
            mo970J(i).mo944b(bundle);
        }
    }

    /* renamed from: m */
    public void mo954m(boolean z) {
        super.mo954m(z);
        int K = mo971K();
        for (int i = 0; i < K; i++) {
            mo970J(i).mo961v(z);
        }
    }

    /* renamed from: n */
    public void mo955n() {
        super.mo955n();
        this.f825R = true;
        int K = mo971K();
        for (int i = 0; i < K; i++) {
            mo970J(i).mo955n();
        }
    }

    /* renamed from: s */
    public void mo958s() {
        super.mo958s();
        this.f825R = false;
        int K = mo971K();
        for (int i = 0; i < K; i++) {
            mo970J(i).mo958s();
        }
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0126a.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0126a aVar = (C0126a) parcelable;
        this.f826S = aVar.f827b;
        super.mo919w(aVar.getSuperState());
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        return new C0126a(super.mo920x(), this.f826S);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f821N = new C0663j4<>();
        new Handler();
        this.f823P = true;
        this.f824Q = 0;
        this.f825R = false;
        this.f826S = Integer.MAX_VALUE;
        this.f822O = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4423i, i, i2);
        this.f823P = C0806m6.m2441b(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && !mo952j()) {
                getClass().getSimpleName();
            }
            this.f826S = i3;
        }
        obtainStyledAttributes.recycle();
    }
}
