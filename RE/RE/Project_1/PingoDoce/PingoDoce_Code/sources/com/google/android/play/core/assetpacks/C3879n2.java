package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p031b9.C1844a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.n2 */
/* loaded from: classes.dex */
public final class C3879n2 {

    /* renamed from: b */
    private static final C1844a f11064b = new C1844a("VerifySliceTaskHandler");

    /* renamed from: a */
    private final C3924z f11065a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3879n2(C3924z c3924z) {
        this.f11065a = c3924z;
    }

    /* renamed from: b */
    private final void m28688b(C3875m2 c3875m2, File file) {
        try {
            File m28577y = this.f11065a.m28577y(c3875m2.f11020b, c3875m2.f11028c, c3875m2.f11029d, c3875m2.f11030e);
            if (!m28577y.exists()) {
                throw new C3893r0(String.format("Cannot find metadata files for slice %s.", c3875m2.f11030e), c3875m2.f11019a);
            }
            try {
                if (!C3902t1.m28637a(C3871l2.m28696a(file, m28577y)).equals(c3875m2.f11031f)) {
                    throw new C3893r0(String.format("Verification failed for slice %s.", c3875m2.f11030e), c3875m2.f11019a);
                }
                f11064b.m35277f("Verification of slice %s of pack %s successful.", c3875m2.f11030e, c3875m2.f11020b);
            } catch (IOException e) {
                throw new C3893r0(String.format("Could not digest file during verification for slice %s.", c3875m2.f11030e), e, c3875m2.f11019a);
            } catch (NoSuchAlgorithmException e2) {
                throw new C3893r0("SHA256 algorithm not supported.", e2, c3875m2.f11019a);
            }
        } catch (IOException e3) {
            throw new C3893r0(String.format("Could not reconstruct slice archive during verification for slice %s.", c3875m2.f11030e), e3, c3875m2.f11019a);
        }
    }

    /* renamed from: a */
    public final void m28689a(C3875m2 c3875m2) {
        File m28599c = this.f11065a.m28599c(c3875m2.f11020b, c3875m2.f11028c, c3875m2.f11029d, c3875m2.f11030e);
        if (!m28599c.exists()) {
            throw new C3893r0(String.format("Cannot find unverified files for slice %s.", c3875m2.f11030e), c3875m2.f11019a);
        }
        m28688b(c3875m2, m28599c);
        File m28591k = this.f11065a.m28591k(c3875m2.f11020b, c3875m2.f11028c, c3875m2.f11029d, c3875m2.f11030e);
        if (!m28591k.exists()) {
            m28591k.mkdirs();
        }
        if (!m28599c.renameTo(m28591k)) {
            throw new C3893r0(String.format("Failed to move slice %s after verification.", c3875m2.f11030e), c3875m2.f11019a);
        }
    }
}
