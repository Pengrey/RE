package bi;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;

/* renamed from: bi.a */
/* loaded from: classes2.dex */
public final class C1924a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BarCodeReader.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.base.extraActivities.BarCodeReaderKt", m20196f = "BarCodeReader.kt", m20195l = {16}, m20194m = "launchBarCodeReader")
    /* renamed from: bi.a$a */
    /* loaded from: classes2.dex */
    public static final class C1925a extends AbstractC6757d {

        /* renamed from: w */
        Object f5679w;

        /* renamed from: x */
        Object f5680x;

        /* renamed from: y */
        /* synthetic */ Object f5681y;

        /* renamed from: z */
        int f5682z;

        C1925a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f5681y = obj;
            this.f5682z |= Integer.MIN_VALUE;
            return C1924a.m35138a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m35138a(vc.AbstractActivityC11204b r6, androidx.activity.result.AbstractC0304b r7, bd.InterfaceC1886d r8) {
        /*
            boolean r0 = r8 instanceof bi.C1924a.C1925a
            if (r0 == 0) goto L13
            r0 = r8
            bi.a$a r0 = (bi.C1924a.C1925a) r0
            int r1 = r0.f5682z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5682z = r1
            goto L18
        L13:
            bi.a$a r0 = new bi.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5681y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f5682z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r6 = r0.f5680x
            r7 = r6
            androidx.activity.result.b r7 = (androidx.activity.result.AbstractC0304b) r7
            java.lang.Object r6 = r0.f5679w
            vc.b r6 = (vc.AbstractActivityC11204b) r6
            p468yc.C13186n.m1453b(r8)
            goto L57
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p468yc.C13186n.m1453b(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.String r2 = "android.permission.CAMERA"
            l5.c r8 = p249n5.PermissionsBuilder.m17728b(r6, r2, r8)
            o5.b r8 = r8.build()
            r0.f5679w = r6
            r0.f5680x = r7
            r0.f5682z = r4
            java.lang.Object r8 = p234m5.SuspendExtensions.m19106a(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = p195k5.C6599b.m20515a(r8)
            if (r0 == 0) goto L88
            sb.a r8 = new sb.a
            r8.<init>(r6)
            java.lang.String r0 = "EAN_13"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r8.m9062j(r0)
            r8.m9063i(r3)
            r8.m9064h(r3)
            r8.m9061k(r4)
            r0 = 2131886792(0x7f1202c8, float:1.9408173E38)
            java.lang.String r6 = r6.getString(r0)
            r8.m9060l(r6)
            android.content.Intent r6 = r8.m9069c()
            r7.m41324a(r6)
            goto Lae
        L88:
            boolean r7 = p195k5.C6599b.m20514b(r8)
            if (r7 == 0) goto Lae
            le.a r0 = p221le.UiEventsLiveData.f18671a
            r7 = 2131886293(0x7f1200d5, float:1.940716E38)
            java.lang.String r1 = r6.getString(r7)
            java.lang.String r7 = "getString(R.string.dialog_caution_title)"
            p181jd.Intrinsics.checkIfNull(r1, r7)
            r7 = 2131886736(0x7f120290, float:1.940806E38)
            java.lang.String r2 = r6.getString(r7)
            java.lang.String r6 = "getString(R.string.lbl_permission_denied)"
            p181jd.Intrinsics.checkIfNull(r2, r6)
            r3 = 0
            r4 = 4
            r5 = 0
            p221le.UiEventsLiveData.m19514p(r0, r1, r2, r3, r4, r5)
        Lae:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.C1924a.m35138a(vc.b, androidx.activity.result.b, bd.d):java.lang.Object");
    }
}
