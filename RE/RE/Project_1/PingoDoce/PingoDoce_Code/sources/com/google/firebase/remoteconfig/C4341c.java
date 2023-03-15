package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.C4175c;
import com.google.firebase.remoteconfig.internal.C4343b;
import com.google.firebase.remoteconfig.internal.C4347d;
import com.google.firebase.remoteconfig.internal.C4349e;
import com.google.firebase.remoteconfig.internal.C4350f;
import com.google.firebase.remoteconfig.internal.C4351g;
import com.google.firebase.remoteconfig.internal.C4352h;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p078e7.C5006g;
import p078e7.InterfaceC5002c;
import p078e7.InterfaceC5003d;
import p121g9.C5627a;
import p136ha.InterfaceC5882b;
import p157i9.InterfaceC6056a;
import p158ia.InterfaceC6066d;
import qa.C9708b;

/* renamed from: com.google.firebase.remoteconfig.c */
/* loaded from: classes.dex */
public class C4341c {

    /* renamed from: j */
    private static final InterfaceC5003d f11779j = C5006g.m25911d();

    /* renamed from: k */
    private static final Random f11780k = new Random();

    /* renamed from: a */
    private final Map<String, C4339a> f11781a;

    /* renamed from: b */
    private final Context f11782b;

    /* renamed from: c */
    private final ExecutorService f11783c;

    /* renamed from: d */
    private final C4175c f11784d;

    /* renamed from: e */
    private final InterfaceC6066d f11785e;

    /* renamed from: f */
    private final C5627a f11786f;

    /* renamed from: g */
    private final InterfaceC5882b<InterfaceC6056a> f11787g;

    /* renamed from: h */
    private final String f11788h;

    /* renamed from: i */
    private Map<String, String> f11789i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4341c(Context context, C4175c c4175c, InterfaceC6066d interfaceC6066d, C5627a c5627a, InterfaceC5882b<InterfaceC6056a> interfaceC5882b) {
        this(context, Executors.newCachedThreadPool(), c4175c, interfaceC6066d, c5627a, interfaceC5882b, true);
    }

    /* renamed from: d */
    private C4343b m27849d(String str, String str2) {
        return C4343b.m27828b(Executors.newCachedThreadPool(), C4351g.m27813b(this.f11782b, String.format("%s_%s_%s_%s.json", "frc", this.f11788h, str, str2)));
    }

    /* renamed from: h */
    private C4349e m27845h(C4343b c4343b, C4343b c4343b2) {
        return new C4349e(this.f11783c, c4343b, c4343b2);
    }

    /* renamed from: i */
    static C4350f m27844i(Context context, String str, String str2) {
        return new C4350f(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    /* renamed from: j */
    private static C4352h m27843j(C4175c c4175c, String str, InterfaceC5882b<InterfaceC6056a> interfaceC5882b) {
        if (m27841l(c4175c) && str.equals("firebase")) {
            return new C4352h(interfaceC5882b);
        }
        return null;
    }

    /* renamed from: k */
    private static boolean m27842k(C4175c c4175c, String str) {
        return str.equals("firebase") && m27841l(c4175c);
    }

    /* renamed from: l */
    private static boolean m27841l(C4175c c4175c) {
        return c4175c.m28439j().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ InterfaceC6056a m27840m() {
        return null;
    }

    /* renamed from: b */
    synchronized C4339a m27851b(C4175c c4175c, String str, InterfaceC6066d interfaceC6066d, C5627a c5627a, Executor executor, C4343b c4343b, C4343b c4343b2, C4343b c4343b3, C4347d c4347d, C4349e c4349e, C4350f c4350f) {
        if (!this.f11781a.containsKey(str)) {
            C4339a c4339a = new C4339a(this.f11782b, c4175c, interfaceC6066d, m27842k(c4175c, str) ? c5627a : null, executor, c4343b, c4343b2, c4343b3, c4347d, c4349e, c4350f);
            c4339a.m27853a();
            this.f11781a.put(str, c4339a);
        }
        return this.f11781a.get(str);
    }

    /* renamed from: c */
    public synchronized C4339a m27850c(String str) {
        C4343b m27849d;
        C4343b m27849d2;
        C4343b m27849d3;
        C4350f m27844i;
        C4349e m27845h;
        m27849d = m27849d(str, "fetch");
        m27849d2 = m27849d(str, "activate");
        m27849d3 = m27849d(str, "defaults");
        m27844i = m27844i(this.f11782b, this.f11788h, str);
        m27845h = m27845h(m27849d2, m27849d3);
        final C4352h m27843j = m27843j(this.f11784d, str, this.f11787g);
        if (m27843j != null) {
            m27845h.m27816a(new InterfaceC5002c(m27843j) { // from class: qa.a
            });
        }
        return m27851b(this.f11784d, str, this.f11785e, this.f11786f, this.f11783c, m27849d, m27849d2, m27849d3, m27847f(str, m27849d, m27844i), m27845h, m27844i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4339a m27848e() {
        return m27850c("firebase");
    }

    /* renamed from: f */
    synchronized C4347d m27847f(String str, C4343b c4343b, C4350f c4350f) {
        return new C4347d(this.f11785e, m27841l(this.f11784d) ? this.f11787g : C9708b.f25563a, this.f11783c, f11779j, f11780k, c4343b, m27846g(this.f11784d.m28438k().m28182b(), str, c4350f), c4350f, this.f11789i);
    }

    /* renamed from: g */
    ConfigFetchHttpClient m27846g(String str, String str2, C4350f c4350f) {
        return new ConfigFetchHttpClient(this.f11782b, this.f11784d.m28438k().m28181c(), str, str2, c4350f.m27815a(), c4350f.m27815a());
    }

    protected C4341c(Context context, ExecutorService executorService, C4175c c4175c, InterfaceC6066d interfaceC6066d, C5627a c5627a, InterfaceC5882b<InterfaceC6056a> interfaceC5882b, boolean z) {
        this.f11781a = new HashMap();
        this.f11789i = new HashMap();
        this.f11782b = context;
        this.f11783c = executorService;
        this.f11784d = c4175c;
        this.f11785e = interfaceC6066d;
        this.f11786f = c5627a;
        this.f11787g = interfaceC5882b;
        this.f11788h = c4175c.m28438k().m28181c();
        if (z) {
            C3425g.m30767c(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C4341c.this.m27848e();
                }
            });
        }
    }
}
