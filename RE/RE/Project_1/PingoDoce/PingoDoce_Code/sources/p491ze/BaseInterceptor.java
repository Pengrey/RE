package p491ze;

import p107ff.InterfaceC5503w;
import p181jd.Intrinsics;
import se.OAuthSharedPrefs;

/* renamed from: ze.a */
/* loaded from: classes2.dex */
public abstract class BaseInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    private final OAuthSharedPrefs f34898a;

    public BaseInterceptor(OAuthSharedPrefs oAuthSharedPrefs) {
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "sharedPrefs");
        this.f34898a = oAuthSharedPrefs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final OAuthSharedPrefs m159b() {
        return this.f34898a;
    }
}
