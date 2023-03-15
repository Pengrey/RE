package org.threeten.p283bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import p405vf.AbstractC11248a;

/* renamed from: org.threeten.bp.chrono.q */
/* loaded from: classes2.dex */
public final class C8201q extends AbstractC11248a implements Serializable {

    /* renamed from: A */
    public static final C8201q f21341A;

    /* renamed from: B */
    public static final C8201q f21342B;

    /* renamed from: C */
    public static final C8201q f21343C;

    /* renamed from: D */
    public static final C8201q f21344D;

    /* renamed from: E */
    private static final AtomicReference<C8201q[]> f21345E;

    /* renamed from: z */
    public static final C8201q f21346z;

    /* renamed from: w */
    private final int f21347w;

    /* renamed from: x */
    private final transient C8213d f21348x;

    /* renamed from: y */
    private final transient String f21349y;

    static {
        C8201q c8201q = new C8201q(-1, C8213d.m16193O(1868, 9, 8), "Meiji");
        f21346z = c8201q;
        C8201q c8201q2 = new C8201q(0, C8213d.m16193O(1912, 7, 30), "Taisho");
        f21341A = c8201q2;
        C8201q c8201q3 = new C8201q(1, C8213d.m16193O(1926, 12, 25), "Showa");
        f21342B = c8201q3;
        C8201q c8201q4 = new C8201q(2, C8213d.m16193O(1989, 1, 8), "Heisei");
        f21343C = c8201q4;
        C8201q c8201q5 = new C8201q(3, C8213d.m16193O(2019, 5, 1), "Reiwa");
        f21344D = c8201q5;
        f21345E = new AtomicReference<>(new C8201q[]{c8201q, c8201q2, c8201q3, c8201q4, c8201q5});
    }

    private C8201q(int i, C8213d c8213d, String str) {
        this.f21347w = i;
        this.f21348x = c8213d;
        this.f21349y = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C8201q m16264i(C8213d c8213d) {
        if (!c8213d.mo16170m(f21346z.f21348x)) {
            C8201q[] c8201qArr = f21345E.get();
            for (int length = c8201qArr.length - 1; length >= 0; length--) {
                C8201q c8201q = c8201qArr[length];
                if (c8213d.compareTo(c8201q.f21348x) >= 0) {
                    return c8201q;
                }
            }
            return null;
        }
        throw new DateTimeException("Date too early: " + c8213d);
    }

    /* renamed from: j */
    public static C8201q m16263j(int i) {
        C8201q[] c8201qArr = f21345E.get();
        if (i >= f21346z.f21347w && i <= c8201qArr[c8201qArr.length - 1].f21347w) {
            return c8201qArr[m16262k(i)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    /* renamed from: k */
    private static int m16262k(int i) {
        return i + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static C8201q m16261l(DataInput dataInput) throws IOException {
        return m16263j(dataInput.readByte());
    }

    /* renamed from: n */
    public static C8201q[] m16259n() {
        C8201q[] c8201qArr = f21345E.get();
        return (C8201q[]) Arrays.copyOf(c8201qArr, c8201qArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return m16263j(this.f21347w);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new C8207u((byte) 2, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C8213d m16265g() {
        int m16262k = m16262k(this.f21347w);
        C8201q[] m16259n = m16259n();
        if (m16262k >= m16259n.length - 1) {
            return C8213d.f21361A;
        }
        return m16259n[m16262k + 1].m16260m().m16196L(1L);
    }

    @Override // org.threeten.p283bp.chrono.InterfaceC8190i
    public int getValue() {
        return this.f21347w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C8213d m16260m() {
        return this.f21348x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m16258o(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        EnumC8288a enumC8288a = EnumC8288a.ERA;
        if (interfaceC8304h == enumC8288a) {
            return C8197o.f21334z.m16282w(enumC8288a);
        }
        return super.range(interfaceC8304h);
    }

    public String toString() {
        return this.f21349y;
    }
}
