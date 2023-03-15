package la;

import com.google.auto.value.AutoValue;
import la.C7013a;

@AutoValue
/* renamed from: la.d */
/* loaded from: classes.dex */
public abstract class AbstractC7020d {

    /* compiled from: InstallationResponse.java */
    @AutoValue.Builder
    /* renamed from: la.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7021a {
        /* renamed from: a */
        public abstract AbstractC7020d mo19573a();

        /* renamed from: b */
        public abstract AbstractC7021a mo19572b(AbstractC7024f abstractC7024f);

        /* renamed from: c */
        public abstract AbstractC7021a mo19571c(String str);

        /* renamed from: d */
        public abstract AbstractC7021a mo19570d(String str);

        /* renamed from: e */
        public abstract AbstractC7021a mo19569e(EnumC7022b enumC7022b);

        /* renamed from: f */
        public abstract AbstractC7021a mo19568f(String str);
    }

    /* compiled from: InstallationResponse.java */
    /* renamed from: la.d$b */
    /* loaded from: classes.dex */
    public enum EnumC7022b {
        OK,
        BAD_CONFIG
    }

    /* renamed from: a */
    public static AbstractC7021a m19579a() {
        return new C7013a.C7015b();
    }

    /* renamed from: b */
    public abstract AbstractC7024f mo19578b();

    /* renamed from: c */
    public abstract String mo19577c();

    /* renamed from: d */
    public abstract String mo19576d();

    /* renamed from: e */
    public abstract EnumC7022b mo19575e();

    /* renamed from: f */
    public abstract String mo19574f();
}
