package la;

import com.google.auto.value.AutoValue;
import la.C7016b;

@AutoValue
/* renamed from: la.f */
/* loaded from: classes.dex */
public abstract class AbstractC7024f {

    /* compiled from: TokenResult.java */
    @AutoValue.Builder
    /* renamed from: la.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7025a {
        /* renamed from: a */
        public abstract AbstractC7024f mo19557a();

        /* renamed from: b */
        public abstract AbstractC7025a mo19556b(EnumC7026b enumC7026b);

        /* renamed from: c */
        public abstract AbstractC7025a mo19555c(String str);

        /* renamed from: d */
        public abstract AbstractC7025a mo19554d(long j);
    }

    /* compiled from: TokenResult.java */
    /* renamed from: la.f$b */
    /* loaded from: classes.dex */
    public enum EnumC7026b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static AbstractC7025a m19561a() {
        return new C7016b.C7018b().mo19554d(0L);
    }

    /* renamed from: b */
    public abstract EnumC7026b mo19560b();

    /* renamed from: c */
    public abstract String mo19559c();

    /* renamed from: d */
    public abstract long mo19558d();
}
