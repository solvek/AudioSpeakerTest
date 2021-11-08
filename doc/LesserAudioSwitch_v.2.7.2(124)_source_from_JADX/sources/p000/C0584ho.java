package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ho */
public class C0584ho {

    /* renamed from: a */
    public static Method f2489a;

    /* renamed from: ho$a */
    public enum C0585a {
        ROLE_NONE(0, "N/A"),
        ROLE_SOURCE(1, "SRC"),
        ROLE_SINK(2, "SNK"),
        ROLE_SESSION(3, "SES"),
        ROLE_OTHER(999, "OTH");
        

        /* renamed from: b */
        public String f2496b;

        /* access modifiers changed from: public */
        C0585a(int i, String str) {
            this.f2496b = str;
        }
    }

    /* renamed from: ho$b */
    public interface C0586b {
        /* renamed from: a */
        int mo3098a();

        /* renamed from: b */
        String mo3099b();

        /* renamed from: c */
        CharSequence mo3100c();

        /* renamed from: d */
        C0585a mo3101d();
    }

    /* renamed from: ho$c */
    public static class C0587c implements C0586b {

        /* renamed from: a */
        public AudioDeviceInfo f2497a;

        public C0587c(AudioDeviceInfo audioDeviceInfo) {
            this.f2497a = audioDeviceInfo;
        }

        /* renamed from: a */
        public int mo3098a() {
            return this.f2497a.getType();
        }

        /* renamed from: b */
        public String mo3099b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return this.f2497a.getAddress();
            }
            if (i >= 23) {
                try {
                    return (String) C0584ho.f2489a.invoke(this.f2497a, new Object[0]);
                } catch (Exception e) {
                    C0550gu.m1819a("LAS ADIWrapper", "Problem getting device address via M+ reflection");
                    C0550gu.m1821c(e);
                }
            }
            return null;
        }

        /* renamed from: c */
        public CharSequence mo3100c() {
            return this.f2497a.getProductName();
        }

        /* renamed from: d */
        public C0585a mo3101d() {
            return this.f2497a.isSink() ? C0585a.ROLE_SINK : this.f2497a.isSource() ? C0585a.ROLE_SOURCE : C0585a.ROLE_NONE;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" Name: ");
            stringBuffer.append(mo3100c());
            stringBuffer.append(", Role: ");
            stringBuffer.append(mo3101d());
            stringBuffer.append(", Address: ");
            stringBuffer.append(mo3099b());
            stringBuffer.append(", Type: ");
            stringBuffer.append(mo3098a());
            stringBuffer.append(" (Hex ");
            stringBuffer.append(Integer.toHexString(mo3098a()));
            stringBuffer.append(" )");
            return stringBuffer.toString();
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Method a = C0431en.m1604a(AudioDeviceInfo.class.getDeclaredMethods(), "getAddress");
                f2489a = a;
                if (a != null) {
                    a.setAccessible(true);
                }
            }
        } catch (Exception e) {
            C0550gu.m1821c(e);
        }
    }

    /* renamed from: a */
    public static List<C0586b> m1883a(AudioManager audioManager) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23) {
            for (AudioDeviceInfo cVar : audioManager.getDevices(3)) {
                arrayList.add(new C0587c(cVar));
            }
        }
        return arrayList;
    }
}
