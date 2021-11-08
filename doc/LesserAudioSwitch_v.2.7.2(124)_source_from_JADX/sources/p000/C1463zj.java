package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zj */
public class C1463zj {

    /* renamed from: a */
    public static AtomicReference<C1420yj> f5327a = new AtomicReference<>();

    /* renamed from: a */
    public static long m3970a(long j) {
        Calendar e = m3974e();
        e.setTimeInMillis(j);
        return m3971b(e).getTimeInMillis();
    }

    /* renamed from: b */
    public static Calendar m3971b(Calendar calendar) {
        Calendar f = m3975f(calendar);
        Calendar e = m3974e();
        e.set(f.get(1), f.get(2), f.get(5));
        return e;
    }

    /* renamed from: c */
    public static TimeZone m3972c() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: d */
    public static Calendar m3973d() {
        C1420yj yjVar = f5327a.get();
        if (yjVar == null) {
            yjVar = C1420yj.f5201c;
        }
        TimeZone timeZone = yjVar.f5203b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = yjVar.f5202a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(m3972c());
        return instance;
    }

    /* renamed from: e */
    public static Calendar m3974e() {
        return m3975f((Calendar) null);
    }

    /* renamed from: f */
    public static Calendar m3975f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m3972c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
