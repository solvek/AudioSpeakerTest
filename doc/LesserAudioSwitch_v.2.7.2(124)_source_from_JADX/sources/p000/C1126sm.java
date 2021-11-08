package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sm */
public final class C1126sm {

    /* renamed from: a */
    public final Context f4273a;

    /* renamed from: b */
    public final TextInputLayout f4274b;

    /* renamed from: c */
    public LinearLayout f4275c;

    /* renamed from: d */
    public int f4276d;

    /* renamed from: e */
    public FrameLayout f4277e;

    /* renamed from: f */
    public int f4278f;

    /* renamed from: g */
    public Animator f4279g;

    /* renamed from: h */
    public final float f4280h;

    /* renamed from: i */
    public int f4281i;

    /* renamed from: j */
    public int f4282j;

    /* renamed from: k */
    public CharSequence f4283k;

    /* renamed from: l */
    public boolean f4284l;

    /* renamed from: m */
    public TextView f4285m;

    /* renamed from: n */
    public CharSequence f4286n;

    /* renamed from: o */
    public int f4287o;

    /* renamed from: p */
    public ColorStateList f4288p;

    /* renamed from: q */
    public CharSequence f4289q;

    /* renamed from: r */
    public boolean f4290r;

    /* renamed from: s */
    public TextView f4291s;

    /* renamed from: t */
    public int f4292t;

    /* renamed from: u */
    public ColorStateList f4293u;

    /* renamed from: v */
    public Typeface f4294v;

    /* renamed from: sm$a */
    public class C1127a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f4295a;

        /* renamed from: b */
        public final /* synthetic */ TextView f4296b;

        /* renamed from: c */
        public final /* synthetic */ int f4297c;

        /* renamed from: d */
        public final /* synthetic */ TextView f4298d;

        public C1127a(int i, TextView textView, int i2, TextView textView2) {
            this.f4295a = i;
            this.f4296b = textView;
            this.f4297c = i2;
            this.f4298d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            C1126sm smVar = C1126sm.this;
            smVar.f4281i = this.f4295a;
            smVar.f4279g = null;
            TextView textView2 = this.f4296b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f4297c == 1 && (textView = C1126sm.this.f4285m) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f4298d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f4298d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4298d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C1126sm(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4273a = context;
        this.f4274b = textInputLayout;
        this.f4280h = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public void mo4537a(TextView textView, int i) {
        if (this.f4275c == null && this.f4277e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4273a);
            this.f4275c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4274b.addView(this.f4275c, -1, -2);
            this.f4277e = new FrameLayout(this.f4273a);
            this.f4275c.addView(this.f4277e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4274b.getEditText() != null) {
                mo4538b();
            }
        }
        if (i == 0 || i == 1) {
            this.f4277e.setVisibility(0);
            this.f4277e.addView(textView);
            this.f4278f++;
        } else {
            this.f4275c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4275c.setVisibility(0);
        this.f4276d++;
    }

    /* renamed from: b */
    public void mo4538b() {
        if ((this.f4275c == null || this.f4274b.getEditText() == null) ? false : true) {
            C0813m8.m2464M(this.f4275c, C0813m8.m2482p(this.f4274b.getEditText()), 0, C0813m8.m2481o(this.f4274b.getEditText()), 0);
        }
    }

    /* renamed from: c */
    public void mo4539c() {
        Animator animator = this.f4279g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void mo4540d(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i3 == i ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C0831mh.f3286a);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f4280h, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C0831mh.f3289d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo4541e() {
        return this.f4282j == 1 && this.f4285m != null && !TextUtils.isEmpty(this.f4283k);
    }

    /* renamed from: f */
    public final TextView mo4542f(int i) {
        if (i == 1) {
            return this.f4285m;
        }
        if (i != 2) {
            return null;
        }
        return this.f4291s;
    }

    /* renamed from: g */
    public int mo4543g() {
        TextView textView = this.f4285m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public void mo4544h() {
        this.f4283k = null;
        mo4539c();
        if (this.f4281i == 1) {
            this.f4282j = (!this.f4290r || TextUtils.isEmpty(this.f4289q)) ? 0 : 2;
        }
        mo4547k(this.f4281i, this.f4282j, mo4546j(this.f4285m, (CharSequence) null));
    }

    /* renamed from: i */
    public void mo4545i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4275c;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.f4277e) == null) {
                linearLayout.removeView(textView);
            } else {
                int i2 = this.f4278f - 1;
                this.f4278f = i2;
                if (i2 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.f4277e.removeView(textView);
            }
            int i3 = this.f4276d - 1;
            this.f4276d = i3;
            LinearLayout linearLayout2 = this.f4275c;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo4546j(TextView textView, CharSequence charSequence) {
        return C0813m8.m2486t(this.f4274b) && this.f4274b.isEnabled() && (this.f4282j != this.f4281i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: k */
    public final void mo4547k(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f4279g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i5 = i;
                int i6 = i2;
                mo4540d(arrayList2, this.f4290r, this.f4291s, 2, i5, i6);
                mo4540d(arrayList2, this.f4284l, this.f4285m, 1, i5, i6);
                C0728kh.m2310z(animatorSet, arrayList);
                animatorSet.addListener(new C1127a(i2, mo4542f(i), i, mo4542f(i4)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (f2 = mo4542f(i4)) == null)) {
                    f2.setVisibility(0);
                    f2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (f = mo4542f(i)) == null)) {
                    f.setVisibility(4);
                    if (i3 == 1) {
                        f.setText((CharSequence) null);
                    }
                }
                this.f4281i = i4;
            }
            this.f4274b.mo2495w();
            this.f4274b.mo2498z(z2, false);
            this.f4274b.mo2339G();
        }
    }
}
