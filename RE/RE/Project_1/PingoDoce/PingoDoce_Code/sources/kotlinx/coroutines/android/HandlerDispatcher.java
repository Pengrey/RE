package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p385ud.C10868b;
import p385ud.C10872d;
import td.AbstractC10492c2;

/* renamed from: kotlinx.coroutines.android.AndroidDispatcherFactory */
/* loaded from: classes2.dex */
public final class HandlerDispatcher implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: a */
    public String mo20017a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: b */
    public AbstractC10492c2 mo20016b(List<? extends MainDispatcherFactory> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C10868b(C10872d.m6811a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: c */
    public int mo20015c() {
        return 1073741823;
    }
}
