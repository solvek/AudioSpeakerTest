package p000;

import android.view.View;

/* renamed from: vd */
public class C1257vd {

    /* renamed from: a */
    public final C1259b f4811a;

    /* renamed from: b */
    public C1258a f4812b = new C1258a();

    /* renamed from: vd$a */
    public static class C1258a {

        /* renamed from: a */
        public int f4813a = 0;

        /* renamed from: b */
        public int f4814b;

        /* renamed from: c */
        public int f4815c;

        /* renamed from: d */
        public int f4816d;

        /* renamed from: e */
        public int f4817e;

        /* renamed from: a */
        public boolean mo4902a() {
            int i = this.f4813a;
            if ((i & 7) != 0 && (i & (mo4903b(this.f4816d, this.f4814b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4813a;
            if ((i2 & 112) != 0 && (i2 & (mo4903b(this.f4816d, this.f4815c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4813a;
            if ((i3 & 1792) != 0 && (i3 & (mo4903b(this.f4817e, this.f4814b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4813a;
            return (i4 & 28672) == 0 || (i4 & (mo4903b(this.f4817e, this.f4815c) << 12)) != 0;
        }

        /* renamed from: b */
        public int mo4903b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* renamed from: vd$b */
    public interface C1259b {
        /* renamed from: a */
        int mo1355a();

        /* renamed from: b */
        int mo1356b();

        /* renamed from: c */
        int mo1357c(View view);

        /* renamed from: d */
        int mo1358d(View view);

        /* renamed from: e */
        View mo1359e(int i);
    }

    public C1257vd(C1259b bVar) {
        this.f4811a = bVar;
    }

    /* renamed from: a */
    public View mo4900a(int i, int i2, int i3, int i4) {
        int b = this.f4811a.mo1356b();
        int a = this.f4811a.mo1355a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.f4811a.mo1359e(i);
            int d = this.f4811a.mo1358d(e);
            int c = this.f4811a.mo1357c(e);
            C1258a aVar = this.f4812b;
            aVar.f4814b = b;
            aVar.f4815c = a;
            aVar.f4816d = d;
            aVar.f4817e = c;
            if (i3 != 0) {
                aVar.f4813a = 0;
                aVar.f4813a = i3 | 0;
                if (aVar.mo4902a()) {
                    return e;
                }
            }
            if (i4 != 0) {
                C1258a aVar2 = this.f4812b;
                aVar2.f4813a = 0;
                aVar2.f4813a = i4 | 0;
                if (aVar2.mo4902a()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo4901b(View view, int i) {
        C1258a aVar = this.f4812b;
        int b = this.f4811a.mo1356b();
        int a = this.f4811a.mo1355a();
        int d = this.f4811a.mo1358d(view);
        int c = this.f4811a.mo1357c(view);
        aVar.f4814b = b;
        aVar.f4815c = a;
        aVar.f4816d = d;
        aVar.f4817e = c;
        if (i == 0) {
            return false;
        }
        C1258a aVar2 = this.f4812b;
        aVar2.f4813a = 0;
        aVar2.f4813a = 0 | i;
        return aVar2.mo4902a();
    }
}
