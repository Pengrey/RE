package mc;

import lc.AbstractC7034d;
import lc.C7032b;

/* renamed from: mc.b */
/* loaded from: classes2.dex */
public final class C7167b extends AbstractC7034d {

    /* renamed from: b */
    private final char f18999b;

    public C7167b(AbstractC7034d abstractC7034d, char c) {
        super(abstractC7034d);
        this.f18999b = c;
    }

    @Override // lc.AbstractC7034d
    /* renamed from: a */
    public C7032b mo19004a(char c) {
        if (this.f18999b == c) {
            return new C7032b(mo19003d(), Character.valueOf(c), true, Character.valueOf(c));
        }
        return new C7032b(mo19003d(), Character.valueOf(this.f18999b), false, Character.valueOf(this.f18999b));
    }

    @Override // lc.AbstractC7034d
    /* renamed from: b */
    public C7032b mo19008b() {
        return new C7032b(mo19003d(), Character.valueOf(this.f18999b), false, Character.valueOf(this.f18999b));
    }

    @Override // lc.AbstractC7034d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append(this.f18999b);
        sb2.append("} -> ");
        sb2.append(m19536c() == null ? "null" : m19536c().toString());
        return sb2.toString();
    }
}
