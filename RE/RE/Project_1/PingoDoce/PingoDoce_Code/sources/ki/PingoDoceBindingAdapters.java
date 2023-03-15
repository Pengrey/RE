package ki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0928a;
import androidx.core.content.res.C0955h;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardStatus;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: ki.c */
/* loaded from: classes2.dex */
public final class PingoDoceBindingAdapters {

    /* compiled from: PingoDoceBindingAdapters.kt */
    /* renamed from: ki.c$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6668a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17970a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f17971b;

        static {
            int[] iArr = new int[LoyaltyCardStatus.values().length];
            iArr[LoyaltyCardStatus.APPROVED.ordinal()] = 1;
            iArr[LoyaltyCardStatus.APPROVED_WITH_REQUESTS.ordinal()] = 2;
            iArr[LoyaltyCardStatus.PENDING.ordinal()] = 3;
            iArr[LoyaltyCardStatus.PENDING_WAITING_FOR_OWNER_REGISTRATION.ordinal()] = 4;
            iArr[LoyaltyCardStatus.PENDING_WAITING_FOR_OWNER_APPROVAL.ordinal()] = 5;
            iArr[LoyaltyCardStatus.PENDING_WAITING_FOR_LOYALTY_CARD_APPROVAL.ordinal()] = 6;
            f17970a = iArr;
            int[] iArr2 = new int[LoyaltyCard.Type.values().length];
            iArr2[LoyaltyCard.Type.Undefined.ordinal()] = 1;
            iArr2[LoyaltyCard.Type.PoupaMais.ordinal()] = 2;
            iArr2[LoyaltyCard.Type.LoyaltyCard.ordinal()] = 3;
            f17971b = iArr2;
        }
    }

    static {
        new PingoDoceBindingAdapters();
    }

    private PingoDoceBindingAdapters() {
    }

    /* renamed from: a */
    public static final void m20346a(TextView textView, float f) {
        Intrinsics.isThisObjectNull(textView, "view");
        textView.setCompoundDrawablePadding((int) f);
    }

    /* renamed from: b */
    public static final void m20345b(ShimmerFrameLayout shimmerFrameLayout, boolean z) {
        Intrinsics.isThisObjectNull(shimmerFrameLayout, "view");
        if (z) {
            shimmerFrameLayout.m33927c();
        } else {
            shimmerFrameLayout.m33926d();
        }
    }

    /* renamed from: c */
    public static final void m20344c(View view, float f, float f2) {
        Intrinsics.isThisObjectNull(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (f > 0.0f) {
            layoutParams.width = (int) f;
        }
        if (f2 > 0.0f) {
            layoutParams.height = (int) f2;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public static final void m20343d(ImageView imageView, LoyaltyCard loyaltyCard, Drawable drawable) {
        Intrinsics.isThisObjectNull(imageView, "view");
        LoyaltyCard.Type m13798n = loyaltyCard != null ? loyaltyCard.m13798n() : null;
        int i = m13798n == null ? -1 : C6668a.f17971b[m13798n.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            imageView.setImageResource(C2336R.C2337drawable.ic_ompd_card);
            return;
        }
        int i2 = C6668a.f17970a[loyaltyCard.m13808b().ordinal()];
        if (i2 == 1) {
            imageView.setImageResource(C2336R.C2337drawable.ic_loyalty_card_active);
        } else if (i2 == 2) {
            imageView.setImageResource(C2336R.C2337drawable.ic_loyalty_card_active_pending);
        } else if (i2 == 3) {
            imageView.setImageResource(C2336R.C2337drawable.ic_loyalty_card_inactive_pending);
        } else if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(C2336R.C2337drawable.ic_loyalty_card_onboarding);
        }
    }

    /* renamed from: e */
    public static final void m20342e(TextView textView, LoyaltyCardStatus loyaltyCardStatus) {
        Intrinsics.isThisObjectNull(textView, "view");
        int i = loyaltyCardStatus == null ? -1 : C6668a.f17970a[loyaltyCardStatus.ordinal()];
        if (i == -1) {
            textView.setText(BuildConfig.VERSION_NAME);
        } else if (i == 4) {
            textView.setText(textView.getContext().getString(C2336R.string.lbl_card_association));
        } else if (i == 5) {
            textView.setText(textView.getContext().getString(C2336R.string.lbl_card_registration_status_pending));
        } else if (i != 6) {
            textView.setText(textView.getContext().getString(C2336R.string.lbl_card_association));
        } else {
            textView.setText(textView.getContext().getString(C2336R.string.lbl_onboarding_warning_owner));
        }
    }

    /* renamed from: f */
    public static final void m20341f(LinearLayout linearLayout, float f, float f2) {
        Intrinsics.isThisObjectNull(linearLayout, "view");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = (int) f;
        linearLayout.setLayoutParams(layoutParams);
        int i = (int) f2;
        linearLayout.setPadding(i, i, i, i);
    }

    /* renamed from: g */
    public static final void m20340g(TextView textView, int i) {
        Intrinsics.isThisObjectNull(textView, "view");
        Context context = textView.getContext();
        Intrinsics.checkIfNull(context, "view.context");
        ResourcesProvider resourcesProvider = new ResourcesProvider(context);
        textView.setBackground(C0955h.m38996e(resourcesProvider.m6899a().getResources(), C2336R.C2337drawable.shape_for_rounded_bg, new ContextThemeWrapper(resourcesProvider.m6899a(), i).getTheme()));
        Context context2 = textView.getContext();
        Intrinsics.checkIfNull(context2, "view.context");
        ResourcesProvider resourcesProvider2 = new ResourcesProvider(context2);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(resourcesProvider2.m6899a(), i).getTheme().resolveAttribute(C2336R.attr.colorOnPrimary, typedValue, true);
        textView.setTextColor(C0928a.m39113d(resourcesProvider2.m6899a(), typedValue.resourceId));
    }
}
