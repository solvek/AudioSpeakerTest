package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nordskog.LesserAudioSwitch.R;
import p000.C0968pc;

/* renamed from: lc */
public abstract class C0769lc extends Fragment implements C0968pc.C0971c, C0968pc.C0969a, C0968pc.C0970b, DialogPreference.C0109a {

    /* renamed from: T */
    public final C0772c f3132T = new C0772c();

    /* renamed from: U */
    public C0968pc f3133U;

    /* renamed from: V */
    public RecyclerView f3134V;

    /* renamed from: W */
    public boolean f3135W;

    /* renamed from: X */
    public boolean f3136X;

    /* renamed from: Y */
    public int f3137Y = R.layout.preference_list_fragment;

    /* renamed from: Z */
    public Handler f3138Z = new C0770a();

    /* renamed from: a0 */
    public final Runnable f3139a0 = new C0771b();

    /* renamed from: lc$a */
    public class C0770a extends Handler {
        public C0770a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                C0769lc lcVar = C0769lc.this;
                PreferenceScreen preferenceScreen = lcVar.f3133U.f3613g;
                if (preferenceScreen != null) {
                    lcVar.f3134V.setAdapter(new C0824mc(preferenceScreen));
                    preferenceScreen.mo955n();
                }
            }
        }
    }

    /* renamed from: lc$b */
    public class C0771b implements Runnable {
        public C0771b() {
        }

        public void run() {
            RecyclerView recyclerView = C0769lc.this.f3134V;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* renamed from: lc$c */
    public class C0772c extends RecyclerView.C0159l {

        /* renamed from: a */
        public Drawable f3142a;

        /* renamed from: b */
        public int f3143b;

        /* renamed from: c */
        public boolean f3144c = true;

        public C0772c() {
        }

        /* renamed from: d */
        public void mo1294d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0179x xVar) {
            if (mo3626g(view, recyclerView)) {
                rect.bottom = this.f3143b;
            }
        }

        /* renamed from: f */
        public void mo1296f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0179x xVar) {
            if (this.f3142a != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (mo3626g(childAt, recyclerView)) {
                        int height = childAt.getHeight() + ((int) childAt.getY());
                        this.f3142a.setBounds(0, height, width, this.f3143b + height);
                        this.f3142a.draw(canvas);
                    }
                }
            }
        }

        /* renamed from: g */
        public final boolean mo3626g(View view, RecyclerView recyclerView) {
            RecyclerView.C0145a0 J = recyclerView.mo1109J(view);
            boolean z = false;
            if (!((J instanceof C1056rc) && ((C1056rc) J).f3949v)) {
                return false;
            }
            boolean z2 = this.f3144c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.C0145a0 J2 = recyclerView.mo1109J(recyclerView.getChildAt(indexOfChild + 1));
            if ((J2 instanceof C1056rc) && ((C1056rc) J2).f3948u) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: lc$d */
    public interface C0773d {
        /* renamed from: a */
        boolean mo3627a(C0769lc lcVar, Preference preference);
    }

    /* renamed from: lc$e */
    public interface C0774e {
        /* renamed from: a */
        boolean mo3628a(C0769lc lcVar, Preference preference);
    }

    /* renamed from: lc$f */
    public interface C0775f {
        /* renamed from: a */
        boolean mo3629a(C0769lc lcVar, PreferenceScreen preferenceScreen);
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        TypedValue typedValue = new TypedValue();
        mo862i().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        mo862i().getTheme().applyStyle(i, false);
        C0968pc pcVar = new C0968pc(mo868l());
        this.f3133U = pcVar;
        pcVar.f3616j = this;
        Bundle bundle2 = this.f698f;
        mo2812x0(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    /* renamed from: O */
    public View mo837O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        TypedArray obtainStyledAttributes = mo868l().obtainStyledAttributes((AttributeSet) null, C1163tc.f4422h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f3137Y = obtainStyledAttributes.getResourceId(0, this.f3137Y);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(mo868l());
        View inflate = cloneInContext.inflate(this.f3137Y, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView y0 = mo3623y0(cloneInContext, viewGroup2);
            if (y0 != null) {
                this.f3134V = y0;
                y0.mo1150g(this.f3132T);
                C0772c cVar = this.f3132T;
                cVar.getClass();
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                }
                cVar.f3143b = i;
                cVar.f3142a = drawable;
                C0769lc.this.f3134V.mo1113O();
                if (dimensionPixelSize != -1) {
                    C0772c cVar2 = this.f3132T;
                    cVar2.f3143b = dimensionPixelSize;
                    C0769lc.this.f3134V.mo1113O();
                }
                this.f3132T.f3144c = z;
                if (this.f3134V.getParent() == null) {
                    viewGroup2.addView(this.f3134V);
                }
                this.f3138Z.post(this.f3139a0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    /* renamed from: P */
    public void mo838P() {
        this.f3138Z.removeCallbacks(this.f3139a0);
        this.f3138Z.removeMessages(1);
        if (this.f3135W) {
            this.f3134V.setAdapter((RecyclerView.C0149e) null);
            PreferenceScreen preferenceScreen = this.f3133U.f3613g;
            if (preferenceScreen != null) {
                preferenceScreen.mo958s();
            }
        }
        this.f3134V = null;
        this.f678C = true;
    }

    /* renamed from: b */
    public <T extends Preference> T mo912b(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C0968pc pcVar = this.f3133U;
        if (pcVar == null || (preferenceScreen = pcVar.f3613g) == null) {
            return null;
        }
        return preferenceScreen.mo969I(charSequence);
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f3133U.f3613g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo944b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    /* renamed from: c0 */
    public void mo851c0() {
        this.f678C = true;
        C0968pc pcVar = this.f3133U;
        pcVar.f3614h = this;
        pcVar.f3615i = this;
    }

    /* renamed from: d0 */
    public void mo852d0() {
        this.f678C = true;
        C0968pc pcVar = this.f3133U;
        pcVar.f3614h = null;
        pcVar.f3615i = null;
    }

    /* renamed from: e0 */
    public void mo853e0(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.f3133U.f3613g) == null)) {
            preferenceScreen2.mo943a(bundle2);
        }
        if (this.f3135W && (preferenceScreen = this.f3133U.f3613g) != null) {
            this.f3134V.setAdapter(new C0824mc(preferenceScreen));
            preferenceScreen.mo955n();
        }
        this.f3136X = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: w0 */
    public void mo3622w0(int i) {
        C0968pc pcVar = this.f3133U;
        if (pcVar != null) {
            Context l = mo868l();
            PreferenceScreen preferenceScreen = this.f3133U.f3613g;
            pcVar.f3611e = true;
            C0923oc ocVar = new C0923oc(l, pcVar);
            XmlResourceParser xml = l.getResources().getXml(i);
            try {
                Preference c = ocVar.mo3841c(xml, preferenceScreen);
                xml.close();
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) c;
                preferenceScreen2.mo956o(pcVar);
                SharedPreferences.Editor editor = pcVar.f3610d;
                if (editor != null) {
                    editor.apply();
                }
                boolean z = false;
                pcVar.f3611e = false;
                C0968pc pcVar2 = this.f3133U;
                PreferenceScreen preferenceScreen3 = pcVar2.f3613g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.mo958s();
                    }
                    pcVar2.f3613g = preferenceScreen2;
                    z = true;
                }
                if (z) {
                    this.f3135W = true;
                    if (this.f3136X && !this.f3138Z.hasMessages(1)) {
                        this.f3138Z.obtainMessage(1).sendToTarget();
                    }
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } else {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
    }

    /* renamed from: x0 */
    public abstract void mo2812x0(Bundle bundle, String str);

    /* renamed from: y0 */
    public RecyclerView mo3623y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (mo868l().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        mo868l();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView2.setAccessibilityDelegateCompat(new C1013qc(recyclerView2));
        return recyclerView2;
    }
}
