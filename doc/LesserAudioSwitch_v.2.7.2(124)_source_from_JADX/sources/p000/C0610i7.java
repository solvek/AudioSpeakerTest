package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: i7 */
public final class C0610i7 {

    /* renamed from: a */
    public final String f2629a;

    /* renamed from: b */
    public final String f2630b;

    /* renamed from: c */
    public final String f2631c;

    /* renamed from: d */
    public final List<List<byte[]>> f2632d;

    /* renamed from: e */
    public final String f2633e;

    public C0610i7(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2629a = str;
        this.f2630b = str2;
        this.f2631c = str3;
        list.getClass();
        this.f2632d = list;
        this.f2633e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder c = C0279ch.m1106c("FontRequest {mProviderAuthority: ");
        c.append(this.f2629a);
        c.append(", mProviderPackage: ");
        c.append(this.f2630b);
        c.append(", mQuery: ");
        c.append(this.f2631c);
        c.append(", mCertificates:");
        sb.append(c.toString());
        for (int i = 0; i < this.f2632d.size(); i++) {
            sb.append(" [");
            List list = this.f2632d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
