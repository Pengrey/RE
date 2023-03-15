package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.C0939c;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* loaded from: classes.dex */
public final class C2682a6 implements InterfaceC3045x5 {

    /* renamed from: c */
    private static C2682a6 f7636c;
    @Nullable

    /* renamed from: a */
    private final Context f7637a;
    @Nullable

    /* renamed from: b */
    private final ContentObserver f7638b;

    private C2682a6() {
        this.f7637a = null;
        this.f7638b = null;
    }

    private C2682a6(Context context) {
        this.f7637a = context;
        C3075z5 c3075z5 = new C3075z5(this, null);
        this.f7638b = c3075z5;
        context.getContentResolver().registerContentObserver(C2889n5.f7867a, true, c3075z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2682a6 m32924b(Context context) {
        C2682a6 c2682a6;
        C2682a6 c2682a62;
        synchronized (C2682a6.class) {
            if (f7636c == null) {
                if (C0939c.m39078b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c2682a62 = new C2682a6(context);
                } else {
                    c2682a62 = new C2682a6();
                }
                f7636c = c2682a62;
            }
            c2682a6 = f7636c;
        }
        return c2682a6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized void m32921e() {
        Context context;
        synchronized (C2682a6.class) {
            C2682a6 c2682a6 = f7636c;
            if (c2682a6 != null && (context = c2682a6.f7637a) != null && c2682a6.f7638b != null) {
                context.getContentResolver().unregisterContentObserver(f7636c.f7638b);
            }
            f7636c = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3045x5
    @Nullable
    /* renamed from: c */
    public final String mo31832a(final String str) {
        if (this.f7637a == null) {
            return null;
        }
        try {
            return (String) C3015v5.m31960a(new InterfaceC3030w5() { // from class: com.google.android.gms.internal.measurement.y5
                @Override // com.google.android.gms.internal.measurement.InterfaceC3030w5
                public final Object zza() {
                    return C2682a6.this.m32922d(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String m32922d(String str) {
        return C2889n5.m32442a(this.f7637a.getContentResolver(), str, null);
    }
}
