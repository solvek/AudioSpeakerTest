package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: g */
public abstract class C0496g {

    /* renamed from: g$a */
    public static class C0497a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2184a;

        public C0497a(int i, int i2) {
            super(i, i2);
            this.f2184a = 0;
            this.f2184a = 8388627;
        }

        public C0497a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2184a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2048b);
            this.f2184a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0497a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2184a = 0;
        }

        public C0497a(C0497a aVar) {
            super(aVar);
            this.f2184a = 0;
            this.f2184a = aVar.f2184a;
        }
    }

    /* renamed from: g$b */
    public interface C0498b {
        /* renamed from: a */
        void mo2814a(boolean z);
    }

    @Deprecated
    /* renamed from: g$c */
    public static abstract class C0499c {
        /* renamed from: a */
        public abstract void mo2815a();
    }

    /* renamed from: a */
    public abstract void mo2599a(boolean z);

    /* renamed from: b */
    public abstract Context mo2600b();

    /* renamed from: c */
    public abstract void mo2601c(boolean z);
}
