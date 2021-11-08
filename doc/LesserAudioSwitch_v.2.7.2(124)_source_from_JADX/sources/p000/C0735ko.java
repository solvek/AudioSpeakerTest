package p000;

import android.content.Context;
import android.media.AudioManager;
import java.lang.reflect.Method;

/* renamed from: ko */
public class C0735ko {

    /* renamed from: c */
    public static final C0738c[] f3014c = {C0738c.f3030c, C0738c.f3031d, C0738c.f3032e, C0738c.f3033f, C0738c.f3034g, C0738c.f3035h, C0738c.f3036i};

    /* renamed from: d */
    public static Class<?> f3015d;

    /* renamed from: e */
    public static Method f3016e;

    /* renamed from: f */
    public static Method f3017f;

    /* renamed from: g */
    public static Method f3018g;

    /* renamed from: h */
    public static boolean f3019h;

    /* renamed from: a */
    public AudioManager f3020a;

    /* renamed from: b */
    public Context f3021b;

    /* renamed from: ko$a */
    public enum C0736a {
        f3022b,
        f3023c,
        f3024d
    }

    /* renamed from: ko$b */
    public enum C0737b {
        f3026b,
        f3027c,
        f3028d
    }

    /* renamed from: ko$c */
    public enum C0738c {
        f3030c(0),
        f3031d(1),
        f3032e(2),
        f3033f(3),
        f3034g(4),
        f3035h(5),
        f3036i(6),
        f3037j(7);
        

        /* renamed from: b */
        public int f3039b;

        /* access modifiers changed from: public */
        C0738c(int i) {
            this.f3039b = -1;
            this.f3039b = i;
        }
    }

    /* renamed from: ko$d */
    public enum C0739d {
        f3040c(-1),
        f3041d(0),
        f3042e(1),
        f3043f(2),
        f3044g(3),
        f3045h(4),
        f3046i(5),
        f3047j(6),
        f3048k(7),
        f3049l(8),
        f3050m(9),
        f3051n(10),
        f3052o(11),
        f3053p(12),
        f3054q(13),
        f3055r(14),
        f3056s(15),
        f3057t(0);
        

        /* renamed from: b */
        public int f3059b;

        /* access modifiers changed from: public */
        C0739d(int i) {
            this.f3059b = -1;
            this.f3059b = i;
        }
    }

    /* renamed from: ko$e */
    public interface C0740e {
        /* renamed from: a */
        void mo2960a();
    }

    /* renamed from: ko$f */
    public enum C0741f {
        f3060c(-1),
        f3061d(0),
        f3062e(1),
        f3063f(2),
        f3064g(3),
        f3065h(4),
        f3066i(5),
        f3067j(6),
        f3068k(7),
        f3069l(8),
        f3070m(9),
        f3071n(10);
        

        /* renamed from: b */
        public int f3073b;

        /* access modifiers changed from: public */
        C0741f(int i) {
            this.f3073b = -1;
            this.f3073b = i;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0100 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0139 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0104 A[Catch:{ all -> 0x0213 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013d A[Catch:{ all -> 0x0213 }] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = -27203006190764(0xffffe7424e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27276020634796(0xffffe7314e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27370509915308(0xffffe71b4e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27447819326636(0xffffe7094e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27477884097708(0xffffe7024e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27499358934188(0xffffe6fd4e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27576668345516(0xffffe6eb4e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27611028083884(0xffffe6e34e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = -27692632462508(0xffffe6d04e7aab54, double:NaN)
            p000.C0200av.m970a(r1)
            r1 = 7
            ko$c[] r1 = new p000.C0735ko.C0738c[r1]
            ko$c r2 = p000.C0735ko.C0738c.f3030c
            r3 = 0
            r1[r3] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3031d
            r4 = 1
            r1[r4] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3032e
            r5 = 2
            r1[r5] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3033f
            r6 = 3
            r1[r6] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3034g
            r7 = 4
            r1[r7] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3035h
            r8 = 5
            r1[r8] = r2
            ko$c r2 = p000.C0735ko.C0738c.f3036i
            r8 = 6
            r1[r8] = r2
            f3014c = r1
            f3019h = r3
            r1 = -27722697233580(0xffffe6c94e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0084 }
            f3015d = r1     // Catch:{ all -> 0x0084 }
            goto L_0x009d
        L_0x0084:
            r1 = move-exception
            r8 = -27834366383276(0xffffe6af4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r8)
            r8 = -27864431154348(0xffffe6a84e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r8)
            p000.C0550gu.m1819a(r2, r8)
            r1.printStackTrace()
        L_0x009d:
            java.lang.Class<android.media.AudioManager> r1 = android.media.AudioManager.class
            r8 = -28010460042412(0xffffe6864e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r8)     // Catch:{ all -> 0x00b8 }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x00b8 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b8 }
            r8[r3] = r9     // Catch:{ all -> 0x00b8 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r8)     // Catch:{ all -> 0x00b8 }
            f3018g = r1     // Catch:{ all -> 0x00b8 }
            r1.setAccessible(r4)     // Catch:{ all -> 0x00b8 }
            goto L_0x00d1
        L_0x00b8:
            r1 = move-exception
            r8 = -28096359388332(0xffffe6724e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r8)
            r8 = -28126424159404(0xffffe66b4e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r8)
            p000.C0550gu.m1819a(r2, r8)
            r1.printStackTrace()
        L_0x00d1:
            go r1 = p000.C0433ep.f2030b
            go r2 = p000.C0433ep.f2034f
            if (r1 == r2) goto L_0x00de
            go r2 = p000.C0433ep.f2029a
            if (r1 != r2) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r1 = 0
            goto L_0x00df
        L_0x00de:
            r1 = 1
        L_0x00df:
            r2 = 0
            r8 = 23
            java.lang.Class<?> r9 = f3015d     // Catch:{ all -> 0x0100 }
            r10 = -28306812785836(0xffffe6414e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x0100 }
            java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x0100 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0100 }
            r11[r3] = r12     // Catch:{ all -> 0x0100 }
            r11[r4] = r12     // Catch:{ all -> 0x0100 }
            r11[r5] = r0     // Catch:{ all -> 0x0100 }
            r11[r6] = r0     // Catch:{ all -> 0x0100 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x0100 }
            f3016e = r9     // Catch:{ all -> 0x0100 }
            goto L_0x0119
        L_0x0100:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0213 }
            if (r9 < r8) goto L_0x0119
            r9 = -28414186968236(0xffffe6284e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)     // Catch:{ all -> 0x0213 }
            r10 = -28444251739308(0xffffe6214e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x0213 }
            p000.C0550gu.m1819a(r9, r10)     // Catch:{ all -> 0x0213 }
        L_0x0119:
            java.lang.reflect.Method r9 = f3016e     // Catch:{ all -> 0x0213 }
            if (r9 != 0) goto L_0x0152
            java.lang.Class<?> r9 = f3015d     // Catch:{ all -> 0x0139 }
            r10 = -28689064875180(0xffffe5e84e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x0139 }
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ all -> 0x0139 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0139 }
            r6[r3] = r11     // Catch:{ all -> 0x0139 }
            r6[r4] = r11     // Catch:{ all -> 0x0139 }
            r6[r5] = r0     // Catch:{ all -> 0x0139 }
            java.lang.reflect.Method r0 = r9.getMethod(r10, r6)     // Catch:{ all -> 0x0139 }
            f3016e = r0     // Catch:{ all -> 0x0139 }
            goto L_0x0152
        L_0x0139:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0213 }
            if (r0 >= r8) goto L_0x0152
            r5 = -28796439057580(0xffffe5cf4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            r5 = -28826503828652(0xffffe5c84e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            p000.C0550gu.m1819a(r0, r5)     // Catch:{ all -> 0x0213 }
        L_0x0152:
            java.lang.reflect.Method r0 = f3016e     // Catch:{ all -> 0x0213 }
            if (r0 != 0) goto L_0x01b5
            java.lang.Class<?> r0 = f3015d     // Catch:{ all -> 0x0213 }
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch:{ all -> 0x0213 }
            r5 = -1
            int r6 = r0.length     // Catch:{ all -> 0x0213 }
        L_0x015e:
            if (r3 >= r6) goto L_0x01b5
            r8 = r0[r3]     // Catch:{ all -> 0x0213 }
            if (r8 == 0) goto L_0x01b2
            java.lang.String r9 = r8.getName()     // Catch:{ all -> 0x0213 }
            r10 = -29071316964524(0xffffe58f4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)     // Catch:{ all -> 0x0213 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0213 }
            if (r9 == 0) goto L_0x01b2
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch:{ all -> 0x0213 }
            int r9 = r9.length     // Catch:{ all -> 0x0213 }
            if (r9 <= r5) goto L_0x01b2
            if (r9 <= r7) goto L_0x01af
            boolean r10 = p000.C0728kh.m2305u()     // Catch:{ all -> 0x0213 }
            if (r10 != 0) goto L_0x01af
            r9 = -29178691146924(0xffffe5764e7aab54, double:NaN)
            java.lang.String r9 = p000.C0200av.m970a(r9)     // Catch:{ all -> 0x0213 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0213 }
            r10.<init>()     // Catch:{ all -> 0x0213 }
            r11 = -29208755917996(0xffffe56f4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)     // Catch:{ all -> 0x0213 }
            r10.append(r11)     // Catch:{ all -> 0x0213 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0213 }
            r10.append(r8)     // Catch:{ all -> 0x0213 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0213 }
            p000.C0550gu.m1819a(r9, r8)     // Catch:{ all -> 0x0213 }
            goto L_0x01b2
        L_0x01af:
            f3016e = r8     // Catch:{ all -> 0x0213 }
            r5 = r9
        L_0x01b2:
            int r3 = r3 + 1
            goto L_0x015e
        L_0x01b5:
            java.lang.reflect.Method r0 = f3016e     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x01e9
            r5 = -29354784806060(0xffffe54d4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0213 }
            r3.<init>()     // Catch:{ all -> 0x0213 }
            r5 = -29384849577132(0xffffe5464e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            r3.append(r5)     // Catch:{ all -> 0x0213 }
            java.lang.reflect.Method r5 = f3016e     // Catch:{ all -> 0x0213 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0213 }
            r3.append(r5)     // Catch:{ all -> 0x0213 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0213 }
            p000.C0550gu.m1820b(r0, r3)     // Catch:{ all -> 0x0213 }
            java.lang.reflect.Method r0 = f3016e     // Catch:{ all -> 0x0213 }
            r0.setAccessible(r4)     // Catch:{ all -> 0x0213 }
            goto L_0x01fe
        L_0x01e9:
            r5 = -29500813694124(0xffffe52b4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            r5 = -29530878465196(0xffffe5244e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            p000.C0550gu.m1819a(r0, r3)     // Catch:{ all -> 0x0213 }
        L_0x01fe:
            if (r1 == 0) goto L_0x022c
            r5 = -29655432516780(0xffffe5074e7aab54, double:NaN)
            p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            r5 = -29685497287852(0xffffe5004e7aab54, double:NaN)
            p000.C0200av.m970a(r5)     // Catch:{ all -> 0x0213 }
            f3016e = r2     // Catch:{ all -> 0x0213 }
            goto L_0x022c
        L_0x0213:
            r0 = move-exception
            r5 = -29840116110508(0xffffe4dc4e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r5)
            r5 = -29870180881580(0xffffe4d54e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)
            p000.C0550gu.m1819a(r3, r5)
            r0.printStackTrace()
        L_0x022c:
            java.lang.Class<android.media.AudioManager> r0 = android.media.AudioManager.class
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch:{ all -> 0x02c5 }
            r5 = -30024799704236(0xffffe4b14e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x02c5 }
            java.lang.reflect.Method r0 = p000.C0431en.m1605b(r0, r3)     // Catch:{ all -> 0x02c5 }
            f3017f = r0     // Catch:{ all -> 0x02c5 }
            if (r0 == 0) goto L_0x026e
            r5 = -30153648723116(0xffffe4934e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x02c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r3.<init>()     // Catch:{ all -> 0x02c5 }
            r5 = -30183713494188(0xffffe48c4e7aab54, double:NaN)
            java.lang.String r5 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x02c5 }
            r3.append(r5)     // Catch:{ all -> 0x02c5 }
            java.lang.reflect.Method r5 = f3017f     // Catch:{ all -> 0x02c5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x02c5 }
            r3.append(r5)     // Catch:{ all -> 0x02c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c5 }
        L_0x026a:
            p000.C0550gu.m1820b(r0, r3)     // Catch:{ all -> 0x02c5 }
            goto L_0x0281
        L_0x026e:
            r5 = -30303972578476(0xffffe4704e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x02c5 }
            r5 = -30334037349548(0xffffe4694e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r5)     // Catch:{ all -> 0x02c5 }
            goto L_0x026a
        L_0x0281:
            java.lang.reflect.Method r0 = f3017f     // Catch:{ all -> 0x02c5 }
            r0.setAccessible(r4)     // Catch:{ all -> 0x02c5 }
            java.lang.reflect.Method r0 = f3017f     // Catch:{ all -> 0x02c5 }
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch:{ all -> 0x02c5 }
            int r0 = r0.length     // Catch:{ all -> 0x02c5 }
            if (r0 >= r7) goto L_0x0291
            f3019h = r4     // Catch:{ all -> 0x02c5 }
        L_0x0291:
            boolean r0 = p000.C0728kh.m2305u()     // Catch:{ all -> 0x02c5 }
            if (r0 == 0) goto L_0x02b0
            boolean r0 = f3019h     // Catch:{ all -> 0x02c5 }
            if (r0 == 0) goto L_0x02b0
            r3 = -30462886368428(0xffffe44b4e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r3)     // Catch:{ all -> 0x02c5 }
            r3 = -30492951139500(0xffffe4444e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)     // Catch:{ all -> 0x02c5 }
            p000.C0550gu.m1820b(r0, r3)     // Catch:{ all -> 0x02c5 }
        L_0x02b0:
            if (r1 == 0) goto L_0x02de
            r0 = -30673339765932(0xffffe41a4e7aab54, double:NaN)
            p000.C0200av.m970a(r0)     // Catch:{ all -> 0x02c5 }
            r0 = -30703404537004(0xffffe4134e7aab54, double:NaN)
            p000.C0200av.m970a(r0)     // Catch:{ all -> 0x02c5 }
            f3017f = r2     // Catch:{ all -> 0x02c5 }
            goto L_0x02de
        L_0x02c5:
            r0 = move-exception
            r1 = -30858023359660(0xffffe3ef4e7aab54, double:NaN)
            java.lang.String r1 = p000.C0200av.m970a(r1)
            r2 = -30888088130732(0xffffe3e84e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)
            p000.C0550gu.m1819a(r1, r2)
            r0.printStackTrace()
        L_0x02de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735ko.<clinit>():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0735ko(android.content.Context r32) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r31.<init>()
            r1.f3021b = r0
            r2 = -19261611660460(0xffffee7b4e7aab54, double:NaN)
            java.lang.String r2 = p000.C0200av.m970a(r2)     // Catch:{ all -> 0x001b }
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x001b }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ all -> 0x001b }
            r1.f3020a = r0     // Catch:{ all -> 0x001b }
            goto L_0x001f
        L_0x001b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001f:
            android.content.Context r0 = r1.f3021b
            java.lang.String r2 = p000.C0391dp.f1915a
            java.lang.String r2 = p000.C1384xo.f5120b
            int r3 = p000.C1425yo.f5206a
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3 = -37364898813100(0xffffde044e7aab54, double:NaN)
            java.lang.String r3 = p000.C0200av.m970a(r3)
            r4 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            r5 = 0
            java.lang.String r2 = r3.getString(r2, r5)
            r3 = 2
            r5 = -70526341305516(0xffffbfdb4e7aab54, double:NaN)
            r7 = -70479096665260(0xffffbfe64e7aab54, double:NaN)
            r9 = 1
            if (r2 == 0) goto L_0x00ff
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x0058
            goto L_0x00ff
        L_0x0058:
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0076
            android.content.ContentResolver r10 = r0.getContentResolver()
            java.lang.String r11 = p000.C0200av.m970a(r7)
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r11)
            p000.C0391dp.f1915a = r10
        L_0x0076:
            java.lang.String r10 = p000.C0391dp.f1915a
            if (r10 != 0) goto L_0x0080
            java.lang.String r10 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r10
        L_0x0080:
            java.lang.String r10 = p000.C0391dp.f1915a
            r11 = 5
            if (r10 == 0) goto L_0x0094
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x0094
            int r10 = r10.hashCode()
            byte r10 = (byte) r10
            if (r10 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r11 = r10
        L_0x0094:
            int r11 = r11 * -1
            byte r10 = (byte) r11
            p000.C0495fu.m1724a(r2)
            int r11 = r2.length
            byte[] r11 = new byte[r11]
            r12 = 0
        L_0x009e:
            int r13 = r2.length
            if (r12 >= r13) goto L_0x00b7
            byte r13 = r2[r12]
            int r13 = r13 + r10
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 <= r14) goto L_0x00ab
            int r13 = r13 + -256
            goto L_0x00b1
        L_0x00ab:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r13 >= r14) goto L_0x00b1
            int r13 = r13 + 256
        L_0x00b1:
            byte r13 = (byte) r13
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x009e
        L_0x00b7:
            p000.C0495fu.m1724a(r11)
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 19
            if (r2 < r10) goto L_0x00c8
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r11, r10)
            goto L_0x00cd
        L_0x00c8:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r11)
        L_0x00cd:
            r10 = -38004848940204(0xffffdd6f4e7aab54, double:NaN)
            java.lang.String r10 = p000.C0200av.m970a(r10)
            java.lang.String[] r2 = r2.split(r10)
            int r10 = r2.length
            r11 = 4
            if (r10 == r11) goto L_0x00ec
            cp r2 = new cp
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            go r17 = p000.C0433ep.f2035g
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x010b
        L_0x00ec:
            cp r10 = new cp
            r19 = r2[r4]
            r20 = r2[r9]
            r21 = r2[r3]
            r3 = 3
            r22 = r2[r3]
            go r23 = p000.C0433ep.f2029a
            r18 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x010c
        L_0x00ff:
            cp r2 = new cp
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            go r16 = p000.C0433ep.f2035g
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x010b:
            r10 = r2
        L_0x010c:
            java.lang.String r2 = r10.f1827a
            if (r2 == 0) goto L_0x0134
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0117
            goto L_0x0134
        L_0x0117:
            java.lang.String r2 = r10.f1828b
            if (r2 == 0) goto L_0x0134
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0122
            goto L_0x0134
        L_0x0122:
            java.lang.String r2 = r10.f1829c
            if (r2 == 0) goto L_0x0134
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            java.lang.Object r2 = r10.f1831e
            if (r2 != 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r2 = 1
            goto L_0x0135
        L_0x0134:
            r2 = 0
        L_0x0135:
            r11 = -70036715033772(0xffffc04d4e7aab54, double:NaN)
            r13 = -70015240197292(0xffffc0524e7aab54, double:NaN)
            if (r2 != 0) goto L_0x014a
            go r2 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r2)
            r10.f1832f = r2
            r2 = 0
            goto L_0x0179
        L_0x014a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f1827a
            r2.append(r3)
            java.lang.String r3 = r10.f1828b
            r2.append(r3)
            java.lang.String r3 = r10.f1829c
            java.lang.String r2 = p000.C0279ch.m1122s(r2, r3)
            java.lang.String r3 = r10.f1830d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x016d
            p000.C0200av.m970a(r13)
            p000.C0200av.m970a(r11)
        L_0x016d:
            if (r2 == 0) goto L_0x0172
            go r3 = p000.C0433ep.f2039k
            goto L_0x0174
        L_0x0172:
            go r3 = p000.C0433ep.f2031c
        L_0x0174:
            java.lang.String.valueOf(r3)
            r10.f1832f = r3
        L_0x0179:
            if (r2 == 0) goto L_0x0490
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.String r9 = r10.f1827a
            if (r9 == 0) goto L_0x01a7
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x018a
            goto L_0x01a7
        L_0x018a:
            java.lang.String r9 = r10.f1828b
            if (r9 == 0) goto L_0x01a7
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0195
            goto L_0x01a7
        L_0x0195:
            java.lang.String r9 = r10.f1829c
            if (r9 == 0) goto L_0x01a7
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x01a0
            goto L_0x01a7
        L_0x01a0:
            java.lang.Object r9 = r10.f1831e
            if (r9 != 0) goto L_0x01a5
            goto L_0x01a7
        L_0x01a5:
            r9 = 1
            goto L_0x01a8
        L_0x01a7:
            r9 = 0
        L_0x01a8:
            if (r9 != 0) goto L_0x01b3
            go r9 = p000.C0433ep.f2030b
            java.lang.String.valueOf(r9)
            r10.f1832f = r9
            r9 = 0
            goto L_0x01e2
        L_0x01b3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = r10.f1827a
            r9.append(r15)
            java.lang.String r15 = r10.f1828b
            r9.append(r15)
            java.lang.String r15 = r10.f1829c
            java.lang.String r9 = p000.C0279ch.m1122s(r9, r15)
            java.lang.String r15 = r10.f1830d
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x01d6
            p000.C0200av.m970a(r13)
            p000.C0200av.m970a(r11)
        L_0x01d6:
            if (r9 == 0) goto L_0x01db
            go r11 = p000.C0433ep.f2039k
            goto L_0x01dd
        L_0x01db:
            go r11 = p000.C0433ep.f2031c
        L_0x01dd:
            java.lang.String.valueOf(r11)
            r10.f1832f = r11
        L_0x01e2:
            if (r9 != 0) goto L_0x01e8
            go r0 = r10.f1832f
            goto L_0x036c
        L_0x01e8:
            java.lang.String r9 = r10.f1829c
            java.lang.String r11 = p000.C0391dp.f1915a
            if (r11 != 0) goto L_0x01fc
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r7 = p000.C0200av.m970a(r7)
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r7)
            p000.C0391dp.f1915a = r0
        L_0x01fc:
            java.lang.String r0 = p000.C0391dp.f1915a
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = p000.C0200av.m970a(r5)
            p000.C0391dp.f1915a = r0
        L_0x0206:
            java.lang.String r0 = p000.C0391dp.f1915a
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0229
            r2 = -70096844575916(0xffffc03f4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70118319412396(0xffffc03a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2033e
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2033e
            goto L_0x036c
        L_0x0229:
            java.lang.String r0 = r10.f1828b
            java.lang.Class r5 = p000.C1228uu.f4686b
            byte[] r5 = new byte[r4]
            java.lang.reflect.Method r6 = p000.C1228uu.f4688d     // Catch:{ Exception -> 0x0246 }
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0246 }
            r7[r4] = r0     // Catch:{ Exception -> 0x0246 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0246 }
            r8 = 1
            r7[r8] = r0     // Catch:{ Exception -> 0x0246 }
            r0 = 0
            java.lang.Object r0 = r6.invoke(r0, r7)     // Catch:{ Exception -> 0x0246 }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x0246 }
            r5 = r0
            goto L_0x025d
        L_0x0246:
            r0 = move-exception
            r6 = -99714939049132(0xffffa54f4e7aab54, double:NaN)
            java.lang.String r6 = p000.C0200av.m970a(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = -99732118918316(0xffffa54b4e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r7, r0, r6)
        L_0x025d:
            if (r5 == 0) goto L_0x0456
            int r0 = r5.length
            if (r0 != 0) goto L_0x0264
            goto L_0x0456
        L_0x0264:
            int r0 = p000.C1136su.f4328a
            r6 = -97421426513068(0xffffa7654e7aab54, double:NaN)
            java.lang.String r0 = p000.C0200av.m970a(r6)
            byte[] r0 = r0.getBytes()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r11, r5)
            r13 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            r15 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            r17 = -97795088667820(0xffffa70e4e7aab54, double:NaN)
            r21 = -98173045789868(0xffffa6b64e7aab54, double:NaN)
            r23 = -97692009452716(0xffffa7264e7aab54, double:NaN)
            r25 = -98125801149612(0xffffa6c14e7aab54, double:NaN)
            r27 = -98108621280428(0xffffa6c54e7aab54, double:NaN)
            java.lang.String r8 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x033b }
            java.lang.ClassLoader r9 = r2.getClassLoader()     // Catch:{ Exception -> 0x033b }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r9)     // Catch:{ Exception -> 0x033b }
            java.lang.String r9 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x033b }
            java.lang.ClassLoader r11 = r2.getClassLoader()     // Catch:{ Exception -> 0x033b }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r11)     // Catch:{ Exception -> 0x033b }
            java.lang.String r11 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x033b }
            r12 = 1
            java.lang.Class[] r15 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x033b }
            r15[r4] = r2     // Catch:{ Exception -> 0x033b }
            java.lang.reflect.Method r11 = r8.getDeclaredMethod(r11, r15)     // Catch:{ Exception -> 0x033b }
            java.lang.String r15 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x033b }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x033b }
            r13[r4] = r9     // Catch:{ Exception -> 0x033b }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r15, r13)     // Catch:{ Exception -> 0x033b }
            r13 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r15 = p000.C0200av.m970a(r13)     // Catch:{ Exception -> 0x033b }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x033b }
            r13[r4] = r3     // Catch:{ Exception -> 0x033b }
            java.lang.reflect.Method r13 = r8.getDeclaredMethod(r15, r13)     // Catch:{ Exception -> 0x033b }
            r14 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r4 = p000.C0200av.m970a(r14)     // Catch:{ Exception -> 0x033b }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x033b }
            r15 = 0
            r14[r15] = r3     // Catch:{ Exception -> 0x033b }
            java.lang.reflect.Method r4 = r8.getDeclaredMethod(r4, r14)     // Catch:{ Exception -> 0x033b }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x033b }
            r29 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r14 = p000.C0200av.m970a(r29)     // Catch:{ Exception -> 0x033b }
            r8[r15] = r14     // Catch:{ Exception -> 0x033b }
            r14 = 0
            java.lang.Object r8 = r11.invoke(r14, r8)     // Catch:{ Exception -> 0x033b }
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x033b }
            java.lang.Object r14 = r10.f1831e     // Catch:{ Exception -> 0x033b }
            r11[r15] = r14     // Catch:{ Exception -> 0x033b }
            r9.invoke(r8, r11)     // Catch:{ Exception -> 0x033b }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x033b }
            r9[r15] = r0     // Catch:{ Exception -> 0x033b }
            r13.invoke(r8, r9)     // Catch:{ Exception -> 0x033b }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x033b }
            r0[r15] = r5     // Catch:{ Exception -> 0x033b }
            java.lang.Object r0 = r4.invoke(r8, r0)     // Catch:{ Exception -> 0x033b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x033b }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x033b }
            if (r0 != 0) goto L_0x032f
            r0 = 1
            goto L_0x0330
        L_0x032f:
            r0 = 0
        L_0x0330:
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x033b }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x033b }
            if (r0 == 0) goto L_0x0339
            r6 = r7
        L_0x0339:
            r7 = r6
            goto L_0x034d
        L_0x033b:
            r0 = move-exception
            java.lang.String r4 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r8 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r8, r6, r0, r4)
        L_0x034d:
            boolean r0 = r7.booleanValue()
            if (r0 == 0) goto L_0x036f
            r2 = -70311592940716(0xffffc00d4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70333067777196(0xffffc0084e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2032d
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2032d
        L_0x036c:
            r14 = 0
            goto L_0x0470
        L_0x036f:
            java.lang.String r0 = r10.f1827a
            byte[] r0 = r0.getBytes()
            go r4 = p000.C0433ep.f2034f
            go r6 = p000.C0433ep.f2036h
            go r7 = p000.C0433ep.f2038j
            r8 = -97636174877868(0xffffa7334e7aab54, double:NaN)
            r11 = -97653354747052(0xffffa72f4e7aab54, double:NaN)
            p000.C0279ch.m1109f(r8, r11, r5)
            java.lang.String r8 = p000.C0200av.m970a(r23)     // Catch:{ Exception -> 0x0428 }
            java.lang.ClassLoader r9 = r2.getClassLoader()     // Catch:{ Exception -> 0x0428 }
            java.lang.Class r8 = p000.C0389dn.m1512a(r8, r9)     // Catch:{ Exception -> 0x0428 }
            java.lang.String r9 = p000.C0200av.m970a(r17)     // Catch:{ Exception -> 0x0428 }
            java.lang.ClassLoader r11 = r2.getClassLoader()     // Catch:{ Exception -> 0x0428 }
            java.lang.Class r9 = p000.C0389dn.m1512a(r9, r11)     // Catch:{ Exception -> 0x0428 }
            r11 = -97898167882924(0xffffa6f64e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r11)     // Catch:{ Exception -> 0x0428 }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0428 }
            r14 = 0
            r13[r14] = r2     // Catch:{ Exception -> 0x0426 }
            java.lang.reflect.Method r2 = r8.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0426 }
            r15 = -97949707490476(0xffffa6ea4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x0426 }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0426 }
            r13[r14] = r9     // Catch:{ Exception -> 0x0426 }
            java.lang.reflect.Method r9 = r8.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0426 }
            r15 = -97996952130732(0xffffa6df4e7aab54, double:NaN)
            java.lang.String r11 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x0426 }
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0426 }
            r13[r14] = r3     // Catch:{ Exception -> 0x0426 }
            java.lang.reflect.Method r11 = r8.getDeclaredMethod(r11, r13)     // Catch:{ Exception -> 0x0426 }
            r15 = -98027016901804(0xffffa6d84e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x0426 }
            java.lang.Class[] r15 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x0426 }
            r15[r14] = r3     // Catch:{ Exception -> 0x0426 }
            java.lang.reflect.Method r3 = r8.getDeclaredMethod(r13, r15)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0426 }
            r15 = -98057081672876(0xffffa6d14e7aab54, double:NaN)
            java.lang.String r13 = p000.C0200av.m970a(r15)     // Catch:{ Exception -> 0x0426 }
            r8[r14] = r13     // Catch:{ Exception -> 0x0426 }
            r13 = 0
            java.lang.Object r2 = r2.invoke(r13, r8)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r13 = r10.f1831e     // Catch:{ Exception -> 0x0426 }
            r8[r14] = r13     // Catch:{ Exception -> 0x0426 }
            r9.invoke(r2, r8)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0426 }
            r8[r14] = r0     // Catch:{ Exception -> 0x0426 }
            r11.invoke(r2, r8)     // Catch:{ Exception -> 0x0426 }
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0426 }
            r0[r14] = r5     // Catch:{ Exception -> 0x0426 }
            java.lang.Object r0 = r3.invoke(r2, r0)     // Catch:{ Exception -> 0x0426 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0426 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0426 }
            if (r0 != 0) goto L_0x041a
            r0 = 1
            goto L_0x041b
        L_0x041a:
            r0 = 0
        L_0x041b:
            p000.C0200av.m970a(r27)     // Catch:{ Exception -> 0x0426 }
            p000.C0200av.m970a(r25)     // Catch:{ Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0424
            r4 = r6
        L_0x0424:
            r0 = r4
            goto L_0x043c
        L_0x0426:
            r0 = move-exception
            goto L_0x042a
        L_0x0428:
            r0 = move-exception
            r14 = 0
        L_0x042a:
            java.lang.String r2 = p000.C0200av.m970a(r21)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = -98190225659052(0xffffa6b24e7aab54, double:NaN)
            p000.C0279ch.m1114k(r4, r3, r0, r2)
            r0 = r7
        L_0x043c:
            go r2 = p000.C0433ep.f2036h
            if (r0 != r2) goto L_0x0450
            r2 = -70401787253932(0xffffbff84e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70423262090412(0xffffbff34e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
        L_0x0450:
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            goto L_0x0470
        L_0x0456:
            r14 = 0
            r2 = -70187038889132(0xffffc02a4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70208513725612(0xffffc0254e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            go r0 = p000.C0433ep.f2037i
            java.lang.String.valueOf(r0)
            r10.f1832f = r0
            go r0 = p000.C0433ep.f2037i
        L_0x0470:
            go r2 = p000.C0433ep.f2034f
            if (r0 == r2) goto L_0x047b
            go r2 = p000.C0433ep.f2029a
            if (r0 != r2) goto L_0x0479
            goto L_0x047b
        L_0x0479:
            r0 = 0
            goto L_0x047c
        L_0x047b:
            r0 = 1
        L_0x047c:
            if (r0 == 0) goto L_0x0490
            r2 = -70577880913068(0xffffbfcf4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r2 = -70599355749548(0xffffbfca4e7aab54, double:NaN)
            p000.C0200av.m970a(r2)
            r4 = 0
            goto L_0x0491
        L_0x0490:
            r4 = 1
        L_0x0491:
            if (r4 != 0) goto L_0x049b
            java.lang.reflect.Method r0 = f3016e
            f3017f = r0
            java.lang.reflect.Method r0 = f3018g
            f3016e = r0
        L_0x049b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0735ko.<init>(android.content.Context):void");
    }
}
