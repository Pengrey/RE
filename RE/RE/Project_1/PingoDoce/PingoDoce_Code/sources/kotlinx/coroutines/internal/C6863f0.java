package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlinx.coroutines.internal.AbstractC6861e0;

/* renamed from: kotlinx.coroutines.internal.f0 */
/* loaded from: classes2.dex */
public final class C6863f0<S extends AbstractC6861e0<S>> {
    /* renamed from: a */
    public static <S extends AbstractC6861e0<S>> Object m19993a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final S m19992b(Object obj) {
        C6867h0 c6867h0;
        c6867h0 = C6862f.f18309a;
        if (obj != c6867h0) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: c */
    public static final boolean m19991c(Object obj) {
        C6867h0 c6867h0;
        c6867h0 = C6862f.f18309a;
        return obj == c6867h0;
    }
}
