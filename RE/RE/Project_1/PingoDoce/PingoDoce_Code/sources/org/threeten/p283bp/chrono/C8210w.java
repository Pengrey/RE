package org.threeten.p283bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.chrono.w */
/* loaded from: classes2.dex */
public final class C8210w extends AbstractC8174a<C8210w> {

    /* renamed from: w */
    private final C8213d f21358w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ThaiBuddhistDate.java */
    /* renamed from: org.threeten.bp.chrono.w$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8211a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21359a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21359a = iArr;
            try {
                iArr[EnumC8288a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21359a[EnumC8288a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21359a[EnumC8288a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21359a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21359a[EnumC8288a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21359a[EnumC8288a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21359a[EnumC8288a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8210w(C8213d c8213d) {
        C11251d.m5623i(c8213d, "date");
        this.f21358w = c8213d;
    }

    /* renamed from: B */
    private long m16224B() {
        return ((m16223C() * 12) + this.f21358w.m16202F()) - 1;
    }

    /* renamed from: C */
    private int m16223C() {
        return this.f21358w.getYear() + 543;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static AbstractC8176b m16217J(DataInput dataInput) throws IOException {
        return C8208v.f21356y.m16229s(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: K */
    private C8210w m16216K(C8213d c8213d) {
        return c8213d.equals(this.f21358w) ? this : new C8210w(c8213d);
    }

    private Object writeReplace() {
        return new C8207u((byte) 7, this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: A */
    public EnumC8212x mo16172k() {
        return (EnumC8212x) super.mo16172k();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: D */
    public C8210w mo16169n(long j, InterfaceC8314k interfaceC8314k) {
        return (C8210w) super.mo5632d(j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: F */
    public C8210w mo16212s(long j, InterfaceC8314k interfaceC8314k) {
        return (C8210w) super.mo16168o(j, interfaceC8314k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: G */
    public C8210w mo16211u(long j) {
        return m16216K(this.f21358w.m16188T(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: H */
    public C8210w mo16210w(long j) {
        return m16216K(this.f21358w.m16187U(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: I */
    public C8210w mo16209x(long j) {
        return m16216K(this.f21358w.m16185W(j));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: L */
    public C8210w mo16166q(InterfaceC8300f interfaceC8300f) {
        return (C8210w) super.mo5633b(interfaceC8300f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.threeten.p283bp.chrono.C8210w mo16165r(org.threeten.p283bp.temporal.InterfaceC8304h r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof org.threeten.p283bp.temporal.EnumC8288a
            if (r0 == 0) goto L93
            r0 = r8
            org.threeten.bp.temporal.a r0 = (org.threeten.p283bp.temporal.EnumC8288a) r0
            long r1 = r7.getLong(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = org.threeten.p283bp.chrono.C8210w.C8211a.f21359a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L3a
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L3a
            if (r2 == r3) goto L3a
            goto L53
        L25:
            org.threeten.bp.chrono.v r8 = r7.mo16173j()
            org.threeten.bp.temporal.l r8 = r8.m16226v(r0)
            r8.m15853b(r9, r0)
            long r0 = r7.m16224B()
            long r9 = r9 - r0
            org.threeten.bp.chrono.w r8 = r7.mo16210w(r9)
            return r8
        L3a:
            org.threeten.bp.chrono.v r2 = r7.mo16173j()
            org.threeten.bp.temporal.l r2 = r2.m16226v(r0)
            int r2 = r2.m15854a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L7d
            if (r0 == r4) goto L70
            if (r0 == r3) goto L5e
        L53:
            org.threeten.bp.d r0 = r7.f21358w
            org.threeten.bp.d r8 = r0.mo16165r(r8, r9)
            org.threeten.bp.chrono.w r8 = r7.m16216K(r8)
            return r8
        L5e:
            org.threeten.bp.d r8 = r7.f21358w
            int r9 = r7.m16223C()
            int r1 = r1 - r9
            int r1 = r1 + (-543)
            org.threeten.bp.d r8 = r8.m16177e0(r1)
            org.threeten.bp.chrono.w r8 = r7.m16216K(r8)
            return r8
        L70:
            org.threeten.bp.d r8 = r7.f21358w
            int r2 = r2 + (-543)
            org.threeten.bp.d r8 = r8.m16177e0(r2)
            org.threeten.bp.chrono.w r8 = r7.m16216K(r8)
            return r8
        L7d:
            org.threeten.bp.d r8 = r7.f21358w
            int r9 = r7.m16223C()
            if (r9 < r1) goto L86
            goto L88
        L86:
            int r2 = 1 - r2
        L88:
            int r2 = r2 + (-543)
            org.threeten.bp.d r8 = r8.m16177e0(r2)
            org.threeten.bp.chrono.w r8 = r7.m16216K(r8)
            return r8
        L93:
            org.threeten.bp.temporal.d r8 = r8.adjustInto(r7, r9)
            org.threeten.bp.chrono.w r8 = (org.threeten.p283bp.chrono.C8210w) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.p283bp.chrono.C8210w.mo16165r(org.threeten.bp.temporal.h, long):org.threeten.bp.chrono.w");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m16213N(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(EnumC8288a.YEAR));
        dataOutput.writeByte(get(EnumC8288a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(EnumC8288a.DAY_OF_MONTH));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8210w) {
            return this.f21358w.equals(((C8210w) obj).f21358w);
        }
        return false;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a, org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: g */
    public final AbstractC8178c<C8210w> mo16175g(C8219f c8219f) {
        return super.mo16175g(c8219f);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            int i = C8211a.f21359a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i == 4) {
                int m16223C = m16223C();
                if (m16223C < 1) {
                    m16223C = 1 - m16223C;
                }
                return m16223C;
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        return this.f21358w.getLong(interfaceC8304h);
                    }
                    return m16223C() < 1 ? 0 : 1;
                }
                return m16223C();
            } else {
                return m16224B();
            }
        }
        return interfaceC8304h.getFrom(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public int hashCode() {
        return mo16173j().mo16233j().hashCode() ^ this.f21358w.hashCode();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: p */
    public long mo16167p() {
        return this.f21358w.mo16167p();
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (isSupported(interfaceC8304h)) {
                EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
                int i = C8211a.f21359a[enumC8288a.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return this.f21358w.range(interfaceC8304h);
                }
                if (i != 4) {
                    return mo16173j().m16226v(enumC8288a);
                }
                C8315l range = EnumC8288a.YEAR.range();
                return C8315l.m15846i(1L, m16223C() <= 0 ? (-(range.m15851d() + 543)) + 1 : 543 + range.m15852c());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: z */
    public C8208v mo16173j() {
        return C8208v.f21356y;
    }
}
