package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import module.network.data.remote.models.response.AuthenticationResponse;
import pt.pingodoce.app.data.remote.models.request.CardOwnerRequest;
import pt.pingodoce.app.data.remote.models.request.GuestAccessRequest;
import pt.pingodoce.app.data.remote.models.request.OnboardingUserLoginRequest;
import pt.pingodoce.app.data.remote.models.request.OnboardingUserRequest;
import pt.pingodoce.app.data.remote.models.response.CardOwnerResponse;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse;
import pt.pingodoce.app.data.remote.models.response.OnboardingUserLoginResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: OnboardingApi.kt */
/* loaded from: classes2.dex */
public interface OnboardingApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/identity/onboarding/getPMCards")
    Object getLoyaltyCards(InterfaceC1886d<? super Response<LoyaltyCardListResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/onboarding/login")
    Object login(@Body OnboardingUserLoginRequest onboardingUserLoginRequest, InterfaceC1886d<? super Response<OnboardingUserLoginResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/onboarding/register")
    Object register(@Body OnboardingUserRequest onboardingUserRequest, InterfaceC1886d<? super Response<OnboardingUserLoginResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/onboarding/registeranonymous")
    Object registerAsGuest(@Body GuestAccessRequest guestAccessRequest, InterfaceC1886d<? super Response<AuthenticationResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/identity/onboarding/verifycardowner")
    Object verifyCardOwner(@Body CardOwnerRequest cardOwnerRequest, InterfaceC1886d<? super Response<CardOwnerResponse>> interfaceC1886d);
}
