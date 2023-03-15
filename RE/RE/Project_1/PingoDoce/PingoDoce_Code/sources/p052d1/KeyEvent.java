package p052d1;

import p181jd.Intrinsics;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public final class KeyEvent {

    /* renamed from: a */
    private final android.view.KeyEvent f12825a;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.f12825a = keyEvent;
    }

    /* renamed from: a */
    public static final /* synthetic */ KeyEvent m26917a(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: b */
    public static android.view.KeyEvent m26916b(android.view.KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    /* renamed from: c */
    public static boolean m26915c(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && Intrinsics.equals(keyEvent, ((KeyEvent) obj).m26912f());
    }

    /* renamed from: d */
    public static int m26914d(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: e */
    public static String m26913e(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m26915c(this.f12825a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ android.view.KeyEvent m26912f() {
        return this.f12825a;
    }

    public int hashCode() {
        return m26914d(this.f12825a);
    }

    public String toString() {
        return m26913e(this.f12825a);
    }
}
