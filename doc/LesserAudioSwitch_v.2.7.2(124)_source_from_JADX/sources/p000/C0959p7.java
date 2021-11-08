package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p000.C1151t7;

/* renamed from: p7 */
public final class C0959p7 {

    /* renamed from: d */
    public static final C1101s7 f3569d;

    /* renamed from: e */
    public static final String f3570e = Character.toString(8206);

    /* renamed from: f */
    public static final String f3571f = Character.toString(8207);

    /* renamed from: g */
    public static final C0959p7 f3572g;

    /* renamed from: h */
    public static final C0959p7 f3573h;

    /* renamed from: a */
    public final boolean f3574a;

    /* renamed from: b */
    public final int f3575b;

    /* renamed from: c */
    public final C1101s7 f3576c;

    /* renamed from: p7$a */
    public static class C0960a {

        /* renamed from: e */
        public static final byte[] f3577e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f3578a;

        /* renamed from: b */
        public final int f3579b;

        /* renamed from: c */
        public int f3580c;

        /* renamed from: d */
        public char f3581d;

        static {
            for (int i = 0; i < 1792; i++) {
                f3577e[i] = Character.getDirectionality(i);
            }
        }

        public C0960a(CharSequence charSequence, boolean z) {
            this.f3578a = charSequence;
            this.f3579b = charSequence.length();
        }

        /* renamed from: a */
        public byte mo3974a() {
            char charAt = this.f3578a.charAt(this.f3580c - 1);
            this.f3581d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3578a, this.f3580c);
                this.f3580c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3580c--;
            char c = this.f3581d;
            return c < 1792 ? f3577e[c] : Character.getDirectionality(c);
        }
    }

    static {
        C1101s7 s7Var = C1151t7.f4390c;
        f3569d = s7Var;
        f3572g = new C0959p7(false, 2, s7Var);
        f3573h = new C0959p7(true, 2, s7Var);
    }

    public C0959p7(boolean z, int i, C1101s7 s7Var) {
        this.f3574a = z;
        this.f3575b = i;
        this.f3576c = s7Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2781a(java.lang.CharSequence r9) {
        /*
            p7$a r0 = new p7$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f3580c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.f3580c
            int r7 = r0.f3579b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f3578a
            char r6 = r7.charAt(r6)
            r0.f3581d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f3578a
            int r7 = r0.f3580c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f3580c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f3580c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f3580c
            int r6 = r6 + r2
            r0.f3580c = r6
            char r6 = r0.f3581d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = p000.C0959p7.C0960a.f3577e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f3580c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.mo3974a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = 1
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = -1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0959p7.m2781a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r6 = r6 - 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2782b(java.lang.CharSequence r6) {
        /*
            p7$a r0 = new p7$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f3579b
            r0.f3580c = r6
            r6 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f3580c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.mo3974a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r6) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r2 != r6) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r6 = r6 + -1
            goto L_0x000c
        L_0x0032:
            if (r6 != 0) goto L_0x0036
        L_0x0034:
            r1 = 1
            goto L_0x0041
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r6 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r2 != 0) goto L_0x000c
        L_0x003f:
            r2 = r6
            goto L_0x000c
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0959p7.m2782b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C0959p7 m2783c() {
        boolean z = true;
        if (C1201u7.m3366a(Locale.getDefault()) != 1) {
            z = false;
        }
        C1101s7 s7Var = f3569d;
        if (s7Var == f3569d) {
            return z ? f3573h : f3572g;
        }
        return new C0959p7(z, 2, s7Var);
    }

    /* renamed from: d */
    public CharSequence mo3973d(CharSequence charSequence, C1101s7 s7Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b = ((C1151t7.C1154c) s7Var).mo4633b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f3575b & 2) != 0) && z) {
            boolean b2 = ((C1151t7.C1154c) (b ? C1151t7.f4389b : C1151t7.f4388a)).mo4633b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((this.f3574a || (!b2 && m2781a(charSequence) != 1)) ? (!this.f3574a || (b2 && m2781a(charSequence) != -1)) ? str : f3571f : f3570e);
        }
        if (b != this.f3574a) {
            spannableStringBuilder.append(b ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b3 = ((C1151t7.C1154c) (b ? C1151t7.f4389b : C1151t7.f4388a)).mo4633b(charSequence, 0, charSequence.length());
            if (!this.f3574a && (b3 || m2782b(charSequence) == 1)) {
                str = f3570e;
            } else if (this.f3574a && (!b3 || m2782b(charSequence) == -1)) {
                str = f3571f;
            }
            spannableStringBuilder.append(str);
        }
        return spannableStringBuilder;
    }
}
