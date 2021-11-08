package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: zi */
public final class C1459zi implements Parcelable {
    public static final Parcelable.Creator<C1459zi> CREATOR = new C1460a();

    /* renamed from: b */
    public final C1064rj f5315b;

    /* renamed from: c */
    public final C1064rj f5316c;

    /* renamed from: d */
    public final C1064rj f5317d;

    /* renamed from: e */
    public final C1462c f5318e;

    /* renamed from: f */
    public final int f5319f;

    /* renamed from: g */
    public final int f5320g;

    /* renamed from: zi$a */
    public static class C1460a implements Parcelable.Creator<C1459zi> {
        public Object createFromParcel(Parcel parcel) {
            return new C1459zi((C1064rj) parcel.readParcelable(C1064rj.class.getClassLoader()), (C1064rj) parcel.readParcelable(C1064rj.class.getClassLoader()), (C1064rj) parcel.readParcelable(C1064rj.class.getClassLoader()), (C1462c) parcel.readParcelable(C1462c.class.getClassLoader()), (C1460a) null);
        }

        public Object[] newArray(int i) {
            return new C1459zi[i];
        }
    }

    /* renamed from: zi$b */
    public static final class C1461b {

        /* renamed from: e */
        public static final long f5321e = C1463zj.m3970a(C1064rj.m3027k(1900, 0).f3972h);

        /* renamed from: f */
        public static final long f5322f = C1463zj.m3970a(C1064rj.m3027k(2100, 11).f3972h);

        /* renamed from: a */
        public long f5323a = f5321e;

        /* renamed from: b */
        public long f5324b = f5322f;

        /* renamed from: c */
        public Long f5325c;

        /* renamed from: d */
        public C1462c f5326d = new C0381dj(Long.MIN_VALUE);

        public C1461b(C1459zi ziVar) {
            this.f5323a = ziVar.f5315b.f3972h;
            this.f5324b = ziVar.f5316c.f3972h;
            this.f5325c = Long.valueOf(ziVar.f5317d.f3972h);
            this.f5326d = ziVar.f5318e;
        }
    }

    /* renamed from: zi$c */
    public interface C1462c extends Parcelable {
        /* renamed from: i */
        boolean mo2664i(long j);
    }

    public C1459zi(C1064rj rjVar, C1064rj rjVar2, C1064rj rjVar3, C1462c cVar, C1460a aVar) {
        this.f5315b = rjVar;
        this.f5316c = rjVar2;
        this.f5317d = rjVar3;
        this.f5318e = cVar;
        if (rjVar.f3966b.compareTo(rjVar3.f3966b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (rjVar3.f3966b.compareTo(rjVar2.f3966b) <= 0) {
            this.f5320g = rjVar.mo4265p(rjVar2) + 1;
            this.f5319f = (rjVar2.f3969e - rjVar.f3969e) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1459zi)) {
            return false;
        }
        C1459zi ziVar = (C1459zi) obj;
        return this.f5315b.equals(ziVar.f5315b) && this.f5316c.equals(ziVar.f5316c) && this.f5317d.equals(ziVar.f5317d) && this.f5318e.equals(ziVar.f5318e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5315b, this.f5316c, this.f5317d, this.f5318e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5315b, 0);
        parcel.writeParcelable(this.f5316c, 0);
        parcel.writeParcelable(this.f5317d, 0);
        parcel.writeParcelable(this.f5318e, 0);
    }
}
