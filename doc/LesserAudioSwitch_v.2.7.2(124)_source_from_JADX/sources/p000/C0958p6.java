package p000;

import android.graphics.Path;

/* renamed from: p6 */
public class C0958p6 {

    /* renamed from: a */
    public char f3567a;

    /* renamed from: b */
    public float[] f3568b;

    public C0958p6(char c, float[] fArr) {
        this.f3567a = c;
        this.f3568b = fArr;
    }

    public C0958p6(C0958p6 p6Var) {
        this.f3567a = p6Var.f3567a;
        float[] fArr = p6Var.f3568b;
        this.f3568b = C1344x5.m3763j(fArr, 0, fArr.length);
    }

    /* renamed from: a */
    public static void m2779a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        float f8 = f;
        float f9 = f3;
        float f10 = f5;
        boolean z3 = z2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f8;
        Double.isNaN(d3);
        double d4 = (double) f2;
        Double.isNaN(d4);
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = (double) f10;
        Double.isNaN(d7);
        double d8 = d5 / d7;
        double d9 = radians;
        double d10 = (double) (-f8);
        Double.isNaN(d10);
        Double.isNaN(d4);
        double d11 = (d4 * cos) + (d10 * sin);
        double d12 = (double) f6;
        Double.isNaN(d12);
        double d13 = d11 / d12;
        double d14 = d4;
        double d15 = (double) f9;
        Double.isNaN(d15);
        double d16 = (double) f4;
        Double.isNaN(d16);
        Double.isNaN(d7);
        double d17 = ((d16 * sin) + (d15 * cos)) / d7;
        double d18 = (double) (-f9);
        Double.isNaN(d18);
        Double.isNaN(d16);
        Double.isNaN(d12);
        double d19 = ((d16 * cos) + (d18 * sin)) / d12;
        double d20 = d8 - d17;
        double d21 = d13 - d19;
        double d22 = (d8 + d17) / 2.0d;
        double d23 = (d13 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 != 0.0d) {
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                m2779a(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d20 * sqrt2;
            double d27 = sqrt2 * d21;
            if (z == z3) {
                d2 = d22 - d27;
                d = d23 + d26;
            } else {
                d2 = d22 + d27;
                d = d23 - d26;
            }
            double d28 = d13 - d;
            double d29 = sin;
            double atan2 = Math.atan2(d28, d8 - d2);
            double atan22 = Math.atan2(d19 - d, d17 - d2) - atan2;
            int i = 0;
            if (z3 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d7);
            double d30 = d2 * d7;
            Double.isNaN(d12);
            double d31 = d * d12;
            double d32 = (d30 * cos) - (d31 * d29);
            double d33 = (d31 * cos) + (d30 * d29);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d9);
            double sin2 = Math.sin(d9);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            Double.isNaN(d7);
            double d34 = -d7;
            double d35 = d34 * cos2;
            Double.isNaN(d12);
            double d36 = d12 * sin2;
            double d37 = (d35 * sin3) - (d36 * cos3);
            double d38 = d34 * sin2;
            Double.isNaN(d12);
            double d39 = d12 * cos2;
            double d40 = (cos3 * d39) + (sin3 * d38);
            double d41 = atan2;
            double d42 = (double) ceil;
            Double.isNaN(d42);
            Double.isNaN(d42);
            double d43 = atan22 / d42;
            double d44 = d41;
            while (i < ceil) {
                double d45 = d44 + d43;
                double sin4 = Math.sin(d45);
                double cos4 = Math.cos(d45);
                Double.isNaN(d7);
                double d46 = d43;
                double d47 = (((d7 * cos2) * cos4) + d32) - (d36 * sin4);
                Double.isNaN(d7);
                double d48 = d32;
                double d49 = (d39 * sin4) + (d7 * sin2 * cos4) + d33;
                double d50 = (d35 * sin4) - (d36 * cos4);
                double d51 = (cos4 * d39) + (sin4 * d38);
                double d52 = d45 - d44;
                double tan = Math.tan(d52 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
                double d53 = (d37 * sqrt3) + d6;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d53, (float) ((d40 * sqrt3) + d14), (float) (d47 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d47, (float) d49);
                i++;
                d39 = d39;
                d38 = d38;
                ceil = ceil;
                cos2 = cos2;
                d44 = d45;
                d7 = d7;
                d40 = d51;
                d37 = d50;
                d6 = d47;
                d14 = d49;
                d43 = d46;
                d32 = d48;
            }
        }
    }

    /* renamed from: b */
    public static void m2780b(C0958p6[] p6VarArr, Path path) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float[] fArr;
        char c;
        int i4;
        float[] fArr2;
        char c2;
        int i5;
        float f3;
        float f4;
        float f5;
        float f6;
        int i6;
        float f7;
        float f8;
        int i7;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        C0958p6[] p6VarArr2 = p6VarArr;
        Path path2 = path;
        float[] fArr3 = new float[6];
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i8 = 0;
        while (i8 < p6VarArr2.length) {
            char c6 = p6VarArr2[i8].f3567a;
            float[] fArr4 = p6VarArr2[i8].f3568b;
            float f24 = fArr3[c4];
            float f25 = fArr3[1];
            float f26 = fArr3[2];
            float f27 = fArr3[3];
            float f28 = fArr3[4];
            float f29 = fArr3[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f28, f29);
                    f24 = f28;
                    f26 = f24;
                    f25 = f29;
                    f27 = f25;
                    break;
            }
            i = 2;
            float f30 = f28;
            float f31 = f29;
            float f32 = f24;
            float f33 = f25;
            int i9 = 0;
            while (i9 < fArr4.length) {
                if (c6 != 'A') {
                    if (c6 != 'C') {
                        if (c6 == 'H') {
                            i2 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i10 = i2 + 0;
                            path2.lineTo(fArr[i10], f33);
                            f32 = fArr[i10];
                        } else if (c6 == 'Q') {
                            i6 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i11 = i6 + 0;
                            int i12 = i6 + 1;
                            int i13 = i6 + 2;
                            int i14 = i6 + 3;
                            path2.quadTo(fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                            f6 = fArr[i11];
                            f5 = fArr[i12];
                            f32 = fArr[i13];
                            f33 = fArr[i14];
                        } else if (c6 == 'V') {
                            i2 = i9;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                            int i15 = i2 + 0;
                            path2.lineTo(f32, fArr[i15]);
                            f33 = fArr[i15];
                        } else if (c6 != 'a') {
                            if (c6 != 'c') {
                                if (c6 == 'h') {
                                    i2 = i9;
                                    float f34 = f33;
                                    int i16 = i2 + 0;
                                    path2.rLineTo(fArr4[i16], 0.0f);
                                    f32 += fArr4[i16];
                                } else if (c6 != 'q') {
                                    if (c6 == 'v') {
                                        i2 = i9;
                                        f14 = f33;
                                        float f35 = f32;
                                        int i17 = i2 + 0;
                                        path2.rLineTo(0.0f, fArr4[i17]);
                                        f15 = fArr4[i17];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            i2 = i9;
                                            int i18 = i2 + 0;
                                            float f36 = fArr4[i18];
                                            int i19 = i2 + 1;
                                            float f37 = fArr4[i19];
                                            if (i2 > 0) {
                                                path2.lineTo(fArr4[i18], fArr4[i19]);
                                                f32 = f36;
                                                f33 = f37;
                                            } else {
                                                path2.moveTo(fArr4[i18], fArr4[i19]);
                                                f30 = f36;
                                                f31 = f37;
                                            }
                                        } else if (c6 == 'S') {
                                            i7 = i9;
                                            float f38 = f33;
                                            float f39 = f32;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f16 = (f38 * 2.0f) - f;
                                                f17 = (f39 * 2.0f) - f2;
                                            } else {
                                                f17 = f39;
                                                f16 = f38;
                                            }
                                            int i20 = i7 + 0;
                                            int i21 = i7 + 1;
                                            int i22 = i7 + 2;
                                            int i23 = i7 + 3;
                                            path.cubicTo(f17, f16, fArr4[i20], fArr4[i21], fArr4[i22], fArr4[i23]);
                                            float f40 = fArr4[i20];
                                            float f41 = fArr4[i21];
                                            f8 = fArr4[i22];
                                            f7 = fArr4[i23];
                                            f2 = f40;
                                            f = f41;
                                            f32 = f8;
                                            f33 = f7;
                                        } else if (c6 == 'T') {
                                            i2 = i9;
                                            float f42 = f33;
                                            float f43 = f32;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f18 = (f43 * 2.0f) - f2;
                                                f19 = (f42 * 2.0f) - f;
                                            } else {
                                                f18 = f43;
                                                f19 = f42;
                                            }
                                            int i24 = i2 + 0;
                                            int i25 = i2 + 1;
                                            path2.quadTo(f18, f19, fArr4[i24], fArr4[i25]);
                                            f = f19;
                                            f2 = f18;
                                            fArr = fArr4;
                                            c = c6;
                                            i3 = i8;
                                            f32 = fArr4[i24];
                                            f33 = fArr4[i25];
                                        } else if (c6 == 'l') {
                                            i2 = i9;
                                            f14 = f33;
                                            int i26 = i2 + 0;
                                            int i27 = i2 + 1;
                                            path2.rLineTo(fArr4[i26], fArr4[i27]);
                                            f32 += fArr4[i26];
                                            f15 = fArr4[i27];
                                        } else if (c6 == c3) {
                                            i2 = i9;
                                            int i28 = i2 + 0;
                                            f32 += fArr4[i28];
                                            int i29 = i2 + 1;
                                            f33 += fArr4[i29];
                                            if (i2 > 0) {
                                                path2.rLineTo(fArr4[i28], fArr4[i29]);
                                            } else {
                                                path2.rMoveTo(fArr4[i28], fArr4[i29]);
                                                f31 = f33;
                                                f30 = f32;
                                            }
                                        } else if (c6 != 's') {
                                            if (c6 == 't') {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f22 = f32 - f2;
                                                    f23 = f33 - f;
                                                } else {
                                                    f23 = 0.0f;
                                                    f22 = 0;
                                                }
                                                int i30 = i9 + 0;
                                                int i31 = i9 + 1;
                                                path2.rQuadTo(f22, f23, fArr4[i30], fArr4[i31]);
                                                float f44 = f22 + f32;
                                                float f45 = f23 + f33;
                                                f32 += fArr4[i30];
                                                f33 += fArr4[i31];
                                                f = f45;
                                                f2 = f44;
                                            }
                                            i2 = i9;
                                        } else {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f20 = f33 - f;
                                                f21 = f32 - f2;
                                            } else {
                                                f21 = 0.0f;
                                                f20 = 0.0f;
                                            }
                                            int i32 = i9 + 0;
                                            int i33 = i9 + 1;
                                            int i34 = i9 + 2;
                                            int i35 = i9 + 3;
                                            i7 = i9;
                                            f9 = f33;
                                            float f46 = f32;
                                            path.rCubicTo(f21, f20, fArr4[i32], fArr4[i33], fArr4[i34], fArr4[i35]);
                                            f12 = fArr4[i32] + f46;
                                            f11 = fArr4[i33] + f9;
                                            f10 = f46 + fArr4[i34];
                                            f13 = fArr4[i35];
                                        }
                                        f32 = f30;
                                        f33 = f31;
                                    } else {
                                        i2 = i9;
                                        int i36 = i2 + 0;
                                        int i37 = i2 + 1;
                                        path2.lineTo(fArr4[i36], fArr4[i37]);
                                        f32 = fArr4[i36];
                                        f33 = fArr4[i37];
                                    }
                                    f33 = f14 + f15;
                                } else {
                                    i7 = i9;
                                    f9 = f33;
                                    float f47 = f32;
                                    int i38 = i7 + 0;
                                    int i39 = i7 + 1;
                                    int i40 = i7 + 2;
                                    int i41 = i7 + 3;
                                    path2.rQuadTo(fArr4[i38], fArr4[i39], fArr4[i40], fArr4[i41]);
                                    f12 = fArr4[i38] + f47;
                                    f11 = fArr4[i39] + f9;
                                    float f48 = f47 + fArr4[i40];
                                    float f49 = fArr4[i41];
                                    f10 = f48;
                                    f13 = f49;
                                }
                                fArr = fArr4;
                                c = c6;
                                i3 = i8;
                            } else {
                                i7 = i9;
                                f9 = f33;
                                float f50 = f32;
                                int i42 = i7 + 2;
                                int i43 = i7 + 3;
                                int i44 = i7 + 4;
                                int i45 = i7 + 5;
                                path.rCubicTo(fArr4[i7 + 0], fArr4[i7 + 1], fArr4[i42], fArr4[i43], fArr4[i44], fArr4[i45]);
                                f12 = fArr4[i42] + f50;
                                f11 = fArr4[i43] + f9;
                                f10 = f50 + fArr4[i44];
                                f13 = fArr4[i45];
                            }
                            f7 = f9 + f13;
                            f2 = f12;
                            f = f11;
                            f8 = f10;
                            f32 = f8;
                            f33 = f7;
                            fArr = fArr4;
                            c = c6;
                            i3 = i8;
                        } else {
                            i4 = i9;
                            float f51 = f33;
                            float f52 = f32;
                            int i46 = i4 + 5;
                            float f53 = fArr4[i46] + f52;
                            int i47 = i4 + 6;
                            float f54 = fArr4[i47] + f51;
                            float f55 = fArr4[i4 + 0];
                            float f56 = fArr4[i4 + 1];
                            float f57 = fArr4[i4 + 2];
                            boolean z = fArr4[i4 + 3] != 0.0f;
                            boolean z2 = fArr4[i4 + 4] != 0.0f;
                            fArr2 = fArr4;
                            float f58 = f57;
                            c2 = c6;
                            i5 = i8;
                            m2779a(path, f52, f51, f53, f54, f55, f56, f58, z, z2);
                            f3 = f52 + fArr2[i46];
                            f4 = f51 + fArr2[i47];
                        }
                        i9 = i2 + i;
                        c5 = c;
                        c6 = c5;
                        fArr4 = fArr;
                        i8 = i3;
                        c3 = 'm';
                        C0958p6[] p6VarArr3 = p6VarArr;
                    } else {
                        i6 = i9;
                        fArr = fArr4;
                        c = c6;
                        i3 = i8;
                        int i48 = i6 + 2;
                        int i49 = i6 + 3;
                        int i50 = i6 + 4;
                        int i51 = i6 + 5;
                        path.cubicTo(fArr[i6 + 0], fArr[i6 + 1], fArr[i48], fArr[i49], fArr[i50], fArr[i51]);
                        float f59 = fArr[i50];
                        float f60 = fArr[i51];
                        f6 = fArr[i48];
                        f32 = f59;
                        f33 = f60;
                        f5 = fArr[i49];
                    }
                    f2 = f6;
                    f = f5;
                    i9 = i2 + i;
                    c5 = c;
                    c6 = c5;
                    fArr4 = fArr;
                    i8 = i3;
                    c3 = 'm';
                    C0958p6[] p6VarArr32 = p6VarArr;
                } else {
                    i4 = i9;
                    fArr2 = fArr4;
                    c2 = c6;
                    i5 = i8;
                    int i52 = i4 + 5;
                    int i53 = i4 + 6;
                    m2779a(path, f32, f33, fArr2[i52], fArr2[i53], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                    f3 = fArr2[i52];
                    f4 = fArr2[i53];
                }
                f = f33;
                f2 = f32;
                i9 = i2 + i;
                c5 = c;
                c6 = c5;
                fArr4 = fArr;
                i8 = i3;
                c3 = 'm';
                C0958p6[] p6VarArr322 = p6VarArr;
            }
            int i54 = i8;
            fArr3[0] = f32;
            fArr3[1] = f33;
            fArr3[2] = f2;
            fArr3[3] = f;
            fArr3[4] = f30;
            fArr3[5] = f31;
            i8 = i54 + 1;
            c5 = p6VarArr[i54].f3567a;
            c3 = 'm';
            c4 = 0;
            p6VarArr2 = p6VarArr;
        }
    }
}
