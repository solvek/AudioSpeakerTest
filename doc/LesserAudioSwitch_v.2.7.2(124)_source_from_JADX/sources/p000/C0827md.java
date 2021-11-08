package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: md */
public final class C0827md extends C0924od {
    public C0827md(RecyclerView.C0160m mVar) {
        super(mVar, (C0827md) null);
    }

    /* renamed from: b */
    public int mo3687b(View view) {
        return this.f3497a.mo1308G(view) + ((RecyclerView.C0165n) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: c */
    public int mo3688c(View view) {
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
        return this.f3497a.mo1306F(view) + nVar.leftMargin + nVar.rightMargin;
    }

    /* renamed from: d */
    public int mo3689d(View view) {
        RecyclerView.C0165n nVar = (RecyclerView.C0165n) view.getLayoutParams();
        return this.f3497a.mo1304E(view) + nVar.topMargin + nVar.bottomMargin;
    }

    /* renamed from: e */
    public int mo3690e(View view) {
        return this.f3497a.mo1302D(view) - ((RecyclerView.C0165n) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: f */
    public int mo3691f() {
        return this.f3497a.f1042p;
    }

    /* renamed from: g */
    public int mo3692g() {
        RecyclerView.C0160m mVar = this.f3497a;
        return mVar.f1042p - mVar.mo1321O();
    }

    /* renamed from: h */
    public int mo3693h() {
        return this.f3497a.mo1321O();
    }

    /* renamed from: i */
    public int mo3694i() {
        return this.f3497a.f1040n;
    }

    /* renamed from: j */
    public int mo3695j() {
        return this.f3497a.f1041o;
    }

    /* renamed from: k */
    public int mo3696k() {
        return this.f3497a.mo1319N();
    }

    /* renamed from: l */
    public int mo3697l() {
        RecyclerView.C0160m mVar = this.f3497a;
        return (mVar.f1042p - mVar.mo1319N()) - this.f3497a.mo1321O();
    }

    /* renamed from: n */
    public int mo3698n(View view) {
        this.f3497a.mo1329U(view, true, this.f3499c);
        return this.f3499c.right;
    }

    /* renamed from: o */
    public int mo3699o(View view) {
        this.f3497a.mo1329U(view, true, this.f3499c);
        return this.f3499c.left;
    }

    /* renamed from: p */
    public void mo3700p(int i) {
        this.f3497a.mo1335a0(i);
    }
}
