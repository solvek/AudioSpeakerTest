package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: t1 */
public class C1139t1 extends CheckedTextView {

    /* renamed from: c */
    public static final int[] f4346c = {16843016};

    /* renamed from: b */
    public final C0598i2 f4347b;

    public C1139t1(Context context, AttributeSet attributeSet) {
        super(C0404e3.m1540a(context), attributeSet, 16843720);
        C0253c3.m1047a(this, getContext());
        C0598i2 i2Var = new C0598i2(this);
        this.f4347b = i2Var;
        i2Var.mo3115e(attributeSet, 16843720);
        i2Var.mo3113b();
        C0555h3 q = C0555h3.m1825q(getContext(), attributeSet, f4346c, 16843720, 0);
        setCheckMarkDrawable(q.mo3027g(0));
        q.f2425b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0598i2 i2Var = this.f4347b;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0398e.m1524h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0399e0.m1530b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0598i2 i2Var = this.f4347b;
        if (i2Var != null) {
            i2Var.mo3116f(context, i);
        }
    }
}
