package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import p000.C0504g1;

/* renamed from: y0 */
public class C1394y0 extends BaseAdapter {

    /* renamed from: b */
    public C1435z0 f5147b;

    /* renamed from: c */
    public int f5148c = -1;

    /* renamed from: d */
    public boolean f5149d;

    /* renamed from: e */
    public final boolean f5150e;

    /* renamed from: f */
    public final LayoutInflater f5151f;

    /* renamed from: g */
    public final int f5152g;

    public C1394y0(C1435z0 z0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.f5150e = z;
        this.f5151f = layoutInflater;
        this.f5147b = z0Var;
        this.f5152g = i;
        mo5123a();
    }

    /* renamed from: a */
    public void mo5123a() {
        C1435z0 z0Var = this.f5147b;
        C0203b1 b1Var = z0Var.f5246v;
        if (b1Var != null) {
            z0Var.mo5245i();
            ArrayList<C0203b1> arrayList = z0Var.f5234j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == b1Var) {
                    this.f5148c = i;
                    return;
                }
            }
        }
        this.f5148c = -1;
    }

    /* renamed from: b */
    public C0203b1 getItem(int i) {
        ArrayList<C0203b1> arrayList;
        if (this.f5150e) {
            C1435z0 z0Var = this.f5147b;
            z0Var.mo5245i();
            arrayList = z0Var.f5234j;
        } else {
            arrayList = this.f5147b.mo5247l();
        }
        int i2 = this.f5148c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public int getCount() {
        ArrayList<C0203b1> arrayList;
        if (this.f5150e) {
            C1435z0 z0Var = this.f5147b;
            z0Var.mo5245i();
            arrayList = z0Var.f5234j;
        } else {
            arrayList = this.f5147b.mo5247l();
        }
        int i = this.f5148c;
        int size = arrayList.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5151f.inflate(this.f5152g, viewGroup, false);
        }
        int i2 = getItem(i).f1182b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f5147b.mo3483m() && i2 != (i3 >= 0 ? getItem(i3).f1182b : i2));
        C0504g1.C0505a aVar = (C0504g1.C0505a) view;
        if (this.f5149d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo146d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo5123a();
        super.notifyDataSetChanged();
    }
}
