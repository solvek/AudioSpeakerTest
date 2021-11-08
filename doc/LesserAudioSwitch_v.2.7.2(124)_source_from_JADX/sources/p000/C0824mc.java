package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mc */
public class C0824mc extends RecyclerView.C0149e<C1056rc> implements Preference.C0122c {

    /* renamed from: c */
    public PreferenceGroup f3263c;

    /* renamed from: d */
    public List<Preference> f3264d;

    /* renamed from: e */
    public List<Preference> f3265e;

    /* renamed from: f */
    public List<C0826b> f3266f;

    /* renamed from: g */
    public Handler f3267g;

    /* renamed from: h */
    public Runnable f3268h = new C0825a();

    /* renamed from: mc$a */
    public class C0825a implements Runnable {
        public C0825a() {
        }

        public void run() {
            C0824mc.this.mo3683k();
        }
    }

    /* renamed from: mc$b */
    public static class C0826b {

        /* renamed from: a */
        public int f3270a;

        /* renamed from: b */
        public int f3271b;

        /* renamed from: c */
        public String f3272c;

        public C0826b(Preference preference) {
            this.f3272c = preference.getClass().getName();
            this.f3270a = preference.f785E;
            this.f3271b = preference.f786F;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0826b)) {
                return false;
            }
            C0826b bVar = (C0826b) obj;
            return this.f3270a == bVar.f3270a && this.f3271b == bVar.f3271b && TextUtils.equals(this.f3272c, bVar.f3272c);
        }

        public int hashCode() {
            return this.f3272c.hashCode() + ((((527 + this.f3270a) * 31) + this.f3271b) * 31);
        }
    }

    public C0824mc(PreferenceGroup preferenceGroup) {
        this.f3263c = preferenceGroup;
        this.f3267g = new Handler();
        this.f3263c.f787G = this;
        this.f3264d = new ArrayList();
        this.f3265e = new ArrayList();
        this.f3266f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f3263c;
        mo1278f(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).f828T : true);
        mo3683k();
    }

    /* renamed from: a */
    public int mo1273a() {
        return this.f3265e.size();
    }

    /* renamed from: b */
    public long mo1274b(int i) {
        if (!this.f1017b) {
            return -1;
        }
        return mo3681i(i).mo945c();
    }

    /* renamed from: c */
    public int mo1275c(int i) {
        C0826b bVar = new C0826b(mo3681i(i));
        int indexOf = this.f3266f.indexOf(bVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f3266f.size();
        this.f3266f.add(bVar);
        return size;
    }

    /* renamed from: d */
    public void mo1276d(RecyclerView.C0145a0 a0Var, int i) {
        mo3681i(i).mo909p((C1056rc) a0Var);
    }

    /* renamed from: e */
    public RecyclerView.C0145a0 mo1277e(ViewGroup viewGroup, int i) {
        C0826b bVar = this.f3266f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C1163tc.f4415a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = C0399e0.m1530b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bVar.f3270a, viewGroup, false);
        if (inflate.getBackground() == null) {
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 16) {
                inflate.setBackground(drawable);
            } else {
                inflate.setBackgroundDrawable(drawable);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = bVar.f3271b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C1056rc(inflate);
    }

    /* renamed from: g */
    public final List<Preference> mo3679g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int K = preferenceGroup.mo971K();
        int i = 0;
        for (int i2 = 0; i2 < K; i2++) {
            Preference J = preferenceGroup.mo970J(i2);
            if (J.f815w) {
                if (!mo3682j(preferenceGroup) || i < preferenceGroup.f826S) {
                    arrayList.add(J);
                } else {
                    arrayList2.add(J);
                }
                if (!(J instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) J;
                    if (!preferenceGroup2.mo972L()) {
                        continue;
                    } else if (!mo3682j(preferenceGroup) || !mo3682j(preferenceGroup2)) {
                        for (Preference next : mo3679g(preferenceGroup2)) {
                            if (!mo3682j(preferenceGroup) || i < preferenceGroup.f826S) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (mo3682j(preferenceGroup) && i > preferenceGroup.f826S) {
            C0567hc hcVar = new C0567hc(preferenceGroup.f794b, arrayList2, preferenceGroup.f796d);
            hcVar.f798f = new C0869nc(this, preferenceGroup);
            arrayList.add(hcVar);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo3680h(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f822O);
        }
        int K = preferenceGroup.mo971K();
        for (int i = 0; i < K; i++) {
            Preference J = preferenceGroup.mo970J(i);
            list.add(J);
            C0826b bVar = new C0826b(J);
            if (!this.f3266f.contains(bVar)) {
                this.f3266f.add(bVar);
            }
            if (J instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) J;
                if (preferenceGroup2.mo972L()) {
                    mo3680h(list, preferenceGroup2);
                }
            }
            J.f787G = this;
        }
    }

    /* renamed from: i */
    public Preference mo3681i(int i) {
        if (i < 0 || i >= mo1273a()) {
            return null;
        }
        return this.f3265e.get(i);
    }

    /* renamed from: j */
    public final boolean mo3682j(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f826S != Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public void mo3683k() {
        for (Preference preference : this.f3264d) {
            preference.f787G = null;
        }
        ArrayList arrayList = new ArrayList(this.f3264d.size());
        this.f3264d = arrayList;
        mo3680h(arrayList, this.f3263c);
        this.f3265e = mo3679g(this.f3263c);
        C0968pc pcVar = this.f3263c.f795c;
        this.f1016a.mo1280b();
        for (Preference preference2 : this.f3264d) {
            preference2.getClass();
        }
    }
}
