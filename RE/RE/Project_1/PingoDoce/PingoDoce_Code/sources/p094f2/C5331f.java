package p094f2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f2.f */
/* loaded from: classes.dex */
public class C5331f implements InterfaceC5329d {

    /* renamed from: d */
    AbstractC5345p f14720d;

    /* renamed from: f */
    int f14722f;

    /* renamed from: g */
    public int f14723g;

    /* renamed from: a */
    public InterfaceC5329d f14717a = null;

    /* renamed from: b */
    public boolean f14718b = false;

    /* renamed from: c */
    public boolean f14719c = false;

    /* renamed from: e */
    EnumC5332a f14721e = EnumC5332a.UNKNOWN;

    /* renamed from: h */
    int f14724h = 1;

    /* renamed from: i */
    C5333g f14725i = null;

    /* renamed from: j */
    public boolean f14726j = false;

    /* renamed from: k */
    List<InterfaceC5329d> f14727k = new ArrayList();

    /* renamed from: l */
    List<C5331f> f14728l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* renamed from: f2.f$a */
    /* loaded from: classes.dex */
    enum EnumC5332a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C5331f(AbstractC5345p abstractC5345p) {
        this.f14720d = abstractC5345p;
    }

    @Override // p094f2.InterfaceC5329d
    /* renamed from: a */
    public void mo24565a(InterfaceC5329d interfaceC5329d) {
        for (C5331f c5331f : this.f14728l) {
            if (!c5331f.f14726j) {
                return;
            }
        }
        this.f14719c = true;
        InterfaceC5329d interfaceC5329d2 = this.f14717a;
        if (interfaceC5329d2 != null) {
            interfaceC5329d2.mo24565a(this);
        }
        if (this.f14718b) {
            this.f14720d.mo24565a(this);
            return;
        }
        C5331f c5331f2 = null;
        int i = 0;
        for (C5331f c5331f3 : this.f14728l) {
            if (!(c5331f3 instanceof C5333g)) {
                i++;
                c5331f2 = c5331f3;
            }
        }
        if (c5331f2 != null && i == 1 && c5331f2.f14726j) {
            C5333g c5333g = this.f14725i;
            if (c5333g != null) {
                if (!c5333g.f14726j) {
                    return;
                }
                this.f14722f = this.f14724h * c5333g.f14723g;
            }
            mo24598d(c5331f2.f14723g + this.f14722f);
        }
        InterfaceC5329d interfaceC5329d3 = this.f14717a;
        if (interfaceC5329d3 != null) {
            interfaceC5329d3.mo24565a(this);
        }
    }

    /* renamed from: b */
    public void m24600b(InterfaceC5329d interfaceC5329d) {
        this.f14727k.add(interfaceC5329d);
        if (this.f14726j) {
            interfaceC5329d.mo24565a(interfaceC5329d);
        }
    }

    /* renamed from: c */
    public void m24599c() {
        this.f14728l.clear();
        this.f14727k.clear();
        this.f14726j = false;
        this.f14723g = 0;
        this.f14719c = false;
        this.f14718b = false;
    }

    /* renamed from: d */
    public void mo24598d(int i) {
        if (this.f14726j) {
            return;
        }
        this.f14726j = true;
        this.f14723g = i;
        for (InterfaceC5329d interfaceC5329d : this.f14727k) {
            interfaceC5329d.mo24565a(interfaceC5329d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14720d.f14746b.m26066r());
        sb2.append(":");
        sb2.append(this.f14721e);
        sb2.append("(");
        sb2.append(this.f14726j ? Integer.valueOf(this.f14723g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f14728l.size());
        sb2.append(":d=");
        sb2.append(this.f14727k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
