package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.b */
/* loaded from: classes2.dex */
public final class C8170b implements Comparable<C8170b>, Serializable {

    /* renamed from: y */
    public static final C8170b f21273y = new C8170b(0, 0);

    /* renamed from: w */
    private final long f21274w;

    /* renamed from: x */
    private final int f21275x;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private C8170b(long j, int i) {
        this.f21274w = j;
        this.f21275x = i;
    }

    /* renamed from: c */
    private static C8170b m16406c(long j, int i) {
        if ((i | j) == 0) {
            return f21273y;
        }
        return new C8170b(j, i);
    }

    /* renamed from: e */
    public static C8170b m16404e(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return m16406c(j2, i);
    }

    /* renamed from: f */
    public static C8170b m16403f(long j) {
        return m16406c(j, 0);
    }

    /* renamed from: g */
    public static C8170b m16402g(long j, long j2) {
        return m16406c(C11251d.m5621k(j, C11251d.m5627e(j2, 1000000000L)), C11251d.m5625g(j2, 1000000000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C8170b m16401h(DataInput dataInput) throws IOException {
        return m16402g(dataInput.readLong(), dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 1, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C8170b c8170b) {
        int m5630b = C11251d.m5630b(this.f21274w, c8170b.f21274w);
        return m5630b != 0 ? m5630b : this.f21275x - c8170b.f21275x;
    }

    /* renamed from: d */
    public long m16405d() {
        return this.f21274w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8170b) {
            C8170b c8170b = (C8170b) obj;
            return this.f21274w == c8170b.f21274w && this.f21275x == c8170b.f21275x;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f21274w;
        return ((int) (j ^ (j >>> 32))) + (this.f21275x * 51);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m16400i(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f21274w);
        dataOutput.writeInt(this.f21275x);
    }

    public String toString() {
        if (this == f21273y) {
            return "PT0S";
        }
        long j = this.f21274w;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j2 != 0) {
            sb2.append(j2);
            sb2.append('H');
        }
        if (i != 0) {
            sb2.append(i);
            sb2.append('M');
        }
        if (i2 == 0 && this.f21275x == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i2 >= 0 || this.f21275x <= 0) {
            sb2.append(i2);
        } else if (i2 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i2 + 1);
        }
        if (this.f21275x > 0) {
            int length = sb2.length();
            if (i2 < 0) {
                sb2.append(2000000000 - this.f21275x);
            } else {
                sb2.append(this.f21275x + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
