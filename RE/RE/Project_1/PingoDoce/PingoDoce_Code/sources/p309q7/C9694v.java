package p309q7;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C9694v implements InterfaceC4247b {

    /* renamed from: a */
    public static final /* synthetic */ C9694v f25543a = new C9694v();

    private /* synthetic */ C9694v() {
    }

    @Override // com.google.firebase.encoders.InterfaceC4247b
    /* renamed from: a */
    public final void mo661a(Object obj, Object obj2) {
        InterfaceC4248c interfaceC4248c = (InterfaceC4248c) obj2;
        int i = C9695w.f25545e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new EncodingException(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
