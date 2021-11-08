package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mb */
public abstract class C0821mb {

    /* renamed from: mb$a */
    public enum C0822a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: mb$b */
    public enum C0823b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public C0821mb() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract void mo3678a(C0922ob obVar);
}
