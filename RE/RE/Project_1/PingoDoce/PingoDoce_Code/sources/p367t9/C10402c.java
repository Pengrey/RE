package p367t9;

import android.content.Context;
import com.google.android.datatransport.cct.C2383a;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.firebase.crashlytics.internal.common.AbstractC4228o;
import java.nio.charset.Charset;
import p007a6.C0062t;
import p294p9.AbstractC8472a0;
import p311q9.C9705g;
import p461y5.AbstractC13112c;
import p461y5.C13111b;
import p461y5.InterfaceC13114e;
import p461y5.InterfaceC13115f;
import p461y5.InterfaceC13116g;
import p461y5.InterfaceC13117h;

/* renamed from: t9.c */
/* loaded from: classes.dex */
public class C10402c {

    /* renamed from: b */
    private static final C9705g f27039b = new C9705g();

    /* renamed from: c */
    private static final String f27040c = m8064f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f27041d = m8064f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final InterfaceC13114e<AbstractC8472a0, byte[]> f27042e = C10400a.f27036a;

    /* renamed from: a */
    private final InterfaceC13115f<AbstractC8472a0> f27043a;

    C10402c(InterfaceC13115f<AbstractC8472a0> interfaceC13115f, InterfaceC13114e<AbstractC8472a0, byte[]> interfaceC13114e) {
        this.f27043a = interfaceC13115f;
    }

    /* renamed from: c */
    public static C10402c m8067c(Context context) {
        C0062t.m42028f(context);
        InterfaceC13116g m42027g = C0062t.m42031c().m42027g(new C2383a(f27040c, f27041d));
        C13111b m1584b = C13111b.m1584b("json");
        InterfaceC13114e<AbstractC8472a0, byte[]> interfaceC13114e = f27042e;
        return new C10402c(m42027g.mo1575a("FIREBASE_CRASHLYTICS_REPORT", AbstractC8472a0.class, m1584b, interfaceC13114e), interfaceC13114e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m8066d(C3421e c3421e, AbstractC4228o abstractC4228o, Exception exc) {
        if (exc != null) {
            c3421e.m30799d(exc);
        } else {
            c3421e.m30798e(abstractC4228o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ byte[] m8065e(AbstractC8472a0 abstractC8472a0) {
        return f27039b.m10182E(abstractC8472a0).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: f */
    private static String m8064f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb2.append(str.charAt(i));
                if (str2.length() > i) {
                    sb2.append(str2.charAt(i));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    /* renamed from: g */
    public AbstractC3419d<AbstractC4228o> m8063g(final AbstractC4228o abstractC4228o) {
        AbstractC8472a0 mo28229b = abstractC4228o.mo28229b();
        final C3421e c3421e = new C3421e();
        this.f27043a.mo1577a(AbstractC13112c.m1579e(mo28229b), new InterfaceC13117h() { // from class: t9.b
            @Override // p461y5.InterfaceC13117h
            /* renamed from: a */
            public final void mo1574a(Exception exc) {
                C10402c.m8066d(C3421e.this, abstractC4228o, exc);
            }
        });
        return c3421e.m30802a();
    }
}
