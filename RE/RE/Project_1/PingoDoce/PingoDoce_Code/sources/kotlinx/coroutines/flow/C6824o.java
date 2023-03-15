package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6824o {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.o$a */
    /* loaded from: classes2.dex */
    public static final class C6825a implements InterfaceC6785c<T> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18241w;

        /* compiled from: Emitters.kt */
        /* renamed from: kotlinx.coroutines.flow.o$a$a */
        /* loaded from: classes2.dex */
        public static final class C6826a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f18242w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m20196f = "Transform.kt", m20195l = {223}, m20194m = "emit")
            /* renamed from: kotlinx.coroutines.flow.o$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C6827a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f18243w;

                /* renamed from: x */
                int f18244x;

                public C6827a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f18243w = obj;
                    this.f18244x |= Integer.MIN_VALUE;
                    return C6826a.this.mo4529a(null, this);
                }
            }

            public C6826a(InterfaceC6787d interfaceC6787d) {
                this.f18242w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.InterfaceC6787d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(T r5, bd.InterfaceC1886d<? super p468yc.C13195u> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6824o.C6825a.C6826a.C6827a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.o$a$a$a r0 = (kotlinx.coroutines.flow.C6824o.C6825a.C6826a.C6827a) r0
                    int r1 = r0.f18244x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18244x = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.o$a$a$a r0 = new kotlinx.coroutines.flow.o$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f18243w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f18244x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f18242w
                    if (r5 == 0) goto L41
                    r0.f18244x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6824o.C6825a.C6826a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C6825a(InterfaceC6785c interfaceC6785c) {
            this.f18241w = interfaceC6785c;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f18241w.mo20086d(new C6826a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC6785c<T> m20093a(InterfaceC6785c<? extends T> interfaceC6785c) {
        return new C6825a(interfaceC6785c);
    }
}
