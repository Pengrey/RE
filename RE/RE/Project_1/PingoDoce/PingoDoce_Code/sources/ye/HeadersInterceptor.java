package ye;

import p181jd.Intrinsics;
import p491ze.BaseInterceptor;
import se.OAuthSharedPrefs;

/* renamed from: ye.a */
/* loaded from: classes2.dex */
public final class HeadersInterceptor extends BaseInterceptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadersInterceptor(OAuthSharedPrefs oAuthSharedPrefs) {
        super(oAuthSharedPrefs);
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "prefs");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p107ff.Response mo23919a(p107ff.InterfaceC5503w.InterfaceC5504a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "chain"
            p181jd.Intrinsics.isThisObjectNull(r5, r0)
            ff.b0 r0 = r5.request()
            ff.b0$a r0 = r0.m24268h()
            se.a r1 = r4.m159b()
            java.lang.String r1 = r1.m8863b()
            if (r1 == 0) goto L20
            boolean r2 = sd.C10163k.m8971r(r1)
            if (r2 == 0) goto L1e
            goto L20
        L1e:
            r2 = 0
            goto L21
        L20:
            r2 = 1
        L21:
            if (r2 != 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Bearer "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Authorization"
            r0.m24260f(r2, r1)
        L39:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLanguageTag()
            java.lang.String r2 = "getDefault().toLanguageTag()"
            p181jd.Intrinsics.checkIfNull(r1, r2)
            java.lang.String r2 = "Accept-Language"
            r0.m24260f(r2, r1)
            ff.b0 r0 = r0.m24264b()
            ff.d0 r5 = r5.mo23918a(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.HeadersInterceptor.mo23919a(ff.w$a):ff.d0");
    }
}
