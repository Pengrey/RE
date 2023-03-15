package p132h6;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2404c;
import p154i6.C6020a;
import p154i6.C6022c;
import p154i6.InterfaceC6041v;
import p174j6.InterfaceC6313d;
import p216l6.InterfaceC6984a;

/* renamed from: h6.h */
/* loaded from: classes.dex */
public abstract class AbstractC5864h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC6041v m22859a(Context context, InterfaceC6313d interfaceC6313d, AbstractC2404c abstractC2404c, InterfaceC6984a interfaceC6984a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C6022c(context, interfaceC6313d, abstractC2404c);
        }
        return new C6020a(context, interfaceC6313d, interfaceC6984a, abstractC2404c);
    }
}
