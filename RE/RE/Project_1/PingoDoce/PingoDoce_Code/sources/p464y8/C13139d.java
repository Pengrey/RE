package p464y8;

import com.google.android.play.core.internal.C3937f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p031b9.InterfaceC1867x;

/* renamed from: y8.d */
/* loaded from: classes.dex */
public final class C13139d implements InterfaceC1867x<Executor> {
    /* renamed from: a */
    public static Executor m1549a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC13137b.f34092a);
        C3937f.m28564g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Executor mo1547c() {
        return m1549a();
    }
}
