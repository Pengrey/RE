package p376u3;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p129h3.EnumC5826d;
import p171j3.C6299a;
import p305q3.AbstractC9632h;
import p305q3.C9626d;
import p305q3.C9641n;
import p327r3.EnumC9804h;
import p376u3.InterfaceC10823c;

/* renamed from: u3.a */
/* loaded from: classes.dex */
public final class C10819a implements InterfaceC10823c {

    /* renamed from: a */
    private final InterfaceC10826d f27970a;

    /* renamed from: b */
    private final AbstractC9632h f27971b;

    /* renamed from: c */
    private final int f27972c;

    /* renamed from: d */
    private final boolean f27973d;

    public C10819a(InterfaceC10826d interfaceC10826d, AbstractC9632h abstractC9632h, int i, boolean z) {
        this.f27970a = interfaceC10826d;
        this.f27971b = abstractC9632h;
        this.f27972c = i;
        this.f27973d = z;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // p376u3.InterfaceC10823c
    /* renamed from: a */
    public void mo6975a() {
        Drawable mo6973i = this.f27970a.mo6973i();
        Drawable mo10332a = this.f27971b.mo10332a();
        EnumC9804h m10388J = this.f27971b.mo10331b().m10388J();
        int i = this.f27972c;
        AbstractC9632h abstractC9632h = this.f27971b;
        C6299a c6299a = new C6299a(mo6973i, mo10332a, m10388J, i, ((abstractC9632h instanceof C9641n) && ((C9641n) abstractC9632h).m10300d()) ? false : true, this.f27973d);
        AbstractC9632h abstractC9632h2 = this.f27971b;
        if (abstractC9632h2 instanceof C9641n) {
            this.f27970a.mo9342h(c6299a);
        } else if (abstractC9632h2 instanceof C9626d) {
            this.f27970a.mo9341k(c6299a);
        }
    }

    /* compiled from: CrossfadeTransition.kt */
    /* renamed from: u3.a$a */
    /* loaded from: classes.dex */
    public static final class C10820a implements InterfaceC10823c.InterfaceC10824a {

        /* renamed from: b */
        private final int f27974b;

        /* renamed from: c */
        private final boolean f27975c;

        public C10820a() {
            this(0, false, 3, null);
        }

        public C10820a(int i, boolean z) {
            this.f27974b = i;
            this.f27975c = z;
            if (!(i > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        @Override // p376u3.InterfaceC10823c.InterfaceC10824a
        /* renamed from: a */
        public InterfaceC10823c mo6974a(InterfaceC10826d interfaceC10826d, AbstractC9632h abstractC9632h) {
            if (!(abstractC9632h instanceof C9641n)) {
                return InterfaceC10823c.InterfaceC10824a.f27978a.mo6974a(interfaceC10826d, abstractC9632h);
            }
            if (((C9641n) abstractC9632h).m10301c() == EnumC5826d.MEMORY_CACHE) {
                return InterfaceC10823c.InterfaceC10824a.f27978a.mo6974a(interfaceC10826d, abstractC9632h);
            }
            return new C10819a(interfaceC10826d, abstractC9632h, this.f27974b, this.f27975c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10820a) {
                C10820a c10820a = (C10820a) obj;
                if (this.f27974b == c10820a.f27974b && this.f27975c == c10820a.f27975c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f27974b * 31) + Boolean.hashCode(this.f27975c);
        }

        public /* synthetic */ C10820a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }
    }
}
