package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.C2442b;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p079e8.InterfaceC5016c;
import p267o7.C8027a;
import p301q.C9558g;
import p417w6.C11575f;
import p417w6.ExecutorC11578i;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.b */
/* loaded from: classes.dex */
public class C2442b {

    /* renamed from: h */
    private static int f7096h;

    /* renamed from: i */
    private static PendingIntent f7097i;

    /* renamed from: j */
    private static final Executor f7098j = ExecutorC11578i.f29630w;

    /* renamed from: k */
    private static final Pattern f7099k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f7101b;

    /* renamed from: c */
    private final C2458r f7102c;

    /* renamed from: d */
    private final ScheduledExecutorService f7103d;

    /* renamed from: f */
    private Messenger f7105f;

    /* renamed from: g */
    private zzd f7106g;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    private final C9558g<String, C3421e<Bundle>> f7100a = new C9558g<>();

    /* renamed from: e */
    private Messenger f7104e = new Messenger(new HandlerC2443c(this, Looper.getMainLooper()));

    public C2442b(Context context) {
        this.f7101b = context;
        this.f7102c = new C2458r(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7103d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC3419d m33556b(Bundle bundle) throws Exception {
        if (m33548j(bundle)) {
            return C3425g.m30765e(null);
        }
        return C3425g.m30765e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m33554d(C2442b c2442b, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2445e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c2442b.f7106g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c2442b.f7105f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        Log.w("Rpc", sb2.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            c2442b.m33549i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    synchronized (c2442b.f7100a) {
                        for (int i = 0; i < c2442b.f7100a.size(); i++) {
                            c2442b.m33549i(c2442b.f7100a.m10614m(i), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f7099k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c2442b.m33549i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final AbstractC3419d<Bundle> m33552f(Bundle bundle) {
        final String m33551g = m33551g();
        final C3421e<Bundle> c3421e = new C3421e<>();
        synchronized (this.f7100a) {
            this.f7100a.put(m33551g, c3421e);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f7102c.m33527b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m33550h(this.f7101b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m33551g).length() + 5);
        sb2.append("|ID|");
        sb2.append(m33551g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f7104e);
        if (this.f7105f != null || this.f7106g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f7105f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f7106g.m33525b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f7103d.schedule(new Runnable() { // from class: w6.h
                @Override // java.lang.Runnable
                public final void run() {
                    if (C3421e.this.m30799d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c3421e.m30802a().mo30793c(f7098j, new InterfaceC5016c() { // from class: w6.g
                @Override // p079e8.InterfaceC5016c
                /* renamed from: a */
                public final void mo4683a(AbstractC3419d abstractC3419d) {
                    C2442b.this.m33553e(m33551g, schedule, abstractC3419d);
                }
            });
            return c3421e.m30802a();
        }
        if (this.f7102c.m33527b() == 2) {
            this.f7101b.sendBroadcast(intent);
        } else {
            this.f7101b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f7103d.schedule(new Runnable() { // from class: w6.h
            @Override // java.lang.Runnable
            public final void run() {
                if (C3421e.this.m30799d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c3421e.m30802a().mo30793c(f7098j, new InterfaceC5016c() { // from class: w6.g
            @Override // p079e8.InterfaceC5016c
            /* renamed from: a */
            public final void mo4683a(AbstractC3419d abstractC3419d) {
                C2442b.this.m33553e(m33551g, schedule2, abstractC3419d);
            }
        });
        return c3421e.m30802a();
    }

    /* renamed from: g */
    private static synchronized String m33551g() {
        String num;
        synchronized (C2442b.class) {
            int i = f7096h;
            f7096h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m33550h(Context context, Intent intent) {
        synchronized (C2442b.class) {
            if (f7097i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f7097i = C8027a.m17127a(context, 0, intent2, C8027a.f20770a);
            }
            intent.putExtra("app", f7097i);
        }
    }

    /* renamed from: i */
    private final void m33549i(String str, Bundle bundle) {
        synchronized (this.f7100a) {
            C3421e<Bundle> remove = this.f7100a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.m30800c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m33548j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: a */
    public AbstractC3419d<Bundle> m33557a(final Bundle bundle) {
        if (this.f7102c.m33528a() < 12000000) {
            if (this.f7102c.m33527b() != 0) {
                return m33552f(bundle).mo30786j(f7098j, new InterfaceC3415b() { // from class: w6.e
                    @Override // com.google.android.gms.tasks.InterfaceC3415b
                    /* renamed from: a */
                    public final Object mo4684a(AbstractC3419d abstractC3419d) {
                        return C2442b.this.m33555c(bundle, abstractC3419d);
                    }
                });
            }
            return C3425g.m30766d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C2457q.m33534b(this.f7101b).m33532d(1, bundle).mo30788h(f7098j, C11575f.f29625a);
    }

    /* renamed from: c */
    public final /* synthetic */ AbstractC3419d m33555c(Bundle bundle, AbstractC3419d abstractC3419d) throws Exception {
        return (abstractC3419d.mo30780p() && m33548j((Bundle) abstractC3419d.mo30784l())) ? m33552f(bundle).mo30778r(f7098j, C2459s.f7136a) : abstractC3419d;
    }

    /* renamed from: e */
    public final /* synthetic */ void m33553e(String str, ScheduledFuture scheduledFuture, AbstractC3419d abstractC3419d) {
        synchronized (this.f7100a) {
            this.f7100a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
