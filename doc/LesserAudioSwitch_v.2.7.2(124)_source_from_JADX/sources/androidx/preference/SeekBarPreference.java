package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.nordskog.LesserAudioSwitch.R;

public class SeekBarPreference extends Preference {

    /* renamed from: N */
    public int f829N;

    /* renamed from: O */
    public int f830O;

    /* renamed from: P */
    public int f831P;

    /* renamed from: Q */
    public int f832Q;

    /* renamed from: R */
    public boolean f833R;

    /* renamed from: S */
    public SeekBar f834S;

    /* renamed from: T */
    public TextView f835T;

    /* renamed from: U */
    public boolean f836U;

    /* renamed from: V */
    public boolean f837V;

    /* renamed from: W */
    public boolean f838W;

    /* renamed from: X */
    public SeekBar.OnSeekBarChangeListener f839X = new C0128a();

    /* renamed from: Y */
    public View.OnKeyListener f840Y = new C0129b();

    /* renamed from: androidx.preference.SeekBarPreference$a */
    public class C0128a implements SeekBar.OnSeekBarChangeListener {
        public C0128a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f838W || !seekBarPreference.f833R) {
                    int progress = seekBar.getProgress() + seekBarPreference.f830O;
                    if (progress != seekBarPreference.f829N) {
                        seekBarPreference.mo976I(progress, false);
                        return;
                    }
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo977J(i + seekBarPreference2.f830O);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f833R = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference.this.f833R = false;
            int progress2 = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            int i = seekBarPreference.f830O;
            if (progress2 + i != seekBarPreference.f829N && (progress = seekBar.getProgress() + i) != seekBarPreference.f829N) {
                seekBarPreference.mo976I(progress, false);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    public class C0129b implements View.OnKeyListener {
        public C0129b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SeekBar seekBar;
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f836U && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f834S) == null) {
                return false;
            }
            return seekBar.onKeyDown(i, keyEvent);
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$c */
    public static class C0130c extends Preference.C0120b {
        public static final Parcelable.Creator<C0130c> CREATOR = new C0131a();

        /* renamed from: b */
        public int f843b;

        /* renamed from: c */
        public int f844c;

        /* renamed from: d */
        public int f845d;

        /* renamed from: androidx.preference.SeekBarPreference$c$a */
        public static class C0131a implements Parcelable.Creator<C0130c> {
            public Object createFromParcel(Parcel parcel) {
                return new C0130c(parcel);
            }

            public Object[] newArray(int i) {
                return new C0130c[i];
            }
        }

        public C0130c(Parcel parcel) {
            super(parcel);
            this.f843b = parcel.readInt();
            this.f844c = parcel.readInt();
            this.f845d = parcel.readInt();
        }

        public C0130c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f843b);
            parcel.writeInt(this.f844c);
            parcel.writeInt(this.f845d);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1163tc.f4425k, R.attr.seekBarPreferenceStyle, 0);
        this.f830O = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f830O;
        i = i < i2 ? i2 : i;
        if (i != this.f831P) {
            this.f831P = i;
            mo913l();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f832Q) {
            this.f832Q = Math.min(this.f831P - this.f830O, Math.abs(i3));
            mo913l();
        }
        this.f836U = obtainStyledAttributes.getBoolean(2, true);
        this.f837V = obtainStyledAttributes.getBoolean(5, false);
        this.f838W = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    public final void mo976I(int i, boolean z) {
        int i2 = this.f830O;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f831P;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f829N) {
            this.f829N = i;
            mo977J(i);
            if (mo942H() && i != mo948e(i ^ -1)) {
                mo951h();
                SharedPreferences.Editor a = this.f795c.mo4009a();
                a.putInt(this.f804l, i);
                if (!this.f795c.f3611e) {
                    a.apply();
                }
            }
            if (z) {
                mo913l();
            }
        }
    }

    /* renamed from: J */
    public void mo977J(int i) {
        TextView textView = this.f835T;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    /* renamed from: p */
    public void mo909p(C1056rc rcVar) {
        super.mo909p(rcVar);
        rcVar.f996a.setOnKeyListener(this.f840Y);
        this.f834S = (SeekBar) rcVar.mo4232w(R.id.seekbar);
        TextView textView = (TextView) rcVar.mo4232w(R.id.seekbar_value);
        this.f835T = textView;
        if (this.f837V) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f835T = null;
        }
        SeekBar seekBar = this.f834S;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.f839X);
            this.f834S.setMax(this.f831P - this.f830O);
            int i = this.f832Q;
            if (i != 0) {
                this.f834S.setKeyProgressIncrement(i);
            } else {
                this.f832Q = this.f834S.getKeyProgressIncrement();
            }
            this.f834S.setProgress(this.f829N - this.f830O);
            mo977J(this.f829N);
            this.f834S.setEnabled(mo953k());
        }
    }

    /* renamed from: t */
    public Object mo918t(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: w */
    public void mo919w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0130c.class)) {
            super.mo919w(parcelable);
            return;
        }
        C0130c cVar = (C0130c) parcelable;
        super.mo919w(cVar.getSuperState());
        this.f829N = cVar.f843b;
        this.f830O = cVar.f844c;
        this.f831P = cVar.f845d;
        mo913l();
    }

    /* renamed from: x */
    public Parcelable mo920x() {
        Parcelable x = super.mo920x();
        if (this.f810r) {
            return x;
        }
        C0130c cVar = new C0130c(x);
        cVar.f843b = this.f829N;
        cVar.f844c = this.f830O;
        cVar.f845d = this.f831P;
        return cVar;
    }

    /* renamed from: y */
    public void mo921y(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        mo976I(mo948e(((Integer) obj).intValue()), true);
    }
}
