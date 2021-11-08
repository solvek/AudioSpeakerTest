package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: p1 */
public class C0950p1 extends AutoCompleteTextView implements C0761l8 {

    /* renamed from: d */
    public static final int[] f3527d = {16843126};

    /* renamed from: b */
    public final C0998q1 f3528b;

    /* renamed from: c */
    public final C0598i2 f3529c;

    public C0950p1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public C0950p1(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C0555h3 q = C0555h3.m1825q(getContext(), attributeSet, f3527d, i, 0);
        if (q.mo3035o(0)) {
            setDropDownBackgroundDrawable(q.mo3027g(0));
        }
        q.f2425b.recycle();
        C0998q1 q1Var = new C0998q1(this);
        this.f3528b = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C0598i2 i2Var = new C0598i2(this);
        this.f3529c = i2Var;
        i2Var.mo3115e(attributeSet, i);
        i2Var.mo3113b();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C0598i2 i2Var = this.f3529c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0398e.m1524h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0399e0.m1530b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f3528b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0598i2 i2Var = this.f3529c;
        if (i2Var != null) {
            i2Var.mo3116f(context, i);
        }
    }
}
