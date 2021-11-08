package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: zf */
public class C1455zf extends C1416yf {

    /* renamed from: a */
    public int f5291a;

    /* renamed from: b */
    public final String f5292b;

    /* renamed from: c */
    public final Handler f5293c;

    /* renamed from: d */
    public C1061rg f5294d;

    /* renamed from: e */
    public Context f5295e;

    /* renamed from: f */
    public C0379dh f5296f;

    /* renamed from: g */
    public C1456a f5297g;

    /* renamed from: h */
    public boolean f5298h;

    /* renamed from: i */
    public boolean f5299i;

    /* renamed from: j */
    public boolean f5300j;

    /* renamed from: k */
    public boolean f5301k;

    /* renamed from: l */
    public boolean f5302l;

    /* renamed from: m */
    public boolean f5303m;

    /* renamed from: n */
    public boolean f5304n;

    /* renamed from: o */
    public ExecutorService f5305o;

    /* renamed from: p */
    public final ResultReceiver f5306p;

    /* renamed from: zf$a */
    public final class C1456a implements ServiceConnection {

        /* renamed from: a */
        public final Object f5307a = new Object();

        /* renamed from: b */
        public boolean f5308b = false;

        /* renamed from: c */
        public C0024ag f5309c;

        public C1456a(C0024ag agVar, C1210ug ugVar) {
            this.f5309c = agVar;
        }

        /* renamed from: a */
        public static void m3967a(C1456a aVar, C0277cg cgVar) {
            C1455zf.m3962d(C1455zf.this, new C0727kg(aVar, cgVar));
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            /*
                r3 = this;
                int r4 = p000.C0423eh.f2000a
                java.lang.String r4 = "BillingClient"
                r0 = 2
                android.util.Log.isLoggable(r4, r0)
                zf r4 = p000.C1455zf.this
                int r0 = p000.C0536gh.f2326a
                if (r5 != 0) goto L_0x0010
                r5 = 0
                goto L_0x0024
            L_0x0010:
                java.lang.String r0 = "com.android.vending.billing.IInAppBillingService"
                android.os.IInterface r0 = r5.queryLocalInterface(r0)
                boolean r1 = r0 instanceof p000.C0379dh
                if (r1 == 0) goto L_0x001e
                r5 = r0
                dh r5 = (p000.C0379dh) r5
                goto L_0x0024
            L_0x001e:
                fh r0 = new fh
                r0.<init>(r5)
                r5 = r0
            L_0x0024:
                r4.f5296f = r5
                zf r4 = p000.C1455zf.this
                mg r5 = new mg
                r5.<init>(r3)
                lg r0 = new lg
                r0.<init>(r3)
                r1 = 30000(0x7530, double:1.4822E-319)
                java.util.concurrent.Future r4 = r4.mo5292c(r5, r1, r0)
                if (r4 != 0) goto L_0x004a
                zf r4 = p000.C1455zf.this
                cg r4 = r4.mo5293e()
                zf r5 = p000.C1455zf.this
                kg r0 = new kg
                r0.<init>(r3, r4)
                p000.C1455zf.m3962d(r5, r0)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1455zf.C1456a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            int i = C0423eh.f2000a;
            Log.isLoggable("BillingClient", 5);
            C1455zf zfVar = C1455zf.this;
            zfVar.f5296f = null;
            zfVar.f5291a = 0;
            synchronized (this.f5307a) {
                C0024ag agVar = this.f5309c;
                if (agVar != null) {
                    C1468zo zoVar = (C1468zo) agVar;
                    zoVar.getClass();
                    C0200av.m970a(-40994146178220L);
                    C0200av.m970a(-41075750556844L);
                    zoVar.f5339c = false;
                    zoVar.f5345i.mo3649e();
                    zoVar.f5338b = false;
                    zoVar.f5346j.mo3648d(zoVar);
                }
            }
        }
    }

    public C1455zf(boolean z, Context context, C0378dg dgVar) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            str = "3.0.0";
        }
        this.f5291a = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f5293c = handler;
        this.f5306p = new C1210ug(this, handler);
        this.f5292b = str;
        Context applicationContext = context.getApplicationContext();
        this.f5295e = applicationContext;
        this.f5294d = new C1061rg(applicationContext, dgVar);
        this.f5304n = z;
    }

    /* renamed from: d */
    public static void m3962d(C1455zf zfVar, Runnable runnable) {
        zfVar.getClass();
        if (!Thread.interrupted()) {
            zfVar.f5293c.post(runnable);
        }
    }

    /* renamed from: a */
    public boolean mo5290a() {
        return (this.f5291a != 2 || this.f5296f == null || this.f5297g == null) ? false : true;
    }

    /* renamed from: b */
    public final C0277cg mo5291b(C0277cg cgVar) {
        ((C1468zo) this.f5294d.f3959b.f4255a).mo5310g(cgVar, (List<Purchase>) null);
        return cgVar;
    }

    /* renamed from: c */
    public final <T> Future<T> mo5292c(Callable<T> callable, long j, Runnable runnable) {
        double d = (double) j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.f5305o == null) {
            this.f5305o = Executors.newFixedThreadPool(C0423eh.f2000a);
        }
        try {
            Future<T> submit = this.f5305o.submit(callable);
            this.f5293c.postDelayed(new C0025ah(submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String.valueOf(e).length();
            int i = C0423eh.f2000a;
            Log.isLoggable("BillingClient", 5);
            return null;
        }
    }

    /* renamed from: e */
    public final C0277cg mo5293e() {
        int i = this.f5291a;
        return (i == 0 || i == 3) ? C0977pg.f3637l : C0977pg.f3635j;
    }
}
