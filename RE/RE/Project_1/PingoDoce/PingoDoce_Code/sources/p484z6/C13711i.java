package p484z6;

import android.os.Bundle;
import com.google.android.gms.common.api.C2461a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.i */
/* loaded from: classes.dex */
public class C13711i implements C2461a.InterfaceC2465d {

    /* renamed from: x */
    public static final C13711i f34826x = m559a().m557a();

    /* renamed from: w */
    private final String f34827w;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: z6.i$a */
    /* loaded from: classes.dex */
    public static class C13712a {

        /* renamed from: a */
        private String f34828a;

        /* synthetic */ C13712a(C13715l c13715l) {
        }

        /* renamed from: a */
        public C13711i m557a() {
            return new C13711i(this.f34828a, null);
        }
    }

    /* synthetic */ C13711i(String str, C13716m c13716m) {
        this.f34827w = str;
    }

    /* renamed from: a */
    public static C13712a m559a() {
        return new C13712a(null);
    }

    /* renamed from: c */
    public final Bundle m558c() {
        Bundle bundle = new Bundle();
        String str = this.f34827w;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13711i) {
            return C13701c.m575a(this.f34827w, ((C13711i) obj).f34827w);
        }
        return false;
    }

    public final int hashCode() {
        return C13701c.m574b(this.f34827w);
    }
}
