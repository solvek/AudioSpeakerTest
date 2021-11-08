package p000;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
/* renamed from: xd */
public final class C1359xd {

    /* renamed from: a */
    public C1141t3<String, C1361b> f5071a = new C1141t3<>();

    /* renamed from: b */
    public Bundle f5072b;

    /* renamed from: c */
    public boolean f5073c;

    /* renamed from: d */
    public Recreator.C0191a f5074d;

    /* renamed from: e */
    public boolean f5075e = true;

    /* renamed from: xd$a */
    public interface C1360a {
        /* renamed from: a */
        void mo906a(C1452zd zdVar);
    }

    /* renamed from: xd$b */
    public interface C1361b {
        /* renamed from: a */
        Bundle mo1463a();
    }

    /* renamed from: a */
    public void mo5095a(Class<? extends C1360a> cls) {
        if (this.f5075e) {
            if (this.f5074d == null) {
                this.f5074d = new Recreator.C0191a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C0191a aVar = this.f5074d;
                aVar.f1161a.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder c = C0279ch.m1106c("Class");
                c.append(cls.getSimpleName());
                c.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(c.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
