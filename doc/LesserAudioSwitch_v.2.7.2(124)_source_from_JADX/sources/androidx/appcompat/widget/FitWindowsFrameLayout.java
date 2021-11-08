package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.C0999q2;

public class FitWindowsFrameLayout extends FrameLayout implements C0999q2 {

    /* renamed from: b */
    public C0999q2.C1000a f333b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        C0999q2.C1000a aVar = this.f333b;
        if (aVar != null) {
            rect.top = ((C1186u) aVar).f4529a.mo4340X((C1241v8) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0999q2.C1000a aVar) {
        this.f333b = aVar;
    }
}
