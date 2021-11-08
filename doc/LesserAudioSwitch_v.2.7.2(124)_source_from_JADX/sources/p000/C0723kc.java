package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import p000.C0901o;

/* renamed from: kc */
public abstract class C0723kc extends C1157t9 implements DialogInterface.OnClickListener {

    /* renamed from: h0 */
    public DialogPreference f2989h0;

    /* renamed from: i0 */
    public CharSequence f2990i0;

    /* renamed from: j0 */
    public CharSequence f2991j0;

    /* renamed from: k0 */
    public CharSequence f2992k0;

    /* renamed from: l0 */
    public CharSequence f2993l0;

    /* renamed from: m0 */
    public int f2994m0;

    /* renamed from: n0 */
    public BitmapDrawable f2995n0;

    /* renamed from: o0 */
    public int f2996o0;

    /* renamed from: B0 */
    public DialogPreference mo3547B0() {
        if (this.f2989h0 == null) {
            this.f2989h0 = (DialogPreference) ((DialogPreference.C0109a) mo823A()).mo912b(this.f698f.getString("key"));
        }
        return this.f2989h0;
    }

    /* renamed from: C0 */
    public boolean mo2939C0() {
        return false;
    }

    /* renamed from: D0 */
    public void mo2940D0(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f2993l0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: E0 */
    public View mo3548E0() {
        int i = this.f2994m0;
        if (i == 0) {
            return null;
        }
        LayoutInflater layoutInflater = this.f687L;
        if (layoutInflater == null) {
            layoutInflater = mo860h0((Bundle) null);
        }
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    /* renamed from: F0 */
    public abstract void mo2941F0(boolean z);

    /* renamed from: G0 */
    public void mo3260G0(C0901o.C0902a aVar) {
    }

    /* renamed from: L */
    public void mo834L(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.mo834L(bundle);
        Fragment A = mo823A();
        if (A instanceof DialogPreference.C0109a) {
            DialogPreference.C0109a aVar = (DialogPreference.C0109a) A;
            String string = this.f698f.getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.mo912b(string);
                this.f2989h0 = dialogPreference;
                this.f2990i0 = dialogPreference.f756N;
                this.f2991j0 = dialogPreference.f759Q;
                this.f2992k0 = dialogPreference.f760R;
                this.f2993l0 = dialogPreference.f757O;
                this.f2994m0 = dialogPreference.f761S;
                Drawable drawable = dialogPreference.f758P;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(mo890u(), createBitmap);
                }
                this.f2995n0 = bitmapDrawable;
                return;
            }
            this.f2990i0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2991j0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2992k0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2993l0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2994m0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2995n0 = new BitmapDrawable(mo890u(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    /* renamed from: b0 */
    public void mo850b0(Bundle bundle) {
        super.mo850b0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2990i0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2991j0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2992k0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2993l0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2994m0);
        BitmapDrawable bitmapDrawable = this.f2995n0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2996o0 = i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo2941F0(this.f2996o0 == -1);
    }

    /* renamed from: x0 */
    public Dialog mo1615x0(Bundle bundle) {
        C1250v9 i = mo862i();
        this.f2996o0 = -2;
        C0901o.C0902a aVar = new C0901o.C0902a(i);
        CharSequence charSequence = this.f2990i0;
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f193d = charSequence;
        bVar.f192c = this.f2995n0;
        bVar.f196g = this.f2991j0;
        bVar.f197h = this;
        bVar.f198i = this.f2992k0;
        bVar.f199j = this;
        View E0 = mo3548E0();
        if (E0 != null) {
            mo2940D0(E0);
            aVar.f3436a.f204o = E0;
        } else {
            aVar.f3436a.f195f = this.f2993l0;
        }
        mo3260G0(aVar);
        C0901o a = aVar.mo3816a();
        if (mo2939C0()) {
            a.getWindow().setSoftInputMode(5);
        }
        return a;
    }
}
