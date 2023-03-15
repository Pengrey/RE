package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.C4175c;
import ga.InterfaceC5628a;
import java.util.Arrays;
import java.util.List;
import p081ea.InterfaceC5026d;
import p102fa.InterfaceC5439f;
import p158ia.InterfaceC6066d;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6388i;
import p461y5.InterfaceC13116g;
import pa.C8590h;
import pa.InterfaceC8592i;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC6381e interfaceC6381e) {
        return new FirebaseMessaging((C4175c) interfaceC6381e.mo21096a(C4175c.class), (InterfaceC5628a) interfaceC6381e.mo21096a(InterfaceC5628a.class), interfaceC6381e.mo21086c(InterfaceC8592i.class), interfaceC6381e.mo21086c(InterfaceC5439f.class), (InterfaceC6066d) interfaceC6381e.mo21096a(InterfaceC6066d.class), (InterfaceC13116g) interfaceC6381e.mo21096a(InterfaceC13116g.class), (InterfaceC5026d) interfaceC6381e.mo21096a(InterfaceC5026d.class));
    }

    @Override // p177j9.InterfaceC6388i
    @Keep
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(FirebaseMessaging.class).m21104b(C6401q.m21042j(C4175c.class)).m21104b(C6401q.m21044h(InterfaceC5628a.class)).m21104b(C6401q.m21043i(InterfaceC8592i.class)).m21104b(C6401q.m21043i(InterfaceC5439f.class)).m21104b(C6401q.m21044h(InterfaceC13116g.class)).m21104b(C6401q.m21042j(InterfaceC6066d.class)).m21104b(C6401q.m21042j(InterfaceC5026d.class)).m21100f(C4337z.f11764a).m21103c().m21102d(), C8590h.m15081b("fire-fcm", "23.0.0"));
    }
}
