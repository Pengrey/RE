package gd;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.File;
import p181jd.Intrinsics;
import sd.C10171u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gd.f */
/* loaded from: classes2.dex */
public class Utils extends C5643e {
    /* renamed from: c */
    public static String m23451c(File file) {
        String m8931C0;
        Intrinsics.isThisObjectNull(file, "<this>");
        String name = file.getName();
        Intrinsics.checkIfNull(name, "name");
        m8931C0 = C10171u.m8931C0(name, '.', BuildConfig.VERSION_NAME);
        return m8931C0;
    }

    /* renamed from: d */
    public static final File m23450d(File file, File file2) {
        boolean m8916K;
        Intrinsics.isThisObjectNull(file, "<this>");
        Intrinsics.isThisObjectNull(file2, "relative");
        if (FilePathComponents.m23452b(file2)) {
            return file2;
        }
        String file3 = file.toString();
        Intrinsics.checkIfNull(file3, "this.toString()");
        if (!(file3.length() == 0)) {
            m8916K = C10171u.m8916K(file3, File.separatorChar, false, 2, null);
            if (!m8916K) {
                return new File(file3 + File.separatorChar + file2);
            }
        }
        return new File(file3 + file2);
    }

    /* renamed from: e */
    public static File m23449e(File file, String str) {
        Intrinsics.isThisObjectNull(file, "<this>");
        Intrinsics.isThisObjectNull(str, "relative");
        return m23450d(file, new File(str));
    }
}
