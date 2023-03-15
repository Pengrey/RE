package pt.pingodoce.app.presentation.account.anonymousAccount;

import android.view.View;
import androidx.lifecycle.C1459l0;
import be.OperatorExtensions;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13888p1;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;

/* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.a */
/* loaded from: classes2.dex */
public final class AnonymousAccountViewModel extends BaseViewModel {

    /* renamed from: m */
    private final InterfaceC6108l f23316m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnonymousAccountViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC8804a {
        LOGIN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnonymousAccountViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.a$b */
    /* loaded from: classes2.dex */
    public static final class C8805b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: AnonymousAccountViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.anonymousAccount.a$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8806a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23318a;

            static {
                int[] iArr = new int[EnumC8804a.values().length];
                iArr[EnumC8804a.LOGIN.ordinal()] = 1;
                f23318a = iArr;
            }
        }

        C8805b() {
            super(1);
        }

        /* renamed from: a */
        public final void m13629a(EnumC8804a enumC8804a) {
            Intrinsics.isThisObjectNull(enumC8804a, "action");
            if (C8806a.f23318a[enumC8804a.ordinal()] == 1) {
                BaseViewModel.m119C(AnonymousAccountViewModel.this, C13888p1.f35009a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13629a((EnumC8804a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousAccountViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f23316m = OperatorExtensions.m35176e(0L, null, new C8805b(), 3, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m13632L(AnonymousAccountViewModel anonymousAccountViewModel, View view) {
        m13630N(anonymousAccountViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m13630N(AnonymousAccountViewModel anonymousAccountViewModel, View view) {
        Intrinsics.isThisObjectNull(anonymousAccountViewModel, "this$0");
        anonymousAccountViewModel.f23316m.mo9587d(EnumC8804a.LOGIN);
    }

    /* renamed from: M */
    public final View.OnClickListener m13631M() {
        return new View.OnClickListener() { // from class: ah.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnonymousAccountViewModel.m13630N(AnonymousAccountViewModel.this, view);
            }
        };
    }
}
