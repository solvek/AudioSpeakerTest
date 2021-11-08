package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;

/* renamed from: e8 */
public class C0410e8 {

    /* renamed from: a */
    public ViewParent f1980a;

    /* renamed from: b */
    public ViewParent f1981b;

    /* renamed from: c */
    public final View f1982c;

    /* renamed from: d */
    public boolean f1983d;

    /* renamed from: e */
    public int[] f1984e;

    public C0410e8(View view) {
        this.f1982c = view;
    }

    /* renamed from: a */
    public boolean mo2708a(float f, float f2, boolean z) {
        ViewParent g;
        if (!this.f1983d || (g = mo2714g(0)) == null) {
            return false;
        }
        View view = this.f1982c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return g.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                "ViewParent " + g + " does not implement interface method onNestedFling";
                return false;
            }
        } else if (g instanceof C0560h8) {
            return ((C0560h8) g).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo2709b(float f, float f2) {
        ViewParent g;
        if (!this.f1983d || (g = mo2714g(0)) == null) {
            return false;
        }
        View view = this.f1982c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return g.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                "ViewParent " + g + " does not implement interface method onNestedPreFling";
                return false;
            }
        } else if (g instanceof C0560h8) {
            return ((C0560h8) g).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo2710c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        if (!this.f1983d || (g = mo2714g(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f1982c.getLocationInWindow(iArr4);
            i5 = iArr4[0];
            i4 = iArr4[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f1984e == null) {
                this.f1984e = new int[2];
            }
            iArr3 = this.f1984e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f1982c;
        if (g instanceof C0457f8) {
            ((C0457f8) g).mo245n(view, i, i2, iArr3, i3);
        } else if (i8 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    g.onNestedPreScroll(view, i, i2, iArr3);
                } catch (AbstractMethodError unused) {
                    "ViewParent " + g + " does not implement interface method onNestedPreScroll";
                }
            } else if (g instanceof C0560h8) {
                ((C0560h8) g).onNestedPreScroll(view, i, i2, iArr3);
            }
        }
        if (iArr4 != null) {
            this.f1982c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i5;
            iArr4[1] = iArr4[1] - i4;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo2711d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo2713f(i, i2, i3, i4, (int[]) null, i5, iArr2);
    }

    /* renamed from: e */
    public boolean mo2712e(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2713f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: f */
    public final boolean mo2713f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f1983d || (g = mo2714g(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f1982c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f1984e == null) {
                this.f1984e = new int[2];
            }
            int[] iArr5 = this.f1984e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f1982c;
        if (g instanceof C0523g8) {
            ((C0523g8) g).mo242k(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof C0457f8) {
                ((C0457f8) g).mo243l(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError unused) {
                        "ViewParent " + g + " does not implement interface method onNestedScroll";
                    }
                } else if (g instanceof C0560h8) {
                    ((C0560h8) g).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr4 != null) {
            this.f1982c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent mo2714g(int i) {
        if (i == 0) {
            return this.f1980a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1981b;
    }

    /* renamed from: h */
    public boolean mo2715h(int i) {
        return mo2714g(i) != null;
    }

    /* renamed from: i */
    public void mo2716i(boolean z) {
        if (this.f1983d) {
            View view = this.f1982c;
            Field field = C0813m8.f3234a;
            if (Build.VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof C0368d8) {
                ((C0368d8) view).stopNestedScroll();
            }
        }
        this.f1983d = z;
    }

    /* renamed from: j */
    public boolean mo2717j(int i, int i2) {
        boolean z;
        if (mo2714g(i2) != null) {
            return true;
        }
        if (this.f1983d) {
            View view = this.f1982c;
            for (ViewParent parent = this.f1982c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f1982c;
                boolean z2 = parent instanceof C0457f8;
                if (z2) {
                    z = ((C0457f8) parent).mo246o(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i);
                            } catch (AbstractMethodError unused) {
                                "ViewParent " + parent + " does not implement interface method onStartNestedScroll";
                            }
                        } else if (parent instanceof C0560h8) {
                            z = ((C0560h8) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f1980a = parent;
                    } else if (i2 == 1) {
                        this.f1981b = parent;
                    }
                    View view3 = this.f1982c;
                    if (z2) {
                        ((C0457f8) parent).mo240i(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError unused2) {
                                "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted";
                            }
                        } else if (parent instanceof C0560h8) {
                            ((C0560h8) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo2718k(int i) {
        ViewParent g = mo2714g(i);
        if (g != null) {
            View view = this.f1982c;
            if (g instanceof C0457f8) {
                ((C0457f8) g).mo244m(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        g.onStopNestedScroll(view);
                    } catch (AbstractMethodError unused) {
                        "ViewParent " + g + " does not implement interface method onStopNestedScroll";
                    }
                } else if (g instanceof C0560h8) {
                    ((C0560h8) g).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.f1980a = null;
            } else if (i == 1) {
                this.f1981b = null;
            }
        }
    }
}
