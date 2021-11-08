package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p000.C0652iu;

/* renamed from: eo */
public class C0432eo {

    /* renamed from: a */
    public static HashMap<C0489fo, String> f2022a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<C0489fo, Set<String>> f2023b = new HashMap<>();

    /* renamed from: c */
    public static C0652iu.C0653a f2024c = new C0652iu.C0653a(C0200av.m970a(-4705967494316L), C0200av.m970a(-4899241022636L));

    /* renamed from: d */
    public static C0652iu.C0653a f2025d = new C0652iu.C0653a(C0200av.m970a(-5075334681772L), C0200av.m970a(-5268608210092L));

    /* renamed from: e */
    public static C0652iu.C0654b<C0544go> f2026e = new C0652iu.C0654b<>(C0200av.m970a(-5418932065452L), C0200av.m970a(-5612205593772L));

    /* renamed from: f */
    public static C0652iu.C0654b<C1028qo> f2027f = new C0652iu.C0654b<>(C0200av.m970a(-5788299252908L), C0200av.m970a(-5981572781228L));

    /* renamed from: g */
    public static C0652iu.C0653a f2028g = new C0652iu.C0653a(C0200av.m970a(-6144781538476L), C0200av.m970a(-6338055066796L));

    static {
        C0200av.m970a(-4461154358444L);
        C0200av.m970a(-4512693965996L);
        C0489fo[] values = C0489fo.values();
        for (int i = 0; i < 4; i++) {
            f2023b.put(values[i], new HashSet());
        }
    }

    /* renamed from: a */
    public static boolean m1606a(Context context) {
        return f2024c.mo3309a(context, C0728kh.m2305u());
    }

    /* renamed from: b */
    public static String m1607b(C0489fo foVar) {
        return f2022a.get(foVar);
    }

    /* renamed from: c */
    public static String m1608c(Context context, C0489fo foVar) {
        return context.getSharedPreferences(C0200av.m970a(-4267880830124L), 0).getString(foVar.toString() + C0200av.m970a(-4229226124460L), (String) null);
    }

    /* renamed from: d */
    public static C1028qo m1609d(Context context) {
        return f2027f.mo3311a(context, C1028qo.TYPE_UNKNOWN);
    }

    /* renamed from: e */
    public static void m1610e(Context context, C0489fo foVar, Set<String> set, String str) {
        set.remove(C0200av.m970a(-3657995474092L));
        String c = m1608c(context, foVar);
        if (c != null) {
            set.add(c);
        }
        if (!set.isEmpty()) {
            if (set.size() != 1) {
                set.remove(str);
                if (set.isEmpty()) {
                    m1611f(context, foVar, str);
                    return;
                }
                if (set.size() > 1) {
                    String a = C0200av.m970a(-3735304885420L);
                    C0550gu.m1820b(a, C0200av.m970a(-3786844492972L) + foVar.toString() + C0200av.m970a(-3885628740780L) + set.toString());
                    set.remove(C0200av.m970a(-3898513642668L));
                }
                if (set.size() > 1 && c != null) {
                    set.remove(c);
                }
            }
            m1611f(context, foVar, set.iterator().next());
        }
    }

    /* renamed from: f */
    public static void m1611f(Context context, C0489fo foVar, String str) {
        String a = C0200av.m970a(-3997297890476L);
        C0550gu.m1820b(a, C0200av.m970a(-4048837498028L) + foVar + C0200av.m970a(-4177686516908L) + str);
        StringBuilder sb = new StringBuilder();
        sb.append(foVar.toString());
        sb.append(C0200av.m970a(-4190571418796L));
        String sb2 = sb.toString();
        SharedPreferences.Editor edit = context.getSharedPreferences(C0200av.m970a(-4267880830124L), 0).edit();
        edit.putString(sb2, str);
        edit.apply();
        f2022a.put(foVar, str);
    }
}
