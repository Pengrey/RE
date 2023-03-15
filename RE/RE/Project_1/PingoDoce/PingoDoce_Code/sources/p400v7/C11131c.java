package p400v7;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.internal.location.C2667n;
import com.google.android.gms.location.C3084a;
import p331r7.C9820b;
import p331r7.C9822d;
import p331r7.C9825g;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: v7.c */
/* loaded from: classes.dex */
public class C11131c {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C2461a<C2461a.InterfaceC2465d.C2468c> f28558a;

    /* renamed from: b */
    private static final C2461a.C2471g<C2667n> f28559b;

    /* renamed from: c */
    private static final C2461a.AbstractC2462a<C2667n, C2461a.InterfaceC2465d.C2468c> f28560c;

    static {
        C2461a.C2471g<C2667n> c2471g = new C2461a.C2471g<>();
        f28559b = c2471g;
        C11133e c11133e = new C11133e();
        f28560c = c11133e;
        f28558a = new C2461a<>("LocationServices.API", c11133e, c2471g);
        new C9825g();
        new C9820b();
        new C9822d();
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3084a m6034a(@RecentlyNonNull Activity activity) {
        return new C3084a(activity);
    }
}
