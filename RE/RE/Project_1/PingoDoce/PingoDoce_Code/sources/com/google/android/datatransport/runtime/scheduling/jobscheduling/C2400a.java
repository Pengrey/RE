package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import java.util.Map;
import java.util.Objects;
import p216l6.InterfaceC6984a;
import p461y5.EnumC13113d;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* loaded from: classes.dex */
final class C2400a extends AbstractC2404c {

    /* renamed from: a */
    private final InterfaceC6984a f6989a;

    /* renamed from: b */
    private final Map<EnumC13113d, AbstractC2404c.AbstractC2406b> f6990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2400a(InterfaceC6984a interfaceC6984a, Map<EnumC13113d, AbstractC2404c.AbstractC2406b> map) {
        Objects.requireNonNull(interfaceC6984a, "Null clock");
        this.f6989a = interfaceC6984a;
        Objects.requireNonNull(map, "Null values");
        this.f6990b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c
    /* renamed from: e */
    InterfaceC6984a mo33671e() {
        return this.f6989a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2404c) {
            AbstractC2404c abstractC2404c = (AbstractC2404c) obj;
            return this.f6989a.equals(abstractC2404c.mo33671e()) && this.f6990b.equals(abstractC2404c.mo33668h());
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c
    /* renamed from: h */
    Map<EnumC13113d, AbstractC2404c.AbstractC2406b> mo33668h() {
        return this.f6990b;
    }

    public int hashCode() {
        return ((this.f6989a.hashCode() ^ 1000003) * 1000003) ^ this.f6990b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f6989a + ", values=" + this.f6990b + "}";
    }
}
