package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C2401b;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p216l6.InterfaceC6984a;
import p461y5.EnumC13113d;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
/* loaded from: classes.dex */
public abstract class AbstractC2404c {

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a */
    /* loaded from: classes.dex */
    public static class C2405a {

        /* renamed from: a */
        private InterfaceC6984a f6997a;

        /* renamed from: b */
        private Map<EnumC13113d, AbstractC2406b> f6998b = new HashMap();

        /* renamed from: a */
        public C2405a m33665a(EnumC13113d enumC13113d, AbstractC2406b abstractC2406b) {
            this.f6998b.put(enumC13113d, abstractC2406b);
            return this;
        }

        /* renamed from: b */
        public AbstractC2404c m33664b() {
            Objects.requireNonNull(this.f6997a, "missing required property: clock");
            if (this.f6998b.keySet().size() >= EnumC13113d.values().length) {
                Map<EnumC13113d, AbstractC2406b> map = this.f6998b;
                this.f6998b = new HashMap();
                return AbstractC2404c.m33672d(this.f6997a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C2405a m33663c(InterfaceC6984a interfaceC6984a) {
            this.f6997a = interfaceC6984a;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2406b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2407a {
            /* renamed from: a */
            public abstract AbstractC2406b mo33658a();

            /* renamed from: b */
            public abstract AbstractC2407a mo33657b(long j);

            /* renamed from: c */
            public abstract AbstractC2407a mo33656c(Set<EnumC2408c> set);

            /* renamed from: d */
            public abstract AbstractC2407a mo33655d(long j);
        }

        /* renamed from: a */
        public static AbstractC2407a m33662a() {
            return new C2401b.C2403b().mo33656c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo33661b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<EnumC2408c> mo33660c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo33659d();
    }

    /* compiled from: SchedulerConfig.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c$c */
    /* loaded from: classes.dex */
    public enum EnumC2408c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m33675a(int i, long j) {
        int i2;
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2)));
    }

    /* renamed from: b */
    public static C2405a m33674b() {
        return new C2405a();
    }

    /* renamed from: d */
    static AbstractC2404c m33672d(InterfaceC6984a interfaceC6984a, Map<EnumC13113d, AbstractC2406b> map) {
        return new C2400a(interfaceC6984a, map);
    }

    /* renamed from: f */
    public static AbstractC2404c m33670f(InterfaceC6984a interfaceC6984a) {
        return m33674b().m33665a(EnumC13113d.DEFAULT, AbstractC2406b.m33662a().mo33657b(30000L).mo33655d(86400000L).mo33658a()).m33665a(EnumC13113d.HIGHEST, AbstractC2406b.m33662a().mo33657b(1000L).mo33655d(86400000L).mo33658a()).m33665a(EnumC13113d.VERY_LOW, AbstractC2406b.m33662a().mo33657b(86400000L).mo33655d(86400000L).mo33656c(m33667i(EnumC2408c.NETWORK_UNMETERED, EnumC2408c.DEVICE_IDLE)).mo33658a()).m33663c(interfaceC6984a).m33664b();
    }

    /* renamed from: i */
    private static <T> Set<T> m33667i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m33666j(JobInfo.Builder builder, Set<EnumC2408c> set) {
        if (set.contains(EnumC2408c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC2408c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC2408c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m33673c(JobInfo.Builder builder, EnumC13113d enumC13113d, long j, int i) {
        builder.setMinimumLatency(m33669g(enumC13113d, j, i));
        m33666j(builder, mo33668h().get(enumC13113d).mo33660c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC6984a mo33671e();

    /* renamed from: g */
    public long m33669g(EnumC13113d enumC13113d, long j, int i) {
        long mo19644a = j - mo33671e().mo19644a();
        AbstractC2406b abstractC2406b = mo33668h().get(enumC13113d);
        return Math.min(Math.max(m33675a(i, abstractC2406b.mo33661b()), mo19644a), abstractC2406b.mo33659d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC13113d, AbstractC2406b> mo33668h();
}
