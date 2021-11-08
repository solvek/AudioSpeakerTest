package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends C1095s2 implements C0799m0 {

    /* renamed from: r0 */
    public static final C0070n f335r0 = (Build.VERSION.SDK_INT < 29 ? new C0070n() : null);

    /* renamed from: A */
    public Rect f336A;

    /* renamed from: B */
    public Rect f337B;

    /* renamed from: C */
    public int[] f338C;

    /* renamed from: D */
    public int[] f339D;

    /* renamed from: E */
    public final ImageView f340E;

    /* renamed from: F */
    public final Drawable f341F;

    /* renamed from: G */
    public final int f342G;

    /* renamed from: H */
    public final int f343H;

    /* renamed from: I */
    public final Intent f344I;

    /* renamed from: J */
    public final Intent f345J;

    /* renamed from: K */
    public final CharSequence f346K;

    /* renamed from: L */
    public C0068l f347L;

    /* renamed from: M */
    public C0067k f348M;

    /* renamed from: N */
    public View.OnFocusChangeListener f349N;

    /* renamed from: O */
    public C0069m f350O;

    /* renamed from: P */
    public View.OnClickListener f351P;

    /* renamed from: Q */
    public boolean f352Q;

    /* renamed from: R */
    public boolean f353R;

    /* renamed from: S */
    public C0561h9 f354S;

    /* renamed from: T */
    public boolean f355T;

    /* renamed from: U */
    public CharSequence f356U;

    /* renamed from: V */
    public boolean f357V;

    /* renamed from: W */
    public boolean f358W;

    /* renamed from: a0 */
    public int f359a0;

    /* renamed from: b0 */
    public boolean f360b0;

    /* renamed from: c0 */
    public CharSequence f361c0;

    /* renamed from: d0 */
    public CharSequence f362d0;

    /* renamed from: e0 */
    public boolean f363e0;

    /* renamed from: f0 */
    public int f364f0;

    /* renamed from: g0 */
    public SearchableInfo f365g0;

    /* renamed from: h0 */
    public Bundle f366h0;

    /* renamed from: i0 */
    public final Runnable f367i0;

    /* renamed from: j0 */
    public Runnable f368j0;

    /* renamed from: k0 */
    public final WeakHashMap<String, Drawable.ConstantState> f369k0;

    /* renamed from: l0 */
    public final View.OnClickListener f370l0;

    /* renamed from: m0 */
    public View.OnKeyListener f371m0;

    /* renamed from: n0 */
    public final TextView.OnEditorActionListener f372n0;

    /* renamed from: o0 */
    public final AdapterView.OnItemClickListener f373o0;

    /* renamed from: p0 */
    public final AdapterView.OnItemSelectedListener f374p0;

    /* renamed from: q */
    public final SearchAutoComplete f375q;

    /* renamed from: q0 */
    public TextWatcher f376q0;

    /* renamed from: r */
    public final View f377r;

    /* renamed from: s */
    public final View f378s;

    /* renamed from: t */
    public final View f379t;

    /* renamed from: u */
    public final ImageView f380u;

    /* renamed from: v */
    public final ImageView f381v;

    /* renamed from: w */
    public final ImageView f382w;

    /* renamed from: x */
    public final ImageView f383x;

    /* renamed from: y */
    public final View f384y;

    /* renamed from: z */
    public C0073p f385z;

    public static class SearchAutoComplete extends C0950p1 {

        /* renamed from: e */
        public int f386e = getThreshold();

        /* renamed from: f */
        public SearchView f387f;

        /* renamed from: g */
        public boolean f388g;

        /* renamed from: h */
        public final Runnable f389h = new C0056a();

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0056a implements Runnable {
            public C0056a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f388g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f388g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public void mo402a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0070n nVar = SearchView.f335r0;
            nVar.getClass();
            C0070n.m151a();
            Method method = nVar.f403c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f386e <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f388g) {
                removeCallbacks(this.f389h);
                post(this.f389h);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f387f;
            searchView.mo358G(searchView.f353R);
            searchView.post(searchView.f367i0);
            if (searchView.f375q.hasFocus()) {
                searchView.mo378s();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f387f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f387f.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.f388g = true;
                Context context = getContext();
                C0070n nVar = SearchView.f335r0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    mo402a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f388g = false;
                removeCallbacks(this.f389h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f388g = false;
                removeCallbacks(this.f389h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f388g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f387f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f386e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0057a implements TextWatcher {
        public C0057a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f375q.getText();
            searchView.f362d0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.mo357F(z);
            searchView.mo359H(!z);
            searchView.mo353B();
            searchView.mo356E();
            if (searchView.f347L != null && !TextUtils.equals(charSequence, searchView.f361c0)) {
                searchView.f347L.mo430b(charSequence.toString());
            }
            searchView.f361c0 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0058b implements Runnable {
        public C0058b() {
        }

        public void run() {
            SearchView.this.mo354C();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0059c implements Runnable {
        public C0059c() {
        }

        public void run() {
            C0561h9 h9Var = SearchView.this.f354S;
            if (h9Var instanceof C0206b3) {
                h9Var.mo1553b((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0060d implements View.OnFocusChangeListener {
        public C0060d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f349N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0061e implements View.OnLayoutChangeListener {
        public C0061e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f384y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f378s.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = C0856n3.m2571a(searchView);
                int dimensionPixelSize = searchView.f352Q ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f375q.getDropDownBackground().getPadding(rect);
                searchView.f375q.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f375q.setDropDownWidth((((searchView.f384y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0062f implements View.OnClickListener {
        public C0062f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f380u) {
                searchView.mo400y();
            } else if (view == searchView.f382w) {
                searchView.mo396u();
            } else if (view == searchView.f381v) {
                searchView.mo401z();
            } else if (view == searchView.f383x) {
                SearchableInfo searchableInfo = searchView.f365g0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f344I);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.mo376r(searchView.f345J, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchView.f375q) {
                searchView.mo378s();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0063g implements View.OnKeyListener {
        public C0063g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f365g0 == null) {
                return false;
            }
            if (searchView.f375q.isPopupShowing() && SearchView.this.f375q.getListSelection() != -1) {
                return SearchView.this.mo352A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f375q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo395t(0, (String) null, searchView2.f375q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0064h implements TextView.OnEditorActionListener {
        public C0064h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo401z();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0065i implements AdapterView.OnItemClickListener {
        public C0065i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo397v(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0066j implements AdapterView.OnItemSelectedListener {
        public C0066j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo398w(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0067k {
        /* renamed from: a */
        boolean mo428a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0068l {
        /* renamed from: a */
        boolean mo429a(String str);

        /* renamed from: b */
        boolean mo430b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0069m {
        /* renamed from: a */
        boolean mo431a(int i);

        /* renamed from: b */
        boolean mo432b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0070n {

        /* renamed from: a */
        public Method f401a = null;

        /* renamed from: b */
        public Method f402b = null;

        /* renamed from: c */
        public Method f403c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0070n() {
            m151a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f401a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f402b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f403c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: a */
        public static void m151a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0071o extends C0718k9 {
        public static final Parcelable.Creator<C0071o> CREATOR = new C0072a();

        /* renamed from: d */
        public boolean f404d;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public class C0072a implements Parcelable.ClassLoaderCreator<C0071o> {
            public Object createFromParcel(Parcel parcel) {
                return new C0071o(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0071o[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0071o(parcel, classLoader);
            }
        }

        public C0071o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f404d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public C0071o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder c = C0279ch.m1106c("SearchView.SavedState{");
            c.append(Integer.toHexString(System.identityHashCode(this)));
            c.append(" isIconified=");
            c.append(this.f404d);
            c.append("}");
            return c.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeValue(Boolean.valueOf(this.f404d));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0073p extends TouchDelegate {

        /* renamed from: a */
        public final View f405a;

        /* renamed from: b */
        public final Rect f406b = new Rect();

        /* renamed from: c */
        public final Rect f407c = new Rect();

        /* renamed from: d */
        public final Rect f408d = new Rect();

        /* renamed from: e */
        public final int f409e;

        /* renamed from: f */
        public boolean f410f;

        public C0073p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f409e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo438a(rect, rect2);
            this.f405a = view;
        }

        /* renamed from: a */
        public void mo438a(Rect rect, Rect rect2) {
            this.f406b.set(rect);
            this.f408d.set(rect);
            Rect rect3 = this.f408d;
            int i = this.f409e;
            rect3.inset(-i, -i);
            this.f407c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f410f
                r7.f410f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f410f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f408d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f406b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f410f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f407c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f405a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f405a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f407c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f405a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0073p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        this.f336A = new Rect();
        this.f337B = new Rect();
        this.f338C = new int[2];
        this.f339D = new int[2];
        this.f367i0 = new C0058b();
        this.f368j0 = new C0059c();
        this.f369k0 = new WeakHashMap<>();
        C0062f fVar = new C0062f();
        this.f370l0 = fVar;
        this.f371m0 = new C0063g();
        C0064h hVar = new C0064h();
        this.f372n0 = hVar;
        C0065i iVar = new C0065i();
        this.f373o0 = iVar;
        C0066j jVar = new C0066j();
        this.f374p0 = jVar;
        this.f376q0 = new C0057a();
        C0555h3 h3Var = new C0555h3(context2, context2.obtainStyledAttributes(attributeSet, C0440f.f2067u, i, 0));
        LayoutInflater.from(context).inflate(h3Var.mo3032l(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f375q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f377r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f378s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f379t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f380u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f381v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f382w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f383x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f340E = imageView5;
        C0813m8.m2459H(findViewById, h3Var.mo3027g(10));
        C0813m8.m2459H(findViewById2, h3Var.mo3027g(14));
        imageView.setImageDrawable(h3Var.mo3027g(13));
        imageView2.setImageDrawable(h3Var.mo3027g(7));
        imageView3.setImageDrawable(h3Var.mo3027g(4));
        imageView4.setImageDrawable(h3Var.mo3027g(16));
        imageView5.setImageDrawable(h3Var.mo3027g(13));
        this.f341F = h3Var.mo3027g(12);
        C0398e.m1527k(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f342G = h3Var.mo3032l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f343H = h3Var.mo3032l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f376q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f371m0);
        searchAutoComplete.setOnFocusChangeListener(new C0060d());
        setIconifiedByDefault(h3Var.mo3021a(8, true));
        int f = h3Var.mo3026f(1, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f346K = h3Var.mo3034n(6);
        this.f356U = h3Var.mo3034n(11);
        int j = h3Var.mo3030j(3, -1);
        if (j != -1) {
            setImeOptions(j);
        }
        int j2 = h3Var.mo3030j(2, -1);
        if (j2 != -1) {
            setInputType(j2);
        }
        setFocusable(h3Var.mo3021a(0, true));
        h3Var.f2425b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f344I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f345J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f384y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0061e());
        }
        mo358G(this.f352Q);
        mo355D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f375q.setText(charSequence);
        this.f375q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public boolean mo352A(int i, KeyEvent keyEvent) {
        if (this.f365g0 != null && this.f354S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo397v(this.f375q.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f375q.setSelection(i == 21 ? 0 : this.f375q.length());
                this.f375q.setListSelection(0);
                this.f375q.clearListSelection();
                this.f375q.mo402a();
                return true;
            } else if (i != 19 || this.f375q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void mo353B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f375q.getText());
        int i = 0;
        if (!z2 && (!this.f352Q || this.f363e0)) {
            z = false;
        }
        ImageView imageView = this.f382w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f382w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: C */
    public void mo354C() {
        int[] iArr = this.f375q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f378s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f379t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: D */
    public final void mo355D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f375q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f352Q && this.f341F != null) {
            double textSize = (double) searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f341F.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f341F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: E */
    public final void mo356E() {
        int i = 0;
        if (!((this.f355T || this.f360b0) && !this.f353R) || !(this.f381v.getVisibility() == 0 || this.f383x.getVisibility() == 0)) {
            i = 8;
        }
        this.f379t.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f360b0 == false) goto L_0x0023;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo357F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f355T
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f360b0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f353R
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f360b0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f381v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo357F(boolean):void");
    }

    /* renamed from: G */
    public final void mo358G(boolean z) {
        this.f353R = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f375q.getText());
        this.f380u.setVisibility(i2);
        mo357F(z2);
        this.f377r.setVisibility(z ? 8 : 0);
        if (this.f340E.getDrawable() == null || this.f352Q) {
            i = 8;
        }
        this.f340E.setVisibility(i);
        mo353B();
        mo359H(!z2);
        mo356E();
    }

    /* renamed from: H */
    public final void mo359H(boolean z) {
        int i = 8;
        if (this.f360b0 && !this.f353R && z) {
            this.f381v.setVisibility(8);
            i = 0;
        }
        this.f383x.setVisibility(i);
    }

    /* renamed from: a */
    public void mo360a() {
        if (!this.f363e0) {
            this.f363e0 = true;
            int imeOptions = this.f375q.getImeOptions();
            this.f364f0 = imeOptions;
            this.f375q.setImeOptions(imeOptions | 33554432);
            this.f375q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f358W = true;
        super.clearFocus();
        this.f375q.clearFocus();
        this.f375q.setImeVisibility(false);
        this.f358W = false;
    }

    /* renamed from: e */
    public void mo362e() {
        this.f375q.setText("");
        SearchAutoComplete searchAutoComplete = this.f375q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f362d0 = "";
        clearFocus();
        mo358G(true);
        this.f375q.setImeOptions(this.f364f0);
        this.f363e0 = false;
    }

    public int getImeOptions() {
        return this.f375q.getImeOptions();
    }

    public int getInputType() {
        return this.f375q.getInputType();
    }

    public int getMaxWidth() {
        return this.f359a0;
    }

    public CharSequence getQuery() {
        return this.f375q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f356U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f365g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f346K : getContext().getText(this.f365g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f343H;
    }

    public int getSuggestionRowLayout() {
        return this.f342G;
    }

    public C0561h9 getSuggestionsAdapter() {
        return this.f354S;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f367i0);
        post(this.f368j0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f375q;
            Rect rect = this.f336A;
            searchAutoComplete.getLocationInWindow(this.f338C);
            getLocationInWindow(this.f339D);
            int[] iArr = this.f338C;
            int i5 = iArr[1];
            int[] iArr2 = this.f339D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f337B;
            Rect rect3 = this.f336A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0073p pVar = this.f385z;
            if (pVar == null) {
                C0073p pVar2 = new C0073p(this.f337B, this.f336A, this.f375q);
                this.f385z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo438a(this.f337B, this.f336A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f353R
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f359a0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f359a0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f359a0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0071o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0071o oVar = (C0071o) parcelable;
        super.onRestoreInstanceState(oVar.f2988b);
        mo358G(oVar.f404d);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0071o oVar = new C0071o(super.onSaveInstanceState());
        oVar.f404d = this.f353R;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f367i0);
    }

    /* renamed from: q */
    public final Intent mo375q(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f362d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f366h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f365g0.getSearchActivity());
        return intent;
    }

    /* renamed from: r */
    public final Intent mo376r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f366h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f358W || !isFocusable()) {
            return false;
        }
        if (this.f353R) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f375q.requestFocus(i, rect);
        if (requestFocus) {
            mo358G(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public void mo378s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f375q.refreshAutoCompleteResults();
            return;
        }
        C0070n nVar = f335r0;
        SearchAutoComplete searchAutoComplete = this.f375q;
        nVar.getClass();
        C0070n.m151a();
        Method method = nVar.f401a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0070n nVar2 = f335r0;
        SearchAutoComplete searchAutoComplete2 = this.f375q;
        nVar2.getClass();
        C0070n.m151a();
        Method method2 = nVar2.f402b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f366h0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo396u();
        } else {
            mo400y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f352Q != z) {
            this.f352Q = z;
            mo358G(z);
            mo355D();
        }
    }

    public void setImeOptions(int i) {
        this.f375q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f375q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f359a0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0067k kVar) {
        this.f348M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f349N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0068l lVar) {
        this.f347L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f351P = onClickListener;
    }

    public void setOnSuggestionListener(C0069m mVar) {
        this.f350O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f356U = charSequence;
        mo355D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f357V = z;
        C0561h9 h9Var = this.f354S;
        if (h9Var instanceof C0206b3) {
            ((C0206b3) h9Var).f1217r = z ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f365g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f375q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f375q
            android.app.SearchableInfo r3 = r6.f365g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f365g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f365g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f375q
            r3.setInputType(r7)
            h9 r7 = r6.f354S
            if (r7 == 0) goto L_0x0042
            r7.mo1553b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f365g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            b3 r7 = new b3
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f365g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f369k0
            r7.<init>(r3, r6, r4, r5)
            r6.f354S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f375q
            r3.setAdapter(r7)
            h9 r7 = r6.f354S
            b3 r7 = (p000.C0206b3) r7
            boolean r3 = r6.f357V
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.f1217r = r3
        L_0x006b:
            r6.mo355D()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f365g0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f365g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.f344I
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f365g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.f345J
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.f360b0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f375q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.f353R
            r6.mo358G(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f355T = z;
        mo358G(this.f353R);
    }

    public void setSuggestionsAdapter(C0561h9 h9Var) {
        this.f354S = h9Var;
        this.f375q.setAdapter(h9Var);
    }

    /* renamed from: t */
    public void mo395t(int i, String str, String str2) {
        getContext().startActivity(mo375q("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, (String) null));
    }

    /* renamed from: u */
    public void mo396u() {
        if (!TextUtils.isEmpty(this.f375q.getText())) {
            this.f375q.setText("");
            this.f375q.requestFocus();
            this.f375q.setImeVisibility(true);
        } else if (this.f352Q) {
            C0067k kVar = this.f348M;
            if (kVar == null || !kVar.mo428a()) {
                clearFocus();
                mo358G(true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.getPosition();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0090 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo397v(int r10) {
        /*
            r9 = this;
            androidx.appcompat.widget.SearchView$m r0 = r9.f350O
            r1 = 0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.mo432b(r10)
            if (r0 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            r7 = 0
            r8 = 0
            h9 r0 = r9.f354S
            android.database.Cursor r0 = r0.f2442d
            if (r0 == 0) goto L_0x00b0
            boolean r10 = r0.moveToPosition(r10)
            if (r10 == 0) goto L_0x00b0
            r10 = 0
            java.lang.String r2 = "suggest_intent_action"
            int r3 = p000.C0206b3.f1211z     // Catch:{ RuntimeException -> 0x0090 }
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = p000.C0206b3.m985h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            if (r2 != 0) goto L_0x0030
            android.app.SearchableInfo r2 = r9.f365g0     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x0030:
            if (r2 != 0) goto L_0x0034
            java.lang.String r2 = "android.intent.action.SEARCH"
        L_0x0034:
            r3 = r2
            java.lang.String r2 = "suggest_intent_data"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = p000.C0206b3.m985h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            if (r2 != 0) goto L_0x0047
            android.app.SearchableInfo r2 = r9.f365g0     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r2.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x0047:
            if (r2 == 0) goto L_0x006d
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r4 = p000.C0206b3.m985h(r0, r4)     // Catch:{ RuntimeException -> 0x0090 }
            if (r4 == 0) goto L_0x006d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0090 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x0090 }
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = android.net.Uri.encode(r4)     // Catch:{ RuntimeException -> 0x0090 }
            r5.append(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = r5.toString()     // Catch:{ RuntimeException -> 0x0090 }
        L_0x006d:
            if (r2 != 0) goto L_0x0071
            r4 = r10
            goto L_0x0076
        L_0x0071:
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ RuntimeException -> 0x0090 }
            r4 = r2
        L_0x0076:
            java.lang.String r2 = "suggest_intent_query"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r6 = p000.C0206b3.m985h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r2 = "suggest_intent_extra_data"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0090 }
            java.lang.String r5 = p000.C0206b3.m985h(r0, r2)     // Catch:{ RuntimeException -> 0x0090 }
            r2 = r9
            android.content.Intent r10 = r2.mo375q(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0090 }
            goto L_0x0095
        L_0x0090:
            r0.getPosition()     // Catch:{ RuntimeException -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r10 != 0) goto L_0x0098
            goto L_0x00b0
        L_0x0098:
            android.content.Context r0 = r9.getContext()     // Catch:{ RuntimeException -> 0x00a0 }
            r0.startActivity(r10)     // Catch:{ RuntimeException -> 0x00a0 }
            goto L_0x00b0
        L_0x00a0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed launch activity: "
            r0.append(r2)
            r0.append(r10)
            r0.toString()
        L_0x00b0:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f375q
            r10.setImeVisibility(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r10 = r9.f375q
            r10.dismissDropDown()
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.mo397v(int):boolean");
    }

    /* renamed from: w */
    public boolean mo398w(int i) {
        CharSequence c;
        C0069m mVar = this.f350O;
        if (mVar != null && mVar.mo431a(i)) {
            return false;
        }
        Editable text = this.f375q.getText();
        Cursor cursor = this.f354S.f2442d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (c = this.f354S.mo1554c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c);
        return true;
    }

    /* renamed from: x */
    public void mo399x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: y */
    public void mo400y() {
        mo358G(false);
        this.f375q.requestFocus();
        this.f375q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f351P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: z */
    public void mo401z() {
        Editable text = this.f375q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0068l lVar = this.f347L;
            if (lVar == null || !lVar.mo429a(text.toString())) {
                if (this.f365g0 != null) {
                    mo395t(0, (String) null, text.toString());
                }
                this.f375q.setImeVisibility(false);
                this.f375q.dismissDropDown();
            }
        }
    }
}
