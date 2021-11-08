package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* renamed from: pc */
public class C0968pc {

    /* renamed from: a */
    public Context f3607a;

    /* renamed from: b */
    public long f3608b = 0;

    /* renamed from: c */
    public SharedPreferences f3609c;

    /* renamed from: d */
    public SharedPreferences.Editor f3610d;

    /* renamed from: e */
    public boolean f3611e;

    /* renamed from: f */
    public String f3612f;

    /* renamed from: g */
    public PreferenceScreen f3613g;

    /* renamed from: h */
    public C0971c f3614h;

    /* renamed from: i */
    public C0969a f3615i;

    /* renamed from: j */
    public C0970b f3616j;

    /* renamed from: pc$a */
    public interface C0969a {
    }

    /* renamed from: pc$b */
    public interface C0970b {
    }

    /* renamed from: pc$c */
    public interface C0971c {
    }

    public C0968pc(Context context) {
        this.f3607a = context;
        mo4011c(context.getPackageName() + "_preferences");
    }

    /* renamed from: a */
    public SharedPreferences.Editor mo4009a() {
        if (!this.f3611e) {
            return mo4010b().edit();
        }
        if (this.f3610d == null) {
            this.f3610d = mo4010b().edit();
        }
        return this.f3610d;
    }

    /* renamed from: b */
    public SharedPreferences mo4010b() {
        if (this.f3609c == null) {
            this.f3609c = this.f3607a.getSharedPreferences(this.f3612f, 0);
        }
        return this.f3609c;
    }

    /* renamed from: c */
    public void mo4011c(String str) {
        this.f3612f = str;
        this.f3609c = null;
    }
}
