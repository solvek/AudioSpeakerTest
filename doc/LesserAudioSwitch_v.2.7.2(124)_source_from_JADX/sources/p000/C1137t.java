package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import p000.C1241v8;

/* renamed from: t */
public class C1137t implements C0668j8 {

    /* renamed from: a */
    public final /* synthetic */ C1079s f4329a;

    public C1137t(C1079s sVar) {
        this.f4329a = sVar;
    }

    /* renamed from: a */
    public C1241v8 mo696a(View view, C1241v8 v8Var) {
        WindowInsets g;
        int d = v8Var.mo4844d();
        int X = this.f4329a.mo4340X(v8Var, (Rect) null);
        if (d != X) {
            int b = v8Var.mo4842b();
            int c = v8Var.mo4843c();
            int a = v8Var.mo4841a();
            int i = Build.VERSION.SDK_INT;
            C1241v8.C1244c bVar = i >= 29 ? new C1241v8.C1243b(v8Var) : i >= 20 ? new C1241v8.C1242a(v8Var) : new C1241v8.C1244c(v8Var);
            bVar.mo4850c(C0916o6.m2670a(b, X, c, a));
            v8Var = bVar.mo4849a();
        }
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT < 21 || (g = v8Var.mo4847g()) == null) {
            return v8Var;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g);
        return !onApplyWindowInsets.equals(g) ? new C1241v8(onApplyWindowInsets) : v8Var;
    }
}
