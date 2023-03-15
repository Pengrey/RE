package p330r6;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.tasks.AbstractC3419d;
import p236m7.C7143j;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: r6.b */
/* loaded from: classes.dex */
public abstract class AbstractC9817b extends AbstractC2472b<C2461a.InterfaceC2465d.C2468c> {

    /* renamed from: k */
    private static final C2461a.C2471g<C7143j> f25768k;

    /* renamed from: l */
    private static final C2461a.AbstractC2462a<C7143j, C2461a.InterfaceC2465d.C2468c> f25769l;

    /* renamed from: m */
    private static final C2461a<C2461a.InterfaceC2465d.C2468c> f25770m;

    static {
        C2461a.C2471g<C7143j> c2471g = new C2461a.C2471g<>();
        f25768k = c2471g;
        C9818c c9818c = new C9818c();
        f25769l = c9818c;
        f25770m = new C2461a<>("SmsRetriever.API", c9818c, c2471g);
    }

    public AbstractC9817b(@RecentlyNonNull Activity activity) {
        super(activity, f25770m, C2461a.InterfaceC2465d.f7169e, AbstractC2472b.C2473a.f7180c);
    }

    @RecentlyNonNull
    /* renamed from: u */
    public abstract AbstractC3419d<Void> mo9919u(String str);
}
