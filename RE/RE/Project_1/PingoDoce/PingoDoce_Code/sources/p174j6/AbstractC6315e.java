package p174j6;

import com.google.auto.value.AutoValue;
import p174j6.C6305a;

@AutoValue
/* renamed from: j6.e */
/* loaded from: classes.dex */
abstract class AbstractC6315e {

    /* renamed from: a */
    static final AbstractC6315e f17330a = m21273a().mo21262f(10485760).mo21264d(200).mo21266b(10000).mo21265c(604800000).mo21263e(81920).mo21267a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    /* renamed from: j6.e$a */
    /* loaded from: classes.dex */
    static abstract class AbstractC6316a {
        /* renamed from: a */
        abstract AbstractC6315e mo21267a();

        /* renamed from: b */
        abstract AbstractC6316a mo21266b(int i);

        /* renamed from: c */
        abstract AbstractC6316a mo21265c(long j);

        /* renamed from: d */
        abstract AbstractC6316a mo21264d(int i);

        /* renamed from: e */
        abstract AbstractC6316a mo21263e(int i);

        /* renamed from: f */
        abstract AbstractC6316a mo21262f(long j);
    }

    /* renamed from: a */
    static AbstractC6316a m21273a() {
        return new C6305a.C6307b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo21272b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract long mo21271c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo21270d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo21269e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract long mo21268f();
}
