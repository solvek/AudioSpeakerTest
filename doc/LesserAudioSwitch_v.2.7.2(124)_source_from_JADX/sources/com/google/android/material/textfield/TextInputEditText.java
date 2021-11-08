package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Locale;

public class TextInputEditText extends C1288w1 {

    /* renamed from: e */
    public final Rect f1623e = new Rect();

    /* renamed from: f */
    public boolean f1624f;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(C1382xm.m3838a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, R.attr.editTextStyle);
        int[] iArr = C0781lh.f3170v;
        C1315wk.m3651a(context, attributeSet, R.attr.editTextStyle, 2131755634);
        C1315wk.m3652b(context, attributeSet, iArr, R.attr.editTextStyle, 2131755634, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2131755634);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f1624f && rect != null) {
            textInputLayout.getFocusedRect(this.f1623e);
            rect.bottom = this.f1623e.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f1624f || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f1623e, point);
            rect.bottom = this.f1623e.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f1627B) ? super.getHint() : textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f1627B && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            CharSequence helperText = textInputLayout.getHelperText();
            CharSequence error = textInputLayout.getError();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            String str = "";
            String charSequence = z2 ? hint.toString() : str;
            StringBuilder c = C0279ch.m1106c(charSequence);
            c.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : str);
            StringBuilder c2 = C0279ch.m1106c(c.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = str;
            }
            c2.append(helperText);
            String sb = c2.toString();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                if (!TextUtils.isEmpty(sb)) {
                    str = C0279ch.m1120q(", ", sb);
                }
                sb2.append(str);
                str = sb2.toString();
            } else if (!TextUtils.isEmpty(sb)) {
                str = sb;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f1624f) {
            this.f1623e.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f1623e, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f1624f = z;
    }
}
