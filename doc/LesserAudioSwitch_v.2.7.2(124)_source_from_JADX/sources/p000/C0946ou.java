package p000;

import android.widget.RadioButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ou */
public abstract class C0946ou {

    /* renamed from: a */
    public ArrayList<RadioButton> f3518a;

    /* renamed from: b */
    public boolean f3519b = false;

    public C0946ou(RadioButton... radioButtonArr) {
        ArrayList<RadioButton> arrayList = new ArrayList<>();
        this.f3518a = arrayList;
        arrayList.addAll(Arrays.asList(radioButtonArr));
        Iterator<RadioButton> it = this.f3518a.iterator();
        while (it.hasNext()) {
            it.next().setOnCheckedChangeListener(new C0242bu(this));
        }
    }

    /* renamed from: a */
    public abstract void mo3873a(int i);

    /* renamed from: b */
    public void mo3874b(int i, boolean z) {
        if (!this.f3519b) {
            this.f3519b = true;
            Iterator<RadioButton> it = this.f3518a.iterator();
            while (it.hasNext()) {
                RadioButton next = it.next();
                if (next.getId() != i) {
                    next.setChecked(false);
                } else if (!next.isChecked()) {
                    next.setChecked(true);
                }
            }
            if (!z) {
                mo3873a(i);
            }
            this.f3519b = false;
        }
    }
}
