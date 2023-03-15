package wf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import org.threeten.p283bp.zone.C8320c;

/* renamed from: wf.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C11664b {
    /* renamed from: a */
    public static /* synthetic */ Iterator m4525a() {
        try {
            return Arrays.asList(new C8320c()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
