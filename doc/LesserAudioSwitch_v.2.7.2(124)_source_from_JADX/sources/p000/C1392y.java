package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p000.C0259c8;
import p000.C0750l0;

/* renamed from: y */
public class C1392y extends Dialog implements C0994q {

    /* renamed from: b */
    public C1035r f5144b;

    /* renamed from: c */
    public final C0259c8.C0260a f5145c;

    /* renamed from: y$a */
    public class C1393a implements C0259c8.C0260a {
        public C1393a() {
        }

        /* renamed from: h */
        public boolean mo1700h(KeyEvent keyEvent) {
            return C1392y.this.mo5115c(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1392y(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903278(0x7f0300ee, float:1.741337E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            y$a r2 = new y$a
            r2.<init>()
            r4.f5145c = r2
            r r2 = r4.mo5113a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.mo4163x(r6)
            r5 = 0
            r2.mo4152l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1392y.<init>(android.content.Context, int):void");
    }

    /* renamed from: a */
    public C1035r mo5113a() {
        if (this.f5144b == null) {
            C0405e4<WeakReference<C1035r>> e4Var = C1035r.f3879b;
            this.f5144b = new C1079s(getContext(), getWindow(), this, this);
        }
        return this.f5144b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo5113a().mo4143c(view, layoutParams);
    }

    /* renamed from: b */
    public void mo3877b(C0750l0 l0Var) {
    }

    /* renamed from: c */
    public boolean mo5115c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean mo5116d(int i) {
        return mo5113a().mo4159t(i);
    }

    public void dismiss() {
        super.dismiss();
        mo5113a().mo4153m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0259c8.m1065b(this.f5145c, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public void mo3880f(C0750l0 l0Var) {
    }

    public <T extends View> T findViewById(int i) {
        return mo5113a().mo4145e(i);
    }

    /* renamed from: g */
    public C0750l0 mo3882g(C0750l0.C0751a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        mo5113a().mo4150j();
    }

    public void onCreate(Bundle bundle) {
        mo5113a().mo4149i();
        super.onCreate(bundle);
        mo5113a().mo4152l(bundle);
    }

    public void onStop() {
        super.onStop();
        mo5113a().mo4158r();
    }

    public void setContentView(int i) {
        mo5113a().mo4160u(i);
    }

    public void setContentView(View view) {
        mo5113a().mo4161v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo5113a().mo4162w(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo5113a().mo4164y(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo5113a().mo4164y(charSequence);
    }
}
