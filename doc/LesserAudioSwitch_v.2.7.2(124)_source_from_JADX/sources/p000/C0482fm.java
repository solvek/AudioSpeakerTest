package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: fm */
public class C0482fm extends C1070rm {

    /* renamed from: d */
    public final TextWatcher f2157d = new C0483a();

    /* renamed from: e */
    public final View.OnFocusChangeListener f2158e = new C0484b();

    /* renamed from: f */
    public final TextInputLayout.C0330f f2159f = new C0485c();

    /* renamed from: g */
    public final TextInputLayout.C0331g f2160g = new C0486d();

    /* renamed from: h */
    public AnimatorSet f2161h;

    /* renamed from: i */
    public ValueAnimator f2162i;

    /* renamed from: fm$a */
    public class C0483a implements TextWatcher {
        public C0483a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C0482fm.this.f4024a.getSuffixText() == null) {
                C0482fm.this.mo2799e(editable.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: fm$b */
    public class C0484b implements View.OnFocusChangeListener {
        public C0484b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C0482fm fmVar = C0482fm.this;
            if (!z3 || !z) {
                z2 = false;
            }
            fmVar.mo2799e(z2);
        }
    }

    /* renamed from: fm$c */
    public class C0485c implements TextInputLayout.C0330f {
        public C0485c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if ((r0.getText().length() > 0) != false) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2505a(com.google.android.material.textfield.TextInputLayout r5) {
            /*
                r4 = this;
                android.widget.EditText r0 = r5.getEditText()
                boolean r1 = r0.hasFocus()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.text.Editable r1 = r0.getText()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0018
                r1 = 1
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                if (r1 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r2 = 0
            L_0x001d:
                r5.setEndIconVisible(r2)
                r5.setEndIconCheckable(r3)
                fm r5 = p000.C0482fm.this
                android.view.View$OnFocusChangeListener r5 = r5.f2158e
                r0.setOnFocusChangeListener(r5)
                fm r5 = p000.C0482fm.this
                android.text.TextWatcher r5 = r5.f2157d
                r0.removeTextChangedListener(r5)
                fm r5 = p000.C0482fm.this
                android.text.TextWatcher r5 = r5.f2157d
                r0.addTextChangedListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0482fm.C0485c.mo2505a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* renamed from: fm$d */
    public class C0486d implements TextInputLayout.C0331g {
        public C0486d() {
        }

        /* renamed from: a */
        public void mo2506a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(C0482fm.this.f2157d);
                if (editText.getOnFocusChangeListener() == C0482fm.this.f2158e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: fm$e */
    public class C0487e implements View.OnClickListener {
        public C0487e() {
        }

        public void onClick(View view) {
            Editable text = C0482fm.this.f4024a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    public C0482fm(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo2797a() {
        this.f4024a.setEndIconDrawable(C0399e0.m1530b(this.f4025b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f4024a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f4024a.setEndIconOnClickListener(new C0487e());
        this.f4024a.mo2340a(this.f2159f);
        TextInputLayout textInputLayout2 = this.f4024a;
        textInputLayout2.f1669g0.add(this.f2160g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C0831mh.f3289d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C0689jm(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = C0831mh.f3286a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new C0644im(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2161h = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f2161h.addListener(new C0542gm(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new C0644im(this));
        this.f2162i = ofFloat3;
        ofFloat3.addListener(new C0582hm(this));
    }

    /* renamed from: c */
    public void mo2798c(boolean z) {
        if (this.f4024a.getSuffixText() != null) {
            mo2799e(z);
        }
    }

    /* renamed from: e */
    public final void mo2799e(boolean z) {
        boolean z2 = this.f4024a.mo2403l() == z;
        if (z) {
            this.f2162i.cancel();
            this.f2161h.start();
            if (z2) {
                this.f2161h.end();
                return;
            }
            return;
        }
        this.f2161h.cancel();
        this.f2162i.start();
        if (z2) {
            this.f2162i.end();
        }
    }
}
