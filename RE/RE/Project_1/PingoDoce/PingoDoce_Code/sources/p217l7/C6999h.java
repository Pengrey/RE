package p217l7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p291p6.C8436a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: l7.h */
/* loaded from: classes.dex */
public final class C6999h extends AbstractC2586d<C7000i> {

    /* renamed from: B */
    private final C8436a.C8437a f18608B;

    public C6999h(Context context, Looper looper, C2583c c2583c, C8436a.C8437a c8437a, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
        super(context, looper, 68, c2583c, interfaceC2476a, interfaceC2477b);
        C8436a.C8437a.C8438a c8438a = new C8436a.C8437a.C8438a(c8437a == null ? C8436a.C8437a.f21838z : c8437a);
        c8438a.m15400a(C6993b.m19641a());
        this.f18608B = new C8436a.C8437a(c8438a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: A */
    protected final Bundle mo19634A() {
        return this.f18608B.m15405a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C7000i) {
            return (C7000i) queryLocalInterface;
        }
        return new C7000i(iBinder);
    }
}
