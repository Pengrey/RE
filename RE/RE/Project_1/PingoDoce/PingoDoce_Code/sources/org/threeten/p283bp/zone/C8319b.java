package org.threeten.p283bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.zone.AbstractC8326f;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.zone.b */
/* loaded from: classes2.dex */
final class C8319b extends AbstractC8326f implements Serializable {

    /* renamed from: A */
    private final C8282o[] f21537A;

    /* renamed from: B */
    private final C8323e[] f21538B;

    /* renamed from: C */
    private final ConcurrentMap<Integer, C8322d[]> f21539C = new ConcurrentHashMap();

    /* renamed from: w */
    private final long[] f21540w;

    /* renamed from: x */
    private final C8282o[] f21541x;

    /* renamed from: y */
    private final long[] f21542y;

    /* renamed from: z */
    private final C8216e[] f21543z;

    private C8319b(long[] jArr, C8282o[] c8282oArr, long[] jArr2, C8282o[] c8282oArr2, C8323e[] c8323eArr) {
        this.f21540w = jArr;
        this.f21541x = c8282oArr;
        this.f21542y = jArr2;
        this.f21537A = c8282oArr2;
        this.f21538B = c8323eArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            C8322d c8322d = new C8322d(jArr2[i], c8282oArr2[i], c8282oArr2[i2]);
            if (c8322d.m15793k()) {
                arrayList.add(c8322d.m15800d());
                arrayList.add(c8322d.m15801c());
            } else {
                arrayList.add(c8322d.m15801c());
                arrayList.add(c8322d.m15800d());
            }
            i = i2;
        }
        this.f21543z = (C8216e[]) arrayList.toArray(new C8216e[arrayList.size()]);
    }

    /* renamed from: h */
    private Object m15816h(C8216e c8216e, C8322d c8322d) {
        C8216e m15800d = c8322d.m15800d();
        if (c8322d.m15793k()) {
            if (c8216e.mo16134l(m15800d)) {
                return c8322d.m15795i();
            }
            return c8216e.mo16134l(c8322d.m15801c()) ? c8322d : c8322d.m15796h();
        } else if (c8216e.mo16134l(m15800d)) {
            return c8216e.mo16134l(c8322d.m15801c()) ? c8322d.m15795i() : c8322d;
        } else {
            return c8322d.m15796h();
        }
    }

    /* renamed from: i */
    private C8322d[] m15815i(int i) {
        Integer valueOf = Integer.valueOf(i);
        C8322d[] c8322dArr = this.f21539C.get(valueOf);
        if (c8322dArr != null) {
            return c8322dArr;
        }
        C8323e[] c8323eArr = this.f21538B;
        C8322d[] c8322dArr2 = new C8322d[c8323eArr.length];
        for (int i2 = 0; i2 < c8323eArr.length; i2++) {
            c8322dArr2[i2] = c8323eArr[i2].m15788b(i);
        }
        if (i < 2100) {
            this.f21539C.putIfAbsent(valueOf, c8322dArr2);
        }
        return c8322dArr2;
    }

    /* renamed from: j */
    private int m15814j(long j, C8282o c8282o) {
        return C8213d.m16191Q(C11251d.m5627e(j + c8282o.m15925r(), 86400L)).getYear();
    }

    /* renamed from: k */
    private Object m15813k(C8216e c8216e) {
        int i = 0;
        if (this.f21538B.length > 0) {
            C8216e[] c8216eArr = this.f21543z;
            if (c8216eArr.length == 0 || c8216e.mo16135k(c8216eArr[c8216eArr.length - 1])) {
                C8322d[] m15815i = m15815i(c8216e.getYear());
                Object obj = null;
                int length = m15815i.length;
                while (i < length) {
                    C8322d c8322d = m15815i[i];
                    Object m15816h = m15816h(c8216e, c8322d);
                    if ((m15816h instanceof C8322d) || m15816h.equals(c8322d.m15795i())) {
                        return m15816h;
                    }
                    i++;
                    obj = m15816h;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f21543z, c8216e);
        if (binarySearch == -1) {
            return this.f21537A[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            C8216e[] c8216eArr2 = this.f21543z;
            if (binarySearch < c8216eArr2.length - 1) {
                int i2 = binarySearch + 1;
                if (c8216eArr2[binarySearch].equals(c8216eArr2[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) == 0) {
            C8216e[] c8216eArr3 = this.f21543z;
            C8216e c8216e2 = c8216eArr3[binarySearch];
            C8216e c8216e3 = c8216eArr3[binarySearch + 1];
            C8282o[] c8282oArr = this.f21537A;
            int i3 = binarySearch / 2;
            C8282o c8282o = c8282oArr[i3];
            C8282o c8282o2 = c8282oArr[i3 + 1];
            if (c8282o2.m15925r() > c8282o.m15925r()) {
                return new C8322d(c8216e2, c8282o, c8282o2);
            }
            return new C8322d(c8216e3, c8282o, c8282o2);
        }
        return this.f21537A[(binarySearch / 2) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C8319b m15811m(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = C8318a.m15822b(dataInput);
        }
        int i2 = readInt + 1;
        C8282o[] c8282oArr = new C8282o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            c8282oArr[i3] = C8318a.m15820d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = C8318a.m15822b(dataInput);
        }
        int i5 = readInt2 + 1;
        C8282o[] c8282oArr2 = new C8282o[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            c8282oArr2[i6] = C8318a.m15820d(dataInput);
        }
        int readByte = dataInput.readByte();
        C8323e[] c8323eArr = new C8323e[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            c8323eArr[i7] = C8323e.m15787c(dataInput);
        }
        return new C8319b(jArr, c8282oArr, jArr2, c8282oArr2, c8323eArr);
    }

    private Object writeReplace() {
        return new C8318a((byte) 1, this);
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: a */
    public C8282o mo15784a(C8171c c8171c) {
        C8282o[] c8282oArr;
        long m16391k = c8171c.m16391k();
        if (this.f21538B.length > 0) {
            long[] jArr = this.f21542y;
            if (jArr.length == 0 || m16391k > jArr[jArr.length - 1]) {
                C8322d[] m15815i = m15815i(m15814j(m16391k, this.f21537A[c8282oArr.length - 1]));
                C8322d c8322d = null;
                for (int i = 0; i < m15815i.length; i++) {
                    c8322d = m15815i[i];
                    if (m16391k < c8322d.m15791m()) {
                        return c8322d.m15795i();
                    }
                }
                return c8322d.m15796h();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f21542y, m16391k);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f21537A[binarySearch + 1];
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: b */
    public C8322d mo15783b(C8216e c8216e) {
        Object m15813k = m15813k(c8216e);
        if (m15813k instanceof C8322d) {
            return (C8322d) m15813k;
        }
        return null;
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: c */
    public List<C8282o> mo15782c(C8216e c8216e) {
        Object m15813k = m15813k(c8216e);
        if (m15813k instanceof C8322d) {
            return ((C8322d) m15813k).m15794j();
        }
        return Collections.singletonList((C8282o) m15813k);
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: d */
    public boolean mo15781d(C8171c c8171c) {
        return !m15812l(c8171c).equals(mo15784a(c8171c));
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: e */
    public boolean mo15780e() {
        return this.f21542y.length == 0 && this.f21538B.length == 0 && this.f21537A[0].equals(this.f21541x[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8319b) {
            C8319b c8319b = (C8319b) obj;
            return Arrays.equals(this.f21540w, c8319b.f21540w) && Arrays.equals(this.f21541x, c8319b.f21541x) && Arrays.equals(this.f21542y, c8319b.f21542y) && Arrays.equals(this.f21537A, c8319b.f21537A) && Arrays.equals(this.f21538B, c8319b.f21538B);
        } else if (obj instanceof AbstractC8326f.C8327a) {
            if (mo15780e()) {
                C8171c c8171c = C8171c.f21276y;
                if (mo15784a(c8171c).equals(((AbstractC8326f.C8327a) obj).mo15784a(c8171c))) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // org.threeten.p283bp.zone.AbstractC8326f
    /* renamed from: f */
    public boolean mo15779f(C8216e c8216e, C8282o c8282o) {
        return mo15782c(c8216e).contains(c8282o);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f21540w) ^ Arrays.hashCode(this.f21541x)) ^ Arrays.hashCode(this.f21542y)) ^ Arrays.hashCode(this.f21537A)) ^ Arrays.hashCode(this.f21538B);
    }

    /* renamed from: l */
    public C8282o m15812l(C8171c c8171c) {
        int binarySearch = Arrays.binarySearch(this.f21540w, c8171c.m16391k());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f21541x[binarySearch + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m15810n(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f21540w.length);
        for (long j : this.f21540w) {
            C8318a.m15819e(j, dataOutput);
        }
        for (C8282o c8282o : this.f21541x) {
            C8318a.m15817g(c8282o, dataOutput);
        }
        dataOutput.writeInt(this.f21542y.length);
        for (long j2 : this.f21542y) {
            C8318a.m15819e(j2, dataOutput);
        }
        for (C8282o c8282o2 : this.f21537A) {
            C8318a.m15817g(c8282o2, dataOutput);
        }
        dataOutput.writeByte(this.f21538B.length);
        for (C8323e c8323e : this.f21538B) {
            c8323e.m15786d(dataOutput);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StandardZoneRules[currentStandardOffset=");
        C8282o[] c8282oArr = this.f21541x;
        sb2.append(c8282oArr[c8282oArr.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}
