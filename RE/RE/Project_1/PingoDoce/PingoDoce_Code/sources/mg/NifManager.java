package mg;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import vg.NifService;

/* renamed from: mg.f0 */
/* loaded from: classes2.dex */
public final class NifManager {

    /* renamed from: a */
    private final NifService f19182a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NifManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.NifManager", m20196f = "NifManager.kt", m20195l = {15}, m20194m = "validateNif")
    /* renamed from: mg.f0$a */
    /* loaded from: classes2.dex */
    public static final class C7255a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19183w;

        /* renamed from: y */
        int f19185y;

        C7255a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19183w = obj;
            this.f19185y |= Integer.MIN_VALUE;
            return NifManager.this.m18861a(null, this);
        }
    }

    public NifManager(NifService nifService) {
        Intrinsics.isThisObjectNull(nifService, "service");
        this.f19182a = nifService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18861a(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.NifManager.C7255a
            if (r0 == 0) goto L13
            r0 = r6
            mg.f0$a r0 = (mg.NifManager.C7255a) r0
            int r1 = r0.f19185y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19185y = r1
            goto L18
        L13:
            mg.f0$a r0 = new mg.f0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19183w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19185y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.s r6 = r4.f19182a
            pt.pingodoce.app.data.remote.models.request.NifRequest r2 = new pt.pingodoce.app.data.remote.models.request.NifRequest
            r2.<init>(r5)
            r0.f19185y = r3
            java.lang.Object r6 = r6.m5402m(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4d
            mg.h0$b r5 = mg.AbstractC7286h0.C7288b.f19300a
            return r5
        L4d:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L58
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            throw r5
        L58:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.NifManager.m18861a(java.lang.String, bd.d):java.lang.Object");
    }
}
