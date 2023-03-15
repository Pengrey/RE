package mg;

import android.content.SharedPreferences;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.r1 */
/* loaded from: classes2.dex */
public final class C7399r1 implements InterfaceC11614c<TransactionCacheManager> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f19627a;

    public C7399r1(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f19627a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C7399r1 m18573a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C7399r1(interfaceC12341a);
    }

    /* renamed from: c */
    public static TransactionCacheManager m18571c(SharedPreferences sharedPreferences) {
        return new TransactionCacheManager(sharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public TransactionCacheManager mo42226get() {
        return m18571c(this.f19627a.mo42226get());
    }
}
