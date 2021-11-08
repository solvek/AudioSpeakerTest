package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p000.C0821mb;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f135a;

    /* renamed from: b */
    public final ArrayDeque<C0243c> f136b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements C0868nb, C0201b {

        /* renamed from: a */
        public final C0821mb f137a;

        /* renamed from: b */
        public final C0243c f138b;

        /* renamed from: c */
        public C0201b f139c;

        public LifecycleOnBackPressedCancellable(C0821mb mbVar, C0243c cVar) {
            this.f137a = mbVar;
            this.f138b = cVar;
            mbVar.mo3678a(this);
        }

        public void cancel() {
            ((C1011qb) this.f137a).f3808a.mo4422e(this);
            this.f138b.f1312b.remove(this);
            C0201b bVar = this.f139c;
            if (bVar != null) {
                bVar.cancel();
                this.f139c = null;
            }
        }

        /* renamed from: g */
        public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
            if (aVar == C0821mb.C0822a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                C0243c cVar = this.f138b;
                onBackPressedDispatcher.f136b.add(cVar);
                C0037a aVar2 = new C0037a(cVar);
                cVar.f1312b.add(aVar2);
                this.f139c = aVar2;
            } else if (aVar == C0821mb.C0822a.ON_STOP) {
                C0201b bVar = this.f139c;
                if (bVar != null) {
                    bVar.cancel();
                }
            } else if (aVar == C0821mb.C0822a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0037a implements C0201b {

        /* renamed from: a */
        public final C0243c f141a;

        public C0037a(C0243c cVar) {
            this.f141a = cVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f136b.remove(this.f141a);
            this.f141a.f1312b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f135a = runnable;
    }

    /* renamed from: a */
    public void mo134a() {
        Iterator<C0243c> descendingIterator = this.f136b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0243c next = descendingIterator.next();
            if (next.f1311a) {
                next.mo1622a();
                return;
            }
        }
        Runnable runnable = this.f135a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
