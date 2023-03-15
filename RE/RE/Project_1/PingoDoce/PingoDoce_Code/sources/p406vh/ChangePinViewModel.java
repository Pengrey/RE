package p406vh;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bj.ValidatePinViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.PinRecoveryManager;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;

/* renamed from: vh.c */
/* loaded from: classes2.dex */
public final class ChangePinViewModel extends ValidatePinViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        C1436e0 m41648G0 = m41648G0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_title_alt);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m41648G0.mo166p(string);
        C1436e0 m41649F0 = m41649F0();
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_subtitle_alt);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m41649F0.mo166p(string2);
    }
}
