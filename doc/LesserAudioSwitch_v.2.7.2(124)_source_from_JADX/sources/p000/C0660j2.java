package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000.C1047r7;

/* renamed from: j2 */
public class C0660j2 extends TextView implements C0761l8, C0458f9, C0214b9 {

    /* renamed from: b */
    public final C0998q1 f2798b;

    /* renamed from: c */
    public final C0598i2 f2799c;

    /* renamed from: d */
    public final C0554h2 f2800d;

    /* renamed from: e */
    public Future<C1047r7> f2801e;

    public C0660j2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0660j2(Context context, AttributeSet attributeSet, int i) {
        super(C0404e3.m1540a(context), attributeSet, i);
        C0253c3.m1047a(this, getContext());
        C0998q1 q1Var = new C0998q1(this);
        this.f2798b = q1Var;
        q1Var.mo4058d(attributeSet, i);
        C0598i2 i2Var = new C0598i2(this);
        this.f2799c = i2Var;
        i2Var.mo3115e(attributeSet, i);
        i2Var.mo3113b();
        this.f2800d = new C0554h2(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            q1Var.mo4055a();
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2955e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeMinTextSize();
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2954d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeStepGranularity();
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            return Math.round(i2Var.f2520i.f2953c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0598i2 i2Var = this.f2799c;
        return i2Var != null ? i2Var.f2520i.f2956f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0214b9.f1256a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            return i2Var.f2520i.f2951a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            return q1Var.mo4056b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            return q1Var.mo4057c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0452f3 f3Var = this.f2799c.f2519h;
        if (f3Var != null) {
            return f3Var.f2089a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0452f3 f3Var = this.f2799c.f2519h;
        if (f3Var != null) {
            return f3Var.f2090b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<C1047r7> future = this.f2801e;
        if (future != null) {
            try {
                this.f2801e = null;
                C1344x5.m3746a0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f2800d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            h2 r0 = r2.f2800d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo3020a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0660j2.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C1047r7.C1048a getTextMetricsParamsCompat() {
        return C1344x5.m3723E(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0398e.m1524h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null && !C0214b9.f1256a) {
            i2Var.f2520i.mo3495b();
        }
    }

    public void onMeasure(int i, int i2) {
        Future<C1047r7> future = this.f2801e;
        if (future != null) {
            try {
                this.f2801e = null;
                C1344x5.m3746a0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null && !C0214b9.f1256a && i2Var.mo3114d()) {
            this.f2799c.f2520i.mo3495b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3117g(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3118h(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0214b9.f1256a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3119i(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            q1Var.mo4059e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            q1Var.mo4060f(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0399e0.m1530b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0399e0.m1530b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0399e0.m1530b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0399e0.m1530b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0399e0.m1530b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0399e0.m1530b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0399e0.m1530b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0399e0.m1530b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1344x5.m3766k0(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1344x5.m3738T(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1344x5.m3741W(this, i);
        }
    }

    public void setLineHeight(int i) {
        C1344x5.m3743Y(this, i);
    }

    public void setPrecomputedText(C1047r7 r7Var) {
        C1344x5.m3746a0(this, r7Var);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            q1Var.mo4062h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0998q1 q1Var = this.f2798b;
        if (q1Var != null) {
            q1Var.mo4063i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2799c.mo3120j(colorStateList);
        this.f2799c.mo3113b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2799c.mo3121k(mode);
        this.f2799c.mo3113b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3116f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0554h2 h2Var;
        if (Build.VERSION.SDK_INT >= 28 || (h2Var = this.f2800d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            h2Var.f2423b = textClassifier;
        }
    }

    public void setTextFuture(Future<C1047r7> future) {
        this.f2801e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1047r7.C1048a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = aVar.f3930b;
            int i2 = 1;
            if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i2 = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i2 = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i2 = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i2 = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i2 = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i2 = 7;
                }
            }
            setTextDirection(i2);
        }
        if (i < 23) {
            float textScaleX = aVar.f3929a.getTextScaleX();
            getPaint().set(aVar.f3929a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f3929a);
        setBreakStrategy(aVar.f3931c);
        setHyphenationFrequency(aVar.f3932d);
    }

    public void setTextSize(int i, float f) {
        boolean z = C0214b9.f1256a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null && !z && !i2Var.mo3114d()) {
            i2Var.f2520i.mo3498g(i, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0 != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTypeface(android.graphics.Typeface r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x004b
            if (r10 <= 0) goto L_0x004b
            android.content.Context r1 = r8.getContext()
            w6 r2 = p000.C1005q6.f3777a
            if (r1 == 0) goto L_0x0043
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L_0x003e
            w6 r2 = p000.C1005q6.f3777a
            r2.getClass()
            long r3 = p000.C1295w6.m3609g(r9)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0024
            r3 = r0
            goto L_0x0030
        L_0x0024:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, h6> r5 = r2.f4928a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            h6 r3 = (p000.C0558h6) r3
        L_0x0030:
            if (r3 != 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.Typeface r0 = r2.mo4193a(r1, r3, r0, r10)
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            goto L_0x004b
        L_0x003e:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r9, r10)
            goto L_0x004b
        L_0x0043:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Context cannot be null"
            r9.<init>(r10)
            throw r9
        L_0x004b:
            if (r0 == 0) goto L_0x004e
            r9 = r0
        L_0x004e:
            super.setTypeface(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0660j2.setTypeface(android.graphics.Typeface, int):void");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0598i2 i2Var = this.f2799c;
        if (i2Var != null) {
            i2Var.mo3113b();
        }
    }
}
