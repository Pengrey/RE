package p138hc;

import com.google.zxing.AbstractC4403h;
import com.google.zxing.C4394c;
import com.google.zxing.C4404i;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.InterfaceC4408l;
import com.google.zxing.InterfaceC4412p;
import java.util.ArrayList;
import java.util.List;
import p239mb.C7163j;

/* renamed from: hc.g */
/* loaded from: classes2.dex */
public class C5892g implements InterfaceC4412p {

    /* renamed from: a */
    private InterfaceC4408l f16323a;

    /* renamed from: b */
    private List<C4411o> f16324b = new ArrayList();

    public C5892g(InterfaceC4408l interfaceC4408l) {
        this.f16323a = interfaceC4408l;
    }

    @Override // com.google.zxing.InterfaceC4412p
    /* renamed from: a */
    public void mo22809a(C4411o c4411o) {
        this.f16324b.add(c4411o);
    }

    /* renamed from: b */
    protected C4409m m22812b(C4394c c4394c) {
        C4409m c4409m;
        this.f16324b.clear();
        try {
            InterfaceC4408l interfaceC4408l = this.f16323a;
            if (interfaceC4408l instanceof C4404i) {
                c4409m = ((C4404i) interfaceC4408l).m27656e(c4394c);
            } else {
                c4409m = interfaceC4408l.mo515c(c4394c);
            }
        } catch (Exception unused) {
            c4409m = null;
        } catch (Throwable th2) {
            this.f16323a.mo517a();
            throw th2;
        }
        this.f16323a.mo517a();
        return c4409m;
    }

    /* renamed from: c */
    public C4409m m22811c(AbstractC4403h abstractC4403h) {
        return m22812b(mo22794e(abstractC4403h));
    }

    /* renamed from: d */
    public List<C4411o> m22810d() {
        return new ArrayList(this.f16324b);
    }

    /* renamed from: e */
    protected C4394c mo22794e(AbstractC4403h abstractC4403h) {
        return new C4394c(new C7163j(abstractC4403h));
    }
}
