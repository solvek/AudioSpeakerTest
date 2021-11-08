package p000;

import android.view.View;

/* renamed from: w */
public class C1280w implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1079s f4852b;

    /* renamed from: w$a */
    public class C1281a extends C1156t8 {
        public C1281a() {
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            C1280w.this.f4852b.f4091p.setAlpha(1.0f);
            C1280w.this.f4852b.f4094s.mo4214d((C1102s8) null);
            C1280w.this.f4852b.f4094s = null;
        }

        /* renamed from: b */
        public void mo3388b(View view) {
            C1280w.this.f4852b.f4091p.setVisibility(0);
        }
    }

    public C1280w(C1079s sVar) {
        this.f4852b = sVar;
    }

    public void run() {
        C1079s sVar = this.f4852b;
        sVar.f4092q.showAtLocation(sVar.f4091p, 55, 0, 0);
        this.f4852b.mo4325I();
        if (this.f4852b.mo4338V()) {
            this.f4852b.f4091p.setAlpha(0.0f);
            C1079s sVar2 = this.f4852b;
            C1049r8 a = C0813m8.m2467a(sVar2.f4091p);
            a.mo4211a(1.0f);
            sVar2.f4094s = a;
            this.f4852b.f4094s.mo4214d(new C1281a());
            return;
        }
        this.f4852b.f4091p.setAlpha(1.0f);
        this.f4852b.f4091p.setVisibility(0);
    }
}
