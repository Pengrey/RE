package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C2597i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.g */
/* loaded from: classes.dex */
public final class C3425g {
    /* renamed from: a */
    public static <TResult> TResult m30769a(AbstractC3419d<TResult> abstractC3419d) throws ExecutionException, InterruptedException {
        C2597i.m33078h();
        C2597i.m33075k(abstractC3419d, "Task must not be null");
        if (abstractC3419d.mo30781o()) {
            return (TResult) m30762h(abstractC3419d);
        }
        C3428i c3428i = new C3428i(null);
        m30761i(abstractC3419d, c3428i);
        c3428i.m30760d();
        return (TResult) m30762h(abstractC3419d);
    }

    /* renamed from: b */
    public static <TResult> TResult m30768b(AbstractC3419d<TResult> abstractC3419d, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C2597i.m33078h();
        C2597i.m33075k(abstractC3419d, "Task must not be null");
        C2597i.m33075k(timeUnit, "TimeUnit must not be null");
        if (abstractC3419d.mo30781o()) {
            return (TResult) m30762h(abstractC3419d);
        }
        C3428i c3428i = new C3428i(null);
        m30761i(abstractC3419d, c3428i);
        if (c3428i.m30759e(j, timeUnit)) {
            return (TResult) m30762h(abstractC3419d);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> AbstractC3419d<TResult> m30767c(Executor executor, Callable<TResult> callable) {
        C2597i.m33075k(executor, "Executor must not be null");
        C2597i.m33075k(callable, "Callback must not be null");
        C3424f0 c3424f0 = new C3424f0();
        executor.execute(new RunnableC3426g0(c3424f0, callable));
        return c3424f0;
    }

    /* renamed from: d */
    public static <TResult> AbstractC3419d<TResult> m30766d(Exception exc) {
        C3424f0 c3424f0 = new C3424f0();
        c3424f0.m30777s(exc);
        return c3424f0;
    }

    /* renamed from: e */
    public static <TResult> AbstractC3419d<TResult> m30765e(TResult tresult) {
        C3424f0 c3424f0 = new C3424f0();
        c3424f0.m30776t(tresult);
        return c3424f0;
    }

    /* renamed from: f */
    public static AbstractC3419d<Void> m30764f(Collection<? extends AbstractC3419d<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (AbstractC3419d<?> abstractC3419d : collection) {
                Objects.requireNonNull(abstractC3419d, "null tasks are not accepted");
            }
            C3424f0 c3424f0 = new C3424f0();
            C3430k c3430k = new C3430k(collection.size(), c3424f0);
            for (AbstractC3419d<?> abstractC3419d2 : collection) {
                m30761i(abstractC3419d2, c3430k);
            }
            return c3424f0;
        }
        return m30765e(null);
    }

    /* renamed from: g */
    public static AbstractC3419d<Void> m30763g(AbstractC3419d<?>... abstractC3419dArr) {
        if (abstractC3419dArr != null && abstractC3419dArr.length != 0) {
            return m30764f(Arrays.asList(abstractC3419dArr));
        }
        return m30765e(null);
    }

    /* renamed from: h */
    private static <TResult> TResult m30762h(AbstractC3419d<TResult> abstractC3419d) throws ExecutionException {
        if (abstractC3419d.mo30780p()) {
            return abstractC3419d.mo30784l();
        }
        if (abstractC3419d.mo30782n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC3419d.mo30785k());
    }

    /* renamed from: i */
    private static <T> void m30761i(AbstractC3419d<T> abstractC3419d, InterfaceC3429j<? super T> interfaceC3429j) {
        Executor executor = C3423f.f9231b;
        abstractC3419d.mo30790f(executor, interfaceC3429j);
        abstractC3419d.mo30792d(executor, interfaceC3429j);
        abstractC3419d.mo30795a(executor, interfaceC3429j);
    }
}
