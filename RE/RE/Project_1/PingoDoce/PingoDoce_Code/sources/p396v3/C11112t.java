package p396v3;

import id.InterfaceC6097a;
import p181jd.C6435i;

/* renamed from: v3.t */
/* loaded from: classes.dex */
public final class C11112t {

    /* renamed from: a */
    public static final C11112t f28513a = new C11112t();

    /* renamed from: b */
    private static InterfaceC6097a<Long> f28514b = C11113a.f28515F;

    /* compiled from: Time.kt */
    /* renamed from: v3.t$a */
    /* loaded from: classes.dex */
    /* synthetic */ class C11113a extends C6435i implements InterfaceC6097a<Long> {

        /* renamed from: F */
        public static final C11113a f28515F = new C11113a();

        C11113a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: i */
        public final Long mo42214q() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private C11112t() {
    }

    /* renamed from: a */
    public final long m6109a() {
        return f28514b.mo42214q().longValue();
    }
}
