package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2600j0;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.InterfaceC2602k0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.n */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2622n extends AbstractBinderC2600j0 {

    /* renamed from: a */
    private final int f7542a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC2622n(byte[] bArr) {
        C2597i.m33085a(bArr.length == 25);
        this.f7542a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public static byte[] m33012H(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S1 */
    public abstract byte[] mo33009S1();

    @Override // com.google.android.gms.common.internal.InterfaceC2602k0
    /* renamed from: a */
    public final int mo33011a() {
        return this.f7542a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2602k0
    /* renamed from: b */
    public final InterfaceC5867b mo33010b() {
        return BinderC5870d.m22835S1(mo33009S1());
    }

    public final boolean equals(Object obj) {
        InterfaceC5867b mo33010b;
        if (obj != null && (obj instanceof InterfaceC2602k0)) {
            try {
                InterfaceC2602k0 interfaceC2602k0 = (InterfaceC2602k0) obj;
                if (interfaceC2602k0.mo33011a() == this.f7542a && (mo33010b = interfaceC2602k0.mo33010b()) != null) {
                    return Arrays.equals(mo33009S1(), (byte[]) BinderC5870d.m22836H(mo33010b));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7542a;
    }
}
