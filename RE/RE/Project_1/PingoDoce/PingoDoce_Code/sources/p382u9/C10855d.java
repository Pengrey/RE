package p382u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3417c;
import com.google.firebase.crashlytics.internal.common.C4191d0;
import com.google.firebase.crashlytics.internal.common.C4196g;
import com.google.firebase.crashlytics.internal.common.C4232r;
import com.google.firebase.crashlytics.internal.common.C4239v;
import com.google.firebase.crashlytics.internal.common.EnumC4233s;
import com.google.firebase.crashlytics.internal.common.InterfaceC4231q;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p219l9.C7011f;
import p333r9.C9828b;
import p355s9.C10098f;
import p402v9.C11165a;
import p402v9.C11169e;
import p402v9.C11170f;
import p402v9.InterfaceC11168d;
import p420w9.C11603a;
import p420w9.InterfaceC11604b;

/* renamed from: u9.d */
/* loaded from: classes.dex */
public class C10855d implements InterfaceC10857e {

    /* renamed from: a */
    private final Context f28054a;

    /* renamed from: b */
    private final C11170f f28055b;

    /* renamed from: c */
    private final C10858f f28056c;

    /* renamed from: d */
    private final InterfaceC4231q f28057d;

    /* renamed from: e */
    private final C10852a f28058e;

    /* renamed from: f */
    private final InterfaceC11604b f28059f;

    /* renamed from: g */
    private final C4232r f28060g;

    /* renamed from: h */
    private final AtomicReference<InterfaceC11168d> f28061h;

    /* renamed from: i */
    private final AtomicReference<C3421e<C11165a>> f28062i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsController.java */
    /* renamed from: u9.d$a */
    /* loaded from: classes.dex */
    public class C10856a implements InterfaceC3417c<Void, Void> {
        C10856a() {
        }

        @Override // com.google.android.gms.tasks.InterfaceC3417c
        /* renamed from: b */
        public AbstractC3419d<Void> mo6853a(Void r5) throws Exception {
            JSONObject mo4632a = C10855d.this.f28059f.mo4632a(C10855d.this.f28055b, true);
            if (mo4632a != null) {
                C11169e m6848b = C10855d.this.f28056c.m6848b(mo4632a);
                C10855d.this.f28058e.m6875c(m6848b.m5831d(), mo4632a);
                C10855d.this.m6855q(mo4632a, "Loaded settings: ");
                C10855d c10855d = C10855d.this;
                c10855d.m6854r(c10855d.f28055b.f28704f);
                C10855d.this.f28061h.set(m6848b);
                ((C3421e) C10855d.this.f28062i.get()).m30798e(m6848b.m5832c());
                C3421e c3421e = new C3421e();
                c3421e.m30798e(m6848b.m5832c());
                C10855d.this.f28062i.set(c3421e);
            }
            return C3425g.m30765e(null);
        }
    }

    C10855d(Context context, C11170f c11170f, InterfaceC4231q interfaceC4231q, C10858f c10858f, C10852a c10852a, InterfaceC11604b interfaceC11604b, C4232r c4232r) {
        AtomicReference<InterfaceC11168d> atomicReference = new AtomicReference<>();
        this.f28061h = atomicReference;
        this.f28062i = new AtomicReference<>(new C3421e());
        this.f28054a = context;
        this.f28055b = c11170f;
        this.f28057d = interfaceC4231q;
        this.f28056c = c10858f;
        this.f28058e = c10852a;
        this.f28059f = interfaceC11604b;
        this.f28060g = c4232r;
        atomicReference.set(C10853b.m6871e(interfaceC4231q));
    }

    /* renamed from: l */
    public static C10855d m6860l(Context context, String str, C4239v c4239v, C9828b c9828b, String str2, String str3, C10098f c10098f, C4232r c4232r) {
        String m28202g = c4239v.m28202g();
        C4191d0 c4191d0 = new C4191d0();
        return new C10855d(context, new C11170f(str, c4239v.m28201h(), c4239v.m28200i(), c4239v.m28199j(), c4239v, C4196g.m28370h(C4196g.m28364n(context), str, str3, str2), str3, str2, EnumC4233s.determineFrom(m28202g).getId()), c4191d0, new C10858f(c4191d0), new C10852a(c10098f), new C11603a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c9828b), c4232r);
    }

    /* renamed from: m */
    private C11169e m6859m(EnumC10854c enumC10854c) {
        C11169e c11169e = null;
        try {
            if (!EnumC10854c.SKIP_CACHE_LOOKUP.equals(enumC10854c)) {
                JSONObject m6876b = this.f28058e.m6876b();
                if (m6876b != null) {
                    C11169e m6848b = this.f28056c.m6848b(m6876b);
                    if (m6848b != null) {
                        m6855q(m6876b, "Loaded cached settings: ");
                        long mo28223a = this.f28057d.mo28223a();
                        if (!EnumC10854c.IGNORE_CACHE_EXPIRATION.equals(enumC10854c) && m6848b.m5830e(mo28223a)) {
                            C7011f.m19611f().m19608i("Cached settings have expired.");
                        }
                        try {
                            C7011f.m19611f().m19608i("Returning cached settings.");
                            c11169e = m6848b;
                        } catch (Exception e) {
                            e = e;
                            c11169e = m6848b;
                            C7011f.m19611f().m19612e("Failed to get cached settings", e);
                            return c11169e;
                        }
                    } else {
                        C7011f.m19611f().m19612e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C7011f.m19611f().m19615b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return c11169e;
    }

    /* renamed from: n */
    private String m6858n() {
        return C4196g.m28360r(this.f28054a).getString("existing_instance_identifier", BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m6855q(JSONObject jSONObject, String str) throws JSONException {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19615b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m6854r(String str) {
        SharedPreferences.Editor edit = C4196g.m28360r(this.f28054a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // p382u9.InterfaceC10857e
    /* renamed from: a */
    public AbstractC3419d<C11165a> mo6851a() {
        return this.f28062i.get().m30802a();
    }

    @Override // p382u9.InterfaceC10857e
    /* renamed from: b */
    public InterfaceC11168d mo6850b() {
        return this.f28061h.get();
    }

    /* renamed from: k */
    boolean m6861k() {
        return !m6858n().equals(this.f28055b.f28704f);
    }

    /* renamed from: o */
    public AbstractC3419d<Void> m6857o(Executor executor) {
        return m6856p(EnumC10854c.USE_CACHE, executor);
    }

    /* renamed from: p */
    public AbstractC3419d<Void> m6856p(EnumC10854c enumC10854c, Executor executor) {
        C11169e m6859m;
        if (!m6861k() && (m6859m = m6859m(enumC10854c)) != null) {
            this.f28061h.set(m6859m);
            this.f28062i.get().m30798e(m6859m.m5832c());
            return C3425g.m30765e(null);
        }
        C11169e m6859m2 = m6859m(EnumC10854c.IGNORE_CACHE_EXPIRATION);
        if (m6859m2 != null) {
            this.f28061h.set(m6859m2);
            this.f28062i.get().m30798e(m6859m2.m5832c());
        }
        return this.f28060g.m28215h(executor).mo30778r(executor, new C10856a());
    }
}
