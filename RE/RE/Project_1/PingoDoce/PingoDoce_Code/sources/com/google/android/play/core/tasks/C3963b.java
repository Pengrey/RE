package com.google.android.play.core.tasks;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p031b9.C1855l;
import p101f9.AbstractC5433d;

/* renamed from: com.google.android.play.core.tasks.b */
/* loaded from: classes.dex */
public final class C3963b {
    /* renamed from: a */
    public static <ResultT> AbstractC5433d<ResultT> m28516a(Exception exc) {
        C3976o c3976o = new C3976o();
        c3976o.m28496i(exc);
        return c3976o;
    }

    /* renamed from: b */
    public static <ResultT> AbstractC5433d<ResultT> m28515b(ResultT resultt) {
        C3976o c3976o = new C3976o();
        c3976o.m28495j(resultt);
        return c3976o;
    }

    /* renamed from: c */
    private static <ResultT> ResultT m28514c(AbstractC5433d<ResultT> abstractC5433d) throws ExecutionException {
        if (abstractC5433d.mo24367g()) {
            return abstractC5433d.mo24369e();
        }
        throw new ExecutionException(abstractC5433d.mo24370d());
    }

    /* renamed from: d */
    private static void m28513d(AbstractC5433d<?> abstractC5433d, C3977p c3977p) {
        Executor executor = C3962a.f11250b;
        abstractC5433d.mo24371c(executor, c3977p);
        abstractC5433d.mo24372b(executor, c3977p);
    }

    /* renamed from: e */
    public static <ResultT> ResultT m28512e(AbstractC5433d<ResultT> abstractC5433d) throws ExecutionException, InterruptedException {
        C1855l.m35254b(abstractC5433d, "Task must not be null");
        if (abstractC5433d.mo24368f()) {
            return (ResultT) m28514c(abstractC5433d);
        }
        C3977p c3977p = new C3977p(null);
        m28513d(abstractC5433d, c3977p);
        c3977p.m28490a();
        return (ResultT) m28514c(abstractC5433d);
    }
}
