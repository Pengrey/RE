package p061da;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4250e;
import java.io.IOException;
import p011aa.C0095a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: da.i */
/* loaded from: classes.dex */
public class C4767i implements InterfaceC4250e {

    /* renamed from: a */
    private boolean f13069a = false;

    /* renamed from: b */
    private boolean f13070b = false;

    /* renamed from: c */
    private C0095a f13071c;

    /* renamed from: d */
    private final C4762f f13072d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4767i(C4762f c4762f) {
        this.f13072d = c4762f;
    }

    /* renamed from: a */
    private void m26661a() {
        if (!this.f13069a) {
            this.f13069a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26660b(C0095a c0095a, boolean z) {
        this.f13069a = false;
        this.f13071c = c0095a;
        this.f13070b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: d */
    public InterfaceC4250e mo10193d(String str) throws IOException {
        m26661a();
        this.f13072d.m26686h(this.f13071c, str, this.f13070b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: e */
    public InterfaceC4250e mo10192e(boolean z) throws IOException {
        m26661a();
        this.f13072d.m26680n(this.f13071c, z, this.f13070b);
        return this;
    }
}
