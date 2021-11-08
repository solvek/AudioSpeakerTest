package p000;

import java.lang.reflect.Method;

/* renamed from: v5 */
public class C1238v5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f4768b;

    /* renamed from: c */
    public final /* synthetic */ Object f4769c;

    public C1238v5(Object obj, Object obj2) {
        this.f4768b = obj;
        this.f4769c = obj2;
    }

    public void run() {
        try {
            Method method = C1293w5.f4919d;
            if (method != null) {
                method.invoke(this.f4768b, new Object[]{this.f4769c, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            C1293w5.f4920e.invoke(this.f4768b, new Object[]{this.f4769c, Boolean.FALSE});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
