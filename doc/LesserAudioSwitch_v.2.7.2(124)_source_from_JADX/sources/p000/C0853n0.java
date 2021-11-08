package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: n0 */
public class C0853n0 extends ContextWrapper {

    /* renamed from: a */
    public int f3329a;

    /* renamed from: b */
    public Resources.Theme f3330b;

    /* renamed from: c */
    public LayoutInflater f3331c;

    /* renamed from: d */
    public Configuration f3332d;

    /* renamed from: e */
    public Resources f3333e;

    public C0853n0() {
        super((Context) null);
    }

    public C0853n0(Context context, int i) {
        super(context);
        this.f3329a = i;
    }

    /* renamed from: a */
    public void mo3722a(Configuration configuration) {
        if (this.f3333e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3332d == null) {
            this.f3332d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void mo3724b() {
        if (this.f3330b == null) {
            this.f3330b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3330b.setTo(theme);
            }
        }
        this.f3330b.applyStyle(this.f3329a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        Resources resources;
        if (this.f3333e == null) {
            Configuration configuration = this.f3332d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f3332d);
                this.f3333e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f3333e = resources;
        }
        return this.f3333e;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3331c == null) {
            this.f3331c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3331c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3330b;
        if (theme != null) {
            return theme;
        }
        if (this.f3329a == 0) {
            this.f3329a = 2131755439;
        }
        mo3724b();
        return this.f3330b;
    }

    public void setTheme(int i) {
        if (this.f3329a != i) {
            this.f3329a = i;
            mo3724b();
        }
    }
}
