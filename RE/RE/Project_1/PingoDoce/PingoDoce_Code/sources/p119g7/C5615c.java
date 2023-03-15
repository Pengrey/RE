package p119g7;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: g7.c */
/* loaded from: classes.dex */
public class C5615c {

    /* renamed from: b */
    private static C5615c f15851b = new C5615c();

    /* renamed from: a */
    private C5614b f15852a = null;

    /* renamed from: a */
    public static C5614b m23567a(Context context) {
        return f15851b.m23566b(context);
    }

    /* renamed from: b */
    public final synchronized C5614b m23566b(Context context) {
        if (this.f15852a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f15852a = new C5614b(context);
        }
        return this.f15852a;
    }
}
