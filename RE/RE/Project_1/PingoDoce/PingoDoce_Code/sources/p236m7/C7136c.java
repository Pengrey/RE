package p236m7;

import android.app.Activity;
import com.google.android.gms.common.api.internal.AbstractC2541s;
import com.google.android.gms.common.api.internal.InterfaceC2529o;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import p330r6.AbstractC9817b;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.c */
/* loaded from: classes.dex */
public final class C7136c extends AbstractC9817b {
    public C7136c(Activity activity) {
        super(activity);
    }

    @Override // p330r6.AbstractC9817b
    /* renamed from: u */
    public final AbstractC3419d<Void> mo9919u(final String str) {
        return m33492j(AbstractC2541s.m33293a().m33287b(new InterfaceC2529o() { // from class: m7.k
            @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
            /* renamed from: a */
            public final void mo19090a(Object obj, Object obj2) {
                C7136c c7136c = C7136c.this;
                ((C7140g) ((C7143j) obj).m33182D()).m19099H(str, new BinderC7135b(c7136c, (C3421e) obj2));
            }
        }).m33285d(C7137d.f18952d).m33284e(1568).m33288a());
    }
}
