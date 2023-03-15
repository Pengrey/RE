package retrofit2;

import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinExtensions.kt */
@InterfaceC6759f(m20197c = "retrofit2.KotlinExtensions", m20196f = "KotlinExtensions.kt", m20195l = {113}, m20194m = "suspendAndThrow")
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, m20207d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lbd/d;", BuildConfig.VERSION_NAME, "continuation", BuildConfig.VERSION_NAME, "suspendAndThrow"}, m20206k = 3, m20205mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends AbstractC6757d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public KotlinExtensions$suspendAndThrow$1(InterfaceC1886d interfaceC1886d) {
        super(interfaceC1886d);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
