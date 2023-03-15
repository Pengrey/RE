package p236m7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC2496e;
import com.google.android.gms.common.api.internal.InterfaceC2519l;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p070e.C4906j;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.j */
/* loaded from: classes.dex */
public final class C7143j extends AbstractC2586d<C7140g> {
    public C7143j(Context context, Looper looper, C2583c c2583c, InterfaceC2496e interfaceC2496e, InterfaceC2519l interfaceC2519l) {
        super(context, looper, (int) C4906j.f13420I0, c2583c, interfaceC2496e, interfaceC2519l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: S */
    public final boolean mo19094S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return C2569e.f7391a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C7140g) {
            return (C7140g) queryLocalInterface;
        }
        return new C7140g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: v */
    public final Feature[] mo19091v() {
        return C7137d.f18953e;
    }
}
