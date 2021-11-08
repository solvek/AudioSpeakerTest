package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: m1 */
public abstract class C0800m1 extends ViewGroup {

    /* renamed from: b */
    public final C0801a f3201b;

    /* renamed from: c */
    public final Context f3202c;

    /* renamed from: d */
    public ActionMenuView f3203d;

    /* renamed from: e */
    public C0904o1 f3204e;

    /* renamed from: f */
    public int f3205f;

    /* renamed from: g */
    public C1049r8 f3206g;

    /* renamed from: h */
    public boolean f3207h;

    /* renamed from: i */
    public boolean f3208i;

    /* renamed from: m1$a */
    public class C0801a implements C1102s8 {

        /* renamed from: a */
        public boolean f3209a = false;

        /* renamed from: b */
        public int f3210b;

        public C0801a() {
        }

        /* renamed from: a */
        public void mo2606a(View view) {
            if (!this.f3209a) {
                C0800m1 m1Var = C0800m1.this;
                m1Var.f3206g = null;
                C0800m1.super.setVisibility(this.f3210b);
            }
        }

        /* renamed from: b */
        public void mo3388b(View view) {
            C0800m1.super.setVisibility(0);
            this.f3209a = false;
        }

        /* renamed from: c */
        public void mo3389c(View view) {
            this.f3209a = true;
        }
    }

    public C0800m1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0800m1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3201b = new C0801a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3202c = context;
        } else {
            this.f3202c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: c */
    public int mo3651c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: d */
    public int mo3652d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public C1049r8 mo3653e(int i, long j) {
        C1049r8 r8Var = this.f3206g;
        if (r8Var != null) {
            r8Var.mo4212b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1049r8 a = C0813m8.m2467a(this);
            a.mo4211a(1.0f);
            a.mo4213c(j);
            C0801a aVar = this.f3201b;
            C0800m1.this.f3206g = a;
            aVar.f3210b = i;
            a.mo4214d(aVar);
            return a;
        }
        C1049r8 a2 = C0813m8.m2467a(this);
        a2.mo4211a(0.0f);
        a2.mo4213c(j);
        C0801a aVar2 = this.f3201b;
        C0800m1.this.f3206g = a2;
        aVar2.f3210b = i;
        a2.mo4214d(aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f3206g != null ? this.f3201b.f3210b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3205f;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0440f.f2047a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0904o1 o1Var = this.f3204e;
        if (o1Var != null) {
            Configuration configuration2 = o1Var.f4531c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            o1Var.f3451q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C1435z0 z0Var = o1Var.f4532d;
            if (z0Var != null) {
                z0Var.mo5251q(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3208i = false;
        }
        if (!this.f3208i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3208i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3208i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3207h = false;
        }
        if (!this.f3207h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3207h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3207h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1049r8 r8Var = this.f3206g;
            if (r8Var != null) {
                r8Var.mo4212b();
            }
            super.setVisibility(i);
        }
    }
}
