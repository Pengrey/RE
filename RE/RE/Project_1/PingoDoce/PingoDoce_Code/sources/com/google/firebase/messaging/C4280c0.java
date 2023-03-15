package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.C2442b;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import com.google.firebase.C4175c;
import com.google.firebase.installations.AbstractC4264f;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p102fa.InterfaceC5439f;
import p136ha.InterfaceC5882b;
import p158ia.InterfaceC6066d;
import pa.InterfaceC8592i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.c0 */
/* loaded from: classes.dex */
public class C4280c0 {

    /* renamed from: a */
    private final C4175c f11654a;

    /* renamed from: b */
    private final C4297h0 f11655b;

    /* renamed from: c */
    private final C2442b f11656c;

    /* renamed from: d */
    private final InterfaceC5882b<InterfaceC8592i> f11657d;

    /* renamed from: e */
    private final InterfaceC5882b<InterfaceC5439f> f11658e;

    /* renamed from: f */
    private final InterfaceC6066d f11659f;

    C4280c0(C4175c c4175c, C4297h0 c4297h0, C2442b c2442b, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2, InterfaceC6066d interfaceC6066d) {
        this.f11654a = c4175c;
        this.f11655b = c4297h0;
        this.f11656c = c2442b;
        this.f11657d = interfaceC5882b;
        this.f11658e = interfaceC5882b2;
        this.f11659f = interfaceC6066d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4280c0(C4175c c4175c, C4297h0 c4297h0, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2, InterfaceC6066d interfaceC6066d) {
        this(c4175c, c4297h0, new C2442b(c4175c.m28441h()), interfaceC5882b, interfaceC5882b2, interfaceC6066d);
    }

    /* renamed from: a */
    private static String m28042a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    private AbstractC3419d<String> m28041b(AbstractC3419d<Bundle> abstractC3419d) {
        return abstractC3419d.mo30788h(ExecutorC4277b0.f11647w, new InterfaceC3415b() { // from class: com.google.firebase.messaging.a0
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d2) {
                return C4280c0.this.m28036g(abstractC3419d2);
            }
        });
    }

    /* renamed from: c */
    private String m28040c() {
        try {
            return m28042a(MessageDigest.getInstance("SHA-1").digest(this.f11654a.m28439j().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: e */
    private String m28038e(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String obj = bundle.toString();
            Log.w("FirebaseMessaging", "Unexpected response: ".concat(obj), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m28037f(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* renamed from: h */
    private void m28035h(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        InterfaceC5439f.EnumC5440a mo24359a;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f11654a.m28438k().m28181c());
        bundle.putString("gmsv", Integer.toString(this.f11655b.m27983d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11655b.m27986a());
        bundle.putString("app_ver_name", this.f11655b.m27985b());
        bundle.putString("firebase-app-name-hash", m28040c());
        try {
            String mo28146b = ((AbstractC4264f) C3425g.m30769a(this.f11659f.mo22290a(false))).mo28146b();
            if (!TextUtils.isEmpty(mo28146b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo28146b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C3425g.m30769a(this.f11659f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        InterfaceC5439f interfaceC5439f = this.f11658e.get();
        InterfaceC8592i interfaceC8592i = this.f11657d.get();
        if (interfaceC5439f == null || interfaceC8592i == null || (mo24359a = interfaceC5439f.mo24359a("fire-iid")) == InterfaceC5439f.EnumC5440a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo24359a.getCode()));
        bundle.putString("Firebase-Client", interfaceC8592i.mo15077a());
    }

    /* renamed from: i */
    private AbstractC3419d<Bundle> m28034i(String str, String str2, Bundle bundle) {
        try {
            m28035h(str, str2, bundle);
            return this.f11656c.m33557a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C3425g.m30766d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AbstractC3419d<String> m28039d() {
        return m28041b(m28034i(C4297h0.m27984c(this.f11654a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public /* synthetic */ String m28036g(AbstractC3419d abstractC3419d) throws Exception {
        return m28038e((Bundle) abstractC3419d.mo30783m(IOException.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public AbstractC3419d<?> m28033j(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str2);
        return m28041b(m28034i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public AbstractC3419d<?> m28032k(String str, String str2) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str2);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str2);
        return m28041b(m28034i(str, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
