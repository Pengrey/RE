package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC4292g {

    /* renamed from: B */
    private static final Queue<String> f11625B = new ArrayDeque(10);

    /* renamed from: j */
    private boolean m28098j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f11625B;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* renamed from: k */
    private void m28097k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C4301i0.m27950t(extras)) {
            C4301i0 c4301i0 = new C4301i0(extras);
            ExecutorService m27925c = C4310n.m27925c();
            try {
                if (new C4279c(this, c4301i0, m27925c).m28047a()) {
                    return;
                }
                m27925c.shutdown();
                if (C4294g0.m28014A(intent)) {
                    C4294g0.m27993t(intent);
                }
            } finally {
                m27925c.shutdown();
            }
        }
        mo28093o(new RemoteMessage(extras));
    }

    /* renamed from: l */
    private String m28096l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: m */
    private void m28095m(Intent intent) {
        if (m28098j(intent.getStringExtra("google.message_id"))) {
            return;
        }
        m28089s(intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: s */
    private void m28089s(Intent intent) {
        char c;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            C4294g0.m27991v(intent);
            m28097k(intent);
        } else if (c == 1) {
            m28094n();
        } else if (c == 2) {
            m28092p(intent.getStringExtra("google.message_id"));
        } else if (c != 3) {
            Log.w("FirebaseMessaging", stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
        } else {
            m28090r(m28096l(intent), new SendException(intent.getStringExtra("error")));
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC4292g
    /* renamed from: c */
    protected Intent mo28022c(Intent intent) {
        return C4320r0.m27916b().m27915c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC4292g
    /* renamed from: d */
    public void mo28021d(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo28091q(intent.getStringExtra("token"));
                return;
            }
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
            return;
        }
        m28095m(intent);
    }

    /* renamed from: n */
    public void m28094n() {
    }

    /* renamed from: o */
    public void mo28093o(RemoteMessage remoteMessage) {
    }

    /* renamed from: p */
    public void m28092p(String str) {
    }

    /* renamed from: q */
    public void mo28091q(String str) {
    }

    /* renamed from: r */
    public void m28090r(String str, Exception exc) {
    }
}
