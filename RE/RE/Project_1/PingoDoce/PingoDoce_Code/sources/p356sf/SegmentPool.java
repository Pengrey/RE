package p356sf;

import java.util.concurrent.atomic.AtomicReference;
import p181jd.Intrinsics;

/* renamed from: sf.d0 */
/* loaded from: classes2.dex */
public final class SegmentPool {

    /* renamed from: a */
    public static final SegmentPool f26536a = new SegmentPool();

    /* renamed from: b */
    private static final int f26537b = 65536;

    /* renamed from: c */
    private static final Segment f26538c = new Segment(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f26539d;

    /* renamed from: e */
    private static final AtomicReference[] f26540e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f26539d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f26540e = atomicReferenceArr;
    }

    private SegmentPool() {
    }

    /* renamed from: a */
    private final AtomicReference m8771a() {
        return f26540e[(int) (Thread.currentThread().getId() & (f26539d - 1))];
    }

    /* renamed from: b */
    public static final void m8770b(Segment segment) {
        Intrinsics.isThisObjectNull(segment, "segment");
        if (segment.f26534f == null && segment.f26535g == null) {
            if (segment.f26532d) {
                return;
            }
            AtomicReference m8771a = f26536a.m8771a();
            Segment segment2 = (Segment) m8771a.get();
            if (segment2 == f26538c) {
                return;
            }
            int i = segment2 != null ? segment2.f26531c : 0;
            if (i >= f26537b) {
                return;
            }
            segment.f26534f = segment2;
            segment.f26530b = 0;
            segment.f26531c = i + 8192;
            if (m8771a.compareAndSet(segment2, segment)) {
                return;
            }
            segment.f26534f = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final Segment m8769c() {
        AtomicReference m8771a = f26536a.m8771a();
        Segment segment = f26538c;
        Segment segment2 = (Segment) m8771a.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            m8771a.set(null);
            return new Segment();
        }
        m8771a.set(segment2.f26534f);
        segment2.f26534f = null;
        segment2.f26531c = 0;
        return segment2;
    }
}
