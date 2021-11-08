package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000.C0607i5;

/* renamed from: j5 */
public class C0664j5 extends ViewGroup {

    /* renamed from: b */
    public C0607i5 f2828b;

    /* renamed from: j5$a */
    public static class C0665a extends ConstraintLayout.C0084a {

        /* renamed from: l0 */
        public float f2829l0;

        /* renamed from: m0 */
        public boolean f2830m0;

        /* renamed from: n0 */
        public float f2831n0;

        /* renamed from: o0 */
        public float f2832o0;

        /* renamed from: p0 */
        public float f2833p0;

        /* renamed from: q0 */
        public float f2834q0;

        /* renamed from: r0 */
        public float f2835r0;

        /* renamed from: s0 */
        public float f2836s0;

        /* renamed from: t0 */
        public float f2837t0;

        /* renamed from: u0 */
        public float f2838u0;

        /* renamed from: v0 */
        public float f2839v0;

        /* renamed from: w0 */
        public float f2840w0;

        public C0665a(int i, int i2) {
            super(i, i2);
            this.f2829l0 = 1.0f;
            this.f2830m0 = false;
            this.f2831n0 = 0.0f;
            this.f2832o0 = 0.0f;
            this.f2833p0 = 0.0f;
            this.f2834q0 = 0.0f;
            this.f2835r0 = 1.0f;
            this.f2836s0 = 1.0f;
            this.f2837t0 = 0.0f;
            this.f2838u0 = 0.0f;
            this.f2839v0 = 0.0f;
            this.f2840w0 = 0.0f;
        }

        public C0665a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f2829l0 = 1.0f;
            this.f2830m0 = false;
            this.f2831n0 = 0.0f;
            this.f2832o0 = 0.0f;
            this.f2833p0 = 0.0f;
            this.f2834q0 = 0.0f;
            this.f2835r0 = 1.0f;
            this.f2836s0 = 1.0f;
            this.f2837t0 = 0.0f;
            this.f2838u0 = 0.0f;
            this.f2839v0 = 0.0f;
            this.f2840w0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0858n5.f3340b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 13) {
                    this.f2829l0 = obtainStyledAttributes.getFloat(index, this.f2829l0);
                } else if (index == 26) {
                    this.f2831n0 = obtainStyledAttributes.getFloat(index, this.f2831n0);
                    this.f2830m0 = true;
                } else if (index == 21) {
                    this.f2833p0 = obtainStyledAttributes.getFloat(index, this.f2833p0);
                } else if (index == 22) {
                    this.f2834q0 = obtainStyledAttributes.getFloat(index, this.f2834q0);
                } else if (index == 20) {
                    this.f2832o0 = obtainStyledAttributes.getFloat(index, this.f2832o0);
                } else if (index == 18) {
                    this.f2835r0 = obtainStyledAttributes.getFloat(index, this.f2835r0);
                } else if (index == 19) {
                    this.f2836s0 = obtainStyledAttributes.getFloat(index, this.f2836s0);
                } else if (index == 14) {
                    this.f2837t0 = obtainStyledAttributes.getFloat(index, this.f2837t0);
                } else if (index == 15) {
                    this.f2838u0 = obtainStyledAttributes.getFloat(index, this.f2838u0);
                } else {
                    if (index == 16) {
                        f = this.f2839v0;
                    } else if (index == 17) {
                        this.f2840w0 = obtainStyledAttributes.getFloat(index, this.f2840w0);
                    } else if (index == 25) {
                        f = 0.0f;
                    }
                    this.f2839v0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0665a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0665a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0084a(layoutParams);
    }

    public C0607i5 getConstraintSet() {
        if (this.f2828b == null) {
            this.f2828b = new C0607i5();
        }
        C0607i5 i5Var = this.f2828b;
        i5Var.getClass();
        int childCount = getChildCount();
        i5Var.f2548a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C0665a aVar = (C0665a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!i5Var.f2548a.containsKey(Integer.valueOf(id))) {
                    i5Var.f2548a.put(Integer.valueOf(id), new C0607i5.C0608a());
                }
                C0607i5.C0608a aVar2 = i5Var.f2548a.get(Integer.valueOf(id));
                if (childAt instanceof C0557h5) {
                    C0557h5 h5Var = (C0557h5) childAt;
                    aVar2.mo3185b(id, aVar);
                    if (h5Var instanceof C0519g5) {
                        aVar2.f2614t0 = 1;
                        C0519g5 g5Var = (C0519g5) h5Var;
                        aVar2.f2612s0 = g5Var.getType();
                        aVar2.f2616u0 = g5Var.getReferencedIds();
                    }
                }
                aVar2.mo3185b(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f2828b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
