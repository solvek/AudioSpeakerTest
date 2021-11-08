package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: iu */
public class C0652iu<T> {

    /* renamed from: a */
    public String f2769a;

    /* renamed from: b */
    public String f2770b;

    /* renamed from: iu$a */
    public static class C0653a extends C0652iu {
        public C0653a(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public boolean mo3309a(Context context, boolean z) {
            return context.getSharedPreferences(this.f2769a, 0).getBoolean(this.f2770b, z);
        }

        /* renamed from: b */
        public void mo3310b(Context context, boolean z) {
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f2769a, 0).edit();
            edit.putBoolean(this.f2770b, z);
            edit.apply();
        }
    }

    /* renamed from: iu$b */
    public static class C0654b<T extends Enum<T>> extends C0652iu {
        public C0654b(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public T mo3311a(Context context, T t) {
            try {
                String string = context.getSharedPreferences(this.f2769a, 0).getString(this.f2770b, (String) null);
                return string != null ? Enum.valueOf(t.getDeclaringClass(), string) : t;
            } catch (Exception e) {
                e.printStackTrace();
                return t;
            }
        }

        /* renamed from: b */
        public void mo3312b(Context context, T t) {
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f2769a, 0).edit();
            edit.putString(this.f2770b, t.toString());
            edit.apply();
        }
    }

    public C0652iu(String str, String str2) {
        this.f2769a = str;
        this.f2770b = str2;
    }
}
