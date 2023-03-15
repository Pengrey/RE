package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.C1511d;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;
import p004a3.InterfaceC0011a;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0011a<C1507c> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes.dex */
    public static class C1505a {
        /* renamed from: c */
        public static void m36898c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.e
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes.dex */
    public static class C1506b {
        /* renamed from: a */
        public static Handler m36897a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    /* loaded from: classes.dex */
    public static class C1507c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static void m36901l(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: y2.e
            @Override // java.lang.Runnable
            public final void run() {
                C1511d.m36863g(context);
            }
        });
    }

    @Override // p004a3.InterfaceC0011a
    /* renamed from: a */
    public List<Class<? extends InterfaceC0011a<?>>> mo36912a() {
        return Collections.emptyList();
    }

    @Override // p004a3.InterfaceC0011a
    /* renamed from: f */
    public C1507c mo36911b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1507c();
        }
        m36906g(context.getApplicationContext());
        return new C1507c();
    }

    /* renamed from: g */
    void m36906g(final Context context) {
        C1505a.m36898c(new Runnable() { // from class: y2.f
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.this.m36904i(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36904i(final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C1506b.m36897a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: y2.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m36901l(context);
            }
        }, new Random().nextInt(Math.max((int) DateTimeConstants.MILLIS_PER_SECOND, 1)) + 5000);
    }
}
