package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.nordskog.LesserAudioSwitch.R;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C0396du;
import p000.C0901o;
import p000.C1455zf;

/* renamed from: zo */
public class C1468zo implements C0024ag, C0378dg, C0422eg {

    /* renamed from: r */
    public static final Handler f5332r = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    public static C1468zo f5333s = null;

    /* renamed from: t */
    public static final Set<Object> f5334t = new HashSet();

    /* renamed from: u */
    public static Runnable f5335u = new C1469a();

    /* renamed from: v */
    public static C1472d f5336v = null;

    /* renamed from: a */
    public C1416yf f5337a;

    /* renamed from: b */
    public boolean f5338b = false;

    /* renamed from: c */
    public boolean f5339c = false;

    /* renamed from: d */
    public boolean f5340d = false;

    /* renamed from: e */
    public Map<String, SkuDetails> f5341e = new HashMap();

    /* renamed from: f */
    public List<C0231bp> f5342f = new ArrayList();

    /* renamed from: g */
    public Map<String, C0231bp> f5343g = new HashMap();

    /* renamed from: h */
    public Context f5344h;

    /* renamed from: i */
    public C0796lu<C1468zo> f5345i = new C0796lu<>();

    /* renamed from: j */
    public C0796lu<C1468zo> f5346j = new C0796lu<>();

    /* renamed from: k */
    public C0796lu<C1468zo> f5347k = new C0796lu<>();

    /* renamed from: l */
    public C0796lu<C0490fp> f5348l = new C0796lu<>();

    /* renamed from: m */
    public C0396du<C1468zo> f5349m = new C0396du<>();

    /* renamed from: n */
    public C0796lu<C1468zo> f5350n = new C0796lu<>();

    /* renamed from: o */
    public C0796lu<C0490fp> f5351o = new C0796lu<>();

    /* renamed from: p */
    public C0796lu<C0490fp> f5352p = new C0796lu<>();

    /* renamed from: q */
    public C0796lu<C0490fp> f5353q = new C0796lu<>();

    /* renamed from: zo$a */
    public static class C1469a implements Runnable {
        public void run() {
            if ((C1468zo.f5333s != null) && C1468zo.f5334t.isEmpty()) {
                C1468zo zoVar = C1468zo.f5333s;
                if (!zoVar.f5338b) {
                    zoVar.getClass();
                    C0200av.m970a(-40422915527852L);
                    C0200av.m970a(-40504519906476L);
                    zoVar.f5339c = false;
                    zoVar.f5345i.mo3649e();
                    zoVar.f5346j.mo3648d(zoVar);
                    C1416yf yfVar = zoVar.f5337a;
                    if (yfVar != null) {
                        C1455zf zfVar = (C1455zf) yfVar;
                        try {
                            zfVar.f5294d.mo4255a();
                            C1455zf.C1456a aVar = zfVar.f5297g;
                            if (aVar != null) {
                                synchronized (aVar.f5307a) {
                                    aVar.f5309c = null;
                                    aVar.f5308b = true;
                                }
                            }
                            if (!(zfVar.f5297g == null || zfVar.f5296f == null)) {
                                int i = C0423eh.f2000a;
                                Log.isLoggable("BillingClient", 2);
                                zfVar.f5295e.unbindService(zfVar.f5297g);
                                zfVar.f5297g = null;
                            }
                            zfVar.f5296f = null;
                            ExecutorService executorService = zfVar.f5305o;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                zfVar.f5305o = null;
                            }
                        } catch (Exception e) {
                            try {
                                String.valueOf(e).length();
                                int i2 = C0423eh.f2000a;
                                Log.isLoggable("BillingClient", 5);
                            } catch (Throwable th) {
                                zfVar.f5291a = 3;
                                throw th;
                            }
                        }
                        zfVar.f5291a = 3;
                    }
                    zoVar.f5338b = false;
                    C1468zo.f5333s = null;
                }
            }
        }
    }

    /* renamed from: zo$b */
    public class C1470b implements C1363xf {

        /* renamed from: a */
        public final /* synthetic */ C1472d f5354a;

        /* renamed from: b */
        public final /* synthetic */ Purchase f5355b;

        public C1470b(C1472d dVar, Purchase purchase) {
            this.f5354a = dVar;
            this.f5355b = purchase;
        }

        /* renamed from: a */
        public void mo5316a(C0277cg cgVar) {
            String str;
            String str2;
            byte hashCode;
            C1472d dVar = this.f5354a;
            boolean z = true;
            dVar.f5358b = true;
            if (cgVar.f1384a == 0) {
                dVar.f5357a = true;
                Context context = C1468zo.this.f5344h;
                String c = this.f5355b.mo1799c();
                Purchase purchase = this.f5355b;
                String str3 = purchase.f1408a;
                String str4 = purchase.f1409b;
                if (purchase.mo1797a() != 1) {
                    z = false;
                }
                int i = C1425yo.f5206a;
                if (!z) {
                    str2 = Integer.toHexString(c.hashCode());
                    str = null;
                } else {
                    StringBuilder c2 = C0279ch.m1106c(str3);
                    c2.append(C0200av.m970a(-37523812603052L));
                    c2.append(str4);
                    c2.append(C0200av.m970a(-37592532079788L));
                    if (C0391dp.f1915a == null) {
                        C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                    }
                    if (C0391dp.f1915a == null) {
                        C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                    }
                    c2.append(C0391dp.f1915a);
                    c2.append(C0200av.m970a(-37661251556524L));
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str4);
                    if (C0391dp.f1915a == null) {
                        C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                    }
                    if (C0391dp.f1915a == null) {
                        C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                    }
                    sb.append(C0391dp.f1915a);
                    c2.append(Integer.toHexString(sb.toString().hashCode()));
                    str2 = Integer.toHexString(c.hashCode());
                    str = c2.toString();
                    if (str != null && !str.isEmpty()) {
                        byte[] bytes = str.isEmpty() ? new byte[0] : Build.VERSION.SDK_INT >= 19 ? str.getBytes(StandardCharsets.UTF_8) : str.getBytes();
                        if (C0391dp.f1915a == null) {
                            C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                        }
                        if (C0391dp.f1915a == null) {
                            C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                        }
                        String str5 = C0391dp.f1915a;
                        byte b = 5;
                        if (!(str5 == null || str5.isEmpty() || (hashCode = (byte) str5.hashCode()) == 0)) {
                            b = hashCode;
                        }
                        C0495fu.m1724a(bytes);
                        byte[] bArr = new byte[bytes.length];
                        for (int i2 = 0; i2 < bytes.length; i2++) {
                            int i3 = bytes[i2] + b;
                            if (i3 > 127) {
                                i3 -= 256;
                            } else if (i3 < -128) {
                                i3 += 256;
                            }
                            bArr[i2] = (byte) i3;
                        }
                        C0495fu.m1724a(bArr);
                        str = Base64.encodeToString(bArr, 0);
                    }
                }
                SharedPreferences.Editor edit = context.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).edit();
                edit.putString(str2, str);
                edit.apply();
                C0550gu.m1822d(C0200av.m970a(-38331266454700L), C0200av.m970a(-38412870833324L) + this.f5355b.mo1798b());
            } else if (!dVar.f5357a) {
                C0550gu.m1822d(C0200av.m970a(-38477295342764L), C0200av.m970a(-38558899721388L) + this.f5355b.mo1798b());
                C0550gu.m1822d(C0200av.m970a(-38649094034604L), C1468zo.this.mo5314l(cgVar));
            } else {
                C0550gu.m1822d(C0200av.m970a(-38730698413228L), C0200av.m970a(-38812302791852L) + this.f5355b.mo1798b());
                return;
            }
            C1468zo zoVar = C1468zo.this;
            zoVar.f5350n.mo3645a(zoVar);
        }
    }

    /* renamed from: zo$c */
    public static class C1471c implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: zo$d */
    public static class C1472d {

        /* renamed from: a */
        public boolean f5357a = false;

        /* renamed from: b */
        public boolean f5358b = false;

        /* renamed from: c */
        public String f5359c = C0200av.m970a(-39018461222060L);

        /* renamed from: d */
        public long f5360d = 0;

        public C1472d(String str) {
            this.f5359c = str;
            this.f5360d = System.currentTimeMillis();
        }
    }

    static {
        C0200av.m970a(-54630667343020L);
        C0200av.m970a(-54712271721644L);
        C0200av.m970a(-54841120740524L);
        C0200av.m970a(-54974264726700L);
    }

    public C1468zo(Context context, List<String> list) {
        this.f5344h = context.getApplicationContext();
        int i = C0231bp.f1289c;
        ArrayList arrayList = new ArrayList(list.size());
        for (String bpVar : list) {
            arrayList.add(new C0231bp(bpVar));
        }
        this.f5342f = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0231bp bpVar2 = (C0231bp) it.next();
            this.f5343g.put(bpVar2.f1290a, bpVar2);
        }
    }

    /* renamed from: d */
    public static void m3976d(Context context, int i) {
        C0901o.C0902a aVar = new C0901o.C0902a(context);
        aVar.mo3819d(R.string.iap_dialog_error_title);
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f195f = bVar.f190a.getText(i);
        aVar.mo3818c(R.string.button_understood, new C1471c());
        aVar.mo3816a().show();
    }

    /* renamed from: e */
    public static C1468zo m3977e(Context context, Object obj) {
        C1468zo zoVar;
        Set<Object> set = f5334t;
        synchronized (set) {
            int size = set.size();
            set.add(obj);
            C0200av.m970a(-39044231025836L);
            C0200av.m970a(-39125835404460L);
            set.size();
            f5332r.removeCallbacks(f5335u);
            if (f5333s == null) {
                String str = C1384xo.f5119a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(C1384xo.f5119a);
                arrayList.add(C1384xo.f5122d);
                arrayList.add(C1384xo.f5121c);
                f5333s = new C1468zo(context, arrayList);
            }
            if (set.size() != size) {
                C0200av.m970a(-39211734750380L);
                C0200av.m970a(-39293339129004L);
                obj.toString();
            }
            zoVar = f5333s;
        }
        return zoVar;
    }

    /* renamed from: k */
    public static void m3978k(Object obj) {
        Set<Object> set = f5334t;
        synchronized (set) {
            set.remove(obj);
            C0200av.m970a(-39387828409516L);
            C0200av.m970a(-39469432788140L);
            set.size();
            if (f5333s != null && set.isEmpty()) {
                C0200av.m970a(-39555332134060L);
                C0200av.m970a(-39636936512684L);
                f5332r.postDelayed(f5335u, 5000);
            }
        }
    }

    /* renamed from: a */
    public final void mo5306a(Purchase purchase, boolean z) {
        C0277cg cgVar;
        byte b;
        Purchase purchase2 = purchase;
        boolean z2 = true;
        if (purchase2.f1410c.optBoolean("acknowledged", true)) {
            C0550gu.m1822d(C0200av.m970a(-52328564872364L), C0200av.m970a(-52410169250988L) + purchase.mo1798b());
            this.f5350n.mo3645a(this);
            return;
        }
        C1472d dVar = f5336v;
        if (dVar != null) {
            String b2 = purchase.mo1798b();
            if (dVar.f5360d <= System.currentTimeMillis() - 1500 || !b2.equals(dVar.f5359c)) {
                z2 = false;
            }
            if (z2) {
                C0200av.m970a(-52547608204460L);
                C0200av.m970a(-52629212583084L);
                return;
            }
        }
        C1472d dVar2 = new C1472d(purchase.mo1798b());
        f5336v = dVar2;
        String b3 = purchase.mo1798b();
        Context context = this.f5344h;
        String c = purchase.mo1799c();
        String str = purchase2.f1408a;
        String str2 = purchase2.f1409b;
        int i = C1425yo.f5206a;
        StringBuilder c2 = C0279ch.m1106c(str);
        c2.append(C0200av.m970a(-37523812603052L));
        c2.append(str2);
        c2.append(C0200av.m970a(-37592532079788L));
        if (C0391dp.f1915a == null) {
            C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
        }
        if (C0391dp.f1915a == null) {
            C0391dp.f1915a = C0200av.m970a(-70526341305516L);
        }
        c2.append(C0391dp.f1915a);
        c2.append(C0200av.m970a(-37661251556524L));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        if (C0391dp.f1915a == null) {
            C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
        }
        if (C0391dp.f1915a == null) {
            C0391dp.f1915a = C0200av.m970a(-70526341305516L);
        }
        sb.append(C0391dp.f1915a);
        c2.append(Integer.toHexString(sb.toString().hashCode()));
        String hexString = Integer.toHexString(c.hashCode());
        String sb2 = c2.toString();
        if (sb2 != null && !sb2.isEmpty()) {
            byte[] bytes = sb2.isEmpty() ? new byte[0] : Build.VERSION.SDK_INT >= 19 ? sb2.getBytes(StandardCharsets.UTF_8) : sb2.getBytes();
            if (C0391dp.f1915a == null) {
                C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
            }
            if (C0391dp.f1915a == null) {
                C0391dp.f1915a = C0200av.m970a(-70526341305516L);
            }
            String str3 = C0391dp.f1915a;
            if (str3 == null || str3.isEmpty() || (b = (byte) str3.hashCode()) == 0) {
                b = 5;
            }
            C0495fu.m1724a(bytes);
            byte[] bArr = new byte[bytes.length];
            for (int i2 = 0; i2 < bytes.length; i2++) {
                int i3 = bytes[i2] + b;
                if (i3 > 127) {
                    i3 -= 256;
                } else if (i3 < -128) {
                    i3 += 256;
                }
                bArr[i2] = (byte) i3;
            }
            C0495fu.m1724a(bArr);
            sb2 = Base64.encodeToString(bArr, 0);
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).edit();
        edit.putString(hexString, sb2);
        edit.apply();
        C0550gu.m1822d(C0200av.m970a(-52727996830892L), C0200av.m970a(-52809601209516L) + purchase.mo1798b());
        if (z) {
            f5332r.postDelayed(new C1222uo(this, dVar2, purchase2), 3000);
        }
        C1416yf yfVar = this.f5337a;
        if (b3 != null) {
            C1310wf wfVar = new C1310wf((C0470fg) null);
            wfVar.f4957a = b3;
            C1470b bVar = new C1470b(dVar2, purchase2);
            C1455zf zfVar = (C1455zf) yfVar;
            if (!zfVar.mo5290a()) {
                cgVar = C0977pg.f3637l;
            } else if (TextUtils.isEmpty(wfVar.f4957a)) {
                int i4 = C0423eh.f2000a;
                Log.isLoggable("BillingClient", 5);
                cgVar = C0977pg.f3634i;
            } else if (!zfVar.f5301k) {
                cgVar = C0977pg.f3627b;
            } else if (zfVar.mo5292c(new C1364xg(zfVar, wfVar, bVar), 30000, new C0222bh(bVar)) == null) {
                cgVar = zfVar.mo5293e();
            } else {
                return;
            }
            bVar.mo5316a(cgVar);
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    /* renamed from: b */
    public void mo5307b(Object obj) {
        this.f5345i.mo3648d(obj);
        this.f5346j.mo3648d(obj);
        this.f5348l.mo3648d(obj);
        this.f5347k.mo3648d(obj);
        C0396du<C1468zo> duVar = this.f5349m;
        Iterator<C0593hu<Object, C0396du.C0397a<T>>> it = duVar.f1921a.iterator();
        while (it.hasNext()) {
            if (it.next().f2504a == obj) {
                it.remove();
            }
        }
        Iterator<C0593hu<Object, C0396du.C0397a<T>>> it2 = duVar.f1922b.iterator();
        while (it2.hasNext()) {
            if (it2.next().f2504a == obj) {
                it2.remove();
            }
        }
        this.f5350n.mo3648d(obj);
        this.f5351o.mo3648d(obj);
        this.f5352p.mo3648d(obj);
        this.f5353q.mo3648d(obj);
    }

    /* renamed from: c */
    public final void mo5308c() {
        C0277cg cgVar;
        ServiceInfo serviceInfo;
        long j;
        if (this.f5338b) {
            C0200av.m970a(-39774375466156L);
            j = -39855979844780L;
        } else if (this.f5339c) {
            C0200av.m970a(-40036368471212L);
            j = -40117972849836L;
        } else {
            Context context = this.f5344h;
            if (context != null) {
                this.f5337a = new C1455zf(true, context, this);
                this.f5338b = true;
                C0200av.m970a(-40294066508972L);
                C0200av.m970a(-40375670887596L);
                C1455zf zfVar = (C1455zf) this.f5337a;
                if (zfVar.mo5290a()) {
                    int i = C0423eh.f2000a;
                    Log.isLoggable("BillingClient", 2);
                    cgVar = C0977pg.f3636k;
                } else {
                    int i2 = zfVar.f5291a;
                    if (i2 == 1) {
                        int i3 = C0423eh.f2000a;
                        Log.isLoggable("BillingClient", 5);
                        cgVar = C0977pg.f3629d;
                    } else if (i2 == 3) {
                        int i4 = C0423eh.f2000a;
                        Log.isLoggable("BillingClient", 5);
                        cgVar = C0977pg.f3637l;
                    } else {
                        zfVar.f5291a = 1;
                        C1061rg rgVar = zfVar.f5294d;
                        C1120sg sgVar = rgVar.f3959b;
                        Context context2 = rgVar.f3958a;
                        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                        if (!sgVar.f4256b) {
                            context2.registerReceiver(sgVar.f4257c.f3959b, intentFilter);
                            sgVar.f4256b = true;
                        }
                        int i5 = C0423eh.f2000a;
                        Log.isLoggable("BillingClient", 2);
                        zfVar.f5297g = new C1455zf.C1456a(this, (C1210ug) null);
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = zfVar.f5295e.getPackageManager().queryIntentServices(intent, 0);
                        if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if ("com.android.vending".equals(str) && str2 != null) {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", zfVar.f5292b);
                                if (zfVar.f5295e.bindService(intent2, zfVar.f5297g, 1)) {
                                    Log.isLoggable("BillingClient", 2);
                                    return;
                                }
                            }
                            Log.isLoggable("BillingClient", 5);
                        }
                        zfVar.f5291a = 0;
                        Log.isLoggable("BillingClient", 2);
                        cgVar = C0977pg.f3628c;
                    }
                }
                mo5309f(cgVar);
                return;
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        C0200av.m970a(j);
    }

    /* renamed from: f */
    public void mo5309f(C0277cg cgVar) {
        this.f5338b = false;
        if (cgVar.f1384a == 0) {
            C0200av.m970a(-40633368925356L);
            C0200av.m970a(-40714973303980L);
            this.f5339c = true;
            this.f5345i.mo3645a(this);
            return;
        }
        this.f5339c = false;
        String a = C0200av.m970a(-40792282715308L);
        C0550gu.m1822d(a, C0200av.m970a(-40873887093932L) + mo5314l(cgVar));
        this.f5351o.mo3645a(new C0490fp(cgVar));
    }

    /* renamed from: g */
    public void mo5310g(C0277cg cgVar, List<Purchase> list) {
        C0796lu<C0490fp> luVar;
        C0490fp fpVar;
        C0490fp fpVar2;
        C0796lu<C0490fp> luVar2;
        if (cgVar.f1384a != 0) {
            String a = C0200av.m970a(-45903293797548L);
            C0550gu.m1822d(a, C0200av.m970a(-45984898176172L) + mo5314l(cgVar));
            luVar = this.f5348l;
            fpVar = new C0490fp(cgVar);
        } else if (list != null) {
            for (Purchase next : list) {
                C0200av.m970a(-41165944870060L);
                C0200av.m970a(-41247549248684L);
                next.toString();
                if (!C0194ap.m968e(C0200av.m970a(-41294793888940L), next.f1408a, next.f1409b)) {
                    Toast.makeText(this.f5344h, R.string.iap_toast_invalid_purchase_token, 1).show();
                    String a2 = C0200av.m970a(-44116587402412L);
                    C0550gu.m1822d(a2, C0200av.m970a(-44198191781036L) + next.mo1798b());
                    String a3 = C0200av.m970a(-44417235113132L);
                    C0550gu.m1822d(a3, C0200av.m970a(-44498839491756L) + next.f1409b);
                    C0550gu.m1822d(C0200av.m970a(-44550379099308L), C0200av.m970a(-44631983477932L));
                    C0550gu.m1822d(C0200av.m970a(-44662048249004L), next.f1408a);
                    luVar2 = this.f5348l;
                    fpVar2 = new C0490fp(12);
                } else {
                    C0200av.m970a(-44743652627628L);
                    if (C0194ap.m966c(next.f1409b)) {
                        String a4 = C0200av.m970a(-44992760730796L);
                        C0550gu.m1822d(a4, C0200av.m970a(-45074365109420L) + next.mo1798b());
                        String a5 = C0200av.m970a(-45301998376108L);
                        C0550gu.m1822d(a5, C0200av.m970a(-45383602754732L) + next.f1409b);
                        C0550gu.m1822d(C0200av.m970a(-45435142362284L), C0200av.m970a(-45516746740908L));
                        C0550gu.m1822d(C0200av.m970a(-45546811511980L), next.f1408a);
                        luVar2 = this.f5348l;
                        fpVar2 = new C0490fp(13);
                    } else if (next.mo1797a() == 1) {
                        mo5306a(next, true);
                        luVar2 = this.f5348l;
                        fpVar2 = new C0490fp(cgVar);
                    }
                }
                luVar2.mo3645a(fpVar2);
            }
            return;
        } else {
            String a6 = C0200av.m970a(-45628415890604L);
            C0550gu.m1822d(a6, C0200av.m970a(-45710020269228L) + mo5314l(cgVar));
            luVar = this.f5348l;
            fpVar = new C0490fp(cgVar);
        }
        luVar.mo3645a(fpVar);
    }

    /* renamed from: h */
    public void mo5311h(C0277cg cgVar, List<SkuDetails> list) {
        if (cgVar.f1384a == 0) {
            this.f5340d = true;
            C0200av.m970a(-46122337129644L);
            C0200av.m970a(-46203941508268L);
            list.size();
            C0200av.m970a(-46225416344748L);
            for (SkuDetails next : list) {
                C0200av.m970a(-46268366017708L);
                next.toString();
                this.f5341e.put(next.mo1803a(), next);
            }
        } else {
            String a = C0200av.m970a(-46349970396332L);
            C0550gu.m1822d(a, C0200av.m970a(-46431574774956L) + mo5314l(cgVar));
            this.f5352p.mo3645a(new C0490fp(cgVar));
        }
        for (C0231bp next2 : this.f5342f) {
            SkuDetails skuDetails = this.f5341e.get(next2.f1290a);
            if (skuDetails != null) {
                next2.f1291b = skuDetails.f1414b.optString("price");
            } else {
                C0200av.m970a(-69748952224940L);
                C0200av.m970a(-69821966668972L);
                C0200av.m970a(-69847736472748L);
            }
        }
        this.f5346j.mo3645a(this);
    }

    /* renamed from: i */
    public void mo5312i() {
        Purchase.C0288a aVar;
        long j;
        C0348cp cpVar;
        byte b;
        C0490fp fpVar;
        C0796lu<C0490fp> luVar;
        long j2;
        StringBuilder sb;
        String str;
        byte b2;
        if (this.f5339c) {
            C1416yf yfVar = this.f5337a;
            String a = C0200av.m970a(-46577603663020L);
            C1455zf zfVar = (C1455zf) yfVar;
            if (!zfVar.mo5290a()) {
                aVar = new Purchase.C0288a(C0977pg.f3637l, (List<Purchase>) null);
            } else if (TextUtils.isEmpty(a)) {
                int i = C0423eh.f2000a;
                Log.isLoggable("BillingClient", 5);
                aVar = new Purchase.C0288a(C0977pg.f3632g, (List<Purchase>) null);
            } else {
                try {
                    aVar = (Purchase.C0288a) zfVar.mo5292c(new C0630ig(zfVar, a), 5000, (Runnable) null).get(5000, TimeUnit.MILLISECONDS);
                } catch (CancellationException | TimeoutException unused) {
                    aVar = new Purchase.C0288a(C0977pg.f3638m, (List<Purchase>) null);
                } catch (Exception unused2) {
                    aVar = new Purchase.C0288a(C0977pg.f3635j, (List<Purchase>) null);
                }
            }
            C0277cg cgVar = aVar.f1412b;
            if (cgVar.f1384a == 0) {
                List<Purchase> list = aVar.f1411a;
                if (list != null) {
                    C0200av.m970a(-46603373466796L);
                    C0200av.m970a(-46684977845420L);
                    list.size();
                    HashSet hashSet = new HashSet();
                    Iterator<Purchase> it = list.iterator();
                    while (true) {
                        j = -70479096665260L;
                        if (!it.hasNext()) {
                            break;
                        }
                        Purchase next = it.next();
                        if (next.mo1799c().equals(C1384xo.f5119a)) {
                            C0200av.m970a(-46757992289452L);
                            C0200av.m970a(-46839596668076L);
                            next.toString();
                            C0200av.m970a(-46886841308332L);
                            C0200av.m970a(-46968445686956L);
                            if (!C0194ap.m968e(C0200av.m970a(-47019985294508L), next.f1408a, next.f1409b)) {
                                C0550gu.m1822d(C0200av.m970a(-49841778807980L), C0200av.m970a(-49923383186604L) + next.mo1798b());
                                luVar = this.f5353q;
                                fpVar = new C0490fp(12);
                            } else {
                                C0200av.m970a(-50142426518700L);
                                if (C0194ap.m966c(next.f1409b)) {
                                    C0550gu.m1822d(C0200av.m970a(-50391534621868L), C0200av.m970a(-50473139000492L) + next.mo1798b());
                                    luVar = this.f5353q;
                                    fpVar = new C0490fp(13);
                                } else {
                                    int a2 = next.mo1797a();
                                    if (a2 != 0) {
                                        if (a2 != 1) {
                                            if (a2 != 2) {
                                            }
                                        } else if (!next.f1410c.optBoolean("acknowledged", true)) {
                                            hashSet.add(next.mo1799c());
                                            mo5306a(next, true);
                                        } else {
                                            hashSet.add(next.mo1799c());
                                            Context context = this.f5344h;
                                            String c = next.mo1799c();
                                            String str2 = next.f1408a;
                                            String str3 = next.f1409b;
                                            int i2 = C1425yo.f5206a;
                                            StringBuilder c2 = C0279ch.m1106c(str2);
                                            c2.append(C0200av.m970a(-37523812603052L));
                                            c2.append(str3);
                                            c2.append(C0200av.m970a(-37592532079788L));
                                            if (C0391dp.f1915a == null) {
                                                C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                                            }
                                            if (C0391dp.f1915a == null) {
                                                C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                                            }
                                            c2.append(C0391dp.f1915a);
                                            c2.append(C0200av.m970a(-37661251556524L));
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str2);
                                            sb2.append(str3);
                                            if (C0391dp.f1915a == null) {
                                                C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                                            }
                                            if (C0391dp.f1915a == null) {
                                                C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                                            }
                                            sb2.append(C0391dp.f1915a);
                                            c2.append(Integer.toHexString(sb2.toString().hashCode()));
                                            String hexString = Integer.toHexString(c.hashCode());
                                            String sb3 = c2.toString();
                                            if (sb3 != null && !sb3.isEmpty()) {
                                                byte[] bytes = sb3.isEmpty() ? new byte[0] : Build.VERSION.SDK_INT >= 19 ? sb3.getBytes(StandardCharsets.UTF_8) : sb3.getBytes();
                                                if (C0391dp.f1915a == null) {
                                                    C0391dp.f1915a = Settings.Secure.getString(context.getContentResolver(), C0200av.m970a(-70479096665260L));
                                                }
                                                if (C0391dp.f1915a == null) {
                                                    C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                                                }
                                                String str4 = C0391dp.f1915a;
                                                if (str4 == null || str4.isEmpty() || (b2 = (byte) str4.hashCode()) == 0) {
                                                    b2 = 5;
                                                }
                                                C0495fu.m1724a(bytes);
                                                byte[] bArr = new byte[bytes.length];
                                                for (int i3 = 0; i3 < bytes.length; i3++) {
                                                    int i4 = bytes[i3] + b2;
                                                    if (i4 > 127) {
                                                        i4 -= 256;
                                                    } else if (i4 < -128) {
                                                        i4 += 256;
                                                    }
                                                    bArr[i3] = (byte) i4;
                                                }
                                                C0495fu.m1724a(bArr);
                                                sb3 = Base64.encodeToString(bArr, 0);
                                            }
                                            SharedPreferences.Editor edit = context.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).edit();
                                            edit.putString(hexString, sb3);
                                            edit.apply();
                                            this.f5350n.mo3645a(this);
                                        }
                                    }
                                    if (next.mo1797a() == 0) {
                                        str = C0200av.m970a(-50700772267180L);
                                        sb = new StringBuilder();
                                        j2 = -50782376645804L;
                                    } else {
                                        str = C0200av.m970a(-50919815599276L);
                                        sb = new StringBuilder();
                                        j2 = -51001419977900L;
                                    }
                                    sb.append(C0200av.m970a(j2));
                                    sb.append(next.mo1798b());
                                    C0550gu.m1822d(str, sb.toString());
                                    luVar = this.f5353q;
                                    fpVar = new C0490fp(9);
                                }
                            }
                            luVar.mo3645a(fpVar);
                        }
                    }
                    C0200av.m970a(-51121679062188L);
                    C0200av.m970a(-51203283440812L);
                    C0200av.m970a(-51272002917548L);
                    hashSet.toString();
                    for (C0231bp next2 : this.f5342f) {
                        if (!hashSet.contains(next2.f1290a)) {
                            Context context2 = this.f5344h;
                            String str5 = next2.f1290a;
                            int i5 = C1425yo.f5206a;
                            String string = context2.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).getString(Integer.toHexString(str5.hashCode()), (String) null);
                            if (string == null || string.isEmpty()) {
                                cpVar = new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g);
                            } else {
                                if (!string.isEmpty()) {
                                    byte[] decode = Base64.decode(string, 0);
                                    if (C0391dp.f1915a == null) {
                                        C0391dp.f1915a = Settings.Secure.getString(context2.getContentResolver(), C0200av.m970a(j));
                                    }
                                    if (C0391dp.f1915a == null) {
                                        C0391dp.f1915a = C0200av.m970a(-70526341305516L);
                                    }
                                    String str6 = C0391dp.f1915a;
                                    if (str6 == null || str6.isEmpty() || (b = (byte) str6.hashCode()) == 0) {
                                        b = 5;
                                    }
                                    byte b3 = (byte) (b * -1);
                                    C0495fu.m1724a(decode);
                                    byte[] bArr2 = new byte[decode.length];
                                    for (int i6 = 0; i6 < decode.length; i6++) {
                                        int i7 = decode[i6] + b3;
                                        if (i7 > 127) {
                                            i7 -= 256;
                                        } else if (i7 < -128) {
                                            i7 += 256;
                                        }
                                        bArr2[i6] = (byte) i7;
                                    }
                                    C0495fu.m1724a(bArr2);
                                    if (Build.VERSION.SDK_INT >= 19) {
                                        Charset charset = StandardCharsets.UTF_8;
                                    } else {
                                        string = new String(bArr2);
                                    }
                                }
                                String[] split = string.split(C0200av.m970a(-38004848940204L));
                                cpVar = split.length != 4 ? new C0348cp((String) null, (String) null, (String) null, (String) null, C0433ep.f2035g) : new C0348cp(split[0], split[1], split[2], split[3], C0433ep.f2029a);
                            }
                            C0544go goVar = cpVar.f1832f;
                            if (goVar == C0433ep.f2034f || goVar == C0433ep.f2029a) {
                                C0550gu.m1822d(C0200av.m970a(-51353607296172L), C0200av.m970a(-51435211674796L) + next2.f1290a);
                                Context context3 = this.f5344h;
                                String str7 = next2.f1290a;
                                C0200av.m970a(-51619895268524L);
                                C0200av.m970a(-51624190235820L);
                                String hexString2 = Integer.toHexString(str7.hashCode());
                                SharedPreferences.Editor edit2 = context3.getSharedPreferences(C0200av.m970a(-37364898813100L), 0).edit();
                                edit2.putString(hexString2, (String) null);
                                edit2.apply();
                                this.f5350n.mo3645a(this);
                            }
                        }
                        j = -70479096665260L;
                    }
                    C0396du<C1468zo> duVar = this.f5349m;
                    Iterator<C0593hu<Object, C0396du.C0397a<T>>> it2 = duVar.f1921a.iterator();
                    while (it2.hasNext()) {
                        C0396du.f1920c.post(new C1033qt(it2.next(), this));
                    }
                    Iterator<C0593hu<Object, C0396du.C0397a<T>>> it3 = duVar.f1922b.iterator();
                    while (it3.hasNext()) {
                        C0396du.f1920c.post(new C1077rt(it3.next(), this));
                    }
                    duVar.f1922b.clear();
                    return;
                }
                C0550gu.m1822d(C0200av.m970a(-51628485203116L), C0200av.m970a(-51710089581740L));
                return;
            }
            this.f5353q.mo3645a(new C0490fp(cgVar));
            return;
        }
        this.f5345i.mo3648d(C0200av.m970a(-51778809058476L));
        this.f5345i.mo3646b(C0200av.m970a(-51907658077356L), new C1323wo(this), false);
        mo5308c();
    }

    /* renamed from: j */
    public void mo5313j() {
        C0277cg cgVar;
        if (this.f5339c) {
            List<C0231bp> list = this.f5342f;
            int i = C0231bp.f1289c;
            ArrayList arrayList = new ArrayList();
            for (C0231bp bpVar : list) {
                arrayList.add(bpVar.f1290a);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            String a = C0200av.m970a(-52036507096236L);
            C1455zf zfVar = (C1455zf) this.f5337a;
            if (!zfVar.mo5290a()) {
                cgVar = C0977pg.f3637l;
            } else if (TextUtils.isEmpty(a)) {
                int i2 = C0423eh.f2000a;
                Log.isLoggable("BillingClient", 5);
                cgVar = C0977pg.f3632g;
            } else if (zfVar.mo5292c(new C1168tg(zfVar, a, arrayList2, (String) null, this), 30000, new C1262vg(this)) == null) {
                cgVar = zfVar.mo5293e();
            } else {
                return;
            }
            mo5311h(cgVar, (List<SkuDetails>) null);
            return;
        }
        this.f5345i.mo3648d(C0200av.m970a(-52062276900012L));
        this.f5345i.mo3646b(C0200av.m970a(-52195420886188L), new C1273vo(this), false);
        mo5308c();
    }

    /* renamed from: l */
    public final String mo5314l(C0277cg cgVar) {
        return C0200av.m970a(-52916975391916L) + cgVar.f1384a + C0200av.m970a(-52947040162988L) + cgVar.f1385b;
    }
}
