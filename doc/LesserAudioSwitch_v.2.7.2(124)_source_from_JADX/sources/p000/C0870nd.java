package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nd */
public final class C0870nd extends C0924od {
    public C0870nd(RecyclerView.C0160m mVar) {
        super(mVar, (C0827md) null);
    }

    /* renamed from: b */
    public int mo3687b(View view) {
        return this.f3497a.mo1298B(view) + ((RecyclerView.C0165n) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: c */
    public int mo3688c(View view) {
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
        return this.f3497a.mo1304E(view) + nVar.topMargin + nVar.bottomMargin;
    }

    /* renamed from: d */
    public int mo3689d(View view) {
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
        return this.f3497a.mo1306F(view) + nVar.leftMargin + nVar.rightMargin;
    }

    /* renamed from: e */
    public int mo3690e(View view) {
        return this.f3497a.mo1310H(view) - ((RecyclerView.C0165n) view.getLayoutParams()).topMargin;
    }

    /* renamed from: f */
    public int mo3691f() {
        return this.f3497a.f1043q;
    }

    /* renamed from: g */
    public int mo3692g() {
        RecyclerView.C0160m mVar = this.f3497a;
        return mVar.f1043q - mVar.mo1318M();
    }

    /* renamed from: h */
    public int mo3693h() {
        return this.f3497a.mo1318M();
    }

    /* renamed from: i */
    public int mo3694i() {
        return this.f3497a.f1041o;
    }

    /* renamed from: j */
    public int mo3695j() {
        return this.f3497a.f1040n;
    }

    /* renamed from: k */
    public int mo3696k() {
        return this.f3497a.mo1323P();
    }

    /* renamed from: l */
    public int mo3697l() {
        RecyclerView.C0160m mVar = this.f3497a;
        return (mVar.f1043q - mVar.mo1323P()) - this.f3497a.mo1318M();
    }

    /* renamed from: n */
    public int mo3698n(View view) {
        this.f3497a.mo1329U(view, true, this.f3499c);
        return this.f3499c.bottom;
    }

    /* renamed from: o */
    public int mo3699o(View view) {
        this.f3497a.mo1329U(view, true, this.f3499c);
        return this.f3499c.top;
    }

    /* renamed from: p */
    public void mo3700p(int i) {
        this.f3497a.mo1337b0(i);
    }
}
