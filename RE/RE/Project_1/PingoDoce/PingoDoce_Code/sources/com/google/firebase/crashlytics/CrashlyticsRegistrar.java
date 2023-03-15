package com.google.firebase.crashlytics;

import com.google.firebase.C4175c;
import com.google.firebase.crashlytics.C4181a;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import p157i9.InterfaceC6056a;
import p158ia.InterfaceC6066d;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6387h;
import p177j9.InterfaceC6388i;
import p219l9.InterfaceC7002a;
import pa.C8590h;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C4181a m28419b(InterfaceC6381e interfaceC6381e) {
        return C4181a.m28417b((C4175c) interfaceC6381e.mo21096a(C4175c.class), (InterfaceC6066d) interfaceC6381e.mo21096a(InterfaceC6066d.class), interfaceC6381e.mo21084e(InterfaceC7002a.class), interfaceC6381e.mo21084e(InterfaceC6056a.class));
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(C4181a.class).m21104b(C6401q.m21042j(C4175c.class)).m21104b(C6401q.m21042j(InterfaceC6066d.class)).m21104b(C6401q.m21051a(InterfaceC7002a.class)).m21104b(C6401q.m21051a(InterfaceC6056a.class)).m21100f(new InterfaceC6387h() { // from class: k9.f
            @Override // p177j9.InterfaceC6387h
            /* renamed from: a */
            public final Object mo1546a(InterfaceC6381e interfaceC6381e) {
                C4181a m28419b;
                m28419b = CrashlyticsRegistrar.this.m28419b(interfaceC6381e);
                return m28419b;
            }
        }).m21101e().m21102d(), C8590h.m15081b("fire-cls", "18.2.8"));
    }
}
