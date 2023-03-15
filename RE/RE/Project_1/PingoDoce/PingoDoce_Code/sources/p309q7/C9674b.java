package p309q7;

import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import java.io.IOException;
import p011aa.C0095a;
import p270oa.C8056b;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.b */
/* loaded from: classes.dex */
final class C9674b implements InterfaceC4247b<C8056b> {

    /* renamed from: a */
    static final C9674b f25517a = new C9674b();

    /* renamed from: b */
    private static final C0095a f25518b;

    static {
        C0095a.C0097b m41963a = C0095a.m41963a("messagingClientEvent");
        C9687o c9687o = new C9687o();
        c9687o.m10220a(1);
        f25518b = m41963a.m41958b(c9687o.m10219b()).m41959a();
    }

    private C9674b() {
    }

    @Override // com.google.firebase.encoders.InterfaceC4247b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo661a(Object obj, Object obj2) throws IOException {
        ((InterfaceC4248c) obj2).mo10212f(f25518b, ((C8056b) obj).m17030a());
    }
}
