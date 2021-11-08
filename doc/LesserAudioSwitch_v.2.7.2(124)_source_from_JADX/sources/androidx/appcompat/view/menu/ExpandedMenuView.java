package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C1435z0;

public final class ExpandedMenuView extends ListView implements C1435z0.C1437b, C0504g1, AdapterView.OnItemClickListener {

    /* renamed from: c */
    public static final int[] f223c = {16842964, 16843049};

    /* renamed from: b */
    public C1435z0 f224b;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpandedMenuView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            r3.setOnItemClickListener(r3)
            int[] r0 = f223c
            r1 = 0
            r2 = 16842868(0x1010074, float:2.3693883E-38)
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x0027
            int r0 = r5.getResourceId(r1, r1)
            if (r0 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r0 = p000.C0399e0.m1530b(r4, r0)
            goto L_0x002b
        L_0x0027:
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r1)
        L_0x002b:
            r3.setBackgroundDrawable(r0)
        L_0x002e:
            r0 = 1
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L_0x004d
            boolean r2 = r5.hasValue(r0)
            if (r2 == 0) goto L_0x0046
            int r1 = r5.getResourceId(r0, r1)
            if (r1 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r4 = p000.C0399e0.m1530b(r4, r1)
            goto L_0x004a
        L_0x0046:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L_0x004a:
            r3.setDivider(r4)
        L_0x004d:
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ExpandedMenuView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: b */
    public boolean mo165b(C0203b1 b1Var) {
        return this.f224b.mo5255s(b1Var, (C0449f1) null, 0);
    }

    /* renamed from: c */
    public void mo166c(C1435z0 z0Var) {
        this.f224b = z0Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo165b((C0203b1) getAdapter().getItem(i));
    }
}
