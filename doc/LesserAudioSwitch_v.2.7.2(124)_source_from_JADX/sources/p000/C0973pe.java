package p000;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p000.C0677je;

/* renamed from: pe */
public class C0973pe extends C0677je {

    /* renamed from: A */
    public int f3618A;

    /* renamed from: B */
    public boolean f3619B = false;

    /* renamed from: C */
    public int f3620C = 0;

    /* renamed from: y */
    public ArrayList<C0677je> f3621y = new ArrayList<>();

    /* renamed from: z */
    public boolean f3622z = true;

    /* renamed from: pe$a */
    public class C0974a extends C0828me {

        /* renamed from: a */
        public final /* synthetic */ C0677je f3623a;

        public C0974a(C0973pe peVar, C0677je jeVar) {
            this.f3623a = jeVar;
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            this.f3623a.mo3457y();
            jeVar.mo3454v(this);
        }
    }

    /* renamed from: pe$b */
    public static class C0975b extends C0828me {

        /* renamed from: a */
        public C0973pe f3624a;

        public C0975b(C0973pe peVar) {
            this.f3624a = peVar;
        }

        /* renamed from: a */
        public void mo2723a(C0677je jeVar) {
            C0973pe peVar = this.f3624a;
            if (!peVar.f3619B) {
                peVar.mo3437F();
                this.f3624a.f3619B = true;
            }
        }

        /* renamed from: c */
        public void mo1759c(C0677je jeVar) {
            C0973pe peVar = this.f3624a;
            int i = peVar.f3618A - 1;
            peVar.f3618A = i;
            if (i == 0) {
                peVar.f3619B = false;
                peVar.mo3448m();
            }
            jeVar.mo3454v(this);
        }
    }

    /* renamed from: A */
    public void mo3432A(C0677je.C0680c cVar) {
        this.f2895t = cVar;
        this.f3620C |= 8;
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            this.f3621y.get(i).mo3432A(cVar);
        }
    }

    /* renamed from: B */
    public C0677je mo3433B(TimeInterpolator timeInterpolator) {
        this.f3620C |= 1;
        ArrayList<C0677je> arrayList = this.f3621y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3621y.get(i).mo3433B(timeInterpolator);
            }
        }
        this.f2880e = timeInterpolator;
        return this;
    }

    /* renamed from: C */
    public void mo3434C(C0468fe feVar) {
        this.f2896u = feVar == null ? C0677je.f2875w : feVar;
        this.f3620C |= 4;
        if (this.f3621y != null) {
            for (int i = 0; i < this.f3621y.size(); i++) {
                this.f3621y.get(i).mo3434C(feVar);
            }
        }
    }

    /* renamed from: D */
    public void mo3435D(C0925oe oeVar) {
        this.f3620C |= 2;
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            this.f3621y.get(i).mo3435D(oeVar);
        }
    }

    /* renamed from: E */
    public C0677je mo3436E(long j) {
        this.f2878c = j;
        return this;
    }

    /* renamed from: G */
    public String mo3438G(String str) {
        String G = super.mo3438G(str);
        for (int i = 0; i < this.f3621y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.f3621y.get(i).mo3438G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    /* renamed from: H */
    public C0973pe mo4015H(C0677je jeVar) {
        this.f3621y.add(jeVar);
        jeVar.f2885j = this;
        long j = this.f2879d;
        if (j >= 0) {
            jeVar.mo3458z(j);
        }
        if ((this.f3620C & 1) != 0) {
            jeVar.mo3433B(this.f2880e);
        }
        if ((this.f3620C & 2) != 0) {
            jeVar.mo3435D((C0925oe) null);
        }
        if ((this.f3620C & 4) != 0) {
            jeVar.mo3434C(this.f2896u);
        }
        if ((this.f3620C & 8) != 0) {
            jeVar.mo3432A(this.f2895t);
        }
        return this;
    }

    /* renamed from: I */
    public C0677je mo4016I(int i) {
        if (i < 0 || i >= this.f3621y.size()) {
            return null;
        }
        return this.f3621y.get(i);
    }

    /* renamed from: J */
    public C0973pe mo4017J(int i) {
        if (i == 0) {
            this.f3622z = true;
        } else if (i == 1) {
            this.f3622z = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: a */
    public C0677je mo3439a(C0677je.C0681d dVar) {
        super.mo3439a(dVar);
        return this;
    }

    /* renamed from: b */
    public C0677je mo3440b(View view) {
        for (int i = 0; i < this.f3621y.size(); i++) {
            this.f3621y.get(i).mo3440b(view);
        }
        this.f2882g.add(view);
        return this;
    }

    /* renamed from: d */
    public void mo1742d(C1059re reVar) {
        if (mo3451s(reVar.f3955b)) {
            Iterator<C0677je> it = this.f3621y.iterator();
            while (it.hasNext()) {
                C0677je next = it.next();
                if (next.mo3451s(reVar.f3955b)) {
                    next.mo1742d(reVar);
                    reVar.f3956c.add(next);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo3443f(C1059re reVar) {
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            this.f3621y.get(i).mo3443f(reVar);
        }
    }

    /* renamed from: g */
    public void mo1743g(C1059re reVar) {
        if (mo3451s(reVar.f3955b)) {
            Iterator<C0677je> it = this.f3621y.iterator();
            while (it.hasNext()) {
                C0677je next = it.next();
                if (next.mo3451s(reVar.f3955b)) {
                    next.mo1743g(reVar);
                    reVar.f3956c.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public C0677je clone() {
        C0973pe peVar = (C0973pe) super.clone();
        peVar.f3621y = new ArrayList<>();
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            C0677je j = this.f3621y.get(i).clone();
            peVar.f3621y.add(j);
            j.f2885j = peVar;
        }
        return peVar;
    }

    /* renamed from: l */
    public void mo3447l(ViewGroup viewGroup, C1109se seVar, C1109se seVar2, ArrayList<C1059re> arrayList, ArrayList<C1059re> arrayList2) {
        long j = this.f2878c;
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            C0677je jeVar = this.f3621y.get(i);
            if (j > 0 && (this.f3622z || i == 0)) {
                long j2 = jeVar.f2878c;
                if (j2 > 0) {
                    jeVar.mo3436E(j2 + j);
                } else {
                    jeVar.mo3436E(j);
                }
            }
            jeVar.mo3447l(viewGroup, seVar, seVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: u */
    public void mo3453u(View view) {
        super.mo3453u(view);
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            this.f3621y.get(i).mo3453u(view);
        }
    }

    /* renamed from: v */
    public C0677je mo3454v(C0677je.C0681d dVar) {
        super.mo3454v(dVar);
        return this;
    }

    /* renamed from: w */
    public C0677je mo3455w(View view) {
        for (int i = 0; i < this.f3621y.size(); i++) {
            this.f3621y.get(i).mo3455w(view);
        }
        this.f2882g.remove(view);
        return this;
    }

    /* renamed from: x */
    public void mo3456x(View view) {
        super.mo3456x(view);
        int size = this.f3621y.size();
        for (int i = 0; i < size; i++) {
            this.f3621y.get(i).mo3456x(view);
        }
    }

    /* renamed from: y */
    public void mo3457y() {
        if (this.f3621y.isEmpty()) {
            mo3437F();
            mo3448m();
            return;
        }
        C0975b bVar = new C0975b(this);
        Iterator<C0677je> it = this.f3621y.iterator();
        while (it.hasNext()) {
            it.next().mo3439a(bVar);
        }
        this.f3618A = this.f3621y.size();
        if (!this.f3622z) {
            for (int i = 1; i < this.f3621y.size(); i++) {
                this.f3621y.get(i - 1).mo3439a(new C0974a(this, this.f3621y.get(i)));
            }
            C0677je jeVar = this.f3621y.get(0);
            if (jeVar != null) {
                jeVar.mo3457y();
                return;
            }
            return;
        }
        Iterator<C0677je> it2 = this.f3621y.iterator();
        while (it2.hasNext()) {
            it2.next().mo3457y();
        }
    }

    /* renamed from: z */
    public C0677je mo3458z(long j) {
        ArrayList<C0677je> arrayList;
        this.f2879d = j;
        if (j >= 0 && (arrayList = this.f3621y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3621y.get(i).mo3458z(j);
            }
        }
        return this;
    }
}
