package p000;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: na */
public final class C0866na implements Parcelable {
    public static final Parcelable.Creator<C0866na> CREATOR = new C0867a();

    /* renamed from: b */
    public final String f3352b;

    /* renamed from: c */
    public final String f3353c;

    /* renamed from: d */
    public final boolean f3354d;

    /* renamed from: e */
    public final int f3355e;

    /* renamed from: f */
    public final int f3356f;

    /* renamed from: g */
    public final String f3357g;

    /* renamed from: h */
    public final boolean f3358h;

    /* renamed from: i */
    public final boolean f3359i;

    /* renamed from: j */
    public final boolean f3360j;

    /* renamed from: k */
    public final Bundle f3361k;

    /* renamed from: l */
    public final boolean f3362l;

    /* renamed from: m */
    public final int f3363m;

    /* renamed from: n */
    public Bundle f3364n;

    /* renamed from: na$a */
    public static class C0867a implements Parcelable.Creator<C0866na> {
        public Object createFromParcel(Parcel parcel) {
            return new C0866na(parcel);
        }

        public Object[] newArray(int i) {
            return new C0866na[i];
        }
    }

    public C0866na(Parcel parcel) {
        this.f3352b = parcel.readString();
        this.f3353c = parcel.readString();
        boolean z = true;
        this.f3354d = parcel.readInt() != 0;
        this.f3355e = parcel.readInt();
        this.f3356f = parcel.readInt();
        this.f3357g = parcel.readString();
        this.f3358h = parcel.readInt() != 0;
        this.f3359i = parcel.readInt() != 0;
        this.f3360j = parcel.readInt() != 0;
        this.f3361k = parcel.readBundle();
        this.f3362l = parcel.readInt() == 0 ? false : z;
        this.f3364n = parcel.readBundle();
        this.f3363m = parcel.readInt();
    }

    public C0866na(Fragment fragment) {
        this.f3352b = fragment.getClass().getName();
        this.f3353c = fragment.f697e;
        this.f3354d = fragment.f705m;
        this.f3355e = fragment.f714v;
        this.f3356f = fragment.f715w;
        this.f3357g = fragment.f716x;
        this.f3358h = fragment.f676A;
        this.f3359i = fragment.f704l;
        this.f3360j = fragment.f718z;
        this.f3361k = fragment.f698f;
        this.f3362l = fragment.f717y;
        this.f3363m = fragment.f689N.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3352b);
        sb.append(" (");
        sb.append(this.f3353c);
        sb.append(")}:");
        if (this.f3354d) {
            sb.append(" fromLayout");
        }
        if (this.f3356f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3356f));
        }
        String str = this.f3357g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3357g);
        }
        if (this.f3358h) {
            sb.append(" retainInstance");
        }
        if (this.f3359i) {
            sb.append(" removing");
        }
        if (this.f3360j) {
            sb.append(" detached");
        }
        if (this.f3362l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3352b);
        parcel.writeString(this.f3353c);
        parcel.writeInt(this.f3354d ? 1 : 0);
        parcel.writeInt(this.f3355e);
        parcel.writeInt(this.f3356f);
        parcel.writeString(this.f3357g);
        parcel.writeInt(this.f3358h ? 1 : 0);
        parcel.writeInt(this.f3359i ? 1 : 0);
        parcel.writeInt(this.f3360j ? 1 : 0);
        parcel.writeBundle(this.f3361k);
        parcel.writeInt(this.f3362l ? 1 : 0);
        parcel.writeBundle(this.f3364n);
        parcel.writeInt(this.f3363m);
    }
}
