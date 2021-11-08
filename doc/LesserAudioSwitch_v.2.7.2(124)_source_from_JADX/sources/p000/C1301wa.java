package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p000.C1353xa;

/* renamed from: wa */
public final class C1301wa implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0263cb f4933b;

    /* renamed from: c */
    public final /* synthetic */ C0254c4 f4934c;

    /* renamed from: d */
    public final /* synthetic */ Object f4935d;

    /* renamed from: e */
    public final /* synthetic */ C1353xa.C1355b f4936e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f4937f;

    /* renamed from: g */
    public final /* synthetic */ View f4938g;

    /* renamed from: h */
    public final /* synthetic */ Fragment f4939h;

    /* renamed from: i */
    public final /* synthetic */ Fragment f4940i;

    /* renamed from: j */
    public final /* synthetic */ boolean f4941j;

    /* renamed from: k */
    public final /* synthetic */ ArrayList f4942k;

    /* renamed from: l */
    public final /* synthetic */ Object f4943l;

    /* renamed from: m */
    public final /* synthetic */ Rect f4944m;

    public C1301wa(C0263cb cbVar, C0254c4 c4Var, Object obj, C1353xa.C1355b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f4933b = cbVar;
        this.f4934c = c4Var;
        this.f4935d = obj;
        this.f4936e = bVar;
        this.f4937f = arrayList;
        this.f4938g = view;
        this.f4939h = fragment;
        this.f4940i = fragment2;
        this.f4941j = z;
        this.f4942k = arrayList2;
        this.f4943l = obj2;
        this.f4944m = rect;
    }

    public void run() {
        C0254c4<String, View> e = C1353xa.m3804e(this.f4933b, this.f4934c, this.f4935d, this.f4936e);
        if (e != null) {
            this.f4937f.addAll(e.values());
            this.f4937f.add(this.f4938g);
        }
        C1353xa.m3802c(this.f4939h, this.f4940i, this.f4941j, e, false);
        Object obj = this.f4935d;
        if (obj != null) {
            this.f4933b.mo1735u(obj, this.f4942k, this.f4937f);
            View k = C1353xa.m3810k(e, this.f4936e, this.f4943l, this.f4941j);
            if (k != null) {
                this.f4933b.mo1725j(k, this.f4944m);
            }
        }
    }
}
