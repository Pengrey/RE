package p118g6;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public final class C5611b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m23577a(int i, TInput tinput, InterfaceC5610a<TInput, TResult, TException> interfaceC5610a, InterfaceC5612c<TInput, TResult> interfaceC5612c) throws Throwable {
        TResult mo23578a;
        if (i < 1) {
            return interfaceC5610a.mo23578a(tinput);
        }
        do {
            mo23578a = interfaceC5610a.mo23578a(tinput);
            tinput = interfaceC5612c.mo23576a(tinput, mo23578a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return mo23578a;
    }
}
