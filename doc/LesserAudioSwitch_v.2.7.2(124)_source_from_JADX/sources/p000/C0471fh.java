package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: fh */
public final class C0471fh extends C0631ih implements C0379dh {
    public C0471fh(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    /* renamed from: a */
    public final Bundle mo2651a(int i, String str, String str2, String str3) {
        Parcel j = mo3274j();
        j.writeInt(3);
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        Parcel k = mo3275k(4, j);
        Bundle bundle = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle;
    }

    /* renamed from: b */
    public final Bundle mo2652b(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel j = mo3274j();
        j.writeInt(10);
        j.writeString(str);
        j.writeString(str2);
        C0684jh.m2170b(j, bundle);
        C0684jh.m2170b(j, bundle2);
        Parcel k = mo3275k(901, j);
        Bundle bundle3 = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle3;
    }

    /* renamed from: c */
    public final Bundle mo2653c(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel j = mo3274j();
        j.writeInt(9);
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        C0684jh.m2170b(j, bundle);
        Parcel k = mo3275k(11, j);
        Bundle bundle2 = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle2;
    }

    /* renamed from: d */
    public final Bundle mo2654d(int i, String str, String str2, Bundle bundle) {
        Parcel j = mo3274j();
        j.writeInt(3);
        j.writeString(str);
        j.writeString(str2);
        C0684jh.m2170b(j, bundle);
        Parcel k = mo3275k(2, j);
        Bundle bundle2 = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle2;
    }

    /* renamed from: e */
    public final Bundle mo2655e(int i, String str, List<String> list, String str2, String str3, String str4) {
        Parcel j = mo3274j();
        j.writeInt(5);
        j.writeString(str);
        j.writeStringList(list);
        j.writeString(str2);
        j.writeString(str3);
        j.writeString((String) null);
        Parcel k = mo3275k(7, j);
        Bundle bundle = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle;
    }

    /* renamed from: f */
    public final int mo2656f(int i, String str, String str2) {
        Parcel j = mo3274j();
        j.writeInt(i);
        j.writeString(str);
        j.writeString(str2);
        Parcel k = mo3275k(1, j);
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: g */
    public final Bundle mo2657g(int i, String str, String str2, Bundle bundle) {
        Parcel j = mo3274j();
        j.writeInt(9);
        j.writeString(str);
        j.writeString(str2);
        C0684jh.m2170b(j, bundle);
        Parcel k = mo3275k(902, j);
        Bundle bundle2 = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle2;
    }

    /* renamed from: h */
    public final Bundle mo2658h(int i, String str, String str2, String str3, String str4) {
        Parcel j = mo3274j();
        j.writeInt(3);
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        j.writeString((String) null);
        Parcel k = mo3275k(3, j);
        Bundle bundle = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle;
    }

    /* renamed from: i */
    public final Bundle mo2659i(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel j = mo3274j();
        j.writeInt(i);
        j.writeString(str);
        j.writeString(str2);
        j.writeString(str3);
        j.writeString((String) null);
        C0684jh.m2170b(j, bundle);
        Parcel k = mo3275k(8, j);
        Bundle bundle2 = (Bundle) C0684jh.m2169a(k, Bundle.CREATOR);
        k.recycle();
        return bundle2;
    }
}
