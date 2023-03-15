package org.threeten.p283bp.temporal;

import org.threeten.p283bp.C8170b;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.chrono.AbstractC8178c;
import org.threeten.p283bp.chrono.AbstractC8183f;

/* renamed from: org.threeten.bp.temporal.b */
/* loaded from: classes2.dex */
public enum EnumC8289b implements InterfaceC8314k {
    NANOS("Nanos", C8170b.m16404e(1)),
    MICROS("Micros", C8170b.m16404e(1000)),
    MILLIS("Millis", C8170b.m16404e(1000000)),
    SECONDS("Seconds", C8170b.m16403f(1)),
    MINUTES("Minutes", C8170b.m16403f(60)),
    HOURS("Hours", C8170b.m16403f(3600)),
    HALF_DAYS("HalfDays", C8170b.m16403f(43200)),
    DAYS("Days", C8170b.m16403f(86400)),
    WEEKS("Weeks", C8170b.m16403f(604800)),
    MONTHS("Months", C8170b.m16403f(2629746)),
    YEARS("Years", C8170b.m16403f(31556952)),
    DECADES("Decades", C8170b.m16403f(315569520)),
    CENTURIES("Centuries", C8170b.m16403f(3155695200L)),
    MILLENNIA("Millennia", C8170b.m16403f(31556952000L)),
    ERAS("Eras", C8170b.m16403f(31556952000000000L)),
    FOREVER("Forever", C8170b.m16402g(Long.MAX_VALUE, 999999999));
    
    private final C8170b duration;
    private final String name;

    EnumC8289b(String str, C8170b c8170b) {
        this.name = str;
        this.duration = c8170b;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8314k
    public <R extends InterfaceC8298d> R addTo(R r, long j) {
        return (R) r.mo15873e(j, this);
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8314k
    public long between(InterfaceC8298d interfaceC8298d, InterfaceC8298d interfaceC8298d2) {
        return interfaceC8298d.mo15872f(interfaceC8298d2, this);
    }

    public C8170b getDuration() {
        return this.duration;
    }

    @Override // org.threeten.p283bp.temporal.InterfaceC8314k
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isSupportedBy(InterfaceC8298d interfaceC8298d) {
        if (this == FOREVER) {
            return false;
        }
        if (interfaceC8298d instanceof AbstractC8176b) {
            return isDateBased();
        }
        if ((interfaceC8298d instanceof AbstractC8178c) || (interfaceC8298d instanceof AbstractC8183f)) {
            return true;
        }
        try {
            interfaceC8298d.mo15873e(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                interfaceC8298d.mo15873e(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
