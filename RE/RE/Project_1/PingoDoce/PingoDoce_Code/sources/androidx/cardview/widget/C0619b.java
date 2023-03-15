package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.b */
/* loaded from: classes.dex */
public class C0619b implements InterfaceC0623e {
    /* renamed from: p */
    private C0624f m40094p(InterfaceC0622d interfaceC0622d) {
        return (C0624f) interfaceC0622d.mo40085g();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: a */
    public float mo40084a(InterfaceC0622d interfaceC0622d) {
        return m40094p(interfaceC0622d).m40067c();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: b */
    public ColorStateList mo40083b(InterfaceC0622d interfaceC0622d) {
        return m40094p(interfaceC0622d).m40068b();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: c */
    public void mo40082c(InterfaceC0622d interfaceC0622d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC0622d.mo40088d(new C0624f(colorStateList, f));
        View mo40090b = interfaceC0622d.mo40090b();
        mo40090b.setClipToOutline(true);
        mo40090b.setElevation(f2);
        mo40070o(interfaceC0622d, f3);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: d */
    public void mo40081d(InterfaceC0622d interfaceC0622d, float f) {
        m40094p(interfaceC0622d).m40062h(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: e */
    public float mo40080e(InterfaceC0622d interfaceC0622d) {
        return interfaceC0622d.mo40090b().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: f */
    public void mo40079f(InterfaceC0622d interfaceC0622d) {
        if (!interfaceC0622d.mo40086f()) {
            interfaceC0622d.mo40091a(0, 0, 0, 0);
            return;
        }
        float mo40084a = mo40084a(interfaceC0622d);
        float mo40077h = mo40077h(interfaceC0622d);
        int ceil = (int) Math.ceil(C0625g.m40058c(mo40084a, mo40077h, interfaceC0622d.mo40087e()));
        int ceil2 = (int) Math.ceil(C0625g.m40057d(mo40084a, mo40077h, interfaceC0622d.mo40087e()));
        interfaceC0622d.mo40091a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: g */
    public void mo40078g() {
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: h */
    public float mo40077h(InterfaceC0622d interfaceC0622d) {
        return m40094p(interfaceC0622d).m40066d();
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: i */
    public float mo40076i(InterfaceC0622d interfaceC0622d) {
        return mo40077h(interfaceC0622d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: j */
    public float mo40075j(InterfaceC0622d interfaceC0622d) {
        return mo40077h(interfaceC0622d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: k */
    public void mo40074k(InterfaceC0622d interfaceC0622d) {
        mo40070o(interfaceC0622d, mo40084a(interfaceC0622d));
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: l */
    public void mo40073l(InterfaceC0622d interfaceC0622d, float f) {
        interfaceC0622d.mo40090b().setElevation(f);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: m */
    public void mo40072m(InterfaceC0622d interfaceC0622d) {
        mo40070o(interfaceC0622d, mo40084a(interfaceC0622d));
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: n */
    public void mo40071n(InterfaceC0622d interfaceC0622d, ColorStateList colorStateList) {
        m40094p(interfaceC0622d).m40064f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0623e
    /* renamed from: o */
    public void mo40070o(InterfaceC0622d interfaceC0622d, float f) {
        m40094p(interfaceC0622d).m40063g(f, interfaceC0622d.mo40086f(), interfaceC0622d.mo40087e());
        mo40079f(interfaceC0622d);
    }
}
