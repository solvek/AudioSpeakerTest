package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: za */
public class C1449za implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5278b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f5279c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f5280d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f5281e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f5282f;

    public C1449za(C0263cb cbVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5278b = i;
        this.f5279c = arrayList;
        this.f5280d = arrayList2;
        this.f5281e = arrayList3;
        this.f5282f = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.f5278b; i++) {
            C0813m8.m2465N((View) this.f5279c.get(i), (String) this.f5280d.get(i));
            C0813m8.m2465N((View) this.f5281e.get(i), (String) this.f5282f.get(i));
        }
    }
}
