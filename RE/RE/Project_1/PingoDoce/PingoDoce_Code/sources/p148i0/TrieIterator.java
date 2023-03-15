package p148i0;

import java.util.NoSuchElementException;
import java.util.Objects;
import p181jd.Intrinsics;

/* renamed from: i0.k */
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractC5981a {

    /* renamed from: A */
    private boolean f16545A;

    /* renamed from: y */
    private int f16546y;

    /* renamed from: z */
    private Object[] f16547z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.isThisObjectNull(objArr, "root");
        this.f16546y = i3;
        Object[] objArr2 = new Object[i3];
        this.f16547z = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f16545A = r5;
        objArr2[0] = objArr;
        m22461j(i - r5, 1);
    }

    /* renamed from: h */
    private final Object m22462h() {
        Object obj = this.f16547z[this.f16546y - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[m22534c() & 31];
    }

    /* renamed from: j */
    private final void m22461j(int i, int i2) {
        int i3 = (this.f16546y - i2) * 5;
        while (i2 < this.f16546y) {
            Object[] objArr = this.f16547z;
            Object[] objArr2 = objArr[i2 - 1];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[C5987l.m22458a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* renamed from: k */
    private final void m22460k(int i) {
        int i2 = 0;
        while (C5987l.m22458a(m22534c(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m22461j(m22534c(), ((this.f16546y - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* renamed from: l */
    public final void m22459l(Object[] objArr, int i, int i2, int i3) {
        Intrinsics.isThisObjectNull(objArr, "root");
        m22532e(i);
        m22531f(i2);
        this.f16546y = i3;
        if (this.f16547z.length < i3) {
            this.f16547z = new Object[i3];
        }
        this.f16547z[0] = objArr;
        ?? r0 = i == i2 ? 1 : 0;
        this.f16545A = r0;
        m22461j(i - r0, 1);
    }

    public Object next() {
        if (hasNext()) {
            Object m22462h = m22462h();
            m22532e(m22534c() + 1);
            if (m22534c() == m22533d()) {
                this.f16545A = true;
                return m22462h;
            }
            m22460k(0);
            return m22462h;
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            m22532e(m22534c() - 1);
            if (this.f16545A) {
                this.f16545A = false;
                return m22462h();
            }
            m22460k(31);
            return m22462h();
        }
        throw new NoSuchElementException();
    }
}
