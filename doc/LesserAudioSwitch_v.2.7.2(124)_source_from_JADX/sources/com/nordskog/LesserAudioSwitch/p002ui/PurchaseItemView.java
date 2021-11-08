package com.nordskog.LesserAudioSwitch.p002ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: com.nordskog.LesserAudioSwitch.ui.PurchaseItemView */
public class PurchaseItemView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public LinearLayout f1785b;

    /* renamed from: c */
    public TextView f1786c;

    /* renamed from: d */
    public C0490fp f1787d = null;

    /* renamed from: e */
    public ImageView f1788e;

    /* renamed from: f */
    public View f1789f;

    /* renamed from: g */
    public View f1790g;

    /* renamed from: h */
    public View f1791h;

    /* renamed from: i */
    public TextView f1792i;

    /* renamed from: j */
    public C0231bp f1793j;

    /* renamed from: k */
    public boolean f1794k = false;

    /* renamed from: l */
    public C0344a f1795l = null;

    /* renamed from: com.nordskog.LesserAudioSwitch.ui.PurchaseItemView$a */
    public interface C0344a {
    }

    public PurchaseItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.view_purchase_item, this);
        this.f1785b = (LinearLayout) findViewById(R.id.content);
        this.f1789f = findViewById(R.id.purchase_item_purchase_button);
        this.f1790g = findViewById(R.id.purchase_item_error_button);
        this.f1786c = (TextView) findViewById(R.id.purchase_item_price_textview);
        this.f1788e = (ImageView) findViewById(R.id.purchase_item_price_loading);
        this.f1791h = findViewById(R.id.purchase_item_short_error_container);
        this.f1792i = (TextView) findViewById(R.id.purchase_item_short_error_textview);
        mo2568a(true);
        this.f1789f.setOnClickListener(new C0493fs(this));
        this.f1785b.setOnClickListener(new C0436es(this));
        this.f1790g.setOnClickListener(new C0395dt(this));
    }

    /* renamed from: a */
    public final void mo2568a(boolean z) {
        if (z) {
            this.f1788e.clearAnimation();
            this.f1788e.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(2000);
            this.f1788e.startAnimation(rotateAnimation);
            this.f1786c.setVisibility(8);
            return;
        }
        this.f1786c.setVisibility(0);
        this.f1788e.clearAnimation();
        this.f1788e.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo2569b() {
        String str;
        this.f1785b.setSelected(this.f1794k);
        C0490fp fpVar = this.f1787d;
        if (fpVar == null || fpVar.f2179b == 0) {
            this.f1791h.setVisibility(4);
            this.f1790g.setVisibility(8);
            this.f1789f.setVisibility(0);
            C0231bp bpVar = this.f1793j;
            if (bpVar == null || (str = bpVar.f1291b) == null) {
                mo2568a(true);
                return;
            }
            mo2568a(false);
            this.f1786c.setText(str);
            return;
        }
        Context context = getContext();
        if (context != null) {
            this.f1792i.setText(context.getResources().getString(C0545gp.f2412b.get(this.f1787d.f2179b, 0).intValue()));
        }
        this.f1791h.setVisibility(0);
        this.f1790g.setVisibility(0);
        this.f1789f.setVisibility(8);
    }

    public boolean isChecked() {
        return this.f1794k;
    }

    public void setChecked(boolean z) {
        this.f1794k = z;
        refreshDrawableState();
        mo2569b();
    }

    public void setError(C0490fp fpVar) {
        this.f1787d = fpVar;
        mo2569b();
    }

    public void setItem(C0231bp bpVar) {
        this.f1793j = bpVar;
        mo2569b();
    }

    public void setOnPurchaseViewClickedListener(C0344a aVar) {
        this.f1795l = aVar;
    }

    public void toggle() {
        setChecked(!this.f1794k);
        mo2569b();
    }
}
