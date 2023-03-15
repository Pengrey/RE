package p442x9;

/* renamed from: x9.a */
/* loaded from: classes.dex */
public class C12326a implements InterfaceC12329d {

    /* renamed from: a */
    private final int f32480a;

    /* renamed from: b */
    private final InterfaceC12329d[] f32481b;

    /* renamed from: c */
    private final C12327b f32482c;

    public C12326a(int i, InterfaceC12329d... interfaceC12329dArr) {
        this.f32480a = i;
        this.f32481b = interfaceC12329dArr;
        this.f32482c = new C12327b(i);
    }

    @Override // p442x9.InterfaceC12329d
    /* renamed from: a */
    public StackTraceElement[] mo3060a(StackTraceElement[] stackTraceElementArr) {
        InterfaceC12329d[] interfaceC12329dArr;
        if (stackTraceElementArr.length <= this.f32480a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC12329d interfaceC12329d : this.f32481b) {
            if (stackTraceElementArr2.length <= this.f32480a) {
                break;
            }
            stackTraceElementArr2 = interfaceC12329d.mo3060a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f32480a ? this.f32482c.mo3060a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
