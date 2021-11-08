package p000;

import p000.C0808m7;
import p000.C0860n7;

/* renamed from: l7 */
public class C0760l7 implements C0860n7.C0863c<C0808m7.C0812d> {

    /* renamed from: a */
    public final /* synthetic */ String f3112a;

    public C0760l7(String str) {
        this.f3112a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 >= r2.size()) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        ((p000.C0860n7.C0863c) r2.get(r0)).mo3532a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3532a(p000.C0808m7.C0812d r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p000.C0808m7.f3222c
            monitor-enter(r0)
            j4<java.lang.String, java.util.ArrayList<n7$c<m7$d>>> r1 = p000.C0808m7.f3223d     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r4.f3112a     // Catch:{ all -> 0x002b }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            java.lang.String r3 = r4.f3112a     // Catch:{ all -> 0x002b }
            r1.remove(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            r0 = 0
        L_0x0018:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002a
            java.lang.Object r1 = r2.get(r0)
            n7$c r1 = (p000.C0860n7.C0863c) r1
            r1.mo3532a(r5)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x002a:
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002e:
            throw r5
        L_0x002f:
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0760l7.mo3532a(m7$d):void");
    }
}
