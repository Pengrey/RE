package p093f1;

import androidx.compose.p018ui.input.pointer.EnumC0662a;
import p127h1.InterfaceC5776j;
import p479z1.C13615m;

/* renamed from: f1.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC5271a0 {

    /* renamed from: w */
    private InterfaceC5776j f14546w;

    /* renamed from: b */
    public final long m24841b() {
        InterfaceC5776j interfaceC5776j = this.f14546w;
        C13615m m829b = interfaceC5776j == null ? null : C13615m.m829b(interfaceC5776j.mo23107b());
        return m829b == null ? C13615m.f34610b.m820a() : m829b.m821j();
    }

    /* renamed from: k0 */
    public boolean mo24840k0() {
        return false;
    }

    /* renamed from: l0 */
    public final InterfaceC5776j m24839l0() {
        return this.f14546w;
    }

    /* renamed from: m0 */
    public boolean m24838m0() {
        return false;
    }

    /* renamed from: n0 */
    public final boolean m24837n0() {
        InterfaceC5776j interfaceC5776j = this.f14546w;
        return interfaceC5776j != null && interfaceC5776j.mo23109S();
    }

    /* renamed from: o0 */
    public abstract void mo24836o0();

    /* renamed from: p0 */
    public abstract void mo24835p0(C5306m c5306m, EnumC0662a enumC0662a, long j);

    /* renamed from: q0 */
    public final void m24834q0(InterfaceC5776j interfaceC5776j) {
        this.f14546w = interfaceC5776j;
    }
}
