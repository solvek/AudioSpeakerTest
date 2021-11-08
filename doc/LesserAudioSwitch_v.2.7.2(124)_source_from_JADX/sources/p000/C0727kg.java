package p000;

import p000.C1455zf;

/* renamed from: kg */
public final class C0727kg implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0277cg f3002b;

    /* renamed from: c */
    public final /* synthetic */ C1455zf.C1456a f3003c;

    public C0727kg(C1455zf.C1456a aVar, C0277cg cgVar) {
        this.f3003c = aVar;
        this.f3002b = cgVar;
    }

    public final void run() {
        synchronized (this.f3003c.f5307a) {
            C0024ag agVar = this.f3003c.f5309c;
            if (agVar != null) {
                ((C1468zo) agVar).mo5309f(this.f3002b);
            }
        }
    }
}
