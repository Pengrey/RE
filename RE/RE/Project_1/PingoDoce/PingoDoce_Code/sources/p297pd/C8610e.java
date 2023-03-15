package p297pd;

import java.util.NoSuchElementException;
import p489zc.AbstractC13762g0;

/* renamed from: pd.e */
/* loaded from: classes2.dex */
public final class C8610e extends AbstractC13762g0 {

    /* renamed from: w */
    private final int f22225w;

    /* renamed from: x */
    private final int f22226x;

    /* renamed from: y */
    private boolean f22227y;

    /* renamed from: z */
    private int f22228z;

    public C8610e(int i, int i2, int i3) {
        this.f22225w = i3;
        this.f22226x = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f22227y = z;
        this.f22228z = z ? i : i2;
    }

    @Override // p489zc.AbstractC13762g0
    /* renamed from: a */
    public int mo404a() {
        int i = this.f22228z;
        if (i == this.f22226x) {
            if (this.f22227y) {
                this.f22227y = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f22228z = this.f22225w + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22227y;
    }
}
