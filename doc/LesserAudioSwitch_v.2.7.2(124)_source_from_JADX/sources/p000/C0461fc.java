package p000;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: fc */
public class C0461fc extends C0414ec {

    /* renamed from: a */
    public final C0967pb f2105a;

    /* renamed from: b */
    public final C0463b f2106b;

    /* renamed from: fc$a */
    public static class C0462a<D> extends C1205ub<D> {
        /* renamed from: d */
        public void mo900d() {
            throw null;
        }

        /* renamed from: e */
        public void mo901e() {
            throw null;
        }

        /* renamed from: f */
        public void mo902f(C1253vb<? super D> vbVar) {
            super.mo902f(vbVar);
        }

        /* renamed from: g */
        public void mo2778g(D d) {
            super.mo2778g(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            C1344x5.m3749c((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: fc$b */
    public static class C0463b extends C1412yb {

        /* renamed from: c */
        public static final C1450zb f2107c = new C0464a();

        /* renamed from: b */
        public C0713k4<C0462a> f2108b = new C0713k4<>(10);

        /* renamed from: fc$b$a */
        public static class C0464a implements C1450zb {
            /* renamed from: a */
            public <T extends C1412yb> T mo2781a(Class<T> cls) {
                return new C0463b();
            }
        }

        /* renamed from: a */
        public void mo2780a() {
            if (this.f2108b.mo3523i() <= 0) {
                C0713k4<C0462a> k4Var = this.f2108b;
                int i = k4Var.f2979e;
                Object[] objArr = k4Var.f2978d;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                k4Var.f2979e = 0;
                k4Var.f2976b = false;
                return;
            }
            this.f2108b.mo3524j(0).getClass();
            throw null;
        }
    }

    public C0461fc(C0967pb pbVar, C0264cc ccVar) {
        this.f2105a = pbVar;
        C1450zb zbVar = C0463b.f2107c;
        Class cls = C0463b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String q = C0279ch.m1120q("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            C1412yb ybVar = ccVar.f1355a.get(q);
            if (!cls.isInstance(ybVar)) {
                ybVar = zbVar instanceof C0018ac ? ((C0018ac) zbVar).mo102a(q, cls) : ((C0463b.C0464a) zbVar).mo2781a(cls);
                C1412yb put = ccVar.f1355a.put(q, ybVar);
                if (put != null) {
                    put.mo2780a();
                }
            } else if (zbVar instanceof C0217bc) {
                C0217bc bcVar = (C0217bc) zbVar;
            }
            this.f2106b = (C0463b) ybVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    /* renamed from: a */
    public void mo2720a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0463b bVar = this.f2106b;
        if (bVar.f2108b.mo3523i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f2108b.mo3523i() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f2108b.mo3520f(0));
                printWriter.print(": ");
                printWriter.println(bVar.f2108b.mo3524j(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1344x5.m3749c(this.f2105a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
