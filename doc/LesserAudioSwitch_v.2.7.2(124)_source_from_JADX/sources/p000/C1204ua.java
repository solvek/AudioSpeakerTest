package p000;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: ua */
public final class C1204ua implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f4608b;

    /* renamed from: c */
    public final /* synthetic */ C0263cb f4609c;

    /* renamed from: d */
    public final /* synthetic */ View f4610d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f4611e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f4612f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f4613g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f4614h;

    /* renamed from: i */
    public final /* synthetic */ Object f4615i;

    public C1204ua(Object obj, C0263cb cbVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f4608b = obj;
        this.f4609c = cbVar;
        this.f4610d = view;
        this.f4611e = fragment;
        this.f4612f = arrayList;
        this.f4613g = arrayList2;
        this.f4614h = arrayList3;
        this.f4615i = obj2;
    }

    public void run() {
        Object obj = this.f4608b;
        if (obj != null) {
            this.f4609c.mo1727m(obj, this.f4610d);
            this.f4613g.addAll(C1353xa.m3807h(this.f4609c, this.f4608b, this.f4611e, this.f4612f, this.f4610d));
        }
        if (this.f4614h != null) {
            if (this.f4615i != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f4610d);
                this.f4609c.mo1728n(this.f4615i, this.f4614h, arrayList);
            }
            this.f4614h.clear();
            this.f4614h.add(this.f4610d);
        }
    }
}
