package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C3937f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import p010a9.C0092b;
import p031b9.C1844a;
import p031b9.InterfaceC1864u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.g2 */
/* loaded from: classes.dex */
public final class C3851g2 {

    /* renamed from: d */
    private static final C1844a f10963d = new C1844a("PatchSliceTaskHandler");

    /* renamed from: a */
    private final C3924z f10964a;

    /* renamed from: b */
    private final InterfaceC1864u<InterfaceC3833c3> f10965b;

    /* renamed from: c */
    private final C0092b f10966c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3851g2(C3924z c3924z, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C0092b c0092b) {
        this.f10964a = c3924z;
        this.f10965b = interfaceC1864u;
        this.f10966c = c0092b;
    }

    /* renamed from: a */
    public final void m28745a(C3847f2 c3847f2) {
        File m28600b = this.f10964a.m28600b(c3847f2.f11020b, c3847f2.f10948c, c3847f2.f10949d);
        File file = new File(this.f10964a.m28592j(c3847f2.f11020b, c3847f2.f10948c, c3847f2.f10949d), c3847f2.f10953h);
        try {
            InputStream inputStream = c3847f2.f10955j;
            if (c3847f2.f10952g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C3830c0 c3830c0 = new C3830c0(m28600b, file);
            if (this.f10966c.m41967b()) {
                File m28599c = this.f10964a.m28599c(c3847f2.f11020b, c3847f2.f10950e, c3847f2.f10951f, c3847f2.f10953h);
                if (!m28599c.exists()) {
                    m28599c.mkdirs();
                }
                C3863j2 c3863j2 = new C3863j2(this.f10964a, c3847f2.f11020b, c3847f2.f10950e, c3847f2.f10951f, c3847f2.f10953h);
                C3937f.m28569b(c3830c0, inputStream, new C3905u0(m28599c, c3863j2), c3847f2.f10954i);
                c3863j2.m28704j(0);
            } else {
                File file2 = new File(this.f10964a.m28577y(c3847f2.f11020b, c3847f2.f10950e, c3847f2.f10951f, c3847f2.f10953h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                C3937f.m28569b(c3830c0, inputStream, new FileOutputStream(file2), c3847f2.f10954i);
                if (!file2.renameTo(this.f10964a.m28579w(c3847f2.f11020b, c3847f2.f10950e, c3847f2.f10951f, c3847f2.f10953h))) {
                    throw new C3893r0(String.format("Error moving patch for slice %s of pack %s.", c3847f2.f10953h, c3847f2.f11020b), c3847f2.f11019a);
                }
            }
            inputStream.close();
            if (this.f10966c.m41967b()) {
                f10963d.m35277f("Patching and extraction finished for slice %s of pack %s.", c3847f2.f10953h, c3847f2.f11020b);
            } else {
                f10963d.m35277f("Patching finished for slice %s of pack %s.", c3847f2.f10953h, c3847f2.f11020b);
            }
            this.f10965b.m35248c().mo28654F(c3847f2.f11019a, c3847f2.f11020b, c3847f2.f10953h, 0);
            try {
                c3847f2.f10955j.close();
            } catch (IOException unused) {
                f10963d.m35276g("Could not close file for slice %s of pack %s.", c3847f2.f10953h, c3847f2.f11020b);
            }
        } catch (IOException e) {
            f10963d.m35278e("IOException during patching %s.", e.getMessage());
            throw new C3893r0(String.format("Error patching slice %s of pack %s.", c3847f2.f10953h, c3847f2.f11020b), e, c3847f2.f11019a);
        }
    }
}
