package p376u3;

import p305q3.AbstractC9632h;
import p305q3.C9626d;
import p305q3.C9641n;
import p376u3.InterfaceC10823c;

/* renamed from: u3.b */
/* loaded from: classes.dex */
public final class C10821b implements InterfaceC10823c {

    /* renamed from: a */
    private final InterfaceC10826d f27976a;

    /* renamed from: b */
    private final AbstractC9632h f27977b;

    /* compiled from: NoneTransition.kt */
    /* renamed from: u3.b$a */
    /* loaded from: classes.dex */
    public static final class C10822a implements InterfaceC10823c.InterfaceC10824a {
        @Override // p376u3.InterfaceC10823c.InterfaceC10824a
        /* renamed from: a */
        public InterfaceC10823c mo6974a(InterfaceC10826d interfaceC10826d, AbstractC9632h abstractC9632h) {
            return new C10821b(interfaceC10826d, abstractC9632h);
        }

        public boolean equals(Object obj) {
            return obj instanceof C10822a;
        }

        public int hashCode() {
            return C10822a.class.hashCode();
        }
    }

    public C10821b(InterfaceC10826d interfaceC10826d, AbstractC9632h abstractC9632h) {
        this.f27976a = interfaceC10826d;
        this.f27977b = abstractC9632h;
    }

    @Override // p376u3.InterfaceC10823c
    /* renamed from: a */
    public void mo6975a() {
        AbstractC9632h abstractC9632h = this.f27977b;
        if (abstractC9632h instanceof C9641n) {
            this.f27976a.mo9342h(((C9641n) abstractC9632h).mo10332a());
        } else if (abstractC9632h instanceof C9626d) {
            this.f27976a.mo9341k(abstractC9632h.mo10332a());
        }
    }
}
