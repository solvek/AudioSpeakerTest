package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: gu */
public class C0550gu {

    /* renamed from: a */
    public static final Handler f2417a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m1819a(String str, String str2) {
        C0438eu.m1612a(str + ": " + str2);
    }

    /* renamed from: b */
    public static void m1820b(String str, String str2) {
        C0438eu.m1612a(str + ": " + str2);
    }

    /* renamed from: c */
    public static void m1821c(Throwable th) {
        th.printStackTrace();
        C0438eu.m1612a("LogWrap: " + th.toString());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            C0438eu.m1612a(stackTraceElement.toString());
        }
    }

    /* renamed from: d */
    public static void m1822d(String str, String str2) {
        f2417a.post(new C1184tt(str, str2));
    }
}
