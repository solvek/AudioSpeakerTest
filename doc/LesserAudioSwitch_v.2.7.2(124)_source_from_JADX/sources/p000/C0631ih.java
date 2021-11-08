package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ih */
public class C0631ih implements IInterface {

    /* renamed from: a */
    public final IBinder f2707a;

    /* renamed from: b */
    public final String f2708b;

    public C0631ih(IBinder iBinder, String str) {
        this.f2707a = iBinder;
        this.f2708b = str;
    }

    public IBinder asBinder() {
        return this.f2707a;
    }

    /* renamed from: j */
    public final Parcel mo3274j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2708b);
        return obtain;
    }

    /* renamed from: k */
    public final Parcel mo3275k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f2707a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
