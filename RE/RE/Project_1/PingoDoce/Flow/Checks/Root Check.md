![[Pasted image 20230323150549.png]]

The root check is being made with the help of [RootBeer](https://github.com/scottyab/rootbeer)

The check is being called on the class m:
```java
    @Override // ai.n
    public void a() {
        if (this.f323c.o()) {
            new b.a(this.f321a, 2131951632).p(R.string.alert_device_has_root_title).g(R.string.alert_device_has_root_message).i(g() ? R.string.alert_device_has_root_exit : R.string.alert_device_has_root_exit_alt, new DialogInterface.OnClickListener() { // from class: ai.l
                {
                    m.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    m.e(m.this, dialogInterface, i10);
                }
            }).d(false).a().show();
        }
        <SNIP>
    }
```

The first check invokes the root beer check:
```java
package nc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* compiled from: RootBeer.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16455a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16456b = true;

    public b(Context context) {
        this.f16455a = context;
    }

    private boolean m(List<String> list) {
        PackageManager packageManager = this.f16455a.getPackageManager();
        boolean z10 = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                oc.a.b(str + " ROOT management app detected!");
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }

    private String[] p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            oc.a.a(e10);
            return null;
        }
    }

    private String[] q() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e10) {
            oc.a.a(e10);
            return null;
        }
    }

    public boolean a() {
        return new RootBeerNative().a();
    }

    public boolean b(String str) {
        String[] a10;
        boolean z10 = false;
        for (String str2 : a.a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                oc.a.f(str3 + " binary detected!");
                z10 = true;
            }
        }
        return z10;
    }

    public boolean c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] q10 = q();
        if (q10 == null) {
            return false;
        }
        boolean z10 = false;
        for (String str : q10) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        oc.a.f(str2 + " = " + str3 + " detected!");
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    public boolean d() {
        return b("magisk");
    }

    public boolean e() {
        String str;
        String str2;
        String[] strArr;
        String[] p10 = p();
        int i10 = 0;
        if (p10 == null) {
            return false;
        }
        int i11 = Build.VERSION.SDK_INT;
        int length = p10.length;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < length) {
            String str3 = p10[i12];
            String[] split = str3.split(" ");
            int i13 = 23;
            if ((i11 <= 23 && split.length < 4) || (i11 > 23 && split.length < 6)) {
                oc.a.b("Error formatting mount line: " + str3);
            } else {
                if (i11 > 23) {
                    str = split[2];
                    str2 = split[5];
                } else {
                    str = split[1];
                    str2 = split[3];
                }
                String[] strArr2 = a.f16454d;
                int length2 = strArr2.length;
                int i14 = i10;
                while (i14 < length2) {
                    String str4 = strArr2[i14];
                    if (str.equalsIgnoreCase(str4)) {
                        if (Build.VERSION.SDK_INT > i13) {
                            str2 = str2.replace("(", BuildConfig.VERSION_NAME).replace(")", BuildConfig.VERSION_NAME);
                        }
                        String[] split2 = str2.split(",");
                        int length3 = split2.length;
                        int i15 = 0;
                        while (i15 < length3) {
                            strArr = p10;
                            if (split2[i15].equalsIgnoreCase("rw")) {
                                oc.a.f(str4 + " path is mounted with rw permissions! " + str3);
                                z10 = true;
                                break;
                            }
                            i15++;
                            p10 = strArr;
                        }
                    }
                    strArr = p10;
                    i14++;
                    p10 = strArr;
                    i13 = 23;
                }
            }
            i12++;
            p10 = p10;
            i10 = 0;
        }
        return z10;
    }

    public boolean f() {
        String[] a10;
        if (!a()) {
            oc.a.b("We could not load the native library to test for root");
            return false;
        }
        int length = a.a().length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = a10[i10] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f16456b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public boolean g() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z10 = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z10;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    public boolean h() {
        return i(null);
    }

    public boolean i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(a.f16452b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m(arrayList);
    }

    public boolean j() {
        return k(null);
    }

    public boolean k(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(a.f16451a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m(arrayList);
    }

    public boolean l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public boolean n() {
        return j() || h() || b("su") || c() || e() || l() || g() || f() || d();
    }

    @Deprecated
    public boolean o() {
        return n();
    }

    public void r(boolean z10) {
        this.f16456b = z10;
        oc.a.f16979a = z10 ? 5 : 0;
    }
}
```

the application uses the RootBeer check and if the root check fails or the VM check fails a dedicated message will be displayed: `"alert_device_has_root_title" : "Dispositivo não seguro"`