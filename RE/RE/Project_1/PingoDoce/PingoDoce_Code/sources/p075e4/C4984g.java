package p075e4;

import android.util.Pair;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p130h4.C5848d;

/* renamed from: e4.g */
/* loaded from: classes.dex */
public class C4984g {

    /* renamed from: a */
    private final InterfaceC4982e f13909a;

    public C4984g(InterfaceC4982e interfaceC4982e) {
        this.f13909a = interfaceC4982e;
    }

    /* renamed from: b */
    private static String m25977b(String str, EnumC4980c enumC4980c, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", BuildConfig.VERSION_NAME));
        sb2.append(z ? enumC4980c.tempExtension() : enumC4980c.extension);
        return sb2.toString();
    }

    /* renamed from: c */
    private File m25976c(String str) throws FileNotFoundException {
        File file = new File(m25975d(), m25977b(str, EnumC4980c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m25975d(), m25977b(str, EnumC4980c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m25975d() {
        File mo25980a = this.f13909a.mo25980a();
        if (mo25980a.isFile()) {
            mo25980a.delete();
        }
        if (!mo25980a.exists()) {
            mo25980a.mkdirs();
        }
        return mo25980a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Pair<EnumC4980c, InputStream> m25978a(String str) {
        EnumC4980c enumC4980c;
        try {
            File m25976c = m25976c(str);
            if (m25976c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m25976c);
            if (m25976c.getAbsolutePath().endsWith(".zip")) {
                enumC4980c = EnumC4980c.ZIP;
            } else {
                enumC4980c = EnumC4980c.JSON;
            }
            C5848d.m22931a("Cache hit for " + str + " at " + m25976c.getAbsolutePath());
            return new Pair<>(enumC4980c, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m25974e(String str, EnumC4980c enumC4980c) {
        File file = new File(m25975d(), m25977b(str, enumC4980c, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.VERSION_NAME));
        boolean renameTo = file.renameTo(file2);
        C5848d.m22931a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        C5848d.m22929c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public File m25973f(String str, InputStream inputStream, EnumC4980c enumC4980c) throws IOException {
        File file = new File(m25975d(), m25977b(str, enumC4980c, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
