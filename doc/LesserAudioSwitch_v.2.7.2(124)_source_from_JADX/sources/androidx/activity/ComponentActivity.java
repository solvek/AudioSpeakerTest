package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import p000.C0821mb;

public class ComponentActivity extends C1399y5 implements C0967pb, C0372dc, C1452zd, C0355d {

    /* renamed from: c */
    public final C1011qb f122c;

    /* renamed from: d */
    public final C1414yd f123d = new C1414yd(this);

    /* renamed from: e */
    public C0264cc f124e;

    /* renamed from: f */
    public final OnBackPressedDispatcher f125f = new OnBackPressedDispatcher(new C0035a());

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0035a implements Runnable {
        public C0035a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public static final class C0036b {

        /* renamed from: a */
        public C0264cc f129a;
    }

    public ComponentActivity() {
        C1011qb qbVar = new C1011qb(this);
        this.f122c = qbVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            qbVar.mo3678a(new C0868nb() {
                /* renamed from: g */
                public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
                    if (aVar == C0821mb.C0822a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        qbVar.mo3678a(new C0868nb() {
            /* renamed from: g */
            public void mo132g(C0967pb pbVar, C0821mb.C0822a aVar) {
                if (aVar == C0821mb.C0822a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.mo127e().mo1737a();
                }
            }
        });
        if (19 <= i && i <= 23) {
            qbVar.mo3678a(new ImmLeaksCleaner(this));
        }
    }

    /* renamed from: a */
    public C0821mb mo124a() {
        return this.f122c;
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo125c() {
        return this.f125f;
    }

    /* renamed from: d */
    public final C1359xd mo126d() {
        return this.f123d.f5187b;
    }

    /* renamed from: e */
    public C0264cc mo127e() {
        if (getApplication() != null) {
            if (this.f124e == null) {
                C0036b bVar = (C0036b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f124e = bVar.f129a;
                }
                if (this.f124e == null) {
                    this.f124e = new C0264cc();
                }
            }
            return this.f124e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f125f.mo134a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f123d.mo5208a(bundle);
        C1356xb.m3816c(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        C0036b bVar;
        C0264cc ccVar = this.f124e;
        if (ccVar == null && (bVar = (C0036b) getLastNonConfigurationInstance()) != null) {
            ccVar = bVar.f129a;
        }
        if (ccVar == null) {
            return null;
        }
        C0036b bVar2 = new C0036b();
        bVar2.f129a = ccVar;
        return bVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C1011qb qbVar = this.f122c;
        if (qbVar instanceof C1011qb) {
            qbVar.mo4073f(C0821mb.C0823b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f123d.mo5209b(bundle);
    }
}
