package org.threeten.p283bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8219f;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8314k;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: org.threeten.bp.chrono.p */
/* loaded from: classes2.dex */
public final class C8199p extends AbstractC8174a<C8199p> {

    /* renamed from: z */
    static final C8213d f21336z = C8213d.m16193O(1873, 1, 1);

    /* renamed from: w */
    private final C8213d f21337w;

    /* renamed from: x */
    private transient C8201q f21338x;

    /* renamed from: y */
    private transient int f21339y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JapaneseDate.java */
    /* renamed from: org.threeten.bp.chrono.p$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8200a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21340a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21340a = iArr;
            try {
                iArr[EnumC8288a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21340a[EnumC8288a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21340a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21340a[EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21340a[EnumC8288a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21340a[EnumC8288a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21340a[EnumC8288a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8199p(C8213d c8213d) {
        if (!c8213d.mo16170m(f21336z)) {
            C8201q m16264i = C8201q.m16264i(c8213d);
            this.f21338x = m16264i;
            this.f21339y = c8213d.getYear() - (m16264i.m16260m().getYear() - 1);
            this.f21337w = c8213d;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    /* renamed from: B */
    private long m16280B() {
        int dayOfYear;
        if (this.f21339y == 1) {
            dayOfYear = (this.f21337w.getDayOfYear() - this.f21338x.m16260m().getDayOfYear()) + 1;
        } else {
            dayOfYear = this.f21337w.getDayOfYear();
        }
        return dayOfYear;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static AbstractC8176b m16273J(DataInput dataInput) throws IOException {
        return C8197o.f21334z.m16286s(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: K */
    private C8199p m16272K(C8213d c8213d) {
        return c8213d.equals(this.f21337w) ? this : new C8199p(c8213d);
    }

    /* renamed from: N */
    private C8199p m16269N(int i) {
        return m16268O(mo16172k(), i);
    }

    /* renamed from: O */
    private C8199p m16268O(C8201q c8201q, int i) {
        return m16272K(this.f21337w.m16177e0(C8197o.f21334z.m16283v(c8201q, i)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        C8201q m16264i = C8201q.m16264i(this.f21337w);
        this.f21338x = m16264i;
        this.f21339y = this.f21337w.getYear() - (m16264i.m16260m().getYear() - 1);
    }

    private Object writeReplace() {
        return new C8207u((byte) 1, this);
    }

    /* renamed from: z */
    private C8315l m16266z(int i) {
        Calendar calendar = Calendar.getInstance(C8197o.f21333y);
        calendar.set(0, this.f21338x.getValue() + 2);
        calendar.set(this.f21339y, this.f21337w.m16202F() - 1, this.f21337w.getDayOfMonth());
        return C8315l.m15846i(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: A */
    public C8197o mo16173j() {
        return C8197o.f21334z;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: C */
    public C8201q mo16172k() {
        return this.f21338x;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: D */
    public C8199p mo16169n(long j, InterfaceC8314k interfaceC8314k) {
        return (C8199p) super.mo5632d(j, interfaceC8314k);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: F */
    public C8199p mo16212s(long j, InterfaceC8314k interfaceC8314k) {
        return (C8199p) super.mo16168o(j, interfaceC8314k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: G */
    public C8199p mo16211u(long j) {
        return m16272K(this.f21337w.m16188T(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: H */
    public C8199p mo16210w(long j) {
        return m16272K(this.f21337w.m16187U(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.p283bp.chrono.AbstractC8174a
    /* renamed from: I */
    public C8199p mo16209x(long j) {
        return m16272K(this.f21337w.m16185W(j));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: L */
    public C8199p mo16166q(InterfaceC8300f interfaceC8300f) {
        return (C8199p) super.mo5633b(interfaceC8300f);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: M */
    public C8199p mo16165r(InterfaceC8304h interfaceC8304h, long j) {
        if (interfaceC8304h instanceof EnumC8288a) {
            EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
            if (getLong(enumC8288a) == j) {
                return this;
            }
            int[] iArr = C8200a.f21340a;
            int i = iArr[enumC8288a.ordinal()];
            if (i == 1 || i == 2 || i == 7) {
                int m15854a = mo16173j().m16282w(enumC8288a).m15854a(j, enumC8288a);
                int i2 = iArr[enumC8288a.ordinal()];
                if (i2 == 1) {
                    return m16272K(this.f21337w.m16188T(m15854a - m16280B()));
                }
                if (i2 == 2) {
                    return m16269N(m15854a);
                }
                if (i2 == 7) {
                    return m16268O(C8201q.m16263j(m15854a), this.f21339y);
                }
            }
            return m16272K(this.f21337w.mo16165r(interfaceC8304h, j));
        }
        return (C8199p) interfaceC8304h.adjustInto(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m16267P(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(EnumC8288a.YEAR));
        dataOutput.writeByte(get(EnumC8288a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(EnumC8288a.DAY_OF_MONTH));
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8199p) {
            return this.f21337w.equals(((C8199p) obj).f21337w);
        }
        return false;
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8174a, org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: g */
    public final AbstractC8178c<C8199p> mo16175g(C8219f c8219f) {
        return super.mo16175g(c8219f);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            switch (C8200a.f21340a[((EnumC8288a) interfaceC8304h).ordinal()]) {
                case 1:
                    return m16280B();
                case 2:
                    return this.f21339y;
                case 3:
                case 4:
                case 5:
                case 6:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
                case 7:
                    return this.f21338x.getValue();
                default:
                    return this.f21337w.getLong(interfaceC8304h);
            }
        }
        return interfaceC8304h.getFrom(this);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    public int hashCode() {
        return mo16173j().mo16233j().hashCode() ^ this.f21337w.hashCode();
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b, org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC8304h == EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC8304h == EnumC8288a.ALIGNED_WEEK_OF_MONTH || interfaceC8304h == EnumC8288a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(interfaceC8304h);
    }

    @Override // org.threeten.p283bp.chrono.AbstractC8176b
    /* renamed from: p */
    public long mo16167p() {
        return this.f21337w.mo16167p();
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h instanceof EnumC8288a) {
            if (isSupported(interfaceC8304h)) {
                EnumC8288a enumC8288a = (EnumC8288a) interfaceC8304h;
                int i = C8200a.f21340a[enumC8288a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return mo16173j().m16282w(enumC8288a);
                    }
                    return m16266z(1);
                }
                return m16266z(6);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
        }
        return interfaceC8304h.rangeRefinedBy(this);
    }
}
