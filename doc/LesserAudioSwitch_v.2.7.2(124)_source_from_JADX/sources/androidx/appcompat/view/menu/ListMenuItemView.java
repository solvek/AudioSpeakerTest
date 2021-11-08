package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.reflect.Field;
import p000.C0504g1;

public class ListMenuItemView extends LinearLayout implements C0504g1.C0505a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0203b1 f225b;

    /* renamed from: c */
    public ImageView f226c;

    /* renamed from: d */
    public RadioButton f227d;

    /* renamed from: e */
    public TextView f228e;

    /* renamed from: f */
    public CheckBox f229f;

    /* renamed from: g */
    public TextView f230g;

    /* renamed from: h */
    public ImageView f231h;

    /* renamed from: i */
    public ImageView f232i;

    /* renamed from: j */
    public LinearLayout f233j;

    /* renamed from: k */
    public Drawable f234k;

    /* renamed from: l */
    public int f235l;

    /* renamed from: m */
    public Context f236m;

    /* renamed from: n */
    public boolean f237n;

    /* renamed from: o */
    public Drawable f238o;

    /* renamed from: p */
    public boolean f239p;

    /* renamed from: q */
    public LayoutInflater f240q;

    /* renamed from: r */
    public boolean f241r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0555h3 q = C0555h3.m1825q(getContext(), attributeSet, C0440f.f2064r, R.attr.listMenuViewStyle, 0);
        this.f234k = q.mo3027g(5);
        this.f235l = q.mo3032l(1, -1);
        this.f237n = q.mo3021a(7, false);
        this.f236m = context;
        this.f238o = q.mo3027g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f239p = obtainStyledAttributes.hasValue(0);
        q.f2425b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f240q == null) {
            this.f240q = LayoutInflater.from(getContext());
        }
        return this.f240q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f231h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void mo170a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f229f = checkBox;
        LinearLayout linearLayout = this.f233j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f232i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f232i.getLayoutParams();
            rect.top = this.f232i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* renamed from: b */
    public final void mo172b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f227d = radioButton;
        LinearLayout linearLayout = this.f233j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: c */
    public void mo173c(boolean z) {
        String str;
        int i;
        int i2 = (!z || !this.f225b.mo1513m()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.f230g;
            C0203b1 b1Var = this.f225b;
            char e = b1Var.mo1479e();
            if (e == 0) {
                str = "";
            } else {
                Resources resources = b1Var.f1194n.f5225a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(b1Var.f1194n.f5225a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = b1Var.f1194n.mo3484n() ? b1Var.f1191k : b1Var.f1189i;
                C0203b1.m972c(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0203b1.m972c(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0203b1.m972c(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0203b1.m972c(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0203b1.m972c(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0203b1.m972c(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == 8) {
                    i = R.string.abc_menu_delete_shortcut_label;
                } else if (e == 10) {
                    i = R.string.abc_menu_enter_shortcut_label;
                } else if (e != ' ') {
                    sb.append(e);
                    str = sb.toString();
                } else {
                    i = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f230g.getVisibility() != i2) {
            this.f230g.setVisibility(i2);
        }
    }

    /* renamed from: d */
    public void mo146d(C0203b1 b1Var, int i) {
        this.f225b = b1Var;
        setVisibility(b1Var.isVisible() ? 0 : 8);
        setTitle(b1Var.f1185e);
        setCheckable(b1Var.isCheckable());
        boolean m = b1Var.mo1513m();
        b1Var.mo1479e();
        mo173c(m);
        setIcon(b1Var.getIcon());
        setEnabled(b1Var.isEnabled());
        setSubMenuArrowVisible(b1Var.hasSubMenu());
        setContentDescription(b1Var.f1197q);
    }

    public C0203b1 getItemData() {
        return this.f225b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f234k;
        Field field = C0813m8.f3234a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
        TextView textView = (TextView) findViewById(R.id.title);
        this.f228e = textView;
        int i = this.f235l;
        if (i != -1) {
            textView.setTextAppearance(this.f236m, i);
        }
        this.f230g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f231h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f238o);
        }
        this.f232i = (ImageView) findViewById(R.id.group_divider);
        this.f233j = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f226c != null && this.f237n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f226c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f227d != null || this.f229f != null) {
            if (this.f225b.mo1502h()) {
                if (this.f227d == null) {
                    mo172b();
                }
                compoundButton2 = this.f227d;
                compoundButton = this.f229f;
            } else {
                if (this.f229f == null) {
                    mo170a();
                }
                compoundButton2 = this.f229f;
                compoundButton = this.f227d;
            }
            if (z) {
                compoundButton2.setChecked(this.f225b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f229f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f227d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f225b.mo1502h()) {
            if (this.f227d == null) {
                mo172b();
            }
            compoundButton = this.f227d;
        } else {
            if (this.f229f == null) {
                mo170a();
            }
            compoundButton = this.f229f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f241r = z;
        this.f237n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f232i;
        if (imageView != null) {
            imageView.setVisibility((this.f239p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f225b.f1194n.getClass();
        boolean z = this.f241r;
        if (z || this.f237n) {
            ImageView imageView = this.f226c;
            if (imageView != null || drawable != null || this.f237n) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f226c = imageView2;
                    LinearLayout linearLayout = this.f233j;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f237n) {
                    ImageView imageView3 = this.f226c;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f226c.getVisibility() != 0) {
                        this.f226c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f226c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f228e.setText(charSequence);
            if (this.f228e.getVisibility() != 0) {
                textView = this.f228e;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f228e.getVisibility() != 8) {
                textView = this.f228e;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }
}
