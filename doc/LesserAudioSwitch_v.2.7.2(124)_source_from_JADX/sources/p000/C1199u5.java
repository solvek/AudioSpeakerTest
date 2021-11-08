package p000;

import android.app.Application;
import p000.C1293w5;

/* renamed from: u5 */
public class C1199u5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Application f4604b;

    /* renamed from: c */
    public final /* synthetic */ C1293w5.C1294a f4605c;

    public C1199u5(Application application, C1293w5.C1294a aVar) {
        this.f4604b = application;
        this.f4605c = aVar;
    }

    public void run() {
        this.f4604b.unregisterActivityLifecycleCallbacks(this.f4605c);
    }
}
