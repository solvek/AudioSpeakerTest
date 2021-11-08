package p000;

import java.util.List;

/* renamed from: k6 */
public final class C0715k6 {

    /* renamed from: a */
    public final int[] f2980a;

    /* renamed from: b */
    public final float[] f2981b;

    public C0715k6(int i, int i2) {
        this.f2980a = new int[]{i, i2};
        this.f2981b = new float[]{0.0f, 1.0f};
    }

    public C0715k6(int i, int i2, int i3) {
        this.f2980a = new int[]{i, i2, i3};
        this.f2981b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0715k6(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f2980a = new int[size];
        this.f2981b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2980a[i] = list.get(i).intValue();
            this.f2981b[i] = list2.get(i).floatValue();
        }
    }
}
