package org.threeten.p283bp;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.p283bp.zone.AbstractC8326f;

/* renamed from: org.threeten.bp.o */
/* loaded from: classes2.dex */
public final class C8282o extends AbstractC8280n implements InterfaceC8299e, InterfaceC8300f, Comparable<C8282o> {

    /* renamed from: A */
    private static final ConcurrentMap<String, C8282o> f21485A;

    /* renamed from: B */
    public static final C8282o f21486B;

    /* renamed from: C */
    public static final C8282o f21487C;

    /* renamed from: D */
    public static final C8282o f21488D;

    /* renamed from: z */
    private static final ConcurrentMap<Integer, C8282o> f21489z;

    /* renamed from: x */
    private final int f21490x;

    /* renamed from: y */
    private final transient String f21491y;

    /* compiled from: ZoneOffset.java */
    /* renamed from: org.threeten.bp.o$a */
    /* loaded from: classes2.dex */
    class C8283a implements InterfaceC8313j<C8282o> {
        C8283a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8282o mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8282o.m15926q(interfaceC8299e);
        }
    }

    static {
        new C8283a();
        f21489z = new ConcurrentHashMap(16, 0.75f, 4);
        f21485A = new ConcurrentHashMap(16, 0.75f, 4);
        f21486B = m15922u(0);
        f21487C = m15922u(-64800);
        f21488D = m15922u(64800);
    }

    private C8282o(int i) {
        this.f21490x = i;
        this.f21491y = m15928o(i);
    }

    /* renamed from: o */
    private static String m15928o(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder();
        int i2 = abs / DateTimeConstants.SECONDS_PER_HOUR;
        int i3 = (abs / 60) % 60;
        sb2.append(i < 0 ? "-" : "+");
        sb2.append(i2 < 10 ? "0" : BuildConfig.VERSION_NAME);
        sb2.append(i2);
        sb2.append(i3 < 10 ? ":0" : ":");
        sb2.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            sb2.append(i4 >= 10 ? ":" : ":0");
            sb2.append(i4);
        }
        return sb2.toString();
    }

    /* renamed from: q */
    public static C8282o m15926q(InterfaceC8299e interfaceC8299e) {
        C8282o c8282o = (C8282o) interfaceC8299e.query(C8305i.m15866d());
        if (c8282o != null) {
            return c8282o;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.threeten.p283bp.C8282o m15924s(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p405vf.C11251d.m5623i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.o> r0 = org.threeten.p283bp.C8282o.f21485A
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.o r0 = (org.threeten.p283bp.C8282o) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L8a
            r4 = 5
            if (r0 == r4) goto L64
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5b
            r5 = 7
            if (r0 == r5) goto L4e
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = m15921v(r7, r2, r3)
            int r1 = m15921v(r7, r6, r2)
            int r2 = m15921v(r7, r5, r2)
            goto L90
        L37:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L4e:
            int r0 = m15921v(r7, r2, r3)
            int r1 = m15921v(r7, r1, r3)
            int r2 = m15921v(r7, r4, r3)
            goto L90
        L5b:
            int r0 = m15921v(r7, r2, r3)
            int r1 = m15921v(r7, r6, r2)
            goto L6c
        L64:
            int r0 = m15921v(r7, r2, r3)
            int r1 = m15921v(r7, r1, r3)
        L6c:
            r2 = r3
            goto L90
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L8a:
            int r0 = m15921v(r7, r2, r3)
            r1 = r3
            r2 = r1
        L90:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb4
            if (r3 != r5) goto L9d
            goto Lb4
        L9d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lb4:
            if (r3 != r5) goto Lbe
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.o r7 = m15923t(r7, r0, r1)
            return r7
        Lbe:
            org.threeten.bp.o r7 = m15923t(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.p283bp.C8282o.m15924s(java.lang.String):org.threeten.bp.o");
    }

    /* renamed from: t */
    public static C8282o m15923t(int i, int i2, int i3) {
        m15918y(i, i2, i3);
        return m15922u(m15919x(i, i2, i3));
    }

    /* renamed from: u */
    public static C8282o m15922u(int i) {
        if (Math.abs(i) <= 64800) {
            if (i % 900 == 0) {
                Integer valueOf = Integer.valueOf(i);
                ConcurrentMap<Integer, C8282o> concurrentMap = f21489z;
                C8282o c8282o = concurrentMap.get(valueOf);
                if (c8282o == null) {
                    concurrentMap.putIfAbsent(valueOf, new C8282o(i));
                    C8282o c8282o2 = concurrentMap.get(valueOf);
                    f21485A.putIfAbsent(c8282o2.mo15915h(), c8282o2);
                    return c8282o2;
                }
                return c8282o;
            }
            return new C8282o(i);
        }
        throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* renamed from: v */
    private static int m15921v(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
            throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
        }
        return ((charAt - '0') * 10) + (charAt2 - '0');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static C8282o m15920w(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? m15922u(dataInput.readInt()) : m15922u(readByte * 900);
    }

    private Object writeReplace() {
        return new C8273k((byte) 8, this);
    }

    /* renamed from: x */
    private static int m15919x(int i, int i2, int i3) {
        return (i * DateTimeConstants.SECONDS_PER_HOUR) + (i2 * 60) + i3;
    }

    /* renamed from: y */
    private static void m15918y(int i, int i2, int i3) {
        if (i >= -18 && i <= 18) {
            if (i > 0) {
                if (i2 < 0 || i3 < 0) {
                    throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
                }
            } else if (i < 0) {
                if (i2 > 0 || i3 > 0) {
                    throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
                }
            } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
                throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
            }
            if (Math.abs(i2) <= 59) {
                if (Math.abs(i3) <= 59) {
                    if (Math.abs(i) == 18) {
                        if (Math.abs(i2) > 0 || Math.abs(i3) > 0) {
                            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
                        }
                        return;
                    }
                    return;
                }
                throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
            }
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i2) + " is not in the range 0 to 59");
        }
        throw new DateTimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        return interfaceC8298d.mo15874c(EnumC8288a.OFFSET_SECONDS, this.f21490x);
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8282o) && this.f21490x == ((C8282o) obj).f21490x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
            return this.f21490x;
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
            return this.f21490x;
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.getFrom(this);
        }
        throw new DateTimeException("Unsupported field: " + interfaceC8304h);
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: h */
    public String mo15915h() {
        return this.f21491y;
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    public int hashCode() {
        return this.f21490x;
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: i */
    public AbstractC8326f mo15914i() {
        return AbstractC8326f.m15785g(this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.OFFSET_SECONDS : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.AbstractC8280n
    /* renamed from: n */
    public void mo15913n(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        m15917z(dataOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: p */
    public int compareTo(C8282o c8282o) {
        return c8282o.f21490x - this.f21490x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15866d() || interfaceC8313j == C8305i.m15864f()) {
            return this;
        }
        if (interfaceC8313j == C8305i.m15868b() || interfaceC8313j == C8305i.m15867c() || interfaceC8313j == C8305i.m15865e() || interfaceC8313j == C8305i.m15869a() || interfaceC8313j == C8305i.m15863g()) {
            return null;
        }
        return interfaceC8313j.mo16124b(this);
    }

    /* renamed from: r */
    public int m15925r() {
        return this.f21490x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.OFFSET_SECONDS) {
            return interfaceC8304h.range();
        }
        if (!(interfaceC8304h instanceof EnumC8288a)) {
            return interfaceC8304h.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
    }

    @Override // org.threeten.p283bp.AbstractC8280n
    public String toString() {
        return this.f21491y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m15917z(DataOutput dataOutput) throws IOException {
        int i = this.f21490x;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}
