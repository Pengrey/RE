package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.internal.C2432j;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.internal.C2481a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.AbstractC3419d;
import p291p6.C8436a;
import p484z6.C13704d;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes.dex */
public class C2416b extends AbstractC2472b<GoogleSignInOptions> {

    /* renamed from: k */
    static int f7073k;

    static {
        new C2421g(null);
        f7073k = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2416b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C8436a.f21833b, googleSignInOptions, new C2481a());
    }

    /* renamed from: w */
    private final synchronized int m33588w() {
        if (f7073k == 1) {
            Context m33489m = m33489m();
            C2566b m33240m = C2566b.m33240m();
            int mo33222h = m33240m.mo33222h(m33489m, C2569e.f7391a);
            if (mo33222h == 0) {
                f7073k = 4;
            } else if (m33240m.mo33228b(m33489m, mo33222h, null) != null || DynamiteModule.m32983a(m33489m, "com.google.android.gms.auth.api.fallback") == 0) {
                f7073k = 2;
            } else {
                f7073k = 3;
            }
        }
        return f7073k;
    }

    @RecentlyNonNull
    /* renamed from: u */
    public AbstractC3419d<Void> m33590u() {
        return C13704d.m570b(C2432j.m33570a(m33500b(), m33489m(), m33588w() == 3));
    }

    @RecentlyNonNull
    /* renamed from: v */
    public AbstractC3419d<Void> m33589v() {
        return C13704d.m570b(C2432j.m33569b(m33500b(), m33489m(), m33588w() == 3));
    }
}
