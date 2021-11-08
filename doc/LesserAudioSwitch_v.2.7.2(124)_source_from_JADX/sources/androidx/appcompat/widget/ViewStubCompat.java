package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f500b = 0;

    /* renamed from: c */
    public int f501c;

    /* renamed from: d */
    public WeakReference<View> f502d;

    /* renamed from: e */
    public LayoutInflater f503e;

    /* renamed from: f */
    public C0083a f504f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0083a {
        /* renamed from: a */
        void mo612a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2046B, 0, 0);
        this.f501c = obtainStyledAttributes.getResourceId(2, -1);
        this.f500b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo600a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f500b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f503e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f500b, viewGroup, false);
            int i = this.f501c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f502d = new WeakReference<>(inflate);
            C0083a aVar = this.f504f;
            if (aVar != null) {
                aVar.mo612a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f501c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f503e;
    }

    public int getLayoutResource() {
        return this.f500b;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f501c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f503e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f500b = i;
    }

    public void setOnInflateListener(C0083a aVar) {
        this.f504f = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f502d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo600a();
        }
    }
}
