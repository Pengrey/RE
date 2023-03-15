package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p219l9.C7011f;
import p269o9.C8037c;
import p269o9.C8049g;
import p294p9.AbstractC8472a0;
import p294p9.C8516b0;
import p355s9.C10097e;
import p355s9.C10098f;
import p367t9.C10402c;
import p382u9.InterfaceC10857e;
import p442x9.InterfaceC12329d;

/* renamed from: com.google.firebase.crashlytics.internal.common.c0 */
/* loaded from: classes.dex */
public class C4189c0 {

    /* renamed from: a */
    private final C4227n f11431a;

    /* renamed from: b */
    private final C10097e f11432b;

    /* renamed from: c */
    private final C10402c f11433c;

    /* renamed from: d */
    private final C8037c f11434d;

    /* renamed from: e */
    private final C8049g f11435e;

    C4189c0(C4227n c4227n, C10097e c10097e, C10402c c10402c, C8037c c8037c, C8049g c8049g) {
        this.f11431a = c4227n;
        this.f11432b = c10097e;
        this.f11433c = c10402c;
        this.f11434d = c8037c;
        this.f11435e = c8049g;
    }

    /* renamed from: c */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d m28410c(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d) {
        return m28409d(abstractC8489d, this.f11434d, this.f11435e);
    }

    /* renamed from: d */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d m28409d(AbstractC8472a0.AbstractC8482e.AbstractC8489d abstractC8489d, C8037c c8037c, C8049g c8049g) {
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8504b mo15216g = abstractC8489d.mo15216g();
        String m17112c = c8037c.m17112c();
        if (m17112c != null) {
            mo15216g.mo15212d(AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8507d.m15338a().mo15126b(m17112c).mo15127a());
        } else {
            C7011f.m19611f().m19608i("No log data to include with this event.");
        }
        List<AbstractC8472a0.AbstractC8476c> m28402k = m28402k(c8049g.m17064a());
        List<AbstractC8472a0.AbstractC8476c> m28402k2 = m28402k(c8049g.m17063b());
        if (!m28402k.isEmpty() || !m28402k2.isEmpty()) {
            mo15216g.mo15214b(abstractC8489d.mo15221b().mo15204g().mo15201c(C8516b0.m15317b(m28402k)).mo15199e(C8516b0.m15317b(m28402k2)).mo15203a());
        }
        return mo15216g.mo15215a();
    }

    /* renamed from: e */
    private static AbstractC8472a0.AbstractC8473a m28408e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m28407f(traceInputStream);
            }
        } catch (IOException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19606k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return AbstractC8472a0.AbstractC8473a.m15360a().mo15306b(applicationExitInfo.getImportance()).mo15304d(applicationExitInfo.getProcessName()).mo15302f(applicationExitInfo.getReason()).mo15300h(applicationExitInfo.getTimestamp()).mo15305c(applicationExitInfo.getPid()).mo15303e(applicationExitInfo.getPss()).mo15301g(applicationExitInfo.getRss()).mo15299i(str).mo15307a();
    }

    /* renamed from: f */
    public static String m28407f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    /* renamed from: g */
    public static C4189c0 m28406g(Context context, C4239v c4239v, C10098f c10098f, C4184a c4184a, C8037c c8037c, C8049g c8049g, InterfaceC12329d interfaceC12329d, InterfaceC10857e interfaceC10857e) {
        return new C4189c0(new C4227n(context, c4239v, c4184a, interfaceC12329d), new C10097e(c10098f, interfaceC10857e), C10402c.m8067c(context), c8037c, c8049g);
    }

    /* renamed from: j */
    private ApplicationExitInfo m28403j(String str, List<ApplicationExitInfo> list) {
        long m9173q = this.f11432b.m9173q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m9173q) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List<AbstractC8472a0.AbstractC8476c> m28402k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC8472a0.AbstractC8476c.m15359a().mo15291b(entry.getKey()).mo15290c(entry.getValue()).mo15292a());
        }
        Collections.sort(arrayList, C4187b0.f11430w);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ int m28400m(AbstractC8472a0.AbstractC8476c abstractC8476c, AbstractC8472a0.AbstractC8476c abstractC8476c2) {
        return abstractC8476c.mo15294b().compareTo(abstractC8476c2.mo15294b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m28397p(AbstractC3419d<AbstractC4228o> abstractC3419d) {
        if (abstractC3419d.mo30780p()) {
            AbstractC4228o mo30784l = abstractC3419d.mo30784l();
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19615b("Crashlytics report successfully enqueued to DataTransport: " + mo30784l.mo28227d());
            File mo28228c = mo30784l.mo28228c();
            if (mo28228c.delete()) {
                C7011f m19611f2 = C7011f.m19611f();
                m19611f2.m19615b("Deleted report file: " + mo28228c.getPath());
                return true;
            }
            C7011f m19611f3 = C7011f.m19611f();
            m19611f3.m19606k("Crashlytics could not delete report file: " + mo28228c.getPath());
            return true;
        }
        C7011f.m19611f().m19605l("Crashlytics report could not be enqueued to DataTransport", abstractC3419d.mo30785k());
        return false;
    }

    /* renamed from: q */
    private void m28396q(Throwable th2, Thread thread, String str, String str2, long j, boolean z) {
        this.f11432b.m9165y(m28410c(this.f11431a.m28252c(th2, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    /* renamed from: h */
    public void m28405h(String str, List<InterfaceC4242y> list) {
        C7011f.m19611f().m19615b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4242y interfaceC4242y : list) {
            AbstractC8472a0.AbstractC8478d.AbstractC8480b mo28190c = interfaceC4242y.mo28190c();
            if (mo28190c != null) {
                arrayList.add(mo28190c);
            }
        }
        this.f11432b.m9178l(str, AbstractC8472a0.AbstractC8478d.m15358a().mo15286b(C8516b0.m15317b(arrayList)).mo15287a());
    }

    /* renamed from: i */
    public void m28404i(long j, String str) {
        this.f11432b.m9179k(str, j);
    }

    /* renamed from: l */
    public boolean m28401l() {
        return this.f11432b.m9172r();
    }

    /* renamed from: n */
    public SortedSet<String> m28399n() {
        return this.f11432b.m9174p();
    }

    /* renamed from: o */
    public void m28398o(String str, long j) {
        this.f11432b.m9164z(this.f11431a.m28251d(str, j));
    }

    /* renamed from: r */
    public void m28395r(Throwable th2, Thread thread, String str, long j) {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Persisting fatal event for session " + str);
        m28396q(th2, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void m28394s(Throwable th2, Thread thread, String str, long j) {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Persisting non-fatal event for session " + str);
        m28396q(th2, thread, str, "error", j, false);
    }

    /* renamed from: t */
    public void m28393t(String str, List<ApplicationExitInfo> list, C8037c c8037c, C8049g c8049g) {
        ApplicationExitInfo m28403j = m28403j(str, list);
        if (m28403j == null) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19608i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC8472a0.AbstractC8482e.AbstractC8489d m28253b = this.f11431a.m28253b(m28408e(m28403j));
        C7011f m19611f2 = C7011f.m19611f();
        m19611f2.m19615b("Persisting anr for session " + str);
        this.f11432b.m9165y(m28409d(m28253b, c8037c, c8049g), str, true);
    }

    /* renamed from: u */
    public void m28392u() {
        this.f11432b.m9181i();
    }

    /* renamed from: v */
    public AbstractC3419d<Void> m28391v(Executor executor) {
        List<AbstractC4228o> m9167w = this.f11432b.m9167w();
        ArrayList arrayList = new ArrayList();
        for (AbstractC4228o abstractC4228o : m9167w) {
            arrayList.add(this.f11433c.m8063g(abstractC4228o).mo30788h(executor, new InterfaceC3415b() { // from class: com.google.firebase.crashlytics.internal.common.a0
                @Override // com.google.android.gms.tasks.InterfaceC3415b
                /* renamed from: a */
                public final Object mo4684a(AbstractC3419d abstractC3419d) {
                    boolean m28397p;
                    m28397p = C4189c0.this.m28397p(abstractC3419d);
                    return Boolean.valueOf(m28397p);
                }
            }));
        }
        return C3425g.m30764f(arrayList);
    }
}
