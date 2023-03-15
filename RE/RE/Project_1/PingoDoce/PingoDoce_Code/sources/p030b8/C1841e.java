package p030b8;

import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C3406a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: b8.e */
/* loaded from: classes.dex */
public final class C1841e {

    /* renamed from: a */
    public static final C2461a.C2471g<C3406a> f5553a;

    /* renamed from: b */
    public static final C2461a.C2471g<C3406a> f5554b;

    /* renamed from: c */
    public static final C2461a.AbstractC2462a<C3406a, C1837a> f5555c;

    /* renamed from: d */
    static final C2461a.AbstractC2462a<C3406a, C1840d> f5556d;

    static {
        C2461a.C2471g<C3406a> c2471g = new C2461a.C2471g<>();
        f5553a = c2471g;
        C2461a.C2471g<C3406a> c2471g2 = new C2461a.C2471g<>();
        f5554b = c2471g2;
        C1838b c1838b = new C1838b();
        f5555c = c1838b;
        C1839c c1839c = new C1839c();
        f5556d = c1839c;
        new Scope("profile");
        new Scope("email");
        new C2461a("SignIn.API", c1838b, c2471g);
        new C2461a("SignIn.INTERNAL_API", c1839c, c2471g2);
    }
}
