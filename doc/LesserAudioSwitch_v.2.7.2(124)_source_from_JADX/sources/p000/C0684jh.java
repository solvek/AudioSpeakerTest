package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jh */
public class C0684jh {
    static {
        C0684jh.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m2169a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m2170b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
