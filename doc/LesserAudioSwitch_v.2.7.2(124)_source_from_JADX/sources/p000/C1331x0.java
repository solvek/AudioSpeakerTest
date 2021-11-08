package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import p000.C0449f1;
import p000.C0504g1;
import p000.C0901o;

/* renamed from: x0 */
public class C1331x0 implements C0449f1, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f4991b;

    /* renamed from: c */
    public LayoutInflater f4992c;

    /* renamed from: d */
    public C1435z0 f4993d;

    /* renamed from: e */
    public ExpandedMenuView f4994e;

    /* renamed from: f */
    public C0449f1.C0450a f4995f;

    /* renamed from: g */
    public C1332a f4996g;

    /* renamed from: x0$a */
    public class C1332a extends BaseAdapter {

        /* renamed from: b */
        public int f4997b = -1;

        public C1332a() {
            mo5025a();
        }

        /* renamed from: a */
        public void mo5025a() {
            C1435z0 z0Var = C1331x0.this.f4993d;
            C0203b1 b1Var = z0Var.f5246v;
            if (b1Var != null) {
                z0Var.mo5245i();
                ArrayList<C0203b1> arrayList = z0Var.f5234j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == b1Var) {
                        this.f4997b = i;
                        return;
                    }
                }
            }
            this.f4997b = -1;
        }

        /* renamed from: b */
        public C0203b1 getItem(int i) {
            C1435z0 z0Var = C1331x0.this.f4993d;
            z0Var.mo5245i();
            ArrayList<C0203b1> arrayList = z0Var.f5234j;
            C1331x0.this.getClass();
            int i2 = i + 0;
            int i3 = this.f4997b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public int getCount() {
            C1435z0 z0Var = C1331x0.this.f4993d;
            z0Var.mo5245i();
            int size = z0Var.f5234j.size();
            C1331x0.this.getClass();
            int i = size + 0;
            return this.f4997b < 0 ? i : i - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C1331x0.this.f4992c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((C0504g1.C0505a) view).mo146d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo5025a();
            super.notifyDataSetChanged();
        }
    }

    public C1331x0(Context context, int i) {
        this.f4991b = context;
        this.f4992c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo5023a() {
        if (this.f4996g == null) {
            this.f4996g = new C1332a();
        }
        return this.f4996g;
    }

    /* renamed from: b */
    public void mo589b(C1435z0 z0Var, boolean z) {
        C0449f1.C0450a aVar = this.f4995f;
        if (aVar != null) {
            aVar.mo10b(z0Var, z);
        }
    }

    /* renamed from: c */
    public boolean mo590c(C1435z0 z0Var, C0203b1 b1Var) {
        return false;
    }

    /* renamed from: d */
    public void mo2761d(C0449f1.C0450a aVar) {
        this.f4995f = aVar;
    }

    /* renamed from: f */
    public boolean mo591f(C0705k1 k1Var) {
        if (!k1Var.hasVisibleItems()) {
            return false;
        }
        C0003a1 a1Var = new C0003a1(k1Var);
        C0901o.C0902a aVar = new C0901o.C0902a(k1Var.f5225a);
        C1331x0 x0Var = new C1331x0(aVar.f3436a.f190a, R.layout.abc_list_menu_item_layout);
        a1Var.f11d = x0Var;
        x0Var.f4995f = a1Var;
        C1435z0 z0Var = a1Var.f9b;
        z0Var.mo5235b(x0Var, z0Var.f5225a);
        ListAdapter a = a1Var.f11d.mo5023a();
        AlertController.C0039b bVar = aVar.f3436a;
        bVar.f202m = a;
        bVar.f203n = a1Var;
        View view = k1Var.f5239o;
        if (view != null) {
            bVar.f194e = view;
        } else {
            bVar.f192c = k1Var.f5238n;
            bVar.f193d = k1Var.f5237m;
        }
        bVar.f200k = a1Var;
        C0901o a2 = aVar.mo3816a();
        a1Var.f10c = a2;
        a2.setOnDismissListener(a1Var);
        WindowManager.LayoutParams attributes = a1Var.f10c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        a1Var.f10c.show();
        C0449f1.C0450a aVar2 = this.f4995f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo11c(k1Var);
        return true;
    }

    /* renamed from: g */
    public boolean mo592g() {
        return false;
    }

    /* renamed from: h */
    public void mo593h(boolean z) {
        C1332a aVar = this.f4996g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public void mo594j(Context context, C1435z0 z0Var) {
        if (this.f4991b != null) {
            this.f4991b = context;
            if (this.f4992c == null) {
                this.f4992c = LayoutInflater.from(context);
            }
        }
        this.f4993d = z0Var;
        C1332a aVar = this.f4996g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: k */
    public boolean mo595k(C1435z0 z0Var, C0203b1 b1Var) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4993d.mo5255s(this.f4996g.getItem(i), this, 0);
    }
}
