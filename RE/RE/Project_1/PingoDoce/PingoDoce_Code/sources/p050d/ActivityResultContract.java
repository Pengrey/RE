package p050d;

import android.content.Context;
import android.content.Intent;
import p181jd.Intrinsics;

/* renamed from: d.a */
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: d.a$a */
    /* loaded from: classes.dex */
    public static final class C4517a<T> {

        /* renamed from: a */
        private final Object f12175a;

        public C4517a(Object obj) {
            this.f12175a = obj;
        }

        /* renamed from: a */
        public final Object m27321a() {
            return this.f12175a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo37402d(Context context, Object obj);

    /* renamed from: b */
    public C4517a m27323b(Context context, Object obj) {
        Intrinsics.isThisObjectNull(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract Object mo37401e(int i, Intent intent);
}
