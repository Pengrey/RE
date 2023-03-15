package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0079l;
import p009a8.C0080m;
import p009a8.C0081n;
import p009a8.InterfaceC0070c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.b3 */
/* loaded from: classes.dex */
public final class C3142b3 {

    /* renamed from: b */
    protected static final AtomicReference f8345b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f8346c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f8347d = new AtomicReference();

    /* renamed from: a */
    private final InterfaceC0070c f8348a;

    public C3142b3(InterfaceC0070c interfaceC0070c) {
        this.f8348a = interfaceC0070c;
    }

    /* renamed from: g */
    private static final String m31451g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C2597i.m33076j(strArr);
        C2597i.m33076j(strArr2);
        C2597i.m33076j(atomicReference);
        C2597i.m33085a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C3203g9.m31298Z(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m31457a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = m31456b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(valueOf);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m31456b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f8348a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(m31453e(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = m31457a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = m31457a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = m31457a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb2.append(valueOf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final String m31455c(zzau zzauVar) {
        String m31456b;
        if (!this.f8348a.zza()) {
            return zzauVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzauVar.f9177y);
        sb2.append(",name=");
        sb2.append(m31454d(zzauVar.f9175w));
        sb2.append(",params=");
        zzas zzasVar = zzauVar.f9176x;
        if (zzasVar == null) {
            m31456b = null;
        } else if (!this.f8348a.zza()) {
            m31456b = zzasVar.toString();
        } else {
            m31456b = m31456b(zzasVar.m30817v());
        }
        sb2.append(m31456b);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m31454d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8348a.zza() ? str : m31451g(str, C0079l.f186c, C0079l.f184a, f8345b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final String m31453e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8348a.zza() ? str : m31451g(str, C0080m.f189b, C0080m.f188a, f8346c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final String m31452f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f8348a.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return m31451g(str, C0081n.f193b, C0081n.f192a, f8347d);
        }
        return str;
    }
}
