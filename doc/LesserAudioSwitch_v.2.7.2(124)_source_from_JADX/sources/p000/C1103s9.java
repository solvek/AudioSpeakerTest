package p000;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p000.C1009qa;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: s9 */
public final class C1103s9 implements Parcelable {
    public static final Parcelable.Creator<C1103s9> CREATOR = new C1104a();

    /* renamed from: b */
    public final int[] f4165b;

    /* renamed from: c */
    public final ArrayList<String> f4166c;

    /* renamed from: d */
    public final int[] f4167d;

    /* renamed from: e */
    public final int[] f4168e;

    /* renamed from: f */
    public final int f4169f;

    /* renamed from: g */
    public final String f4170g;

    /* renamed from: h */
    public final int f4171h;

    /* renamed from: i */
    public final int f4172i;

    /* renamed from: j */
    public final CharSequence f4173j;

    /* renamed from: k */
    public final int f4174k;

    /* renamed from: l */
    public final CharSequence f4175l;

    /* renamed from: m */
    public final ArrayList<String> f4176m;

    /* renamed from: n */
    public final ArrayList<String> f4177n;

    /* renamed from: o */
    public final boolean f4178o;

    /* renamed from: s9$a */
    public static class C1104a implements Parcelable.Creator<C1103s9> {
        public Object createFromParcel(Parcel parcel) {
            return new C1103s9(parcel);
        }

        public Object[] newArray(int i) {
            return new C1103s9[i];
        }
    }

    public C1103s9(Parcel parcel) {
        this.f4165b = parcel.createIntArray();
        this.f4166c = parcel.createStringArrayList();
        this.f4167d = parcel.createIntArray();
        this.f4168e = parcel.createIntArray();
        this.f4169f = parcel.readInt();
        this.f4170g = parcel.readString();
        this.f4171h = parcel.readInt();
        this.f4172i = parcel.readInt();
        this.f4173j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4174k = parcel.readInt();
        this.f4175l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4176m = parcel.createStringArrayList();
        this.f4177n = parcel.createStringArrayList();
        this.f4178o = parcel.readInt() != 0;
    }

    public C1103s9(C1053r9 r9Var) {
        int size = r9Var.f3784a.size();
        this.f4165b = new int[(size * 5)];
        if (r9Var.f3790g) {
            this.f4166c = new ArrayList<>(size);
            this.f4167d = new int[size];
            this.f4168e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1009qa.C1010a aVar = r9Var.f3784a.get(i);
                int i3 = i2 + 1;
                this.f4165b[i2] = aVar.f3800a;
                ArrayList<String> arrayList = this.f4166c;
                Fragment fragment = aVar.f3801b;
                arrayList.add(fragment != null ? fragment.f697e : null);
                int[] iArr = this.f4165b;
                int i4 = i3 + 1;
                iArr[i3] = aVar.f3802c;
                int i5 = i4 + 1;
                iArr[i4] = aVar.f3803d;
                int i6 = i5 + 1;
                iArr[i5] = aVar.f3804e;
                iArr[i6] = aVar.f3805f;
                this.f4167d[i] = aVar.f3806g.ordinal();
                this.f4168e[i] = aVar.f3807h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f4169f = r9Var.f3789f;
            this.f4170g = r9Var.f3792i;
            this.f4171h = r9Var.f3943s;
            this.f4172i = r9Var.f3793j;
            this.f4173j = r9Var.f3794k;
            this.f4174k = r9Var.f3795l;
            this.f4175l = r9Var.f3796m;
            this.f4176m = r9Var.f3797n;
            this.f4177n = r9Var.f3798o;
            this.f4178o = r9Var.f3799p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f4165b);
        parcel.writeStringList(this.f4166c);
        parcel.writeIntArray(this.f4167d);
        parcel.writeIntArray(this.f4168e);
        parcel.writeInt(this.f4169f);
        parcel.writeString(this.f4170g);
        parcel.writeInt(this.f4171h);
        parcel.writeInt(this.f4172i);
        TextUtils.writeToParcel(this.f4173j, parcel, 0);
        parcel.writeInt(this.f4174k);
        TextUtils.writeToParcel(this.f4175l, parcel, 0);
        parcel.writeStringList(this.f4176m);
        parcel.writeStringList(this.f4177n);
        parcel.writeInt(this.f4178o ? 1 : 0);
    }
}
