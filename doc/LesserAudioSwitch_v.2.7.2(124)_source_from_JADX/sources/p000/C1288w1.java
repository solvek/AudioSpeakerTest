package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: w1 */
public class C1288w1 extends EditText implements C0761l8 {

    /* renamed from: b */
    public final C0998q1 f4890b;

    /* renamed from: c */
    public final C0598i2 f4891c;

    /* renamed from: d */
    public final C0554h2 f4892d;

    public C1288w1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public C1288w1(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C0998q1 q1Var = new C0998q1(this);
        this.f4890b = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C0598i2 i2Var = new C0598i2(this);
        this.f4891c = i2Var;
        i2Var.mo3115e(attributeSet, i);
        i2Var.mo3113b();
        this.f4892d = new C0554h2(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C0598i2 i2Var = this.f4891c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f4892d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            h2 r0 = r2.f4892d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo3020a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1288w1.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0398e.m1524h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f4890b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0598i2 i2Var = this.f4891c;
        if (i2Var != null) {
            i2Var.mo3116f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0554h2 h2Var;
        if (Build.VERSION.SDK_INT >= 28 || (h2Var = this.f4892d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            h2Var.f2423b = textClassifier;
        }
    }
}
