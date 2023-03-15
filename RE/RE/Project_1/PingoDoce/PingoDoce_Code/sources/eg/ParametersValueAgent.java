package eg;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.AbstractC5932c;
import p142hg.HashMapLocalDataProvider;
import p181jd.Intrinsics;
import p317qg.C9729a;
import tg.InterfaceC10619b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eg.c */
/* loaded from: classes2.dex */
public abstract class ParametersValueAgent<P, T> extends AbstractC5050a {

    /* renamed from: e */
    public static final C5065a f14058e = new C5065a(null);

    /* compiled from: ParametersValueAgent.kt */
    /* renamed from: eg.c$a */
    /* loaded from: classes2.dex */
    public static final class C5065a {

        /* compiled from: ParametersValueAgent.kt */
        /* renamed from: eg.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C5066a extends ParametersValueAgent {

            /* renamed from: f */
            private final String f14059f;

            /* renamed from: g */
            private final C9729a f14060g;

            /* renamed from: h */
            private final AbstractC5932c f14061h;

            /* renamed from: i */
            private final InterfaceC6112p f14062i;

            /* renamed from: j */
            final /* synthetic */ InterfaceC10619b f14063j;

            C5066a(String str, int i, long j, long j2, HashMapLocalDataProvider hashMapLocalDataProvider, InterfaceC10619b interfaceC10619b, InterfaceC6112p interfaceC6112p) {
                this.f14063j = interfaceC10619b;
                this.f14059f = str + "[" + i + "]";
                this.f14060g = new C9729a(j, j2);
                this.f14061h = hashMapLocalDataProvider != null ? hashMapLocalDataProvider.m22696m(interfaceC10619b) : null;
                this.f14062i = interfaceC6112p;
            }

            /* renamed from: B */
            public Object m25761B(InterfaceC1886d interfaceC1886d) {
                return m25795m(this.f14063j, interfaceC1886d);
            }

            /* renamed from: C */
            public Object m25760C(InterfaceC1886d interfaceC1886d) {
                return m25792p(this.f14063j);
            }

            /* renamed from: n */
            public String m25759n() {
                return this.f14059f;
            }

            /* renamed from: q */
            protected InterfaceC6112p m25758q() {
                return this.f14062i;
            }

            /* renamed from: r */
            protected AbstractC5932c m25757r() {
                return this.f14061h;
            }

            /* renamed from: s */
            protected C9729a m25756s() {
                return this.f14060g;
            }
        }

        private C5065a() {
        }

        public /* synthetic */ C5065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ParametersValueAgent m25762a(InterfaceC10619b interfaceC10619b, long j, long j2, String str, int i, HashMapLocalDataProvider hashMapLocalDataProvider, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC10619b, "parameters");
            Intrinsics.isThisObjectNull(str, "parentAgentName");
            Intrinsics.isThisObjectNull(interfaceC6112p, "getFromNetwork");
            return new C5066a(str, i, j, j2, hashMapLocalDataProvider, interfaceC10619b, interfaceC6112p);
        }
    }

    /* renamed from: B */
    public abstract Object m25764B(InterfaceC1886d interfaceC1886d);

    /* renamed from: C */
    public abstract Object m25763C(InterfaceC1886d interfaceC1886d);
}
