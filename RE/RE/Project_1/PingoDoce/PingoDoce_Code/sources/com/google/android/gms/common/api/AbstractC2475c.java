package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.AbstractC2493d;
import com.google.android.gms.common.api.internal.InterfaceC2496e;
import com.google.android.gms.common.api.internal.InterfaceC2519l;
import com.google.android.gms.common.api.internal.InterfaceC2532p;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@Deprecated
/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes.dex */
public abstract class AbstractC2475c {
    @GuardedBy("sAllClients")

    /* renamed from: a */
    private static final Set<AbstractC2475c> f7185a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2476a extends InterfaceC2496e {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2477b extends InterfaceC2519l {
    }

    /* renamed from: b */
    public static Set<AbstractC2475c> m33478b() {
        Set<AbstractC2475c> set = f7185a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C2461a.InterfaceC2463b, T extends AbstractC2493d<? extends InterfaceC13123e, A>> T mo33320a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo33319c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public boolean m33477d(InterfaceC2532p interfaceC2532p) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void m33476e() {
        throw new UnsupportedOperationException();
    }
}
