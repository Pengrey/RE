package p138hc;

import com.google.zxing.AbstractC4403h;
import com.google.zxing.C4394c;
import com.google.zxing.InterfaceC4408l;
import p239mb.C7163j;

/* renamed from: hc.m */
/* loaded from: classes2.dex */
public class C5900m extends C5892g {

    /* renamed from: c */
    private boolean f16343c;

    public C5900m(InterfaceC4408l interfaceC4408l) {
        super(interfaceC4408l);
        this.f16343c = true;
    }

    @Override // p138hc.C5892g
    /* renamed from: e */
    protected C4394c mo22794e(AbstractC4403h abstractC4403h) {
        if (this.f16343c) {
            this.f16343c = false;
            return new C4394c(new C7163j(abstractC4403h.mo27660e()));
        }
        this.f16343c = true;
        return new C4394c(new C7163j(abstractC4403h));
    }
}
