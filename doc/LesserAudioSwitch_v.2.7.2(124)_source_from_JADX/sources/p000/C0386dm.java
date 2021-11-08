package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: dm */
public class C0386dm {

    /* renamed from: c */
    public static C0386dm f1909c;

    /* renamed from: a */
    public final Object f1910a = new Object();

    /* renamed from: b */
    public final Handler f1911b = new Handler(Looper.getMainLooper(), new C0387a());

    /* renamed from: dm$a */
    public class C0387a implements Handler.Callback {
        public C0387a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0386dm dmVar = C0386dm.this;
            C0388b bVar = (C0388b) message.obj;
            synchronized (dmVar.f1910a) {
                if (bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: dm$b */
    public static class C0388b {
    }
}
