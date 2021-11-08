package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.nordskog.LesserAudioSwitch.R;

/* renamed from: l3 */
public class C0754l3 {

    /* renamed from: a */
    public final Context f3088a;

    /* renamed from: b */
    public final View f3089b;

    /* renamed from: c */
    public final TextView f3090c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f3091d;

    /* renamed from: e */
    public final Rect f3092e = new Rect();

    /* renamed from: f */
    public final int[] f3093f = new int[2];

    /* renamed from: g */
    public final int[] f3094g = new int[2];

    public C0754l3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3091d = layoutParams;
        this.f3088a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f3089b = inflate;
        this.f3090c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C0754l3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755013;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void mo3581a() {
        if (this.f3089b.getParent() != null) {
            ((WindowManager) this.f3088a.getSystemService("window")).removeView(this.f3089b);
        }
    }
}
