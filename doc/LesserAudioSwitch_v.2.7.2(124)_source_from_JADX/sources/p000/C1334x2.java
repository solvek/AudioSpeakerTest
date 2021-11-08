package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p000.C0874nf;
import p000.C1231v1;

/* renamed from: x2 */
public final class C1334x2 {

    /* renamed from: h */
    public static final PorterDuff.Mode f5002h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static C1334x2 f5003i;

    /* renamed from: j */
    public static final C1337c f5004j = new C1337c(6);

    /* renamed from: a */
    public WeakHashMap<Context, C0713k4<ColorStateList>> f5005a;

    /* renamed from: b */
    public C0663j4<String, C1338d> f5006b;

    /* renamed from: c */
    public C0713k4<String> f5007c;

    /* renamed from: d */
    public final WeakHashMap<Context, C0518g4<WeakReference<Drawable.ConstantState>>> f5008d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f5009e;

    /* renamed from: f */
    public boolean f5010f;

    /* renamed from: g */
    public C1339e f5011g;

    /* renamed from: x2$a */
    public static class C1335a implements C1338d {
        /* renamed from: a */
        public Drawable mo5048a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0441f0.m1614g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: x2$b */
    public static class C1336b implements C1338d {
        /* renamed from: a */
        public Drawable mo5048a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0874nf nfVar = new C0874nf(context, (C0874nf.C0876b) null, (Resources) null);
                nfVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return nfVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: x2$c */
    public static class C1337c extends C0556h4<Integer, PorterDuffColorFilter> {
        public C1337c(int i) {
            super(i);
        }
    }

    /* renamed from: x2$d */
    public interface C1338d {
        /* renamed from: a */
        Drawable mo5048a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: x2$e */
    public interface C1339e {
    }

    /* renamed from: x2$f */
    public static class C1340f implements C1338d {
        /* renamed from: a */
        public Drawable mo5048a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1110sf.m3171a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized C1334x2 m3686d() {
        C1334x2 x2Var;
        synchronized (C1334x2.class) {
            if (f5003i == null) {
                C1334x2 x2Var2 = new C1334x2();
                f5003i = x2Var2;
                if (Build.VERSION.SDK_INT < 24) {
                    x2Var2.mo5038a("vector", new C1340f());
                    x2Var2.mo5038a("animated-vector", new C1336b());
                    x2Var2.mo5038a("animated-selector", new C1335a());
                }
            }
            x2Var = f5003i;
        }
        return x2Var;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m3687h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1334x2.class) {
            C1337c cVar = f5004j;
            cVar.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.mo3036a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                cVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.mo3037b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final void mo5038a(String str, C1338d dVar) {
        if (this.f5006b == null) {
            this.f5006b = new C0663j4<>();
        }
        this.f5006b.put(str, dVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo5039b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0518g4 g4Var = this.f5008d.get(context);
            if (g4Var == null) {
                g4Var = new C0518g4();
                this.f5008d.put(context, g4Var);
            }
            g4Var.mo2929g(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final Drawable mo5040c(Context context, int i) {
        if (this.f5009e == null) {
            this.f5009e = new TypedValue();
        }
        TypedValue typedValue = this.f5009e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e = mo5041e(context, j);
        if (e != null) {
            return e;
        }
        C1339e eVar = this.f5011g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            C1231v1.C1232a aVar = (C1231v1.C1232a) eVar;
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{mo5042f(context, R.drawable.abc_cab_background_internal_bg), mo5042f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo5039b(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f2265d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo5041e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, g4<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f5008d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            g4 r0 = (p000.C0518g4) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo2928f(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f2264c     // Catch:{ all -> 0x0041 }
            int r2 = r0.f2266e     // Catch:{ all -> 0x0041 }
            int r4 = p000.C0453f4.m1646b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f2265d     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = p000.C0518g4.f2262f     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f2263b = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1334x2.mo5041e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: f */
    public synchronized Drawable mo5042f(Context context, int i) {
        return mo5043g(context, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable mo5043g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f5010f     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f5010f = r0     // Catch:{ all -> 0x0048 }
            r1 = 2131165335(0x7f070097, float:1.7944884E38)
            android.graphics.drawable.Drawable r1 = r4.mo5042f(r5, r1)     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            boolean r3 = r1 instanceof p000.C1110sf     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0048 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x004a
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.mo5045j(r5, r6)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.mo5040c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0035:
            if (r0 != 0) goto L_0x003b
            android.graphics.drawable.Drawable r0 = p000.C0408e6.m1548b(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r4.mo5046k(r5, r6, r7, r0)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            p000.C0912o2.m2665b(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)
            return r0
        L_0x0048:
            r5 = move-exception
            goto L_0x0054
        L_0x004a:
            r4.f5010f = r2     // Catch:{ all -> 0x0048 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0048 }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0054:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1334x2.mo5043g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList mo5044i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, k4<android.content.res.ColorStateList>> r0 = r3.f5005a     // Catch:{ all -> 0x004b }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004b }
            k4 r0 = (p000.C0713k4) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.mo3519e(r5, r1)     // Catch:{ all -> 0x004b }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x004b }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004d
            x2$e r0 = r3.f5011g     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            v1$a r0 = (p000.C1231v1.C1232a) r0     // Catch:{ all -> 0x004b }
            android.content.res.ColorStateList r1 = r0.mo4806c(r4, r5)     // Catch:{ all -> 0x004b }
        L_0x0023:
            if (r1 == 0) goto L_0x0049
            java.util.WeakHashMap<android.content.Context, k4<android.content.res.ColorStateList>> r0 = r3.f5005a     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x004b }
            r0.<init>()     // Catch:{ all -> 0x004b }
            r3.f5005a = r0     // Catch:{ all -> 0x004b }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, k4<android.content.res.ColorStateList>> r0 = r3.f5005a     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004b }
            k4 r0 = (p000.C0713k4) r0     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0046
            k4 r0 = new k4     // Catch:{ all -> 0x004b }
            r2 = 10
            r0.<init>(r2)     // Catch:{ all -> 0x004b }
            java.util.WeakHashMap<android.content.Context, k4<android.content.res.ColorStateList>> r2 = r3.f5005a     // Catch:{ all -> 0x004b }
            r2.put(r4, r0)     // Catch:{ all -> 0x004b }
        L_0x0046:
            r0.mo3514a(r5, r1)     // Catch:{ all -> 0x004b }
        L_0x0049:
            r0 = r1
            goto L_0x004d
        L_0x004b:
            r4 = move-exception
            goto L_0x004f
        L_0x004d:
            monitor-exit(r3)
            return r0
        L_0x004f:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1334x2.mo5044i(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{ Exception -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3 A[Catch:{ Exception -> 0x00a1 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo5045j(android.content.Context r11, int r12) {
        /*
            r10 = this;
            j4<java.lang.String, x2$d> r0 = r10.f5006b
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b3
            k4<java.lang.String> r0 = r10.f5007c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo3519e(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x0031
            j4<java.lang.String, x2$d> r3 = r10.f5006b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            return r1
        L_0x0028:
            k4 r0 = new k4
            r1 = 10
            r0.<init>(r1)
            r10.f5007c = r0
        L_0x0031:
            android.util.TypedValue r0 = r10.f5009e
            if (r0 != 0) goto L_0x003c
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f5009e = r0
        L_0x003c:
            android.util.TypedValue r0 = r10.f5009e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.mo5041e(r11, r4)
            if (r6 == 0) goto L_0x0057
            return r6
        L_0x0057:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ab
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a1 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a1 }
        L_0x006f:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a1 }
            r9 = 2
            if (r8 == r9) goto L_0x0079
            if (r8 == r3) goto L_0x0079
            goto L_0x006f
        L_0x0079:
            if (r8 != r9) goto L_0x00a3
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a1 }
            k4<java.lang.String> r8 = r10.f5007c     // Catch:{ Exception -> 0x00a1 }
            r8.mo3514a(r12, r3)     // Catch:{ Exception -> 0x00a1 }
            j4<java.lang.String, x2$d> r8 = r10.f5006b     // Catch:{ Exception -> 0x00a1 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a1 }
            x2$d r3 = (p000.C1334x2.C1338d) r3     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x0096
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a1 }
            android.graphics.drawable.Drawable r6 = r3.mo5048a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a1 }
        L_0x0096:
            if (r6 == 0) goto L_0x00ab
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a1 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a1 }
            r10.mo5039b(r11, r4, r6)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00ab
        L_0x00a1:
            goto L_0x00ab
        L_0x00a3:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a1 }
            throw r11     // Catch:{ Exception -> 0x00a1 }
        L_0x00ab:
            if (r6 != 0) goto L_0x00b2
            k4<java.lang.String> r11 = r10.f5007c
            r11.mo3514a(r12, r2)
        L_0x00b2:
            return r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1334x2.mo5045j(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: k */
    public final Drawable mo5046k(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList i2 = mo5044i(context, i);
        PorterDuff.Mode mode = null;
        if (i2 != null) {
            if (C0912o2.m2664a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable j0 = C1344x5.m3764j0(drawable);
            C1344x5.m3752d0(j0, i2);
            C1339e eVar = this.f5011g;
            if (eVar != null) {
                C1231v1.C1232a aVar = (C1231v1.C1232a) eVar;
                if (i == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return j0;
            }
            C1344x5.m3754e0(j0, mode);
            return j0;
        }
        C1339e eVar2 = this.f5011g;
        if (eVar2 != null) {
            C1231v1.C1232a aVar2 = (C1231v1.C1232a) eVar2;
            aVar2.getClass();
            boolean z2 = true;
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c = C0253c3.m1049c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1231v1.f4694b;
                aVar2.mo4807d(findDrawableByLayerId, c, mode2);
                aVar2.mo4807d(layerDrawable.findDrawableByLayerId(16908303), C0253c3.m1049c(context, R.attr.colorControlNormal), mode2);
                aVar2.mo4807d(layerDrawable.findDrawableByLayerId(16908301), C0253c3.m1049c(context, R.attr.colorControlActivated), mode2);
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b = C0253c3.m1048b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1231v1.f4694b;
                aVar2.mo4807d(findDrawableByLayerId2, b, mode3);
                aVar2.mo4807d(layerDrawable2.findDrawableByLayerId(16908303), C0253c3.m1049c(context, R.attr.colorControlActivated), mode3);
                aVar2.mo4807d(layerDrawable2.findDrawableByLayerId(16908301), C0253c3.m1049c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (mo5047l(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5047l(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            x2$e r0 = r7.f5011g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0072
            v1$a r0 = (p000.C1231v1.C1232a) r0
            r0.getClass()
            android.graphics.PorterDuff$Mode r3 = p000.C1231v1.f4694b
            int[] r4 = r0.f4697a
            boolean r4 = r0.mo4804a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001d
            r5 = 2130903212(0x7f0300ac, float:1.7413236E38)
            goto L_0x0049
        L_0x001d:
            int[] r4 = r0.f4699c
            boolean r4 = r0.mo4804a(r4, r9)
            if (r4 == 0) goto L_0x0029
            r5 = 2130903210(0x7f0300aa, float:1.7413232E38)
            goto L_0x0049
        L_0x0029:
            int[] r4 = r0.f4700d
            boolean r0 = r0.mo4804a(r4, r9)
            if (r0 == 0) goto L_0x0034
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0049
        L_0x0034:
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            if (r9 != r0) goto L_0x0044
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131165269(0x7f070055, float:1.794475E38)
            if (r9 != r0) goto L_0x004d
        L_0x0049:
            r9 = r5
            r0 = -1
        L_0x004b:
            r4 = 1
            goto L_0x0050
        L_0x004d:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x006e
            boolean r4 = p000.C0912o2.m2664a(r10)
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x005c:
            int r8 = p000.C0253c3.m1049c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = p000.C1231v1.m3414c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x006c
            r10.setAlpha(r0)
        L_0x006c:
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            if (r8 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1334x2.mo5047l(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
