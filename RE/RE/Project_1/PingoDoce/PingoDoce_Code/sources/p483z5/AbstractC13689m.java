package p483z5;

import com.google.auto.value.AutoValue;
import java.util.List;
import p483z5.C13676g;

@AutoValue
/* renamed from: z5.m */
/* loaded from: classes.dex */
public abstract class AbstractC13689m {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    /* renamed from: z5.m$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13690a {
        /* renamed from: a */
        public abstract AbstractC13689m mo599a();

        /* renamed from: b */
        public abstract AbstractC13690a mo598b(AbstractC13684k abstractC13684k);

        /* renamed from: c */
        public abstract AbstractC13690a mo597c(List<AbstractC13687l> list);

        /* renamed from: d */
        abstract AbstractC13690a mo596d(Integer num);

        /* renamed from: e */
        abstract AbstractC13690a mo595e(String str);

        /* renamed from: f */
        public abstract AbstractC13690a mo594f(EnumC13696p enumC13696p);

        /* renamed from: g */
        public abstract AbstractC13690a mo593g(long j);

        /* renamed from: h */
        public abstract AbstractC13690a mo592h(long j);

        /* renamed from: i */
        public AbstractC13690a m591i(int i) {
            return mo596d(Integer.valueOf(i));
        }

        /* renamed from: j */
        public AbstractC13690a m590j(String str) {
            return mo595e(str);
        }
    }

    /* renamed from: a */
    public static AbstractC13690a m607a() {
        return new C13676g.C13678b();
    }

    /* renamed from: b */
    public abstract AbstractC13684k mo606b();

    /* renamed from: c */
    public abstract List<AbstractC13687l> mo605c();

    /* renamed from: d */
    public abstract Integer mo604d();

    /* renamed from: e */
    public abstract String mo603e();

    /* renamed from: f */
    public abstract EnumC13696p mo602f();

    /* renamed from: g */
    public abstract long mo601g();

    /* renamed from: h */
    public abstract long mo600h();
}
