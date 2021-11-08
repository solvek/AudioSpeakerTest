package p000;

import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: c6 */
public class C0257c6 {

    /* renamed from: a */
    public static final Object f1340a = new Object();

    /* renamed from: b */
    public static Field f1341b;

    /* renamed from: c */
    public static boolean f1342c;

    /* renamed from: a */
    public static SparseArray<Bundle> m1062a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static Bundle[] m1063b(C0366d6[] d6VarArr) {
        if (d6VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[d6VarArr.length];
        if (d6VarArr.length <= 0) {
            return bundleArr;
        }
        C0366d6 d6Var = d6VarArr[0];
        new Bundle();
        throw null;
    }
}
