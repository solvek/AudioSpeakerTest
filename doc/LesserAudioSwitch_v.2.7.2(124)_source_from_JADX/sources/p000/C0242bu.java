package p000;

import android.widget.CompoundButton;

/* renamed from: bu */
public final /* synthetic */ class C0242bu implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0946ou f1310a;

    public /* synthetic */ C0242bu(C0946ou ouVar) {
        this.f1310a = ouVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0946ou ouVar = this.f1310a;
        ouVar.getClass();
        if (z) {
            ouVar.mo3874b(compoundButton.getId(), false);
        }
    }
}
