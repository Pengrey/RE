package jm;

import java.util.ArrayList;

/* renamed from: jm.a */
/* loaded from: classes2.dex */
public final class C6537a {

    /* renamed from: a */
    private static final AbstractC6539b[] f17708a;

    /* renamed from: b */
    static volatile AbstractC6539b[] f17709b;

    /* renamed from: c */
    private static final AbstractC6539b f17710c;

    /* compiled from: Timber.java */
    /* renamed from: jm.a$a */
    /* loaded from: classes2.dex */
    static class C6538a extends AbstractC6539b {
        C6538a() {
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: a */
        public void mo20671a(String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20671a(str, objArr);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: b */
        public void mo20670b(String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20670b(str, objArr);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: c */
        public void mo20669c(Throwable th2, String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20669c(th2, str, objArr);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: d */
        public void mo20668d(String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20668d(str, objArr);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: e */
        public void mo20667e(Throwable th2) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20667e(th2);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: f */
        public void mo20666f(String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20666f(str, objArr);
            }
        }

        @Override // jm.C6537a.AbstractC6539b
        /* renamed from: g */
        public void mo20665g(Throwable th2, String str, Object... objArr) {
            for (AbstractC6539b abstractC6539b : C6537a.f17709b) {
                abstractC6539b.mo20665g(th2, str, objArr);
            }
        }
    }

    /* compiled from: Timber.java */
    /* renamed from: jm.a$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6539b {
        public AbstractC6539b() {
            new ThreadLocal();
        }

        /* renamed from: a */
        public abstract void mo20671a(String str, Object... objArr);

        /* renamed from: b */
        public abstract void mo20670b(String str, Object... objArr);

        /* renamed from: c */
        public abstract void mo20669c(Throwable th2, String str, Object... objArr);

        /* renamed from: d */
        public abstract void mo20668d(String str, Object... objArr);

        /* renamed from: e */
        public abstract void mo20667e(Throwable th2);

        /* renamed from: f */
        public abstract void mo20666f(String str, Object... objArr);

        /* renamed from: g */
        public abstract void mo20665g(Throwable th2, String str, Object... objArr);
    }

    static {
        AbstractC6539b[] abstractC6539bArr = new AbstractC6539b[0];
        f17708a = abstractC6539bArr;
        new ArrayList();
        f17709b = abstractC6539bArr;
        f17710c = new C6538a();
    }

    /* renamed from: a */
    public static void m20678a(String str, Object... objArr) {
        f17710c.mo20671a(str, objArr);
    }

    /* renamed from: b */
    public static void m20677b(String str, Object... objArr) {
        f17710c.mo20670b(str, objArr);
    }

    /* renamed from: c */
    public static void m20676c(Throwable th2, String str, Object... objArr) {
        f17710c.mo20669c(th2, str, objArr);
    }

    /* renamed from: d */
    public static void m20675d(String str, Object... objArr) {
        f17710c.mo20668d(str, objArr);
    }

    /* renamed from: e */
    public static void m20674e(Throwable th2) {
        f17710c.mo20667e(th2);
    }

    /* renamed from: f */
    public static void m20673f(String str, Object... objArr) {
        f17710c.mo20666f(str, objArr);
    }

    /* renamed from: g */
    public static void m20672g(Throwable th2, String str, Object... objArr) {
        f17710c.mo20665g(th2, str, objArr);
    }
}
