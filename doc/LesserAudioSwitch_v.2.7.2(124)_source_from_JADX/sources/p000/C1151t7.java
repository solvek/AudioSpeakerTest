package p000;

/* renamed from: t7 */
public final class C1151t7 {

    /* renamed from: a */
    public static final C1101s7 f4388a = new C1155d((C1153b) null, false);

    /* renamed from: b */
    public static final C1101s7 f4389b = new C1155d((C1153b) null, true);

    /* renamed from: c */
    public static final C1101s7 f4390c;

    /* renamed from: d */
    public static final C1101s7 f4391d;

    /* renamed from: t7$a */
    public static class C1152a implements C1153b {

        /* renamed from: a */
        public static final C1152a f4392a = new C1152a();

        /* renamed from: a */
        public int mo4631a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                C1101s7 s7Var = C1151t7.f4388a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* renamed from: t7$b */
    public interface C1153b {
        /* renamed from: a */
        int mo4631a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: t7$c */
    public static abstract class C1154c implements C1101s7 {

        /* renamed from: a */
        public final C1153b f4393a;

        public C1154c(C1153b bVar) {
            this.f4393a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo4632a();

        /* renamed from: b */
        public boolean mo4633b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            C1153b bVar = this.f4393a;
            if (bVar == null) {
                return mo4632a();
            }
            int a = bVar.mo4631a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo4632a();
            }
            return false;
        }
    }

    /* renamed from: t7$d */
    public static class C1155d extends C1154c {

        /* renamed from: b */
        public final boolean f4394b;

        public C1155d(C1153b bVar, boolean z) {
            super(bVar);
            this.f4394b = z;
        }

        /* renamed from: a */
        public boolean mo4632a() {
            return this.f4394b;
        }
    }

    static {
        C1152a aVar = C1152a.f4392a;
        f4390c = new C1155d(aVar, false);
        f4391d = new C1155d(aVar, true);
    }
}
