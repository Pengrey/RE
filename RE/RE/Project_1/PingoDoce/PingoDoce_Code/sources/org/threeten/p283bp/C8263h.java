package org.threeten.p283bp;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.chrono.C8195m;
import org.threeten.p283bp.format.C8226c;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8298d;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8300f;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import org.threeten.p283bp.temporal.UnsupportedTemporalTypeException;
import p405vf.AbstractC11250c;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.h */
/* loaded from: classes2.dex */
public final class C8263h extends AbstractC11250c implements InterfaceC8299e, InterfaceC8300f, Comparable<C8263h> {

    /* renamed from: w */
    private final int f21466w;

    /* renamed from: x */
    private final int f21467x;

    /* compiled from: MonthDay.java */
    /* renamed from: org.threeten.bp.h$a */
    /* loaded from: classes2.dex */
    class C8264a implements InterfaceC8313j<C8263h> {
        C8264a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public C8263h mo16124b(InterfaceC8299e interfaceC8299e) {
            return C8263h.m16005i(interfaceC8299e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthDay.java */
    /* renamed from: org.threeten.bp.h$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8265b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21468a;

        static {
            int[] iArr = new int[EnumC8288a.values().length];
            f21468a = iArr;
            try {
                iArr[EnumC8288a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21468a[EnumC8288a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        new C8264a();
        new C8226c().m16068f("--").m16059o(EnumC8288a.MONTH_OF_YEAR, 2).m16069e('-').m16059o(EnumC8288a.DAY_OF_MONTH, 2).m16076D();
    }

    private C8263h(int i, int i2) {
        this.f21466w = i;
        this.f21467x = i2;
    }

    /* renamed from: i */
    public static C8263h m16005i(InterfaceC8299e interfaceC8299e) {
        if (interfaceC8299e instanceof C8263h) {
            return (C8263h) interfaceC8299e;
        }
        try {
            if (!C8195m.f21328y.equals(AbstractC8188h.m16348h(interfaceC8299e))) {
                interfaceC8299e = C8213d.m16160z(interfaceC8299e);
            }
            return m16003k(interfaceC8299e.get(EnumC8288a.MONTH_OF_YEAR), interfaceC8299e.get(EnumC8288a.DAY_OF_MONTH));
        } catch (DateTimeException unused) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + interfaceC8299e + ", type " + interfaceC8299e.getClass().getName());
        }
    }

    /* renamed from: k */
    public static C8263h m16003k(int i, int i2) {
        return m16002l(EnumC8260g.m16008of(i), i2);
    }

    /* renamed from: l */
    public static C8263h m16002l(EnumC8260g enumC8260g, int i) {
        C11251d.m5623i(enumC8260g, "month");
        EnumC8288a.DAY_OF_MONTH.checkValidValue(i);
        if (i <= enumC8260g.maxLength()) {
            return new C8263h(enumC8260g.getValue(), i);
        }
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + enumC8260g.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C8263h m16001m(DataInput dataInput) throws IOException {
        return m16003k(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C8273k((byte) 64, this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8300f
    public InterfaceC8298d adjustInto(InterfaceC8298d interfaceC8298d) {
        if (AbstractC8188h.m16348h(interfaceC8298d).equals(C8195m.f21328y)) {
            InterfaceC8298d mo15874c = interfaceC8298d.mo15874c(EnumC8288a.MONTH_OF_YEAR, this.f21466w);
            EnumC8288a enumC8288a = EnumC8288a.DAY_OF_MONTH;
            return mo15874c.mo15874c(enumC8288a, Math.min(mo15874c.range(enumC8288a).m15852c(), this.f21467x));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8263h) {
            C8263h c8263h = (C8263h) obj;
            return this.f21466w == c8263h.f21466w && this.f21467x == c8263h.f21467x;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C8263h c8263h) {
        int i = this.f21466w - c8263h.f21466w;
        return i == 0 ? this.f21467x - c8263h.f21467x : i;
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public int get(InterfaceC8304h interfaceC8304h) {
        return range(interfaceC8304h).m15854a(getLong(interfaceC8304h), interfaceC8304h);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public long getLong(InterfaceC8304h interfaceC8304h) {
        int i;
        if (interfaceC8304h instanceof EnumC8288a) {
            int i2 = C8265b.f21468a[((EnumC8288a) interfaceC8304h).ordinal()];
            if (i2 == 1) {
                i = this.f21467x;
            } else if (i2 == 2) {
                i = this.f21466w;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8304h);
            }
            return i;
        }
        return interfaceC8304h.getFrom(this);
    }

    public int hashCode() {
        return (this.f21466w << 6) + this.f21467x;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8299e
    public boolean isSupported(InterfaceC8304h interfaceC8304h) {
        return interfaceC8304h instanceof EnumC8288a ? interfaceC8304h == EnumC8288a.MONTH_OF_YEAR || interfaceC8304h == EnumC8288a.DAY_OF_MONTH : interfaceC8304h != null && interfaceC8304h.isSupportedBy(this);
    }

    /* renamed from: j */
    public EnumC8260g m16004j() {
        return EnumC8260g.m16008of(this.f21466w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m16000n(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f21466w);
        dataOutput.writeByte(this.f21467x);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public <R> R query(InterfaceC8313j<R> interfaceC8313j) {
        if (interfaceC8313j == C8305i.m15869a()) {
            return (R) C8195m.f21328y;
        }
        return (R) super.query(interfaceC8313j);
    }

    @Override // p405vf.AbstractC11250c, org.threeten.p283bp.temporal.InterfaceC8299e
    public C8315l range(InterfaceC8304h interfaceC8304h) {
        if (interfaceC8304h == EnumC8288a.MONTH_OF_YEAR) {
            return interfaceC8304h.range();
        }
        if (interfaceC8304h == EnumC8288a.DAY_OF_MONTH) {
            return C8315l.m15845j(1L, m16004j().minLength(), m16004j().maxLength());
        }
        return super.range(interfaceC8304h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f21466w < 10 ? "0" : BuildConfig.VERSION_NAME);
        sb2.append(this.f21466w);
        sb2.append(this.f21467x < 10 ? "-0" : "-");
        sb2.append(this.f21467x);
        return sb2.toString();
    }
}
