package p000;

import android.util.SparseArray;

/* renamed from: fp */
public class C0490fp {

    /* renamed from: a */
    public C0277cg f2178a;

    /* renamed from: b */
    public int f2179b;

    public C0490fp(int i) {
        this.f2179b = i;
    }

    public C0490fp(C0277cg cgVar) {
        this.f2178a = cgVar;
        SparseArray<Integer> sparseArray = C0545gp.f2411a;
        int i = 2;
        switch (cgVar.f1384a) {
            case -3:
            case -1:
            case 2:
                i = 7;
                break;
            case -2:
                i = 4;
                break;
            case 0:
                i = 0;
                break;
            case 1:
            case 8:
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 6;
                break;
            case 5:
            case 6:
                i = 1;
                break;
            case 7:
                i = 5;
                break;
            default:
                i = 11;
                break;
        }
        this.f2179b = i;
    }
}
