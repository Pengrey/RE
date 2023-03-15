package p043c7;

import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Locale;
import p484z6.C13699b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: c7.a */
/* loaded from: classes.dex */
public class C2093a {

    /* renamed from: a */
    private final String f6076a;

    /* renamed from: b */
    private final String f6077b;

    /* renamed from: c */
    private final int f6078c;

    public C2093a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = BuildConfig.VERSION_NAME;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f6077b = sb2;
        this.f6076a = str;
        new C13699b(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f6076a, i)) {
            i++;
        }
        this.f6078c = i;
    }

    /* renamed from: a */
    public void m34698a(String str, Object... objArr) {
        if (m34695d(3)) {
            Log.d(this.f6076a, m34696c(str, objArr));
        }
    }

    /* renamed from: b */
    public void m34697b(String str, Object... objArr) {
        Log.e(this.f6076a, m34696c(str, objArr));
    }

    /* renamed from: c */
    protected String m34696c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f6077b.concat(str);
    }

    /* renamed from: d */
    public boolean m34695d(int i) {
        return this.f6078c <= i;
    }
}
