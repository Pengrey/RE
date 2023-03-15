package p051d0;

import androidx.compose.p018ui.platform.InterfaceC0724i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p092f0.InterfaceC5258v0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7584e;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.InterfaceC9570f;
import p345s.Animatable;
import p345s.C9937b;
import p345s.InterfaceC9950h;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.MutableCollections;
import td.C10565r0;
import td.InterfaceC10524i0;

/* compiled from: SnackbarHost.kt */
/* renamed from: d0.w0 */
/* loaded from: classes.dex */
public final class C4661w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$a */
    /* loaded from: classes.dex */
    public static final class C4662a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC4656t0 f12698w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC4656t0 f12699x;

        /* renamed from: y */
        final /* synthetic */ List f12700y;

        /* renamed from: z */
        final /* synthetic */ C4538c0 f12701z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnackbarHost.kt */
        /* renamed from: d0.w0$a$a */
        /* loaded from: classes.dex */
        public static final class C4663a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC4656t0 f12702w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SnackbarHost.kt */
            /* renamed from: d0.w0$a$a$a */
            /* loaded from: classes.dex */
            public static final class C4664a extends AbstractC6438m implements InterfaceC6097a {

                /* renamed from: w */
                final /* synthetic */ InterfaceC4656t0 f12703w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4664a(InterfaceC4656t0 interfaceC4656t0) {
                    super(0);
                    this.f12703w = interfaceC4656t0;
                }

                /* renamed from: a */
                public final Boolean mo42214q() {
                    this.f12703w.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4663a(InterfaceC4656t0 interfaceC4656t0) {
                super(1);
                this.f12702w = interfaceC4656t0;
            }

            /* renamed from: a */
            public final void m26998a(InterfaceC7621v interfaceC7621v) {
                Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
                C7617t.m17919s(interfaceC7621v, C7584e.f20070b.m18085b());
                C7617t.m17934d(interfaceC7621v, null, new C4664a(this.f12702w), 1, null);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m26998a((InterfaceC7621v) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnackbarHost.kt */
        /* renamed from: d0.w0$a$b */
        /* loaded from: classes.dex */
        public static final class C4665b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC4656t0 f12704w;

            /* renamed from: x */
            final /* synthetic */ C4538c0 f12705x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SnackbarHost.kt */
            /* renamed from: d0.w0$a$b$a */
            /* loaded from: classes.dex */
            public static final class C4666a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ InterfaceC4656t0 f12706w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4666a(InterfaceC4656t0 interfaceC4656t0) {
                    super(1);
                    this.f12706w = interfaceC4656t0;
                }

                /* renamed from: a */
                public final Boolean mo9587d(SnackbarHost snackbarHost) {
                    Intrinsics.isThisObjectNull(snackbarHost, "it");
                    return Boolean.valueOf(Intrinsics.equals(snackbarHost.m27282c(), this.f12706w));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4665b(InterfaceC4656t0 interfaceC4656t0, C4538c0 c4538c0) {
                super(0);
                this.f12704w = interfaceC4656t0;
                this.f12705x = c4538c0;
            }

            /* renamed from: a */
            public final void m26996a() {
                if (Intrinsics.equals(this.f12704w, this.f12705x.m27269a())) {
                    return;
                }
                MutableCollections.m177y(this.f12705x.m27268b(), new C4666a(this.f12704w));
                InterfaceC5258v0 m27267c = this.f12705x.m27267c();
                if (m27267c == null) {
                    return;
                }
                m27267c.invalidate();
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m26996a();
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4662a(InterfaceC4656t0 interfaceC4656t0, InterfaceC4656t0 interfaceC4656t02, List list, C4538c0 c4538c0) {
            super(3);
            this.f12698w = interfaceC4656t0;
            this.f12699x = interfaceC4656t02;
            this.f12700y = list;
            this.f12701z = c4538c0;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m26999a((InterfaceC6112p) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m26999a(id.InterfaceC6112p r33, p092f0.InterfaceC5179i r34, int r35) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p051d0.C4661w0.C4662a.m26999a(id.p, f0.i, int):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$b */
    /* loaded from: classes.dex */
    public static final class C4667b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6113q f12707w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC4656t0 f12708x;

        /* renamed from: y */
        final /* synthetic */ int f12709y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4667b(InterfaceC6113q interfaceC6113q, InterfaceC4656t0 interfaceC4656t0, int i) {
            super(2);
            this.f12707w = interfaceC6113q;
            this.f12708x = interfaceC4656t0;
            this.f12709y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26994a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26994a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
                return;
            }
            InterfaceC6113q interfaceC6113q = this.f12707w;
            InterfaceC4656t0 interfaceC4656t0 = this.f12708x;
            Intrinsics.ifNullDoSomething(interfaceC4656t0);
            interfaceC6113q.mo4533i(interfaceC4656t0, interfaceC5179i, Integer.valueOf((this.f12709y >> 3) & 112));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$c */
    /* loaded from: classes.dex */
    public static final class C4668c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f12710A;

        /* renamed from: w */
        final /* synthetic */ InterfaceC4656t0 f12711w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12712x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6113q f12713y;

        /* renamed from: z */
        final /* synthetic */ int f12714z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4668c(InterfaceC4656t0 interfaceC4656t0, InterfaceC9570f interfaceC9570f, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12711w = interfaceC4656t0;
            this.f12712x = interfaceC9570f;
            this.f12713y = interfaceC6113q;
            this.f12714z = i;
            this.f12710A = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26993a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26993a(InterfaceC5179i interfaceC5179i, int i) {
            C4661w0.m27005c(this.f12711w, this.f12712x, this.f12713y, interfaceC5179i, this.f12714z | 1, this.f12710A);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", m20196f = "SnackbarHost.kt", m20195l = {164}, m20194m = "invokeSuspend")
    /* renamed from: d0.w0$d */
    /* loaded from: classes.dex */
    public static final class C4669d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f12715x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC4656t0 f12716y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC0724i f12717z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4669d(InterfaceC4656t0 interfaceC4656t0, InterfaceC0724i interfaceC0724i, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12716y = interfaceC4656t0;
            this.f12717z = interfaceC0724i;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4669d(this.f12716y, this.f12717z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4669d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12715x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC4656t0 interfaceC4656t0 = this.f12716y;
                if (interfaceC4656t0 != null) {
                    long m27000h = C4661w0.m27000h(interfaceC4656t0.m27019a(), this.f12716y.m27016d() != null, this.f12717z);
                    this.f12715x = 1;
                    if (C10565r0.m7677a(m27000h, this) == m34636d) {
                        return m34636d;
                    }
                }
                return C13195u.f34156a;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f12716y.dismiss();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$e */
    /* loaded from: classes.dex */
    public static final class C4670e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f12718A;

        /* renamed from: w */
        final /* synthetic */ C4676x0 f12719w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12720x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6113q f12721y;

        /* renamed from: z */
        final /* synthetic */ int f12722z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4670e(C4676x0 c4676x0, InterfaceC9570f interfaceC9570f, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12719w = c4676x0;
            this.f12720x = interfaceC9570f;
            this.f12721y = interfaceC6113q;
            this.f12722z = i;
            this.f12718A = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m26991a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m26991a(InterfaceC5179i interfaceC5179i, int i) {
            C4661w0.m27006b(this.f12719w, this.f12720x, this.f12721y, interfaceC5179i, this.f12722z | 1, this.f12718A);
        }
    }

    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$f */
    /* loaded from: classes.dex */
    public /* synthetic */ class C4671f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12723a;

        static {
            int[] iArr = new int[EnumC4659v0.values().length];
            iArr[EnumC4659v0.Indefinite.ordinal()] = 1;
            iArr[EnumC4659v0.Long.ordinal()] = 2;
            iArr[EnumC4659v0.Short.ordinal()] = 3;
            f12723a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* renamed from: d0.w0$g */
    /* loaded from: classes.dex */
    public static final class C4672g extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C4672g f12724w = new C4672g();

        C4672g() {
            super(0);
        }

        /* renamed from: a */
        public final void m26990a() {
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m26990a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", m20196f = "SnackbarHost.kt", m20195l = {350}, m20194m = "invokeSuspend")
    /* renamed from: d0.w0$h */
    /* loaded from: classes.dex */
    public static final class C4673h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC9950h f12725A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6097a f12726B;

        /* renamed from: x */
        int f12727x;

        /* renamed from: y */
        final /* synthetic */ Animatable f12728y;

        /* renamed from: z */
        final /* synthetic */ boolean f12729z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4673h(Animatable animatable, boolean z, InterfaceC9950h interfaceC9950h, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12728y = animatable;
            this.f12729z = z;
            this.f12725A = interfaceC9950h;
            this.f12726B = interfaceC6097a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4673h(this.f12728y, this.f12729z, this.f12725A, this.f12726B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4673h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12727x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable animatable = this.f12728y;
                Float m20200b = C6755b.m20200b(this.f12729z ? 1.0f : 0.0f);
                InterfaceC9950h interfaceC9950h = this.f12725A;
                this.f12727x = 1;
                if (Animatable.m9653f(animatable, m20200b, interfaceC9950h, null, null, this, 12, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f12726B.mo42214q();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", m20196f = "SnackbarHost.kt", m20195l = {363}, m20194m = "invokeSuspend")
    /* renamed from: d0.w0$i */
    /* loaded from: classes.dex */
    public static final class C4674i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC9950h f12730A;

        /* renamed from: x */
        int f12731x;

        /* renamed from: y */
        final /* synthetic */ Animatable f12732y;

        /* renamed from: z */
        final /* synthetic */ boolean f12733z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4674i(Animatable animatable, boolean z, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12732y = animatable;
            this.f12733z = z;
            this.f12730A = interfaceC9950h;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4674i(this.f12732y, this.f12733z, this.f12730A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4674i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12731x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable animatable = this.f12732y;
                Float m20200b = C6755b.m20200b(this.f12733z ? 1.0f : 0.8f);
                InterfaceC9950h interfaceC9950h = this.f12730A;
                this.f12731x = 1;
                if (Animatable.m9653f(animatable, m20200b, interfaceC9950h, null, null, this, 12, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207 A[LOOP:2: B:79:0x0204->B:81:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0237 A[EDGE_INSN: B:91:0x0237->B:82:0x0237 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m27007a(p051d0.InterfaceC4656t0 r18, p302q0.InterfaceC9570f r19, id.InterfaceC6113q r20, p092f0.InterfaceC5179i r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.C4661w0.m27007a(d0.t0, q0.f, id.q, f0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27006b(p051d0.C4676x0 r12, p302q0.InterfaceC9570f r13, id.InterfaceC6113q r14, p092f0.InterfaceC5179i r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.C4661w0.m27006b(d0.x0, q0.f, id.q, f0.i, int, int):void");
    }

    /* renamed from: c */
    public static final /* synthetic */ void m27005c(InterfaceC4656t0 interfaceC4656t0, InterfaceC9570f interfaceC9570f, InterfaceC6113q interfaceC6113q, InterfaceC5179i interfaceC5179i, int i, int i2) {
        m27007a(interfaceC4656t0, interfaceC9570f, interfaceC6113q, interfaceC5179i, i, i2);
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC5242r1 m27004d(InterfaceC9950h interfaceC9950h, boolean z, InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i, int i2) {
        return m27002f(interfaceC9950h, z, interfaceC6097a, interfaceC5179i, i, i2);
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC5242r1 m27003e(InterfaceC9950h interfaceC9950h, boolean z, InterfaceC5179i interfaceC5179i, int i) {
        return m27001g(interfaceC9950h, z, interfaceC5179i, i);
    }

    /* renamed from: f */
    private static final InterfaceC5242r1 m27002f(InterfaceC9950h interfaceC9950h, boolean z, InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i, int i2) {
        interfaceC5179i.mo25263g(-731820156);
        if ((i2 & 4) != 0) {
            interfaceC6097a = C4672g.f12724w;
        }
        InterfaceC6097a interfaceC6097a2 = interfaceC6097a;
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C9937b.m9627b(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        Animatable animatable = (Animatable) mo25262h;
        Effects.m25539c(Boolean.valueOf(z), new C4673h(animatable, z, interfaceC9950h, interfaceC6097a2, null), interfaceC5179i, (i >> 3) & 14);
        InterfaceC5242r1 m9652g = animatable.m9652g();
        interfaceC5179i.mo25282C();
        return m9652g;
    }

    /* renamed from: g */
    private static final InterfaceC5242r1 m27001g(InterfaceC9950h interfaceC9950h, boolean z, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-684820976);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C9937b.m9627b(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        Animatable animatable = (Animatable) mo25262h;
        Effects.m25539c(Boolean.valueOf(z), new C4674i(animatable, z, interfaceC9950h, null), interfaceC5179i, (i >> 3) & 14);
        InterfaceC5242r1 m9652g = animatable.m9652g();
        interfaceC5179i.mo25282C();
        return m9652g;
    }

    /* renamed from: h */
    public static final long m27000h(EnumC4659v0 enumC4659v0, boolean z, InterfaceC0724i interfaceC0724i) {
        long j;
        Intrinsics.isThisObjectNull(enumC4659v0, "<this>");
        int i = C4671f.f12723a[enumC4659v0.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            j = 4000;
        }
        long j2 = j;
        return interfaceC0724i == null ? j2 : interfaceC0724i.mo39726a(j2, true, true, z);
    }
}
