package p200ka;

import com.google.auto.value.AutoValue;
import p200ka.C6615a;
import p200ka.C6619c;

@AutoValue
/* renamed from: ka.d */
/* loaded from: classes.dex */
public abstract class AbstractC6621d {

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* renamed from: ka.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6622a {
        /* renamed from: a */
        public abstract AbstractC6621d mo20451a();

        /* renamed from: b */
        public abstract AbstractC6622a mo20450b(String str);

        /* renamed from: c */
        public abstract AbstractC6622a mo20449c(long j);

        /* renamed from: d */
        public abstract AbstractC6622a mo20448d(String str);

        /* renamed from: e */
        public abstract AbstractC6622a mo20447e(String str);

        /* renamed from: f */
        public abstract AbstractC6622a mo20446f(String str);

        /* renamed from: g */
        public abstract AbstractC6622a mo20445g(C6619c.EnumC6620a enumC6620a);

        /* renamed from: h */
        public abstract AbstractC6622a mo20444h(long j);
    }

    static {
        m20471a().mo20451a();
    }

    /* renamed from: a */
    public static AbstractC6622a m20471a() {
        return new C6615a.C6617b().mo20444h(0L).mo20445g(C6619c.EnumC6620a.ATTEMPT_MIGRATION).mo20449c(0L);
    }

    /* renamed from: b */
    public abstract String mo20470b();

    /* renamed from: c */
    public abstract long mo20469c();

    /* renamed from: d */
    public abstract String mo20468d();

    /* renamed from: e */
    public abstract String mo20467e();

    /* renamed from: f */
    public abstract String mo20466f();

    /* renamed from: g */
    public abstract C6619c.EnumC6620a mo20465g();

    /* renamed from: h */
    public abstract long mo20464h();

    /* renamed from: i */
    public boolean m20463i() {
        return mo20465g() == C6619c.EnumC6620a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m20462j() {
        return mo20465g() == C6619c.EnumC6620a.NOT_GENERATED || mo20465g() == C6619c.EnumC6620a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m20461k() {
        return mo20465g() == C6619c.EnumC6620a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m20460l() {
        return mo20465g() == C6619c.EnumC6620a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m20459m() {
        return mo20465g() == C6619c.EnumC6620a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC6622a mo20458n();

    /* renamed from: o */
    public AbstractC6621d m20457o(String str, long j, long j2) {
        return mo20458n().mo20450b(str).mo20449c(j).mo20444h(j2).mo20451a();
    }

    /* renamed from: p */
    public AbstractC6621d m20456p() {
        return mo20458n().mo20450b(null).mo20451a();
    }

    /* renamed from: q */
    public AbstractC6621d m20455q(String str) {
        return mo20458n().mo20447e(str).mo20445g(C6619c.EnumC6620a.REGISTER_ERROR).mo20451a();
    }

    /* renamed from: r */
    public AbstractC6621d m20454r() {
        return mo20458n().mo20445g(C6619c.EnumC6620a.NOT_GENERATED).mo20451a();
    }

    /* renamed from: s */
    public AbstractC6621d m20453s(String str, String str2, long j, String str3, long j2) {
        return mo20458n().mo20448d(str).mo20445g(C6619c.EnumC6620a.REGISTERED).mo20450b(str3).mo20446f(str2).mo20449c(j2).mo20444h(j).mo20451a();
    }

    /* renamed from: t */
    public AbstractC6621d m20452t(String str) {
        return mo20458n().mo20448d(str).mo20445g(C6619c.EnumC6620a.UNREGISTERED).mo20451a();
    }
}
