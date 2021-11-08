package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.C0750l0;

/* renamed from: p */
public class C0947p extends C1250v9 implements C0994q {

    /* renamed from: n */
    public C1035r f3520n;

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo3900p().mo4143c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo3900p().mo4144d(context));
    }

    /* renamed from: b */
    public void mo3877b(C0750l0 l0Var) {
    }

    public void closeOptionsMenu() {
        C0496g q = mo3901q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0496g q = mo3901q();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public void mo3880f(C0750l0 l0Var) {
    }

    public <T extends View> T findViewById(int i) {
        return mo3900p().mo4145e(i);
    }

    /* renamed from: g */
    public C0750l0 mo3882g(C0750l0.C0751a aVar) {
        return null;
    }

    public MenuInflater getMenuInflater() {
        return mo3900p().mo4147g();
    }

    public Resources getResources() {
        int i = C0803m3.f3212a;
        return super.getResources();
    }

    public void invalidateOptionsMenu() {
        mo3900p().mo4150j();
    }

    /* renamed from: o */
    public void mo3886o() {
        mo3900p().mo4150j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo3900p().mo4151k(configuration);
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        C1035r p = mo3900p();
        p.mo4149i();
        p.mo4152l(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        mo3900p().mo4153m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0947p.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent A;
        boolean z;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0496g q = mo3901q();
        if (menuItem.getItemId() != 16908332 || q == null || (((C0356d0) q).f1846e.mo3368j() & 4) == 0 || (A = C1344x5.m3719A(this)) == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16) {
            z = shouldUpRecreateTask(A);
        } else {
            String action = getIntent().getAction();
            z = action != null && !action.equals("android.intent.action.MAIN");
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Intent r = mo3902r();
            if (r == null) {
                r = C1344x5.m3719A(this);
            }
            if (r != null) {
                ComponentName component = r.getComponent();
                if (component == null) {
                    component = r.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent B = C1344x5.m3720B(this, component);
                        if (B == null) {
                            break;
                        }
                        arrayList.add(size, B);
                        component = B.getComponent();
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(r);
            }
            mo3908t();
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = C0408e6.f1978a;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 16) {
                    startActivities(intentArr, (Bundle) null);
                } else {
                    startActivities(intentArr);
                }
                try {
                    int i4 = C1099s5.f4160c;
                    if (i3 >= 16) {
                        finishAffinity();
                        return true;
                    }
                    finish();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else if (i2 >= 16) {
            navigateUpTo(A);
            return true;
        } else {
            A.addFlags(67108864);
            startActivity(A);
            finish();
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo3900p().mo4154n(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        mo3900p().mo4155o();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo3900p().mo4156p(bundle);
    }

    public void onStart() {
        super.onStart();
        mo3900p().mo4157q();
    }

    public void onStop() {
        super.onStop();
        mo3900p().mo4158r();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo3900p().mo4164y(charSequence);
    }

    public void openOptionsMenu() {
        C0496g q = mo3901q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public C1035r mo3900p() {
        if (this.f3520n == null) {
            C0405e4<WeakReference<C1035r>> e4Var = C1035r.f3879b;
            this.f3520n = new C1079s(this, (Window) null, this, this);
        }
        return this.f3520n;
    }

    /* renamed from: q */
    public C0496g mo3901q() {
        return mo3900p().mo4148h();
    }

    /* renamed from: r */
    public Intent mo3902r() {
        return C1344x5.m3719A(this);
    }

    /* renamed from: s */
    public void mo3903s() {
    }

    public void setContentView(int i) {
        mo3900p().mo4160u(i);
    }

    public void setContentView(View view) {
        mo3900p().mo4161v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo3900p().mo4162w(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo3900p().mo4163x(i);
    }

    /* renamed from: t */
    public void mo3908t() {
    }
}
