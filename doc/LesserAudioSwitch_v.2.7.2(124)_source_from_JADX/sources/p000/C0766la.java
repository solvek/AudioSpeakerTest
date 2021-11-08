package p000;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: la */
public final class C0766la implements Parcelable {
    public static final Parcelable.Creator<C0766la> CREATOR = new C0767a();

    /* renamed from: b */
    public ArrayList<C0866na> f3127b;

    /* renamed from: c */
    public ArrayList<String> f3128c;

    /* renamed from: d */
    public C1103s9[] f3129d;

    /* renamed from: e */
    public int f3130e;

    /* renamed from: f */
    public String f3131f = null;

    /* renamed from: la$a */
    public static class C0767a implements Parcelable.Creator<C0766la> {
        public Object createFromParcel(Parcel parcel) {
            return new C0766la(parcel);
        }

        public Object[] newArray(int i) {
            return new C0766la[i];
        }
    }

    public C0766la() {
    }

    public C0766la(Parcel parcel) {
        this.f3127b = parcel.createTypedArrayList(C0866na.CREATOR);
        this.f3128c = parcel.createStringArrayList();
        this.f3129d = (C1103s9[]) parcel.createTypedArray(C1103s9.CREATOR);
        this.f3130e = parcel.readInt();
        this.f3131f = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3127b);
        parcel.writeStringList(this.f3128c);
        parcel.writeTypedArray(this.f3129d, i);
        parcel.writeInt(this.f3130e);
        parcel.writeString(this.f3131f);
    }
}
