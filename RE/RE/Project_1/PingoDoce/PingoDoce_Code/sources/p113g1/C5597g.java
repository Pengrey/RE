package p113g1;

import java.util.ArrayList;
import java.util.List;
import p093f1.C5279e;
import p093f1.C5318u;
import p181jd.Intrinsics;

/* compiled from: VelocityTracker.kt */
/* renamed from: g1.g */
/* loaded from: classes.dex */
public final class C5597g {
    /* renamed from: a */
    public static final void m23617a(C5596f c5596f, C5318u c5318u) {
        Intrinsics.isThisObjectNull(c5596f, "<this>");
        Intrinsics.isThisObjectNull(c5318u, "event");
        List m24653f = c5318u.m24653f();
        int size = m24653f.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C5279e c5279e = (C5279e) m24653f.get(i);
            c5596f.m23620a(c5279e.m24813b(), c5279e.m24814a());
            i = i2;
        }
        c5596f.m23620a(c5318u.m24645n(), c5318u.m24651h());
    }

    /* renamed from: b */
    public static final VelocityTracker m23616b(List list, List list2, int i) {
        Intrinsics.isThisObjectNull(list, "x");
        Intrinsics.isThisObjectNull(list2, "y");
        if (i >= 1) {
            if (list.size() == list2.size()) {
                if (!list.isEmpty()) {
                    int size = i >= list.size() ? list.size() - 1 : i;
                    int i2 = i + 1;
                    ArrayList arrayList = new ArrayList(i2);
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < i2) {
                        i4++;
                        arrayList.add(Float.valueOf(0.0f));
                    }
                    int size2 = list.size();
                    int i5 = size + 1;
                    C5591a c5591a = new C5591a(i5, size2);
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            break;
                        }
                        int i7 = i6 + 1;
                        c5591a.m23632c(0, i6, 1.0f);
                        for (int i8 = 1; i8 < i5; i8++) {
                            c5591a.m23632c(i8, i6, c5591a.m23634a(i8 - 1, i6) * ((Number) list.get(i6)).floatValue());
                        }
                        i6 = i7;
                    }
                    C5591a c5591a2 = new C5591a(i5, size2);
                    C5591a c5591a3 = new C5591a(i5, i5);
                    int i9 = 0;
                    while (i9 < i5) {
                        int i10 = i9 + 1;
                        for (int i11 = i3; i11 < size2; i11++) {
                            c5591a2.m23632c(i9, i11, c5591a.m23634a(i9, i11));
                        }
                        int i12 = i3;
                        while (i12 < i9) {
                            int i13 = i12 + 1;
                            float m23624d = c5591a2.m23633b(i9).m23624d(c5591a2.m23633b(i12));
                            int i14 = i3;
                            while (i14 < size2) {
                                c5591a2.m23632c(i9, i14, c5591a2.m23634a(i9, i14) - (c5591a2.m23634a(i12, i14) * m23624d));
                                i14++;
                                i3 = 0;
                            }
                            i12 = i13;
                        }
                        float m23626b = c5591a2.m23633b(i9).m23626b();
                        if (m23626b < 1.0E-6d) {
                            throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                        }
                        float f = 1.0f / m23626b;
                        for (int i15 = 0; i15 < size2; i15++) {
                            c5591a2.m23632c(i9, i15, c5591a2.m23634a(i9, i15) * f);
                        }
                        int i16 = 0;
                        while (i16 < i5) {
                            int i17 = i16 + 1;
                            c5591a3.m23632c(i9, i16, i16 < i9 ? 0.0f : c5591a2.m23633b(i9).m23624d(c5591a.m23633b(i16)));
                            i16 = i17;
                        }
                        i9 = i10;
                        i3 = 0;
                    }
                    C5593d c5593d = new C5593d(size2);
                    for (int i18 = 0; i18 < size2; i18++) {
                        c5593d.m23625c(i18, ((Number) list2.get(i18)).floatValue() * 1.0f);
                    }
                    int i19 = i5 - 1;
                    if (i19 >= 0) {
                        int i20 = i19;
                        while (true) {
                            int i21 = i20 - 1;
                            arrayList.set(i20, Float.valueOf(c5591a2.m23633b(i20).m23624d(c5593d)));
                            int i22 = i20 + 1;
                            if (i22 <= i19) {
                                int i23 = i19;
                                while (true) {
                                    int i24 = i23 - 1;
                                    arrayList.set(i20, Float.valueOf(((Number) arrayList.get(i20)).floatValue() - (c5591a3.m23634a(i20, i23) * ((Number) arrayList.get(i23)).floatValue())));
                                    if (i23 == i22) {
                                        break;
                                    }
                                    i23 = i24;
                                }
                            }
                            arrayList.set(i20, Float.valueOf(((Number) arrayList.get(i20)).floatValue() / c5591a3.m23634a(i20, i20)));
                            if (i21 < 0) {
                                break;
                            }
                            i20 = i21;
                        }
                    }
                    float f2 = 0.0f;
                    for (int i25 = 0; i25 < size2; i25++) {
                        f2 += ((Number) list2.get(i25)).floatValue();
                    }
                    float f3 = f2 / size2;
                    float f4 = 0.0f;
                    int i26 = 0;
                    float f5 = 0.0f;
                    while (i26 < size2) {
                        int i27 = i26 + 1;
                        float floatValue = ((Number) list2.get(i26)).floatValue() - ((Number) arrayList.get(0)).floatValue();
                        float f6 = 1.0f;
                        for (int i28 = 1; i28 < i5; i28++) {
                            f6 *= ((Number) list.get(i26)).floatValue();
                            floatValue -= ((Number) arrayList.get(i28)).floatValue() * f6;
                        }
                        f4 += floatValue * 1.0f * floatValue;
                        float floatValue2 = ((Number) list2.get(i26)).floatValue() - f3;
                        f5 += floatValue2 * 1.0f * floatValue2;
                        i26 = i27;
                    }
                    return new VelocityTracker(arrayList, f5 > 1.0E-6f ? 1.0f - (f4 / f5) : 1.0f);
                }
                throw new IllegalArgumentException("At least one point must be provided");
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}
