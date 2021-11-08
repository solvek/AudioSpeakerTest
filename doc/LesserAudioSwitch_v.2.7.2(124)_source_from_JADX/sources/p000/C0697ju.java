package p000;

import android.content.Context;
import android.content.SharedPreferences;
import p000.C0652iu;
import p000.C0735ko;

/* renamed from: ju */
public class C0697ju {

    /* renamed from: a */
    public static C0652iu.C0653a f2933a = new C0652iu.C0653a(C0200av.m970a(-114957777982636L), C0200av.m970a(-115116691772588L));

    /* renamed from: b */
    public static C0652iu.C0653a f2934b = new C0652iu.C0653a(C0200av.m970a(-115305670333612L), C0200av.m970a(-115464584123564L));

    /* renamed from: c */
    public static C0652iu.C0654b<C1129so> f2935c = new C0652iu.C0654b<>(C0200av.m970a(-115602023077036L), C0200av.m970a(-115760936866988L));

    /* renamed from: d */
    public static C0652iu.C0653a f2936d = new C0698a(C0200av.m970a(-115911260722348L), C0200av.m970a(-116070174512300L));

    /* renamed from: e */
    public static C0652iu.C0653a f2937e = new C0652iu.C0653a(C0200av.m970a(-116272037975212L), C0200av.m970a(-116430951765164L));

    /* renamed from: f */
    public static C0652iu.C0653a f2938f = new C0699b(C0200av.m970a(-116680059868332L), C0200av.m970a(-116838973658284L));

    /* renamed from: g */
    public static C0652iu.C0653a f2939g = new C0700c(C0200av.m970a(-116985002546348L), C0200av.m970a(-117143916336300L));

    /* renamed from: h */
    public static C0652iu.C0653a f2940h = new C0701d(C0200av.m970a(-117272765355180L), C0200av.m970a(-117431679145132L));

    /* renamed from: i */
    public static C0652iu.C0653a f2941i = new C0702e(C0200av.m970a(-117582003000492L), C0200av.m970a(-117740916790444L));

    /* renamed from: ju$a */
    public static class C0698a extends C0652iu.C0653a {
        public C0698a(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: b */
        public void mo3310b(Context context, boolean z) {
            if (z) {
                C0697ju.f2937e.mo3310b(context, true);
            }
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f2769a, 0).edit();
            edit.putBoolean(this.f2770b, z);
            edit.apply();
        }
    }

    /* renamed from: ju$b */
    public static class C0699b extends C0652iu.C0653a {
        public C0699b(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo3309a(Context context, boolean z) {
            if (C0728kh.m2305u()) {
                C0735ko.C0738c[] cVarArr = C0735ko.f3014c;
                if (C0728kh.m2305u() && C0735ko.f3019h) {
                    return context.getSharedPreferences(this.f2769a, 0).getBoolean(this.f2770b, z);
                }
            }
            return true;
        }
    }

    /* renamed from: ju$c */
    public static class C0700c extends C0652iu.C0653a {
        public C0700c(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo3309a(Context context, boolean z) {
            if (!C0728kh.m2285a()) {
                return true;
            }
            return context.getSharedPreferences(this.f2769a, 0).getBoolean(this.f2770b, z);
        }
    }

    /* renamed from: ju$d */
    public static class C0701d extends C0652iu.C0653a {
        public C0701d(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo3309a(Context context, boolean z) {
            if (!C0728kh.m2285a()) {
                return true;
            }
            return context.getSharedPreferences(this.f2769a, 0).getBoolean(this.f2770b, z);
        }
    }

    /* renamed from: ju$e */
    public static class C0702e extends C0652iu.C0653a {
        public C0702e(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo3309a(Context context, boolean z) {
            if (!C0728kh.m2285a()) {
                return true;
            }
            return context.getSharedPreferences(this.f2769a, 0).getBoolean(this.f2770b, z);
        }
    }

    static {
        C0200av.m970a(-111564753818796L);
        C0200av.m970a(-111607703491756L);
        C0200av.m970a(-111766617281708L);
        C0200av.m970a(-111831041791148L);
        C0200av.m970a(-111925531071660L);
        C0200av.m970a(-111989955581100L);
        C0200av.m970a(-112075854927020L);
        C0200av.m970a(-112135984469164L);
        C0200av.m970a(-112200408978604L);
        C0200av.m970a(-112307783161004L);
        C0200av.m970a(-112385092572332L);
        C0200av.m970a(-112479581852844L);
        C0200av.m970a(-112591251002540L);
        C0200av.m970a(-112724394988716L);
        C0200av.m970a(-112887603745964L);
        C0200av.m970a(-113050812503212L);
        C0200av.m970a(-113218316227756L);
        C0200av.m970a(-113360050148524L);
        C0200av.m970a(-113497489101996L);
        C0200av.m970a(-113591978382508L);
        C0200av.m970a(-113699352564908L);
        C0200av.m970a(-113828201583788L);
        C0200av.m970a(-113939870733484L);
        C0200av.m970a(-114025770079404L);
        C0200av.m970a(-114141734196396L);
        C0200av.m970a(-114236223476908L);
        C0200av.m970a(-114360777528492L);
        C0200av.m970a(-114438086939820L);
        C0200av.m970a(-114523986285740L);
        C0200av.m970a(-114652835304620L);
        C0200av.m970a(-114828928963756L);
    }

    /* renamed from: A */
    public static void m2172A(Context context, C0735ko.C0737b bVar) {
        m2203z(context, C0200av.m970a(-107093692863660L), bVar);
    }

    /* renamed from: B */
    public static void m2173B(Context context, C1129so soVar, C1072ro roVar) {
        long j;
        C0200av.m970a(-105899691955372L);
        C0200av.m970a(-105942641628332L) + roVar + C0200av.m970a(-106028540974252L) + soVar;
        int ordinal = soVar.ordinal();
        if (ordinal == 1) {
            j = -106092965483692L;
        } else if (ordinal == 3) {
            j = -106200339666092L;
        } else if (ordinal == 5) {
            j = -106329188684972L;
        } else if (ordinal == 6) {
            j = -106440857834668L;
        } else {
            return;
        }
        m2203z(context, C0200av.m970a(j), roVar);
    }

    /* renamed from: C */
    public static void m2174C(Context context, String str, int i) {
        SharedPreferences.Editor edit = m2198u(context).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: D */
    public static void m2175D(Context context, C1129so soVar) {
        String a = C0200av.m970a(-106647016264876L);
        String str = soVar.toString();
        SharedPreferences.Editor edit = m2198u(context).edit();
        edit.putString(a, str);
        edit.apply();
    }

    /* renamed from: E */
    public static void m2176E(Context context, C0735ko.C0736a aVar) {
        m2203z(context, C0200av.m970a(-110735825130668L), aVar);
    }

    /* renamed from: F */
    public static void m2177F(Context context, boolean z) {
        C0200av.m970a(-109584773895340L);
        C0200av.m970a(-109627723568300L);
        m2202y(context, C0200av.m970a(-109778047423660L), z);
    }

    /* renamed from: a */
    public static boolean m2178a(Context context) {
        return m2180c(context, C0200av.m970a(-107359980836012L), false);
    }

    /* renamed from: b */
    public static boolean m2179b(Context context) {
        return m2180c(context, C0200av.m970a(-108098715210924L), true);
    }

    /* renamed from: c */
    public static boolean m2180c(Context context, String str, boolean z) {
        return m2198u(context).getBoolean(str, z);
    }

    /* renamed from: d */
    public static boolean m2181d(Context context) {
        return m2180c(context, C0200av.m970a(-108390772987052L), false);
    }

    /* renamed from: e */
    public static boolean m2182e(Context context) {
        return m2180c(context, C0200av.m970a(-108455197496492L), false);
    }

    /* renamed from: f */
    public static boolean m2183f(Context context) {
        if (!m2186i(context)) {
            return false;
        }
        if (!C0728kh.m2305u() || C0728kh.m2286b(context)) {
            return m2180c(context, C0200av.m970a(-107248311686316L), false);
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m2184g(Context context) {
        return m2180c(context, C0200av.m970a(-105324166337708L), false);
    }

    /* renamed from: h */
    public static <T extends Enum<T>> T m2185h(Context context, String str, T t) {
        try {
            return Enum.valueOf(t.getDeclaringClass(), m2198u(context).getString(str, t.toString()));
        } catch (Exception e) {
            C0200av.m970a(-105173842482348L);
            C0200av.m970a(-105216792155308L);
            e.printStackTrace();
            return t;
        }
    }

    /* renamed from: i */
    public static boolean m2186i(Context context) {
        return m2180c(context, C0200av.m970a(-108034290701484L), true);
    }

    /* renamed from: j */
    public static C1072ro m2187j(Context context, C1129so soVar) {
        int ordinal = soVar.ordinal();
        return ordinal != 1 ? ordinal != 3 ? ordinal != 5 ? ordinal != 6 ? C1072ro.DEFAULT : m2190m(context) : m2188k(context) : m2191n(context) : m2189l(context);
    }

    /* renamed from: k */
    public static C1072ro m2188k(Context context) {
        if (!m2186i(context)) {
            return C1072ro.DEFAULT;
        }
        String a = C0200av.m970a(-105702123459756L);
        C1072ro roVar = C1072ro.AUTO;
        C1072ro roVar2 = (C1072ro) m2185h(context, a, roVar);
        int ordinal = roVar2.ordinal();
        return (ordinal == 1 || ordinal == 4) ? roVar : roVar2;
    }

    /* renamed from: l */
    public static C1072ro m2189l(Context context) {
        if (!m2186i(context)) {
            return C1072ro.DEFAULT;
        }
        String a = C0200av.m970a(-105465900258476L);
        C1072ro roVar = C1072ro.INTERNAL_MIC;
        C1072ro roVar2 = (C1072ro) m2185h(context, a, roVar);
        return roVar2.ordinal() != 1 ? roVar2 : roVar;
    }

    /* renamed from: m */
    public static C1072ro m2190m(Context context) {
        return !m2186i(context) ? C1072ro.DEFAULT : (C1072ro) m2185h(context, C0200av.m970a(-105813792609452L), C1072ro.AUTO);
    }

    /* renamed from: n */
    public static C1072ro m2191n(Context context) {
        return !m2186i(context) ? C1072ro.DEFAULT : (C1072ro) m2185h(context, C0200av.m970a(-105573274440876L), C1072ro.AUTO);
    }

    /* renamed from: o */
    public static int m2192o(Context context, String str, int i) {
        return m2198u(context).getInt(str, i);
    }

    /* renamed from: p */
    public static C1129so m2193p(Context context) {
        return (C1129so) m2185h(context, C0200av.m970a(-106741505545388L), C1129so.DEFAULT);
    }

    /* renamed from: q */
    public static boolean m2194q(Context context) {
        if (!C0728kh.m2286b(context)) {
            return false;
        }
        return m2180c(context, C0200av.m970a(-107755117827244L), false);
    }

    /* renamed from: r */
    public static boolean m2195r(Context context) {
        return m2180c(context, C0200av.m970a(-107939801420972L), false);
    }

    /* renamed from: s */
    public static C0735ko.C0736a m2196s(Context context) {
        return C0728kh.m2305u() ? (C0735ko.C0736a) m2185h(context, C0200av.m970a(-108549686777004L), C0735ko.C0736a.f3022b) : C0735ko.C0736a.f3023c;
    }

    /* renamed from: t */
    public static C0735ko.C0736a m2197t(Context context) {
        return C0728kh.m2305u() ? (C0735ko.C0736a) m2185h(context, C0200av.m970a(-108674240828588L), C0735ko.C0736a.f3022b) : C0735ko.C0736a.f3022b;
    }

    /* renamed from: u */
    public static SharedPreferences m2198u(Context context) {
        return context.getSharedPreferences(C0200av.m970a(-105014928692396L), 0);
    }

    /* renamed from: v */
    public static boolean m2199v(Context context) {
        return m2180c(context, C0200av.m970a(-108837449585836L), false);
    }

    /* renamed from: w */
    public static boolean m2200w(Context context) {
        return m2180c(context, C0200av.m970a(-108270513902764L), true);
    }

    /* renamed from: x */
    public static boolean m2201x(Context context, String str) {
        return m2198u(context).contains(str);
    }

    /* renamed from: y */
    public static void m2202y(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = m2198u(context).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: z */
    public static <T extends Enum<T>> void m2203z(Context context, String str, T t) {
        SharedPreferences.Editor edit = m2198u(context).edit();
        edit.putString(str, t.toString());
        edit.apply();
    }
}
