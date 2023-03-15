package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p031b9.C1844a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.x1 */
/* loaded from: classes.dex */
public final class C3918x1 {

    /* renamed from: b */
    private static final C1844a f11211b = new C1844a("MergeSliceTaskHandler");

    /* renamed from: a */
    private final C3924z f11212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3918x1(C3924z c3924z) {
        this.f11212a = c3924z;
    }

    /* renamed from: b */
    private static void m28610b(File file, File file2) {
        File[] listFiles;
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 51);
                sb2.append("File clashing with existing file from other slice: ");
                sb2.append(valueOf);
                throw new C3893r0(sb2.toString());
            } else if (file.renameTo(file2)) {
                return;
            } else {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 21);
                sb3.append("Unable to move file: ");
                sb3.append(valueOf2);
                throw new C3893r0(sb3.toString());
            }
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m28610b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 28);
        sb4.append("Unable to delete directory: ");
        sb4.append(valueOf3);
        throw new C3893r0(sb4.toString());
    }

    /* renamed from: a */
    public final void m28611a(C3914w1 c3914w1) {
        File m28591k = this.f11212a.m28591k(c3914w1.f11020b, c3914w1.f11203c, c3914w1.f11204d, c3914w1.f11205e);
        if (!m28591k.exists()) {
            throw new C3893r0(String.format("Cannot find verified files for slice %s.", c3914w1.f11205e), c3914w1.f11019a);
        }
        File m28589m = this.f11212a.m28589m(c3914w1.f11020b, c3914w1.f11203c, c3914w1.f11204d);
        if (!m28589m.exists()) {
            m28589m.mkdirs();
        }
        m28610b(m28591k, m28589m);
        try {
            this.f11212a.m28596f(c3914w1.f11020b, c3914w1.f11203c, c3914w1.f11204d, this.f11212a.m28584r(c3914w1.f11020b, c3914w1.f11203c, c3914w1.f11204d) + 1);
        } catch (IOException e) {
            f11211b.m35278e("Writing merge checkpoint failed with %s.", e.getMessage());
            throw new C3893r0("Writing merge checkpoint failed.", e, c3914w1.f11019a);
        }
    }
}
