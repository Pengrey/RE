package p464y8;

import com.google.android.play.core.internal.C3937f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p031b9.InterfaceC1867x;

/* renamed from: y8.e */
/* loaded from: classes.dex */
public final class C13140e implements InterfaceC1867x<Executor> {
    /* renamed from: a */
    public static Executor m1548a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC13138c.f34093a);
        C3937f.m28564g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Executor mo1547c() {
        return m1548a();
    }
}
