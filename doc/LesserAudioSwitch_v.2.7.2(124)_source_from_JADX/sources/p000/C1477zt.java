package p000;

/* renamed from: zt */
public final /* synthetic */ class C1477zt implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0899nu f5368b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f5369c;

    public /* synthetic */ C1477zt(C0899nu nuVar, Runnable runnable) {
        this.f5368b = nuVar;
        this.f5369c = runnable;
    }

    public final void run() {
        C0899nu nuVar = this.f5368b;
        Runnable runnable = this.f5369c;
        nuVar.f3432f = true;
        try {
            runnable.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        nuVar.f3432f = false;
    }
}
