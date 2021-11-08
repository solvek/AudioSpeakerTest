package p000;

import java.util.TimerTask;

/* renamed from: vp */
public class C1274vp extends TimerTask {

    /* renamed from: b */
    public final /* synthetic */ C1324wp f4839b;

    public C1274vp(C1324wp wpVar) {
        this.f4839b = wpVar;
    }

    public void run() {
        if (C0728kh.m2305u()) {
            C1324wp wpVar = this.f4839b;
            if (wpVar.f4983e && C0697ju.m2178a(wpVar.f4979a)) {
                C0936oo.m2705k(this.f4839b.f4979a, C0544go.f2352N, new C0789lp(this));
            }
        }
        boolean z = false;
        if (C0697ju.f2934b.mo3309a(this.f4839b.f4979a, false)) {
            try {
                if (C0697ju.m2194q(this.f4839b.f4979a)) {
                    int ordinal = C0697ju.m2193p(this.f4839b.f4979a).ordinal();
                    if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6 || ordinal == 8) {
                        z = true;
                    }
                    if (z) {
                        C0936oo.m2705k(this.f4839b.f4979a, C0544go.f2370e, new C0647ip(this));
                    }
                }
            } catch (Exception e) {
                C0550gu.m1819a("LAS ActiveStatusMonitor", "Problem in check speaker loop");
                C0550gu.m1821c(e);
            }
        }
    }
}
