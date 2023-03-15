package lib.mozidev.p225me.extextview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p469yd.InterfaceC13197a;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m20207d2 = {"Llib/mozidev/me/extextview/ExTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", BuildConfig.VERSION_NAME, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "extextview_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* renamed from: lib.mozidev.me.extextview.ExTextView */
/* loaded from: classes2.dex */
public final class ExTextView extends AppCompatTextView {

    /* renamed from: B */
    private List<InterfaceC13197a> f18763B;

    public ExTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ExTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: f */
    public final void m19397f(InterfaceC13197a interfaceC13197a) {
        Intrinsics.m20926i(interfaceC13197a, "painting");
        this.f18763B.add(interfaceC13197a);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null || this.f18763B.size() == 0) {
            return;
        }
        for (InterfaceC13197a interfaceC13197a : this.f18763B) {
            interfaceC13197a.mo1435a(canvas);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.m20926i(context, "context");
        this.f18763B = new ArrayList();
    }
}
