package p000;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: s0 */
public class C1093s0 implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f4135b;

    public C1093s0(Window.Callback callback) {
        if (callback != null) {
            this.f4135b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4135b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4135b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4135b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4135b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f4135b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f4135b.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f4135b.onAttachedToWindow();
    }

    public View onCreatePanelView(int i) {
        return this.f4135b.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f4135b.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4135b.onMenuItemSelected(i, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f4135b.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested() {
        return this.f4135b.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4135b.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4135b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4135b.onWindowFocusChanged(z);
    }
}
