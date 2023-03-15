package p387uf;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.p283bp.chrono.AbstractC8182e;

/* renamed from: uf.b */
/* loaded from: classes2.dex */
public final class C10878b extends AbstractC8182e implements Serializable {

    /* renamed from: z */
    public static final C10878b f28093z = new C10878b(0, 0, 0);

    /* renamed from: w */
    private final int f28094w;

    /* renamed from: x */
    private final int f28095x;

    /* renamed from: y */
    private final int f28096y;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private C10878b(int i, int i2, int i3) {
        this.f28094w = i;
        this.f28095x = i2;
        this.f28096y = i3;
    }

    private Object readResolve() {
        return ((this.f28094w | this.f28095x) | this.f28096y) == 0 ? f28093z : this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10878b) {
            C10878b c10878b = (C10878b) obj;
            return this.f28094w == c10878b.f28094w && this.f28095x == c10878b.f28095x && this.f28096y == c10878b.f28096y;
        }
        return false;
    }

    public int hashCode() {
        return this.f28094w + Integer.rotateLeft(this.f28095x, 8) + Integer.rotateLeft(this.f28096y, 16);
    }

    public String toString() {
        if (this == f28093z) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i = this.f28094w;
        if (i != 0) {
            sb2.append(i);
            sb2.append('Y');
        }
        int i2 = this.f28095x;
        if (i2 != 0) {
            sb2.append(i2);
            sb2.append('M');
        }
        int i3 = this.f28096y;
        if (i3 != 0) {
            sb2.append(i3);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
