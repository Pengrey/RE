package p482z4;

import com.facebook.C2290b;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import p181jd.Intrinsics;

/* renamed from: z4.j */
/* loaded from: classes.dex */
public final class LockOnGetVariable<T> {

    /* renamed from: a */
    private Object f34689a;

    /* renamed from: b */
    private CountDownLatch f34690b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockOnGetVariable.kt */
    /* renamed from: z4.j$a */
    /* loaded from: classes.dex */
    public static final class CallableC13647a<V> implements Callable {

        /* renamed from: b */
        final /* synthetic */ Callable f34692b;

        CallableC13647a(Callable callable) {
            this.f34692b = callable;
        }

        /* renamed from: a */
        public final Void call() {
            try {
                LockOnGetVariable.m714b(LockOnGetVariable.this, this.f34692b.call());
            } finally {
                CountDownLatch m715a = LockOnGetVariable.m715a(LockOnGetVariable.this);
                if (m715a != null) {
                    m715a.countDown();
                }
            }
        }
    }

    public LockOnGetVariable(Callable callable) {
        Intrinsics.isThisObjectNull(callable, "callable");
        this.f34690b = new CountDownLatch(1);
        C2290b.m34103l().execute(new FutureTask(new CallableC13647a(callable)));
    }

    /* renamed from: a */
    public static final /* synthetic */ CountDownLatch m715a(LockOnGetVariable lockOnGetVariable) {
        return lockOnGetVariable.f34690b;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m714b(LockOnGetVariable lockOnGetVariable, Object obj) {
        lockOnGetVariable.f34689a = obj;
    }
}
