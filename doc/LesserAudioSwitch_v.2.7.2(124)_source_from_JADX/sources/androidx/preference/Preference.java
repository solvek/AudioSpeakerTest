package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000.C0769lc;
import p000.C0968pc;

public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public boolean f781A;

    /* renamed from: B */
    public boolean f782B;

    /* renamed from: C */
    public boolean f783C;

    /* renamed from: D */
    public boolean f784D;

    /* renamed from: E */
    public int f785E;

    /* renamed from: F */
    public int f786F;

    /* renamed from: G */
    public C0122c f787G;

    /* renamed from: H */
    public List<Preference> f788H;

    /* renamed from: I */
    public PreferenceGroup f789I;

    /* renamed from: J */
    public boolean f790J;

    /* renamed from: K */
    public C0124e f791K;

    /* renamed from: L */
    public C0125f f792L;

    /* renamed from: M */
    public final View.OnClickListener f793M;

    /* renamed from: b */
    public Context f794b;

    /* renamed from: c */
    public C0968pc f795c;

    /* renamed from: d */
    public long f796d;

    /* renamed from: e */
    public boolean f797e;

    /* renamed from: f */
    public C0123d f798f;

    /* renamed from: g */
    public int f799g;

    /* renamed from: h */
    public CharSequence f800h;

    /* renamed from: i */
    public CharSequence f801i;

    /* renamed from: j */
    public int f802j;

    /* renamed from: k */
    public Drawable f803k;

    /* renamed from: l */
    public String f804l;

    /* renamed from: m */
    public Intent f805m;

    /* renamed from: n */
    public String f806n;

    /* renamed from: o */
    public Bundle f807o;

    /* renamed from: p */
    public boolean f808p;

    /* renamed from: q */
    public boolean f809q;

    /* renamed from: r */
    public boolean f810r;

    /* renamed from: s */
    public String f811s;

    /* renamed from: t */
    public Object f812t;

    /* renamed from: u */
    public boolean f813u;

    /* renamed from: v */
    public boolean f814v;

    /* renamed from: w */
    public boolean f815w;

    /* renamed from: x */
    public boolean f816x;

    /* renamed from: y */
    public boolean f817y;

    /* renamed from: z */
    public boolean f818z;

    /* renamed from: androidx.preference.Preference$a */
    public class C0119a implements View.OnClickListener {
        public C0119a() {
        }

        public void onClick(View view) {
            Preference.this.mo907A(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public static class C0120b extends AbsSavedState {
        public static final Parcelable.Creator<C0120b> CREATOR = new C0121a();

        /* renamed from: androidx.preference.Preference$b$a */
        public static class C0121a implements Parcelable.Creator<C0120b> {
            public Object createFromParcel(Parcel parcel) {
                return new C0120b(parcel);
            }

            public Object[] newArray(int i) {
                return new C0120b[i];
            }
        }

        public C0120b(Parcel parcel) {
            super(parcel);
        }

        public C0120b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C0122c {
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C0123d {
        /* renamed from: a */
        boolean mo966a(Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    public static class C0124e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final Preference f820b;

        public C0124e(Preference preference) {
            this.f820b = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence i = this.f820b.mo929i();
            if (this.f820b.f783C && !TextUtils.isEmpty(i)) {
                contextMenu.setHeaderTitle(i);
                contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence i = this.f820b.mo929i();
            ((ClipboardManager) this.f820b.f794b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", i));
            Context context = this.f820b.f794b;
            Toast.makeText(context, context.getString(R.string.preference_copied, new Object[]{i}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$f */
    public interface C0125f<T extends Preference> {
        /* renamed from: a */
        CharSequence mo925a(T t);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m6.m2440a(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0101, code lost:
        if (r5.hasValue(11) != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r4.f799g = r0
            r1 = 1
            r4.f808p = r1
            r4.f809q = r1
            r4.f810r = r1
            r4.f813u = r1
            r4.f814v = r1
            r4.f815w = r1
            r4.f816x = r1
            r4.f817y = r1
            r4.f781A = r1
            r4.f784D = r1
            r2 = 2131427432(0x7f0b0068, float:1.847648E38)
            r4.f785E = r2
            androidx.preference.Preference$a r3 = new androidx.preference.Preference$a
            r3.<init>()
            r4.f793M = r3
            r4.f794b = r5
            int[] r3 = p000.C1163tc.f4421g
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3, r7, r8)
            r6 = 23
            r7 = 0
            int r6 = p000.C0806m6.m2444e(r5, r6, r7, r7)
            r4.f802j = r6
            r6 = 26
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x0047
            r6 = 6
            java.lang.String r6 = r5.getString(r6)
        L_0x0047:
            r4.f804l = r6
            r6 = 34
            r8 = 4
            java.lang.CharSequence r6 = r5.getText(r6)
            if (r6 != 0) goto L_0x0056
            java.lang.CharSequence r6 = r5.getText(r8)
        L_0x0056:
            r4.f800h = r6
            r6 = 33
            r8 = 7
            java.lang.CharSequence r6 = r5.getText(r6)
            if (r6 != 0) goto L_0x0065
            java.lang.CharSequence r6 = r5.getText(r8)
        L_0x0065:
            r4.f801i = r6
            r6 = 28
            r8 = 8
            int r8 = r5.getInt(r8, r0)
            int r6 = r5.getInt(r6, r8)
            r4.f799g = r6
            r6 = 22
            r8 = 13
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = r5.getString(r8)
        L_0x0083:
            r4.f806n = r6
            r6 = 27
            r8 = 3
            int r8 = r5.getResourceId(r8, r2)
            int r6 = r5.getResourceId(r6, r8)
            r4.f785E = r6
            r6 = 35
            r8 = 9
            int r8 = r5.getResourceId(r8, r7)
            int r6 = r5.getResourceId(r6, r8)
            r4.f786F = r6
            r6 = 21
            r8 = 2
            boolean r8 = r5.getBoolean(r8, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f808p = r6
            r6 = 30
            r8 = 5
            boolean r8 = r5.getBoolean(r8, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f809q = r6
            r6 = 29
            boolean r8 = r5.getBoolean(r1, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f810r = r6
            r6 = 19
            r8 = 10
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x00d4
            java.lang.String r6 = r5.getString(r8)
        L_0x00d4:
            r4.f811s = r6
            boolean r6 = r4.f809q
            r8 = 16
            boolean r6 = r5.getBoolean(r8, r6)
            boolean r6 = r5.getBoolean(r8, r6)
            r4.f816x = r6
            boolean r6 = r4.f809q
            r8 = 17
            boolean r6 = r5.getBoolean(r8, r6)
            boolean r6 = r5.getBoolean(r8, r6)
            r4.f817y = r6
            r6 = 18
            boolean r8 = r5.hasValue(r6)
            if (r8 == 0) goto L_0x00fb
            goto L_0x0103
        L_0x00fb:
            r6 = 11
            boolean r8 = r5.hasValue(r6)
            if (r8 == 0) goto L_0x0109
        L_0x0103:
            java.lang.Object r6 = r4.mo918t(r5, r6)
            r4.f812t = r6
        L_0x0109:
            r6 = 31
            r8 = 12
            boolean r8 = r5.getBoolean(r8, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f784D = r6
            r6 = 32
            boolean r8 = r5.hasValue(r6)
            r4.f818z = r8
            if (r8 == 0) goto L_0x012d
            r8 = 14
            boolean r8 = r5.getBoolean(r8, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f781A = r6
        L_0x012d:
            r6 = 24
            r8 = 15
            boolean r8 = r5.getBoolean(r8, r7)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f782B = r6
            r6 = 25
            boolean r8 = r5.getBoolean(r6, r1)
            boolean r6 = r5.getBoolean(r6, r8)
            r4.f815w = r6
            r6 = 20
            boolean r7 = r5.getBoolean(r6, r7)
            boolean r6 = r5.getBoolean(r6, r7)
            r4.f783C = r6
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* renamed from: A */
    public void mo907A(View view) {
        C0968pc.C0971c cVar;
        if (mo953k() && this.f809q) {
            mo911q();
            C0123d dVar = this.f798f;
            if (dVar == null || !dVar.mo966a(this)) {
                C0968pc pcVar = this.f795c;
                if (!(pcVar == null || (cVar = pcVar.f3614h) == null)) {
                    C0769lc lcVar = (C0769lc) cVar;
                    boolean z = false;
                    if (this.f806n != null) {
                        if (!(lcVar.mo862i() instanceof C0769lc.C0774e ? ((C0769lc.C0774e) lcVar.mo862i()).mo3628a(lcVar, this) : false)) {
                            C0614ia l = lcVar.mo867k0().mo4865l();
                            if (this.f807o == null) {
                                this.f807o = new Bundle();
                            }
                            Bundle bundle = this.f807o;
                            Fragment a = l.mo3202K().mo2719a(lcVar.mo867k0().getClassLoader(), this.f806n);
                            a.mo882q0(bundle);
                            a.mo893v0(lcVar, 0);
                            C1053r9 r9Var = new C1053r9(l);
                            r9Var.mo4070e(((View) lcVar.f680E.getParent()).getId(), a, (String) null);
                            r9Var.mo4068c((String) null);
                            r9Var.mo4223g();
                        }
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                }
                Intent intent = this.f805m;
                if (intent != null) {
                    this.f794b.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: B */
    public boolean mo937B(String str) {
        if (!mo942H()) {
            return false;
        }
        if (TextUtils.equals(str, mo949f((String) null))) {
            return true;
        }
        mo951h();
        SharedPreferences.Editor a = this.f795c.mo4009a();
        a.putString(this.f804l, str);
        if (!this.f795c.f3611e) {
            a.apply();
        }
        return true;
    }

    /* renamed from: C */
    public void mo938C(boolean z) {
        if (this.f808p != z) {
            this.f808p = z;
            mo954m(mo916G());
            mo913l();
        }
    }

    /* renamed from: D */
    public final void mo939D(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                mo939D(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: E */
    public void mo940E(int i) {
        if (i != this.f799g) {
            this.f799g = i;
            C0122c cVar = this.f787G;
            if (cVar != null) {
                C0824mc mcVar = (C0824mc) cVar;
                mcVar.f3267g.removeCallbacks(mcVar.f3268h);
                mcVar.f3267g.post(mcVar.f3268h);
            }
        }
    }

    /* renamed from: F */
    public final void mo941F(boolean z) {
        if (this.f815w != z) {
            this.f815w = z;
            C0122c cVar = this.f787G;
            if (cVar != null) {
                C0824mc mcVar = (C0824mc) cVar;
                mcVar.f3267g.removeCallbacks(mcVar.f3268h);
                mcVar.f3267g.post(mcVar.f3268h);
            }
        }
    }

    /* renamed from: G */
    public boolean mo916G() {
        return !mo953k();
    }

    /* renamed from: H */
    public boolean mo942H() {
        return this.f795c != null && this.f810r && mo952j();
    }

    /* renamed from: a */
    public void mo943a(Bundle bundle) {
        Parcelable parcelable;
        if (mo952j() && (parcelable = bundle.getParcelable(this.f804l)) != null) {
            this.f790J = false;
            mo919w(parcelable);
            if (!this.f790J) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: b */
    public void mo944b(Bundle bundle) {
        if (mo952j()) {
            this.f790J = false;
            Parcelable x = mo920x();
            if (!this.f790J) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (x != null) {
                bundle.putParcelable(this.f804l, x);
            }
        }
    }

    /* renamed from: c */
    public long mo945c() {
        return this.f796d;
    }

    public int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f799g;
        int i2 = preference.f799g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f800h;
        CharSequence charSequence2 = preference.f800h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f800h.toString());
    }

    /* renamed from: d */
    public boolean mo947d(boolean z) {
        if (!mo942H()) {
            return z;
        }
        mo951h();
        return this.f795c.mo4010b().getBoolean(this.f804l, z);
    }

    /* renamed from: e */
    public int mo948e(int i) {
        if (!mo942H()) {
            return i;
        }
        mo951h();
        return this.f795c.mo4010b().getInt(this.f804l, i);
    }

    /* renamed from: f */
    public String mo949f(String str) {
        if (!mo942H()) {
            return str;
        }
        mo951h();
        return this.f795c.mo4010b().getString(this.f804l, str);
    }

    /* renamed from: g */
    public Set<String> mo950g(Set<String> set) {
        if (!mo942H()) {
            return set;
        }
        mo951h();
        return this.f795c.mo4010b().getStringSet(this.f804l, set);
    }

    /* renamed from: h */
    public void mo951h() {
        C0968pc pcVar = this.f795c;
    }

    /* renamed from: i */
    public CharSequence mo929i() {
        C0125f fVar = this.f792L;
        return fVar != null ? fVar.mo925a(this) : this.f801i;
    }

    /* renamed from: j */
    public boolean mo952j() {
        return !TextUtils.isEmpty(this.f804l);
    }

    /* renamed from: k */
    public boolean mo953k() {
        return this.f808p && this.f813u && this.f814v;
    }

    /* renamed from: l */
    public void mo913l() {
        C0122c cVar = this.f787G;
        if (cVar != null) {
            C0824mc mcVar = (C0824mc) cVar;
            int indexOf = mcVar.f3265e.indexOf(this);
            if (indexOf != -1) {
                mcVar.f1016a.mo1281c(indexOf, 1, this);
            }
        }
    }

    /* renamed from: m */
    public void mo954m(boolean z) {
        List<Preference> list = this.f788H;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo957r(z);
            }
        }
    }

    /* renamed from: n */
    public void mo955n() {
        PreferenceScreen preferenceScreen;
        if (!TextUtils.isEmpty(this.f811s)) {
            String str = this.f811s;
            C0968pc pcVar = this.f795c;
            Preference preference = null;
            if (!(pcVar == null || (preferenceScreen = pcVar.f3613g) == null)) {
                preference = preferenceScreen.mo969I(str);
            }
            if (preference != null) {
                if (preference.f788H == null) {
                    preference.f788H = new ArrayList();
                }
                preference.f788H.add(this);
                mo957r(preference.mo916G());
                return;
            }
            StringBuilder c = C0279ch.m1106c("Dependency \"");
            c.append(this.f811s);
            c.append("\" not found for preference \"");
            c.append(this.f804l);
            c.append("\" (title: \"");
            c.append(this.f800h);
            c.append("\"");
            throw new IllegalStateException(c.toString());
        }
    }

    /* renamed from: o */
    public void mo956o(C0968pc pcVar) {
        SharedPreferences sharedPreferences;
        long j;
        this.f795c = pcVar;
        if (!this.f797e) {
            synchronized (pcVar) {
                j = pcVar.f3608b;
                pcVar.f3608b = 1 + j;
            }
            this.f796d = j;
        }
        mo951h();
        if (mo942H()) {
            if (this.f795c != null) {
                mo951h();
                sharedPreferences = this.f795c.mo4010b();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f804l)) {
                mo962z((Object) null);
                return;
            }
        }
        Object obj = this.f812t;
        if (obj != null) {
            mo962z(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo909p(p000.C1056rc r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.f996a
            android.view.View$OnClickListener r1 = r8.f793M
            r0.setOnClickListener(r1)
            r1 = 0
            r0.setId(r1)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r9.mo4232w(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.CharSequence r5 = r8.mo929i()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r1)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0032:
            r2.setVisibility(r3)
        L_0x0035:
            r2 = r4
        L_0x0036:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo4232w(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r6 = r8.f800h
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x006c
            r5.setText(r6)
            r5.setVisibility(r1)
            boolean r6 = r8.f818z
            if (r6 == 0) goto L_0x0058
            boolean r6 = r8.f781A
            r5.setSingleLine(r6)
        L_0x0058:
            boolean r6 = r8.f809q
            if (r6 != 0) goto L_0x006f
            boolean r6 = r8.mo953k()
            if (r6 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x006f
        L_0x006c:
            r5.setVisibility(r3)
        L_0x006f:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r9.mo4232w(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            if (r2 == 0) goto L_0x00a9
            int r6 = r8.f802j
            if (r6 != 0) goto L_0x0083
            android.graphics.drawable.Drawable r7 = r8.f803k
            if (r7 == 0) goto L_0x0096
        L_0x0083:
            android.graphics.drawable.Drawable r7 = r8.f803k
            if (r7 != 0) goto L_0x008f
            android.content.Context r7 = r8.f794b
            android.graphics.drawable.Drawable r6 = p000.C0399e0.m1530b(r7, r6)
            r8.f803k = r6
        L_0x008f:
            android.graphics.drawable.Drawable r6 = r8.f803k
            if (r6 == 0) goto L_0x0096
            r2.setImageDrawable(r6)
        L_0x0096:
            android.graphics.drawable.Drawable r6 = r8.f803k
            if (r6 == 0) goto L_0x009e
            r2.setVisibility(r1)
            goto L_0x00a9
        L_0x009e:
            boolean r6 = r8.f782B
            if (r6 == 0) goto L_0x00a4
            r6 = 4
            goto L_0x00a6
        L_0x00a4:
            r6 = 8
        L_0x00a6:
            r2.setVisibility(r6)
        L_0x00a9:
            r2 = 2131230901(0x7f0800b5, float:1.8077868E38)
            android.view.View r2 = r9.mo4232w(r2)
            if (r2 != 0) goto L_0x00b9
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r9.mo4232w(r2)
        L_0x00b9:
            if (r2 == 0) goto L_0x00cb
            android.graphics.drawable.Drawable r6 = r8.f803k
            if (r6 == 0) goto L_0x00c3
            r2.setVisibility(r1)
            goto L_0x00cb
        L_0x00c3:
            boolean r1 = r8.f782B
            if (r1 == 0) goto L_0x00c8
            r3 = 4
        L_0x00c8:
            r2.setVisibility(r3)
        L_0x00cb:
            boolean r1 = r8.f784D
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r8.mo953k()
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            r8.mo939D(r0, r1)
            boolean r1 = r8.f809q
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r8.f816x
            r9.f3948u = r2
            boolean r2 = r8.f817y
            r9.f3949v = r2
            boolean r9 = r8.f783C
            if (r9 == 0) goto L_0x00f7
            androidx.preference.Preference$e r2 = r8.f791K
            if (r2 != 0) goto L_0x00f7
            androidx.preference.Preference$e r2 = new androidx.preference.Preference$e
            r2.<init>(r8)
            r8.f791K = r2
        L_0x00f7:
            if (r9 == 0) goto L_0x00fc
            androidx.preference.Preference$e r2 = r8.f791K
            goto L_0x00fd
        L_0x00fc:
            r2 = r4
        L_0x00fd:
            r0.setOnCreateContextMenuListener(r2)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0116
            if (r1 != 0) goto L_0x0116
            java.lang.reflect.Field r9 = p000.C0813m8.f3234a
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r9 < r1) goto L_0x0113
            r0.setBackground(r4)
            goto L_0x0116
        L_0x0113:
            r0.setBackgroundDrawable(r4)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo909p(rc):void");
    }

    /* renamed from: q */
    public void mo911q() {
    }

    /* renamed from: r */
    public void mo957r(boolean z) {
        if (this.f813u == z) {
            this.f813u = !z;
            mo954m(mo916G());
            mo913l();
        }
    }

    /* renamed from: s */
    public void mo958s() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.f811s;
        if (str != null) {
            C0968pc pcVar = this.f795c;
            Preference preference = null;
            if (!(pcVar == null || (preferenceScreen = pcVar.f3613g) == null)) {
                preference = preferenceScreen.mo969I(str);
            }
            if (preference != null && (list = preference.f788H) != null) {
                list.remove(this);
            }
        }
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f800h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence i = mo929i();
        if (!TextUtils.isEmpty(i)) {
            sb.append(i);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    @Deprecated
    /* renamed from: u */
    public void mo960u(C1347x8 x8Var) {
    }

    /* renamed from: v */
    public void mo961v(boolean z) {
        if (this.f814v == z) {
            this.f814v = !z;
            mo954m(mo916G());
            mo913l();
        }
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        this.f790J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        this.f790J = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
    }

    @Deprecated
    /* renamed from: z */
    public void mo962z(Object obj) {
        mo921y(obj);
    }
}
