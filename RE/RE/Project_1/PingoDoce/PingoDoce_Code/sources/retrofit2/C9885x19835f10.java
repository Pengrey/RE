package retrofit2;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import kotlin.Metadata;
import p181jd.AbstractC6438m;
import p468yc.C13195u;

/* compiled from: KotlinExtensions.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m20207d2 = {BuildConfig.VERSION_NAME, "T", BuildConfig.VERSION_NAME, "it", "Lyc/u;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, m20206k = 3, m20205mv = {1, 4, 0})
/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes2.dex */
final class C9885x19835f10 extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9885x19835f10(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        invoke2(th2);
        return C13195u.f34156a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$this_await$inlined.cancel();
    }
}
