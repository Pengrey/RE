package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.firebase.messaging.ServiceConnectionC4298h1;
import p079e8.InterfaceC5016c;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.e1 */
/* loaded from: classes.dex */
class BinderC4287e1 extends Binder {

    /* renamed from: a */
    private final InterfaceC4288a f11671a;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.e1$a */
    /* loaded from: classes.dex */
    interface InterfaceC4288a {
        /* renamed from: a */
        AbstractC3419d<Void> mo28015a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4287e1(InterfaceC4288a interfaceC4288a) {
        this.f11671a = interfaceC4288a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m28025b(final ServiceConnectionC4298h1.C4299a c4299a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f11671a.mo28015a(c4299a.f11695a).mo30793c(ExecutorC4284d1.f11664w, new InterfaceC5016c() { // from class: com.google.firebase.messaging.c1
                @Override // p079e8.InterfaceC5016c
                /* renamed from: a */
                public final void mo4683a(AbstractC3419d abstractC3419d) {
                    ServiceConnectionC4298h1.C4299a.this.m27973b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
