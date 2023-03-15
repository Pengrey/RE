package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C2383a;
import java.util.Collections;
import java.util.List;
import p007a6.C0062t;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6388i;
import p461y5.InterfaceC13116g;
import p465y9.C13141a;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC13116g lambda$getComponents$0(InterfaceC6381e interfaceC6381e) {
        C0062t.m42028f((Context) interfaceC6381e.mo21096a(Context.class));
        return C0062t.m42031c().m42027g(C2383a.f6960g);
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        return Collections.singletonList(C6378d.m21119c(InterfaceC13116g.class).m21104b(C6401q.m21042j(Context.class)).m21100f(C13141a.f34094a).m21102d());
    }
}
