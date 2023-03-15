package p276og;

import id.InterfaceC6108l;
import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;
import p276og.Result;

/* compiled from: Result.kt */
/* renamed from: og.c */
/* loaded from: classes2.dex */
public final class C8082c {
    /* renamed from: a */
    public static final void m16959a(Result result, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(result, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "f");
        if (result instanceof Result.C8078c) {
            ((Result.C8078c) result).m16962b();
        } else if (!(result instanceof Result.C8077b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            interfaceC6108l.mo9587d(((Result.C8077b) result).m16964b());
        }
    }

    /* renamed from: b */
    public static final void m16958b(Result result, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(result, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "f");
        if (result instanceof Result.C8078c) {
            interfaceC6108l.mo9587d(((Result.C8078c) result).m16962b());
        } else if (!(result instanceof Result.C8077b)) {
            throw new NoWhenBranchMatchedException();
        } else {
            ((Result.C8077b) result).m16964b();
        }
    }
}
