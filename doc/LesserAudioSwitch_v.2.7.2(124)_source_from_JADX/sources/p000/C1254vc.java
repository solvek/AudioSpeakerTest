package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000.C0776ld;

/* renamed from: vc */
public class C1254vc implements C0776ld.C0777a {

    /* renamed from: a */
    public C1346x7<C1256b> f4801a = new C1346x7<>(30);

    /* renamed from: b */
    public final ArrayList<C1256b> f4802b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C1256b> f4803c = new ArrayList<>();

    /* renamed from: d */
    public final C1255a f4804d;

    /* renamed from: e */
    public final C0776ld f4805e;

    /* renamed from: f */
    public int f4806f = 0;

    /* renamed from: vc$a */
    public interface C1255a {
    }

    /* renamed from: vc$b */
    public static class C1256b {

        /* renamed from: a */
        public int f4807a;

        /* renamed from: b */
        public int f4808b;

        /* renamed from: c */
        public Object f4809c;

        /* renamed from: d */
        public int f4810d;

        public C1256b(int i, int i2, int i3, Object obj) {
            this.f4807a = i;
            this.f4808b = i2;
            this.f4810d = i3;
            this.f4809c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1256b.class != obj.getClass()) {
                return false;
            }
            C1256b bVar = (C1256b) obj;
            int i = this.f4807a;
            if (i != bVar.f4807a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4810d - this.f4808b) == 1 && this.f4810d == bVar.f4808b && this.f4808b == bVar.f4810d) {
                return true;
            }
            if (this.f4810d != bVar.f4810d || this.f4808b != bVar.f4808b) {
                return false;
            }
            Object obj2 = this.f4809c;
            Object obj3 = bVar.f4809c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4807a * 31) + this.f4808b) * 31) + this.f4810d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f4807a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f4808b);
            sb.append("c:");
            sb.append(this.f4810d);
            sb.append(",p:");
            sb.append(this.f4809c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C1254vc(C1255a aVar) {
        this.f4804d = aVar;
        this.f4805e = new C0776ld(this);
    }

    /* renamed from: a */
    public final boolean mo4884a(int i) {
        int size = this.f4803c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1256b bVar = this.f4803c.get(i2);
            int i3 = bVar.f4807a;
            if (i3 == 8) {
                if (mo4889f(bVar.f4810d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4808b;
                int i5 = bVar.f4810d + i4;
                while (i4 < i5) {
                    if (mo4889f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo4885b() {
        int size = this.f4803c.size();
        for (int i = 0; i < size; i++) {
            ((C1015qd) this.f4804d).mo4078a(this.f4803c.get(i));
        }
        mo4895l(this.f4803c);
        this.f4806f = 0;
    }

    /* renamed from: c */
    public void mo4886c() {
        mo4885b();
        int size = this.f4802b.size();
        for (int i = 0; i < size; i++) {
            C1256b bVar = this.f4802b.get(i);
            int i2 = bVar.f4807a;
            if (i2 == 1) {
                ((C1015qd) this.f4804d).mo4078a(bVar);
                ((C1015qd) this.f4804d).mo4081d(bVar.f4808b, bVar.f4810d);
            } else if (i2 == 2) {
                ((C1015qd) this.f4804d).mo4078a(bVar);
                C1255a aVar = this.f4804d;
                int i3 = bVar.f4808b;
                int i4 = bVar.f4810d;
                C1015qd qdVar = (C1015qd) aVar;
                qdVar.f3821a.mo1117S(i3, i4, true);
                RecyclerView recyclerView = qdVar.f3821a;
                recyclerView.f965k0 = true;
                recyclerView.f959h0.f1087c += i4;
            } else if (i2 == 4) {
                ((C1015qd) this.f4804d).mo4078a(bVar);
                ((C1015qd) this.f4804d).mo4080c(bVar.f4808b, bVar.f4810d, bVar.f4809c);
            } else if (i2 == 8) {
                ((C1015qd) this.f4804d).mo4078a(bVar);
                ((C1015qd) this.f4804d).mo4082e(bVar.f4808b, bVar.f4810d);
            }
        }
        mo4895l(this.f4802b);
        this.f4806f = 0;
    }

    /* renamed from: d */
    public final void mo4887d(C1256b bVar) {
        int i;
        int i2 = bVar.f4807a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = mo4896m(bVar.f4808b, i2);
        int i3 = bVar.f4808b;
        int i4 = bVar.f4807a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4810d; i6++) {
            int m2 = mo4896m((i * i6) + bVar.f4808b, bVar.f4807a);
            int i7 = bVar.f4807a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                C1256b h = mo4891h(i7, m, i5, bVar.f4809c);
                mo4888e(h, i3);
                mo4894k(h);
                if (bVar.f4807a == 4) {
                    i3 += i5;
                }
                m = m2;
                i5 = 1;
            }
        }
        Object obj = bVar.f4809c;
        mo4894k(bVar);
        if (i5 > 0) {
            C1256b h2 = mo4891h(bVar.f4807a, m, i5, obj);
            mo4888e(h2, i3);
            mo4894k(h2);
        }
    }

    /* renamed from: e */
    public void mo4888e(C1256b bVar, int i) {
        ((C1015qd) this.f4804d).mo4078a(bVar);
        int i2 = bVar.f4807a;
        if (i2 == 2) {
            C1255a aVar = this.f4804d;
            int i3 = bVar.f4810d;
            C1015qd qdVar = (C1015qd) aVar;
            qdVar.f3821a.mo1117S(i, i3, true);
            RecyclerView recyclerView = qdVar.f3821a;
            recyclerView.f965k0 = true;
            recyclerView.f959h0.f1087c += i3;
        } else if (i2 == 4) {
            ((C1015qd) this.f4804d).mo4080c(i, bVar.f4810d, bVar.f4809c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: f */
    public int mo4889f(int i, int i2) {
        int size = this.f4803c.size();
        while (i2 < size) {
            C1256b bVar = this.f4803c.get(i2);
            int i3 = bVar.f4807a;
            if (i3 == 8) {
                int i4 = bVar.f4808b;
                if (i4 == i) {
                    i = bVar.f4810d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4810d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4808b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4810d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4810d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean mo4890g() {
        return this.f4802b.size() > 0;
    }

    /* renamed from: h */
    public C1256b mo4891h(int i, int i2, int i3, Object obj) {
        C1256b a = this.f4801a.mo5053a();
        if (a == null) {
            return new C1256b(i, i2, i3, obj);
        }
        a.f4807a = i;
        a.f4808b = i2;
        a.f4810d = i3;
        a.f4809c = obj;
        return a;
    }

    /* renamed from: i */
    public final void mo4892i(C1256b bVar) {
        this.f4803c.add(bVar);
        int i = bVar.f4807a;
        if (i == 1) {
            ((C1015qd) this.f4804d).mo4081d(bVar.f4808b, bVar.f4810d);
        } else if (i == 2) {
            C1255a aVar = this.f4804d;
            C1015qd qdVar = (C1015qd) aVar;
            qdVar.f3821a.mo1117S(bVar.f4808b, bVar.f4810d, false);
            qdVar.f3821a.f965k0 = true;
        } else if (i == 4) {
            ((C1015qd) this.f4804d).mo4080c(bVar.f4808b, bVar.f4810d, bVar.f4809c);
        } else if (i == 8) {
            ((C1015qd) this.f4804d).mo4082e(bVar.f4808b, bVar.f4810d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014c, code lost:
        if (r4 > r12.f4808b) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0176, code lost:
        if (r4 >= r12.f4808b) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0123  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4893j() {
        /*
            r16 = this;
            r0 = r16
            ld r1 = r0.f4805e
            java.util.ArrayList<vc$b> r2 = r0.f4802b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            vc$b r9 = (p000.C1254vc.C1256b) r9
            int r9 = r9.f4807a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01be
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            vc$b r11 = (p000.C1254vc.C1256b) r11
            java.lang.Object r12 = r2.get(r7)
            vc$b r12 = (p000.C1254vc.C1256b) r12
            int r13 = r12.f4807a
            if (r13 == r4) goto L_0x0194
            if (r13 == r10) goto L_0x00a8
            if (r13 == r9) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f4810d
            int r8 = r12.f4808b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f4808b = r8
            goto L_0x0064
        L_0x004e:
            int r10 = r12.f4810d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0064
            int r10 = r10 + -1
            r12.f4810d = r10
            ld$a r5 = r1.f3146a
            int r8 = r11.f4808b
            java.lang.Object r10 = r12.f4809c
            vc r5 = (p000.C1254vc) r5
            vc$b r4 = r5.mo4891h(r9, r8, r4, r10)
            goto L_0x0065
        L_0x0064:
            r4 = r6
        L_0x0065:
            int r5 = r11.f4808b
            int r8 = r12.f4808b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f4808b = r8
            goto L_0x0087
        L_0x0070:
            int r10 = r12.f4810d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0087
            int r8 = r8 - r5
            ld$a r6 = r1.f3146a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f4809c
            vc r6 = (p000.C1254vc) r6
            vc$b r6 = r6.mo4891h(r9, r5, r8, r10)
            int r5 = r12.f4810d
            int r5 = r5 - r8
            r12.f4810d = r5
        L_0x0087:
            r2.set(r7, r11)
            int r5 = r12.f4810d
            if (r5 <= 0) goto L_0x0092
            r2.set(r3, r12)
            goto L_0x009c
        L_0x0092:
            r2.remove(r3)
            ld$a r5 = r1.f3146a
            vc r5 = (p000.C1254vc) r5
            r5.mo4894k(r12)
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r2.add(r3, r4)
        L_0x00a1:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x00a8:
            int r8 = r11.f4808b
            int r9 = r11.f4810d
            int r13 = r12.f4808b
            if (r8 >= r9) goto L_0x00bd
            if (r13 != r8) goto L_0x00ba
            int r14 = r12.f4810d
            int r8 = r9 - r8
            if (r14 != r8) goto L_0x00ba
            r5 = 0
            goto L_0x00c7
        L_0x00ba:
            r5 = 0
            r8 = 0
            goto L_0x00cc
        L_0x00bd:
            int r14 = r9 + 1
            if (r13 != r14) goto L_0x00ca
            int r14 = r12.f4810d
            int r8 = r8 - r9
            if (r14 != r8) goto L_0x00ca
            r5 = 1
        L_0x00c7:
            r8 = r5
            r5 = 1
            goto L_0x00cc
        L_0x00ca:
            r5 = 0
            r8 = 1
        L_0x00cc:
            if (r9 >= r13) goto L_0x00d3
            int r13 = r13 + -1
            r12.f4808b = r13
            goto L_0x00f0
        L_0x00d3:
            int r14 = r12.f4810d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x00f0
            int r14 = r14 + -1
            r12.f4810d = r14
            r11.f4807a = r10
            r11.f4810d = r4
            int r3 = r12.f4810d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            ld$a r3 = r1.f3146a
            vc r3 = (p000.C1254vc) r3
            r3.mo4894k(r12)
            goto L_0x0009
        L_0x00f0:
            int r4 = r11.f4808b
            int r9 = r12.f4808b
            if (r4 > r9) goto L_0x00fb
            int r9 = r9 + 1
            r12.f4808b = r9
            goto L_0x0112
        L_0x00fb:
            int r13 = r12.f4810d
            int r9 = r9 + r13
            if (r4 >= r9) goto L_0x0112
            int r9 = r9 - r4
            ld$a r13 = r1.f3146a
            int r4 = r4 + 1
            vc r13 = (p000.C1254vc) r13
            vc$b r6 = r13.mo4891h(r10, r4, r9, r6)
            int r4 = r11.f4808b
            int r9 = r12.f4808b
            int r4 = r4 - r9
            r12.f4810d = r4
        L_0x0112:
            if (r5 == 0) goto L_0x0123
            r2.set(r3, r12)
            r2.remove(r7)
            ld$a r3 = r1.f3146a
            vc r3 = (p000.C1254vc) r3
            r3.mo4894k(r11)
            goto L_0x0009
        L_0x0123:
            if (r8 == 0) goto L_0x014f
            if (r6 == 0) goto L_0x013d
            int r4 = r11.f4808b
            int r5 = r6.f4808b
            if (r4 <= r5) goto L_0x0132
            int r5 = r6.f4810d
            int r4 = r4 - r5
            r11.f4808b = r4
        L_0x0132:
            int r4 = r11.f4810d
            int r5 = r6.f4808b
            if (r4 <= r5) goto L_0x013d
            int r5 = r6.f4810d
            int r4 = r4 - r5
            r11.f4810d = r4
        L_0x013d:
            int r4 = r11.f4808b
            int r5 = r12.f4808b
            if (r4 <= r5) goto L_0x0148
            int r5 = r12.f4810d
            int r4 = r4 - r5
            r11.f4808b = r4
        L_0x0148:
            int r4 = r11.f4810d
            int r5 = r12.f4808b
            if (r4 <= r5) goto L_0x017d
            goto L_0x0178
        L_0x014f:
            if (r6 == 0) goto L_0x0167
            int r4 = r11.f4808b
            int r5 = r6.f4808b
            if (r4 < r5) goto L_0x015c
            int r5 = r6.f4810d
            int r4 = r4 - r5
            r11.f4808b = r4
        L_0x015c:
            int r4 = r11.f4810d
            int r5 = r6.f4808b
            if (r4 < r5) goto L_0x0167
            int r5 = r6.f4810d
            int r4 = r4 - r5
            r11.f4810d = r4
        L_0x0167:
            int r4 = r11.f4808b
            int r5 = r12.f4808b
            if (r4 < r5) goto L_0x0172
            int r5 = r12.f4810d
            int r4 = r4 - r5
            r11.f4808b = r4
        L_0x0172:
            int r4 = r11.f4810d
            int r5 = r12.f4808b
            if (r4 < r5) goto L_0x017d
        L_0x0178:
            int r5 = r12.f4810d
            int r4 = r4 - r5
            r11.f4810d = r4
        L_0x017d:
            r2.set(r3, r12)
            int r4 = r11.f4808b
            int r5 = r11.f4810d
            if (r4 == r5) goto L_0x018a
            r2.set(r7, r11)
            goto L_0x018d
        L_0x018a:
            r2.remove(r7)
        L_0x018d:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x0194:
            int r4 = r11.f4810d
            int r6 = r12.f4808b
            if (r4 >= r6) goto L_0x019c
            r5 = -1
            goto L_0x019d
        L_0x019c:
            r5 = 0
        L_0x019d:
            int r8 = r11.f4808b
            if (r8 >= r6) goto L_0x01a3
            int r5 = r5 + 1
        L_0x01a3:
            if (r6 > r8) goto L_0x01aa
            int r6 = r12.f4810d
            int r8 = r8 + r6
            r11.f4808b = r8
        L_0x01aa:
            int r6 = r12.f4808b
            if (r6 > r4) goto L_0x01b3
            int r8 = r12.f4810d
            int r4 = r4 + r8
            r11.f4810d = r4
        L_0x01b3:
            int r6 = r6 + r5
            r12.f4808b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01be:
            java.util.ArrayList<vc$b> r1 = r0.f4802b
            int r1 = r1.size()
            r2 = 0
        L_0x01c5:
            if (r2 >= r1) goto L_0x0290
            java.util.ArrayList<vc$b> r3 = r0.f4802b
            java.lang.Object r3 = r3.get(r2)
            vc$b r3 = (p000.C1254vc.C1256b) r3
            int r11 = r3.f4807a
            if (r11 == r4) goto L_0x0289
            if (r11 == r10) goto L_0x0233
            if (r11 == r9) goto L_0x01e0
            if (r11 == r7) goto L_0x01db
            goto L_0x028c
        L_0x01db:
            r0.mo4892i(r3)
            goto L_0x028c
        L_0x01e0:
            int r11 = r3.f4808b
            int r12 = r3.f4810d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x01e8:
            if (r11 >= r12) goto L_0x021c
            vc$a r5 = r0.f4804d
            qd r5 = (p000.C1015qd) r5
            androidx.recyclerview.widget.RecyclerView$a0 r5 = r5.mo4079b(r11)
            if (r5 != 0) goto L_0x020a
            boolean r5 = r0.mo4884a(r11)
            if (r5 == 0) goto L_0x01fb
            goto L_0x020a
        L_0x01fb:
            if (r15 != r4) goto L_0x0208
            java.lang.Object r5 = r3.f4809c
            vc$b r5 = r0.mo4891h(r9, r13, r14, r5)
            r0.mo4892i(r5)
            r13 = r11
            r14 = 0
        L_0x0208:
            r15 = 0
            goto L_0x0218
        L_0x020a:
            if (r15 != 0) goto L_0x0217
            java.lang.Object r5 = r3.f4809c
            vc$b r5 = r0.mo4891h(r9, r13, r14, r5)
            r0.mo4887d(r5)
            r13 = r11
            r14 = 0
        L_0x0217:
            r15 = 1
        L_0x0218:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x01e8
        L_0x021c:
            int r5 = r3.f4810d
            if (r14 == r5) goto L_0x0229
            java.lang.Object r5 = r3.f4809c
            r0.mo4894k(r3)
            vc$b r3 = r0.mo4891h(r9, r13, r14, r5)
        L_0x0229:
            if (r15 != 0) goto L_0x022f
            r0.mo4887d(r3)
            goto L_0x028c
        L_0x022f:
            r0.mo4892i(r3)
            goto L_0x028c
        L_0x0233:
            int r5 = r3.f4808b
            int r11 = r3.f4810d
            int r11 = r11 + r5
            r12 = r5
            r13 = 0
            r14 = -1
        L_0x023b:
            if (r12 >= r11) goto L_0x0274
            vc$a r15 = r0.f4804d
            qd r15 = (p000.C1015qd) r15
            androidx.recyclerview.widget.RecyclerView$a0 r15 = r15.mo4079b(r12)
            if (r15 != 0) goto L_0x025c
            boolean r15 = r0.mo4884a(r12)
            if (r15 == 0) goto L_0x024e
            goto L_0x025c
        L_0x024e:
            if (r14 != r4) goto L_0x0259
            vc$b r14 = r0.mo4891h(r10, r5, r13, r6)
            r0.mo4892i(r14)
            r14 = 1
            goto L_0x025a
        L_0x0259:
            r14 = 0
        L_0x025a:
            r15 = 0
            goto L_0x0269
        L_0x025c:
            if (r14 != 0) goto L_0x0267
            vc$b r14 = r0.mo4891h(r10, r5, r13, r6)
            r0.mo4887d(r14)
            r14 = 1
            goto L_0x0268
        L_0x0267:
            r14 = 0
        L_0x0268:
            r15 = 1
        L_0x0269:
            if (r14 == 0) goto L_0x026f
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x0271
        L_0x026f:
            int r13 = r13 + 1
        L_0x0271:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x023b
        L_0x0274:
            int r11 = r3.f4810d
            if (r13 == r11) goto L_0x027f
            r0.mo4894k(r3)
            vc$b r3 = r0.mo4891h(r10, r5, r13, r6)
        L_0x027f:
            if (r14 != 0) goto L_0x0285
            r0.mo4887d(r3)
            goto L_0x028c
        L_0x0285:
            r0.mo4892i(r3)
            goto L_0x028c
        L_0x0289:
            r0.mo4892i(r3)
        L_0x028c:
            int r2 = r2 + 1
            goto L_0x01c5
        L_0x0290:
            java.util.ArrayList<vc$b> r1 = r0.f4802b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1254vc.mo4893j():void");
    }

    /* renamed from: k */
    public void mo4894k(C1256b bVar) {
        bVar.f4809c = null;
        this.f4801a.mo5054b(bVar);
    }

    /* renamed from: l */
    public void mo4895l(List<C1256b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4894k(list.get(i));
        }
        list.clear();
    }

    /* renamed from: m */
    public final int mo4896m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f4803c.size() - 1; size >= 0; size--) {
            C1256b bVar = this.f4803c.get(size);
            int i9 = bVar.f4807a;
            if (i9 == 8) {
                int i10 = bVar.f4808b;
                int i11 = bVar.f4810d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f4808b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f4808b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f4810d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f4810d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f4808b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f4808b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f4808b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f4810d;
                } else if (i9 == 2) {
                    i += bVar.f4810d;
                }
            }
        }
        for (int size2 = this.f4803c.size() - 1; size2 >= 0; size2--) {
            C1256b bVar2 = this.f4803c.get(size2);
            if (bVar2.f4807a == 8) {
                int i13 = bVar2.f4810d;
                if (i13 != bVar2.f4808b && i13 >= 0) {
                }
            } else if (bVar2.f4810d > 0) {
            }
            this.f4803c.remove(size2);
            mo4894k(bVar2);
        }
        return i;
    }
}
