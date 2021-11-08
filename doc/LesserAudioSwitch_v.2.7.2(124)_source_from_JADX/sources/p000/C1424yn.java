package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p000.C0735ko;
import p000.C0936oo;

/* renamed from: yn */
public final /* synthetic */ class C1424yn implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0936oo.C0939c f5205b;

    public /* synthetic */ C1424yn(C0936oo.C0939c cVar) {
        this.f5205b = cVar;
    }

    public final void run() {
        C0735ko.C0739d dVar;
        C0936oo.C0939c cVar = this.f5205b;
        C0735ko.C0738c[] cVarArr = C0735ko.f3014c;
        C0735ko.C0739d[] dVarArr = new C0735ko.C0739d[cVarArr.length];
        int i = 0;
        int i2 = 0;
        for (C0735ko.C0738c cVar2 : cVarArr) {
            int i3 = cVar2.f3039b;
            C0735ko.C0738c[] cVarArr2 = C0735ko.f3014c;
            try {
                int intValue = ((Integer) C0735ko.f3015d.getMethod(C0200av.m970a(-26550171161772L), new Class[]{Integer.TYPE}).invoke(C0735ko.f3015d, new Object[]{Integer.valueOf(i3)})).intValue();
                C0735ko.C0739d[] values = C0735ko.C0739d.values();
                int i4 = 0;
                while (true) {
                    if (i4 >= 18) {
                        dVar = C0735ko.C0739d.f3040c;
                        break;
                    }
                    dVar = values[i4];
                    if (dVar.f3059b == intValue) {
                        break;
                    }
                    i4++;
                }
            } catch (Exception e) {
                C0200av.m970a(-26601710769324L);
                C0200av.m970a(-26631775540396L);
                e.printStackTrace();
                dVar = C0735ko.C0739d.f3040c;
            }
            dVarArr[i2] = dVar;
            i2++;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            C0735ko.C0738c[] cVarArr3 = C0735ko.f3014c;
            if (i < cVarArr3.length) {
                arrayList.add(new C0593hu(cVarArr3[i], dVarArr[i]));
                i++;
            } else {
                C1277vs vsVar = ((C0546gq) cVar).f2413a.f4525b;
                int i5 = C1277vs.f4842a0;
                vsVar.getClass();
                new Handler(Looper.getMainLooper()).post(new C0743kq(vsVar, arrayList));
                return;
            }
        }
    }
}
