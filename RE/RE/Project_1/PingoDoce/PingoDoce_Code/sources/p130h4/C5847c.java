package p130h4;

import android.util.Log;
import com.airbnb.lottie.C2199c;
import com.airbnb.lottie.InterfaceC2228i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: h4.c */
/* loaded from: classes.dex */
public class C5847c implements InterfaceC2228i {

    /* renamed from: a */
    private static final Set<String> f16256a = new HashSet();

    @Override // com.airbnb.lottie.InterfaceC2228i
    /* renamed from: a */
    public void mo22936a(String str, Throwable th2) {
        Set<String> set = f16256a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    @Override // com.airbnb.lottie.InterfaceC2228i
    /* renamed from: b */
    public void mo22935b(String str) {
        mo22936a(str, null);
    }

    @Override // com.airbnb.lottie.InterfaceC2228i
    /* renamed from: c */
    public void mo22934c(String str, Throwable th2) {
        if (C2199c.f6354a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // com.airbnb.lottie.InterfaceC2228i
    /* renamed from: d */
    public void mo22933d(String str) {
        m22932e(str, null);
    }

    /* renamed from: e */
    public void m22932e(String str, Throwable th2) {
        if (C2199c.f6354a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
