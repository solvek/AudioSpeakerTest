package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0821mb;

/* renamed from: jb */
public class C0671jb {

    /* renamed from: c */
    public static C0671jb f2854c = new C0671jb();

    /* renamed from: a */
    public final Map<Class<?>, C0672a> f2855a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f2856b = new HashMap();

    /* renamed from: jb$a */
    public static class C0672a {

        /* renamed from: a */
        public final Map<C0821mb.C0822a, List<C0673b>> f2857a = new HashMap();

        /* renamed from: b */
        public final Map<C0673b, C0821mb.C0822a> f2858b;

        public C0672a(Map<C0673b, C0821mb.C0822a> map) {
            this.f2858b = map;
            for (Map.Entry next : map.entrySet()) {
                C0821mb.C0822a aVar = (C0821mb.C0822a) next.getValue();
                List list = this.f2857a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2857a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: a */
        public static void m2121a(List<C0673b> list, C0967pb pbVar, C0821mb.C0822a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0673b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i = bVar.f2859a;
                        if (i == 0) {
                            bVar.f2860b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f2860b.invoke(obj, new Object[]{pbVar});
                        } else if (i == 2) {
                            bVar.f2860b.invoke(obj, new Object[]{pbVar, aVar});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: jb$b */
    public static class C0673b {

        /* renamed from: a */
        public final int f2859a;

        /* renamed from: b */
        public final Method f2860b;

        public C0673b(int i, Method method) {
            this.f2859a = i;
            this.f2860b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0673b.class != obj.getClass()) {
                return false;
            }
            C0673b bVar = (C0673b) obj;
            return this.f2859a == bVar.f2859a && this.f2860b.getName().equals(bVar.f2860b.getName());
        }

        public int hashCode() {
            return this.f2860b.getName().hashCode() + (this.f2859a * 31);
        }
    }

    /* renamed from: a */
    public final C0672a mo3423a(Class<?> cls, Method[] methodArr) {
        int i;
        C0672a b;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo3424b(superclass)) == null)) {
            hashMap.putAll(b.f2858b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3424b(b2).f2858b.entrySet()) {
                mo3425c(hashMap, (C0673b) next.getKey(), (C0821mb.C0822a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1302wb wbVar = (C1302wb) method.getAnnotation(C1302wb.class);
            if (wbVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0967pb.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0821mb.C0822a value = wbVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0821mb.C0822a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0821mb.C0822a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo3425c(hashMap, new C0673b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0672a aVar = new C0672a(hashMap);
        this.f2855a.put(cls, aVar);
        this.f2856b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public C0672a mo3424b(Class<?> cls) {
        C0672a aVar = this.f2855a.get(cls);
        return aVar != null ? aVar : mo3423a(cls, (Method[]) null);
    }

    /* renamed from: c */
    public final void mo3425c(Map<C0673b, C0821mb.C0822a> map, C0673b bVar, C0821mb.C0822a aVar, Class<?> cls) {
        C0821mb.C0822a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2860b;
            StringBuilder c = C0279ch.m1106c("Method ");
            c.append(method.getName());
            c.append(" in ");
            c.append(cls.getName());
            c.append(" already declared with different @OnLifecycleEvent value: previous value ");
            c.append(aVar2);
            c.append(", new value ");
            c.append(aVar);
            throw new IllegalArgumentException(c.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
