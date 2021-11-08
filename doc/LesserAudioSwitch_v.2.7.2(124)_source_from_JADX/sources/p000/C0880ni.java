package p000;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: ni */
public class C0880ni extends C1392y {

    /* renamed from: d */
    public BottomSheetBehavior<FrameLayout> f3386d;

    /* renamed from: e */
    public FrameLayout f3387e;

    /* renamed from: f */
    public boolean f3388f;

    /* renamed from: g */
    public boolean f3389g;

    /* renamed from: h */
    public boolean f3390h;

    /* renamed from: i */
    public BottomSheetBehavior.C0302d f3391i;

    /* renamed from: ni$a */
    public class C0881a implements View.OnClickListener {
        public C0881a() {
        }

        public void onClick(View view) {
            C0880ni niVar = C0880ni.this;
            if (niVar.f3388f && niVar.isShowing()) {
                C0880ni niVar2 = C0880ni.this;
                if (!niVar2.f3390h) {
                    TypedArray obtainStyledAttributes = niVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    niVar2.f3389g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    niVar2.f3390h = true;
                }
                if (niVar2.f3389g) {
                    C0880ni.this.cancel();
                }
            }
        }
    }

    /* renamed from: ni$b */
    public class C0882b extends C1444z7 {
        public C0882b() {
        }

        /* renamed from: d */
        public void mo817d(View view, C1347x8 x8Var) {
            boolean z;
            this.f5273a.onInitializeAccessibilityNodeInfo(view, x8Var.f5038a);
            if (C0880ni.this.f3388f) {
                x8Var.f5038a.addAction(1048576);
                z = true;
                if (Build.VERSION.SDK_INT < 19) {
                    return;
                }
            } else {
                z = false;
                if (Build.VERSION.SDK_INT < 19) {
                    return;
                }
            }
            x8Var.f5038a.setDismissable(z);
        }

        /* renamed from: g */
        public boolean mo818g(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C0880ni niVar = C0880ni.this;
                if (niVar.f3388f) {
                    niVar.cancel();
                    return true;
                }
            }
            return super.mo818g(view, i, bundle);
        }
    }

    /* renamed from: ni$c */
    public class C0883c implements View.OnTouchListener {
        public C0883c(C0880ni niVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: ni$d */
    public class C0884d extends BottomSheetBehavior.C0302d {
        public C0884d() {
        }

        /* renamed from: a */
        public void mo1922a(View view, float f) {
        }

        /* renamed from: b */
        public void mo1923b(View view, int i) {
            if (i == 5) {
                C0880ni.this.cancel();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0880ni(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130903128(0x7f030058, float:1.7413065E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2131755450(0x7f1001ba, float:1.914178E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.f3388f = r0
            r3.f3389g = r0
            ni$d r4 = new ni$d
            r4.<init>()
            r3.f3391i = r4
            r3.mo5116d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0880ni.<init>(android.content.Context, int):void");
    }

    public void cancel() {
        if (this.f3386d == null) {
            mo3786e();
        }
        super.cancel();
    }

    /* renamed from: e */
    public final FrameLayout mo3786e() {
        if (this.f3387e == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f3387e = frameLayout;
            BottomSheetBehavior<FrameLayout> H = BottomSheetBehavior.m1200H((FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet));
            this.f3386d = H;
            BottomSheetBehavior.C0302d dVar = this.f3391i;
            if (!H.f1484G.contains(dVar)) {
                H.f1484G.add(dVar);
            }
            this.f3386d.mo1907J(this.f3388f);
        }
        return this.f3387e;
    }

    /* renamed from: h */
    public final View mo3787h(int i, View view, ViewGroup.LayoutParams layoutParams) {
        mo3786e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3387e.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f3387e.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new C0881a());
        C0813m8.m2457F(frameLayout, new C0882b());
        frameLayout.setOnTouchListener(new C0883c(this));
        return this.f3387e;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3386d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f1514x == 5) {
            bottomSheetBehavior.mo1909L(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f3388f != z) {
            this.f3388f = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f3386d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo1907J(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f3388f) {
            this.f3388f = true;
        }
        this.f3389g = z;
        this.f3390h = true;
    }

    public void setContentView(int i) {
        super.setContentView(mo3787h(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(mo3787h(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo3787h(0, view, layoutParams));
    }
}
