package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: N */
    public boolean f854N;

    /* renamed from: O */
    public CharSequence f855O;

    /* renamed from: P */
    public CharSequence f856P;

    /* renamed from: Q */
    public boolean f857Q;

    /* renamed from: R */
    public boolean f858R;

    /* renamed from: androidx.preference.TwoStatePreference$a */
    public static class C0134a extends Preference.C0120b {
        public static final Parcelable.Creator<C0134a> CREATOR = new C0135a();

        /* renamed from: b */
        public boolean f859b;

        /* renamed from: androidx.preference.TwoStatePreference$a$a */
        public static class C0135a implements Parcelable.Creator<C0134a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0134a(parcel);
            }

            public Object[] newArray(int i) {
                return new C0134a[i];
            }
        }

        public C0134a(Parcel parcel) {
            super(parcel);
            this.f859b = parcel.readInt() != 1 ? false : true;
        }

        public C0134a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f859b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: G */
    public boolean mo916G() {
        return (this.f858R ? this.f854N : !this.f854N) || super.mo916G();
    }

    /* renamed from: I */
    public void mo989I(boolean z) {
        boolean z2 = this.f854N != z;
        if (z2 || !this.f857Q) {
            this.f854N = z;
            this.f857Q = true;
            if (mo942H() && z != mo947d(!z)) {
                mo951h();
                SharedPreferences.Editor a = this.f795c.mo4009a();
                a.putBoolean(this.f804l, z);
                if (!this.f795c.f3611e) {
                    a.apply();
                }
            }
            if (z2) {
                mo954m(mo916G());
                mo913l();
            }
        }
    }

    /* renamed from: J */
    public void mo990J(CharSequence charSequence) {
        this.f856P = charSequence;
        if (!this.f854N) {
            mo913l();
        }
    }

    /* renamed from: K */
    public void mo991K(CharSequence charSequence) {
        this.f855O = charSequence;
        if (this.f854N) {
            mo913l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo992L(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f854N
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.f855O
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.f855O
        L_0x0017:
            r5.setText(r0)
            r0 = 0
            goto L_0x002b
        L_0x001c:
            boolean r1 = r4.f854N
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r1 = r4.f856P
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002b
            java.lang.CharSequence r0 = r4.f856P
            goto L_0x0017
        L_0x002b:
            if (r0 == 0) goto L_0x003b
            java.lang.CharSequence r1 = r4.mo929i()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r5.setText(r1)
            r0 = 0
        L_0x003b:
            r1 = 8
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 8
        L_0x0042:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004b
            r5.setVisibility(r2)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.mo992L(android.view.View):void");
    }

    /* renamed from: M */
    public void mo993M(C1056rc rcVar) {
        mo992L(rcVar.mo4232w(16908304));
    }

    /* renamed from: q */
    public void mo911q() {
        mo989I(!this.f854N);
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0134a.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0134a aVar = (C0134a) parcelable;
        super.mo919w(aVar.getSuperState());
        mo989I(aVar.f859b);
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        Parcelable x = super.mo920x();
        if (this.f810r) {
            return x;
        }
        C0134a aVar = new C0134a(x);
        aVar.f859b = this.f854N;
        return aVar;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        mo989I(mo947d(((Boolean) obj).booleanValue()));
    }
}
