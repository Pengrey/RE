package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p099f7.ThreadFactoryC5416b;
import p309q7.C9681i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes.dex */
public class C4310n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ScheduledExecutorService m27927a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5416b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static ExecutorService m27926b() {
        C9681i.m10225a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5416b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ExecutorService m27925c() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC5416b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static ExecutorService m27924d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC5416b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ScheduledExecutorService m27923e() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5416b("Firebase-Messaging-Topics-Io"));
    }
}
