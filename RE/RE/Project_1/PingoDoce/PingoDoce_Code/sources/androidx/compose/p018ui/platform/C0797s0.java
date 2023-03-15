package androidx.compose.p018ui.platform;

import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.AbstractC7961h;
import p404vd.C11226h;
import p404vd.InterfaceC11222e;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;

/* compiled from: GlobalSnapshotManager.android.kt */
/* renamed from: androidx.compose.ui.platform.s0 */
/* loaded from: classes.dex */
public final class C0797s0 {

    /* renamed from: a */
    public static final C0797s0 f2409a = new C0797s0();

    /* renamed from: b */
    private static final AtomicBoolean f2410b = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m20196f = "GlobalSnapshotManager.android.kt", m20195l = {63}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.s0$a */
    /* loaded from: classes.dex */
    public static final class C0798a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC11222e f2411A;

        /* renamed from: x */
        Object f2412x;

        /* renamed from: y */
        Object f2413y;

        /* renamed from: z */
        int f2414z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0798a(InterfaceC11222e interfaceC11222e, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f2411A = interfaceC11222e;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0798a(this.f2411A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0798a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:17:0x0042, B:19:0x004a), top: B:30:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:16:0x0041). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r7.f2414z
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f2413y
                vd.g r1 = (p404vd.InterfaceC11225g) r1
                java.lang.Object r3 = r7.f2412x
                vd.s r3 = (p404vd.InterfaceC11240s) r3
                p468yc.C13186n.m1453b(r8)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L41
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                p468yc.C13186n.m1453b(r8)
                vd.e r3 = r7.f2411A
                vd.g r8 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r8
                r8 = r7
            L2e:
                r8.f2412x = r3     // Catch: java.lang.Throwable -> L63
                r8.f2413y = r1     // Catch: java.lang.Throwable -> L63
                r8.f2414z = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.mo5694a(r8)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r6
            L41:
                r5 = 0
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L60
                boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r8 == 0) goto L5a
                java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L60
                yc.u r8 = (p468yc.C13195u) r8     // Catch: java.lang.Throwable -> L60
                o0.h$a r8 = p260o0.AbstractC7961h.f20646d     // Catch: java.lang.Throwable -> L60
                r8.m17363f()     // Catch: java.lang.Throwable -> L60
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L5a:
                p404vd.C11231j.m5677a(r4, r5)
                yc.u r8 = p468yc.C13195u.f34156a
                return r8
            L60:
                r8 = move-exception
                r3 = r4
                goto L64
            L63:
                r8 = move-exception
            L64:
                throw r8     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                p404vd.C11231j.m5677a(r3, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0797s0.C0798a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    /* renamed from: androidx.compose.ui.platform.s0$b */
    /* loaded from: classes.dex */
    public static final class C0799b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC11222e f2415w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0799b(InterfaceC11222e interfaceC11222e) {
            super(1);
            this.f2415w = interfaceC11222e;
        }

        /* renamed from: a */
        public final void m39530a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "it");
            this.f2415w.mo5641i(C13195u.f34156a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39530a(obj);
            return C13195u.f34156a;
        }
    }

    private C0797s0() {
    }

    /* renamed from: a */
    public final void m39532a() {
        if (f2410b.compareAndSet(false, true)) {
            InterfaceC11222e m5692b = C11226h.m5692b(-1, null, null, 6, null);
            C6772d.m20158d(C10531j0.m7771a(C0692c0.f2194I.m39783b()), null, null, new C0798a(m5692b, null), 3, null);
            AbstractC7961h.f20646d.m17364e(new C0799b(m5692b));
        }
    }
}
