package p197k7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: k7.a */
/* loaded from: classes.dex */
public class C6603a implements IInterface {

    /* renamed from: a */
    private final IBinder f17845a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6603a(IBinder iBinder, String str) {
        this.f17845a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f17845a;
    }
}
