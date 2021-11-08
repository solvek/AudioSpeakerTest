package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/* renamed from: eu */
public class C0438eu {

    /* renamed from: a */
    public static LinkedList<String> f2043a = new LinkedList<>();

    /* renamed from: b */
    public static ArrayList<C0439a> f2044b = new ArrayList<>();

    /* renamed from: eu$a */
    public interface C0439a {
        /* renamed from: a */
        void mo2743a(String str);
    }

    /* renamed from: a */
    public static synchronized void m1612a(String str) {
        synchronized (C0438eu.class) {
            synchronized (f2043a) {
                String str2 = DateFormat.format("MM-dd hh:mm:ss", new Date()).toString() + ": " + str;
                f2043a.add(str2);
                if (f2043a.size() > 500) {
                    f2043a.removeFirst();
                }
                ArrayList<C0439a> arrayList = f2044b;
                if (arrayList != null && !arrayList.isEmpty()) {
                    new Handler(Looper.getMainLooper()).post(new C1135st(str2));
                }
            }
        }
    }
}
