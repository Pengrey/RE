package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p301q.C9545a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes.dex */
public class C4317q0 {

    /* renamed from: a */
    private final Executor f11717a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<String, AbstractC3419d<String>> f11718b = new C9545a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.q0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4318a {
        AbstractC3419d<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4317q0(Executor executor) {
        this.f11717a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public synchronized AbstractC3419d<String> m27919a(final String str, InterfaceC4318a interfaceC4318a) {
        AbstractC3419d<String> abstractC3419d = this.f11718b.get(str);
        if (abstractC3419d != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Joining ongoing request for: ".concat(valueOf) : new String("Joining ongoing request for: "));
            }
            return abstractC3419d;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf2 = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Making new request for: ".concat(valueOf2) : new String("Making new request for: "));
        }
        AbstractC3419d mo30786j = interfaceC4318a.start().mo30786j(this.f11717a, new InterfaceC3415b() { // from class: com.google.firebase.messaging.p0
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d2) {
                C4317q0.this.m27918b(str, abstractC3419d2);
                return abstractC3419d2;
            }
        });
        this.f11718b.put(str, mo30786j);
        return mo30786j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public /* synthetic */ AbstractC3419d m27918b(String str, AbstractC3419d abstractC3419d) throws Exception {
        synchronized (this) {
            this.f11718b.remove(str);
        }
        return abstractC3419d;
    }
}
