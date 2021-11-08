package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.nordskog.LesserAudioSwitch.R;
import java.lang.ref.WeakReference;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f143A;

    /* renamed from: B */
    public int f144B = 0;

    /* renamed from: C */
    public Drawable f145C;

    /* renamed from: D */
    public ImageView f146D;

    /* renamed from: E */
    public TextView f147E;

    /* renamed from: F */
    public TextView f148F;

    /* renamed from: G */
    public View f149G;

    /* renamed from: H */
    public ListAdapter f150H;

    /* renamed from: I */
    public int f151I = -1;

    /* renamed from: J */
    public int f152J;

    /* renamed from: K */
    public int f153K;

    /* renamed from: L */
    public int f154L;

    /* renamed from: M */
    public int f155M;

    /* renamed from: N */
    public int f156N;

    /* renamed from: O */
    public int f157O;

    /* renamed from: P */
    public boolean f158P;

    /* renamed from: Q */
    public Handler f159Q;

    /* renamed from: R */
    public final View.OnClickListener f160R = new C0038a();

    /* renamed from: a */
    public final Context f161a;

    /* renamed from: b */
    public final C1392y f162b;

    /* renamed from: c */
    public final Window f163c;

    /* renamed from: d */
    public final int f164d;

    /* renamed from: e */
    public CharSequence f165e;

    /* renamed from: f */
    public CharSequence f166f;

    /* renamed from: g */
    public ListView f167g;

    /* renamed from: h */
    public View f168h;

    /* renamed from: i */
    public int f169i;

    /* renamed from: j */
    public int f170j;

    /* renamed from: k */
    public int f171k;

    /* renamed from: l */
    public int f172l;

    /* renamed from: m */
    public int f173m;

    /* renamed from: n */
    public boolean f174n = false;

    /* renamed from: o */
    public Button f175o;

    /* renamed from: p */
    public CharSequence f176p;

    /* renamed from: q */
    public Message f177q;

    /* renamed from: r */
    public Drawable f178r;

    /* renamed from: s */
    public Button f179s;

    /* renamed from: t */
    public CharSequence f180t;

    /* renamed from: u */
    public Message f181u;

    /* renamed from: v */
    public Drawable f182v;

    /* renamed from: w */
    public Button f183w;

    /* renamed from: x */
    public CharSequence f184x;

    /* renamed from: y */
    public Message f185y;

    /* renamed from: z */
    public Drawable f186z;

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f187b;

        /* renamed from: c */
        public final int f188c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0440f.f2066t);
            this.f188c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f187b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0038a implements View.OnClickListener {
        public C0038a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f185y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f175o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f177q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f179s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f181u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f183w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f185y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f159Q
                r1 = 1
                y r3 = r3.f162b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0038a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0039b {

        /* renamed from: a */
        public final Context f190a;

        /* renamed from: b */
        public final LayoutInflater f191b;

        /* renamed from: c */
        public Drawable f192c;

        /* renamed from: d */
        public CharSequence f193d;

        /* renamed from: e */
        public View f194e;

        /* renamed from: f */
        public CharSequence f195f;

        /* renamed from: g */
        public CharSequence f196g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f197h;

        /* renamed from: i */
        public CharSequence f198i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f199j;

        /* renamed from: k */
        public DialogInterface.OnKeyListener f200k;

        /* renamed from: l */
        public CharSequence[] f201l;

        /* renamed from: m */
        public ListAdapter f202m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f203n;

        /* renamed from: o */
        public View f204o;

        /* renamed from: p */
        public boolean[] f205p;

        /* renamed from: q */
        public boolean f206q;

        /* renamed from: r */
        public boolean f207r;

        /* renamed from: s */
        public int f208s = -1;

        /* renamed from: t */
        public DialogInterface.OnMultiChoiceClickListener f209t;

        public C0039b(Context context) {
            this.f190a = context;
            this.f191b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0040c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f210a;

        public C0040c(DialogInterface dialogInterface) {
            this.f210a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f210a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0041d extends ArrayAdapter<CharSequence> {
        public C0041d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C1392y yVar, Window window) {
        this.f161a = context;
        this.f162b = yVar;
        this.f163c = window;
        this.f159Q = new C0040c(yVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0440f.f2051e, R.attr.alertDialogStyle, 0);
        this.f152J = obtainStyledAttributes.getResourceId(0, 0);
        this.f153K = obtainStyledAttributes.getResourceId(2, 0);
        this.f154L = obtainStyledAttributes.getResourceId(4, 0);
        this.f155M = obtainStyledAttributes.getResourceId(5, 0);
        this.f156N = obtainStyledAttributes.getResourceId(7, 0);
        this.f157O = obtainStyledAttributes.getResourceId(3, 0);
        this.f158P = obtainStyledAttributes.getBoolean(6, true);
        this.f164d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        yVar.mo5116d(1);
    }

    /* renamed from: a */
    public static boolean m63a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m63a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m64c(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo136b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup mo137d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: e */
    public void mo138e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.f159Q.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f184x = charSequence;
            this.f185y = obtainMessage;
            this.f186z = null;
        } else if (i == -2) {
            this.f180t = charSequence;
            this.f181u = obtainMessage;
            this.f182v = null;
        } else if (i == -1) {
            this.f176p = charSequence;
            this.f177q = obtainMessage;
            this.f178r = null;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
