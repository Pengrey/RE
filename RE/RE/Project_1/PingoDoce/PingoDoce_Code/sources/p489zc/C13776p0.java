package p489zc;

import java.util.Collections;
import java.util.Set;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zc.p0 */
/* loaded from: classes2.dex */
public class C13776p0 {
    /* renamed from: a */
    public static final Set m266a(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkIfNull(singleton, "singleton(element)");
        return singleton;
    }
}
