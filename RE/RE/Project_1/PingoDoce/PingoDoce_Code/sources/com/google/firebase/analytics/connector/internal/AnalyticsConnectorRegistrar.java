package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C4175c;
import java.util.Arrays;
import java.util.List;
import p081ea.InterfaceC5026d;
import p157i9.InterfaceC6056a;
import p177j9.C6378d;
import p177j9.C6401q;
import p177j9.InterfaceC6388i;
import pa.C8590h;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements InterfaceC6388i {
    @Override // p177j9.InterfaceC6388i
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C6378d<?>> getComponents() {
        return Arrays.asList(C6378d.m21119c(InterfaceC6056a.class).m21104b(C6401q.m21042j(C4175c.class)).m21104b(C6401q.m21042j(Context.class)).m21104b(C6401q.m21042j(InterfaceC5026d.class)).m21100f(C4168a.f11381a).m21101e().m21102d(), C8590h.m15081b("fire-analytics", "20.1.0"));
    }
}
