package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import p000.C0901o;

/* renamed from: g2 */
public class C0506g2 extends Spinner implements C0761l8 {

    /* renamed from: j */
    public static final int[] f2235j = {16843505};

    /* renamed from: b */
    public final C0998q1 f2236b;

    /* renamed from: c */
    public final Context f2237c;

    /* renamed from: d */
    public C1039r2 f2238d;

    /* renamed from: e */
    public SpinnerAdapter f2239e;

    /* renamed from: f */
    public final boolean f2240f;

    /* renamed from: g */
    public C0516f f2241g;

    /* renamed from: h */
    public int f2242h;

    /* renamed from: i */
    public final Rect f2243i = new Rect();

    /* renamed from: g2$a */
    public class C0507a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0507a() {
        }

        public void onGlobalLayout() {
            if (!C0506g2.this.getInternalPopup().mo2887a()) {
                C0506g2.this.mo2861b();
            }
            ViewTreeObserver viewTreeObserver = C0506g2.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: g2$b */
    public class C0508b implements C0516f, DialogInterface.OnClickListener {

        /* renamed from: b */
        public C0901o f2245b;

        /* renamed from: c */
        public ListAdapter f2246c;

        /* renamed from: d */
        public CharSequence f2247d;

        public C0508b() {
        }

        /* renamed from: a */
        public boolean mo2887a() {
            C0901o oVar = this.f2245b;
            if (oVar != null) {
                return oVar.isShowing();
            }
            return false;
        }

        /* renamed from: b */
        public CharSequence mo2888b() {
            return this.f2247d;
        }

        /* renamed from: c */
        public void mo2889c(int i) {
        }

        /* renamed from: d */
        public int mo2890d() {
            return 0;
        }

        public void dismiss() {
            C0901o oVar = this.f2245b;
            if (oVar != null) {
                oVar.dismiss();
                this.f2245b = null;
            }
        }

        /* renamed from: f */
        public void mo2892f(int i, int i2) {
            if (this.f2246c != null) {
                C0901o.C0902a aVar = new C0901o.C0902a(C0506g2.this.getPopupContext());
                CharSequence charSequence = this.f2247d;
                if (charSequence != null) {
                    aVar.f3436a.f193d = charSequence;
                }
                ListAdapter listAdapter = this.f2246c;
                int selectedItemPosition = C0506g2.this.getSelectedItemPosition();
                AlertController.C0039b bVar = aVar.f3436a;
                bVar.f202m = listAdapter;
                bVar.f203n = this;
                bVar.f208s = selectedItemPosition;
                bVar.f207r = true;
                C0901o a = aVar.mo3816a();
                this.f2245b = a;
                ListView listView = a.f3435d.f167g;
                if (Build.VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(i);
                    listView.setTextAlignment(i2);
                }
                this.f2245b.show();
            }
        }

        /* renamed from: h */
        public void mo2893h(CharSequence charSequence) {
            this.f2247d = charSequence;
        }

        /* renamed from: j */
        public int mo2894j() {
            return 0;
        }

        /* renamed from: l */
        public void mo2895l(Drawable drawable) {
        }

        /* renamed from: m */
        public void mo2896m(int i) {
        }

        /* renamed from: n */
        public Drawable mo2897n() {
            return null;
        }

        /* renamed from: o */
        public void mo2898o(ListAdapter listAdapter) {
            this.f2246c = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0506g2.this.setSelection(i);
            if (C0506g2.this.getOnItemClickListener() != null) {
                C0506g2.this.performItemClick((View) null, i, this.f2246c.getItemId(i));
            }
            C0901o oVar = this.f2245b;
            if (oVar != null) {
                oVar.dismiss();
                this.f2245b = null;
            }
        }

        /* renamed from: p */
        public void mo2900p(int i) {
        }
    }

    /* renamed from: g2$c */
    public static class C0509c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f2249b;

        /* renamed from: c */
        public ListAdapter f2250c;

        public C0509c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2249b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2250c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0363d3) {
                C0363d3 d3Var = (C0363d3) spinnerAdapter;
                if (d3Var.getDropDownViewTheme() == null) {
                    d3Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2250c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2250c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2249b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g2$d */
    public class C0510d extends C1189u2 implements C0516f {

        /* renamed from: E */
        public CharSequence f2251E;

        /* renamed from: F */
        public ListAdapter f2252F;

        /* renamed from: G */
        public final Rect f2253G = new Rect();

        /* renamed from: H */
        public int f2254H;

        /* renamed from: g2$d$a */
        public class C0511a implements AdapterView.OnItemClickListener {
            public C0511a(C0506g2 g2Var) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0506g2.this.setSelection(i);
                if (C0506g2.this.getOnItemClickListener() != null) {
                    C0510d dVar = C0510d.this;
                    C0506g2.this.performItemClick(view, i, dVar.f2252F.getItemId(i));
                }
                C0510d.this.dismiss();
            }
        }

        /* renamed from: g2$d$b */
        public class C0512b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0512b() {
            }

            public void onGlobalLayout() {
                C0510d dVar = C0510d.this;
                C0506g2 g2Var = C0506g2.this;
                dVar.getClass();
                if (!(C0813m8.m2485s(g2Var) && g2Var.getGlobalVisibleRect(dVar.f2253G))) {
                    C0510d.this.dismiss();
                    return;
                }
                C0510d.this.mo2914t();
                C0510d.this.mo3111i();
            }
        }

        /* renamed from: g2$d$c */
        public class C0513c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2258b;

            public C0513c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2258b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0506g2.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2258b);
                }
            }
        }

        public C0510d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.f4563q = C0506g2.this;
            mo4751s(true);
            this.f4561o = 0;
            this.f4564r = new C0511a(C0506g2.this);
        }

        /* renamed from: b */
        public CharSequence mo2888b() {
            return this.f2251E;
        }

        /* renamed from: f */
        public void mo2892f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a = mo3108a();
            mo2914t();
            this.f4547A.setInputMethodMode(2);
            mo3111i();
            C0951p2 p2Var = this.f4550d;
            p2Var.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                p2Var.setTextDirection(i);
                p2Var.setTextAlignment(i2);
            }
            int selectedItemPosition = C0506g2.this.getSelectedItemPosition();
            C0951p2 p2Var2 = this.f4550d;
            if (mo3108a() && p2Var2 != null) {
                p2Var2.setListSelectionHidden(false);
                p2Var2.setSelection(selectedItemPosition);
                if (p2Var2.getChoiceMode() != 0) {
                    p2Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a && (viewTreeObserver = C0506g2.this.getViewTreeObserver()) != null) {
                C0512b bVar = new C0512b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f4547A.setOnDismissListener(new C0513c(bVar));
            }
        }

        /* renamed from: h */
        public void mo2893h(CharSequence charSequence) {
            this.f2251E = charSequence;
        }

        /* renamed from: o */
        public void mo2898o(ListAdapter listAdapter) {
            super.mo2898o(listAdapter);
            this.f2252F = listAdapter;
        }

        /* renamed from: p */
        public void mo2900p(int i) {
            this.f2254H = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2914t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo4748n()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                g2 r1 = p000.C0506g2.this
                android.graphics.Rect r1 = r1.f2243i
                r0.getPadding(r1)
                g2 r0 = p000.C0506g2.this
                boolean r0 = p000.C0856n3.m2571a(r0)
                if (r0 == 0) goto L_0x001d
                g2 r0 = p000.C0506g2.this
                android.graphics.Rect r0 = r0.f2243i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                g2 r0 = p000.C0506g2.this
                android.graphics.Rect r0 = r0.f2243i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                g2 r0 = p000.C0506g2.this
                android.graphics.Rect r0 = r0.f2243i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                g2 r0 = p000.C0506g2.this
                int r0 = r0.getPaddingLeft()
                g2 r2 = p000.C0506g2.this
                int r2 = r2.getPaddingRight()
                g2 r3 = p000.C0506g2.this
                int r3 = r3.getWidth()
                g2 r4 = p000.C0506g2.this
                int r5 = r4.f2242h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f2252F
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo4748n()
                int r4 = r4.mo2860a(r5, r6)
                g2 r5 = p000.C0506g2.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                g2 r6 = p000.C0506g2.this
                android.graphics.Rect r6 = r6.f2243i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo4750r(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo4750r(r5)
            L_0x0085:
                g2 r4 = p000.C0506g2.this
                boolean r4 = p000.C0856n3.m2571a(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f4552f
                int r3 = r3 - r0
                int r0 = r8.f2254H
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.f2254H
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f4553g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0506g2.C0510d.mo2914t():void");
        }
    }

    /* renamed from: g2$e */
    public static class C0514e extends View.BaseSavedState {
        public static final Parcelable.Creator<C0514e> CREATOR = new C0515a();

        /* renamed from: b */
        public boolean f2260b;

        /* renamed from: g2$e$a */
        public class C0515a implements Parcelable.Creator<C0514e> {
            public Object createFromParcel(Parcel parcel) {
                return new C0514e(parcel);
            }

            public Object[] newArray(int i) {
                return new C0514e[i];
            }
        }

        public C0514e(Parcel parcel) {
            super(parcel);
            this.f2260b = parcel.readByte() != 0;
        }

        public C0514e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f2260b ? (byte) 1 : 0);
        }
    }

    /* renamed from: g2$f */
    public interface C0516f {
        /* renamed from: a */
        boolean mo2887a();

        /* renamed from: b */
        CharSequence mo2888b();

        /* renamed from: c */
        void mo2889c(int i);

        /* renamed from: d */
        int mo2890d();

        void dismiss();

        /* renamed from: f */
        void mo2892f(int i, int i2);

        /* renamed from: h */
        void mo2893h(CharSequence charSequence);

        /* renamed from: j */
        int mo2894j();

        /* renamed from: l */
        void mo2895l(Drawable drawable);

        /* renamed from: m */
        void mo2896m(int i);

        /* renamed from: n */
        Drawable mo2897n();

        /* renamed from: o */
        void mo2898o(ListAdapter listAdapter);

        /* renamed from: p */
        void mo2900p(int i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r4 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0506g2(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f2243i = r0
            android.content.Context r0 = r9.getContext()
            p000.C0253c3.m1047a(r9, r0)
            int[] r0 = p000.C0440f.f2068v
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            q1 r2 = new q1
            r2.<init>(r9)
            r9.f2236b = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            n0 r3 = new n0
            r3.<init>(r10, r2)
            r9.f2237c = r3
            goto L_0x0030
        L_0x002e:
            r9.f2237c = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f2235j     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004f, all -> 0x0048 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            if (r5 == 0) goto L_0x0052
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0046, all -> 0x0043 }
            goto L_0x0052
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x0049
        L_0x0046:
            goto L_0x0050
        L_0x0048:
            r10 = move-exception
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.recycle()
        L_0x004e:
            throw r10
        L_0x004f:
            r4 = r2
        L_0x0050:
            if (r4 == 0) goto L_0x0055
        L_0x0052:
            r4.recycle()
        L_0x0055:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0091
            if (r3 == r5) goto L_0x005c
            goto L_0x009f
        L_0x005c:
            g2$d r3 = new g2$d
            android.content.Context r6 = r9.f2237c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f2237c
            int[] r7 = p000.C0440f.f2068v
            h3 r6 = p000.C0555h3.m1825q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.mo3031k(r7, r8)
            r9.f2242h = r7
            android.graphics.drawable.Drawable r7 = r6.mo3027g(r5)
            android.widget.PopupWindow r8 = r3.f4547A
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.f2251E = r4
            android.content.res.TypedArray r4 = r6.f2425b
            r4.recycle()
            r9.f2241g = r3
            f2 r4 = new f2
            r4.<init>(r9, r9, r3)
            r9.f2238d = r4
            goto L_0x009f
        L_0x0091:
            g2$b r3 = new g2$b
            r3.<init>()
            r9.f2241g = r3
            java.lang.String r4 = r0.getString(r4)
            r3.mo2893h(r4)
        L_0x009f:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00b6
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131427457(0x7f0b0081, float:1.847653E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00b6:
            r0.recycle()
            r9.f2240f = r5
            android.widget.SpinnerAdapter r10 = r9.f2239e
            if (r10 == 0) goto L_0x00c4
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f2239e = r2
        L_0x00c4:
            q1 r10 = r9.f2236b
            r10.mo4058d(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0506g2.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public int mo2860a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f2243i);
        Rect rect = this.f2243i;
        return i2 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void mo2861b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f2241g.mo2892f(getTextDirection(), getTextAlignment());
        } else {
            this.f2241g.mo2892f(-1, -1);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            return fVar.mo2890d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            return fVar.mo2894j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f2241g != null) {
            return this.f2242h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final C0516f getInternalPopup() {
        return this.f2241g;
    }

    public Drawable getPopupBackground() {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            return fVar.mo2897n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f2237c;
    }

    public CharSequence getPrompt() {
        C0516f fVar = this.f2241g;
        return fVar != null ? fVar.mo2888b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0516f fVar = this.f2241g;
        if (fVar != null && fVar.mo2887a()) {
            this.f2241g.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2241g != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2860a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0514e eVar = (C0514e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f2260b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0507a());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0514e eVar = new C0514e(super.onSaveInstanceState());
        C0516f fVar = this.f2241g;
        eVar.f2260b = fVar != null && fVar.mo2887a();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1039r2 r2Var = this.f2238d;
        if (r2Var == null || !r2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0516f fVar = this.f2241g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.mo2887a()) {
            return true;
        }
        mo2861b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2240f) {
            this.f2239e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2241g != null) {
            Context context = this.f2237c;
            if (context == null) {
                context = getContext();
            }
            this.f2241g.mo2898o(new C0509c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            fVar.mo2900p(i);
            this.f2241g.mo2889c(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            fVar.mo2896m(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f2241g != null) {
            this.f2242h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            fVar.mo2895l(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0399e0.m1530b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0516f fVar = this.f2241g;
        if (fVar != null) {
            fVar.mo2893h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f2236b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }
}
