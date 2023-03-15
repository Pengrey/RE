package p355s9;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.firebase.crashlytics.internal.common.AbstractC4228o;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p219l9.C7011f;
import p269o9.C8049g;
import p294p9.AbstractC8472a0;
import p294p9.C8516b0;
import p311q9.C9705g;
import p382u9.InterfaceC10857e;

/* renamed from: s9.e */
/* loaded from: classes.dex */
public class C10097e {

    /* renamed from: d */
    private static final Charset f26368d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f26369e = 15;

    /* renamed from: f */
    private static final C9705g f26370f = new C9705g();

    /* renamed from: g */
    private static final Comparator<? super File> f26371g = C10095c.f26366w;

    /* renamed from: h */
    private static final FilenameFilter f26372h = C10094b.f26365a;

    /* renamed from: a */
    private final AtomicInteger f26373a = new AtomicInteger(0);

    /* renamed from: b */
    private final C10098f f26374b;

    /* renamed from: c */
    private final InterfaceC10857e f26375c;

    public C10097e(C10098f c10098f, InterfaceC10857e interfaceC10857e) {
        this.f26374b = c10098f;
        this.f26375c = interfaceC10857e;
    }

    /* renamed from: A */
    private static String m9196A(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f26368d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: B */
    private void m9195B(File file, AbstractC8472a0.AbstractC8478d abstractC8478d, String str) {
        try {
            C9705g c9705g = f26370f;
            m9191F(this.f26374b.m9158f(str), c9705g.m10182E(c9705g.m10183D(m9196A(file)).m15362m(abstractC8478d)));
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19605l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    private void m9194C(String str, long j) {
        boolean z;
        List<File> m9149o = this.f26374b.m9149o(str, f26372h);
        if (m9149o.isEmpty()) {
            C7011f.m19611f().m19608i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m9149o);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : m9149o) {
                try {
                    arrayList.add(f26370f.m10175g(m9196A(file)));
                } catch (IOException e) {
                    C7011f.m19611f().m19605l("Could not add event to report for " + file, e);
                }
                if (z || m9171s(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            C7011f.m19611f().m19606k("Could not parse event files for session " + str);
            return;
        }
        m9193D(this.f26374b.m9150n(str, "report"), arrayList, j, z, C8049g.m17061d(str, this.f26374b));
    }

    /* renamed from: D */
    private void m9193D(File file, List<AbstractC8472a0.AbstractC8482e.AbstractC8489d> list, long j, boolean z, String str) {
        File m9153k;
        try {
            C9705g c9705g = f26370f;
            AbstractC8472a0 m15363l = c9705g.m10183D(m9196A(file)).m15361n(j, z, str).m15363l(C8516b0.m15317b(list));
            AbstractC8472a0.AbstractC8482e mo15328j = m15363l.mo15328j();
            if (mo15328j == null) {
                return;
            }
            if (z) {
                m9153k = this.f26374b.m9155i(mo15328j.mo15273h());
            } else {
                m9153k = this.f26374b.m9153k(mo15328j.mo15273h());
            }
            m9191F(m9153k, c9705g.m10182E(m15363l));
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19605l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    private int m9192E(String str, int i) {
        List<File> m9149o = this.f26374b.m9149o(str, C10093a.f26364a);
        Collections.sort(m9149o, C10096d.f26367w);
        return m9184f(m9149o, i);
    }

    /* renamed from: F */
    private static void m9191F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f26368d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: G */
    private static void m9190G(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f26368d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m9182h(j));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    private SortedSet<String> m9185e(String str) {
        this.f26374b.m9163a();
        SortedSet<String> m9174p = m9174p();
        if (str != null) {
            m9174p.remove(str);
        }
        if (m9174p.size() <= 8) {
            return m9174p;
        }
        while (m9174p.size() > 8) {
            String last = m9174p.last();
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19615b("Removing session over cap: " + last);
            this.f26374b.m9162b(last);
            m9174p.remove(last);
        }
        return m9174p;
    }

    /* renamed from: f */
    private static int m9184f(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            C10098f.m9146r(file);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m9183g() {
        int i = this.f26375c.mo6850b().mo5834a().f28694b;
        List<File> m9176n = m9176n();
        int size = m9176n.size();
        if (size <= i) {
            return;
        }
        for (File file : m9176n.subList(i, size)) {
            file.delete();
        }
    }

    /* renamed from: h */
    private static long m9182h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private void m9180j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* renamed from: m */
    private static String m9177m(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i));
        String str = z ? "_" : BuildConfig.VERSION_NAME;
        return "event" + format + str;
    }

    /* renamed from: n */
    private List<File> m9176n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f26374b.m9154j());
        arrayList.addAll(this.f26374b.m9157g());
        Comparator<? super File> comparator = f26371g;
        Collections.sort(arrayList, comparator);
        List<File> m9152l = this.f26374b.m9152l();
        Collections.sort(m9152l, comparator);
        arrayList.addAll(m9152l);
        return arrayList;
    }

    /* renamed from: o */
    private static String m9175o(String str) {
        return str.substring(0, f26369e);
    }

    /* renamed from: s */
    private static boolean m9171s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m9170t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m9169u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static int m9166x(File file, File file2) {
        return m9175o(file.getName()).compareTo(m9175o(file2.getName()));
    }

    /* renamed from: i */
    public void m9181i() {
        m9180j(this.f26374b.m9152l());
        m9180j(this.f26374b.m9154j());
        m9180j(this.f26374b.m9157g());
    }

    /* renamed from: k */
    public void m9179k(String str, long j) {
        for (String str2 : m9185e(str)) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19608i("Finalizing report for session " + str2);
            m9194C(str2, j);
            this.f26374b.m9162b(str2);
        }
        m9183g();
    }

    /* renamed from: l */
    public void m9178l(String str, AbstractC8472a0.AbstractC8478d abstractC8478d) {
        File m9150n = this.f26374b.m9150n(str, "report");
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19615b("Writing native session report for " + str + " to file: " + m9150n);
        m9195B(m9150n, abstractC8478d, str);
    }

    /* renamed from: p */
    public SortedSet<String> m9174p() {
        return new TreeSet(this.f26374b.m9161c()).descendingSet();
    }

    /* renamed from: q */
    public long m9173q(String str) {
        return this.f26374b.m9150n(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean m9172r() {
        return (this.f26374b.m9152l().isEmpty() && this.f26374b.m9154j().isEmpty() && this.f26374b.m9157g().isEmpty()) ? false : true;
    }

    /* renamed from: w */
    public List<AbstractC4228o> m9167w() {
        List<File> m9176n = m9176n();
        ArrayList arrayList = new ArrayList();
        for (File file : m9176n) {
            try {
                arrayList.add(AbstractC4228o.m28230a(f26370f.m10183D(m9196A(file)), file.getName(), file));
            } catch (IOException e) {
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19605l("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void m9165y(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d, String str, boolean z) {
        int i = this.f26375c.mo6850b().mo5834a().f28693a;
        try {
            m9191F(this.f26374b.m9150n(str, m9177m(this.f26373a.getAndIncrement(), z)), f26370f.m10174h(abstractC8489d));
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19605l("Could not persist event for session " + str, e);
        }
        m9192E(str, i);
    }

    /* renamed from: z */
    public void m9164z(AbstractC8472a0 abstractC8472a0) {
        AbstractC8472a0.AbstractC8482e mo15328j = abstractC8472a0.mo15328j();
        if (mo15328j == null) {
            C7011f.m19611f().m19615b("Could not get session for report");
            return;
        }
        String mo15273h = mo15328j.mo15273h();
        try {
            m9191F(this.f26374b.m9150n(mo15273h, "report"), f26370f.m10182E(abstractC8472a0));
            m9190G(this.f26374b.m9150n(mo15273h, "start-time"), BuildConfig.VERSION_NAME, mo15328j.mo15271k());
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19614c("Could not persist report for session " + mo15273h, e);
        }
    }
}
