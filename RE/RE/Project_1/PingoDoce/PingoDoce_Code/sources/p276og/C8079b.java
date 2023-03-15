package p276og;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;

/* renamed from: og.b */
/* loaded from: classes2.dex */
public final class C8079b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultExt.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.result.ResultExtKt", m20196f = "ResultExt.kt", m20195l = {15}, m20194m = "nullableResultOf")
    /* renamed from: og.b$a */
    /* loaded from: classes2.dex */
    public static final class C8080a<T> extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f20879w;

        /* renamed from: x */
        int f20880x;

        C8080a(InterfaceC1886d<? super C8080a> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f20879w = obj;
            this.f20880x |= Integer.MIN_VALUE;
            return C8079b.m16961a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultExt.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.result.ResultExtKt", m20196f = "ResultExt.kt", m20195l = {7}, m20194m = "resultOf")
    /* renamed from: og.b$b */
    /* loaded from: classes2.dex */
    public static final class C8081b<T> extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f20881w;

        /* renamed from: x */
        int f20882x;

        C8081b(InterfaceC1886d<? super C8081b> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f20881w = obj;
            this.f20882x |= Integer.MIN_VALUE;
            return C8079b.m16960b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m16961a(id.InterfaceC6108l<? super bd.InterfaceC1886d<? super T>, ? extends java.lang.Object> r4, bd.InterfaceC1886d<? super p276og.Result<? extends T>> r5) {
        /*
            boolean r0 = r5 instanceof p276og.C8079b.C8080a
            if (r0 == 0) goto L13
            r0 = r5
            og.b$a r0 = (p276og.C8079b.C8080a) r0
            int r1 = r0.f20880x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20880x = r1
            goto L18
        L13:
            og.b$a r0 = new og.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20879w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f20880x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p468yc.C13186n.m1453b(r5)     // Catch: p425we.BaseException -> L29
            goto L3f
        L29:
            r4 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p468yc.C13186n.m1453b(r5)
            r0.f20880x = r3     // Catch: p425we.BaseException -> L29
            java.lang.Object r5 = r4.mo9587d(r0)     // Catch: p425we.BaseException -> L29
            if (r5 != r1) goto L3f
            return r1
        L3f:
            og.a$c r4 = new og.a$c     // Catch: p425we.BaseException -> L29
            r4.<init>(r5)     // Catch: p425we.BaseException -> L29
            goto L4b
        L45:
            og.a$b r5 = new og.a$b
            r5.<init>(r4)
            r4 = r5
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p276og.C8079b.m16961a(id.l, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m16960b(id.InterfaceC6108l<? super bd.InterfaceC1886d<? super T>, ? extends java.lang.Object> r4, bd.InterfaceC1886d<? super p276og.Result<? extends T>> r5) {
        /*
            boolean r0 = r5 instanceof p276og.C8079b.C8081b
            if (r0 == 0) goto L13
            r0 = r5
            og.b$b r0 = (p276og.C8079b.C8081b) r0
            int r1 = r0.f20882x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20882x = r1
            goto L18
        L13:
            og.b$b r0 = new og.b$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20881w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f20882x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            p468yc.C13186n.m1453b(r5)     // Catch: p425we.BaseException -> L29
            goto L3f
        L29:
            r4 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p468yc.C13186n.m1453b(r5)
            r0.f20882x = r3     // Catch: p425we.BaseException -> L29
            java.lang.Object r5 = r4.mo9587d(r0)     // Catch: p425we.BaseException -> L29
            if (r5 != r1) goto L3f
            return r1
        L3f:
            og.a$c r4 = new og.a$c     // Catch: p425we.BaseException -> L29
            r4.<init>(r5)     // Catch: p425we.BaseException -> L29
            goto L4b
        L45:
            og.a$b r5 = new og.a$b
            r5.<init>(r4)
            r4 = r5
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p276og.C8079b.m16960b(id.l, bd.d):java.lang.Object");
    }
}
