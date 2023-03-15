package kotlinx.coroutines;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.concurrent.CancellationException;
import td.InterfaceC10490c0;
import td.InterfaceC10574t1;

/* renamed from: kotlinx.coroutines.TimeoutCancellationException */
/* loaded from: classes2.dex */
public final class Timeout extends CancellationException implements InterfaceC10490c0<Timeout> {

    /* renamed from: w */
    public final transient InterfaceC10574t1 f18139w;

    public Timeout(String str, InterfaceC10574t1 interfaceC10574t1) {
        super(str);
        this.f18139w = interfaceC10574t1;
    }

    @Override // td.InterfaceC10490c0
    /* renamed from: b */
    public Timeout mo7843a() {
        String message = getMessage();
        if (message == null) {
            message = BuildConfig.VERSION_NAME;
        }
        Timeout timeout = new Timeout(message, this.f18139w);
        timeout.initCause(this);
        return timeout;
    }

    public Timeout(String str) {
        this(str, null);
    }
}
