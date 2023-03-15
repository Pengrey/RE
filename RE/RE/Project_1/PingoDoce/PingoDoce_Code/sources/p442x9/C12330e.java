package p442x9;

/* renamed from: x9.e */
/* loaded from: classes.dex */
public class C12330e {

    /* renamed from: a */
    public final String f32485a;

    /* renamed from: b */
    public final String f32486b;

    /* renamed from: c */
    public final StackTraceElement[] f32487c;

    /* renamed from: d */
    public final C12330e f32488d;

    public C12330e(Throwable th2, InterfaceC12329d interfaceC12329d) {
        this.f32485a = th2.getLocalizedMessage();
        this.f32486b = th2.getClass().getName();
        this.f32487c = interfaceC12329d.mo3060a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f32488d = cause != null ? new C12330e(cause, interfaceC12329d) : null;
    }
}
