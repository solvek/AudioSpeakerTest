package p000;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.nordskog.LesserAudioSwitch.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b3 */
public class C0206b3 extends C0669j9 implements View.OnClickListener {

    /* renamed from: z */
    public static final /* synthetic */ int f1211z = 0;

    /* renamed from: m */
    public final SearchView f1212m;

    /* renamed from: n */
    public final SearchableInfo f1213n;

    /* renamed from: o */
    public final Context f1214o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f1215p;

    /* renamed from: q */
    public final int f1216q;

    /* renamed from: r */
    public int f1217r = 1;

    /* renamed from: s */
    public ColorStateList f1218s;

    /* renamed from: t */
    public int f1219t = -1;

    /* renamed from: u */
    public int f1220u = -1;

    /* renamed from: v */
    public int f1221v = -1;

    /* renamed from: w */
    public int f1222w = -1;

    /* renamed from: x */
    public int f1223x = -1;

    /* renamed from: y */
    public int f1224y = -1;

    /* renamed from: b3$a */
    public static final class C0207a {

        /* renamed from: a */
        public final TextView f1225a;

        /* renamed from: b */
        public final TextView f1226b;

        /* renamed from: c */
        public final ImageView f1227c;

        /* renamed from: d */
        public final ImageView f1228d;

        /* renamed from: e */
        public final ImageView f1229e;

        public C0207a(View view) {
            this.f1225a = (TextView) view.findViewById(16908308);
            this.f1226b = (TextView) view.findViewById(16908309);
            this.f1227c = (ImageView) view.findViewById(16908295);
            this.f1228d = (ImageView) view.findViewById(16908296);
            this.f1229e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public C0206b3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1212m = searchView;
        this.f1213n = searchableInfo;
        this.f1216q = searchView.getSuggestionCommitIconResId();
        this.f1214o = context;
        this.f1215p = weakHashMap;
    }

    /* renamed from: h */
    public static String m985h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1552a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            b3$a r3 = (p000.C0206b3.C0207a) r3
            int r0 = r1.f1224y
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r0 = r3.f1225a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.f1219t
            java.lang.String r0 = m985h(r2, r0)
            android.widget.TextView r8 = r3.f1225a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r8.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f1226b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bd
            int r0 = r1.f1221v
            java.lang.String r0 = m985h(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r10 = r1.f1218s
            if (r10 != 0) goto L_0x0065
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f2443e
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130903740(0x7f0302bc, float:1.7414307E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f2443e
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f1218s = r10
        L_0x0065:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f1218s
            r16 = 0
            r17 = r11
            r11 = r15
            r7 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r7, r4, r0, r11)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.f1220u
            java.lang.String r10 = m985h(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f1225a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.f1225a
            r0.setMaxLines(r8)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f1225a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f1225a
            r0.setMaxLines(r9)
        L_0x00ab:
            android.widget.TextView r0 = r3.f1226b
            r0.setText(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto L_0x00b9
            r7 = 8
            goto L_0x00ba
        L_0x00b9:
            r7 = 0
        L_0x00ba:
            r0.setVisibility(r7)
        L_0x00bd:
            android.widget.ImageView r7 = r3.f1227c
            r10 = 0
            if (r7 == 0) goto L_0x0155
            int r0 = r1.f1222w
            if (r0 != r5) goto L_0x00c9
            r0 = r10
            goto L_0x0142
        L_0x00c9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo1557f(r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x0142
        L_0x00d5:
            android.app.SearchableInfo r0 = r1.f1213n
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f1215p
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00fe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f1215p
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f3
            r0 = r10
            goto L_0x0135
        L_0x00f3:
            android.content.Context r11 = r1.f1214o
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0135
        L_0x00fe:
            android.content.Context r12 = r1.f2443e
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0121 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0111
            goto L_0x0126
        L_0x0111:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0127
            r0.flattenToShortString()
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            r12 = r0
            r12.toString()
        L_0x0126:
            r12 = r10
        L_0x0127:
            if (r12 != 0) goto L_0x012b
            r0 = r10
            goto L_0x012f
        L_0x012b:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x012f:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f1215p
            r13.put(r11, r0)
            r0 = r12
        L_0x0135:
            if (r0 == 0) goto L_0x0138
            goto L_0x0142
        L_0x0138:
            android.content.Context r0 = r1.f2443e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0142:
            r11 = 4
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x014c
            r7.setVisibility(r11)
            goto L_0x0155
        L_0x014c:
            r7.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0155:
            android.widget.ImageView r0 = r3.f1228d
            if (r0 == 0) goto L_0x017a
            int r7 = r1.f1223x
            if (r7 != r5) goto L_0x015e
            goto L_0x0166
        L_0x015e:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r10 = r1.mo1557f(r2)
        L_0x0166:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0171
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x017a
        L_0x0171:
            r0.setVisibility(r4)
            r10.setVisible(r4, r4)
            r10.setVisible(r9, r4)
        L_0x017a:
            int r0 = r1.f1217r
            if (r0 == r8) goto L_0x018d
            if (r0 != r9) goto L_0x0185
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0185
            goto L_0x018d
        L_0x0185:
            android.widget.ImageView r0 = r3.f1229e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01a2
        L_0x018d:
            android.widget.ImageView r0 = r3.f1229e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f1229e
            android.widget.TextView r2 = r3.f1225a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1229e
            r0.setOnClickListener(r1)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0206b3.mo1552a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: b */
    public void mo1553b(Cursor cursor) {
        try {
            super.mo1553b(cursor);
            if (cursor != null) {
                this.f1219t = cursor.getColumnIndex("suggest_text_1");
                this.f1220u = cursor.getColumnIndex("suggest_text_2");
                this.f1221v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1222w = cursor.getColumnIndex("suggest_icon_1");
                this.f1223x = cursor.getColumnIndex("suggest_icon_2");
                this.f1224y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public CharSequence mo1554c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = m985h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        if (this.f1213n.shouldRewriteQueryFromData() && (h2 = m985h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!this.f1213n.shouldRewriteQueryFromText() || (h = m985h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    /* renamed from: d */
    public View mo1555d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f2850l.inflate(this.f2848j, viewGroup, false);
        inflate.setTag(new C0207a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f1216q);
        return inflate;
    }

    /* renamed from: e */
    public Drawable mo1556e(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2443e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0088 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0082=Splitter:B:30:0x0082, B:41:0x00b3=Splitter:B:41:0x00b3, B:47:0x00c8=Splitter:B:47:0x00c8} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo1557f(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0116
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0116
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0013
            goto L_0x0116
        L_0x0013:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.content.Context r3 = r5.f1214o     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1215p     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r3 != 0) goto L_0x0042
            r3 = r0
            goto L_0x0046
        L_0x0042:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r3
        L_0x0049:
            android.content.Context r3 = r5.f1214o     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable r1 = p000.C0408e6.m1548b(r3, r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r1 == 0) goto L_0x005a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1215p     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r4 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r3.put(r2, r4)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x005a:
            return r1
        L_0x005b:
            return r0
        L_0x005c:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1215p
            java.lang.Object r1 = r1.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L_0x0069
            r1 = r0
            goto L_0x006d
        L_0x0069:
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
        L_0x006d:
            if (r1 == 0) goto L_0x0070
            return r1
        L_0x0070:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r2 = "Error closing icon stream for "
            java.lang.String r3 = r1.getScheme()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r3 == 0) goto L_0x009f
            android.graphics.drawable.Drawable r0 = r5.mo1556e(r1)     // Catch:{ NotFoundException -> 0x0088 }
            goto L_0x010b
        L_0x0088:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x009f:
            android.content.Context r3 = r5.f1214o     // Catch:{ FileNotFoundException -> 0x00ee }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.io.InputStream r3 = r3.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r3 == 0) goto L_0x00d7
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r0)     // Catch:{ all -> 0x00c3 }
            r3.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00c1
        L_0x00b3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r2)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00c1:
            r0 = r4
            goto L_0x010b
        L_0x00c3:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00d6
        L_0x00c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r2)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00d6:
            throw r4     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00d7:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00ee }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00ee:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", "
            r3.append(r1)
            java.lang.String r1 = r2.getMessage()
            r3.append(r1)
            r3.toString()
        L_0x010b:
            if (r0 == 0) goto L_0x0116
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1215p
            android.graphics.drawable.Drawable$ConstantState r2 = r0.getConstantState()
            r1.put(r6, r2)
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0206b3.mo1557f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public Cursor mo1558g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2443e.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f2850l.inflate(this.f2849k, viewGroup, false);
            if (inflate != null) {
                ((C0207a) inflate.getTag()).f1225a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = mo1555d(this.f2443e, this.f2442d, viewGroup);
            ((C0207a) d.getTag()).f1225a.setText(e.toString());
            return d;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public final void mo1562i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo1562i(this.f2442d);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo1562i(this.f2442d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1212m.mo399x((CharSequence) tag);
        }
    }
}
