package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p000.C1459zi;

/* renamed from: dj */
public class C0381dj implements C1459zi.C1462c {
    public static final Parcelable.Creator<C0381dj> CREATOR = new C0382a();

    /* renamed from: b */
    public final long f1901b;

    /* renamed from: dj$a */
    public static class C0382a implements Parcelable.Creator<C0381dj> {
        public Object createFromParcel(Parcel parcel) {
            return new C0381dj(parcel.readLong(), (C0382a) null);
        }

        public Object[] newArray(int i) {
            return new C0381dj[i];
        }
    }

    public C0381dj(long j) {
        this.f1901b = j;
    }

    public C0381dj(long j, C0382a aVar) {
        this.f1901b = j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0381dj) && this.f1901b == ((C0381dj) obj).f1901b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1901b)});
    }

    /* renamed from: i */
    public boolean mo2664i(long j) {
        return j >= this.f1901b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1901b);
    }
}
