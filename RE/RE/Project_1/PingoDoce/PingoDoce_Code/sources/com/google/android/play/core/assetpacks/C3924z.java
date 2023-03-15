package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p031b9.C1844a;
import p031b9.C1863t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.z */
/* loaded from: classes.dex */
public final class C3924z {

    /* renamed from: c */
    private static final C1844a f11222c = new C1844a("AssetPackStorage");

    /* renamed from: a */
    private final Context f11223a;

    /* renamed from: b */
    private final C3837d2 f11224b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14L);
        timeUnit.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3924z(Context context, C3837d2 c3837d2) {
        this.f11223a = context;
        this.f11224b = c3837d2;
    }

    /* renamed from: B */
    private final File m28607B(String str) {
        return new File(m28602G(), str);
    }

    /* renamed from: C */
    private final File m28606C(String str, int i, long j) {
        return new File(m28589m(str, i, j), "merge.tmp");
    }

    /* renamed from: D */
    private final List<File> m28605D() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            f11222c.m35278e("Could not process directory while scanning installed packs. %s", e);
        }
        if (m28602G().exists() && m28602G().listFiles() != null) {
            for (File file : m28602G().listFiles()) {
                if (!file.getCanonicalPath().equals(m28604E().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: E */
    private final File m28604E() {
        return new File(m28602G(), "_tmp");
    }

    /* renamed from: F */
    private final File m28603F(String str, int i, long j) {
        return new File(new File(new File(m28604E(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: G */
    private final File m28602G() {
        return new File(this.f11223a.getFilesDir(), "assetpacks");
    }

    /* renamed from: a */
    private final File m28601a(String str, int i) {
        return new File(m28607B(str), String.valueOf(i));
    }

    /* renamed from: e */
    private static void m28597e(File file) {
        File[] listFiles;
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long m28594h = m28594h(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(m28594h)) && !file2.getName().equals("stale.tmp")) {
                m28585q(file2);
            }
        }
    }

    /* renamed from: h */
    private static long m28594h(File file) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e) {
                f11222c.m35279d(e, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    /* renamed from: q */
    private static boolean m28585q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= m28585q(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m28608A(String str, int i, long j) {
        if (m28603F(str, i, j).exists()) {
            m28585q(m28603F(str, i, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final File m28600b(String str, int i, long j) {
        return new File(m28601a(str, i), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final File m28599c(String str, int i, long j, String str2) {
        return new File(new File(new File(m28603F(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: d */
    final Map<String, AbstractC3819a> m28598d() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : m28605D()) {
                AbstractC3819a m28593i = m28593i(file.getName());
                if (m28593i != null) {
                    hashMap.put(file.getName(), m28593i);
                }
            }
        } catch (IOException e) {
            f11222c.m35278e("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m28596f(String str, int i, long j, int i2) throws IOException {
        File m28606C = m28606C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        m28606C.getParentFile().mkdirs();
        m28606C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(m28606C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m28595g(List<String> list) {
        int m28755a = this.f11224b.m28755a();
        List<File> m28605D = m28605D();
        int size = m28605D.size();
        for (int i = 0; i < size; i++) {
            File file = m28605D.get(i);
            if (!list.contains(file.getName()) && m28594h(file) != m28755a) {
                m28585q(file);
            }
        }
    }

    /* renamed from: i */
    final AbstractC3819a m28593i(String str) throws IOException {
        String m28587o = m28587o(str);
        if (m28587o == null) {
            return null;
        }
        File file = new File(m28587o, "assets");
        if (file.isDirectory()) {
            return AbstractC3819a.m28767a(m28587o, file.getCanonicalPath());
        }
        f11222c.m35278e("Failed to find assets directory: %s", file);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final File m28592j(String str, int i, long j) {
        return new File(m28600b(str, i, j), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final File m28591k(String str, int i, long j, String str2) {
        return new File(new File(new File(m28603F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final Map<String, Long> m28590l() {
        HashMap hashMap = new HashMap();
        for (String str : m28598d().keySet()) {
            hashMap.put(str, Long.valueOf(m28578x(str)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final File m28589m(String str, int i, long j) {
        return new File(m28603F(str, i, j), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final File m28588n(String str, int i, long j, String str2) {
        return new File(m28577y(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: o */
    final String m28587o(String str) throws IOException {
        int length;
        File file = new File(m28602G(), str);
        if (!file.exists()) {
            f11222c.m35280c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f11224b.m28755a()));
        if (!file2.exists()) {
            f11222c.m35280c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f11224b.m28755a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f11222c.m35280c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f11224b.m28755a()));
            return null;
        } else if (length > 1) {
            f11222c.m35278e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f11224b.m28755a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m28586p() {
        List<File> m28605D = m28605D();
        int size = m28605D.size();
        for (int i = 0; i < size; i++) {
            File file = m28605D.get(i);
            if (file.listFiles() != null) {
                m28597e(file);
                long m28594h = m28594h(file);
                if (this.f11224b.m28755a() != m28594h) {
                    try {
                        new File(new File(file, String.valueOf(m28594h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f11222c.m35278e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m28597e(file2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final int m28584r(String str, int i, long j) throws IOException {
        File m28606C = m28606C(str, i, j);
        if (m28606C.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m28606C);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") != null) {
                    try {
                        return Integer.parseInt(properties.getProperty("numberOfMerges"));
                    } catch (NumberFormatException e) {
                        throw new C3893r0("Merge checkpoint file corrupt.", e);
                    }
                }
                throw new C3893r0("Merge checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    C1863t.m35249a(th2, th3);
                }
                throw th2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final File m28583s(String str, int i, long j, String str2) {
        return new File(m28577y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m28582t(String str) {
        if (m28607B(str).exists()) {
            return m28585q(m28607B(str));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final int m28581u(String str) {
        return (int) m28594h(m28607B(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final File m28580v(String str, int i, long j) {
        return new File(new File(m28603F(str, i, j), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final File m28579w(String str, int i, long j, String str2) {
        return new File(m28577y(str, i, j, str2), "slice.zip");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final long m28578x(String str) {
        return m28594h(m28601a(str, m28581u(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final File m28577y(String str, int i, long j, String str2) {
        return new File(m28580v(str, i, j), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m28576z() {
        m28585q(m28602G());
    }
}
