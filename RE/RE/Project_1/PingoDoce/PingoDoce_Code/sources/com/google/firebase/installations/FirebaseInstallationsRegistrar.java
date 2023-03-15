package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C4175c;
import java.util.Arrays;
import java.util.List;
import p102fa.InterfaceC5439f;
import p158ia.C6067e;
import p158ia.InterfaceC6066d;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6388i;
import pa.C8590h;
import pa.InterfaceC8592i;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6066d lambda$getComponents$0(InterfaceC6381e interfaceC6381e) {
        return new C4259c((C4175c) interfaceC6381e.mo21096a(C4175c.class), interfaceC6381e.mo21086c(InterfaceC8592i.class), interfaceC6381e.mo21086c(InterfaceC5439f.class));
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(InterfaceC6066d.class).m21104b(C6401q.m21042j(C4175c.class)).m21104b(C6401q.m21043i(InterfaceC5439f.class)).m21104b(C6401q.m21043i(InterfaceC8592i.class)).m21100f(C6067e.f16711a).m21102d(), C8590h.m15081b("fire-installations", "17.0.0"));
    }
}
