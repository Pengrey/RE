package p442x9;

/* renamed from: x9.b */
/* loaded from: classes.dex */
public class C12327b implements InterfaceC12329d {

    /* renamed from: a */
    private final int f32483a;

    public C12327b(int i) {
        this.f32483a = i;
    }

    @Override // p442x9.InterfaceC12329d
    /* renamed from: a */
    public StackTraceElement[] mo3060a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f32483a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
