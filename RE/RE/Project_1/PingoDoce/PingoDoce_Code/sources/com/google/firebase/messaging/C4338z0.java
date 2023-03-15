package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p301q.C9545a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.z0 */
/* loaded from: classes.dex */
public class C4338z0 {

    /* renamed from: i */
    private static final long f11765i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f11766a;

    /* renamed from: b */
    private final C4297h0 f11767b;

    /* renamed from: c */
    private final C4280c0 f11768c;

    /* renamed from: d */
    private final FirebaseMessaging f11769d;

    /* renamed from: f */
    private final ScheduledExecutorService f11771f;

    /* renamed from: h */
    private final C4334x0 f11773h;

    /* renamed from: e */
    private final Map<String, ArrayDeque<C3421e<Void>>> f11770e = new C9545a();

    /* renamed from: g */
    private boolean f11772g = false;

    private C4338z0(FirebaseMessaging firebaseMessaging, C4297h0 c4297h0, C4334x0 c4334x0, C4280c0 c4280c0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11769d = firebaseMessaging;
        this.f11767b = c4297h0;
        this.f11773h = c4334x0;
        this.f11768c = c4280c0;
        this.f11766a = context;
        this.f11771f = scheduledExecutorService;
    }

    /* renamed from: a */
    private void m27874a(C4332w0 c4332w0, C3421e<Void> c3421e) {
        ArrayDeque<C3421e<Void>> arrayDeque;
        synchronized (this.f11770e) {
            String m27881e = c4332w0.m27881e();
            if (this.f11770e.containsKey(m27881e)) {
                arrayDeque = this.f11770e.get(m27881e);
            } else {
                ArrayDeque<C3421e<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f11770e.put(m27881e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(c3421e);
        }
    }

    /* renamed from: b */
    private static <T> void m27873b(AbstractC3419d<T> abstractC3419d) throws IOException {
        try {
            C3425g.m30768b(abstractC3419d, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: c */
    private void m27872c(String str) throws IOException {
        m27873b(this.f11768c.m28033j(this.f11769d.m28126c(), str));
    }

    /* renamed from: d */
    private void m27871d(String str) throws IOException {
        m27873b(this.f11768c.m28032k(this.f11769d.m28126c(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC3419d<C4338z0> m27870e(final FirebaseMessaging firebaseMessaging, final C4297h0 c4297h0, final C4280c0 c4280c0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C3425g.m30767c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4338z0.m27866i(context, scheduledExecutorService, firebaseMessaging, c4297h0, c4280c0);
            }
        });
    }

    /* renamed from: g */
    static boolean m27868g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ C4338z0 m27866i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C4297h0 c4297h0, C4280c0 c4280c0) throws Exception {
        return new C4338z0(firebaseMessaging, c4297h0, C4334x0.m27878b(context, scheduledExecutorService), c4280c0, context, scheduledExecutorService);
    }

    /* renamed from: j */
    private void m27865j(C4332w0 c4332w0) {
        synchronized (this.f11770e) {
            String m27881e = c4332w0.m27881e();
            if (this.f11770e.containsKey(m27881e)) {
                ArrayDeque<C3421e<Void>> arrayDeque = this.f11770e.get(m27881e);
                C3421e<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m30800c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f11770e.remove(m27881e);
                }
            }
        }
    }

    /* renamed from: o */
    private void m27860o() {
        if (m27867h()) {
            return;
        }
        m27856s(0L);
    }

    /* renamed from: f */
    boolean m27869f() {
        return this.f11773h.m27877c() != null;
    }

    /* renamed from: h */
    synchronized boolean m27867h() {
        return this.f11772g;
    }

    /* renamed from: k */
    boolean m27864k(C4332w0 c4332w0) throws IOException {
        char c;
        try {
            String m27884b = c4332w0.m27884b();
            int hashCode = m27884b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m27884b.equals("U")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (m27884b.equals("S")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                m27872c(c4332w0.m27883c());
                if (m27868g()) {
                    String m27883c = c4332w0.m27883c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m27883c).length() + 31);
                    sb2.append("Subscribe to topic: ");
                    sb2.append(m27883c);
                    sb2.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (c != 1) {
                if (m27868g()) {
                    String obj = c4332w0.toString();
                    StringBuilder sb3 = new StringBuilder(obj.length() + 24);
                    sb3.append("Unknown topic operation");
                    sb3.append(obj);
                    sb3.append(".");
                    Log.d("FirebaseMessaging", sb3.toString());
                }
            } else {
                m27871d(c4332w0.m27883c());
                if (m27868g()) {
                    String m27883c2 = c4332w0.m27883c();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(m27883c2).length() + 35);
                    sb4.append("Unsubscribe from topic: ");
                    sb4.append(m27883c2);
                    sb4.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb4.toString());
                }
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e;
            }
            String message = e.getMessage();
            StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 53);
            sb5.append("Topic operation failed: ");
            sb5.append(message);
            sb5.append(". Will retry Topic operation.");
            Log.e("FirebaseMessaging", sb5.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m27863l(Runnable runnable, long j) {
        this.f11771f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: m */
    AbstractC3419d<Void> m27862m(C4332w0 c4332w0) {
        this.f11773h.m27879a(c4332w0);
        C3421e<Void> c3421e = new C3421e<>();
        m27874a(c4332w0, c3421e);
        return c3421e.m30802a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized void m27861n(boolean z) {
        this.f11772g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m27859p() {
        if (m27869f()) {
            m27860o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public AbstractC3419d<Void> m27858q(String str) {
        AbstractC3419d<Void> m27862m = m27862m(C4332w0.m27880f(str));
        m27859p();
        return m27862m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (m27868g() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m27857r() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.x0 r0 = r2.f11773h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.w0 r0 = r0.m27877c()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m27868g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m27864k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.x0 r1 = r2.f11773h
            r1.m27875e(r0)
            r2.m27865j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C4338z0.m27857r():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m27856s(long j) {
        m27863l(new RunnableC4273a1(this, this.f11766a, this.f11767b, Math.min(Math.max(30L, j + j), f11765i)), j);
        m27861n(true);
    }
}
