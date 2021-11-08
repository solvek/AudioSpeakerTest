package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.nordskog.LesserAudioSwitch.R;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f1580b = C1463zj.m3974e();

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (C0885nj.m2605C0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        C0813m8.m2457F(this, new C0833mj(this));
    }

    /* renamed from: a */
    public C1123sj getAdapter() {
        return (C1123sj) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1123sj a = getAdapter();
        C0281cj<?> cjVar = a.f4263c;
        a.getItem(a.mo4517a());
        a.getItem(a.mo4519c());
        for (C1298w7<Long, Long> w7Var : cjVar.mo1773g()) {
            w7Var.getClass();
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        if (z) {
            if (i == 33) {
                i2 = getAdapter().mo4519c();
            } else if (i == 130) {
                i2 = getAdapter().mo4517a();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(i2);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo4517a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo4517a());
        return true;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C1123sj) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C1123sj.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo4517a()) {
            i = getAdapter().mo4517a();
        }
        super.setSelection(i);
    }
}
