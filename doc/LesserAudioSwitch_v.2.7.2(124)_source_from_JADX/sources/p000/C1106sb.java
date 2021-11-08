package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: sb */
public class C1106sb {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f4180a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends C0768lb>>> f4181b = new HashMap();

    /* renamed from: a */
    public static C0768lb m3160a(Constructor<? extends C0768lb> constructor, Object obj) {
        try {
            return (C0768lb) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m3161b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m3162c(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, List<Constructor<? extends C0768lb>>> map;
        boolean z;
        Integer num = f4180a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<C0922ob> cls2 = C0922ob.class;
        int i = 1;
        if (cls.getCanonicalName() != null) {
            List<?> list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b = m3161b(canonicalName);
                if (!name.isEmpty()) {
                    b = name + "." + b;
                }
                constructor = Class.forName(b).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                map = f4181b;
                list = Collections.singletonList(constructor);
            } else {
                C0671jb jbVar = C0671jb.f2854c;
                Boolean bool = jbVar.f2856b.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                jbVar.f2856b.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((C1302wb) declaredMethods[i2].getAnnotation(C1302wb.class)) != null) {
                                jbVar.mo3423a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (m3162c(superclass) != 1) {
                            list = new ArrayList<>(f4181b.get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (m3162c(cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll(f4181b.get(cls3));
                            }
                            i3++;
                        } else if (list != null) {
                            map = f4181b;
                        }
                    }
                }
            }
            map.put(cls, list);
            i = 2;
        }
        f4180a.put(cls, Integer.valueOf(i));
        return i;
    }
}
