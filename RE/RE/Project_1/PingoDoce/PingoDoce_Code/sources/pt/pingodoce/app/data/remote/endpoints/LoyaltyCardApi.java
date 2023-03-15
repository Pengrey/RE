package pt.pingodoce.app.data.remote.endpoints;

import bd.InterfaceC1886d;
import java.util.List;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.request.ElectronicInvoiceStatusRequest;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardInviteResponseRequest;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.VirtualCardRequest;
import pt.pingodoce.app.data.remote.models.response.CardOwnerResponse;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.data.remote.models.response.ElectronicInvoice;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;
import pt.pingodoce.app.data.remote.models.response.VirtualCardRegistrationResponse;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* compiled from: LoyaltyCardApi.kt */
/* loaded from: classes2.dex */
public interface LoyaltyCardApi {
    @GET("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations/status")
    Object cardStatus(InterfaceC1886d<? super Response<LoyaltyCard>> interfaceC1886d);

    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations")
    Object delete(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @DELETE("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations")
    Object deleteCardAssociations(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/settings/setEletronicTicket")
    Object electronicInvoice(@Body ElectronicInvoiceStatusRequest electronicInvoiceStatusRequest, InterfaceC1886d<? super Response<ElectronicInvoice>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/settings/checkEletronicTicket")
    Object electronicInvoiceStatus(@Body PhoneRequest phoneRequest, InterfaceC1886d<? super Response<ElectronicInvoice>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations/requestassociation")
    Object refreshInvite(InterfaceC1886d<? super Response<C13195u>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations/register")
    Object register(@Body LoyaltyCardProvisory loyaltyCardProvisory, InterfaceC1886d<? super Response<CardOwnerResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations/virtualpmcard")
    Object registerVirtualCard(@Body VirtualCardRequest virtualCardRequest, InterfaceC1886d<? super Response<VirtualCardRegistrationResponse>> interfaceC1886d);

    @POST("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations")
    Object reply(@Body LoyaltyCardInviteResponseRequest loyaltyCardInviteResponseRequest, InterfaceC1886d<? super Response<List<LoyaltyCardAssociation>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations")
    Object requests(InterfaceC1886d<? super Response<List<LoyaltyCardAssociation>>> interfaceC1886d);

    @GET("https://app-proxy.pingodoce.pt/api/v2/user/cardassociations/virtualpmcard/consents")
    Object virtualCardConsents(InterfaceC1886d<? super Response<Consent>> interfaceC1886d);
}
