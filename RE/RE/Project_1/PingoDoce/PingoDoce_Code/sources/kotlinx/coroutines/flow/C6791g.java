package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p404vd.InterfaceC11240s;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6791g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m20196f = "Channels.kt", m20195l = {51, 62}, m20194m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: kotlinx.coroutines.flow.g$a */
    /* loaded from: classes2.dex */
    public static final class C6792a<T> extends AbstractC6757d {

        /* renamed from: A */
        int f18168A;

        /* renamed from: w */
        Object f18169w;

        /* renamed from: x */
        Object f18170x;

        /* renamed from: y */
        boolean f18171y;

        /* renamed from: z */
        /* synthetic */ Object f18172z;

        C6792a(InterfaceC1886d<? super C6792a> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18172z = obj;
            this.f18168A |= Integer.MIN_VALUE;
            return C6791g.m20118c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final <T> Object m20119b(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC11240s<? extends T> interfaceC11240s, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object m20118c = m20118c(interfaceC6787d, interfaceC11240s, true, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20118c == m34636d ? m20118c : C13195u.f34156a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:13:0x0032, B:28:0x0070, B:30:0x0076, B:36:0x0084, B:37:0x0085, B:18:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m20118c(kotlinx.coroutines.flow.InterfaceC6787d<? super T> r7, p404vd.InterfaceC11240s<? extends T> r8, boolean r9, bd.InterfaceC1886d<? super p468yc.C13195u> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C6791g.C6792a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.g$a r0 = (kotlinx.coroutines.flow.C6791g.C6792a) r0
            int r1 = r0.f18168A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18168A = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.g$a r0 = new kotlinx.coroutines.flow.g$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f18172z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18168A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.f18171y
            java.lang.Object r8 = r0.f18170x
            vd.s r8 = (p404vd.InterfaceC11240s) r8
            java.lang.Object r9 = r0.f18169w
            kotlinx.coroutines.flow.d r9 = (kotlinx.coroutines.flow.InterfaceC6787d) r9
            p468yc.C13186n.m1453b(r10)     // Catch: java.lang.Throwable -> L55
        L35:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.f18171y
            java.lang.Object r8 = r0.f18170x
            vd.s r8 = (p404vd.InterfaceC11240s) r8
            java.lang.Object r9 = r0.f18169w
            kotlinx.coroutines.flow.d r9 = (kotlinx.coroutines.flow.InterfaceC6787d) r9
            p468yc.C13186n.m1453b(r10)     // Catch: java.lang.Throwable -> L55
            vd.i r10 = (p404vd.C11227i) r10     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r10.m5681k()     // Catch: java.lang.Throwable -> L55
            goto L6f
        L55:
            r9 = move-exception
            goto L9c
        L57:
            p468yc.C13186n.m1453b(r10)
            kotlinx.coroutines.flow.C6788e.m20138j(r7)
        L5d:
            r0.f18169w = r7     // Catch: java.lang.Throwable -> L98
            r0.f18170x = r8     // Catch: java.lang.Throwable -> L98
            r0.f18171y = r9     // Catch: java.lang.Throwable -> L98
            r0.f18168A = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r8.mo5651j(r0)     // Catch: java.lang.Throwable -> L98
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r6 = r9
            r9 = r7
            r7 = r6
        L6f:
            r2 = 0
            boolean r5 = p404vd.C11227i.m5683i(r10)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L85
            java.lang.Throwable r9 = p404vd.C11227i.m5687e(r10)     // Catch: java.lang.Throwable -> L55
            if (r9 != 0) goto L84
            if (r7 == 0) goto L81
            p404vd.C11231j.m5677a(r8, r2)
        L81:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        L84:
            throw r9     // Catch: java.lang.Throwable -> L55
        L85:
            java.lang.Object r10 = p404vd.C11227i.m5685g(r10)     // Catch: java.lang.Throwable -> L55
            r0.f18169w = r9     // Catch: java.lang.Throwable -> L55
            r0.f18170x = r8     // Catch: java.lang.Throwable -> L55
            r0.f18171y = r7     // Catch: java.lang.Throwable -> L55
            r0.f18168A = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r9.mo4529a(r10, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L35
            return r1
        L98:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9c:
            throw r9     // Catch: java.lang.Throwable -> L9d
        L9d:
            r10 = move-exception
            if (r7 == 0) goto La3
            p404vd.C11231j.m5677a(r8, r9)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6791g.m20118c(kotlinx.coroutines.flow.d, vd.s, boolean, bd.d):java.lang.Object");
    }
}
