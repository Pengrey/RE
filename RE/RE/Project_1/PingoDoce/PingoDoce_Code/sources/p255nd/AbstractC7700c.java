package p255nd;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p064dd.C4784b;

/* renamed from: nd.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7700c {

    /* renamed from: w */
    public static final C7701a f20299w = new C7701a(null);

    /* renamed from: x */
    private static final AbstractC7700c f20300x = C4784b.f13103a.mo24303b();

    /* compiled from: Random.kt */
    /* renamed from: nd.c$a */
    /* loaded from: classes2.dex */
    public static final class C7701a extends AbstractC7700c implements Serializable {

        /* compiled from: Random.kt */
        /* renamed from: nd.c$a$a */
        /* loaded from: classes2.dex */
        private static final class C7702a implements Serializable {

            /* renamed from: w */
            public static final C7702a f20301w = new C7702a();

            private C7702a() {
            }

            private final Object readResolve() {
                return AbstractC7700c.f20299w;
            }
        }

        private C7701a() {
        }

        public /* synthetic */ C7701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return C7702a.f20301w;
        }

        @Override // p255nd.AbstractC7700c
        /* renamed from: b */
        public int mo17674b() {
            return AbstractC7700c.f20300x.mo17674b();
        }
    }

    /* renamed from: b */
    public abstract int mo17674b();
}
