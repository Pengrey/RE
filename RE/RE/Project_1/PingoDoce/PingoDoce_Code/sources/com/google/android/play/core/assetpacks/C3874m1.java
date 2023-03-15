package com.google.android.play.core.assetpacks;

import p031b9.C1844a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.m1 */
/* loaded from: classes.dex */
public final class C3874m1 {

    /* renamed from: d */
    private static final C1844a f11024d = new C1844a("ExtractorTaskFinder");

    /* renamed from: a */
    private final C3862j1 f11025a;

    /* renamed from: b */
    private final C3924z f11026b;

    /* renamed from: c */
    private final C3849g0 f11027c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3874m1(C3862j1 c3862j1, C3924z c3924z, C3849g0 c3849g0) {
        this.f11025a = c3862j1;
        this.f11026b = c3924z;
        this.f11027c = c3849g0;
    }

    /* renamed from: b */
    private final boolean m28691b(C3850g1 c3850g1, C3854h1 c3854h1) {
        C3924z c3924z = this.f11026b;
        C3846f1 c3846f1 = c3850g1.f10962c;
        return c3924z.m28579w(c3846f1.f10943a, c3850g1.f10961b, c3846f1.f10944b, c3854h1.f10974a).exists();
    }

    /* renamed from: c */
    private static boolean m28690c(C3854h1 c3854h1) {
        int i = c3854h1.f10979f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x040d, code lost:
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0216, code lost:
        r0 = com.google.android.play.core.assetpacks.C3874m1.f11024d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f10960a);
        r4[1] = r6.f10962c.f10943a;
        r4[2] = r10.f10974a;
        r0.m35280c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0233, code lost:
        r11 = r34.f11026b;
        r4 = r6.f10962c;
        r0 = new java.io.FileInputStream(r11.m28579w(r4.f10943a, r6.f10961b, r4.f10944b, r10.f10974a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024a, code lost:
        r9 = r6.f10960a;
        r11 = r6.f10962c;
        r4 = new com.google.android.play.core.assetpacks.C3881o0(r9, r11.f10943a, r6.f10961b, r11.f10944b, r10.f10974a, 0, 0, 1, r11.f10946d, r11.f10945c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0279, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029f, code lost:
        throw new com.google.android.play.core.assetpacks.C3893r0(java.lang.String.format("Error finding patch, session %s packName %s sliceId %s", java.lang.Integer.valueOf(r6.f10960a), r6.f10962c.f10943a, r10.f10974a), r0, r6.f10960a);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.C3870l1 m28692a() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C3874m1.m28692a():com.google.android.play.core.assetpacks.l1");
    }
}
