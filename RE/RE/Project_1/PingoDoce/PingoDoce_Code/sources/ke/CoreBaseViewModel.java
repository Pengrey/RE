package ke;

import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;

/* renamed from: ke.a */
/* loaded from: classes2.dex */
public abstract class CoreBaseViewModel extends AbstractC1468o0 {

    /* renamed from: c */
    private final C1459l0 f17934c;

    /* renamed from: d */
    private final ResourcesProvider f17935d;

    /* renamed from: e */
    private final C1436e0 f17936e;

    /* renamed from: f */
    private final C1436e0 f17937f;

    /* renamed from: g */
    private final LiveData f17938g;

    /* renamed from: h */
    private final LiveData f17939h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseViewModel.kt */
    @InterfaceC6759f(m20197c = "module.core.presentation.base.viewModel.CoreBaseViewModel", m20196f = "CoreBaseViewModel.kt", m20195l = {64}, m20194m = "safeCall")
    /* renamed from: ke.a$a */
    /* loaded from: classes2.dex */
    public static final class C6656a<T> extends AbstractC6757d {

        /* renamed from: A */
        int f17940A;

        /* renamed from: w */
        Object f17941w;

        /* renamed from: x */
        boolean f17942x;

        /* renamed from: y */
        /* synthetic */ Object f17943y;

        C6656a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17943y = obj;
            this.f17940A |= Integer.MIN_VALUE;
            return CoreBaseViewModel.this.m20384m(false, null, this);
        }
    }

    public CoreBaseViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f17934c = c1459l0;
        this.f17935d = resourcesProvider;
        Boolean bool = Boolean.FALSE;
        C1436e0 c1436e0 = new C1436e0(bool);
        this.f17936e = c1436e0;
        C1436e0 c1436e02 = new C1436e0(bool);
        this.f17937f = c1436e02;
        this.f17938g = c1436e0;
        this.f17939h = c1436e02;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m20383n(CoreBaseViewModel coreBaseViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return coreBaseViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: safeCall");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final ResourcesProvider m20390g() {
        return this.f17935d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C1459l0 m20389h() {
        return this.f17934c;
    }

    /* renamed from: i */
    public final LiveData m20388i() {
        return this.f17939h;
    }

    /* renamed from: j */
    public final LiveData m20387j() {
        return this.f17938g;
    }

    /* renamed from: k */
    protected void m20386k(String str) {
        m20382o(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m20385l(Throwable th2) {
        Intrinsics.isThisObjectNull(th2, "t");
        if ((th2.getCause() instanceof CancellationException) || (th2 instanceof CancellationException)) {
            return;
        }
        m20386k(th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r6 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m20384m(boolean r6, id.InterfaceC6108l r7, bd.InterfaceC1886d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ke.CoreBaseViewModel.C6656a
            if (r0 == 0) goto L13
            r0 = r8
            ke.a$a r0 = (ke.CoreBaseViewModel.C6656a) r0
            int r1 = r0.f17940A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17940A = r1
            goto L18
        L13:
            ke.a$a r0 = new ke.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17943y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f17940A
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r6 = r0.f17942x
            java.lang.Object r7 = r0.f17941w
            ke.a r7 = (ke.CoreBaseViewModel) r7
            p468yc.C13186n.m1453b(r8)     // Catch: java.lang.Throwable -> L30
            goto L55
        L30:
            r8 = move-exception
            goto L5d
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            p468yc.C13186n.m1453b(r8)
            if (r6 == 0) goto L47
            if (r6 == 0) goto L43
            r8 = r3
            goto L44
        L43:
            r8 = r4
        L44:
            r5.m20380q(r8)     // Catch: java.lang.Throwable -> L5b
        L47:
            r0.f17941w = r5     // Catch: java.lang.Throwable -> L5b
            r0.f17942x = r6     // Catch: java.lang.Throwable -> L5b
            r0.f17940A = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = r7.mo9587d(r0)     // Catch: java.lang.Throwable -> L5b
            if (r8 != r1) goto L54
            return r1
        L54:
            r7 = r5
        L55:
            if (r6 == 0) goto L64
        L57:
            r7.m20380q(r4)
            goto L64
        L5b:
            r8 = move-exception
            r7 = r5
        L5d:
            r7.m20385l(r8)     // Catch: java.lang.Throwable -> L65
            r8 = 0
            if (r6 == 0) goto L64
            goto L57
        L64:
            return r8
        L65:
            r8 = move-exception
            if (r6 == 0) goto L6b
            r7.m20380q(r4)
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.CoreBaseViewModel.m20384m(boolean, id.l, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m20382o(String str) {
        if (str != null) {
            if (str.length() > 0) {
                UiEventsLiveData.f18671a.m19510t(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final void m20381p(boolean z) {
        this.f17937f.mo166p(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m20380q(boolean z) {
        this.f17936e.mo166p(Boolean.valueOf(z));
    }
}
