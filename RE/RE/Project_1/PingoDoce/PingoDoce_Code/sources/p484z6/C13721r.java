package p484z6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C2567c;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.r */
/* loaded from: classes.dex */
public final class C13721r {

    /* renamed from: a */
    private final SparseIntArray f34835a = new SparseIntArray();

    /* renamed from: b */
    private C2567c f34836b;

    public C13721r(C2567c c2567c) {
        C2597i.m33076j(c2567c);
        this.f34836b = c2567c;
    }

    /* renamed from: a */
    public final int m553a(Context context, int i) {
        return this.f34835a.get(i, -1);
    }

    /* renamed from: b */
    public final int m552b(Context context, C2461a.InterfaceC2470f interfaceC2470f) {
        C2597i.m33076j(context);
        C2597i.m33076j(interfaceC2470f);
        int i = 0;
        if (interfaceC2470f.mo33344f()) {
            int mo19093h = interfaceC2470f.mo19093h();
            int m553a = m553a(context, mo19093h);
            if (m553a == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f34835a.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = this.f34835a.keyAt(i2);
                    if (keyAt > mo19093h && this.f34835a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                }
                m553a = i == -1 ? this.f34836b.mo33222h(context, mo19093h) : i;
                this.f34835a.put(mo19093h, m553a);
            }
            return m553a;
        }
        return 0;
    }

    /* renamed from: c */
    public final void m551c() {
        this.f34835a.clear();
    }
}
