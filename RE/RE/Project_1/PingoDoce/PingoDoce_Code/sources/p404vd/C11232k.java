package p404vd;

import java.util.concurrent.CancellationException;
import td.C10521h1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
/* renamed from: vd.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C11232k {
    /* renamed from: a */
    public static final void m5676a(InterfaceC11240s<?> interfaceC11240s, Throwable th2) {
        if (th2 != null) {
            r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r0 == null) {
                r0 = C10521h1.m7784a("Channel was consumed, consumer had failed", th2);
            }
        }
        interfaceC11240s.mo5654e(r0);
    }
}
