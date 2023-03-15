package p436x3;

import java.util.ArrayList;
import java.util.List;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p459y3.AbstractC13078a;

/* renamed from: x3.s */
/* loaded from: classes.dex */
public class C12282s implements InterfaceC12264c, AbstractC13078a.InterfaceC13080b {

    /* renamed from: a */
    private final boolean f32442a;

    /* renamed from: b */
    private final List<AbstractC13078a.InterfaceC13080b> f32443b = new ArrayList();

    /* renamed from: c */
    private final C2086q.EnumC2087a f32444c;

    /* renamed from: d */
    private final AbstractC13078a<?, Float> f32445d;

    /* renamed from: e */
    private final AbstractC13078a<?, Float> f32446e;

    /* renamed from: f */
    private final AbstractC13078a<?, Float> f32447f;

    public C12282s(AbstractC4724a abstractC4724a, C2086q c2086q) {
        c2086q.m34708c();
        this.f32442a = c2086q.m34704g();
        this.f32444c = c2086q.m34705f();
        AbstractC13078a<Float, Float> mo35329a = c2086q.m34706e().mo35329a();
        this.f32445d = mo35329a;
        AbstractC13078a<Float, Float> mo35329a2 = c2086q.m34709b().mo35329a();
        this.f32446e = mo35329a2;
        AbstractC13078a<Float, Float> mo35329a3 = c2086q.m34707d().mo35329a();
        this.f32447f = mo35329a3;
        abstractC4724a.m26783k(mo35329a);
        abstractC4724a.m26783k(mo35329a2);
        abstractC4724a.m26783k(mo35329a3);
        mo35329a.m1687a(this);
        mo35329a2.m1687a(this);
        mo35329a3.m1687a(this);
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        for (int i = 0; i < this.f32443b.size(); i++) {
            this.f32443b.get(i).mo1678c();
        }
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m3143e(AbstractC13078a.InterfaceC13080b interfaceC13080b) {
        this.f32443b.add(interfaceC13080b);
    }

    /* renamed from: h */
    public AbstractC13078a<?, Float> m3142h() {
        return this.f32446e;
    }

    /* renamed from: i */
    public AbstractC13078a<?, Float> m3141i() {
        return this.f32447f;
    }

    /* renamed from: j */
    public AbstractC13078a<?, Float> m3140j() {
        return this.f32445d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C2086q.EnumC2087a m3139k() {
        return this.f32444c;
    }

    /* renamed from: l */
    public boolean m3138l() {
        return this.f32442a;
    }
}
