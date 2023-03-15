package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p135h9.C5879a;
import p157i9.InterfaceC6056a;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6381e;
import p177j9.InterfaceC6388i;
import pa.C8590h;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4166a lambda$getComponents$0(InterfaceC6381e interfaceC6381e) {
        return new C4166a((Context) interfaceC6381e.mo21096a(Context.class), interfaceC6381e.mo21086c(InterfaceC6056a.class));
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(C4166a.class).m21104b(C6401q.m21042j(Context.class)).m21104b(C6401q.m21043i(InterfaceC6056a.class)).m21100f(C5879a.f16310a).m21102d(), C8590h.m15081b("fire-abt", "21.0.0"));
    }
}
