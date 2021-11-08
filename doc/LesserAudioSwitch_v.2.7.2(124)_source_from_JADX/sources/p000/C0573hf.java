package p000;

import android.view.View;
import android.view.ViewGroup;
import com.nordskog.LesserAudioSwitch.R;
import java.util.ArrayList;
import p000.C0677je;

/* renamed from: hf */
public class C0573hf extends C0828me {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2469a;

    /* renamed from: b */
    public final /* synthetic */ View f2470b;

    /* renamed from: c */
    public final /* synthetic */ View f2471c;

    /* renamed from: d */
    public final /* synthetic */ C0627if f2472d;

    public C0573hf(C0627if ifVar, ViewGroup viewGroup, View view, View view2) {
        this.f2472d = ifVar;
        this.f2469a = viewGroup;
        this.f2470b = view;
        this.f2471c = view2;
    }

    /* renamed from: c */
    public void mo1759c(C0677je jeVar) {
        this.f2471c.setTag(R.id.save_overlay_view, (Object) null);
        C1309we.m3649a(this.f2469a).mo4643a(this.f2470b);
        jeVar.mo3454v(this);
    }

    /* renamed from: d */
    public void mo1760d(C0677je jeVar) {
        C1309we.m3649a(this.f2469a).mo4643a(this.f2470b);
    }

    /* renamed from: e */
    public void mo1761e(C0677je jeVar) {
        if (this.f2470b.getParent() == null) {
            C1309we.m3649a(this.f2469a).mo4644b(this.f2470b);
            return;
        }
        C0627if ifVar = this.f2472d;
        int size = ifVar.f2889n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ifVar.f2889n.get(size).cancel();
        }
        ArrayList<C0677je.C0681d> arrayList = ifVar.f2893r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) ifVar.f2893r.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C0677je.C0681d) arrayList2.get(i)).mo1758b(ifVar);
            }
        }
    }
}
