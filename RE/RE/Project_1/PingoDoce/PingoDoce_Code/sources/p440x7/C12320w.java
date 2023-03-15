package p440x7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2568d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.C3113a;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p133h7.BinderC5870d;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.w */
/* loaded from: classes.dex */
public final class C12320w {

    /* renamed from: a */
    private static final String f32477a = "w";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f32478b;

    /* renamed from: c */
    private static InterfaceC12322y f32479c;

    /* renamed from: a */
    public static InterfaceC12322y m3088a(Context context, C3113a.EnumC3114a enumC3114a) throws GooglePlayServicesNotAvailableException {
        InterfaceC12322y c12321x;
        C2597i.m33076j(context);
        String str = f32477a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(enumC3114a)));
        InterfaceC12322y interfaceC12322y = f32479c;
        if (interfaceC12322y == null) {
            int m33217f = C2568d.m33217f(context, 13400000);
            if (m33217f == 0) {
                Log.i(str, "Making Creator dynamically");
                try {
                    IBinder iBinder = (IBinder) m3085d(((ClassLoader) C2597i.m33076j(m3086c(context, enumC3114a).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                    if (iBinder == null) {
                        c12321x = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        c12321x = queryLocalInterface instanceof InterfaceC12322y ? (InterfaceC12322y) queryLocalInterface : new C12321x(iBinder);
                    }
                    f32479c = c12321x;
                    try {
                        Context m3086c = m3086c(context, enumC3114a);
                        m3086c.getClass();
                        c12321x.mo3083Z0(BinderC5870d.m22835S1(m3086c.getResources()), C2568d.f7390f);
                        return f32479c;
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (ClassNotFoundException unused) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new GooglePlayServicesNotAvailableException(m33217f);
        }
        return interfaceC12322y;
    }

    /* renamed from: b */
    private static Context m3087b(Exception exc, Context context) {
        Log.e(f32477a, "Failed to load maps module, use pre-Chimera", exc);
        return C2568d.m33219c(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
        android.util.Log.d(p440x7.C12320w.f32477a, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.m32979e(r2, com.google.android.gms.dynamite.DynamiteModule.f7571b, "com.google.android.gms.maps_dynamite").m32982b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r2 = m3087b(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = m3087b(r1, r2);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Context m3086c(android.content.Context r2, com.google.android.gms.maps.C3113a.EnumC3114a r3) {
        /*
            android.content.Context r0 = p440x7.C12320w.f32478b
            if (r0 != 0) goto L4d
            r2.getApplicationContext()
            java.lang.String r0 = "com.google.android.gms.maps_dynamite"
            if (r3 == 0) goto L1b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L18
            r1 = 1
            if (r3 == r1) goto L15
            goto L1b
        L15:
            java.lang.String r3 = "com.google.android.gms.maps_core_dynamite"
            goto L1c
        L18:
            java.lang.String r3 = "com.google.android.gms.maps_legacy_dynamite"
            goto L1c
        L1b:
            r3 = r0
        L1c:
            com.google.android.gms.dynamite.DynamiteModule$a r1 = com.google.android.gms.dynamite.DynamiteModule.f7571b     // Catch: java.lang.Exception -> L27
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.m32979e(r2, r1, r3)     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = r1.m32982b()     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r1 = move-exception
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            java.lang.String r3 = p440x7.C12320w.f32477a     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = "Attempting to load maps_dynamite again."
            android.util.Log.d(r3, r1)     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule$a r3 = com.google.android.gms.dynamite.DynamiteModule.f7571b     // Catch: java.lang.Exception -> L40
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.m32979e(r2, r3, r0)     // Catch: java.lang.Exception -> L40
            android.content.Context r2 = r3.m32982b()     // Catch: java.lang.Exception -> L40
            goto L4a
        L40:
            r3 = move-exception
            android.content.Context r2 = m3087b(r3, r2)
            goto L4a
        L46:
            android.content.Context r2 = m3087b(r1, r2)
        L4a:
            p440x7.C12320w.f32478b = r2
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p440x7.C12320w.m3086c(android.content.Context, com.google.android.gms.maps.a$a):android.content.Context");
    }

    /* renamed from: d */
    private static <T> T m3085d(Class cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
