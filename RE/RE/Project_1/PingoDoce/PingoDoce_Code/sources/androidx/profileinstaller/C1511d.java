package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.profileinstaller.C1511d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p458y2.ExecutorC13073b;

/* renamed from: androidx.profileinstaller.d */
/* loaded from: classes.dex */
public class C1511d {

    /* renamed from: a */
    private static final InterfaceC1514c f4422a = new C1512a();

    /* renamed from: b */
    static final InterfaceC1514c f4423b = new C1513b();

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.d$a */
    /* loaded from: classes.dex */
    class C1512a implements InterfaceC1514c {
        C1512a() {
        }

        @Override // androidx.profileinstaller.C1511d.InterfaceC1514c
        /* renamed from: a */
        public void mo36860a(int i, Object obj) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.d$b */
    /* loaded from: classes.dex */
    class C1513b implements InterfaceC1514c {
        C1513b() {
        }

        @Override // androidx.profileinstaller.C1511d.InterfaceC1514c
        /* renamed from: a */
        public void mo36860a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                default:
                    str = BuildConfig.VERSION_NAME;
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1514c {
        /* renamed from: a */
        void mo36860a(int i, Object obj);
    }

    /* renamed from: b */
    static boolean m36868b(PackageInfo packageInfo, File file, InterfaceC1514c interfaceC1514c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z = readLong == packageInfo.lastUpdateTime;
                if (z) {
                    interfaceC1514c.mo36860a(2, null);
                }
                return z;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: d */
    static void m36866d(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    static void m36865e(Executor executor, final InterfaceC1514c interfaceC1514c, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: y2.c
            @Override // java.lang.Runnable
            public final void run() {
                C1511d.InterfaceC1514c.this.mo36860a(i, obj);
            }
        });
    }

    /* renamed from: f */
    private static void m36864f(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC1514c interfaceC1514c) {
        if (Build.VERSION.SDK_INT < 19) {
            m36865e(executor, interfaceC1514c, 3, null);
            return;
        }
        C1508a c1508a = new C1508a(assetManager, executor, interfaceC1514c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (c1508a.m36893d() && c1508a.m36891f().m36888i().m36887j()) {
            m36866d(packageInfo, file);
        }
    }

    /* renamed from: g */
    public static void m36863g(Context context) {
        m36862h(context, ExecutorC13073b.f33999w, f4422a);
    }

    /* renamed from: h */
    public static void m36862h(Context context, Executor executor, InterfaceC1514c interfaceC1514c) {
        m36861i(context, executor, interfaceC1514c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m36861i(Context context, Executor executor, InterfaceC1514c interfaceC1514c, boolean z) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z || !m36868b(packageInfo, filesDir, interfaceC1514c)) {
                m36864f(assets, packageName, packageInfo, filesDir, name, executor, interfaceC1514c);
            }
        } catch (PackageManager.NameNotFoundException e) {
            interfaceC1514c.mo36860a(7, e);
        }
    }
}
