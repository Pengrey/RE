package com.google.firebase.remoteconfig.internal;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p078e7.InterfaceC5002c;

/* renamed from: com.google.firebase.remoteconfig.internal.e */
/* loaded from: classes.dex */
public class C4349e {

    /* renamed from: a */
    private final Set<InterfaceC5002c<String, C4344c>> f11811a = new HashSet();

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C4349e(Executor executor, C4343b c4343b, C4343b c4343b2) {
    }

    /* renamed from: a */
    public void m27816a(InterfaceC5002c<String, C4344c> interfaceC5002c) {
        synchronized (this.f11811a) {
            this.f11811a.add(interfaceC5002c);
        }
    }
}
