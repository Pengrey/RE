package p169j1;

import android.view.KeyEvent;
import id.InterfaceC6108l;
import p052d1.KeyInputModifier;
import p181jd.Intrinsics;

/* renamed from: j1.v */
/* loaded from: classes.dex */
public final class ModifiedKeyInputNode extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedKeyInputNode(LayoutNodeWrapper layoutNodeWrapper, KeyInputModifier keyInputModifier) {
        super(layoutNodeWrapper, keyInputModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(keyInputModifier, "modifier");
    }

    /* renamed from: S0 */
    public ModifiedKeyInputNode m21295S0() {
        return this;
    }

    /* renamed from: Y1 */
    public final boolean m21294Y1(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "keyEvent");
        InterfaceC6108l m26899b = ((KeyInputModifier) m21755P1()).m26899b();
        Boolean bool = m26899b == null ? null : (Boolean) m26899b.mo9587d(p052d1.KeyEvent.m26917a(keyEvent));
        if (Intrinsics.equals(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        ModifiedKeyInputNode m21394Q0 = m21394Q0();
        if (m21394Q0 == null) {
            return false;
        }
        return m21394Q0.m21294Y1(keyEvent);
    }

    /* renamed from: Z1 */
    public final boolean m21293Z1(KeyEvent keyEvent) {
        Boolean bool;
        Intrinsics.isThisObjectNull(keyEvent, "keyEvent");
        ModifiedKeyInputNode m21394Q0 = m21394Q0();
        Boolean valueOf = m21394Q0 == null ? null : Boolean.valueOf(m21394Q0.m21293Z1(keyEvent));
        if (Intrinsics.equals(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        InterfaceC6108l m26898c = ((KeyInputModifier) m21755P1()).m26898c();
        if (m26898c == null || (bool = (Boolean) m26898c.mo9587d(p052d1.KeyEvent.m26917a(keyEvent))) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: v1 */
    public void m21292v1() {
        super.m21737v1();
        ((KeyInputModifier) m21755P1()).m26896e(this);
    }
}
