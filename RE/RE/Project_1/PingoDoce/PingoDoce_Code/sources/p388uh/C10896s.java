package p388uh;

import androidx.lifecycle.SavedStateHandle;
import mg.AuthManager;
import mg.C5822s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC9567a;
import p494zh.BaseViewModel_MembersInjector;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel;

/* renamed from: uh.s */
/* loaded from: classes2.dex */
public final class NotificationsViewModel_Factory {

    /* renamed from: a */
    private final InterfaceC9567a<ResourcesProvider> f28113a;

    /* renamed from: b */
    private final InterfaceC9567a<C5822s1> f28114b;

    /* renamed from: c */
    private final InterfaceC9567a<AuthManager> f28115c;

    /* renamed from: d */
    private final InterfaceC9567a<LoyaltyCardManager> f28116d;

    /* renamed from: e */
    private final InterfaceC9567a<C5822s1> f28117e;

    public NotificationsViewModel_Factory(InterfaceC9567a<ResourcesProvider> interfaceC9567a, InterfaceC9567a<C5822s1> interfaceC9567a2, InterfaceC9567a<AuthManager> interfaceC9567a3, InterfaceC9567a<LoyaltyCardManager> interfaceC9567a4, InterfaceC9567a<C5822s1> interfaceC9567a5) {
        this.f28113a = interfaceC9567a;
        this.f28114b = interfaceC9567a2;
        this.f28115c = interfaceC9567a3;
        this.f28116d = interfaceC9567a4;
        this.f28117e = interfaceC9567a5;
    }

    /* renamed from: a */
    public static NotificationsViewModel_Factory m6383a(InterfaceC9567a<ResourcesProvider> interfaceC9567a, InterfaceC9567a<C5822s1> interfaceC9567a2, InterfaceC9567a<AuthManager> interfaceC9567a3, InterfaceC9567a<LoyaltyCardManager> interfaceC9567a4, InterfaceC9567a<C5822s1> interfaceC9567a5) {
        return new NotificationsViewModel_Factory(interfaceC9567a, interfaceC9567a2, interfaceC9567a3, interfaceC9567a4, interfaceC9567a5);
    }

    /* renamed from: c */
    public static NotificationsViewModel m6381c(SavedStateHandle savedStateHandle, ResourcesProvider resourcesProvider, C5822s1 c5822s1, AuthManager authManager, LoyaltyCardManager loyaltyCardManager) {
        return new NotificationsViewModel(savedStateHandle, resourcesProvider, c5822s1, authManager, loyaltyCardManager);
    }

    /* renamed from: b */
    public NotificationsViewModel m6382b(SavedStateHandle savedStateHandle) {
        NotificationsViewModel m6381c = m6381c(savedStateHandle, this.f28113a.get(), this.f28114b.get(), this.f28115c.get(), this.f28116d.get());
        BaseViewModel_MembersInjector.m92a(m6381c, this.f28117e.get());
        return m6381c;
    }
}
