package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: e3 */
public class C0404e3 extends ContextWrapper {

    /* renamed from: b */
    public static final Object f1955b = new Object();

    /* renamed from: c */
    public static ArrayList<WeakReference<C0404e3>> f1956c;

    /* renamed from: a */
    public final Resources f1957a;

    public C0404e3(Context context) {
        super(context);
        int i = C0803m3.f3212a;
        this.f1957a = new C0517g3(this, context.getResources());
    }

    /* renamed from: a */
    public static Context m1540a(Context context) {
        boolean z = false;
        if (!(context instanceof C0404e3) && !(context.getResources() instanceof C0517g3)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = C0803m3.f3212a;
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (f1955b) {
            ArrayList<WeakReference<C0404e3>> arrayList = f1956c;
            if (arrayList == null) {
                f1956c = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1956c.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1956c.remove(size);
                    }
                }
                for (int size2 = f1956c.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1956c.get(size2);
                    C0404e3 e3Var = weakReference2 != null ? (C0404e3) weakReference2.get() : null;
                    if (e3Var != null && e3Var.getBaseContext() == context) {
                        return e3Var;
                    }
                }
            }
            C0404e3 e3Var2 = new C0404e3(context);
            f1956c.add(new WeakReference(e3Var2));
            return e3Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1957a.getAssets();
    }

    public Resources getResources() {
        return this.f1957a;
    }

    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    public void setTheme(int i) {
        super.setTheme(i);
    }
}
