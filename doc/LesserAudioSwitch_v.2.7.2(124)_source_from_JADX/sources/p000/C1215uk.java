package p000;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: uk */
public final class C1215uk {

    /* renamed from: j */
    public static boolean f4635j;

    /* renamed from: k */
    public static Constructor<StaticLayout> f4636k;

    /* renamed from: l */
    public static Object f4637l;

    /* renamed from: a */
    public CharSequence f4638a;

    /* renamed from: b */
    public final TextPaint f4639b;

    /* renamed from: c */
    public final int f4640c;

    /* renamed from: d */
    public int f4641d;

    /* renamed from: e */
    public Layout.Alignment f4642e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f4643f = Integer.MAX_VALUE;

    /* renamed from: g */
    public boolean f4644g = true;

    /* renamed from: h */
    public boolean f4645h;

    /* renamed from: i */
    public TextUtils.TruncateAt f4646i = null;

    /* renamed from: uk$a */
    public static class C1216a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1216a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = p000.C0279ch.m1106c(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1215uk.C1216a.<init>(java.lang.Throwable):void");
        }
    }

    public C1215uk(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4638a = charSequence;
        this.f4639b = textPaint;
        this.f4640c = i;
        this.f4641d = charSequence.length();
    }

    /* renamed from: a */
    public StaticLayout mo4780a() {
        Class cls;
        if (this.f4638a == null) {
            this.f4638a = "";
        }
        int max = Math.max(0, this.f4640c);
        CharSequence charSequence = this.f4638a;
        if (this.f4643f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f4639b, (float) max, this.f4646i);
        }
        int min = Math.min(charSequence.length(), this.f4641d);
        this.f4641d = min;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f4645h) {
                this.f4642e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f4639b, max);
            obtain.setAlignment(this.f4642e);
            obtain.setIncludePad(this.f4644g);
            obtain.setTextDirection(this.f4645h ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f4646i;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f4643f);
            return obtain.build();
        }
        if (!f4635j) {
            try {
                boolean z = this.f4645h && i >= 23;
                if (i >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f4637l = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = C1215uk.class.getClassLoader();
                    String str = this.f4645h ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f4637l = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f4636k = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f4635j = true;
            } catch (Exception e) {
                throw new C1216a(e);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f4636k;
            constructor.getClass();
            Object obj = f4637l;
            obj.getClass();
            return constructor.newInstance(new Object[]{charSequence, 0, Integer.valueOf(this.f4641d), this.f4639b, Integer.valueOf(max), this.f4642e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f4644g), null, Integer.valueOf(max), Integer.valueOf(this.f4643f)});
        } catch (Exception e2) {
            throw new C1216a(e2);
        }
    }
}
