package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: re */
public class C1059re {

    /* renamed from: a */
    public final Map<String, Object> f3954a = new HashMap();

    /* renamed from: b */
    public View f3955b;

    /* renamed from: c */
    public final ArrayList<C0677je> f3956c = new ArrayList<>();

    @Deprecated
    public C1059re() {
    }

    public C1059re(View view) {
        this.f3955b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1059re)) {
            return false;
        }
        C1059re reVar = (C1059re) obj;
        return this.f3955b == reVar.f3955b && this.f3954a.equals(reVar.f3954a);
    }

    public int hashCode() {
        return this.f3954a.hashCode() + (this.f3955b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder c = C0279ch.m1106c("TransitionValues@");
        c.append(Integer.toHexString(hashCode()));
        c.append(":\n");
        String q = C0279ch.m1120q(c.toString() + "    view = " + this.f3955b + "\n", "    values:");
        for (String next : this.f3954a.keySet()) {
            q = q + "    " + next + ": " + this.f3954a.get(next) + "\n";
        }
        return q;
    }
}
