package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.nordskog.LesserAudioSwitch.SoundBroadcastReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.C0735ko;

/* renamed from: yp */
public class C1426yp {

    /* renamed from: h */
    public static C1426yp f5207h;

    /* renamed from: i */
    public static C0489fo f5208i = C0489fo.DEFAULT;

    /* renamed from: a */
    public Context f5209a = null;

    /* renamed from: b */
    public C1324wp f5210b = null;

    /* renamed from: c */
    public boolean f5211c = false;

    /* renamed from: d */
    public SoundBroadcastReceiver f5212d = null;

    /* renamed from: e */
    public C0788lo f5213e = new C0788lo();

    /* renamed from: f */
    public Map<C1129so, Boolean> f5214f = new HashMap();

    /* renamed from: g */
    public final Set<C1427a> f5215g = new HashSet();

    /* renamed from: yp$a */
    public interface C1427a {
        /* renamed from: i */
        void mo2545i(C0788lo loVar);
    }

    public C1426yp(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5209a = applicationContext;
        this.f5210b = new C1324wp(applicationContext);
    }

    /* renamed from: b */
    public static C1426yp m3890b(Context context) {
        if (f5207h == null) {
            f5207h = new C1426yp(context.getApplicationContext());
        }
        return f5207h;
    }

    /* renamed from: d */
    public static void m3891d(Context context, C0788lo loVar) {
        C1426yp b = m3890b(context);
        b.f5213e = loVar;
        b.f5210b.mo5017a();
        C0353cu.f1837a.post(new C1073rp(b, loVar));
    }

    /* renamed from: g */
    public static void m3892g(Context context) {
        C1426yp b = m3890b(context);
        Context context2 = b.f5209a;
        C1223up upVar = new C1223up(b);
        C0899nu nuVar = C0936oo.f3508c;
        C0936oo.f3508c.mo3811b(context2, new C0230bo(context2, upVar));
    }

    /* renamed from: a */
    public C0735ko.C0737b mo5218a(C1129so soVar) {
        Boolean bool = this.f5214f.get(soVar);
        return bool != null ? bool.booleanValue() ? C0735ko.C0737b.f3026b : C0735ko.C0737b.f3027c : C0735ko.C0737b.f3028d;
    }

    /* renamed from: c */
    public final void mo5219c() {
        if (!this.f5211c) {
            this.f5210b.mo5019c();
            this.f5211c = true;
            this.f5212d = new SoundBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            if (C0728kh.m2305u()) {
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
            }
            this.f5209a.registerReceiver(this.f5212d, intentFilter);
        }
    }

    /* renamed from: e */
    public void mo5220e(C1427a aVar, boolean z) {
        synchronized (this.f5215g) {
            boolean z2 = !this.f5215g.isEmpty();
            this.f5215g.add(aVar);
            if (!this.f5215g.isEmpty()) {
                mo5219c();
            } else {
                mo5222h();
            }
            if (!z2) {
                C0353cu.f1837a.postDelayed(C1130sp.f4321b, (long) 1000);
            } else if (!z) {
                C0353cu.f1837a.post(new C1029qp(this, aVar));
            } else {
                C0353cu.f1837a.postDelayed(new C1180tp(this, aVar), (long) 1000);
            }
        }
    }

    /* renamed from: f */
    public void mo5221f(C1427a aVar) {
        synchronized (this.f5215g) {
            this.f5215g.remove(aVar);
            if (!this.f5215g.isEmpty()) {
                mo5219c();
            } else {
                mo5222h();
            }
        }
    }

    /* renamed from: h */
    public final void mo5222h() {
        if (this.f5211c) {
            this.f5214f.clear();
            this.f5211c = false;
            this.f5209a.unregisterReceiver(this.f5212d);
            this.f5210b.mo5020d();
        }
    }
}
