package p007a6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007a6.C0031b;

@AutoValue
/* renamed from: a6.i */
/* loaded from: classes.dex */
public abstract class AbstractC0046i {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    /* renamed from: a6.i$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0047a {
        /* renamed from: a */
        public final AbstractC0047a m42076a(String str, int i) {
            mo42072e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC0047a m42075b(String str, long j) {
            mo42072e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC0047a m42074c(String str, String str2) {
            mo42072e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC0046i mo42073d();

        /* renamed from: e */
        protected abstract Map<String, String> mo42072e();

        /* renamed from: f */
        protected abstract AbstractC0047a mo42071f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC0047a mo42070g(Integer num);

        /* renamed from: h */
        public abstract AbstractC0047a mo42069h(C0045h c0045h);

        /* renamed from: i */
        public abstract AbstractC0047a mo42068i(long j);

        /* renamed from: j */
        public abstract AbstractC0047a mo42067j(String str);

        /* renamed from: k */
        public abstract AbstractC0047a mo42066k(long j);
    }

    /* renamed from: a */
    public static AbstractC0047a m42088a() {
        return new C0031b.C0033b().mo42071f(new HashMap());
    }

    /* renamed from: b */
    public final String m42087b(String str) {
        String str2 = mo42086c().get(str);
        return str2 == null ? BuildConfig.VERSION_NAME : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo42086c();

    /* renamed from: d */
    public abstract Integer mo42085d();

    /* renamed from: e */
    public abstract C0045h mo42084e();

    /* renamed from: f */
    public abstract long mo42083f();

    /* renamed from: g */
    public final int m42082g(String str) {
        String str2 = mo42086c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m42081h(String str) {
        String str2 = mo42086c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m42080i() {
        return Collections.unmodifiableMap(mo42086c());
    }

    /* renamed from: j */
    public abstract String mo42079j();

    /* renamed from: k */
    public abstract long mo42078k();

    /* renamed from: l */
    public AbstractC0047a m42077l() {
        return new C0031b.C0033b().mo42067j(mo42079j()).mo42070g(mo42085d()).mo42069h(mo42084e()).mo42068i(mo42083f()).mo42066k(mo42078k()).mo42071f(new HashMap(mo42086c()));
    }
}
