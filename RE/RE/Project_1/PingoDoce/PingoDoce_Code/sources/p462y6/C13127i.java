package p462y6;

import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: y6.i */
/* loaded from: classes.dex */
final class C13127i<R extends InterfaceC13123e> extends BasePendingResult<R> {

    /* renamed from: o */
    private final R f34088o;

    public C13127i(AbstractC2475c abstractC2475c, R r) {
        super(abstractC2475c);
        this.f34088o = r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: c */
    public final R mo1566c(Status status) {
        return this.f34088o;
    }
}
