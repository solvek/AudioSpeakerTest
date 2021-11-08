package p000;

import android.os.Build;

/* renamed from: on */
public final /* synthetic */ class C0935on {

    /* renamed from: a */
    public final /* synthetic */ C0936oo f3506a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3507b;

    public /* synthetic */ C0935on(C0936oo ooVar, boolean z) {
        this.f3506a = ooVar;
        this.f3507b = z;
    }

    /* renamed from: a */
    public final void mo3851a() {
        StringBuilder sb;
        String str;
        int i;
        Boolean bool;
        String str2;
        StringBuilder sb2;
        String str3;
        int i2;
        int i3;
        C0936oo ooVar = this.f3506a;
        boolean z = this.f3507b;
        ooVar.getClass();
        C0489fo foVar = C0489fo.WIRED_HEADPHONE;
        C0200av.m970a(-36231027446956L);
        C0200av.m970a(-36261092218028L);
        if (z) {
            C0544go goVar = C0544go.f2352N;
            ooVar.mo3857e(false, foVar, goVar);
            ooVar.mo3857e(true, foVar, goVar);
            C0735ko koVar = ooVar.f3511b;
            C0544go goVar2 = C0544go.f2363Y;
            bool = Boolean.TRUE;
            koVar.getClass();
            str2 = C0200av.m970a(-22762010006700L);
            i = 47;
            if (!str2.isEmpty() || goVar2.mo2961a()) {
                if (Build.VERSION.SDK_INT < 28) {
                    String str4 = goVar2.f2410c;
                    if (goVar2 == C0544go.f2374g || goVar2 == C0544go.f2376h || goVar2 == goVar) {
                        str4 = C0200av.m970a(-25996120380588L);
                    }
                    try {
                        i2 = ((Integer) (C0735ko.f3016e.getParameterTypes().length == 4 ? C0735ko.f3016e.invoke(C0735ko.f3015d, new Object[]{Integer.valueOf(goVar2.f2409b), 1, str2, str4}) : C0735ko.f3016e.invoke(C0735ko.f3015d, new Object[]{Integer.valueOf(goVar2.f2409b), 1, str2}))).intValue();
                    } catch (Exception e) {
                        Throwable d = C0279ch.m1107d(-26979667891372L, C0279ch.m1118o(e, C0279ch.m1104a(-26756329591980L, C0279ch.m1106c(C0200av.m970a(-26077724759212L)), e, C0200av.m970a(-26726264820908L), -26919538349228L), -26949603120300L), e);
                        if (d != null) {
                            C0279ch.m1115l(-27091337041068L, new StringBuilder(), d, C0200av.m970a(-27061272269996L), d);
                        } else {
                            C0550gu.m1819a(C0200av.m970a(-27125696779436L), C0200av.m970a(-27155761550508L));
                        }
                        C0550gu.m1821c(e);
                        i2 = -999;
                        str3 = C0200av.m970a(-26322537895084L);
                        sb2 = new StringBuilder();
                        sb2.append(C0200av.m970a(-26352602666156L));
                        sb2.append(i);
                        sb2.append(C0200av.m970a(-26374077502636L));
                        sb2.append(bool);
                        sb2.append(C0200av.m970a(-26386962404524L));
                        sb2.append(str2);
                        sb2.append(C0200av.m970a(-26412732208300L));
                        sb2.append(i2);
                        str = str3;
                        sb = sb2;
                        C0550gu.m1820b(str, sb.toString());
                    }
                } else if (koVar.f3020a == null) {
                    C0550gu.m1819a(C0200av.m970a(-24411277448364L), C0200av.m970a(-24441342219436L));
                    i2 = 1;
                } else {
                    String a = C0200av.m970a(-24518651630764L);
                    try {
                        if (C0735ko.f3017f.getParameterTypes().length == 3) {
                            C0735ko.f3017f.invoke(koVar.f3020a, new Object[]{Integer.valueOf(goVar2.f2409b), 1, a});
                        } else {
                            C0735ko.f3017f.invoke(koVar.f3020a, new Object[]{Integer.valueOf(goVar2.f2409b), 1, str2, a});
                        }
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable e2 = C0279ch.m1108e(-26979667891372L, C0279ch.m1123t(th, C0279ch.m1105b(-26756329591980L, C0279ch.m1106c(C0200av.m970a(-24600256009388L)), th, C0200av.m970a(-26726264820908L), -26919538349228L), -26949603120300L), th);
                        if (e2 != null) {
                            C0279ch.m1115l(-27091337041068L, new StringBuilder(), e2, C0200av.m970a(-27061272269996L), e2);
                        } else {
                            C0550gu.m1819a(C0200av.m970a(-27125696779436L), C0200av.m970a(-27155761550508L));
                        }
                        C0550gu.m1821c(th);
                        i2 = -999;
                        str3 = C0200av.m970a(-26322537895084L);
                        sb2 = new StringBuilder();
                        sb2.append(C0200av.m970a(-26352602666156L));
                        sb2.append(i);
                        sb2.append(C0200av.m970a(-26374077502636L));
                        sb2.append(bool);
                        sb2.append(C0200av.m970a(-26386962404524L));
                        sb2.append(str2);
                        sb2.append(C0200av.m970a(-26412732208300L));
                        sb2.append(i2);
                        str = str3;
                        sb = sb2;
                        C0550gu.m1820b(str, sb.toString());
                    }
                }
                str3 = C0200av.m970a(-26322537895084L);
                sb2 = new StringBuilder();
                sb2.append(C0200av.m970a(-26352602666156L));
                sb2.append(i);
                sb2.append(C0200av.m970a(-26374077502636L));
                sb2.append(bool);
                sb2.append(C0200av.m970a(-26386962404524L));
                sb2.append(str2);
                sb2.append(C0200av.m970a(-26412732208300L));
                sb2.append(i2);
                str = str3;
                sb = sb2;
                C0550gu.m1820b(str, sb.toString());
            }
            str = C0200av.m970a(-26107789530284L);
            sb = new StringBuilder();
        } else {
            C0544go goVar3 = C0544go.f2352N;
            ooVar.mo3857e(false, foVar, goVar3);
            ooVar.mo3857e(true, foVar, goVar3);
            C0735ko koVar2 = ooVar.f3511b;
            C0544go goVar4 = C0544go.f2373f0;
            bool = Boolean.TRUE;
            koVar2.getClass();
            str2 = C0200av.m970a(-22762010006700L);
            i = 54;
            if (!str2.isEmpty() || goVar4.mo2961a()) {
                if (Build.VERSION.SDK_INT < 28) {
                    String str5 = goVar4.f2410c;
                    if (goVar4 == C0544go.f2374g || goVar4 == C0544go.f2376h || goVar4 == goVar3) {
                        str5 = C0200av.m970a(-25996120380588L);
                    }
                    try {
                        i3 = ((Integer) (C0735ko.f3016e.getParameterTypes().length == 4 ? C0735ko.f3016e.invoke(C0735ko.f3015d, new Object[]{Integer.valueOf(goVar4.f2409b), 1, str2, str5}) : C0735ko.f3016e.invoke(C0735ko.f3015d, new Object[]{Integer.valueOf(goVar4.f2409b), 1, str2}))).intValue();
                    } catch (Exception e3) {
                        Throwable d2 = C0279ch.m1107d(-26979667891372L, C0279ch.m1118o(e3, C0279ch.m1104a(-26756329591980L, C0279ch.m1106c(C0200av.m970a(-26077724759212L)), e3, C0200av.m970a(-26726264820908L), -26919538349228L), -26949603120300L), e3);
                        if (d2 != null) {
                            C0279ch.m1115l(-27091337041068L, new StringBuilder(), d2, C0200av.m970a(-27061272269996L), d2);
                        } else {
                            C0550gu.m1819a(C0200av.m970a(-27125696779436L), C0200av.m970a(-27155761550508L));
                        }
                        C0550gu.m1821c(e3);
                        i3 = -999;
                        str3 = C0200av.m970a(-26322537895084L);
                        sb2 = new StringBuilder();
                        sb2.append(C0200av.m970a(-26352602666156L));
                        sb2.append(i);
                        sb2.append(C0200av.m970a(-26374077502636L));
                        sb2.append(bool);
                        sb2.append(C0200av.m970a(-26386962404524L));
                        sb2.append(str2);
                        sb2.append(C0200av.m970a(-26412732208300L));
                        sb2.append(i2);
                        str = str3;
                        sb = sb2;
                        C0550gu.m1820b(str, sb.toString());
                    }
                } else if (koVar2.f3020a == null) {
                    C0550gu.m1819a(C0200av.m970a(-24411277448364L), C0200av.m970a(-24441342219436L));
                    i3 = 1;
                } else {
                    String a2 = C0200av.m970a(-24518651630764L);
                    try {
                        if (C0735ko.f3017f.getParameterTypes().length == 3) {
                            C0735ko.f3017f.invoke(koVar2.f3020a, new Object[]{Integer.valueOf(goVar4.f2409b), 1, a2});
                        } else {
                            C0735ko.f3017f.invoke(koVar2.f3020a, new Object[]{Integer.valueOf(goVar4.f2409b), 1, str2, a2});
                        }
                        i3 = 0;
                    } catch (Throwable th2) {
                        Throwable e4 = C0279ch.m1108e(-26979667891372L, C0279ch.m1123t(th2, C0279ch.m1105b(-26756329591980L, C0279ch.m1106c(C0200av.m970a(-24600256009388L)), th2, C0200av.m970a(-26726264820908L), -26919538349228L), -26949603120300L), th2);
                        if (e4 != null) {
                            C0279ch.m1115l(-27091337041068L, new StringBuilder(), e4, C0200av.m970a(-27061272269996L), e4);
                        } else {
                            C0550gu.m1819a(C0200av.m970a(-27125696779436L), C0200av.m970a(-27155761550508L));
                        }
                        C0550gu.m1821c(th2);
                        i3 = -999;
                        str3 = C0200av.m970a(-26322537895084L);
                        sb2 = new StringBuilder();
                        sb2.append(C0200av.m970a(-26352602666156L));
                        sb2.append(i);
                        sb2.append(C0200av.m970a(-26374077502636L));
                        sb2.append(bool);
                        sb2.append(C0200av.m970a(-26386962404524L));
                        sb2.append(str2);
                        sb2.append(C0200av.m970a(-26412732208300L));
                        sb2.append(i2);
                        str = str3;
                        sb = sb2;
                        C0550gu.m1820b(str, sb.toString());
                    }
                }
                str3 = C0200av.m970a(-26322537895084L);
                sb2 = new StringBuilder();
                sb2.append(C0200av.m970a(-26352602666156L));
                sb2.append(i);
                sb2.append(C0200av.m970a(-26374077502636L));
                sb2.append(bool);
                sb2.append(C0200av.m970a(-26386962404524L));
                sb2.append(str2);
                sb2.append(C0200av.m970a(-26412732208300L));
                sb2.append(i2);
                str = str3;
                sb = sb2;
                C0550gu.m1820b(str, sb.toString());
            }
            str = C0200av.m970a(-26107789530284L);
            sb = new StringBuilder();
        }
        C0279ch.m1111h(-26137854301356L, sb, i);
        sb.append(C0200av.m970a(-26206573778092L));
        C0550gu.m1820b(str, sb.toString());
    }
}
