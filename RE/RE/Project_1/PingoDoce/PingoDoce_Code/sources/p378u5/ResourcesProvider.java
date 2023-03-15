package p378u5;

import android.content.Context;
import p181jd.Intrinsics;

/* renamed from: u5.a */
/* loaded from: classes.dex */
public final class ResourcesProvider {

    /* renamed from: a */
    private final Context f28030a;

    public ResourcesProvider(Context context) {
        Intrinsics.isThisObjectNull(context, "ctx");
        this.f28030a = context;
    }

    /* renamed from: a */
    public final Context m6899a() {
        return this.f28030a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResourcesProvider(Context context, int i) {
        this(context);
        Intrinsics.isThisObjectNull(context, "ctx");
        context.setTheme(i);
    }
}
