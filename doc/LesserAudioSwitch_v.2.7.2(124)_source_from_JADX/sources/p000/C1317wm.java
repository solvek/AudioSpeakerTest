package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: wm */
public class C1317wm extends C1070rm {

    /* renamed from: d */
    public final TextWatcher f4967d = new C1318a();

    /* renamed from: e */
    public final TextInputLayout.C0330f f4968e = new C1319b();

    /* renamed from: f */
    public final TextInputLayout.C0331g f4969f = new C1320c();

    /* renamed from: wm$a */
    public class C1318a implements TextWatcher {
        public C1318a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1317wm wmVar = C1317wm.this;
            wmVar.f4026c.setChecked(!C1317wm.m3656e(wmVar));
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: wm$b */
    public class C1319b implements TextInputLayout.C0330f {
        public C1319b() {
        }

        /* renamed from: a */
        public void mo2505a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C1317wm wmVar = C1317wm.this;
            wmVar.f4026c.setChecked(!C1317wm.m3656e(wmVar));
            editText.removeTextChangedListener(C1317wm.this.f4967d);
            editText.addTextChangedListener(C1317wm.this.f4967d);
        }
    }

    /* renamed from: wm$c */
    public class C1320c implements TextInputLayout.C0331g {
        public C1320c() {
        }

        /* renamed from: a */
        public void mo2506a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(C1317wm.this.f4967d);
            }
        }
    }

    /* renamed from: wm$d */
    public class C1321d implements View.OnClickListener {
        public C1321d() {
        }

        public void onClick(View view) {
            EditText editText = C1317wm.this.f4024a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C1317wm.m3656e(C1317wm.this) ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    public C1317wm(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: e */
    public static boolean m3656e(C1317wm wmVar) {
        EditText editText = wmVar.f4024a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: a */
    public void mo2797a() {
        this.f4024a.setEndIconDrawable(C0399e0.m1530b(this.f4025b, R.drawable.design_password_eye));
        TextInputLayout textInputLayout = this.f4024a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        this.f4024a.setEndIconOnClickListener(new C1321d());
        this.f4024a.mo2340a(this.f4968e);
        this.f4024a.f1669g0.add(this.f4969f);
        EditText editText = this.f4024a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
