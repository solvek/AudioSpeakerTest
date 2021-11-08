package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

/* renamed from: h5 */
public abstract class C0557h5 extends View {

    /* renamed from: b */
    public int[] f2434b = new int[32];

    /* renamed from: c */
    public int f2435c;

    /* renamed from: d */
    public Context f2436d;

    /* renamed from: e */
    public C1441z4 f2437e;

    /* renamed from: f */
    public String f2438f;

    public C0557h5(Context context) {
        super(context);
        this.f2436d = context;
        mo2933b((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo3040a(str.substring(i));
                    return;
                } else {
                    mo3040a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3040a(String str) {
        int i;
        Object b;
        if (str != null && this.f2436d != null) {
            String trim = str.trim();
            try {
                i = C0805m5.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f2436d.getResources().getIdentifier(trim, "id", this.f2436d.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (b = ((ConstraintLayout) getParent()).mo615b(0, trim)) != null && (b instanceof Integer)) {
                i = ((Integer) b).intValue();
            }
            if (i != 0) {
                setTag(i, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public void mo2933b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0858n5.f3339a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2438f = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3041c() {
    }

    /* renamed from: d */
    public void mo3042d() {
    }

    /* renamed from: e */
    public void mo3043e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2438f);
        }
        C1441z4 z4Var = this.f2437e;
        if (z4Var != null) {
            z4Var.f5260j0 = 0;
            for (int i = 0; i < this.f2435c; i++) {
                View view = constraintLayout.f505b.get(this.f2434b[i]);
                if (view != null) {
                    C1441z4 z4Var2 = this.f2437e;
                    C1236v4 d = constraintLayout.mo618d(view);
                    int i2 = z4Var2.f5260j0 + 1;
                    C1236v4[] v4VarArr = z4Var2.f5259i0;
                    if (i2 > v4VarArr.length) {
                        z4Var2.f5259i0 = (C1236v4[]) Arrays.copyOf(v4VarArr, v4VarArr.length * 2);
                    }
                    C1236v4[] v4VarArr2 = z4Var2.f5259i0;
                    int i3 = z4Var2.f5260j0;
                    v4VarArr2[i3] = d;
                    z4Var2.f5260j0 = i3 + 1;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo3044f() {
        if (this.f2437e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0084a) {
                ((ConstraintLayout.C0084a) layoutParams).f567k0 = this.f2437e;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2434b, this.f2435c);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f2435c = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f2435c + 1;
        int[] iArr = this.f2434b;
        if (i2 > iArr.length) {
            this.f2434b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2434b;
        int i3 = this.f2435c;
        iArr2[i3] = i;
        this.f2435c = i3 + 1;
    }
}
