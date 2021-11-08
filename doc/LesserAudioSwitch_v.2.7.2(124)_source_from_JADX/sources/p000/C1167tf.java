package p000;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: tf */
public abstract class C1167tf {

    /* renamed from: a */
    public final C0254c4<String, Method> f4433a;

    /* renamed from: b */
    public final C0254c4<String, Method> f4434b;

    /* renamed from: c */
    public final C0254c4<String, Class> f4435c;

    public C1167tf(C0254c4<String, Method> c4Var, C0254c4<String, Method> c4Var2, C0254c4<String, Class> c4Var3) {
        this.f4433a = c4Var;
        this.f4434b = c4Var2;
        this.f4435c = c4Var3;
    }

    /* renamed from: a */
    public abstract void mo4645a();

    /* renamed from: b */
    public abstract C1167tf mo4646b();

    /* renamed from: c */
    public final Class mo4647c(Class<? extends C1261vf> cls) {
        Class orDefault = this.f4435c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4435c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: d */
    public final Method mo4648d(String str) {
        Class<C1167tf> cls = C1167tf.class;
        Method orDefault = this.f4433a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4433a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public final Method mo4649e(Class cls) {
        Method orDefault = this.f4434b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c = mo4647c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1167tf.class});
        this.f4434b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public abstract boolean mo4650f();

    /* renamed from: g */
    public abstract byte[] mo4651g();

    /* renamed from: h */
    public abstract CharSequence mo4652h();

    /* renamed from: i */
    public abstract boolean mo4653i(int i);

    /* renamed from: j */
    public abstract int mo4654j();

    /* renamed from: k */
    public int mo4655k(int i, int i2) {
        return !mo4653i(i2) ? i : mo4654j();
    }

    /* renamed from: l */
    public abstract <T extends Parcelable> T mo4656l();

    /* renamed from: m */
    public <T extends Parcelable> T mo4657m(T t, int i) {
        return !mo4653i(i) ? t : mo4656l();
    }

    /* renamed from: n */
    public abstract String mo4658n();

    /* renamed from: o */
    public <T extends C1261vf> T mo4659o() {
        String n = mo4658n();
        if (n == null) {
            return null;
        }
        C1167tf b = mo4646b();
        try {
            return (C1261vf) mo4648d(n).invoke((Object) null, new Object[]{b});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: p */
    public abstract void mo4660p(int i);

    /* renamed from: q */
    public abstract void mo4661q(boolean z);

    /* renamed from: r */
    public abstract void mo4662r(byte[] bArr);

    /* renamed from: s */
    public abstract void mo4663s(CharSequence charSequence);

    /* renamed from: t */
    public abstract void mo4664t(int i);

    /* renamed from: u */
    public abstract void mo4665u(Parcelable parcelable);

    /* renamed from: v */
    public abstract void mo4666v(String str);

    /* renamed from: w */
    public void mo4667w(C1261vf vfVar) {
        if (vfVar == null) {
            mo4666v((String) null);
            return;
        }
        try {
            mo4666v(mo4647c(vfVar.getClass()).getName());
            C1167tf b = mo4646b();
            try {
                mo4649e(vfVar.getClass()).invoke((Object) null, new Object[]{vfVar, b});
                b.mo4645a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(vfVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
