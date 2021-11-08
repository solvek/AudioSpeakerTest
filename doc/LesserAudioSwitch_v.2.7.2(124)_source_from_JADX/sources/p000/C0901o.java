package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: o */
public class C0901o extends C1392y implements DialogInterface {

    /* renamed from: d */
    public final AlertController f3435d = new AlertController(getContext(), this, getWindow());

    /* renamed from: o$a */
    public static class C0902a {

        /* renamed from: a */
        public final AlertController.C0039b f3436a;

        /* renamed from: b */
        public final int f3437b;

        public C0902a(Context context) {
            int e = C0901o.m2623e(context, 0);
            this.f3436a = new AlertController.C0039b(new ContextThemeWrapper(context, C0901o.m2623e(context, e)));
            this.f3437b = e;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: android.widget.ListAdapter} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.appcompat.app.AlertController$d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.C0901o mo3816a() {
            /*
                r15 = this;
                o r0 = new o
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                android.content.Context r1 = r1.f190a
                int r2 = r15.f3437b
                r0.<init>(r1, r2)
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                androidx.appcompat.app.AlertController r10 = r0.f3435d
                android.view.View r2 = r1.f194e
                r11 = 0
                if (r2 == 0) goto L_0x0017
                r10.f149G = r2
                goto L_0x0038
            L_0x0017:
                java.lang.CharSequence r2 = r1.f193d
                if (r2 == 0) goto L_0x0024
                r10.f165e = r2
                android.widget.TextView r3 = r10.f147E
                if (r3 == 0) goto L_0x0024
                r3.setText(r2)
            L_0x0024:
                android.graphics.drawable.Drawable r2 = r1.f192c
                if (r2 == 0) goto L_0x0038
                r10.f145C = r2
                r10.f144B = r11
                android.widget.ImageView r3 = r10.f146D
                if (r3 == 0) goto L_0x0038
                r3.setVisibility(r11)
                android.widget.ImageView r3 = r10.f146D
                r3.setImageDrawable(r2)
            L_0x0038:
                java.lang.CharSequence r2 = r1.f195f
                if (r2 == 0) goto L_0x0045
                r10.f166f = r2
                android.widget.TextView r3 = r10.f148F
                if (r3 == 0) goto L_0x0045
                r3.setText(r2)
            L_0x0045:
                java.lang.CharSequence r4 = r1.f196g
                if (r4 != 0) goto L_0x004a
                goto L_0x0053
            L_0x004a:
                r3 = -1
                android.content.DialogInterface$OnClickListener r5 = r1.f197h
                r6 = 0
                r7 = 0
                r2 = r10
                r2.mo138e(r3, r4, r5, r6, r7)
            L_0x0053:
                java.lang.CharSequence r4 = r1.f198i
                if (r4 != 0) goto L_0x0058
                goto L_0x0061
            L_0x0058:
                r3 = -2
                android.content.DialogInterface$OnClickListener r5 = r1.f199j
                r6 = 0
                r7 = 0
                r2 = r10
                r2.mo138e(r3, r4, r5, r6, r7)
            L_0x0061:
                java.lang.CharSequence[] r2 = r1.f201l
                r12 = 1
                r13 = 0
                if (r2 != 0) goto L_0x006b
                android.widget.ListAdapter r2 = r1.f202m
                if (r2 == 0) goto L_0x00d1
            L_0x006b:
                android.view.LayoutInflater r2 = r1.f191b
                int r3 = r10.f154L
                android.view.View r2 = r2.inflate(r3, r13)
                androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController.RecycleListView) r2
                boolean r3 = r1.f206q
                if (r3 == 0) goto L_0x008b
                l r14 = new l
                android.content.Context r5 = r1.f190a
                int r6 = r10.f155M
                r7 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r8 = r1.f201l
                r3 = r14
                r4 = r1
                r9 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9)
                goto L_0x00a5
            L_0x008b:
                boolean r3 = r1.f207r
                if (r3 == 0) goto L_0x0092
                int r3 = r10.f156N
                goto L_0x0094
            L_0x0092:
                int r3 = r10.f157O
            L_0x0094:
                android.widget.ListAdapter r14 = r1.f202m
                if (r14 == 0) goto L_0x0099
                goto L_0x00a5
            L_0x0099:
                androidx.appcompat.app.AlertController$d r14 = new androidx.appcompat.app.AlertController$d
                android.content.Context r4 = r1.f190a
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r1.f201l
                r14.<init>(r4, r3, r5, r6)
            L_0x00a5:
                r10.f150H = r14
                int r3 = r1.f208s
                r10.f151I = r3
                android.content.DialogInterface$OnClickListener r3 = r1.f203n
                if (r3 == 0) goto L_0x00b5
                m r3 = new m
                r3.<init>(r1, r10)
                goto L_0x00be
            L_0x00b5:
                android.content.DialogInterface$OnMultiChoiceClickListener r3 = r1.f209t
                if (r3 == 0) goto L_0x00c1
                n r3 = new n
                r3.<init>(r1, r2, r10)
            L_0x00be:
                r2.setOnItemClickListener(r3)
            L_0x00c1:
                boolean r3 = r1.f207r
                if (r3 == 0) goto L_0x00c7
                r3 = 1
                goto L_0x00cc
            L_0x00c7:
                boolean r3 = r1.f206q
                if (r3 == 0) goto L_0x00cf
                r3 = 2
            L_0x00cc:
                r2.setChoiceMode(r3)
            L_0x00cf:
                r10.f167g = r2
            L_0x00d1:
                android.view.View r1 = r1.f204o
                if (r1 == 0) goto L_0x00db
                r10.f168h = r1
                r10.f169i = r11
                r10.f174n = r11
            L_0x00db:
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                r1.getClass()
                r0.setCancelable(r12)
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                r1.getClass()
                r0.setCanceledOnTouchOutside(r12)
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                r1.getClass()
                r0.setOnCancelListener(r13)
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                r1.getClass()
                r0.setOnDismissListener(r13)
                androidx.appcompat.app.AlertController$b r1 = r15.f3436a
                android.content.DialogInterface$OnKeyListener r1 = r1.f200k
                if (r1 == 0) goto L_0x0104
                r0.setOnKeyListener(r1)
            L_0x0104:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0901o.C0902a.mo3816a():o");
        }

        /* renamed from: b */
        public C0902a mo3817b(int i) {
            AlertController.C0039b bVar = this.f3436a;
            bVar.f195f = bVar.f190a.getText(i);
            return this;
        }

        /* renamed from: c */
        public C0902a mo3818c(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0039b bVar = this.f3436a;
            bVar.f196g = bVar.f190a.getText(i);
            this.f3436a.f197h = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0902a mo3819d(int i) {
            AlertController.C0039b bVar = this.f3436a;
            bVar.f193d = bVar.f190a.getText(i);
            return this;
        }
    }

    public C0901o(Context context, int i) {
        super(context, m2623e(context, i));
    }

    /* renamed from: e */
    public static int m2623e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e4, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ee, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
        if (r7 != null) goto L_0x03a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.f3435d
            int r2 = r1.f153K
            int r2 = r1.f152J
            y r3 = r1.f162b
            r3.setContentView((int) r2)
            android.view.Window r2 = r1.f163c
            r3 = 2131231005(0x7f08011d, float:1.8078079E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131231154(0x7f0801b2, float:1.807838E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131230847(0x7f08007f, float:1.8077758E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131230815(0x7f08005f, float:1.8077693E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131230850(0x7f080082, float:1.8077764E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r9 = r1.f168h
            r11 = 0
            if (r9 == 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            int r9 = r1.f169i
            if (r9 == 0) goto L_0x004e
            android.content.Context r9 = r1.f161a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r12 = r1.f169i
            android.view.View r9 = r9.inflate(r12, r2, r11)
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            if (r13 == 0) goto L_0x005c
            boolean r14 = androidx.appcompat.app.AlertController.m63a(r9)
            if (r14 != 0) goto L_0x0063
        L_0x005c:
            android.view.Window r14 = r1.f163c
            r15 = 131072(0x20000, float:1.83671E-40)
            r14.setFlags(r15, r15)
        L_0x0063:
            r14 = -1
            r15 = 8
            if (r13 == 0) goto L_0x0098
            android.view.Window r13 = r1.f163c
            r12 = 2131230849(0x7f080081, float:1.8077762E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r14, r14)
            r12.addView(r9, r13)
            boolean r9 = r1.f174n
            if (r9 == 0) goto L_0x008a
            int r9 = r1.f170j
            int r13 = r1.f171k
            int r10 = r1.f172l
            int r14 = r1.f173m
            r12.setPadding(r9, r13, r10, r14)
        L_0x008a:
            android.widget.ListView r9 = r1.f167g
            if (r9 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            s2$a r9 = (p000.C1095s2.C1096a) r9
            r10 = 0
            r9.f4154a = r10
            goto L_0x009b
        L_0x0098:
            r2.setVisibility(r15)
        L_0x009b:
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = r1.mo137d(r3, r4)
            android.view.ViewGroup r4 = r1.mo137d(r5, r6)
            android.view.ViewGroup r5 = r1.mo137d(r7, r8)
            android.view.Window r6 = r1.f163c
            r7 = 2131231059(0x7f080153, float:1.8078188E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.f143A = r6
            r6.setFocusable(r11)
            androidx.core.widget.NestedScrollView r6 = r1.f143A
            r6.setNestedScrollingEnabled(r11)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f148F = r6
            if (r6 != 0) goto L_0x00d6
            goto L_0x010c
        L_0x00d6:
            java.lang.CharSequence r7 = r1.f166f
            if (r7 == 0) goto L_0x00de
            r6.setText(r7)
            goto L_0x010c
        L_0x00de:
            r6.setVisibility(r15)
            androidx.core.widget.NestedScrollView r6 = r1.f143A
            android.widget.TextView r7 = r1.f148F
            r6.removeView(r7)
            android.widget.ListView r6 = r1.f167g
            if (r6 == 0) goto L_0x0109
            androidx.core.widget.NestedScrollView r6 = r1.f143A
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r7 = r1.f143A
            int r7 = r6.indexOfChild(r7)
            r6.removeViewAt(r7)
            android.widget.ListView r8 = r1.f167g
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r6.addView(r8, r7, r9)
            goto L_0x010c
        L_0x0109:
            r4.setVisibility(r15)
        L_0x010c:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.f175o = r6
            android.view.View$OnClickListener r7 = r1.f160R
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r1.f176p
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x012f
            android.graphics.drawable.Drawable r6 = r1.f178r
            if (r6 != 0) goto L_0x012f
            android.widget.Button r6 = r1.f175o
            r6.setVisibility(r15)
            r6 = 0
            goto L_0x014d
        L_0x012f:
            android.widget.Button r6 = r1.f175o
            java.lang.CharSequence r7 = r1.f176p
            r6.setText(r7)
            android.graphics.drawable.Drawable r6 = r1.f178r
            if (r6 == 0) goto L_0x0147
            int r7 = r1.f164d
            r6.setBounds(r11, r11, r7, r7)
            android.widget.Button r6 = r1.f175o
            android.graphics.drawable.Drawable r7 = r1.f178r
            r8 = 0
            r6.setCompoundDrawables(r7, r8, r8, r8)
        L_0x0147:
            android.widget.Button r6 = r1.f175o
            r6.setVisibility(r11)
            r6 = 1
        L_0x014d:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f179s = r7
            android.view.View$OnClickListener r8 = r1.f160R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f180t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x016f
            android.graphics.drawable.Drawable r7 = r1.f182v
            if (r7 != 0) goto L_0x016f
            android.widget.Button r7 = r1.f179s
            r7.setVisibility(r15)
            goto L_0x018e
        L_0x016f:
            android.widget.Button r7 = r1.f179s
            java.lang.CharSequence r8 = r1.f180t
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f182v
            if (r7 == 0) goto L_0x0187
            int r8 = r1.f164d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f179s
            android.graphics.drawable.Drawable r8 = r1.f182v
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
        L_0x0187:
            android.widget.Button r7 = r1.f179s
            r7.setVisibility(r11)
            r6 = r6 | 2
        L_0x018e:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f183w = r7
            android.view.View$OnClickListener r8 = r1.f160R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f184x
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x01b1
            android.graphics.drawable.Drawable r7 = r1.f186z
            if (r7 != 0) goto L_0x01b1
            android.widget.Button r7 = r1.f183w
            r7.setVisibility(r15)
            r9 = 0
            goto L_0x01d2
        L_0x01b1:
            android.widget.Button r7 = r1.f183w
            java.lang.CharSequence r8 = r1.f184x
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f186z
            if (r7 == 0) goto L_0x01ca
            int r8 = r1.f164d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f183w
            android.graphics.drawable.Drawable r8 = r1.f186z
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
            goto L_0x01cb
        L_0x01ca:
            r9 = 0
        L_0x01cb:
            android.widget.Button r7 = r1.f183w
            r7.setVisibility(r11)
            r6 = r6 | 4
        L_0x01d2:
            android.content.Context r7 = r1.f161a
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r10 = 2130903077(0x7f030025, float:1.7412962E38)
            r12 = 1
            r7.resolveAttribute(r10, r8, r12)
            int r7 = r8.data
            if (r7 == 0) goto L_0x01ea
            r7 = 1
            goto L_0x01eb
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            r8 = 2
            if (r7 == 0) goto L_0x0200
            if (r6 != r12) goto L_0x01f3
            android.widget.Button r7 = r1.f175o
            goto L_0x01fd
        L_0x01f3:
            if (r6 != r8) goto L_0x01f8
            android.widget.Button r7 = r1.f179s
            goto L_0x01fd
        L_0x01f8:
            r7 = 4
            if (r6 != r7) goto L_0x0200
            android.widget.Button r7 = r1.f183w
        L_0x01fd:
            r1.mo136b(r7)
        L_0x0200:
            if (r6 == 0) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            if (r6 != 0) goto L_0x020a
            r5.setVisibility(r15)
        L_0x020a:
            android.view.View r6 = r1.f149G
            r7 = 2131231152(0x7f0801b0, float:1.8078377E38)
            if (r6 == 0) goto L_0x0228
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r12 = -1
            r6.<init>(r12, r10)
            android.view.View r10 = r1.f149G
            r3.addView(r10, r11, r6)
            android.view.Window r6 = r1.f163c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x0228:
            android.view.Window r6 = r1.f163c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f146D = r6
            java.lang.CharSequence r6 = r1.f165e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r10 = 1
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x028c
            boolean r6 = r1.f158P
            if (r6 == 0) goto L_0x028c
            android.view.Window r6 = r1.f163c
            r7 = 2131230785(0x7f080041, float:1.8077633E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f147E = r6
            java.lang.CharSequence r7 = r1.f165e
            r6.setText(r7)
            int r6 = r1.f144B
            if (r6 == 0) goto L_0x025f
            android.widget.ImageView r7 = r1.f146D
            r7.setImageResource(r6)
            goto L_0x029d
        L_0x025f:
            android.graphics.drawable.Drawable r6 = r1.f145C
            if (r6 == 0) goto L_0x0269
            android.widget.ImageView r7 = r1.f146D
            r7.setImageDrawable(r6)
            goto L_0x029d
        L_0x0269:
            android.widget.TextView r6 = r1.f147E
            android.widget.ImageView r7 = r1.f146D
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r10 = r1.f146D
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r12 = r1.f146D
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r1.f146D
            int r13 = r13.getPaddingBottom()
            r6.setPadding(r7, r10, r12, r13)
            android.widget.ImageView r6 = r1.f146D
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x028c:
            android.view.Window r6 = r1.f163c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r1.f146D
            r6.setVisibility(r15)
            r3.setVisibility(r15)
        L_0x029d:
            int r2 = r2.getVisibility()
            if (r2 == r15) goto L_0x02a5
            r12 = 1
            goto L_0x02a6
        L_0x02a5:
            r12 = 0
        L_0x02a6:
            if (r3 == 0) goto L_0x02b0
            int r2 = r3.getVisibility()
            if (r2 == r15) goto L_0x02b0
            r2 = 1
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            int r5 = r5.getVisibility()
            if (r5 == r15) goto L_0x02b9
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            if (r5 != 0) goto L_0x02c8
            r6 = 2131231137(0x7f0801a1, float:1.8078347E38)
            android.view.View r6 = r4.findViewById(r6)
            if (r6 == 0) goto L_0x02c8
            r6.setVisibility(r11)
        L_0x02c8:
            if (r2 == 0) goto L_0x02e7
            androidx.core.widget.NestedScrollView r6 = r1.f143A
            if (r6 == 0) goto L_0x02d2
            r7 = 1
            r6.setClipToPadding(r7)
        L_0x02d2:
            java.lang.CharSequence r6 = r1.f166f
            if (r6 != 0) goto L_0x02dd
            android.widget.ListView r6 = r1.f167g
            if (r6 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r3 = r9
            goto L_0x02e4
        L_0x02dd:
            r6 = 2131231151(0x7f0801af, float:1.8078375E38)
            android.view.View r3 = r3.findViewById(r6)
        L_0x02e4:
            if (r3 == 0) goto L_0x02f3
            goto L_0x02f0
        L_0x02e7:
            r3 = 2131231138(0x7f0801a2, float:1.8078349E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x02f3
        L_0x02f0:
            r3.setVisibility(r11)
        L_0x02f3:
            android.widget.ListView r3 = r1.f167g
            boolean r6 = r3 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r6 == 0) goto L_0x031f
            androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
            r3.getClass()
            if (r5 == 0) goto L_0x0302
            if (r2 != 0) goto L_0x031f
        L_0x0302:
            int r6 = r3.getPaddingLeft()
            if (r2 == 0) goto L_0x030d
            int r7 = r3.getPaddingTop()
            goto L_0x030f
        L_0x030d:
            int r7 = r3.f187b
        L_0x030f:
            int r10 = r3.getPaddingRight()
            if (r5 == 0) goto L_0x031a
            int r13 = r3.getPaddingBottom()
            goto L_0x031c
        L_0x031a:
            int r13 = r3.f188c
        L_0x031c:
            r3.setPadding(r6, r7, r10, r13)
        L_0x031f:
            if (r12 != 0) goto L_0x03aa
            android.widget.ListView r3 = r1.f167g
            if (r3 == 0) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            androidx.core.widget.NestedScrollView r3 = r1.f143A
        L_0x0328:
            if (r3 == 0) goto L_0x03aa
            if (r5 == 0) goto L_0x032d
            r11 = 2
        L_0x032d:
            r2 = r2 | r11
            r5 = 3
            android.view.Window r6 = r1.f163c
            r7 = 2131231058(0x7f080152, float:1.8078186E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.Window r7 = r1.f163c
            r10 = 2131231057(0x7f080151, float:1.8078184E38)
            android.view.View r7 = r7.findViewById(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r10 < r11) goto L_0x0356
            java.lang.reflect.Field r8 = p000.C0813m8.f3234a
            if (r10 < r11) goto L_0x034e
            r3.setScrollIndicators(r2, r5)
        L_0x034e:
            if (r6 == 0) goto L_0x0353
            r4.removeView(r6)
        L_0x0353:
            if (r7 == 0) goto L_0x03aa
            goto L_0x03a7
        L_0x0356:
            if (r6 == 0) goto L_0x0360
            r3 = r2 & 1
            if (r3 != 0) goto L_0x0360
            r4.removeView(r6)
            r6 = r9
        L_0x0360:
            if (r7 == 0) goto L_0x036a
            r2 = r2 & r8
            if (r2 != 0) goto L_0x036a
            r4.removeView(r7)
            r10 = r9
            goto L_0x036b
        L_0x036a:
            r10 = r7
        L_0x036b:
            if (r6 != 0) goto L_0x036f
            if (r10 == 0) goto L_0x03aa
        L_0x036f:
            java.lang.CharSequence r2 = r1.f166f
            if (r2 == 0) goto L_0x0388
            androidx.core.widget.NestedScrollView r2 = r1.f143A
            h r3 = new h
            r3.<init>(r1, r6, r10)
            r2.setOnScrollChangeListener(r3)
            androidx.core.widget.NestedScrollView r2 = r1.f143A
            i r3 = new i
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x0388:
            android.widget.ListView r2 = r1.f167g
            if (r2 == 0) goto L_0x039f
            j r3 = new j
            r3.<init>(r1, r6, r10)
            r2.setOnScrollListener(r3)
            android.widget.ListView r2 = r1.f167g
            k r3 = new k
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x039f:
            if (r6 == 0) goto L_0x03a4
            r4.removeView(r6)
        L_0x03a4:
            if (r10 == 0) goto L_0x03aa
            r7 = r10
        L_0x03a7:
            r4.removeView(r7)
        L_0x03aa:
            android.widget.ListView r2 = r1.f167g
            if (r2 == 0) goto L_0x03c1
            android.widget.ListAdapter r3 = r1.f150H
            if (r3 == 0) goto L_0x03c1
            r2.setAdapter(r3)
            int r1 = r1.f151I
            r3 = -1
            if (r1 <= r3) goto L_0x03c1
            r3 = 1
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x03c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0901o.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3435d.f143A;
        if (nestedScrollView != null && nestedScrollView.mo779j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3435d.f143A;
        if (nestedScrollView != null && nestedScrollView.mo779j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f3435d;
        alertController.f165e = charSequence;
        TextView textView = alertController.f147E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
