package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: w2 */
public class C1289w2 extends C1189u2 implements C1233v2 {

    /* renamed from: F */
    public static Method f4893F;

    /* renamed from: E */
    public C1233v2 f4894E;

    /* renamed from: w2$a */
    public static class C1290a extends C0951p2 {

        /* renamed from: o */
        public final int f4895o;

        /* renamed from: p */
        public final int f4896p;

        /* renamed from: q */
        public C1233v2 f4897q;

        /* renamed from: r */
        public MenuItem f4898r;

        public C1290a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f4895o = 22;
                this.f4896p = 21;
                return;
            }
            this.f4895o = 21;
            this.f4896p = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f4897q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C1394y0 y0Var = (C1394y0) adapter;
                C0203b1 b1Var = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < y0Var.getCount()) {
                    b1Var = y0Var.getItem(i2);
                }
                MenuItem menuItem = this.f4898r;
                if (menuItem != b1Var) {
                    C1435z0 z0Var = y0Var.f5147b;
                    if (menuItem != null) {
                        this.f4897q.mo4809k(z0Var, menuItem);
                    }
                    this.f4898r = b1Var;
                    if (b1Var != null) {
                        this.f4897q.mo4808g(z0Var, b1Var);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f4895o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f4896p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1394y0) getAdapter()).f5147b.mo5236c(false);
                return true;
            }
        }

        public void setHoverListener(C1233v2 v2Var) {
            this.f4897q = v2Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4893F = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public C1289w2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* renamed from: g */
    public void mo4808g(C1435z0 z0Var, MenuItem menuItem) {
        C1233v2 v2Var = this.f4894E;
        if (v2Var != null) {
            v2Var.mo4808g(z0Var, menuItem);
        }
    }

    /* renamed from: k */
    public void mo4809k(C1435z0 z0Var, MenuItem menuItem) {
        C1233v2 v2Var = this.f4894E;
        if (v2Var != null) {
            v2Var.mo4809k(z0Var, menuItem);
        }
    }

    /* renamed from: q */
    public C0951p2 mo4749q(Context context, boolean z) {
        C1290a aVar = new C1290a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
