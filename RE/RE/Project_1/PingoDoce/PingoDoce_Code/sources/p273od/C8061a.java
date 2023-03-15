package p273od;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p181jd.Intrinsics;
import p255nd.AbstractC7697a;

/* renamed from: od.a */
/* loaded from: classes2.dex */
public final class C8061a extends AbstractC7697a {
    /* renamed from: c */
    public Random mo17678c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkIfNull(current, "current()");
        return current;
    }
}
