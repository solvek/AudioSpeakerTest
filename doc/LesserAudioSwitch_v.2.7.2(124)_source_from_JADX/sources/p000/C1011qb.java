package p000;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C0821mb;
import p000.C1141t3;

/* renamed from: qb */
public class C1011qb extends C0821mb {

    /* renamed from: a */
    public C1097s3<C0922ob, C1012a> f3808a = new C1097s3<>();

    /* renamed from: b */
    public C0821mb.C0823b f3809b;

    /* renamed from: c */
    public final WeakReference<C0967pb> f3810c;

    /* renamed from: d */
    public int f3811d = 0;

    /* renamed from: e */
    public boolean f3812e = false;

    /* renamed from: f */
    public boolean f3813f = false;

    /* renamed from: g */
    public ArrayList<C0821mb.C0823b> f3814g = new ArrayList<>();

    /* renamed from: qb$a */
    public static class C1012a {

        /* renamed from: a */
        public C0821mb.C0823b f3815a;

        /* renamed from: b */
        public C0868nb f3816b;

        public C1012a(C0922ob obVar, C0821mb.C0823b bVar) {
            C0868nb nbVar;
            Map<Class<?>, Integer> map = C1106sb.f4180a;
            boolean z = obVar instanceof C0868nb;
            boolean z2 = obVar instanceof C0722kb;
            if (z && z2) {
                nbVar = new FullLifecycleObserverAdapter((C0722kb) obVar, (C0868nb) obVar);
            } else if (z2) {
                nbVar = new FullLifecycleObserverAdapter((C0722kb) obVar, (C0868nb) null);
            } else if (z) {
                nbVar = (C0868nb) obVar;
            } else {
                Class<?> cls = obVar.getClass();
                if (C1106sb.m3162c(cls) == 2) {
                    List list = C1106sb.f4181b.get(cls);
                    if (list.size() == 1) {
                        nbVar = new SingleGeneratedAdapterObserver(C1106sb.m3160a((Constructor) list.get(0), obVar));
                    } else {
                        C0768lb[] lbVarArr = new C0768lb[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            lbVarArr[i] = C1106sb.m3160a((Constructor) list.get(i), obVar);
                        }
                        nbVar = new CompositeGeneratedAdaptersObserver(lbVarArr);
                    }
                } else {
                    nbVar = new ReflectiveGenericLifecycleObserver(obVar);
                }
            }
            this.f3816b = nbVar;
            this.f3815a = bVar;
        }

        /* renamed from: a */
        public void mo4076a(C0967pb pbVar, C0821mb.C0822a aVar) {
            C0821mb.C0823b c = C1011qb.m2919c(aVar);
            this.f3815a = C1011qb.m2920e(this.f3815a, c);
            this.f3816b.mo132g(pbVar, aVar);
            this.f3815a = c;
        }
    }

    public C1011qb(C0967pb pbVar) {
        this.f3810c = new WeakReference<>(pbVar);
        this.f3809b = C0821mb.C0823b.INITIALIZED;
    }

    /* renamed from: c */
    public static C0821mb.C0823b m2919c(C0821mb.C0822a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return C0821mb.C0823b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return C0821mb.C0823b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return C0821mb.C0823b.STARTED;
        }
        return C0821mb.C0823b.CREATED;
    }

    /* renamed from: e */
    public static C0821mb.C0823b m2920e(C0821mb.C0823b bVar, C0821mb.C0823b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: i */
    public static C0821mb.C0822a m2921i(C0821mb.C0823b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return C0821mb.C0822a.ON_CREATE;
        }
        if (ordinal == 2) {
            return C0821mb.C0822a.ON_START;
        }
        if (ordinal == 3) {
            return C0821mb.C0822a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo3678a(C0922ob obVar) {
        C0967pb pbVar;
        C0821mb.C0823b bVar = this.f3809b;
        C0821mb.C0823b bVar2 = C0821mb.C0823b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0821mb.C0823b.INITIALIZED;
        }
        C1012a aVar = new C1012a(obVar, bVar2);
        if (this.f3808a.mo4421d(obVar, aVar) == null && (pbVar = (C0967pb) this.f3810c.get()) != null) {
            boolean z = this.f3811d != 0 || this.f3812e;
            C0821mb.C0823b b = mo4071b(obVar);
            this.f3811d++;
            while (aVar.f3815a.compareTo(b) < 0 && this.f3808a.f4156f.containsKey(obVar)) {
                this.f3814g.add(aVar.f3815a);
                aVar.mo4076a(pbVar, m2921i(aVar.f3815a));
                mo4074g();
                b = mo4071b(obVar);
            }
            if (!z) {
                mo4075h();
            }
            this.f3811d--;
        }
    }

    /* renamed from: b */
    public final C0821mb.C0823b mo4071b(C0922ob obVar) {
        C1097s3<C0922ob, C1012a> s3Var = this.f3808a;
        C0821mb.C0823b bVar = null;
        C1141t3.C1144c<K, V> cVar = s3Var.f4156f.containsKey(obVar) ? s3Var.f4156f.get(obVar).f4356e : null;
        C0821mb.C0823b bVar2 = cVar != null ? ((C1012a) cVar.f4354c).f3815a : null;
        if (!this.f3814g.isEmpty()) {
            ArrayList<C0821mb.C0823b> arrayList = this.f3814g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m2920e(m2920e(this.f3809b, bVar2), bVar);
    }

    /* renamed from: d */
    public void mo4072d(C0821mb.C0822a aVar) {
        mo4073f(m2919c(aVar));
    }

    /* renamed from: f */
    public final void mo4073f(C0821mb.C0823b bVar) {
        if (this.f3809b != bVar) {
            this.f3809b = bVar;
            if (this.f3812e || this.f3811d != 0) {
                this.f3813f = true;
                return;
            }
            this.f3812e = true;
            mo4075h();
            this.f3812e = false;
        }
    }

    /* renamed from: g */
    public final void mo4074g() {
        ArrayList<C0821mb.C0823b> arrayList = this.f3814g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = ((p000.C1011qb.C1012a) r1.f4349b.f4354c).f3815a;
        r5 = ((p000.C1011qb.C1012a) r1.f4350c.f4354c).f3815a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4075h() {
        /*
            r8 = this;
            java.lang.ref.WeakReference<pb> r0 = r8.f3810c
            java.lang.Object r0 = r0.get()
            pb r0 = (p000.C0967pb) r0
            if (r0 == 0) goto L_0x0133
        L_0x000a:
            s3<ob, qb$a> r1 = r8.f3808a
            int r2 = r1.f4352e
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0013
            goto L_0x0029
        L_0x0013:
            t3$c<K, V> r2 = r1.f4349b
            V r2 = r2.f4354c
            qb$a r2 = (p000.C1011qb.C1012a) r2
            mb$b r2 = r2.f3815a
            t3$c<K, V> r5 = r1.f4350c
            V r5 = r5.f4354c
            qb$a r5 = (p000.C1011qb.C1012a) r5
            mb$b r5 = r5.f3815a
            if (r2 != r5) goto L_0x002b
            mb$b r2 = r8.f3809b
            if (r2 != r5) goto L_0x002b
        L_0x0029:
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r8.f3813f = r3
            if (r2 != 0) goto L_0x0132
            mb$b r2 = r8.f3809b
            t3$c<K, V> r1 = r1.f4349b
            V r1 = r1.f4354c
            qb$a r1 = (p000.C1011qb.C1012a) r1
            mb$b r1 = r1.f3815a
            int r1 = r2.compareTo(r1)
            if (r1 >= 0) goto L_0x00d0
            s3<ob, qb$a> r1 = r8.f3808a
            t3$b r2 = new t3$b
            t3$c<K, V> r3 = r1.f4350c
            t3$c<K, V> r5 = r1.f4349b
            r2.<init>(r3, r5)
            java.util.WeakHashMap<t3$f<K, V>, java.lang.Boolean> r1 = r1.f4351d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L_0x0052:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r8.f3813f
            if (r1 != 0) goto L_0x00d0
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            qb$a r3 = (p000.C1011qb.C1012a) r3
        L_0x0068:
            mb$b r5 = r3.f3815a
            mb$b r6 = r8.f3809b
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x0052
            boolean r5 = r8.f3813f
            if (r5 != 0) goto L_0x0052
            s3<ob, qb$a> r5 = r8.f3808a
            java.lang.Object r6 = r1.getKey()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0052
            mb$b r5 = r3.f3815a
            int r6 = r5.ordinal()
            if (r6 == 0) goto L_0x00ca
            if (r6 == r4) goto L_0x00c4
            r7 = 2
            if (r6 == r7) goto L_0x00b2
            r7 = 3
            if (r6 == r7) goto L_0x00af
            r7 = 4
            if (r6 != r7) goto L_0x0098
            mb$a r5 = p000.C0821mb.C0822a.ON_PAUSE
            goto L_0x00b4
        L_0x0098:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state value "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00af:
            mb$a r5 = p000.C0821mb.C0822a.ON_STOP
            goto L_0x00b4
        L_0x00b2:
            mb$a r5 = p000.C0821mb.C0822a.ON_DESTROY
        L_0x00b4:
            mb$b r6 = m2919c(r5)
            java.util.ArrayList<mb$b> r7 = r8.f3814g
            r7.add(r6)
            r3.mo4076a(r0, r5)
            r8.mo4074g()
            goto L_0x0068
        L_0x00c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00d0:
            s3<ob, qb$a> r1 = r8.f3808a
            t3$c<K, V> r1 = r1.f4350c
            boolean r2 = r8.f3813f
            if (r2 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            mb$b r2 = r8.f3809b
            V r1 = r1.f4354c
            qb$a r1 = (p000.C1011qb.C1012a) r1
            mb$b r1 = r1.f3815a
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            s3<ob, qb$a> r1 = r8.f3808a
            t3$d r1 = r1.mo4602b()
        L_0x00ee:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x000a
            boolean r2 = r8.f3813f
            if (r2 != 0) goto L_0x000a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            qb$a r3 = (p000.C1011qb.C1012a) r3
        L_0x0104:
            mb$b r4 = r3.f3815a
            mb$b r5 = r8.f3809b
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L_0x00ee
            boolean r4 = r8.f3813f
            if (r4 != 0) goto L_0x00ee
            s3<ob, qb$a> r4 = r8.f3808a
            java.lang.Object r5 = r2.getKey()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00ee
            mb$b r4 = r3.f3815a
            java.util.ArrayList<mb$b> r5 = r8.f3814g
            r5.add(r4)
            mb$b r4 = r3.f3815a
            mb$a r4 = m2921i(r4)
            r3.mo4076a(r0, r4)
            r8.mo4074g()
            goto L_0x0104
        L_0x0132:
            return
        L_0x0133:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            goto L_0x013c
        L_0x013b:
            throw r0
        L_0x013c:
            goto L_0x013b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1011qb.mo4075h():void");
    }
}
