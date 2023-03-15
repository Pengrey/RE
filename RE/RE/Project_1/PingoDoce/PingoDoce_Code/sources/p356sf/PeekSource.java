package p356sf;

import p181jd.Intrinsics;

/* renamed from: sf.z */
/* loaded from: classes2.dex */
public final class PeekSource implements InterfaceC10191h0 {

    /* renamed from: A */
    private boolean f26598A;

    /* renamed from: B */
    private long f26599B;

    /* renamed from: w */
    private final InterfaceC10187e f26600w;

    /* renamed from: x */
    private final Buffer f26601x;

    /* renamed from: y */
    private Segment f26602y;

    /* renamed from: z */
    private int f26603z;

    public PeekSource(InterfaceC10187e interfaceC10187e) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "upstream");
        this.f26600w = interfaceC10187e;
        Buffer mo8759b = interfaceC10187e.mo8759b();
        this.f26601x = mo8759b;
        Segment segment = mo8759b.f26525w;
        this.f26602y = segment;
        this.f26603z = segment != null ? segment.f26530b : -1;
    }

    public void close() {
        this.f26598A = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f26530b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(p356sf.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p181jd.Intrinsics.isThisObjectNull(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f26598A
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            sf.c0 r5 = r8.f26602y
            if (r5 == 0) goto L2a
            sf.c r6 = r8.f26601x
            sf.c0 r6 = r6.f26525w
            if (r5 != r6) goto L2b
            int r5 = r8.f26603z
            p181jd.Intrinsics.ifNullDoSomething(r6)
            int r6 = r6.f26530b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            sf.e r0 = r8.f26600w
            long r1 = r8.f26599B
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo8746z(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            sf.c0 r0 = r8.f26602y
            if (r0 != 0) goto L53
            sf.c r0 = r8.f26601x
            sf.c0 r0 = r0.f26525w
            if (r0 == 0) goto L53
            r8.f26602y = r0
            p181jd.Intrinsics.ifNullDoSomething(r0)
            int r0 = r0.f26530b
            r8.f26603z = r0
        L53:
            sf.c r0 = r8.f26601x
            long r0 = r0.size()
            long r2 = r8.f26599B
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            sf.c r2 = r8.f26601x
            long r4 = r8.f26599B
            r3 = r9
            r6 = r10
            r2.m8816H(r3, r4, r6)
            long r0 = r8.f26599B
            long r0 = r0 + r10
            r8.f26599B = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p356sf.PeekSource.read(sf.c, long):long");
    }

    /* renamed from: timeout */
    public Timeout mo40537timeout() {
        return this.f26600w.mo40537timeout();
    }
}
