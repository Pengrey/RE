package p436x3;

import android.graphics.Path;
import com.airbnb.lottie.C2210f;
import java.util.List;
import p040c4.C2078l;
import p040c4.C2081o;
import p040c4.C2086q;
import p055d4.AbstractC4724a;
import p459y3.AbstractC13078a;

/* renamed from: x3.q */
/* loaded from: classes.dex */
public class C12280q implements InterfaceC12275m, AbstractC13078a.InterfaceC13080b {

    /* renamed from: b */
    private final boolean f32432b;

    /* renamed from: c */
    private final C2210f f32433c;

    /* renamed from: d */
    private final AbstractC13078a<?, Path> f32434d;

    /* renamed from: e */
    private boolean f32435e;

    /* renamed from: a */
    private final Path f32431a = new Path();

    /* renamed from: f */
    private C12263b f32436f = new C12263b();

    public C12280q(C2210f c2210f, AbstractC4724a abstractC4724a, C2081o c2081o) {
        c2081o.m34723b();
        this.f32432b = c2081o.m34721d();
        this.f32433c = c2210f;
        AbstractC13078a<C2078l, Path> mo35329a = c2081o.m34722c().mo35329a();
        this.f32434d = mo35329a;
        abstractC4724a.m26783k(mo35329a);
        mo35329a.m1687a(this);
    }

    /* renamed from: e */
    private void m3149e() {
        this.f32435e = false;
        this.f32433c.invalidateSelf();
    }

    @Override // p459y3.AbstractC13078a.InterfaceC13080b
    /* renamed from: c */
    public void mo1678c() {
        m3149e();
    }

    @Override // p436x3.InterfaceC12264c
    /* renamed from: d */
    public void mo3144d(List<InterfaceC12264c> list, List<InterfaceC12264c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC12264c interfaceC12264c = list.get(i);
            if (interfaceC12264c instanceof C12282s) {
                C12282s c12282s = (C12282s) interfaceC12264c;
                if (c12282s.m3139k() == C2086q.EnumC2087a.SIMULTANEOUSLY) {
                    this.f32436f.m3174a(c12282s);
                    c12282s.m3143e(this);
                }
            }
        }
    }

    @Override // p436x3.InterfaceC12275m
    /* renamed from: g */
    public Path mo3148g() {
        if (this.f32435e) {
            return this.f32431a;
        }
        this.f32431a.reset();
        if (this.f32432b) {
            this.f32435e = true;
            return this.f32431a;
        }
        this.f32431a.set(this.f32434d.mo1634h());
        this.f32431a.setFillType(Path.FillType.EVEN_ODD);
        this.f32436f.m3173b(this.f32431a);
        this.f32435e = true;
        return this.f32431a;
    }
}
