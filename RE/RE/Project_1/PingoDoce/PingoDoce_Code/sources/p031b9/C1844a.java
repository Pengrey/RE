package p031b9;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: b9.a */
/* loaded from: classes.dex */
public final class C1844a {

    /* renamed from: a */
    private final String f5557a;

    public C1844a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        String valueOf = String.valueOf(sb2.toString());
        String valueOf2 = String.valueOf(str);
        this.f5557a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private final int m35282a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m35281b(this.f5557a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static String m35281b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb2.append(str2);
                sb2.append(" [");
                sb2.append(join);
                sb2.append("]");
                str2 = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb3.append(str);
        sb3.append(" : ");
        sb3.append(str2);
        return sb3.toString();
    }

    /* renamed from: c */
    public final void m35280c(String str, Object... objArr) {
        m35282a(3, str, objArr);
    }

    /* renamed from: d */
    public final void m35279d(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m35281b(this.f5557a, str, objArr), th2);
        }
    }

    /* renamed from: e */
    public final void m35278e(String str, Object... objArr) {
        m35282a(6, str, objArr);
    }

    /* renamed from: f */
    public final void m35277f(String str, Object... objArr) {
        m35282a(4, str, objArr);
    }

    /* renamed from: g */
    public final void m35276g(String str, Object... objArr) {
        m35282a(5, str, objArr);
    }
}
