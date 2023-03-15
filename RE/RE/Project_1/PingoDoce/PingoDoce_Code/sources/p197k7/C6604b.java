package p197k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.internal.AbstractC2586d;
import com.google.android.gms.common.internal.C2583c;
import p291p6.C8439b;
import p291p6.C8440c;

/* renamed from: k7.b */
/* loaded from: classes.dex */
public final class C6604b extends AbstractC2586d<InterfaceC6605c> {

    /* renamed from: B */
    private final Bundle f17846B;

    public C6604b(Context context, Looper looper, C2583c c2583c, C8440c c8440c, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
        super(context, looper, 16, c2583c, interfaceC2476a, interfaceC2477b);
        if (c8440c == null) {
            this.f17846B = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: A */
    protected final Bundle mo19634A() {
        return this.f17846B;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: E */
    public final String mo19096E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: F */
    protected final String mo19095F() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: h */
    public final int mo19093h() {
        return C2569e.f7391a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: o */
    public final boolean mo20508o() {
        C2583c m33116j0 = m33116j0();
        return (TextUtils.isEmpty(m33116j0.m33134b()) || m33116j0.m33131e(C8439b.f21846c).isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo19092s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof InterfaceC6605c) {
            return (InterfaceC6605c) queryLocalInterface;
        }
        return new C6606d(iBinder);
    }
}
