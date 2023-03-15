package androidx.compose.p018ui.platform;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.f */
/* loaded from: classes.dex */
public final class C0711f extends AbstractC0686b {

    /* renamed from: c */
    public static final C0712a f2241c = new C0712a(null);

    /* renamed from: d */
    private static C0711f f2242d;

    /* compiled from: AccessibilityIterators.android.kt */
    /* renamed from: androidx.compose.ui.platform.f$a */
    /* loaded from: classes.dex */
    public static final class C0712a {
        private C0712a() {
        }

        public /* synthetic */ C0712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0711f m39760a() {
            if (C0711f.f2242d == null) {
                C0711f.f2242d = new C0711f(null);
            }
            C0711f c0711f = C0711f.f2242d;
            Objects.requireNonNull(c0711f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c0711f;
        }
    }

    private C0711f() {
    }

    public /* synthetic */ C0711f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    private final boolean m39762i(int i) {
        return i > 0 && m39827d().charAt(i + (-1)) != '\n' && (i == m39827d().length() || m39827d().charAt(i) == '\n');
    }

    /* renamed from: j */
    private final boolean m39761j(int i) {
        return m39827d().charAt(i) != '\n' && (i == 0 || m39827d().charAt(i - 1) == '\n');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // androidx.compose.p018ui.platform.InterfaceC0717g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] mo39755a(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.m39827d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r4 > 0) goto Lf
            return r1
        Lf:
            if (r4 <= r0) goto L12
            r4 = r0
        L12:
            if (r4 <= 0) goto L2b
            java.lang.String r0 = r3.m39827d()
            int r2 = r4 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 != r2) goto L2b
            boolean r0 = r3.m39762i(r4)
            if (r0 != 0) goto L2b
            int r4 = r4 + (-1)
            goto L12
        L2b:
            if (r4 > 0) goto L2e
            return r1
        L2e:
            int r0 = r4 + (-1)
        L30:
            if (r0 <= 0) goto L3b
            boolean r1 = r3.m39761j(r0)
            if (r1 != 0) goto L3b
            int r0 = r0 + (-1)
            goto L30
        L3b:
            int[] r4 = r3.m39828c(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0711f.mo39755a(int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // androidx.compose.p018ui.platform.InterfaceC0717g
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] mo39754b(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.m39827d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r5 < r0) goto Lf
            return r1
        Lf:
            if (r5 >= 0) goto L12
            r5 = 0
        L12:
            if (r5 >= r0) goto L29
            java.lang.String r2 = r4.m39827d()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L29
            boolean r2 = r4.m39761j(r5)
            if (r2 != 0) goto L29
            int r5 = r5 + 1
            goto L12
        L29:
            if (r5 < r0) goto L2c
            return r1
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r0) goto L39
            boolean r2 = r4.m39762i(r1)
            if (r2 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r5 = r4.m39828c(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0711f.mo39754b(int):int[]");
    }
}
