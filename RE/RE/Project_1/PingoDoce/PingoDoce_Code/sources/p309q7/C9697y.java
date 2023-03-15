package p309q7;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4250e;
import java.io.IOException;
import p011aa.C0095a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.y */
/* loaded from: classes.dex */
final class C9697y implements InterfaceC4250e {

    /* renamed from: a */
    private boolean f25552a = false;

    /* renamed from: b */
    private boolean f25553b = false;

    /* renamed from: c */
    private C0095a f25554c;

    /* renamed from: d */
    private final C9693u f25555d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9697y(C9693u c9693u) {
        this.f25555d = c9693u;
    }

    /* renamed from: b */
    private final void m10194b() {
        if (this.f25552a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f25552a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10195a(C0095a c0095a, boolean z) {
        this.f25552a = false;
        this.f25554c = c0095a;
        this.f25553b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: d */
    public final InterfaceC4250e mo10193d(String str) throws IOException {
        m10194b();
        this.f25555d.m10211g(this.f25554c, str, this.f25553b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: e */
    public final InterfaceC4250e mo10192e(boolean z) throws IOException {
        m10194b();
        this.f25555d.m10210h(this.f25554c, z ? 1 : 0, this.f25553b);
        return this;
    }
}
