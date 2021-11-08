package p000;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ch */
/* compiled from: outline */
public class C0279ch {
    /* renamed from: a */
    public static String m1104a(long j, StringBuilder sb, Exception exc, String str, long j2) {
        sb.append(C0200av.m970a(j));
        sb.append(exc.getMessage());
        C0550gu.m1819a(str, sb.toString());
        return C0200av.m970a(j2);
    }

    /* renamed from: b */
    public static String m1105b(long j, StringBuilder sb, Throwable th, String str, long j2) {
        sb.append(C0200av.m970a(j));
        sb.append(th.getMessage());
        C0550gu.m1819a(str, sb.toString());
        return C0200av.m970a(j2);
    }

    /* renamed from: c */
    public static StringBuilder m1106c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: d */
    public static Throwable m1107d(long j, String str, Exception exc) {
        C0550gu.m1819a(str, C0200av.m970a(j));
        return exc.getCause();
    }

    /* renamed from: e */
    public static Throwable m1108e(long j, String str, Throwable th) {
        C0550gu.m1819a(str, C0200av.m970a(j));
        return th.getCause();
    }

    /* renamed from: f */
    public static void m1109f(long j, long j2, byte[] bArr) {
        C0200av.m970a(j);
        C0200av.m970a(j2);
        new String(bArr);
    }

    /* renamed from: g */
    public static void m1110g(long j, String str, Exception exc) {
        C0550gu.m1819a(str, C0200av.m970a(j));
        C0550gu.m1821c(exc);
    }

    /* renamed from: h */
    public static void m1111h(long j, StringBuilder sb, int i) {
        sb.append(C0200av.m970a(j));
        sb.append(i);
    }

    /* renamed from: i */
    public static void m1112i(long j, StringBuilder sb, int i, long j2) {
        sb.append(C0200av.m970a(j));
        sb.append(i);
        sb.append(C0200av.m970a(j2));
    }

    /* renamed from: j */
    public static void m1113j(long j, StringBuilder sb, int i, long j2, Boolean bool, long j3, String str) {
        sb.append(C0200av.m970a(j));
        sb.append(i);
        sb.append(C0200av.m970a(j2));
        sb.append(bool);
        sb.append(C0200av.m970a(j3));
        sb.append(str);
    }

    /* renamed from: k */
    public static void m1114k(long j, StringBuilder sb, Exception exc, String str) {
        sb.append(C0200av.m970a(j));
        sb.append(exc.getMessage());
        C0550gu.m1822d(str, sb.toString());
    }

    /* renamed from: l */
    public static void m1115l(long j, StringBuilder sb, Throwable th, String str, Throwable th2) {
        sb.append(C0200av.m970a(j));
        sb.append(th.getMessage());
        C0550gu.m1819a(str, sb.toString());
        C0550gu.m1821c(th2);
    }

    /* renamed from: m */
    public static String m1116m(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.mo1101A());
        return sb.toString();
    }

    /* renamed from: n */
    public static void m1117n(StringBuilder sb, String str, long j) {
        C0550gu.m1820b(str, sb.toString());
        Thread.sleep(j);
    }

    /* renamed from: o */
    public static String m1118o(Exception exc, String str, long j) {
        C0550gu.m1819a(str, exc.toString());
        return C0200av.m970a(j);
    }

    /* renamed from: p */
    public static String m1119p(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    /* renamed from: q */
    public static String m1120q(String str, String str2) {
        return str + str2;
    }

    /* renamed from: r */
    public static String m1121r(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: s */
    public static String m1122s(StringBuilder sb, String str) {
        sb.append(str);
        return Integer.toHexString(sb.toString().hashCode());
    }

    /* renamed from: t */
    public static String m1123t(Throwable th, String str, long j) {
        C0550gu.m1819a(str, th.toString());
        return C0200av.m970a(j);
    }

    /* renamed from: u */
    public static String m1124u(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }
}
