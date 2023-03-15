package p052d1;

import android.view.KeyEvent;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p169j1.ModifiedFocusNode;
import p169j1.ModifiedKeyInputNode;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p358t0.FocusTraversal;

/* renamed from: d1.e */
/* loaded from: classes.dex */
public final class KeyInputModifier implements InterfaceC9570f.InterfaceC9573c {

    /* renamed from: w */
    private final InterfaceC6108l f12830w;

    /* renamed from: x */
    private final InterfaceC6108l f12831x;

    /* renamed from: y */
    public ModifiedKeyInputNode f12832y;

    public KeyInputModifier(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        this.f12830w = interfaceC6108l;
        this.f12831x = interfaceC6108l2;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return InterfaceC9570f.InterfaceC9573c.C9574a.m10576a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC9570f.InterfaceC9573c.C9574a.m10574c(this, obj, interfaceC6112p);
    }

    /* renamed from: a */
    public final ModifiedKeyInputNode m26900a() {
        ModifiedKeyInputNode modifiedKeyInputNode = this.f12832y;
        if (modifiedKeyInputNode != null) {
            return modifiedKeyInputNode;
        }
        Intrinsics.throwUninitPropException("keyInputNode");
        return null;
    }

    /* renamed from: b */
    public final InterfaceC6108l m26899b() {
        return this.f12830w;
    }

    /* renamed from: c */
    public final InterfaceC6108l m26898c() {
        return this.f12831x;
    }

    /* renamed from: d */
    public final boolean m26897d(KeyEvent keyEvent) {
        ModifiedFocusNode m8176a;
        Intrinsics.isThisObjectNull(keyEvent, "keyEvent");
        ModifiedFocusNode m21753R0 = m26900a().m21753R0();
        ModifiedKeyInputNode modifiedKeyInputNode = null;
        if (m21753R0 != null && (m8176a = FocusTraversal.m8176a(m21753R0)) != null) {
            modifiedKeyInputNode = m8176a.m21759M0();
        }
        if (modifiedKeyInputNode != null) {
            if (modifiedKeyInputNode.m21293Z1(keyEvent)) {
                return true;
            }
            return modifiedKeyInputNode.m21294Y1(keyEvent);
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    /* renamed from: e */
    public final void m26896e(ModifiedKeyInputNode modifiedKeyInputNode) {
        Intrinsics.isThisObjectNull(modifiedKeyInputNode, "<set-?>");
        this.f12832y = modifiedKeyInputNode;
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC9570f.InterfaceC9573c.C9574a.m10575b(this, obj, interfaceC6112p);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return InterfaceC9570f.InterfaceC9573c.C9574a.m10573d(this, interfaceC9570f);
    }
}
