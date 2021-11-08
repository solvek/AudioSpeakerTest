package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j9 */
public abstract class C0669j9 extends C0561h9 {

    /* renamed from: j */
    public int f2848j;

    /* renamed from: k */
    public int f2849k;

    /* renamed from: l */
    public LayoutInflater f2850l;

    @Deprecated
    public C0669j9(Context context, int i, Cursor cursor, boolean z) {
        super(context, (Cursor) null, z);
        this.f2849k = i;
        this.f2848j = i;
        this.f2850l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: d */
    public View mo1555d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2850l.inflate(this.f2848j, viewGroup, false);
    }
}
