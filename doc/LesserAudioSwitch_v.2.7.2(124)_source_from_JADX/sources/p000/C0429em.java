package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: em */
public class C0429em extends C0718k9 {
    public static final Parcelable.Creator<C0429em> CREATOR = new C0430a();

    /* renamed from: d */
    public final C0663j4<String, Bundle> f2020d;

    /* renamed from: em$a */
    public static class C0430a implements Parcelable.ClassLoaderCreator<C0429em> {
        public Object createFromParcel(Parcel parcel) {
            return new C0429em(parcel, (ClassLoader) null, (C0430a) null);
        }

        public Object[] newArray(int i) {
            return new C0429em[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0429em(parcel, classLoader, (C0430a) null);
        }
    }

    public C0429em(Parcel parcel, ClassLoader classLoader, C0430a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2020d = new C0663j4<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f2020d.put(strArr[i], bundleArr[i]);
        }
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("ExtendableSavedState{");
        c.append(Integer.toHexString(System.identityHashCode(this)));
        c.append(" states=");
        c.append(this.f2020d);
        c.append("}");
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2988b, i);
        int i2 = this.f2020d.f2827d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f2020d.mo3402h(i3);
            bundleArr[i3] = this.f2020d.mo3407k(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
