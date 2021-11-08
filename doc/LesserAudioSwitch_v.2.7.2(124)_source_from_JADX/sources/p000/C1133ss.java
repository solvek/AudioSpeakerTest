package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: ss */
public class C1133ss {

    /* renamed from: a */
    public AlertDialog f4324a = null;

    /* renamed from: b */
    public ViewGroup f4325b = null;

    /* renamed from: ss$a */
    public class C1134a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ AnimatorSet f4326a;

        public C1134a(C1133ss ssVar, AnimatorSet animatorSet) {
            this.f4326a = animatorSet;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f4326a.start();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C1133ss(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.android_r_warning_dialog_layout, (ViewGroup) null, false);
        this.f4325b = viewGroup;
        builder.setView(viewGroup);
        View findViewById = this.f4325b.findViewById(R.id.volume_panel_touch_indicator);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(context, R.animator.touch_pulse);
        animatorSet.setTarget(findViewById);
        animatorSet.addListener(new C1134a(this, animatorSet));
        animatorSet.start();
        builder.setTitle(R.string.warning_android_r_dialog_title);
        builder.setPositiveButton(R.string.button_understood, C0434eq.f2040b);
        this.f4324a = builder.create();
    }

    /* renamed from: a */
    public void mo4555a() {
        ViewParent parent;
        ViewParent parent2;
        this.f4324a.show();
        try {
            ViewGroup viewGroup = this.f4325b;
            if (viewGroup != null && (parent = viewGroup.getParent()) != null && (parent2 = parent.getParent()) != null) {
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams.weight = 1.0f;
                viewGroup2.setLayoutParams(layoutParams);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
