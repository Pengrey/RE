package p157i9;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2997u2;
import com.google.firebase.C4165a;
import com.google.firebase.C4175c;
import com.google.firebase.analytics.connector.internal.C4169b;
import com.google.firebase.analytics.connector.internal.C4171d;
import com.google.firebase.analytics.connector.internal.C4173f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p081ea.C5023a;
import p081ea.InterfaceC5026d;
import p157i9.InterfaceC6056a;
import p485z7.C13730a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* renamed from: i9.b */
/* loaded from: classes.dex */
public class C6059b implements InterfaceC6056a {

    /* renamed from: c */
    private static volatile InterfaceC6056a f16701c;

    /* renamed from: a */
    final C13730a f16702a;

    /* renamed from: b */
    final Map f16703b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
    /* renamed from: i9.b$a */
    /* loaded from: classes.dex */
    class C6060a implements InterfaceC6056a.InterfaceC6057a {
        C6060a(C6059b c6059b, String str) {
        }
    }

    C6059b(C13730a c13730a) {
        C2597i.m33076j(c13730a);
        this.f16702a = c13730a;
        this.f16703b = new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static InterfaceC6056a m22294d(C4175c c4175c, Context context, InterfaceC5026d interfaceC5026d) {
        C2597i.m33076j(c4175c);
        C2597i.m33076j(context);
        C2597i.m33076j(interfaceC5026d);
        C2597i.m33076j(context.getApplicationContext());
        if (f16701c == null) {
            synchronized (C6059b.class) {
                if (f16701c == null) {
                    Bundle bundle = new Bundle(1);
                    if (c4175c.m28431r()) {
                        interfaceC5026d.mo21040a(C4165a.class, ExecutorC6062d.f16705w, C6061c.f16704a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c4175c.m28432q());
                    }
                    f16701c = new C6059b(C2997u2.m32022s(context, null, null, null, bundle).m32025p());
                }
            }
        }
        return f16701c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m22293e(C5023a c5023a) {
        boolean z = ((C4165a) c5023a.m25879a()).f11374a;
        synchronized (C6059b.class) {
            ((C6059b) C2597i.m33076j(f16701c)).f16702a.m545d(z);
        }
    }

    /* renamed from: f */
    private final boolean m22292f(String str) {
        return (str.isEmpty() || !this.f16703b.containsKey(str) || this.f16703b.get(str) == null) ? false : true;
    }

    @Override // p157i9.InterfaceC6056a
    /* renamed from: a */
    public InterfaceC6056a.InterfaceC6057a mo22297a(String str, InterfaceC6056a.InterfaceC6058b interfaceC6058b) {
        Object c4173f;
        C2597i.m33076j(interfaceC6058b);
        if (C4169b.m28453f(str) && !m22292f(str)) {
            C13730a c13730a = this.f16702a;
            if ("fiam".equals(str)) {
                c4173f = new C4171d(c13730a, interfaceC6058b);
            } else {
                c4173f = ("crash".equals(str) || "clx".equals(str)) ? new C4173f(c13730a, interfaceC6058b) : null;
            }
            if (c4173f != null) {
                this.f16703b.put(str, c4173f);
                return new C6060a(this, str);
            }
            return null;
        }
        return null;
    }

    @Override // p157i9.InterfaceC6056a
    /* renamed from: b */
    public void mo22296b(String str, String str2, Object obj) {
        if (C4169b.m28453f(str) && C4169b.m28452g(str, str2)) {
            this.f16702a.m546c(str, str2, obj);
        }
    }

    @Override // p157i9.InterfaceC6056a
    /* renamed from: c */
    public void mo22295c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C4169b.m28453f(str) && C4169b.m28455d(str2, bundle) && C4169b.m28456c(str, str2, bundle)) {
            C4169b.m28457b(str, str2, bundle);
            this.f16702a.m548a(str, str2, bundle);
        }
    }
}
