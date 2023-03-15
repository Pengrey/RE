package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C4175c;
import com.google.firebase.abt.component.C4166a;
import java.util.Arrays;
import java.util.List;
import p157i9.InterfaceC6056a;
import p158ia.InterfaceC6066d;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6388i;
import pa.C8590h;
import qa.C9709c;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4341c lambda$getComponents$0(InterfaceC6381e interfaceC6381e) {
        return new C4341c((Context) interfaceC6381e.mo21096a(Context.class), (C4175c) interfaceC6381e.mo21096a(C4175c.class), (InterfaceC6066d) interfaceC6381e.mo21096a(InterfaceC6066d.class), ((C4166a) interfaceC6381e.mo21096a(C4166a.class)).m28472b("frc"), interfaceC6381e.mo21086c(InterfaceC6056a.class));
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(C4341c.class).m21104b(C6401q.m21042j(Context.class)).m21104b(C6401q.m21042j(C4175c.class)).m21104b(C6401q.m21042j(InterfaceC6066d.class)).m21104b(C6401q.m21042j(C4166a.class)).m21104b(C6401q.m21043i(InterfaceC6056a.class)).m21100f(C9709c.f25564a).m21101e().m21102d(), C8590h.m15081b("fire-rc", "21.0.1"));
    }
}
