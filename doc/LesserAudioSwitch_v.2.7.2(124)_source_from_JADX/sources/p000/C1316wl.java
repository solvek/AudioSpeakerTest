package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import p000.C1375xl;

/* renamed from: wl */
public class C1316wl extends C1375xl.C1381f {

    /* renamed from: b */
    public final /* synthetic */ List f4965b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f4966c;

    public C1316wl(C1375xl xlVar, List list, Matrix matrix) {
        this.f4965b = list;
        this.f4966c = matrix;
    }

    /* renamed from: a */
    public void mo5011a(Matrix matrix, C0688jl jlVar, int i, Canvas canvas) {
        for (C1375xl.C1381f a : this.f4965b) {
            a.mo5011a(this.f4966c, jlVar, i, canvas);
        }
    }
}
