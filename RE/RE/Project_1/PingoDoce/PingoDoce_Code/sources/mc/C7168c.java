package mc;

import com.github.aachartmodel.aainfographics.BuildConfig;
import lc.AbstractC7034d;
import lc.C7032b;
import p181jd.Intrinsics;

/* renamed from: mc.c */
/* loaded from: classes2.dex */
public final class C7168c extends AbstractC7034d {

    /* renamed from: b */
    private final char f19000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7168c(AbstractC7034d abstractC7034d, char c) {
        super(abstractC7034d);
        Intrinsics.m20926i(abstractC7034d, "child");
        this.f19000b = c;
    }

    @Override // lc.AbstractC7034d
    /* renamed from: a */
    public C7032b mo19004a(char c) {
        if (this.f19000b == c) {
            return new C7032b(mo19003d(), Character.valueOf(c), true, null);
        }
        return new C7032b(mo19003d(), Character.valueOf(this.f19000b), false, null);
    }

    @Override // lc.AbstractC7034d
    /* renamed from: b */
    public C7032b mo19008b() {
        return new C7032b(mo19003d(), Character.valueOf(this.f19000b), false, null);
    }

    @Override // lc.AbstractC7034d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.VERSION_NAME);
        sb2.append(this.f19000b);
        sb2.append(" -> ");
        sb2.append(m19536c() == null ? "null" : m19536c().toString());
        return sb2.toString();
    }
}
