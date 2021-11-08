package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: r */
public abstract class C1035r {

    /* renamed from: b */
    public static final C0405e4<WeakReference<C1035r>> f3879b = new C0405e4<>();

    /* renamed from: c */
    public static final Object f3880c = new Object();

    /* renamed from: s */
    public static void m2947s(C1035r rVar) {
        synchronized (f3880c) {
            Iterator<WeakReference<C1035r>> it = f3879b.iterator();
            while (it.hasNext()) {
                C1035r rVar2 = (C1035r) it.next().get();
                if (rVar2 == rVar || rVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract void mo4143c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public Context mo4144d(Context context) {
        return context;
    }

    /* renamed from: e */
    public abstract <T extends View> T mo4145e(int i);

    /* renamed from: f */
    public int mo4146f() {
        return -100;
    }

    /* renamed from: g */
    public abstract MenuInflater mo4147g();

    /* renamed from: h */
    public abstract C0496g mo4148h();

    /* renamed from: i */
    public abstract void mo4149i();

    /* renamed from: j */
    public abstract void mo4150j();

    /* renamed from: k */
    public abstract void mo4151k(Configuration configuration);

    /* renamed from: l */
    public abstract void mo4152l(Bundle bundle);

    /* renamed from: m */
    public abstract void mo4153m();

    /* renamed from: n */
    public abstract void mo4154n(Bundle bundle);

    /* renamed from: o */
    public abstract void mo4155o();

    /* renamed from: p */
    public abstract void mo4156p(Bundle bundle);

    /* renamed from: q */
    public abstract void mo4157q();

    /* renamed from: r */
    public abstract void mo4158r();

    /* renamed from: t */
    public abstract boolean mo4159t(int i);

    /* renamed from: u */
    public abstract void mo4160u(int i);

    /* renamed from: v */
    public abstract void mo4161v(View view);

    /* renamed from: w */
    public abstract void mo4162w(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: x */
    public void mo4163x(int i) {
    }

    /* renamed from: y */
    public abstract void mo4164y(CharSequence charSequence);
}
