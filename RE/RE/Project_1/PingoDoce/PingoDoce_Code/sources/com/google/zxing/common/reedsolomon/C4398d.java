package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.reedsolomon.d */
/* loaded from: classes2.dex */
public final class C4398d {

    /* renamed from: a */
    private final C4395a f11912a;

    /* renamed from: b */
    private final List<C4396b> f11913b;

    public C4398d(C4395a c4395a) {
        this.f11912a = c4395a;
        ArrayList arrayList = new ArrayList();
        this.f11913b = arrayList;
        arrayList.add(new C4396b(c4395a, new int[]{1}));
    }

    /* renamed from: a */
    private C4396b m27666a(int i) {
        if (i >= this.f11913b.size()) {
            List<C4396b> list = this.f11913b;
            C4396b c4396b = list.get(list.size() - 1);
            for (int size = this.f11913b.size(); size <= i; size++) {
                C4395a c4395a = this.f11912a;
                c4396b = c4396b.m27672i(new C4396b(c4395a, new int[]{1, c4395a.m27688c((size - 1) + c4395a.m27687d())}));
                this.f11913b.add(c4396b);
            }
        }
        return this.f11913b.get(i);
    }

    /* renamed from: b */
    public void m27665b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C4396b m27666a = m27666a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m27676e = new C4396b(this.f11912a, iArr2).m27671j(i, 1).m27679b(m27666a)[1].m27676e();
                int length2 = i - m27676e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(m27676e, 0, iArr, length + length2, m27676e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
