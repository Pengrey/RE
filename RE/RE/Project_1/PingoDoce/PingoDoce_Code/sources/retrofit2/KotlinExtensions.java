package retrofit2;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import td.C10534k;
import td.InterfaceC10529j;

/* compiled from: KotlinExtensions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m20207d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", BuildConfig.VERSION_NAME, "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lbd/d;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.VERSION_NAME, "suspendAndThrow", "(Ljava/lang/Exception;Lbd/d;)Ljava/lang/Object;", "retrofit"}, m20206k = 2, m20205mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class KotlinExtensions {
    public static final Object await(Call call, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        final C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.mo7778n(new C9885x19835f10(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th2) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(th2, "t");
                InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                C13183m.C13184a c13825a = C13183m.f34143w;
                interfaceC11056j.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(response, "response");
                if (response.isSuccessful()) {
                    Object body = response.body();
                    if (body == null) {
                        Object m22831i = call2.request().m24267i(Invocation.class);
                        if (m22831i == null) {
                            Intrinsics.m20916s();
                        }
                        Intrinsics.isNotNull(m22831i, "call.request().tag(Invocation::class.java)!!");
                        Method method = ((Invocation) m22831i).method();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Response from ");
                        Intrinsics.isNotNull(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.isNotNull(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(method.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
                        InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                        C13183m.C13184a c13825a = C13183m.f34143w;
                        interfaceC11056j.resumeWith(C13183m.m1458a(C13186n.m1454a(kotlinNullPointerException)));
                        return;
                    }
                    InterfaceC10529j interfaceC11056j2 = InterfaceC10529j.this;
                    C13183m.C13184a c13825a2 = C13183m.f34143w;
                    interfaceC11056j2.resumeWith(C13183m.m1458a(body));
                    return;
                }
                InterfaceC10529j interfaceC11056j3 = InterfaceC10529j.this;
                HttpException httpException = new HttpException(response);
                C13183m.C13184a c13825a3 = C13183m.f34143w;
                interfaceC11056j3.resumeWith(C13183m.m1458a(C13186n.m1454a(httpException)));
            }
        });
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    public static final Object awaitNullable(Call call, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        final C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.mo7778n(new C9886x19835f11(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th2) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(th2, "t");
                InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                C13183m.C13184a c13825a = C13183m.f34143w;
                interfaceC11056j.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                    Object body = response.body();
                    C13183m.C13184a c13825a = C13183m.f34143w;
                    interfaceC11056j.resumeWith(C13183m.m1458a(body));
                    return;
                }
                InterfaceC10529j interfaceC11056j2 = InterfaceC10529j.this;
                HttpException httpException = new HttpException(response);
                C13183m.C13184a c13825a2 = C13183m.f34143w;
                interfaceC11056j2.resumeWith(C13183m.m1458a(C13186n.m1454a(httpException)));
            }
        });
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    public static final Object awaitResponse(Call call, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        final C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.mo7778n(new C9887xc95e9eb1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th2) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(th2, "t");
                InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                C13183m.C13184a c13825a = C13183m.f34143w;
                interfaceC11056j.resumeWith(C13183m.m1458a(C13186n.m1454a(th2)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.m20926i(call2, "call");
                Intrinsics.m20926i(response, "response");
                InterfaceC10529j interfaceC11056j = InterfaceC10529j.this;
                C13183m.C13184a c13825a = C13183m.f34143w;
                interfaceC11056j.resumeWith(C13183m.m1458a(response));
            }
        });
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }

    public static final /* synthetic */ Object create(Retrofit retrofit) {
        Intrinsics.m20926i(retrofit, "$this$create");
        Intrinsics.m20922m(4, "T");
        return retrofit.create(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Exception r4, bd.InterfaceC1886d r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            p468yc.C13186n.m1453b(r5)
            goto L5c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p468yc.C13186n.m1453b(r5)
            r0.L$0 = r4
            r0.label = r3
            td.e0 r5 = td.C10587w0.m7621a()
            bd.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.mo7628D0(r2, r3)
            java.lang.Object r4 = cd.C2111b.m34640d()
            java.lang.Object r5 = cd.C2111b.m34640d()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.DebugProbes.m20186c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            yc.u r4 = p468yc.C13195u.f34156a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, bd.d):java.lang.Object");
    }
}
