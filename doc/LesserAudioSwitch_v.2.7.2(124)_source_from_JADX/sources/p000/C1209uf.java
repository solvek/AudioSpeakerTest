package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: uf */
public class C1209uf extends C1167tf {

    /* renamed from: d */
    public final SparseIntArray f4619d;

    /* renamed from: e */
    public final Parcel f4620e;

    /* renamed from: f */
    public final int f4621f;

    /* renamed from: g */
    public final int f4622g;

    /* renamed from: h */
    public final String f4623h;

    /* renamed from: i */
    public int f4624i;

    /* renamed from: j */
    public int f4625j;

    /* renamed from: k */
    public int f4626k;

    public C1209uf(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0254c4(), new C0254c4(), new C0254c4());
    }

    public C1209uf(Parcel parcel, int i, int i2, String str, C0254c4<String, Method> c4Var, C0254c4<String, Method> c4Var2, C0254c4<String, Class> c4Var3) {
        super(c4Var, c4Var2, c4Var3);
        this.f4619d = new SparseIntArray();
        this.f4624i = -1;
        this.f4625j = 0;
        this.f4626k = -1;
        this.f4620e = parcel;
        this.f4621f = i;
        this.f4622g = i2;
        this.f4625j = i;
        this.f4623h = str;
    }

    /* renamed from: a */
    public void mo4645a() {
        int i = this.f4624i;
        if (i >= 0) {
            int i2 = this.f4619d.get(i);
            int dataPosition = this.f4620e.dataPosition();
            this.f4620e.setDataPosition(i2);
            this.f4620e.writeInt(dataPosition - i2);
            this.f4620e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: b */
    public C1167tf mo4646b() {
        Parcel parcel = this.f4620e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4625j;
        if (i == this.f4621f) {
            i = this.f4622g;
        }
        int i2 = i;
        return new C1209uf(parcel, dataPosition, i2, this.f4623h + "  ", this.f4433a, this.f4434b, this.f4435c);
    }

    /* renamed from: f */
    public boolean mo4650f() {
        return this.f4620e.readInt() != 0;
    }

    /* renamed from: g */
    public byte[] mo4651g() {
        int readInt = this.f4620e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4620e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: h */
    public CharSequence mo4652h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4620e);
    }

    /* renamed from: i */
    public boolean mo4653i(int i) {
        while (this.f4625j < this.f4622g) {
            int i2 = this.f4626k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4620e.setDataPosition(this.f4625j);
            int readInt = this.f4620e.readInt();
            this.f4626k = this.f4620e.readInt();
            this.f4625j += readInt;
        }
        return this.f4626k == i;
    }

    /* renamed from: j */
    public int mo4654j() {
        return this.f4620e.readInt();
    }

    /* renamed from: l */
    public <T extends Parcelable> T mo4656l() {
        return this.f4620e.readParcelable(C1209uf.class.getClassLoader());
    }

    /* renamed from: n */
    public String mo4658n() {
        return this.f4620e.readString();
    }

    /* renamed from: p */
    public void mo4660p(int i) {
        mo4645a();
        this.f4624i = i;
        this.f4619d.put(i, this.f4620e.dataPosition());
        this.f4620e.writeInt(0);
        this.f4620e.writeInt(i);
    }

    /* renamed from: q */
    public void mo4661q(boolean z) {
        this.f4620e.writeInt(z ? 1 : 0);
    }

    /* renamed from: r */
    public void mo4662r(byte[] bArr) {
        if (bArr != null) {
            this.f4620e.writeInt(bArr.length);
            this.f4620e.writeByteArray(bArr);
            return;
        }
        this.f4620e.writeInt(-1);
    }

    /* renamed from: s */
    public void mo4663s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4620e, 0);
    }

    /* renamed from: t */
    public void mo4664t(int i) {
        this.f4620e.writeInt(i);
    }

    /* renamed from: u */
    public void mo4665u(Parcelable parcelable) {
        this.f4620e.writeParcelable(parcelable, 0);
    }

    /* renamed from: v */
    public void mo4666v(String str) {
        this.f4620e.writeString(str);
    }
}
