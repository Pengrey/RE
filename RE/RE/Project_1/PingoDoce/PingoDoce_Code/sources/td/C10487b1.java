package td;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.b1 */
/* loaded from: classes2.dex */
public final class C10487b1 implements InterfaceC10548n1 {

    /* renamed from: w */
    private final boolean f27207w;

    public C10487b1(boolean z) {
        this.f27207w = z;
    }

    @Override // td.InterfaceC10548n1
    /* renamed from: a */
    public boolean mo7698a() {
        return this.f27207w;
    }

    @Override // td.InterfaceC10548n1
    /* renamed from: g */
    public C10503d2 mo7697g() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo7698a() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
