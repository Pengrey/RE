package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p031b9.C1863t;

/* renamed from: com.google.android.play.core.assetpacks.l2 */
/* loaded from: classes.dex */
final class C3871l2 {

    /* renamed from: a */
    private static final Pattern f11021a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<File> m28696a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C3867k2.f11017a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C3893r0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C3887p2 m28743c = new C3857i0(fileInputStream).m28743c();
                    if (m28743c.m28663d() == null) {
                        throw new C3893r0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, m28743c.m28663d());
                    if (!file5.exists()) {
                        throw new C3893r0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        C1863t.m35249a(th2, th3);
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
