package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0192a();

    /* renamed from: b */
    public final C1261vf f1163b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0192a implements Parcelable.Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1163b = new C1209uf(parcel).mo4659o();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1209uf(parcel).mo4667w(this.f1163b);
    }
}
