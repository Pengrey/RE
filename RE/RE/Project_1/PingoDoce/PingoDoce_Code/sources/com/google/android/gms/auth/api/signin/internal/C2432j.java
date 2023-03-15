package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2499f;
import p043c7.C2093a;
import p379u6.C10846e;
import p379u6.RunnableC10843b;
import p462y6.AbstractC13119b;
import p462y6.C13121c;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
/* loaded from: classes.dex */
public final class C2432j {

    /* renamed from: a */
    private static final C2093a f7092a = new C2093a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static AbstractC13119b<Status> m33570a(AbstractC2475c abstractC2475c, Context context, boolean z) {
        f7092a.m34698a("Revoking access", new Object[0]);
        String m33576e = C2423a.m33579b(context).m33576e();
        m33568c(context);
        if (z) {
            return RunnableC10843b.m6892a(m33576e);
        }
        return abstractC2475c.mo33320a(new C2430h(abstractC2475c));
    }

    /* renamed from: b */
    public static AbstractC13119b<Status> m33569b(AbstractC2475c abstractC2475c, Context context, boolean z) {
        f7092a.m34698a("Signing out", new Object[0]);
        m33568c(context);
        if (z) {
            return C13121c.m1569b(Status.f7155B, abstractC2475c);
        }
        return abstractC2475c.mo33320a(new C2428f(abstractC2475c));
    }

    /* renamed from: c */
    private static void m33568c(Context context) {
        C10846e.m6891a(context).m6890b();
        for (AbstractC2475c abstractC2475c : AbstractC2475c.m33478b()) {
            abstractC2475c.m33476e();
        }
        C2499f.m33431a();
    }
}
