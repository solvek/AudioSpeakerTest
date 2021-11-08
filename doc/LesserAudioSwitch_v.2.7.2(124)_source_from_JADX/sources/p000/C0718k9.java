package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k9 */
public abstract class C0718k9 implements Parcelable {
    public static final Parcelable.Creator<C0718k9> CREATOR = new C0720b();

    /* renamed from: c */
    public static final C0718k9 f2987c = new C0719a();

    /* renamed from: b */
    public final Parcelable f2988b;

    /* renamed from: k9$a */
    public static class C0719a extends C0718k9 {
        public C0719a() {
            super((C0719a) null);
        }
    }

    /* renamed from: k9$b */
    public static class C0720b implements Parcelable.ClassLoaderCreator<C0718k9> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return C0718k9.f2987c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new C0718k9[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0718k9.f2987c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public C0718k9(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2988b = readParcelable == null ? f2987c : readParcelable;
    }

    public C0718k9(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2988b = parcelable == f2987c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public C0718k9(C0719a aVar) {
        this.f2988b = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2988b, i);
    }
}
