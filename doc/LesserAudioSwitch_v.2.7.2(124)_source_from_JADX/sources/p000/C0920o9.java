package p000;

import android.graphics.Rect;
import java.util.Comparator;
import p000.C0762l9;

/* renamed from: o9 */
public class C0920o9<T> implements Comparator<T> {

    /* renamed from: a */
    public final Rect f3484a = new Rect();

    /* renamed from: b */
    public final Rect f3485b = new Rect();

    /* renamed from: c */
    public final boolean f3486c;

    /* renamed from: d */
    public final C0818m9<T> f3487d;

    public C0920o9(boolean z, C0818m9<T> m9Var) {
        this.f3486c = z;
        this.f3487d = m9Var;
    }

    public int compare(T t, T t2) {
        Rect rect = this.f3484a;
        Rect rect2 = this.f3485b;
        ((C0762l9.C0763a) this.f3487d).mo3613a(t, rect);
        ((C0762l9.C0763a) this.f3487d).mo3613a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f3486c ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f3486c ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f3486c ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f3486c ? -1 : 1;
        }
        return 0;
    }
}
