package p000;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import p000.C0614ia;
import p000.C1009qa;

/* renamed from: t9 */
public class C1157t9 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: T */
    public Handler f4395T;

    /* renamed from: U */
    public Runnable f4396U = new C1158a();

    /* renamed from: V */
    public DialogInterface.OnCancelListener f4397V = new C1159b();

    /* renamed from: W */
    public DialogInterface.OnDismissListener f4398W = new C1160c();

    /* renamed from: X */
    public int f4399X = 0;

    /* renamed from: Y */
    public int f4400Y = 0;

    /* renamed from: Z */
    public boolean f4401Z = true;

    /* renamed from: a0 */
    public boolean f4402a0 = true;

    /* renamed from: b0 */
    public int f4403b0 = -1;

    /* renamed from: c0 */
    public boolean f4404c0;

    /* renamed from: d0 */
    public Dialog f4405d0;

    /* renamed from: e0 */
    public boolean f4406e0;

    /* renamed from: f0 */
    public boolean f4407f0;

    /* renamed from: g0 */
    public boolean f4408g0;

    /* renamed from: t9$a */
    public class C1158a implements Runnable {
        public C1158a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            C1157t9 t9Var = C1157t9.this;
            t9Var.f4398W.onDismiss(t9Var.f4405d0);
        }
    }

    /* renamed from: t9$b */
    public class C1159b implements DialogInterface.OnCancelListener {
        public C1159b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            C1157t9 t9Var = C1157t9.this;
            Dialog dialog = t9Var.f4405d0;
            if (dialog != null) {
                t9Var.onCancel(dialog);
            }
        }
    }

    /* renamed from: t9$c */
    public class C1160c implements DialogInterface.OnDismissListener {
        public C1160c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            C1157t9 t9Var = C1157t9.this;
            Dialog dialog = t9Var.f4405d0;
            if (dialog != null) {
                t9Var.onDismiss(dialog);
            }
        }
    }

    /* renamed from: A0 */
    public void mo4634A0(C0614ia iaVar, String str) {
        this.f4407f0 = false;
        this.f4408g0 = true;
        C1053r9 r9Var = new C1053r9(iaVar);
        r9Var.mo4069d(0, this, str, 1);
        r9Var.mo4223g();
    }

    /* renamed from: F */
    public void mo828F(Bundle bundle) {
        Bundle bundle2;
        this.f678C = true;
        if (this.f4402a0) {
            View view = this.f680E;
            if (this.f4405d0 != null) {
                if (view != null) {
                    if (view.getParent() == null) {
                        this.f4405d0.setContentView(view);
                    } else {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                }
                C1250v9 i = mo862i();
                if (i != null) {
                    this.f4405d0.setOwnerActivity(i);
                }
                this.f4405d0.setCancelable(this.f4401Z);
                this.f4405d0.setOnCancelListener(this.f4397V);
                this.f4405d0.setOnDismissListener(this.f4398W);
                if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                    this.f4405d0.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: I */
    public void mo831I(Context context) {
        super.mo831I(context);
        if (!this.f4408g0) {
            this.f4407f0 = false;
        }
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        super.mo834L(bundle);
        this.f4395T = new Handler();
        this.f4402a0 = this.f715w == 0;
        if (bundle != null) {
            this.f4399X = bundle.getInt("android:style", 0);
            this.f4400Y = bundle.getInt("android:theme", 0);
            this.f4401Z = bundle.getBoolean("android:cancelable", true);
            this.f4402a0 = bundle.getBoolean("android:showsDialog", this.f4402a0);
            this.f4403b0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: P */
    public void mo838P() {
        this.f678C = true;
        Dialog dialog = this.f4405d0;
        if (dialog != null) {
            this.f4406e0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f4405d0.dismiss();
            if (!this.f4407f0) {
                onDismiss(this.f4405d0);
            }
            this.f4405d0 = null;
        }
    }

    /* renamed from: Q */
    public void mo839Q() {
        this.f678C = true;
        if (!this.f4408g0 && !this.f4407f0) {
            this.f4407f0 = true;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: R */
    public LayoutInflater mo840R(Bundle bundle) {
        LayoutInflater q = mo881q();
        if (!this.f4402a0 || this.f4404c0) {
            return q;
        }
        try {
            this.f4404c0 = true;
            Dialog x0 = mo1615x0(bundle);
            this.f4405d0 = x0;
            mo4637z0(x0, this.f4399X);
            this.f4404c0 = false;
            return q.cloneInContext(mo4636y0().getContext());
        } catch (Throwable th) {
            this.f4404c0 = false;
            throw th;
        }
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        Dialog dialog = this.f4405d0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.f4399X;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4400Y;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4401Z;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4402a0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4403b0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: c0 */
    public void mo851c0() {
        this.f678C = true;
        Dialog dialog = this.f4405d0;
        if (dialog != null) {
            this.f4406e0 = false;
            dialog.show();
        }
    }

    /* renamed from: d0 */
    public void mo852d0() {
        this.f678C = true;
        Dialog dialog = this.f4405d0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4406e0) {
            mo4635w0(true, true);
        }
    }

    /* renamed from: w0 */
    public final void mo4635w0(boolean z, boolean z2) {
        if (!this.f4407f0) {
            this.f4407f0 = true;
            this.f4408g0 = false;
            Dialog dialog = this.f4405d0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f4405d0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f4395T.getLooper()) {
                        onDismiss(this.f4405d0);
                    } else {
                        this.f4395T.post(this.f4396U);
                    }
                }
            }
            this.f4406e0 = true;
            if (this.f4403b0 >= 0) {
                C0614ia s = mo885s();
                int i = this.f4403b0;
                if (i >= 0) {
                    s.mo3253z(new C0614ia.C0620f((String) null, i, 1), false);
                    this.f4403b0 = -1;
                    return;
                }
                throw new IllegalArgumentException("Bad id: " + i);
            }
            C1053r9 r9Var = new C1053r9(mo885s());
            C0614ia iaVar = this.f710r;
            if (iaVar == null || iaVar == r9Var.f3941q) {
                r9Var.mo4067b(new C1009qa.C1010a(3, this));
                if (z) {
                    r9Var.mo4224h(true);
                } else {
                    r9Var.mo4223g();
                }
            } else {
                StringBuilder c = C0279ch.m1106c("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                c.append(toString());
                c.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(c.toString());
            }
        }
    }

    /* renamed from: x0 */
    public Dialog mo1615x0(Bundle bundle) {
        return new Dialog(mo869l0(), this.f4400Y);
    }

    /* renamed from: y0 */
    public final Dialog mo4636y0() {
        Dialog dialog = this.f4405d0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: z0 */
    public void mo4637z0(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }
}
