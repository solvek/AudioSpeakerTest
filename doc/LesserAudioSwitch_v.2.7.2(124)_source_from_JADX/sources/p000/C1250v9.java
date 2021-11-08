package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C0821mb;

/* renamed from: v9 */
public class C1250v9 extends ComponentActivity {

    /* renamed from: g */
    public final C0370da f4786g;

    /* renamed from: h */
    public final C1011qb f4787h = new C1011qb(this);

    /* renamed from: i */
    public boolean f4788i;

    /* renamed from: j */
    public boolean f4789j;

    /* renamed from: k */
    public boolean f4790k = true;

    /* renamed from: l */
    public int f4791l;

    /* renamed from: m */
    public C0713k4<String> f4792m;

    /* renamed from: v9$a */
    public class C1251a extends C0459fa<C1250v9> implements C0372dc, C0355d {
        public C1251a() {
            super(C1250v9.this);
        }

        /* renamed from: a */
        public C0821mb mo124a() {
            return C1250v9.this.f4787h;
        }

        /* renamed from: b */
        public View mo1591b(int i) {
            return C1250v9.this.findViewById(i);
        }

        /* renamed from: c */
        public OnBackPressedDispatcher mo125c() {
            return C1250v9.this.f125f;
        }

        /* renamed from: e */
        public C0264cc mo127e() {
            return C1250v9.this.mo127e();
        }

        /* renamed from: f */
        public boolean mo1592f() {
            Window window = C1250v9.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public void mo2772g(Fragment fragment) {
            C1250v9.this.mo4866n();
        }

        /* renamed from: h */
        public Object mo2773h() {
            return C1250v9.this;
        }

        /* renamed from: i */
        public LayoutInflater mo2774i() {
            return C1250v9.this.getLayoutInflater().cloneInContext(C1250v9.this);
        }

        /* renamed from: j */
        public boolean mo2775j(Fragment fragment) {
            return !C1250v9.this.isFinishing();
        }

        /* renamed from: k */
        public void mo2776k() {
            C1250v9.this.mo3886o();
        }
    }

    public C1250v9() {
        C1251a aVar = new C1251a();
        C1344x5.m3755f(aVar, "callbacks == null");
        this.f4786g = new C0370da(aVar);
    }

    /* renamed from: k */
    public static void m3501k(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: m */
    public static boolean m3502m(C0614ia iaVar, C0821mb.C0823b bVar) {
        boolean z = false;
        for (Fragment next : iaVar.f2642c.mo4007g()) {
            if (next != null) {
                C0459fa<?> faVar = next.f711s;
                if ((faVar == null ? null : faVar.mo2773h()) != null) {
                    z |= m3502m(next.mo866k(), bVar);
                }
                if (next.f690O.f3809b.compareTo(C0821mb.C0823b.STARTED) >= 0) {
                    next.f690O.mo4073f(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4788i);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4789j);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4790k);
        if (getApplication() != null) {
            C0414ec.m1565b(this).mo2720a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f4786g.f1886a.f2103e.mo3251x(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: l */
    public C0614ia mo4865l() {
        return this.f4786g.f1886a.f2103e;
    }

    /* renamed from: n */
    public void mo4866n() {
    }

    @Deprecated
    /* renamed from: o */
    public void mo3886o() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment I;
        this.f4786g.mo2643a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String d = this.f4792m.mo3518d(i4);
            this.f4792m.mo3522h(i4);
            if (d != null && (I = this.f4786g.f1886a.f2103e.mo3200I(d)) != null) {
                I.mo829G();
                return;
            }
            return;
        }
        int i5 = C1099s5.f4160c;
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4786g.mo2643a();
        this.f4786g.f1886a.f2103e.mo3235j(configuration);
    }

    public void onCreate(Bundle bundle) {
        C0459fa<?> faVar = this.f4786g.f1886a;
        faVar.f2103e.mo3221c(faVar, faVar, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0459fa<?> faVar2 = this.f4786g.f1886a;
            if (faVar2 instanceof C0372dc) {
                faVar2.f2103e.mo3218a0(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.f4791l = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                        this.f4792m = new C0713k4<>(intArray.length);
                        for (int i = 0; i < intArray.length; i++) {
                            this.f4792m.mo3521g(intArray[i], stringArray[i]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.f4792m == null) {
            this.f4792m = new C0713k4<>(10);
            this.f4791l = 0;
        }
        super.onCreate(bundle);
        this.f4787h.mo4072d(C0821mb.C0822a.ON_CREATE);
        this.f4786g.f1886a.f2103e.mo3238l();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0370da daVar = this.f4786g;
        return onCreatePanelMenu | daVar.f1886a.f2103e.mo3239m(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f4786g.f1886a.f2103e.f2645f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4786g.f1886a.f2103e.mo3240n();
        this.f4787h.mo4072d(C0821mb.C0822a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f4786g.f1886a.f2103e.mo3241o();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f4786g.f1886a.f2103e.mo3243q(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f4786g.f1886a.f2103e.mo3237k(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f4786g.f1886a.f2103e.mo3242p(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f4786g.mo2643a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f4786g.f1886a.f2103e.mo3244r(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.f4789j = false;
        this.f4786g.f1886a.f2103e.mo3249v(3);
        this.f4787h.mo4072d(C0821mb.C0822a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f4786g.f1886a.f2103e.mo3246t(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f4787h.mo4072d(C0821mb.C0822a.ON_RESUME);
        C0614ia iaVar = this.f4786g.f1886a.f2103e;
        iaVar.f2659t = false;
        iaVar.f2660u = false;
        iaVar.mo3249v(4);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.f4786g.f1886a.f2103e.mo3248u(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Fragment I;
        this.f4786g.mo2643a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String d = this.f4792m.mo3518d(i3);
            this.f4792m.mo3522h(i3);
            if (d != null && (I = this.f4786g.f1886a.f2103e.mo3200I(d)) != null) {
                I.mo848Z();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f4789j = true;
        this.f4786g.mo2643a();
        this.f4786g.f1886a.f2103e.mo3193B(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (m3502m(mo4865l(), C0821mb.C0823b.CREATED));
        this.f4787h.mo4072d(C0821mb.C0822a.ON_STOP);
        Parcelable b0 = this.f4786g.f1886a.f2103e.mo3220b0();
        if (b0 != null) {
            bundle.putParcelable("android:support:fragments", b0);
        }
        if (this.f4792m.mo3523i() > 0) {
            bundle.putInt("android:support:next_request_index", this.f4791l);
            int[] iArr = new int[this.f4792m.mo3523i()];
            String[] strArr = new String[this.f4792m.mo3523i()];
            for (int i = 0; i < this.f4792m.mo3523i(); i++) {
                iArr[i] = this.f4792m.mo3520f(i);
                strArr[i] = this.f4792m.mo3524j(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f4790k = false;
        if (!this.f4788i) {
            this.f4788i = true;
            C0614ia iaVar = this.f4786g.f1886a.f2103e;
            iaVar.f2659t = false;
            iaVar.f2660u = false;
            iaVar.mo3249v(2);
        }
        this.f4786g.mo2643a();
        this.f4786g.f1886a.f2103e.mo3193B(true);
        this.f4787h.mo4072d(C0821mb.C0822a.ON_START);
        C0614ia iaVar2 = this.f4786g.f1886a.f2103e;
        iaVar2.f2659t = false;
        iaVar2.f2660u = false;
        iaVar2.mo3249v(3);
    }

    public void onStateNotSaved() {
        this.f4786g.mo2643a();
    }

    public void onStop() {
        super.onStop();
        this.f4790k = true;
        do {
        } while (m3502m(mo4865l(), C0821mb.C0823b.CREATED));
        C0614ia iaVar = this.f4786g.f1886a.f2103e;
        iaVar.f2660u = true;
        iaVar.mo3249v(2);
        this.f4787h.mo4072d(C0821mb.C0822a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (i != -1) {
            m3501k(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            m3501k(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            m3501k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            m3501k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f4786g.f1886a.f2103e.f2645f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
