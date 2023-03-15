package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p294p9.AbstractC8472a0;
import p294p9.C8516b0;
import p442x9.C12330e;
import p442x9.InterfaceC12329d;

/* renamed from: com.google.firebase.crashlytics.internal.common.n */
/* loaded from: classes.dex */
public class C4227n {

    /* renamed from: e */
    private static final Map<String, Integer> f11523e;

    /* renamed from: f */
    static final String f11524f;

    /* renamed from: a */
    private final Context f11525a;

    /* renamed from: b */
    private final C4239v f11526b;

    /* renamed from: c */
    private final C4184a f11527c;

    /* renamed from: d */
    private final InterfaceC12329d f11528d;

    static {
        HashMap hashMap = new HashMap();
        f11523e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f11524f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.8");
    }

    public C4227n(Context context, C4239v c4239v, C4184a c4184a, InterfaceC12329d interfaceC12329d) {
        this.f11525a = context;
        this.f11526b = c4239v;
        this.f11527c = c4184a;
        this.f11528d = interfaceC12329d;
    }

    /* renamed from: a */
    private AbstractC8472a0.AbstractC8475b m28254a() {
        return AbstractC8472a0.m15364b().mo15319h("18.2.8").mo15323d(this.f11527c.f11419a).mo15322e(this.f11526b.mo28195a()).mo15325b(this.f11527c.f11423e).mo15324c(this.f11527c.f11424f).mo15320g(4);
    }

    /* renamed from: e */
    private static int m28250e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f11523e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: f */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a m28249f() {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a.m15346a().mo15181b(0L).mo15179d(0L).mo15180c(this.f11527c.f11422d).mo15178e(this.f11527c.f11420b).mo15182a();
    }

    /* renamed from: g */
    private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8493a> m28248g() {
        return C8516b0.m15316f(m28249f());
    }

    /* renamed from: h */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a m28247h(int i, AbstractC8472a0.AbstractC8473a abstractC8473a) {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.m15348a().mo15202b(Boolean.valueOf(abstractC8473a.mo15315b() != 100)).mo15198f(i).mo15200d(m28242m(abstractC8473a)).mo15203a();
    }

    /* renamed from: i */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a m28246i(int i, C12330e c12330e, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo m28368j = C4196g.m28368j(this.f11527c.f11422d, this.f11525a);
        if (m28368j != null) {
            bool = Boolean.valueOf(m28368j.importance != 100);
        } else {
            bool = null;
        }
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.m15348a().mo15202b(bool).mo15198f(i).mo15200d(m28241n(c12330e, thread, i2, i3, z)).mo15203a();
    }

    /* renamed from: j */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c m28245j(int i) {
        C4190d m28390a = C4190d.m28390a(this.f11525a);
        Float m28389b = m28390a.m28389b();
        Double valueOf = m28389b != null ? Double.valueOf(m28389b.doubleValue()) : null;
        int m28388c = m28390a.m28388c();
        boolean m28363o = C4196g.m28363o(this.f11525a);
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8505c.m15339a().mo15134b(valueOf).mo15133c(m28388c).mo15130f(m28363o).mo15131e(i).mo15129g(C4196g.m28359s() - C4196g.m28377a(this.f11525a)).mo15132d(C4196g.m28376b(Environment.getDataDirectory().getPath())).mo15135a();
    }

    /* renamed from: k */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c m28244k(C12330e c12330e, int i, int i2) {
        return m28243l(c12330e, i, i2, 0);
    }

    /* renamed from: l */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c m28243l(C12330e c12330e, int i, int i2, int i3) {
        String str = c12330e.f32486b;
        String str2 = c12330e.f32485a;
        StackTraceElement[] stackTraceElementArr = c12330e.f32487c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C12330e c12330e2 = c12330e.f32488d;
        if (i3 >= i2) {
            C12330e c12330e3 = c12330e2;
            while (c12330e3 != null) {
                c12330e3 = c12330e3.f32488d;
                i4++;
            }
        }
        AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.AbstractC8497a mo15169d = AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8496c.m15343a().mo15167f(str).mo15168e(str2).mo15170c(C8516b0.m15317b(m28239p(stackTraceElementArr, i))).mo15169d(i4);
        if (c12330e2 != null && i4 == 0) {
            mo15169d.mo15171b(m28243l(c12330e2, i, i2, i3 + 1));
        }
        return mo15169d.mo15172a();
    }

    /* renamed from: m */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b m28242m(AbstractC8472a0.AbstractC8473a abstractC8473a) {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.m15347a().mo15191b(abstractC8473a).mo15188e(m28234u()).mo15190c(m28248g()).mo15192a();
    }

    /* renamed from: n */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b m28241n(C12330e c12330e, Thread thread, int i, int i2, boolean z) {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.m15347a().mo15187f(m28231x(c12330e, thread, i, z)).mo15189d(m28244k(c12330e, i, i2)).mo15188e(m28234u()).mo15190c(m28248g()).mo15192a();
    }

    /* renamed from: o */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b m28240o(StackTraceElement stackTraceElement, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.AbstractC8503a abstractC8503a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        return abstractC8503a.mo15143e(max).mo15142f(str).mo15146b(fileName).mo15144d(j).mo15147a();
    }

    /* renamed from: p */
    private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b> m28239p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m28240o(stackTraceElement, AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.AbstractC8502b.m15340a().mo15145c(i)));
        }
        return C8516b0.m15317b(arrayList);
    }

    /* renamed from: q */
    private AbstractC8472a0.AbstractC8482e.AbstractC8483a m28238q() {
        return AbstractC8472a0.AbstractC8482e.AbstractC8483a.m15352a().mo15244e(this.f11526b.m28203f()).mo15242g(this.f11527c.f11423e).mo15245d(this.f11527c.f11424f).mo15243f(this.f11526b.mo28195a()).mo15247b(this.f11527c.f11425g.m19621d()).mo15246c(this.f11527c.f11425g.m19620e()).mo15248a();
    }

    /* renamed from: r */
    private AbstractC8472a0.AbstractC8482e m28237r(String str, long j) {
        return AbstractC8472a0.AbstractC8482e.m15356a().mo15257l(j).mo15259i(str).mo15261g(f11524f).mo15266b(m28238q()).mo15258k(m28235t()).mo15264d(m28236s()).mo15260h(3).mo15267a();
    }

    /* renamed from: s */
    private AbstractC8472a0.AbstractC8482e.AbstractC8487c m28236s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m28250e = m28250e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m28359s = C4196g.m28359s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m28354x = C4196g.m28354x(this.f11525a);
        int m28365m = C4196g.m28365m(this.f11525a);
        String str = Build.MANUFACTURER;
        return AbstractC8472a0.AbstractC8482e.AbstractC8487c.m15350a().mo15230b(m28250e).mo15226f(Build.MODEL).mo15229c(availableProcessors).mo15224h(m28359s).mo15228d(blockCount).mo15223i(m28354x).mo15222j(m28365m).mo15227e(str).mo15225g(Build.PRODUCT).mo15231a();
    }

    /* renamed from: t */
    private AbstractC8472a0.AbstractC8482e.AbstractC8509e m28235t() {
        return AbstractC8472a0.AbstractC8482e.AbstractC8509e.m15337a().mo15118d(3).mo15117e(Build.VERSION.RELEASE).mo15120b(Build.VERSION.CODENAME).mo15119c(C4196g.m28353y(this.f11525a)).mo15121a();
    }

    /* renamed from: u */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d m28234u() {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8498d.m15342a().mo15160d("0").mo15161c("0").mo15162b(0L).mo15163a();
    }

    /* renamed from: v */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e m28233v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m28232w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e m28232w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e.m15341a().mo15153d(thread.getName()).mo15154c(i).mo15155b(C8516b0.m15317b(m28239p(stackTraceElementArr, i))).mo15156a();
    }

    /* renamed from: x */
    private C8516b0<AbstractC8472a0.AbstractC8482e.AbstractC8489d.AbstractC8490a.AbstractC8492b.AbstractC8500e> m28231x(C12330e c12330e, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m28232w(thread, c12330e.f32487c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m28233v(key, this.f11528d.mo3060a(entry.getValue())));
                }
            }
        }
        return C8516b0.m15317b(arrayList);
    }

    /* renamed from: b */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d m28253b(AbstractC8472a0.AbstractC8473a abstractC8473a) {
        int i = this.f11525a.getResources().getConfiguration().orientation;
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.m15349a().mo15210f("anr").mo15211e(abstractC8473a.mo15309h()).mo15214b(m28247h(i, abstractC8473a)).mo15213c(m28245j(i)).mo15215a();
    }

    /* renamed from: c */
    public AbstractC8472a0.AbstractC8482e.AbstractC8489d m28252c(Throwable th2, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f11525a.getResources().getConfiguration().orientation;
        return AbstractC8472a0.AbstractC8482e.AbstractC8489d.m15349a().mo15210f(str).mo15211e(j).mo15214b(m28246i(i3, new C12330e(th2, this.f11528d), thread, i, i2, z)).mo15213c(m28245j(i3)).mo15215a();
    }

    /* renamed from: d */
    public AbstractC8472a0 m28251d(String str, long j) {
        return m28254a().mo15318i(m28237r(str, j)).mo15326a();
    }
}
