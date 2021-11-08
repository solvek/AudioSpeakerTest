package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: rj */
public final class C1064rj implements Comparable<C1064rj>, Parcelable {
    public static final Parcelable.Creator<C1064rj> CREATOR = new C1065a();

    /* renamed from: b */
    public final Calendar f3966b;

    /* renamed from: c */
    public final String f3967c;

    /* renamed from: d */
    public final int f3968d;

    /* renamed from: e */
    public final int f3969e;

    /* renamed from: f */
    public final int f3970f;

    /* renamed from: g */
    public final int f3971g;

    /* renamed from: h */
    public final long f3972h;

    /* renamed from: rj$a */
    public static class C1065a implements Parcelable.Creator<C1064rj> {
        public Object createFromParcel(Parcel parcel) {
            return C1064rj.m3027k(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new C1064rj[i];
        }
    }

    public C1064rj(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = C1463zj.m3971b(calendar);
        this.f3966b = b;
        this.f3968d = b.get(2);
        this.f3969e = b.get(1);
        this.f3970f = b.getMaximum(7);
        this.f3971g = b.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(C1463zj.m3972c());
        this.f3967c = simpleDateFormat.format(b.getTime());
        this.f3972h = b.getTimeInMillis();
    }

    /* renamed from: k */
    public static C1064rj m3027k(int i, int i2) {
        Calendar e = C1463zj.m3974e();
        e.set(1, i);
        e.set(2, i2);
        return new C1064rj(e);
    }

    /* renamed from: l */
    public static C1064rj m3028l(long j) {
        Calendar e = C1463zj.m3974e();
        e.setTimeInMillis(j);
        return new C1064rj(e);
    }

    /* renamed from: m */
    public static C1064rj m3029m() {
        return new C1064rj(C1463zj.m3973d());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1064rj)) {
            return false;
        }
        C1064rj rjVar = (C1064rj) obj;
        return this.f3968d == rjVar.f3968d && this.f3969e == rjVar.f3969e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3968d), Integer.valueOf(this.f3969e)});
    }

    /* renamed from: j */
    public int compareTo(C1064rj rjVar) {
        return this.f3966b.compareTo(rjVar.f3966b);
    }

    /* renamed from: n */
    public int mo4263n() {
        int firstDayOfWeek = this.f3966b.get(7) - this.f3966b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3970f : firstDayOfWeek;
    }

    /* renamed from: o */
    public C1064rj mo4264o(int i) {
        Calendar b = C1463zj.m3971b(this.f3966b);
        b.add(2, i);
        return new C1064rj(b);
    }

    /* renamed from: p */
    public int mo4265p(C1064rj rjVar) {
        if (this.f3966b instanceof GregorianCalendar) {
            return (rjVar.f3968d - this.f3968d) + ((rjVar.f3969e - this.f3969e) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3969e);
        parcel.writeInt(this.f3968d);
    }
}
