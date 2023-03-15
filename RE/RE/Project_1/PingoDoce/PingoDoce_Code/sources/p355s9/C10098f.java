package p355s9;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p219l9.C7011f;

/* renamed from: s9.f */
/* loaded from: classes.dex */
public class C10098f {

    /* renamed from: a */
    private final File f26376a;

    /* renamed from: b */
    private final File f26377b;

    /* renamed from: c */
    private final File f26378c;

    /* renamed from: d */
    private final File f26379d;

    /* renamed from: e */
    private final File f26380e;

    public C10098f(Context context) {
        File m9148p = m9148p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.f26376a = m9148p;
        this.f26377b = m9148p(new File(m9148p, "open-sessions"));
        this.f26378c = m9148p(new File(m9148p, "reports"));
        this.f26379d = m9148p(new File(m9148p, "priority-reports"));
        this.f26380e = m9148p(new File(m9148p, "native-reports"));
    }

    /* renamed from: m */
    private File m9151m(String str) {
        return m9147q(new File(this.f26377b, str));
    }

    /* renamed from: p */
    private static synchronized File m9148p(File file) {
        synchronized (C10098f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19615b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    /* renamed from: q */
    private static File m9147q(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m9146r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m9146r(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: s */
    private static <T> List<T> m9145s(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: a */
    public void m9163a() {
        File[] fileArr = {new File(this.f26376a.getParent(), ".com.google.firebase.crashlytics"), new File(this.f26376a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && m9146r(file)) {
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19615b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    /* renamed from: b */
    public boolean m9162b(String str) {
        return m9146r(new File(this.f26377b, str));
    }

    /* renamed from: c */
    public List<String> m9161c() {
        return m9145s(this.f26377b.list());
    }

    /* renamed from: d */
    public File m9160d(String str) {
        return new File(this.f26376a, str);
    }

    /* renamed from: e */
    public List<File> m9159e(FilenameFilter filenameFilter) {
        return m9145s(this.f26376a.listFiles(filenameFilter));
    }

    /* renamed from: f */
    public File m9158f(String str) {
        return new File(this.f26380e, str);
    }

    /* renamed from: g */
    public List<File> m9157g() {
        return m9145s(this.f26380e.listFiles());
    }

    /* renamed from: h */
    public File m9156h(String str) {
        return m9147q(new File(m9151m(str), "native"));
    }

    /* renamed from: i */
    public File m9155i(String str) {
        return new File(this.f26379d, str);
    }

    /* renamed from: j */
    public List<File> m9154j() {
        return m9145s(this.f26379d.listFiles());
    }

    /* renamed from: k */
    public File m9153k(String str) {
        return new File(this.f26378c, str);
    }

    /* renamed from: l */
    public List<File> m9152l() {
        return m9145s(this.f26378c.listFiles());
    }

    /* renamed from: n */
    public File m9150n(String str, String str2) {
        return new File(m9151m(str), str2);
    }

    /* renamed from: o */
    public List<File> m9149o(String str, FilenameFilter filenameFilter) {
        return m9145s(m9151m(str).listFiles(filenameFilter));
    }
}
