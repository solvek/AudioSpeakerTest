package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.nordskog.LesserAudioSwitch.R;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f1601g = {16842912};

    /* renamed from: d */
    public boolean f1602d;

    /* renamed from: e */
    public boolean f1603e = true;

    /* renamed from: f */
    public boolean f1604f = true;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C0322a extends C0718k9 {
        public static final Parcelable.Creator<C0322a> CREATOR = new C0323a();

        /* renamed from: d */
        public boolean f1605d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public static class C0323a implements Parcelable.ClassLoaderCreator<C0322a> {
            public Object createFromParcel(Parcel parcel) {
                return new C0322a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new C0322a[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0322a(parcel, classLoader);
            }
        }

        public C0322a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1605d = parcel.readInt() != 1 ? false : true;
        }

        public C0322a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2988b, i);
            parcel.writeInt(this.f1605d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        C0813m8.m2457F(this, new C0889nk(this));
    }

    public boolean isChecked() {
        return this.f1602d;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f1602d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f1601g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0322a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0322a aVar = (C0322a) parcelable;
        super.onRestoreInstanceState(aVar.f2988b);
        setChecked(aVar.f1605d);
    }

    public Parcelable onSaveInstanceState() {
        C0322a aVar = new C0322a(super.onSaveInstanceState());
        aVar.f1605d = this.f1602d;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f1603e != z) {
            this.f1603e = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f1603e && this.f1602d != z) {
            this.f1602d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f1604f = z;
    }

    public void setPressed(boolean z) {
        if (this.f1604f) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f1602d);
    }
}
