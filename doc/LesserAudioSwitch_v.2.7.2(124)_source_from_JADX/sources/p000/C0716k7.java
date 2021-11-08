package p000;

import android.os.Handler;
import p000.C0808m7;
import p000.C0860n7;

/* renamed from: k7 */
public class C0716k7 implements C0860n7.C0863c<C0808m7.C0812d> {

    /* renamed from: a */
    public final /* synthetic */ C0757l6 f2982a;

    /* renamed from: b */
    public final /* synthetic */ Handler f2983b;

    public C0716k7(C0757l6 l6Var, Handler handler) {
        this.f2982a = l6Var;
        this.f2983b = handler;
    }

    /* renamed from: a */
    public void mo3532a(Object obj) {
        C0757l6 l6Var;
        int i;
        C0808m7.C0812d dVar = (C0808m7.C0812d) obj;
        if (dVar == null) {
            l6Var = this.f2982a;
            i = 1;
        } else {
            i = dVar.f3233b;
            if (i == 0) {
                this.f2982a.mo3599b(dVar.f3232a, this.f2983b);
                return;
            }
            l6Var = this.f2982a;
        }
        l6Var.mo3598a(i, this.f2983b);
    }
}
