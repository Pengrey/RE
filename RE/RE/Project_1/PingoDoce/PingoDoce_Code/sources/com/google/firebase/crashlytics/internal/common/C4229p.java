package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p219l9.C7011f;
import p219l9.InterfaceC7002a;
import p382u9.InterfaceC10857e;

/* renamed from: com.google.firebase.crashlytics.internal.common.p */
/* loaded from: classes.dex */
class C4229p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final InterfaceC4230a f11529a;

    /* renamed from: b */
    private final InterfaceC10857e f11530b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f11531c;

    /* renamed from: d */
    private final InterfaceC7002a f11532d;

    /* renamed from: e */
    private final AtomicBoolean f11533e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.p$a */
    /* loaded from: classes.dex */
    interface InterfaceC4230a {
        /* renamed from: a */
        void mo28224a(InterfaceC10857e interfaceC10857e, Thread thread, Throwable th2);
    }

    public C4229p(InterfaceC4230a interfaceC4230a, InterfaceC10857e interfaceC10857e, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC7002a interfaceC7002a) {
        this.f11529a = interfaceC4230a;
        this.f11530b = interfaceC10857e;
        this.f11531c = uncaughtExceptionHandler;
        this.f11532d = interfaceC7002a;
    }

    /* renamed from: b */
    private boolean m28225b(Thread thread, Throwable th2) {
        if (thread == null) {
            C7011f.m19611f().m19613d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th2 == null) {
            C7011f.m19611f().m19613d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f11532d.mo19631b()) {
            C7011f.m19611f().m19615b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m28226a() {
        return this.f11533e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l9.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l9.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.f11533e.set(true);
        try {
            try {
                if (m28225b(thread, th2)) {
                    this.f11529a.mo28224a(this.f11530b, thread, th2);
                } else {
                    C7011f.m19611f().m19615b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                C7011f.m19611f().m19612e("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            C7011f.m19611f().m19615b(r0);
            this.f11531c.uncaughtException(thread, th2);
            this.f11533e.set(false);
        }
    }
}
