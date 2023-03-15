package p449xg;

import ag.C0138c;
import ag.FlyersFragment;
import al.C0202b;
import al.C0204d;
import al.C0205e;
import al.CreatePinViewModel;
import am.C0223g;
import am.C0224h;
import am.C0225i;
import am.C0232q;
import am.C0237s;
import am.C0238t;
import am.TakeAwayProductListFragment;
import am.TakeAwayProductListFragmentViewModel;
import am.TakeAwayProductsViewModel;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.C0577e;
import androidx.lifecycle.AbstractC1468o0;
import bg.C1904b;
import bg.C1905c;
import bg.FetchTermsAndConditionsViewModel;
import bh.C1913i;
import bh.C1922r;
import bh.C1923s;
import cf.C2127b;
import cf.OAuthService;
import cg.C2129b;
import ch.C2130b;
import ch.C2134f;
import ch.C2135g;
import ck.C2168b;
import ck.C2171d;
import ck.C2172e;
import ck.CardRegistrationStatusViewModel;
import cl.C2173b;
import cl.C2177e;
import cl.C2178f;
import cl.OnboardingSuccessViewModel;
import cm.C2180c;
import cm.C2181e;
import cm.C2182g;
import cm.C2183h;
import cm.TakeAwayProductDetailViewModel;
import com.google.android.play.core.review.InterfaceC3954c;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.android.C4771c;
import dagger.android.C4772d;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC4768a;
import dj.C4880d;
import dj.C4881e;
import dj.C4882f;
import dj.ProductListFragment;
import dj.ProductListFragmentViewModel;
import dk.C4887c;
import dk.C4888e;
import dk.C4889f;
import dk.TailoredForYouViewModel;
import dm.C4892b;
import dm.C4895i;
import dm.C4896j;
import dm.TakeAwayWalkThroughViewModel;
import fi.C5525d;
import fj.C5537i;
import fj.C5549v;
import fj.C5552y;
import fj.C5553z;
import fk.C5566n;
import fk.C5572u;
import fk.C5573v;
import fm.C5580d;
import fm.C5584e;
import gg.C5649a;
import gg.C5651b;
import gg.C5652c;
import gg.C5654d;
import gg.C5655e;
import gg.C5657f;
import gg.C5658g;
import gg.C5660h;
import gg.C5661i;
import gg.C5663j;
import gg.C5664k;
import gg.C5666l;
import gg.C5667m;
import gg.C5669n;
import gg.C5670o;
import gg.C5672p;
import gg.C5673q;
import gg.C5675r;
import gg.C5676s;
import gg.C5678t;
import gg.C5679u;
import gg.C5681v;
import gg.C5682w;
import gg.C5684x;
import gh.C5685b;
import gh.C5688e;
import gh.C5689f;
import gl.C5712f;
import gl.C5713h;
import gl.C5714i;
import gl.PromotionViewModel;
import hk.AppWalkThroughViewModel;
import hk.C5958b;
import hk.C5961j;
import hk.C5962k;
import hm.C5975c;
import hm.SnackBarWidget;
import il.C6188f;
import il.C6202k;
import il.C6203l;
import il.PurchaseListViewModel;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Map;
import ke.InterfaceC6657b;
import ke.ViewModelFactoryByInjection;
import kh.C6663c;
import kh.C6664e;
import kh.C6665f;
import kh.EditBirthDateViewModel;
import mg.AnalyticsManager;
import mg.AppRatingManager;
import mg.AuthManager;
import mg.BannerManager;
import mg.BiometricsManager;
import mg.C7199a1;
import mg.C7233d;
import mg.C7234d0;
import mg.C7256f1;
import mg.C7279g;
import mg.C7280g0;
import mg.C7281g1;
import mg.C7293i;
import mg.C7295i1;
import mg.C7296j0;
import mg.C7307k;
import mg.C7308k0;
import mg.C7309k1;
import mg.C7310l;
import mg.C7342m;
import mg.C7347m1;
import mg.C7363n1;
import mg.C7372o0;
import mg.C7376p;
import mg.C7397r;
import mg.C7398r0;
import mg.C7399r1;
import mg.C7405s1;
import mg.C7422t;
import mg.C7423t0;
import mg.C7424t1;
import mg.C7466w;
import mg.C7467w0;
import mg.C7475y0;
import mg.C7476z;
import mg.ClubManager;
import mg.CoachMarkManager;
import mg.ConsentsManager;
import mg.EmailManager;
import mg.EncryptedPrefsManager;
import mg.LoyaltyCardManager;
import mg.NifManager;
import mg.PhoneManager;
import mg.PinRecoveryManager;
import mg.PrefsManager;
import mg.PurchasesManager;
import mg.PushNotificationsManager;
import mg.RecentProductManager;
import mg.SmsManager;
import mg.StoreManager;
import mg.TransactionCacheManager;
import mh.C7478b;
import mh.C7480d;
import mh.C7481e;
import mh.EditNifViewModel;
import mk.C7491b;
import mk.C7493d;
import mk.C7494e;
import mk.C7495g;
import mk.C7497i;
import mk.C7498j;
import mk.C7499l;
import mk.C7502n;
import mk.C7503o;
import mk.CreatePhoneViewModel;
import mk.UpdatePhoneViewModel;
import mk.ValidatePinForUpdatePhoneViewModel;
import ml.C7517n;
import ml.C7537o;
import ml.C7538p;
import ni.C7909c;
import nl.C7937f;
import nl.C7944j;
import nl.C7945k;
import nl.SharedWithViewModel;
import org.threeten.p283bp.format.C8223b;
import p013ah.C0140c;
import p013ah.C0142e;
import p013ah.C0143f;
import p015ak.C0197b;
import p015ak.C0200d;
import p015ak.C0201e;
import p015ak.CardRegistrationViewModel;
import p033bk.AvailableCardsResumeViewModel;
import p033bk.C1928b;
import p033bk.C1933f;
import p033bk.C1934g;
import p033bk.C1935i;
import p033bk.C1939l;
import p033bk.C1940m;
import p033bk.CardRegistrationResumeViewModel;
import p034bl.C1942c;
import p034bl.C1944e;
import p034bl.C1945f;
import p048cj.C2161h;
import p048cj.C2166j;
import p048cj.C2167k;
import p048cj.ProductDetailViewModel;
import p066dg.BannersAgent;
import p066dg.C4794a0;
import p066dg.C4815c;
import p066dg.C4816c0;
import p066dg.C4818e;
import p066dg.C4824g;
import p066dg.C4826i;
import p066dg.C4836l;
import p066dg.C4838n;
import p066dg.C4842p;
import p066dg.C4844r;
import p066dg.C4847t;
import p066dg.C4850w;
import p066dg.C4852y;
import p066dg.CategoriesAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.CoachmarksAgent;
import p066dg.ConsentsAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.StoresAgent;
import p066dg.UserProfileAgent;
import p067dh.AssociationsViewModel;
import p067dh.C4854b;
import p067dh.C4855d;
import p067dh.C4856e;
import p068di.C4862b;
import p068di.C4863d;
import p068di.C4864e;
import p068di.WebViewModel;
import p070e.C4906j;
import p084ef.C5033b;
import p084ef.C5035c;
import p084ef.C5037d;
import p084ef.C5039e;
import p084ef.C5041f;
import p084ef.C5042g;
import p084ef.C5043h;
import p084ef.C5044i;
import p084ef.C5045j;
import p084ef.C5047k;
import p084ef.C5048l;
import p084ef.C5049m;
import p085eh.C5076a;
import p085eh.C5079b;
import p086ei.BenefitsViewModel;
import p086ei.C5088j;
import p086ei.C5109s;
import p086ei.C5110t;
import p088ek.C5126b;
import p088ek.C5130e;
import p088ek.C5131f;
import p088ek.IntroViewModel;
import p089el.C5132b;
import p089el.C5133d;
import p089el.C5134e;
import p089el.UserDataInsertViewModel;
import p090em.C5135b;
import p090em.C5136d;
import p090em.C5143f;
import p090em.C5144g;
import p090em.C5145h;
import p090em.PushNotificationDispatcherViewModel;
import p107ff.CertificatePinner;
import p107ff.ConnectionPool;
import p107ff.Dispatcher;
import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p108fg.AppInterceptorDataProvider;
import p108fg.C5517b;
import p109fh.C5518a;
import p109fh.C5521b;
import p110fl.C5574b;
import p110fl.C5575d;
import p110fl.C5576e;
import p110fl.UserDataUpdateViewModel;
import p124gk.C5702b;
import p124gk.C5706d;
import p124gk.C5707e;
import p124gk.SplashViewModel;
import p140he.C5921e;
import p143hh.C5937b;
import p143hh.C5942d;
import p143hh.C5943e;
import p143hh.LoyaltyPendingViewModel;
import p144hi.C5946d;
import p144hi.C5953i;
import p144hi.C5954j;
import p144hi.ClubViewModel;
import p146hl.C5965d;
import p146hl.C5972h;
import p146hl.C5973i;
import p146hl.PurchaseDetailViewModel;
import p163ih.C6139c;
import p163ih.C6146e;
import p163ih.C6147f;
import p163ih.C6151h;
import p163ih.C6156k;
import p163ih.C6157l;
import p163ih.PurchasesChartFragment;
import p163ih.PurchasesChartViewModel;
import p163ih.PurchasesRecentFragment;
import p163ih.PurchasesRecentViewModel;
import p164ii.BabyClubWelcomeViewModel;
import p164ii.C6163g;
import p164ii.C6165i;
import p164ii.C6166j;
import p164ii.C6168m;
import p164ii.C6176t;
import p164ii.C6181x;
import p164ii.C6182y;
import p184jh.C6465h;
import p184jh.C6472o;
import p184jh.C6473p;
import p185ji.C6475a0;
import p185ji.C6477b0;
import p185ji.C6479d;
import p185ji.C6485g0;
import p185ji.C6490j;
import p185ji.C6493k;
import p185ji.C6494k0;
import p185ji.C6496l0;
import p185ji.C6509z;
import p185ji.WineClubWelcomeViewModel;
import p188jl.C6527d;
import p188jl.C6534j;
import p188jl.C6535k;
import p188jl.PurchaseProductsViewModel;
import p205kj.C6681b;
import p206kk.C6688c;
import p207kl.C6701e0;
import p207kl.C6705f1;
import p207kl.C6708g1;
import p221le.C7049i;
import p221le.UiWidgets;
import p224lh.C7055b;
import p224lh.C7057d;
import p224lh.C7058e;
import p224lh.EditEmailViewModel;
import p227ll.C7074e;
import p227ll.C7079h;
import p227ll.C7080i;
import p227ll.ManualSortShoppingListViewModel;
import p241mi.BottomNavigationViewModel;
import p241mi.C7483b;
import p241mi.C7484c;
import p248n4.AppEventsLogger;
import p256nh.C7890d;
import p256nh.C7901o;
import p256nh.C7902p;
import p258nk.C7926c;
import p258nk.C7931e;
import p258nk.C7932f;
import p258nk.LoginPhoneViewModel;
import p277oh.C8083b;
import p277oh.C8086d;
import p277oh.C8087e;
import p277oh.DeleteAccountViewModel;
import p279oj.C8093d;
import p279oj.C8094f;
import p279oj.C8095g;
import p279oj.VersionControlViewModel;
import p280ok.C8096b;
import p280ok.C8099d;
import p280ok.C8100e;
import p280ok.RecoverPinViewModel;
import p318qh.C9732b;
import p318qh.C9733d;
import p318qh.C9734e;
import p318qh.C9735g;
import p318qh.C9737i;
import p318qh.C9738j;
import p318qh.ElectronicInvoiceEditEmailViewModel;
import p318qh.ElectronicInvoiceEmailViewModel;
import p320qj.C9755c;
import p320qj.C9756d;
import p320qj.DebugViewModel;
import p321qk.C9757b;
import p321qk.C9759d;
import p321qk.C9760e;
import p322ql.C9767g;
import p322ql.C9773m;
import p322ql.C9774n;
import p338rf.HttpLoggingInterceptor;
import p340rh.C9900b;
import p340rh.C9905d;
import p340rh.C9906e;
import p340rh.ElectronicInvoicePhoneViewModel;
import p342rj.C9914d;
import p342rj.C9918f;
import p342rj.C9919g;
import p342rj.CacheViewModel;
import p344rl.C9929a;
import p344rl.C9931c;
import p344rl.C9932d;
import p370te.C10605b;
import p370te.OAuthManager;
import p371ti.C10627b;
import p371ti.C10630e;
import p371ti.C10631f;
import p378u5.ResourcesProvider;
import p388uh.C10879b;
import p388uh.C10896s;
import p388uh.C10897t;
import p389ui.C10899c;
import p389ui.C10911f;
import p389ui.C10912g;
import p389ui.LoyaltyCardViewModel;
import p390uj.C10918c0;
import p390uj.C10920d0;
import p390uj.C10937v;
import p391ul.C10968c;
import p391ul.C10972f;
import p391ul.C10973g;
import p391ul.TakeAwayOrderDetailViewModel;
import p406vh.C11355b;
import p406vh.C11356d;
import p406vh.C11357e;
import p406vh.C11358g;
import p406vh.C11361i;
import p406vh.C11362j;
import p406vh.ChangePinViewModel;
import p406vh.ReplacePinViewModel;
import p407vj.C11369b;
import p407vj.C11379e;
import p407vj.C11380f;
import p407vj.DefaultStoreViewModel;
import p408vk.C11381b;
import p408vk.C11395g;
import p408vk.C11396h;
import p408vk.OnboardingEmailSentViewModel;
import p409vl.C11398c;
import p409vl.C11401e;
import p409vl.C11402f;
import p409vl.TakeAwayOrderListViewModel;
import p423wc.C11613b;
import p423wc.C11615d;
import p423wc.C11616e;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p427wh.C12152c;
import p427wh.C12153e;
import p427wh.C12154f;
import p427wh.TermsOfUseViewModel;
import p428wi.C12158e;
import p428wi.C12163g;
import p428wi.C12164h;
import p428wi.LoyaltyCardInvitesViewModel;
import p429wj.C12169b;
import p429wj.C12173d;
import p429wj.C12174e;
import p429wj.DefaultStoreDetailViewModel;
import p430wk.C12177b;
import p430wk.C12178b0;
import p430wk.C12180c0;
import p430wk.C12182e;
import p430wk.C12183f;
import p430wk.C12184h;
import p430wk.C12187j;
import p430wk.C12188k;
import p430wk.C12189l;
import p430wk.C12192o;
import p430wk.C12193p;
import p430wk.C12194r;
import p430wk.C12197u;
import p430wk.C12198v;
import p430wk.C12199x;
import p430wk.OnboardingCardQuestionViewModel;
import p430wk.OnboardingCardRegistrationViewModel;
import p430wk.OnboardingCardTutorialViewModel;
import p430wk.OnboardingOtherUserCardTutorialViewModel;
import p430wk.OnboardingOwnerInV2ViewModel;
import p431wl.C12202b;
import p431wl.C12207e;
import p431wl.C12208f;
import p431wl.TakeAwayStoreViewModel;
import p445xc.InterfaceC12341a;
import p448xf.BabyClubUpdateViewModel;
import p448xf.C12353b;
import p448xf.C12354c;
import p449xg.InterfaceC12355a;
import p450xh.BannerDetailViewModel;
import p450xh.C12982c;
import p450xh.C12988f;
import p450xh.C12989g;
import p452xj.C13005b;
import p452xj.DefaultStoreListFragment;
import p453xk.C13006b;
import p453xk.C13010d;
import p453xk.C13011e;
import p453xk.OnboardingMyPdViewModel;
import p454xl.C13012b;
import p454xl.C13013d;
import p454xl.C13014e;
import p454xl.TakeAwayStoreDetailViewModel;
import p471yg.InterfaceC13203a;
import p471yg.InterfaceC13205a0;
import p471yg.InterfaceC13207a1;
import p471yg.InterfaceC13209a2;
import p471yg.InterfaceC13211a3;
import p471yg.InterfaceC13213b;
import p471yg.InterfaceC13215b0;
import p471yg.InterfaceC13217b1;
import p471yg.InterfaceC13219b2;
import p471yg.InterfaceC13221b3;
import p471yg.InterfaceC13223c;
import p471yg.InterfaceC13225c0;
import p471yg.InterfaceC13227c1;
import p471yg.InterfaceC13229c2;
import p471yg.InterfaceC13231c3;
import p471yg.InterfaceC13233d;
import p471yg.InterfaceC13235d0;
import p471yg.InterfaceC13237d1;
import p471yg.InterfaceC13239d2;
import p471yg.InterfaceC13241d3;
import p471yg.InterfaceC13243e;
import p471yg.InterfaceC13245e0;
import p471yg.InterfaceC13247e1;
import p471yg.InterfaceC13249e2;
import p471yg.InterfaceC13251e3;
import p471yg.InterfaceC13253f;
import p471yg.InterfaceC13255f0;
import p471yg.InterfaceC13257f1;
import p471yg.InterfaceC13259f2;
import p471yg.InterfaceC13261f3;
import p471yg.InterfaceC13263g;
import p471yg.InterfaceC13265g0;
import p471yg.InterfaceC13267g1;
import p471yg.InterfaceC13269g2;
import p471yg.InterfaceC13271g3;
import p471yg.InterfaceC13273h;
import p471yg.InterfaceC13275h0;
import p471yg.InterfaceC13277h1;
import p471yg.InterfaceC13279h2;
import p471yg.InterfaceC13281h3;
import p471yg.InterfaceC13283i;
import p471yg.InterfaceC13285i0;
import p471yg.InterfaceC13287i1;
import p471yg.InterfaceC13289i2;
import p471yg.InterfaceC13291i3;
import p471yg.InterfaceC13293j;
import p471yg.InterfaceC13295j0;
import p471yg.InterfaceC13297j1;
import p471yg.InterfaceC13299j2;
import p471yg.InterfaceC13301j3;
import p471yg.InterfaceC13303k;
import p471yg.InterfaceC13305k0;
import p471yg.InterfaceC13307k1;
import p471yg.InterfaceC13309k2;
import p471yg.InterfaceC13311k3;
import p471yg.InterfaceC13313l;
import p471yg.InterfaceC13315l0;
import p471yg.InterfaceC13317l1;
import p471yg.InterfaceC13319l2;
import p471yg.InterfaceC13321l3;
import p471yg.InterfaceC13323m;
import p471yg.InterfaceC13325m0;
import p471yg.InterfaceC13327m1;
import p471yg.InterfaceC13329m2;
import p471yg.InterfaceC13331m3;
import p471yg.InterfaceC13333n;
import p471yg.InterfaceC13335n0;
import p471yg.InterfaceC13337n1;
import p471yg.InterfaceC13339n2;
import p471yg.InterfaceC13341n3;
import p471yg.InterfaceC13343o;
import p471yg.InterfaceC13345o0;
import p471yg.InterfaceC13347o1;
import p471yg.InterfaceC13349o2;
import p471yg.InterfaceC13351p;
import p471yg.InterfaceC13353p0;
import p471yg.InterfaceC13355p1;
import p471yg.InterfaceC13357p2;
import p471yg.InterfaceC13359q;
import p471yg.InterfaceC13361q0;
import p471yg.InterfaceC13363q1;
import p471yg.InterfaceC13365q2;
import p471yg.InterfaceC13367r;
import p471yg.InterfaceC13369r0;
import p471yg.InterfaceC13371r1;
import p471yg.InterfaceC13373r2;
import p471yg.InterfaceC13375s;
import p471yg.InterfaceC13377s0;
import p471yg.InterfaceC13379s1;
import p471yg.InterfaceC13381s2;
import p471yg.InterfaceC13383t;
import p471yg.InterfaceC13385t0;
import p471yg.InterfaceC13387t1;
import p471yg.InterfaceC13389t2;
import p471yg.InterfaceC13391u;
import p471yg.InterfaceC13393u0;
import p471yg.InterfaceC13395u1;
import p471yg.InterfaceC13397u2;
import p471yg.InterfaceC13399v;
import p471yg.InterfaceC13401v0;
import p471yg.InterfaceC13403v1;
import p471yg.InterfaceC13405v2;
import p471yg.InterfaceC13407w;
import p471yg.InterfaceC13409w0;
import p471yg.InterfaceC13411w1;
import p471yg.InterfaceC13413w2;
import p471yg.InterfaceC13415x;
import p471yg.InterfaceC13417x0;
import p471yg.InterfaceC13419x1;
import p471yg.InterfaceC13421x2;
import p471yg.InterfaceC13423y;
import p471yg.InterfaceC13425y0;
import p471yg.InterfaceC13427y1;
import p471yg.InterfaceC13429y2;
import p471yg.InterfaceC13431z;
import p471yg.InterfaceC13433z0;
import p471yg.InterfaceC13435z1;
import p471yg.InterfaceC13437z2;
import p473yi.C13445b;
import p473yi.C13449f;
import p473yi.C13450g;
import p473yi.C13451i;
import p473yi.C13458l;
import p473yi.C13459m;
import p473yi.C13460o;
import p473yi.C13463r;
import p473yi.C13464s;
import p473yi.VirtualCardDataConfirmationViewModel;
import p473yi.VirtualCardPreferencesViewModel;
import p473yi.VirtualCardSuccessViewModel;
import p474yj.C13467b;
import p474yj.DefaultStoreMapFragment;
import p475yk.C13468b;
import p475yk.C13475d;
import p475yk.C13476e;
import p475yk.OnboardingNifViewModel;
import p476yl.C13479b;
import p476yl.TakeAwayStoreListFragment;
import p492zf.C13805p;
import p494zh.C13872m;
import p496zj.C13934b;
import p496zj.C13937d;
import p496zj.C13938e;
import p496zj.CardRegistrationLandingViewModel;
import p497zk.C13939b;
import p497zk.C13948f;
import p497zk.C13949g;
import p497zk.OnboardingNotificationViewModel;
import p498zl.C13952b;
import p498zl.TakeAwayStoreMapFragment;
import pg.C8622b;
import pg.OnboardingFlowDataSharedPreferences;
import ph.C8623b;
import ph.C8630e;
import ph.C8631f;
import ph.ElectronicInvoiceViewModel;
import pk.C8638b;
import pk.C8646d;
import pk.C8647e;
import pk.InsertPinViewModel;
import presentation.debug.DebugActivity;
import pt.pingodoce.app.PingoDoceApp;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountActivity;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.associations.AssociationsActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.pending.LoyaltyPendingActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate.EditBirthDateActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.email.EditEmailActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.nif.EditNifActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.delete.DeleteAccountActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.ElectronicInvoiceActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEditEmailActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEmailActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone.ElectronicInvoicePhoneActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.status.ElectronicInvoiceStatusActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.madeforyou.MadeForYouActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ChangePinActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity;
import pt.pingodoce.app.presentation.banner.BannerDetailActivity;
import pt.pingodoce.app.presentation.benefits.BenefitsActivity;
import pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment;
import pt.pingodoce.app.presentation.clubs.ClubActivity;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubUpdateActivity;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubWelcomeActivity;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeActivity;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel;
import pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity;
import pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel;
import pt.pingodoce.app.presentation.clubs.wine.WineClubWelcomeActivity;
import pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedActivity;
import pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedViewModel;
import pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity;
import pt.pingodoce.app.presentation.common.loyaltycard.requests.LoyaltyCardInvitesActivity;
import pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardDataConfirmationActivity;
import pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardPreferencesActivity;
import pt.pingodoce.app.presentation.common.loyaltycard.virtualcard.VirtualCardSuccessActivity;
import pt.pingodoce.app.presentation.common.product.ProductDetailActivity;
import pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment;
import pt.pingodoce.app.presentation.common.search.SearchActivity;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;
import pt.pingodoce.app.presentation.common.versioncontrol.VersionControlActivity;
import pt.pingodoce.app.presentation.debug.cache.CacheActivity;
import pt.pingodoce.app.presentation.flyer.FlyerActivity;
import pt.pingodoce.app.presentation.home.HomeActivity;
import pt.pingodoce.app.presentation.home.HomeViewModel;
import pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreActivity;
import pt.pingodoce.app.presentation.home.defaultstore.detail.DefaultStoreDetailActivity;
import pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingActivity;
import pt.pingodoce.app.presentation.home.loyaltycard.registration.CardRegistrationActivity;
import pt.pingodoce.app.presentation.home.loyaltycard.resume.AvailableCardsResumeActivity;
import pt.pingodoce.app.presentation.home.loyaltycard.resume.CardRegistrationResumeActivity;
import pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusActivity;
import pt.pingodoce.app.presentation.home.tailored.TailoredForYouActivity;
import pt.pingodoce.app.presentation.landing.intro.IntroActivity;
import pt.pingodoce.app.presentation.landing.lock.LockActivity;
import pt.pingodoce.app.presentation.landing.lock.LockViewModel;
import pt.pingodoce.app.presentation.landing.splash.SplashActivity;
import pt.pingodoce.app.presentation.landing.walkthrough.AppWalkThroughActivity;
import pt.pingodoce.app.presentation.login.phone.terms.FetchTermsAndConditionsActivity;
import pt.pingodoce.app.presentation.login.phone.terms.TermsAndConditionsActivity;
import pt.pingodoce.app.presentation.login.phone.update.CreatePhoneActivity;
import pt.pingodoce.app.presentation.login.phone.update.UpdatePhoneActivity;
import pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneActivity;
import pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneActivity;
import pt.pingodoce.app.presentation.login.pin.change.RecoverPinActivity;
import pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverActivity;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel;
import pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationActivity;
import pt.pingodoce.app.presentation.login.sms.validate.SmsValidationActivity;
import pt.pingodoce.app.presentation.onboarding.email.OnboardingEmailActivity;
import pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentActivity;
import pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardQuestionActivity;
import pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardRegistrationActivity;
import pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingCardTutorialActivity;
import pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOtherUserCardTutorialActivity;
import pt.pingodoce.app.presentation.onboarding.loyaltycard.OnboardingOwnerInV2Activity;
import pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdActivity;
import pt.pingodoce.app.presentation.onboarding.nif.OnboardingNifActivity;
import pt.pingodoce.app.presentation.onboarding.notifications.OnboardingNotificationActivity;
import pt.pingodoce.app.presentation.onboarding.pin.CreatePinActivity;
import pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity;
import pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeViewModel;
import pt.pingodoce.app.presentation.onboarding.success.OnboardingSuccessActivity;
import pt.pingodoce.app.presentation.onboarding.userdata.insert.UserDataInsertActivity;
import pt.pingodoce.app.presentation.onboarding.userdata.update.UserDataUpdateActivity;
import pt.pingodoce.app.presentation.promotion.PromotionActivity;
import pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailActivity;
import pt.pingodoce.app.presentation.purchases.list.PurchaseListActivity;
import pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;
import pt.pingodoce.app.presentation.shoppinglist.manualsort.ManualSortShoppingListActivity;
import pt.pingodoce.app.presentation.shoppinglist.mylists.C9488a;
import pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity;
import pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingActivity;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingViewModel;
import pt.pingodoce.app.presentation.takeaway.orders.checkout.TakeAwayCheckoutSuccessActivity;
import pt.pingodoce.app.presentation.takeaway.orders.checkout.email.TakeAwayEditEmailActivity;
import pt.pingodoce.app.presentation.takeaway.orders.detail.TakeAwayOrderDetailActivity;
import pt.pingodoce.app.presentation.takeaway.orders.list.TakeAwayOrderListActivity;
import pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreActivity;
import pt.pingodoce.app.presentation.takeaway.pickupstore.detail.TakeAwayStoreDetailActivity;
import pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity;
import pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity;
import pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMenuDetailActivity;
import pt.pingodoce.app.presentation.takeaway.walkthrough.TakeAwayWalkThroughActivity;
import pt.pingodoce.app.services.NotificationLandingActivity;
import pt.pingodoce.app.services.PushNotificationDispatcherActivity;
import pt.pingodoce.app.services.PushNotificationMessagingService;
import retrofit2.Retrofit;
import se.C10177b;
import se.OAuthSharedPrefs;
import sh.C10210d;
import sh.C10218g;
import sh.C10219h;
import sh.ElectronicInvoiceStatusViewModel;
import sj.C10231f;
import sj.C10232h;
import sj.C10233i;
import sj.FlyerViewModel;
import sk.C10234b;
import sk.C10238d;
import sk.C10239e;
import sk.PhoneUpdateSmsValidationViewModel;
import sl.C10250g;
import sl.C10253j;
import sl.C10254k;
import sl.TakeAwayCheckoutSuccessViewModel;
import th.C10621a;
import th.C10625c;
import th.C10626d;
import th.MadeForYouViewModel;
import tk.C10635b;
import tk.C10639d;
import tk.C10640e;
import tk.SmsValidationViewModel;
import tl.C10641b;
import tl.C10642d;
import tl.C10643e;
import tl.TakeAwayEditEmailViewModel;
import uk.C10959b;
import uk.C10961d;
import uk.C10962e;
import uk.OnboardingEmailViewModel;
import vc.C11205c;
import vc.C11207e;
import vg.AuthService;
import vg.BannerService;
import vg.C11258b;
import vg.C11259b0;
import vg.C11273d;
import vg.C11274d0;
import vg.C11279f0;
import vg.C11289h;
import vg.C11290h0;
import vg.C11304j;
import vg.C11305j0;
import vg.C11318l;
import vg.C11319l0;
import vg.C11321n;
import vg.C11326p;
import vg.C11337r;
import vg.C11339t;
import vg.C11345v;
import vg.C11350x;
import vg.C11354z;
import vg.CatalogService;
import vg.ClubService;
import vg.ConsentsService;
import vg.DeviceService;
import vg.EmailService;
import vg.LoyaltyCardService;
import vg.NifService;
import vg.OnboardingService;
import vg.PhoneService;
import vg.PinRecoveryService;
import vg.PurchaseService;
import vg.ShoppingListService;
import vg.SmsService;
import vg.StoreService;
import vg.TakeAwayService;
import vg.UserService;

/* renamed from: xg.x */
/* loaded from: classes2.dex */
public final class C12595x {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a */
    /* loaded from: classes2.dex */
    public static final class C12596a implements InterfaceC13203a.InterfaceC13204a {

        /* renamed from: a */
        private final C12636e f32570a;

        private C12596a(C12636e c12636e) {
            this.f32570a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13203a mo2891c(AnonymousAccountActivity anonymousAccountActivity) {
            C11617f.m4590a(anonymousAccountActivity);
            return new C12606b(this.f32570a, anonymousAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a0 */
    /* loaded from: classes2.dex */
    public static final class C12597a0 implements InterfaceC13293j {

        /* renamed from: a */
        private final C12636e f32571a;

        /* renamed from: b */
        private InterfaceC12341a<CacheActivity> f32572b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32573c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32574d;

        /* renamed from: e */
        private C9918f f32575e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32576f;

        private C12597a0(C12636e c12636e, CacheActivity cacheActivity) {
            this.f32571a = c12636e;
            m2890b(cacheActivity);
        }

        /* renamed from: b */
        private void m2890b(CacheActivity cacheActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(cacheActivity);
            this.f32572b = m4594a;
            this.f32573c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32571a.f32704B2, this.f32571a.f32708C2, this.f32571a.f32712D2));
            this.f32574d = C11613b.m4596a(C5975c.m22544a(this.f32571a.f32703B1));
            C9918f m9705a = C9918f.m9705a(this.f32571a.f32703B1, this.f32571a.f32921z2, this.f32571a.f32819d2, this.f32571a.f32834g2, this.f32571a.f32839h2, this.f32571a.f32764Q2, this.f32571a.f32905v2, this.f32571a.f32804a2, this.f32571a.f32849j2, this.f32571a.f32859l2, this.f32571a.f32869n2, this.f32571a.f32879p2, this.f32571a.f32732I2, this.f32571a.f32897t2, this.f32571a.f32740K2);
            this.f32575e = m9705a;
            this.f32576f = C9919g.m9701c(m9705a);
        }

        /* renamed from: d */
        private CacheActivity m2888d(CacheActivity cacheActivity) {
            C11205c.m5751a(cacheActivity, this.f32571a.m2750Y());
            C5921e.m22726a(cacheActivity, this.f32573c.mo42226get());
            C13872m.m123d(cacheActivity, this.f32574d.mo42226get());
            C13872m.m125b(cacheActivity, (AuthManager) this.f32571a.f32700A2.mo42226get());
            C13872m.m126a(cacheActivity, (AppRatingManager) this.f32571a.f32716E2.mo42226get());
            C13872m.m124c(cacheActivity, (InterfaceC3954c) this.f32571a.f32720F2.mo42226get());
            C9914d.m9714a(cacheActivity, m2886f());
            return cacheActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2887e() {
            return Collections.singletonMap(CacheViewModel.class, (InterfaceC6657b) this.f32576f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2886f() {
            return new ViewModelFactoryByInjection(m2887e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CacheActivity cacheActivity) {
            m2888d(cacheActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a1 */
    /* loaded from: classes2.dex */
    public static final class C12598a1 implements InterfaceC13241d3 {

        /* renamed from: a */
        private final C12636e f32577a;

        /* renamed from: b */
        private C11379e f32578b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f32579c;

        private C12598a1(C12636e c12636e, DefaultStoreMapFragment defaultStoreMapFragment) {
            this.f32577a = c12636e;
            m2885b(defaultStoreMapFragment);
        }

        /* renamed from: b */
        private void m2885b(DefaultStoreMapFragment defaultStoreMapFragment) {
            C11379e m5287a = C11379e.m5287a(this.f32577a.f32703B1, this.f32577a.f32736J2, this.f32577a.f32740K2);
            this.f32578b = m5287a;
            this.f32579c = C11380f.m5283c(m5287a);
        }

        /* renamed from: d */
        private DefaultStoreMapFragment m2883d(DefaultStoreMapFragment defaultStoreMapFragment) {
            C11207e.m5748a(defaultStoreMapFragment, this.f32577a.m2750Y());
            C13467b.m1328a(defaultStoreMapFragment, (TransactionCacheManager) this.f32577a.f32724G2.mo42226get());
            C13467b.m1327b(defaultStoreMapFragment, m2881f());
            return defaultStoreMapFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2882e() {
            return Collections.singletonMap(DefaultStoreViewModel.class, (InterfaceC6657b) this.f32579c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2881f() {
            return new ViewModelFactoryByInjection(m2882e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DefaultStoreMapFragment defaultStoreMapFragment) {
            m2883d(defaultStoreMapFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a2 */
    /* loaded from: classes2.dex */
    public static final class C12599a2 implements InterfaceC13261f3.InterfaceC13262a {

        /* renamed from: a */
        private final C12636e f32580a;

        private C12599a2(C12636e c12636e) {
            this.f32580a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13261f3 mo2891c(FlyersFragment flyersFragment) {
            C11617f.m4590a(flyersFragment);
            return new C12609b2(this.f32580a, flyersFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a3 */
    /* loaded from: classes2.dex */
    public static final class C12600a3 implements InterfaceC13393u0.InterfaceC13394a {

        /* renamed from: a */
        private final C12636e f32581a;

        private C12600a3(C12636e c12636e) {
            this.f32581a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13393u0 mo2891c(MadeForYouActivity madeForYouActivity) {
            C11617f.m4590a(madeForYouActivity);
            return new C12610b3(this.f32581a, madeForYouActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a4 */
    /* loaded from: classes2.dex */
    public static final class C12601a4 implements InterfaceC13287i1.InterfaceC13288a {

        /* renamed from: a */
        private final C12636e f32582a;

        private C12601a4(C12636e c12636e) {
            this.f32582a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13287i1 mo2891c(OnboardingOwnerInV2Activity onboardingOwnerInV2Activity) {
            C11617f.m4590a(onboardingOwnerInV2Activity);
            return new C12611b4(this.f32582a, onboardingOwnerInV2Activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a5 */
    /* loaded from: classes2.dex */
    public static final class C12602a5 implements InterfaceC13271g3.InterfaceC13272a {

        /* renamed from: a */
        private final C12636e f32583a;

        private C12602a5(C12636e c12636e) {
            this.f32583a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13271g3 mo2891c(PurchasesChartFragment purchasesChartFragment) {
            C11617f.m4590a(purchasesChartFragment);
            return new C12612b5(this.f32583a, purchasesChartFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a6 */
    /* loaded from: classes2.dex */
    public static final class C12603a6 implements InterfaceC13209a2.InterfaceC13210a {

        /* renamed from: a */
        private final C12636e f32584a;

        private C12603a6(C12636e c12636e) {
            this.f32584a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13209a2 mo2891c(TailoredForYouActivity tailoredForYouActivity) {
            C11617f.m4590a(tailoredForYouActivity);
            return new C12613b6(this.f32584a, tailoredForYouActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a7 */
    /* loaded from: classes2.dex */
    public static final class C12604a7 implements InterfaceC13331m3.InterfaceC13332a {

        /* renamed from: a */
        private final C12636e f32585a;

        private C12604a7(C12636e c12636e) {
            this.f32585a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13331m3 mo2891c(TakeAwayStoreMapFragment takeAwayStoreMapFragment) {
            C11617f.m4590a(takeAwayStoreMapFragment);
            return new C12614b7(this.f32585a, takeAwayStoreMapFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$a8 */
    /* loaded from: classes2.dex */
    public static final class C12605a8 implements InterfaceC13429y2.InterfaceC13430a {

        /* renamed from: a */
        private final C12636e f32586a;

        private C12605a8(C12636e c12636e) {
            this.f32586a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13429y2 mo2891c(WineClubUpdateActivity wineClubUpdateActivity) {
            C11617f.m4590a(wineClubUpdateActivity);
            return new C12615b8(this.f32586a, wineClubUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b */
    /* loaded from: classes2.dex */
    public static final class C12606b implements InterfaceC13203a {

        /* renamed from: a */
        private final C12636e f32587a;

        /* renamed from: b */
        private InterfaceC12341a<AnonymousAccountActivity> f32588b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32589c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32590d;

        /* renamed from: e */
        private C0142e f32591e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32592f;

        private C12606b(C12636e c12636e, AnonymousAccountActivity anonymousAccountActivity) {
            this.f32587a = c12636e;
            m2873b(anonymousAccountActivity);
        }

        /* renamed from: b */
        private void m2873b(AnonymousAccountActivity anonymousAccountActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(anonymousAccountActivity);
            this.f32588b = m4594a;
            this.f32589c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32587a.f32704B2, this.f32587a.f32708C2, this.f32587a.f32712D2));
            this.f32590d = C11613b.m4596a(C5975c.m22544a(this.f32587a.f32703B1));
            C0142e m41767a = C0142e.m41767a(this.f32587a.f32703B1, this.f32587a.f32740K2);
            this.f32591e = m41767a;
            this.f32592f = C0143f.m41763c(m41767a);
        }

        /* renamed from: d */
        private AnonymousAccountActivity m2871d(AnonymousAccountActivity anonymousAccountActivity) {
            C11205c.m5751a(anonymousAccountActivity, this.f32587a.m2750Y());
            C5921e.m22726a(anonymousAccountActivity, this.f32589c.mo42226get());
            C13872m.m123d(anonymousAccountActivity, this.f32590d.mo42226get());
            C13872m.m125b(anonymousAccountActivity, (AuthManager) this.f32587a.f32700A2.mo42226get());
            C13872m.m126a(anonymousAccountActivity, (AppRatingManager) this.f32587a.f32716E2.mo42226get());
            C13872m.m124c(anonymousAccountActivity, (InterfaceC3954c) this.f32587a.f32720F2.mo42226get());
            C0140c.m41768a(anonymousAccountActivity, m2869f());
            return anonymousAccountActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2870e() {
            return Collections.singletonMap(AnonymousAccountViewModel.class, (InterfaceC6657b) this.f32592f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2869f() {
            return new ViewModelFactoryByInjection(m2870e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(AnonymousAccountActivity anonymousAccountActivity) {
            m2871d(anonymousAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b0 */
    /* loaded from: classes2.dex */
    public static final class C12607b0 implements InterfaceC13323m.InterfaceC13324a {

        /* renamed from: a */
        private final C12636e f32593a;

        private C12607b0(C12636e c12636e) {
            this.f32593a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13323m mo2891c(CardRegistrationActivity cardRegistrationActivity) {
            C11617f.m4590a(cardRegistrationActivity);
            return new C12617c0(this.f32593a, cardRegistrationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b1 */
    /* loaded from: classes2.dex */
    public static final class C12608b1 implements InterfaceC13415x.InterfaceC13416a {

        /* renamed from: a */
        private final C12636e f32594a;

        private C12608b1(C12636e c12636e) {
            this.f32594a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13415x mo2891c(DeleteAccountActivity deleteAccountActivity) {
            C11617f.m4590a(deleteAccountActivity);
            return new C12618c1(this.f32594a, deleteAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b2 */
    /* loaded from: classes2.dex */
    public static final class C12609b2 implements InterfaceC13261f3 {

        /* renamed from: a */
        private final C12636e f32595a;

        private C12609b2(C12636e c12636e, FlyersFragment flyersFragment) {
            this.f32595a = c12636e;
        }

        /* renamed from: c */
        private FlyersFragment m2865c(FlyersFragment flyersFragment) {
            C11207e.m5748a(flyersFragment, this.f32595a.m2750Y());
            C0138c.m41771a(flyersFragment, (TransactionCacheManager) this.f32595a.f32724G2.mo42226get());
            return flyersFragment;
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: b */
        public void mo2889c(FlyersFragment flyersFragment) {
            m2865c(flyersFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b3 */
    /* loaded from: classes2.dex */
    public static final class C12610b3 implements InterfaceC13393u0 {

        /* renamed from: a */
        private final C12636e f32596a;

        /* renamed from: b */
        private InterfaceC12341a<MadeForYouActivity> f32597b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32598c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32599d;

        /* renamed from: e */
        private C10625c f32600e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32601f;

        private C12610b3(C12636e c12636e, MadeForYouActivity madeForYouActivity) {
            this.f32596a = c12636e;
            m2864b(madeForYouActivity);
        }

        /* renamed from: b */
        private void m2864b(MadeForYouActivity madeForYouActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(madeForYouActivity);
            this.f32597b = m4594a;
            this.f32598c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32596a.f32704B2, this.f32596a.f32708C2, this.f32596a.f32712D2));
            this.f32599d = C11613b.m4596a(C5975c.m22544a(this.f32596a.f32703B1));
            C10625c m7470a = C10625c.m7470a(this.f32596a.f32703B1, this.f32596a.f32740K2, this.f32596a.f32740K2);
            this.f32600e = m7470a;
            this.f32601f = C10626d.m7466c(m7470a);
        }

        /* renamed from: d */
        private MadeForYouActivity m2862d(MadeForYouActivity madeForYouActivity) {
            C11205c.m5751a(madeForYouActivity, this.f32596a.m2750Y());
            C5921e.m22726a(madeForYouActivity, this.f32598c.mo42226get());
            C13872m.m123d(madeForYouActivity, this.f32599d.mo42226get());
            C13872m.m125b(madeForYouActivity, (AuthManager) this.f32596a.f32700A2.mo42226get());
            C13872m.m126a(madeForYouActivity, (AppRatingManager) this.f32596a.f32716E2.mo42226get());
            C13872m.m124c(madeForYouActivity, (InterfaceC3954c) this.f32596a.f32720F2.mo42226get());
            C10621a.m7483a(madeForYouActivity, m2860f());
            return madeForYouActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2861e() {
            return Collections.singletonMap(MadeForYouViewModel.class, (InterfaceC6657b) this.f32601f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2860f() {
            return new ViewModelFactoryByInjection(m2861e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(MadeForYouActivity madeForYouActivity) {
            m2862d(madeForYouActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b4 */
    /* loaded from: classes2.dex */
    public static final class C12611b4 implements InterfaceC13287i1 {

        /* renamed from: a */
        private final C12636e f32602a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingOwnerInV2Activity> f32603b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32604c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32605d;

        /* renamed from: e */
        private C12178b0 f32606e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32607f;

        private C12611b4(C12636e c12636e, OnboardingOwnerInV2Activity onboardingOwnerInV2Activity) {
            this.f32602a = c12636e;
            m2859b(onboardingOwnerInV2Activity);
        }

        /* renamed from: b */
        private void m2859b(OnboardingOwnerInV2Activity onboardingOwnerInV2Activity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingOwnerInV2Activity);
            this.f32603b = m4594a;
            this.f32604c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32602a.f32704B2, this.f32602a.f32708C2, this.f32602a.f32712D2));
            this.f32605d = C11613b.m4596a(C5975c.m22544a(this.f32602a.f32703B1));
            C12178b0 m3463a = C12178b0.m3463a(this.f32602a.f32703B1, this.f32602a.f32740K2);
            this.f32606e = m3463a;
            this.f32607f = C12180c0.m3459c(m3463a);
        }

        /* renamed from: d */
        private OnboardingOwnerInV2Activity m2857d(OnboardingOwnerInV2Activity onboardingOwnerInV2Activity) {
            C11205c.m5751a(onboardingOwnerInV2Activity, this.f32602a.m2750Y());
            C5921e.m22726a(onboardingOwnerInV2Activity, this.f32604c.mo42226get());
            C13872m.m123d(onboardingOwnerInV2Activity, this.f32605d.mo42226get());
            C13872m.m125b(onboardingOwnerInV2Activity, (AuthManager) this.f32602a.f32700A2.mo42226get());
            C13872m.m126a(onboardingOwnerInV2Activity, (AppRatingManager) this.f32602a.f32716E2.mo42226get());
            C13872m.m124c(onboardingOwnerInV2Activity, (InterfaceC3954c) this.f32602a.f32720F2.mo42226get());
            C12199x.m3411a(onboardingOwnerInV2Activity, m2855f());
            return onboardingOwnerInV2Activity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2856e() {
            return Collections.singletonMap(OnboardingOwnerInV2ViewModel.class, (InterfaceC6657b) this.f32607f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2855f() {
            return new ViewModelFactoryByInjection(m2856e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingOwnerInV2Activity onboardingOwnerInV2Activity) {
            m2857d(onboardingOwnerInV2Activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b5 */
    /* loaded from: classes2.dex */
    public static final class C12612b5 implements InterfaceC13271g3 {

        /* renamed from: a */
        private final C12636e f32608a;

        /* renamed from: b */
        private C6146e f32609b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f32610c;

        private C12612b5(C12636e c12636e, PurchasesChartFragment purchasesChartFragment) {
            this.f32608a = c12636e;
            m2854b(purchasesChartFragment);
        }

        /* renamed from: b */
        private void m2854b(PurchasesChartFragment purchasesChartFragment) {
            C6146e m22068a = C6146e.m22068a(this.f32608a.f32703B1, this.f32608a.f32780U2, this.f32608a.f32880p3, this.f32608a.f32740K2);
            this.f32609b = m22068a;
            this.f32610c = C6147f.m22064c(m22068a);
        }

        /* renamed from: d */
        private PurchasesChartFragment m2852d(PurchasesChartFragment purchasesChartFragment) {
            C11207e.m5748a(purchasesChartFragment, this.f32608a.m2750Y());
            C6139c.m22086a(purchasesChartFragment, m2850f());
            return purchasesChartFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2851e() {
            return Collections.singletonMap(PurchasesChartViewModel.class, (InterfaceC6657b) this.f32610c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2850f() {
            return new ViewModelFactoryByInjection(m2851e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PurchasesChartFragment purchasesChartFragment) {
            m2852d(purchasesChartFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b6 */
    /* loaded from: classes2.dex */
    public static final class C12613b6 implements InterfaceC13209a2 {

        /* renamed from: a */
        private final C12636e f32611a;

        /* renamed from: b */
        private InterfaceC12341a<TailoredForYouActivity> f32612b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32613c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32614d;

        /* renamed from: e */
        private C4888e f32615e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32616f;

        private C12613b6(C12636e c12636e, TailoredForYouActivity tailoredForYouActivity) {
            this.f32611a = c12636e;
            m2849b(tailoredForYouActivity);
        }

        /* renamed from: b */
        private void m2849b(TailoredForYouActivity tailoredForYouActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(tailoredForYouActivity);
            this.f32612b = m4594a;
            this.f32613c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32611a.f32704B2, this.f32611a.f32708C2, this.f32611a.f32712D2));
            this.f32614d = C11613b.m4596a(C5975c.m22544a(this.f32611a.f32703B1));
            C4888e m26357a = C4888e.m26357a(this.f32611a.f32703B1, this.f32611a.f32756O2, this.f32611a.f32744L2, this.f32611a.f32740K2);
            this.f32615e = m26357a;
            this.f32616f = C4889f.m26353c(m26357a);
        }

        /* renamed from: d */
        private TailoredForYouActivity m2847d(TailoredForYouActivity tailoredForYouActivity) {
            C11205c.m5751a(tailoredForYouActivity, this.f32611a.m2750Y());
            C5921e.m22726a(tailoredForYouActivity, this.f32613c.mo42226get());
            C13872m.m123d(tailoredForYouActivity, this.f32614d.mo42226get());
            C13872m.m125b(tailoredForYouActivity, (AuthManager) this.f32611a.f32700A2.mo42226get());
            C13872m.m126a(tailoredForYouActivity, (AppRatingManager) this.f32611a.f32716E2.mo42226get());
            C13872m.m124c(tailoredForYouActivity, (InterfaceC3954c) this.f32611a.f32720F2.mo42226get());
            C4887c.m26359a(tailoredForYouActivity, m2845f());
            return tailoredForYouActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2846e() {
            return Collections.singletonMap(TailoredForYouViewModel.class, (InterfaceC6657b) this.f32616f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2845f() {
            return new ViewModelFactoryByInjection(m2846e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TailoredForYouActivity tailoredForYouActivity) {
            m2847d(tailoredForYouActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b7 */
    /* loaded from: classes2.dex */
    public static final class C12614b7 implements InterfaceC13331m3 {

        /* renamed from: a */
        private final C12636e f32617a;

        /* renamed from: b */
        private C12207e f32618b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f32619c;

        private C12614b7(C12636e c12636e, TakeAwayStoreMapFragment takeAwayStoreMapFragment) {
            this.f32617a = c12636e;
            m2844b(takeAwayStoreMapFragment);
        }

        /* renamed from: b */
        private void m2844b(TakeAwayStoreMapFragment takeAwayStoreMapFragment) {
            C12207e m3393a = C12207e.m3393a(this.f32617a.f32703B1, this.f32617a.f32865m3, this.f32617a.f32736J2, this.f32617a.f32740K2);
            this.f32618b = m3393a;
            this.f32619c = C12208f.m3389c(m3393a);
        }

        /* renamed from: d */
        private TakeAwayStoreMapFragment m2842d(TakeAwayStoreMapFragment takeAwayStoreMapFragment) {
            C11207e.m5748a(takeAwayStoreMapFragment, this.f32617a.m2750Y());
            C13952b.m1a(takeAwayStoreMapFragment, (TransactionCacheManager) this.f32617a.f32724G2.mo42226get());
            C13952b.m0b(takeAwayStoreMapFragment, m2840f());
            return takeAwayStoreMapFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2841e() {
            return Collections.singletonMap(TakeAwayStoreViewModel.class, (InterfaceC6657b) this.f32619c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2840f() {
            return new ViewModelFactoryByInjection(m2841e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayStoreMapFragment takeAwayStoreMapFragment) {
            m2842d(takeAwayStoreMapFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$b8 */
    /* loaded from: classes2.dex */
    public static final class C12615b8 implements InterfaceC13429y2 {

        /* renamed from: a */
        private final C12636e f32620a;

        /* renamed from: b */
        private InterfaceC12341a<WineClubUpdateActivity> f32621b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32622c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32623d;

        /* renamed from: e */
        private C6475a0 f32624e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32625f;

        private C12615b8(C12636e c12636e, WineClubUpdateActivity wineClubUpdateActivity) {
            this.f32620a = c12636e;
            m2839b(wineClubUpdateActivity);
        }

        /* renamed from: b */
        private void m2839b(WineClubUpdateActivity wineClubUpdateActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(wineClubUpdateActivity);
            this.f32621b = m4594a;
            this.f32622c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32620a.f32704B2, this.f32620a.f32708C2, this.f32620a.f32712D2));
            this.f32623d = C11613b.m4596a(C5975c.m22544a(this.f32620a.f32703B1));
            C6475a0 m20840a = C6475a0.m20840a(this.f32620a.f32850j3, this.f32620a.f32909w2, this.f32620a.f32703B1, this.f32620a.f32771S1, this.f32620a.f32740K2);
            this.f32624e = m20840a;
            this.f32625f = C6477b0.m20836c(m20840a);
        }

        /* renamed from: d */
        private WineClubUpdateActivity m2837d(WineClubUpdateActivity wineClubUpdateActivity) {
            C11205c.m5751a(wineClubUpdateActivity, this.f32620a.m2750Y());
            C5921e.m22726a(wineClubUpdateActivity, this.f32622c.mo42226get());
            C13872m.m123d(wineClubUpdateActivity, this.f32623d.mo42226get());
            C13872m.m125b(wineClubUpdateActivity, (AuthManager) this.f32620a.f32700A2.mo42226get());
            C13872m.m126a(wineClubUpdateActivity, (AppRatingManager) this.f32620a.f32716E2.mo42226get());
            C13872m.m124c(wineClubUpdateActivity, (InterfaceC3954c) this.f32620a.f32720F2.mo42226get());
            C6509z.m20781a(wineClubUpdateActivity, m2835f());
            return wineClubUpdateActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2836e() {
            return Collections.singletonMap(WineClubUpdateViewModel.class, (InterfaceC6657b) this.f32625f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2835f() {
            return new ViewModelFactoryByInjection(m2836e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(WineClubUpdateActivity wineClubUpdateActivity) {
            m2837d(wineClubUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c */
    /* loaded from: classes2.dex */
    public static final class C12616c implements InterfaceC13213b.InterfaceC13214a {

        /* renamed from: a */
        private final C12636e f32626a;

        private C12616c(C12636e c12636e) {
            this.f32626a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13213b mo2891c(AnonymousSessionTakeAwayLandingActivity anonymousSessionTakeAwayLandingActivity) {
            C11617f.m4590a(anonymousSessionTakeAwayLandingActivity);
            return new C12626d(this.f32626a, anonymousSessionTakeAwayLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c0 */
    /* loaded from: classes2.dex */
    public static final class C12617c0 implements InterfaceC13323m {

        /* renamed from: a */
        private final C12636e f32627a;

        /* renamed from: b */
        private InterfaceC12341a<CardRegistrationActivity> f32628b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32629c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32630d;

        /* renamed from: e */
        private C0200d f32631e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32632f;

        private C12617c0(C12636e c12636e, CardRegistrationActivity cardRegistrationActivity) {
            this.f32627a = c12636e;
            m2833b(cardRegistrationActivity);
        }

        /* renamed from: b */
        private void m2833b(CardRegistrationActivity cardRegistrationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(cardRegistrationActivity);
            this.f32628b = m4594a;
            this.f32629c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32627a.f32704B2, this.f32627a.f32708C2, this.f32627a.f32712D2));
            this.f32630d = C11613b.m4596a(C5975c.m22544a(this.f32627a.f32703B1));
            C0200d m41594a = C0200d.m41594a(this.f32627a.f32703B1, this.f32627a.f32796Y2, this.f32627a.f32771S1, this.f32627a.f32740K2);
            this.f32631e = m41594a;
            this.f32632f = C0201e.m41590c(m41594a);
        }

        /* renamed from: d */
        private CardRegistrationActivity m2831d(CardRegistrationActivity cardRegistrationActivity) {
            C11205c.m5751a(cardRegistrationActivity, this.f32627a.m2750Y());
            C5921e.m22726a(cardRegistrationActivity, this.f32629c.mo42226get());
            C13872m.m123d(cardRegistrationActivity, this.f32630d.mo42226get());
            C13872m.m125b(cardRegistrationActivity, (AuthManager) this.f32627a.f32700A2.mo42226get());
            C13872m.m126a(cardRegistrationActivity, (AppRatingManager) this.f32627a.f32716E2.mo42226get());
            C13872m.m124c(cardRegistrationActivity, (InterfaceC3954c) this.f32627a.f32720F2.mo42226get());
            C0197b.m41598a(cardRegistrationActivity, m2829f());
            return cardRegistrationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2830e() {
            return Collections.singletonMap(CardRegistrationViewModel.class, (InterfaceC6657b) this.f32632f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2829f() {
            return new ViewModelFactoryByInjection(m2830e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CardRegistrationActivity cardRegistrationActivity) {
            m2831d(cardRegistrationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c1 */
    /* loaded from: classes2.dex */
    public static final class C12618c1 implements InterfaceC13415x {

        /* renamed from: a */
        private final C12636e f32633a;

        /* renamed from: b */
        private InterfaceC12341a<DeleteAccountActivity> f32634b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32635c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32636d;

        /* renamed from: e */
        private C8086d f32637e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32638f;

        private C12618c1(C12636e c12636e, DeleteAccountActivity deleteAccountActivity) {
            this.f32633a = c12636e;
            m2828b(deleteAccountActivity);
        }

        /* renamed from: b */
        private void m2828b(DeleteAccountActivity deleteAccountActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(deleteAccountActivity);
            this.f32634b = m4594a;
            this.f32635c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32633a.f32704B2, this.f32633a.f32708C2, this.f32633a.f32712D2));
            this.f32636d = C11613b.m4596a(C5975c.m22544a(this.f32633a.f32703B1));
            C8086d m16949a = C8086d.m16949a(this.f32633a.f32703B1, this.f32633a.f32700A2, this.f32633a.f32820d3, this.f32633a.f32825e3, this.f32633a.f32815c3, this.f32633a.f32711D1, this.f32633a.f32771S1, this.f32633a.f32740K2, this.f32633a.f32740K2);
            this.f32637e = m16949a;
            this.f32638f = C8087e.m16945c(m16949a);
        }

        /* renamed from: d */
        private DeleteAccountActivity m2826d(DeleteAccountActivity deleteAccountActivity) {
            C11205c.m5751a(deleteAccountActivity, this.f32633a.m2750Y());
            C5921e.m22726a(deleteAccountActivity, this.f32635c.mo42226get());
            C13872m.m123d(deleteAccountActivity, this.f32636d.mo42226get());
            C13872m.m125b(deleteAccountActivity, (AuthManager) this.f32633a.f32700A2.mo42226get());
            C13872m.m126a(deleteAccountActivity, (AppRatingManager) this.f32633a.f32716E2.mo42226get());
            C13872m.m124c(deleteAccountActivity, (InterfaceC3954c) this.f32633a.f32720F2.mo42226get());
            C8083b.m16956a(deleteAccountActivity, m2824f());
            return deleteAccountActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2825e() {
            return Collections.singletonMap(DeleteAccountViewModel.class, (InterfaceC6657b) this.f32638f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2824f() {
            return new ViewModelFactoryByInjection(m2825e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DeleteAccountActivity deleteAccountActivity) {
            m2826d(deleteAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c2 */
    /* loaded from: classes2.dex */
    public static final class C12619c2 implements InterfaceC13285i0.InterfaceC13286a {

        /* renamed from: a */
        private final C12636e f32639a;

        private C12619c2(C12636e c12636e) {
            this.f32639a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13285i0 mo2891c(HomeActivity homeActivity) {
            C11617f.m4590a(homeActivity);
            return new C12629d2(this.f32639a, homeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c3 */
    /* loaded from: classes2.dex */
    public static final class C12620c3 implements InterfaceC13401v0.InterfaceC13402a {

        /* renamed from: a */
        private final C12636e f32640a;

        private C12620c3(C12636e c12636e) {
            this.f32640a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13401v0 mo2891c(ManualSortShoppingListActivity manualSortShoppingListActivity) {
            C11617f.m4590a(manualSortShoppingListActivity);
            return new C12630d3(this.f32640a, manualSortShoppingListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c4 */
    /* loaded from: classes2.dex */
    public static final class C12621c4 implements InterfaceC13267g1.InterfaceC13268a {

        /* renamed from: a */
        private final C12636e f32641a;

        private C12621c4(C12636e c12636e) {
            this.f32641a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13267g1 mo2891c(OnboardingResumeActivity onboardingResumeActivity) {
            C11617f.m4590a(onboardingResumeActivity);
            return new C12631d4(this.f32641a, onboardingResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c5 */
    /* loaded from: classes2.dex */
    public static final class C12622c5 implements InterfaceC13281h3.InterfaceC13282a {

        /* renamed from: a */
        private final C12636e f32642a;

        private C12622c5(C12636e c12636e) {
            this.f32642a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13281h3 mo2891c(PurchasesRecentFragment purchasesRecentFragment) {
            C11617f.m4590a(purchasesRecentFragment);
            return new C12632d5(this.f32642a, purchasesRecentFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c6 */
    /* loaded from: classes2.dex */
    public static final class C12623c6 implements InterfaceC13219b2.InterfaceC13220a {

        /* renamed from: a */
        private final C12636e f32643a;

        private C12623c6(C12636e c12636e) {
            this.f32643a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13219b2 mo2891c(TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity) {
            C11617f.m4590a(takeAwayCheckoutSuccessActivity);
            return new C12633d6(this.f32643a, takeAwayCheckoutSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c7 */
    /* loaded from: classes2.dex */
    public static final class C12624c7 implements InterfaceC13319l2.InterfaceC13320a {

        /* renamed from: a */
        private final C12636e f32644a;

        private C12624c7(C12636e c12636e) {
            this.f32644a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13319l2 mo2891c(TakeAwayWalkThroughActivity takeAwayWalkThroughActivity) {
            C11617f.m4590a(takeAwayWalkThroughActivity);
            return new C12634d7(this.f32644a, takeAwayWalkThroughActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$c8 */
    /* loaded from: classes2.dex */
    public static final class C12625c8 implements InterfaceC13437z2.InterfaceC13438a {

        /* renamed from: a */
        private final C12636e f32645a;

        private C12625c8(C12636e c12636e) {
            this.f32645a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13437z2 mo2891c(WineClubWelcomeActivity wineClubWelcomeActivity) {
            C11617f.m4590a(wineClubWelcomeActivity);
            return new C12635d8(this.f32645a, wineClubWelcomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d */
    /* loaded from: classes2.dex */
    public static final class C12626d implements InterfaceC13213b {

        /* renamed from: a */
        private final C12636e f32646a;

        /* renamed from: b */
        private InterfaceC12341a<AnonymousSessionTakeAwayLandingActivity> f32647b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32648c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32649d;

        /* renamed from: e */
        private C9931c f32650e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32651f;

        /* renamed from: g */
        private C7483b f32652g;

        /* renamed from: h */
        private InterfaceC12341a<Object> f32653h;

        private C12626d(C12636e c12636e, AnonymousSessionTakeAwayLandingActivity anonymousSessionTakeAwayLandingActivity) {
            this.f32646a = c12636e;
            m2816b(anonymousSessionTakeAwayLandingActivity);
        }

        /* renamed from: b */
        private void m2816b(AnonymousSessionTakeAwayLandingActivity anonymousSessionTakeAwayLandingActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(anonymousSessionTakeAwayLandingActivity);
            this.f32647b = m4594a;
            this.f32648c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32646a.f32704B2, this.f32646a.f32708C2, this.f32646a.f32712D2));
            this.f32649d = C11613b.m4596a(C5975c.m22544a(this.f32646a.f32703B1));
            C9931c m9663a = C9931c.m9663a(this.f32646a.f32703B1, this.f32646a.f32771S1, this.f32646a.f32768R2, this.f32646a.f32740K2, this.f32646a.f32740K2);
            this.f32650e = m9663a;
            this.f32651f = C9932d.m9659c(m9663a);
            C7483b m18388a = C7483b.m18388a(this.f32646a.f32703B1, this.f32646a.f32756O2, this.f32646a.f32865m3, this.f32646a.f32740K2);
            this.f32652g = m18388a;
            this.f32653h = C7484c.m18384c(m18388a);
        }

        /* renamed from: d */
        private AnonymousSessionTakeAwayLandingActivity m2814d(AnonymousSessionTakeAwayLandingActivity anonymousSessionTakeAwayLandingActivity) {
            C11205c.m5751a(anonymousSessionTakeAwayLandingActivity, this.f32646a.m2750Y());
            C5921e.m22726a(anonymousSessionTakeAwayLandingActivity, this.f32648c.mo42226get());
            C13872m.m123d(anonymousSessionTakeAwayLandingActivity, this.f32649d.mo42226get());
            C13872m.m125b(anonymousSessionTakeAwayLandingActivity, (AuthManager) this.f32646a.f32700A2.mo42226get());
            C13872m.m126a(anonymousSessionTakeAwayLandingActivity, (AppRatingManager) this.f32646a.f32716E2.mo42226get());
            C13872m.m124c(anonymousSessionTakeAwayLandingActivity, (InterfaceC3954c) this.f32646a.f32720F2.mo42226get());
            C7909c.m17604a(anonymousSessionTakeAwayLandingActivity, m2812f());
            C9929a.m9664a(anonymousSessionTakeAwayLandingActivity, m2812f());
            return anonymousSessionTakeAwayLandingActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2813e() {
            return C11616e.m4592b(2).m4591c(AnonymousSessionTakeAwayLandingViewModel.class, (InterfaceC6657b) this.f32651f.mo42226get()).m4591c(BottomNavigationViewModel.class, (InterfaceC6657b) this.f32653h.mo42226get()).m4593a();
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2812f() {
            return new ViewModelFactoryByInjection(m2813e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(AnonymousSessionTakeAwayLandingActivity anonymousSessionTakeAwayLandingActivity) {
            m2814d(anonymousSessionTakeAwayLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d0 */
    /* loaded from: classes2.dex */
    public static final class C12627d0 implements InterfaceC13333n.InterfaceC13334a {

        /* renamed from: a */
        private final C12636e f32654a;

        private C12627d0(C12636e c12636e) {
            this.f32654a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13333n mo2891c(CardRegistrationLandingActivity cardRegistrationLandingActivity) {
            C11617f.m4590a(cardRegistrationLandingActivity);
            return new C12755e0(this.f32654a, cardRegistrationLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d1 */
    /* loaded from: classes2.dex */
    public static final class C12628d1 implements InterfaceC13423y.InterfaceC13424a {

        /* renamed from: a */
        private final C12636e f32655a;

        private C12628d1(C12636e c12636e) {
            this.f32655a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13423y mo2891c(EditBirthDateActivity editBirthDateActivity) {
            C11617f.m4590a(editBirthDateActivity);
            return new C12756e1(this.f32655a, editBirthDateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d2 */
    /* loaded from: classes2.dex */
    public static final class C12629d2 implements InterfaceC13285i0 {

        /* renamed from: a */
        private final C12636e f32656a;

        /* renamed from: b */
        private InterfaceC12341a<HomeActivity> f32657b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32658c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32659d;

        /* renamed from: e */
        private C10918c0 f32660e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32661f;

        /* renamed from: g */
        private C7483b f32662g;

        /* renamed from: h */
        private InterfaceC12341a<Object> f32663h;

        private C12629d2(C12636e c12636e, HomeActivity homeActivity) {
            this.f32656a = c12636e;
            m2809b(homeActivity);
        }

        /* renamed from: b */
        private void m2809b(HomeActivity homeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(homeActivity);
            this.f32657b = m4594a;
            this.f32658c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32656a.f32704B2, this.f32656a.f32708C2, this.f32656a.f32712D2));
            this.f32659d = C11613b.m4596a(C5975c.m22544a(this.f32656a.f32703B1));
            C10918c0 m6750a = C10918c0.m6750a(this.f32656a.f32703B1, this.f32656a.f32756O2, this.f32656a.f32780U2, this.f32656a.f32736J2, this.f32656a.f32855k3, this.f32656a.f32744L2, this.f32656a.f32850j3, this.f32656a.f32768R2, this.f32656a.f32740K2, this.f32656a.f32740K2);
            this.f32660e = m6750a;
            this.f32661f = C10920d0.m6746c(m6750a);
            C7483b m18388a = C7483b.m18388a(this.f32656a.f32703B1, this.f32656a.f32756O2, this.f32656a.f32865m3, this.f32656a.f32740K2);
            this.f32662g = m18388a;
            this.f32663h = C7484c.m18384c(m18388a);
        }

        /* renamed from: d */
        private HomeActivity m2807d(HomeActivity homeActivity) {
            C11205c.m5751a(homeActivity, this.f32656a.m2750Y());
            C5921e.m22726a(homeActivity, this.f32658c.mo42226get());
            C13872m.m123d(homeActivity, this.f32659d.mo42226get());
            C13872m.m125b(homeActivity, (AuthManager) this.f32656a.f32700A2.mo42226get());
            C13872m.m126a(homeActivity, (AppRatingManager) this.f32656a.f32716E2.mo42226get());
            C13872m.m124c(homeActivity, (InterfaceC3954c) this.f32656a.f32720F2.mo42226get());
            C7909c.m17604a(homeActivity, m2805f());
            C10937v.m6739c(homeActivity, (StoreManager) this.f32656a.f32736J2.mo42226get());
            C10937v.m6741a(homeActivity, (TransactionCacheManager) this.f32656a.f32724G2.mo42226get());
            C10937v.m6740b(homeActivity, m2805f());
            return homeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2806e() {
            return C11616e.m4592b(2).m4591c(HomeViewModel.class, (InterfaceC6657b) this.f32661f.mo42226get()).m4591c(BottomNavigationViewModel.class, (InterfaceC6657b) this.f32663h.mo42226get()).m4593a();
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2805f() {
            return new ViewModelFactoryByInjection(m2806e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(HomeActivity homeActivity) {
            m2807d(homeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d3 */
    /* loaded from: classes2.dex */
    public static final class C12630d3 implements InterfaceC13401v0 {

        /* renamed from: a */
        private final C12636e f32664a;

        /* renamed from: b */
        private InterfaceC12341a<ManualSortShoppingListActivity> f32665b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32666c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32667d;

        /* renamed from: e */
        private C7079h f32668e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32669f;

        private C12630d3(C12636e c12636e, ManualSortShoppingListActivity manualSortShoppingListActivity) {
            this.f32664a = c12636e;
            m2804b(manualSortShoppingListActivity);
        }

        /* renamed from: b */
        private void m2804b(ManualSortShoppingListActivity manualSortShoppingListActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(manualSortShoppingListActivity);
            this.f32665b = m4594a;
            this.f32666c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32664a.f32704B2, this.f32664a.f32708C2, this.f32664a.f32712D2));
            this.f32667d = C11613b.m4596a(C5975c.m22544a(this.f32664a.f32703B1));
            C7079h m19350a = C7079h.m19350a(this.f32664a.f32703B1, this.f32664a.f32756O2, this.f32664a.f32740K2);
            this.f32668e = m19350a;
            this.f32669f = C7080i.m19346c(m19350a);
        }

        /* renamed from: d */
        private ManualSortShoppingListActivity m2802d(ManualSortShoppingListActivity manualSortShoppingListActivity) {
            C11205c.m5751a(manualSortShoppingListActivity, this.f32664a.m2750Y());
            C5921e.m22726a(manualSortShoppingListActivity, this.f32666c.mo42226get());
            C13872m.m123d(manualSortShoppingListActivity, this.f32667d.mo42226get());
            C13872m.m125b(manualSortShoppingListActivity, (AuthManager) this.f32664a.f32700A2.mo42226get());
            C13872m.m126a(manualSortShoppingListActivity, (AppRatingManager) this.f32664a.f32716E2.mo42226get());
            C13872m.m124c(manualSortShoppingListActivity, (InterfaceC3954c) this.f32664a.f32720F2.mo42226get());
            C7074e.m19365a(manualSortShoppingListActivity, m2800f());
            return manualSortShoppingListActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2801e() {
            return Collections.singletonMap(ManualSortShoppingListViewModel.class, (InterfaceC6657b) this.f32669f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2800f() {
            return new ViewModelFactoryByInjection(m2801e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ManualSortShoppingListActivity manualSortShoppingListActivity) {
            m2802d(manualSortShoppingListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d4 */
    /* loaded from: classes2.dex */
    public static final class C12631d4 implements InterfaceC13267g1 {

        /* renamed from: a */
        private final C12636e f32670a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingResumeActivity> f32671b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32672c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32673d;

        /* renamed from: e */
        private C1944e f32674e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32675f;

        private C12631d4(C12636e c12636e, OnboardingResumeActivity onboardingResumeActivity) {
            this.f32670a = c12636e;
            m2799b(onboardingResumeActivity);
        }

        /* renamed from: b */
        private void m2799b(OnboardingResumeActivity onboardingResumeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingResumeActivity);
            this.f32671b = m4594a;
            this.f32672c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32670a.f32704B2, this.f32670a.f32708C2, this.f32670a.f32712D2));
            this.f32673d = C11613b.m4596a(C5975c.m22544a(this.f32670a.f32703B1));
            C1944e m35082a = C1944e.m35082a(this.f32670a.f32703B1, this.f32670a.f32771S1, this.f32670a.f32740K2);
            this.f32674e = m35082a;
            this.f32675f = C1945f.m35078c(m35082a);
        }

        /* renamed from: d */
        private OnboardingResumeActivity m2797d(OnboardingResumeActivity onboardingResumeActivity) {
            C11205c.m5751a(onboardingResumeActivity, this.f32670a.m2750Y());
            C5921e.m22726a(onboardingResumeActivity, this.f32672c.mo42226get());
            C13872m.m123d(onboardingResumeActivity, this.f32673d.mo42226get());
            C13872m.m125b(onboardingResumeActivity, (AuthManager) this.f32670a.f32700A2.mo42226get());
            C13872m.m126a(onboardingResumeActivity, (AppRatingManager) this.f32670a.f32716E2.mo42226get());
            C13872m.m124c(onboardingResumeActivity, (InterfaceC3954c) this.f32670a.f32720F2.mo42226get());
            C1942c.m35083a(onboardingResumeActivity, m2795f());
            return onboardingResumeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2796e() {
            return Collections.singletonMap(OnboardingResumeViewModel.class, (InterfaceC6657b) this.f32675f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2795f() {
            return new ViewModelFactoryByInjection(m2796e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingResumeActivity onboardingResumeActivity) {
            m2797d(onboardingResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d5 */
    /* loaded from: classes2.dex */
    public static final class C12632d5 implements InterfaceC13281h3 {

        /* renamed from: a */
        private final C12636e f32676a;

        /* renamed from: b */
        private C6156k f32677b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f32678c;

        private C12632d5(C12636e c12636e, PurchasesRecentFragment purchasesRecentFragment) {
            this.f32676a = c12636e;
            m2794b(purchasesRecentFragment);
        }

        /* renamed from: b */
        private void m2794b(PurchasesRecentFragment purchasesRecentFragment) {
            C6156k m22039a = C6156k.m22039a(this.f32676a.f32703B1, this.f32676a.f32880p3, this.f32676a.f32740K2);
            this.f32677b = m22039a;
            this.f32678c = C6157l.m22035c(m22039a);
        }

        /* renamed from: d */
        private PurchasesRecentFragment m2792d(PurchasesRecentFragment purchasesRecentFragment) {
            C11207e.m5748a(purchasesRecentFragment, this.f32676a.m2750Y());
            C6151h.m22053a(purchasesRecentFragment, m2790f());
            return purchasesRecentFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2791e() {
            return Collections.singletonMap(PurchasesRecentViewModel.class, (InterfaceC6657b) this.f32678c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2790f() {
            return new ViewModelFactoryByInjection(m2791e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PurchasesRecentFragment purchasesRecentFragment) {
            m2792d(purchasesRecentFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d6 */
    /* loaded from: classes2.dex */
    public static final class C12633d6 implements InterfaceC13219b2 {

        /* renamed from: a */
        private final C12636e f32679a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayCheckoutSuccessActivity> f32680b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32681c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32682d;

        /* renamed from: e */
        private C10253j f32683e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32684f;

        private C12633d6(C12636e c12636e, TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity) {
            this.f32679a = c12636e;
            m2789b(takeAwayCheckoutSuccessActivity);
        }

        /* renamed from: b */
        private void m2789b(TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayCheckoutSuccessActivity);
            this.f32680b = m4594a;
            this.f32681c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32679a.f32704B2, this.f32679a.f32708C2, this.f32679a.f32712D2));
            this.f32682d = C11613b.m4596a(C5975c.m22544a(this.f32679a.f32703B1));
            C10253j m8391a = C10253j.m8391a(this.f32679a.f32703B1, this.f32679a.f32740K2);
            this.f32683e = m8391a;
            this.f32684f = C10254k.m8387c(m8391a);
        }

        /* renamed from: d */
        private TakeAwayCheckoutSuccessActivity m2787d(TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity) {
            C11205c.m5751a(takeAwayCheckoutSuccessActivity, this.f32679a.m2750Y());
            C5921e.m22726a(takeAwayCheckoutSuccessActivity, this.f32681c.mo42226get());
            C13872m.m123d(takeAwayCheckoutSuccessActivity, this.f32682d.mo42226get());
            C13872m.m125b(takeAwayCheckoutSuccessActivity, (AuthManager) this.f32679a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayCheckoutSuccessActivity, (AppRatingManager) this.f32679a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayCheckoutSuccessActivity, (InterfaceC3954c) this.f32679a.f32720F2.mo42226get());
            C10250g.m8397a(takeAwayCheckoutSuccessActivity, m2785f());
            return takeAwayCheckoutSuccessActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2786e() {
            return Collections.singletonMap(TakeAwayCheckoutSuccessViewModel.class, (InterfaceC6657b) this.f32684f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2785f() {
            return new ViewModelFactoryByInjection(m2786e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayCheckoutSuccessActivity takeAwayCheckoutSuccessActivity) {
            m2787d(takeAwayCheckoutSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d7 */
    /* loaded from: classes2.dex */
    public static final class C12634d7 implements InterfaceC13319l2 {

        /* renamed from: a */
        private final C12636e f32685a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayWalkThroughActivity> f32686b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32687c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32688d;

        /* renamed from: e */
        private C4895i f32689e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32690f;

        private C12634d7(C12636e c12636e, TakeAwayWalkThroughActivity takeAwayWalkThroughActivity) {
            this.f32685a = c12636e;
            m2784b(takeAwayWalkThroughActivity);
        }

        /* renamed from: b */
        private void m2784b(TakeAwayWalkThroughActivity takeAwayWalkThroughActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayWalkThroughActivity);
            this.f32686b = m4594a;
            this.f32687c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32685a.f32704B2, this.f32685a.f32708C2, this.f32685a.f32712D2));
            this.f32688d = C11613b.m4596a(C5975c.m22544a(this.f32685a.f32703B1));
            C4895i m26323a = C4895i.m26323a(this.f32685a.f32703B1, this.f32685a.f32768R2, this.f32685a.f32740K2);
            this.f32689e = m26323a;
            this.f32690f = C4896j.m26319c(m26323a);
        }

        /* renamed from: d */
        private TakeAwayWalkThroughActivity m2782d(TakeAwayWalkThroughActivity takeAwayWalkThroughActivity) {
            C11205c.m5751a(takeAwayWalkThroughActivity, this.f32685a.m2750Y());
            C5921e.m22726a(takeAwayWalkThroughActivity, this.f32687c.mo42226get());
            C13872m.m123d(takeAwayWalkThroughActivity, this.f32688d.mo42226get());
            C13872m.m125b(takeAwayWalkThroughActivity, (AuthManager) this.f32685a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayWalkThroughActivity, (AppRatingManager) this.f32685a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayWalkThroughActivity, (InterfaceC3954c) this.f32685a.f32720F2.mo42226get());
            C4892b.m26336a(takeAwayWalkThroughActivity, m2780f());
            return takeAwayWalkThroughActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2781e() {
            return Collections.singletonMap(TakeAwayWalkThroughViewModel.class, (InterfaceC6657b) this.f32690f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2780f() {
            return new ViewModelFactoryByInjection(m2781e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayWalkThroughActivity takeAwayWalkThroughActivity) {
            m2782d(takeAwayWalkThroughActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$d8 */
    /* loaded from: classes2.dex */
    public static final class C12635d8 implements InterfaceC13437z2 {

        /* renamed from: a */
        private final C12636e f32691a;

        /* renamed from: b */
        private InterfaceC12341a<WineClubWelcomeActivity> f32692b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f32693c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f32694d;

        /* renamed from: e */
        private C6494k0 f32695e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f32696f;

        private C12635d8(C12636e c12636e, WineClubWelcomeActivity wineClubWelcomeActivity) {
            this.f32691a = c12636e;
            m2779b(wineClubWelcomeActivity);
        }

        /* renamed from: b */
        private void m2779b(WineClubWelcomeActivity wineClubWelcomeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(wineClubWelcomeActivity);
            this.f32692b = m4594a;
            this.f32693c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f32691a.f32704B2, this.f32691a.f32708C2, this.f32691a.f32712D2));
            this.f32694d = C11613b.m4596a(C5975c.m22544a(this.f32691a.f32703B1));
            C6494k0 m20816a = C6494k0.m20816a(this.f32691a.f32703B1, this.f32691a.f32771S1, this.f32691a.f32740K2);
            this.f32695e = m20816a;
            this.f32696f = C6496l0.m20812c(m20816a);
        }

        /* renamed from: d */
        private WineClubWelcomeActivity m2777d(WineClubWelcomeActivity wineClubWelcomeActivity) {
            C11205c.m5751a(wineClubWelcomeActivity, this.f32691a.m2750Y());
            C5921e.m22726a(wineClubWelcomeActivity, this.f32693c.mo42226get());
            C13872m.m123d(wineClubWelcomeActivity, this.f32694d.mo42226get());
            C13872m.m125b(wineClubWelcomeActivity, (AuthManager) this.f32691a.f32700A2.mo42226get());
            C13872m.m126a(wineClubWelcomeActivity, (AppRatingManager) this.f32691a.f32716E2.mo42226get());
            C13872m.m124c(wineClubWelcomeActivity, (InterfaceC3954c) this.f32691a.f32720F2.mo42226get());
            C6485g0.m20831a(wineClubWelcomeActivity, m2775f());
            return wineClubWelcomeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2776e() {
            return Collections.singletonMap(WineClubWelcomeViewModel.class, (InterfaceC6657b) this.f32696f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2775f() {
            return new ViewModelFactoryByInjection(m2776e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(WineClubWelcomeActivity wineClubWelcomeActivity) {
            m2777d(wineClubWelcomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e */
    /* loaded from: classes2.dex */
    public static final class C12636e implements InterfaceC12355a {

        /* renamed from: A */
        private InterfaceC12341a<InterfaceC13365q2.InterfaceC13366a> f32697A;

        /* renamed from: A0 */
        private InterfaceC12341a<InterfaceC13275h0.InterfaceC13276a> f32698A0;

        /* renamed from: A1 */
        private InterfaceC12341a<Retrofit> f32699A1;

        /* renamed from: A2 */
        private InterfaceC12341a<AuthManager> f32700A2;

        /* renamed from: B */
        private InterfaceC12341a<InterfaceC13373r2.InterfaceC13374a> f32701B;

        /* renamed from: B0 */
        private InterfaceC12341a<InterfaceC13325m0.InterfaceC13326a> f32702B0;

        /* renamed from: B1 */
        private InterfaceC12341a<ResourcesProvider> f32703B1;

        /* renamed from: B2 */
        private InterfaceC12341a<Integer> f32704B2;

        /* renamed from: C */
        private InterfaceC12341a<InterfaceC13247e1.InterfaceC13248a> f32705C;

        /* renamed from: C0 */
        private InterfaceC12341a<InterfaceC13273h.InterfaceC13274a> f32706C0;

        /* renamed from: C1 */
        private InterfaceC12341a<OAuthService> f32707C1;

        /* renamed from: C2 */
        private InterfaceC12341a<Integer> f32708C2;

        /* renamed from: D */
        private InterfaceC12341a<InterfaceC13397u2.InterfaceC13398a> f32709D;

        /* renamed from: D0 */
        private InterfaceC12341a<InterfaceC13435z1.InterfaceC13436a> f32710D0;

        /* renamed from: D1 */
        private InterfaceC12341a<OAuthManager> f32711D1;

        /* renamed from: D2 */
        private InterfaceC12341a<SimpleDateFormat> f32712D2;

        /* renamed from: E */
        private InterfaceC12341a<InterfaceC13405v2.InterfaceC13406a> f32713E;

        /* renamed from: E0 */
        private InterfaceC12341a<InterfaceC13407w.InterfaceC13408a> f32714E0;

        /* renamed from: E1 */
        private InterfaceC12341a<CertificatePinner> f32715E1;

        /* renamed from: E2 */
        private InterfaceC12341a<AppRatingManager> f32716E2;

        /* renamed from: F */
        private InterfaceC12341a<InterfaceC13413w2.InterfaceC13414a> f32717F;

        /* renamed from: F0 */
        private InterfaceC12341a<InterfaceC13347o1.InterfaceC13348a> f32718F0;

        /* renamed from: F1 */
        private InterfaceC12341a<SharedPreferences> f32719F1;

        /* renamed from: F2 */
        private InterfaceC12341a<InterfaceC3954c> f32720F2;

        /* renamed from: G */
        private InterfaceC12341a<InterfaceC13433z0.InterfaceC13434a> f32721G;

        /* renamed from: G0 */
        private InterfaceC12341a<InterfaceC13345o0.InterfaceC13346a> f32722G0;

        /* renamed from: G1 */
        private InterfaceC12341a<SharedPreferences> f32723G1;

        /* renamed from: G2 */
        private InterfaceC12341a<TransactionCacheManager> f32724G2;

        /* renamed from: H */
        private InterfaceC12341a<InterfaceC13287i1.InterfaceC13288a> f32725H;

        /* renamed from: H0 */
        private InterfaceC12341a<InterfaceC13377s0.InterfaceC13378a> f32726H0;

        /* renamed from: H1 */
        private InterfaceC12341a<C5664k> f32727H1;

        /* renamed from: H2 */
        private InterfaceC12341a<C5679u> f32728H2;

        /* renamed from: I */
        private InterfaceC12341a<InterfaceC13313l.InterfaceC13314a> f32729I;

        /* renamed from: I0 */
        private InterfaceC12341a<InterfaceC13369r0.InterfaceC13370a> f32730I0;

        /* renamed from: I1 */
        private InterfaceC12341a<C5670o> f32731I1;

        /* renamed from: I2 */
        private InterfaceC12341a<StoresAgent> f32732I2;

        /* renamed from: J */
        private InterfaceC12341a<InterfaceC13303k.InterfaceC13304a> f32733J;

        /* renamed from: J0 */
        private InterfaceC12341a<InterfaceC13233d.InterfaceC13234a> f32734J0;

        /* renamed from: J1 */
        private InterfaceC12341a<C5655e> f32735J1;

        /* renamed from: J2 */
        private InterfaceC12341a<StoreManager> f32736J2;

        /* renamed from: K */
        private InterfaceC12341a<InterfaceC13257f1.InterfaceC13258a> f32737K;

        /* renamed from: K0 */
        private InterfaceC12341a<InterfaceC13337n1.InterfaceC13338a> f32738K0;

        /* renamed from: K1 */
        private InterfaceC12341a<C5682w> f32739K1;

        /* renamed from: K2 */
        private InterfaceC12341a<C7405s1> f32740K2;

        /* renamed from: L */
        private InterfaceC12341a<InterfaceC13267g1.InterfaceC13268a> f32741L;

        /* renamed from: L0 */
        private InterfaceC12341a<InterfaceC13355p1.InterfaceC13356a> f32742L0;

        /* renamed from: L1 */
        private InterfaceC12341a<AppInterceptorDataProvider> f32743L1;

        /* renamed from: L2 */
        private InterfaceC12341a<C7310l> f32744L2;

        /* renamed from: M */
        private InterfaceC12341a<InterfaceC13323m.InterfaceC13324a> f32745M;

        /* renamed from: M0 */
        private InterfaceC12341a<InterfaceC13319l2.InterfaceC13320a> f32746M0;

        /* renamed from: M1 */
        private InterfaceC12341a<InterfaceC5503w> f32747M1;

        /* renamed from: M2 */
        private InterfaceC12341a<ShoppingListService> f32748M2;

        /* renamed from: N */
        private InterfaceC12341a<InterfaceC13359q.InterfaceC13360a> f32749N;

        /* renamed from: N0 */
        private InterfaceC12341a<InterfaceC13213b.InterfaceC13214a> f32750N0;

        /* renamed from: N1 */
        private InterfaceC12341a<OkHttpClient> f32751N1;

        /* renamed from: N2 */
        private InterfaceC12341a<SimpleDateFormat> f32752N2;

        /* renamed from: O */
        private InterfaceC12341a<InterfaceC13343o.InterfaceC13344a> f32753O;

        /* renamed from: O0 */
        private InterfaceC12341a<InterfaceC13239d2.InterfaceC13240a> f32754O0;

        /* renamed from: O1 */
        private InterfaceC12341a<String> f32755O1;

        /* renamed from: O2 */
        private InterfaceC12341a<C7256f1> f32756O2;

        /* renamed from: P */
        private InterfaceC12341a<InterfaceC13333n.InterfaceC13334a> f32757P;

        /* renamed from: P0 */
        private InterfaceC12341a<InterfaceC13299j2.InterfaceC13300a> f32758P0;

        /* renamed from: P1 */
        private InterfaceC12341a<Retrofit> f32759P1;

        /* renamed from: P2 */
        private InterfaceC12341a<C5661i> f32760P2;

        /* renamed from: Q */
        private InterfaceC12341a<InterfaceC13243e.InterfaceC13244a> f32761Q;

        /* renamed from: Q0 */
        private InterfaceC12341a<InterfaceC13309k2.InterfaceC13310a> f32762Q0;

        /* renamed from: Q1 */
        private InterfaceC12341a<FirebaseAnalytics> f32763Q1;

        /* renamed from: Q2 */
        private InterfaceC12341a<CoachmarksAgent> f32764Q2;

        /* renamed from: R */
        private InterfaceC12341a<InterfaceC13253f.InterfaceC13254a> f32765R;

        /* renamed from: R0 */
        private InterfaceC12341a<InterfaceC13259f2.InterfaceC13260a> f32766R0;

        /* renamed from: R1 */
        private InterfaceC12341a<AppEventsLogger> f32767R1;

        /* renamed from: R2 */
        private InterfaceC12341a<CoachMarkManager> f32768R2;

        /* renamed from: S */
        private InterfaceC12341a<InterfaceC13421x2.InterfaceC13422a> f32769S;

        /* renamed from: S0 */
        private InterfaceC12341a<InterfaceC13269g2.InterfaceC13270a> f32770S0;

        /* renamed from: S1 */
        private InterfaceC12341a<AnalyticsManager> f32771S1;

        /* renamed from: S2 */
        private InterfaceC12341a<SmsService> f32772S2;

        /* renamed from: T */
        private InterfaceC12341a<InterfaceC13429y2.InterfaceC13430a> f32773T;

        /* renamed from: T0 */
        private InterfaceC12341a<InterfaceC13249e2.InterfaceC13250a> f32774T0;

        /* renamed from: T1 */
        private InterfaceC12341a<AuthService> f32775T1;

        /* renamed from: T2 */
        private InterfaceC12341a<C8223b> f32776T2;

        /* renamed from: U */
        private InterfaceC12341a<InterfaceC13263g.InterfaceC13264a> f32777U;

        /* renamed from: U0 */
        private InterfaceC12341a<InterfaceC13219b2.InterfaceC13220a> f32778U0;

        /* renamed from: U1 */
        private InterfaceC12341a<OnboardingService> f32779U1;

        /* renamed from: U2 */
        private InterfaceC12341a<LoyaltyCardManager> f32780U2;

        /* renamed from: V */
        private InterfaceC12341a<InterfaceC13437z2.InterfaceC13438a> f32781V;

        /* renamed from: V0 */
        private InterfaceC12341a<InterfaceC13289i2.InterfaceC13290a> f32782V0;

        /* renamed from: V1 */
        private InterfaceC12341a<DeviceService> f32783V1;

        /* renamed from: V2 */
        private InterfaceC12341a<SmsManager> f32784V2;

        /* renamed from: W */
        private InterfaceC12341a<InterfaceC13375s.InterfaceC13376a> f32785W;

        /* renamed from: W0 */
        private InterfaceC12341a<InterfaceC13279h2.InterfaceC13280a> f32786W0;

        /* renamed from: W1 */
        private InterfaceC12341a<OnboardingFlowDataSharedPreferences> f32787W1;

        /* renamed from: W2 */
        private InterfaceC12341a<PhoneService> f32788W2;

        /* renamed from: X */
        private InterfaceC12341a<InterfaceC13351p.InterfaceC13352a> f32789X;

        /* renamed from: X0 */
        private InterfaceC12341a<InterfaceC13229c2.InterfaceC13230a> f32790X0;

        /* renamed from: X1 */
        private InterfaceC12341a<PrefsManager> f32791X1;

        /* renamed from: X2 */
        private InterfaceC12341a<PhoneManager> f32792X2;

        /* renamed from: Y */
        private InterfaceC12341a<InterfaceC13335n0.InterfaceC13336a> f32793Y;

        /* renamed from: Y0 */
        private InterfaceC12341a<InterfaceC13283i.InterfaceC13284a> f32794Y0;

        /* renamed from: Y1 */
        private InterfaceC12341a<EncryptedPrefsManager> f32795Y1;

        /* renamed from: Y2 */
        private InterfaceC12341a<C7296j0> f32796Y2;

        /* renamed from: Z */
        private InterfaceC12341a<InterfaceC13203a.InterfaceC13204a> f32797Z;

        /* renamed from: Z0 */
        private InterfaceC12341a<InterfaceC13399v.InterfaceC13400a> f32798Z0;

        /* renamed from: Z1 */
        private InterfaceC12341a<StoreService> f32799Z1;

        /* renamed from: Z2 */
        private InterfaceC12341a<OkHttpClient> f32800Z2;

        /* renamed from: a */
        private final C12636e f32801a;

        /* renamed from: a0 */
        private InterfaceC12341a<InterfaceC13395u1.InterfaceC13396a> f32802a0;

        /* renamed from: a1 */
        private InterfaceC12341a<InterfaceC13293j.InterfaceC13294a> f32803a1;

        /* renamed from: a2 */
        private InterfaceC12341a<DefaultStoreAgent> f32804a2;

        /* renamed from: a3 */
        private InterfaceC12341a<Retrofit> f32805a3;

        /* renamed from: b */
        private InterfaceC12341a<InterfaceC13363q1.InterfaceC13364a> f32806b;

        /* renamed from: b0 */
        private InterfaceC12341a<InterfaceC13339n2.InterfaceC13340a> f32807b0;

        /* renamed from: b1 */
        private InterfaceC12341a<InterfaceC13261f3.InterfaceC13262a> f32808b1;

        /* renamed from: b2 */
        private InterfaceC12341a<CatalogService> f32809b2;

        /* renamed from: b3 */
        private InterfaceC12341a<PinRecoveryService> f32810b3;

        /* renamed from: c */
        private InterfaceC12341a<InterfaceC13417x0.InterfaceC13418a> f32811c;

        /* renamed from: c0 */
        private InterfaceC12341a<InterfaceC13367r.InterfaceC13368a> f32812c0;

        /* renamed from: c1 */
        private InterfaceC12341a<InterfaceC13311k3.InterfaceC13312a> f32813c1;

        /* renamed from: c2 */
        private InterfaceC12341a<C5652c> f32814c2;

        /* renamed from: c3 */
        private InterfaceC12341a<PinRecoveryManager> f32815c3;

        /* renamed from: d */
        private InterfaceC12341a<InterfaceC13427y1.InterfaceC13428a> f32816d;

        /* renamed from: d0 */
        private InterfaceC12341a<InterfaceC13379s1.InterfaceC13380a> f32817d0;

        /* renamed from: d1 */
        private InterfaceC12341a<InterfaceC13251e3.InterfaceC13252a> f32818d1;

        /* renamed from: d2 */
        private InterfaceC12341a<CategoriesAgent> f32819d2;

        /* renamed from: d3 */
        private InterfaceC12341a<C0577e> f32820d3;

        /* renamed from: e */
        private InterfaceC12341a<InterfaceC13223c.InterfaceC13224a> f32821e;

        /* renamed from: e0 */
        private InterfaceC12341a<InterfaceC13415x.InterfaceC13416a> f32822e0;

        /* renamed from: e1 */
        private InterfaceC12341a<InterfaceC13221b3.InterfaceC13222a> f32823e1;

        /* renamed from: e2 */
        private InterfaceC12341a<ClubService> f32824e2;

        /* renamed from: e3 */
        private InterfaceC12341a<BiometricsManager> f32825e3;

        /* renamed from: f */
        private InterfaceC12341a<InterfaceC13315l0.InterfaceC13316a> f32826f;

        /* renamed from: f0 */
        private InterfaceC12341a<InterfaceC13425y0.InterfaceC13426a> f32827f0;

        /* renamed from: f1 */
        private InterfaceC12341a<InterfaceC13211a3.InterfaceC13212a> f32828f1;

        /* renamed from: f2 */
        private InterfaceC12341a<C5658g> f32829f2;

        /* renamed from: f3 */
        private InterfaceC12341a<EmailService> f32830f3;

        /* renamed from: g */
        private InterfaceC12341a<InterfaceC13295j0.InterfaceC13296a> f32831g;

        /* renamed from: g0 */
        private InterfaceC12341a<InterfaceC13393u0.InterfaceC13394a> f32832g0;

        /* renamed from: g1 */
        private InterfaceC12341a<InterfaceC13301j3.InterfaceC13302a> f32833g1;

        /* renamed from: g2 */
        private InterfaceC12341a<ClubsAgent> f32834g2;

        /* renamed from: g3 */
        private InterfaceC12341a<EmailManager> f32835g3;

        /* renamed from: h */
        private InterfaceC12341a<InterfaceC13349o2.InterfaceC13350a> f32836h;

        /* renamed from: h0 */
        private InterfaceC12341a<InterfaceC13215b0.InterfaceC13216a> f32837h0;

        /* renamed from: h1 */
        private InterfaceC12341a<InterfaceC13231c3.InterfaceC13232a> f32838h1;

        /* renamed from: h2 */
        private InterfaceC12341a<ClubsCodesAgent> f32839h2;

        /* renamed from: h3 */
        private InterfaceC12341a<NifService> f32840h3;

        /* renamed from: i */
        private InterfaceC12341a<InterfaceC13383t.InterfaceC13384a> f32841i;

        /* renamed from: i0 */
        private InterfaceC12341a<InterfaceC13245e0.InterfaceC13246a> f32842i0;

        /* renamed from: i1 */
        private InterfaceC12341a<InterfaceC13241d3.InterfaceC13242a> f32843i1;

        /* renamed from: i2 */
        private InterfaceC12341a<C5667m> f32844i2;

        /* renamed from: i3 */
        private InterfaceC12341a<NifManager> f32845i3;

        /* renamed from: j */
        private InterfaceC12341a<InterfaceC13419x1.InterfaceC13420a> f32846j;

        /* renamed from: j0 */
        private InterfaceC12341a<InterfaceC13235d0.InterfaceC13236a> f32847j0;

        /* renamed from: j1 */
        private InterfaceC12341a<InterfaceC13271g3.InterfaceC13272a> f32848j1;

        /* renamed from: j2 */
        private InterfaceC12341a<FlyersAgent> f32849j2;

        /* renamed from: j3 */
        private InterfaceC12341a<ClubManager> f32850j3;

        /* renamed from: k */
        private InterfaceC12341a<InterfaceC13357p2.InterfaceC13358a> f32851k;

        /* renamed from: k0 */
        private InterfaceC12341a<InterfaceC13255f0.InterfaceC13256a> f32852k0;

        /* renamed from: k1 */
        private InterfaceC12341a<InterfaceC13281h3.InterfaceC13282a> f32853k1;

        /* renamed from: k2 */
        private InterfaceC12341a<LoyaltyCardService> f32854k2;

        /* renamed from: k3 */
        private InterfaceC12341a<BannerManager> f32855k3;

        /* renamed from: l */
        private InterfaceC12341a<InterfaceC13391u.InterfaceC13392a> f32856l;

        /* renamed from: l0 */
        private InterfaceC12341a<InterfaceC13225c0.InterfaceC13226a> f32857l0;

        /* renamed from: l1 */
        private InterfaceC12341a<InterfaceC13321l3.InterfaceC13322a> f32858l1;

        /* renamed from: l2 */
        private InterfaceC12341a<LoyaltyCardAgent> f32859l2;

        /* renamed from: l3 */
        private InterfaceC12341a<TakeAwayService> f32860l3;

        /* renamed from: m */
        private InterfaceC12341a<InterfaceC13305k0.InterfaceC13306a> f32861m;

        /* renamed from: m0 */
        private InterfaceC12341a<InterfaceC13317l1.InterfaceC13318a> f32862m0;

        /* renamed from: m1 */
        private InterfaceC12341a<InterfaceC13331m3.InterfaceC13332a> f32863m1;

        /* renamed from: m2 */
        private InterfaceC12341a<C5673q> f32864m2;

        /* renamed from: m3 */
        private InterfaceC12341a<C7347m1> f32865m3;

        /* renamed from: n */
        private InterfaceC12341a<InterfaceC13297j1.InterfaceC13298a> f32866n;

        /* renamed from: n0 */
        private InterfaceC12341a<InterfaceC13285i0.InterfaceC13286a> f32867n0;

        /* renamed from: n1 */
        private InterfaceC12341a<InterfaceC13291i3.InterfaceC13292a> f32868n1;

        /* renamed from: n2 */
        private InterfaceC12341a<RecommendationsCatalogResponsesAgent> f32869n2;

        /* renamed from: n3 */
        private InterfaceC12341a<RecentProductManager> f32870n3;

        /* renamed from: o */
        private InterfaceC12341a<InterfaceC13371r1.InterfaceC13372a> f32871o;

        /* renamed from: o0 */
        private InterfaceC12341a<InterfaceC13209a2.InterfaceC13210a> f32872o0;

        /* renamed from: o1 */
        private InterfaceC12341a<InterfaceC13341n3.InterfaceC13342a> f32873o1;

        /* renamed from: o2 */
        private InterfaceC12341a<C5676s> f32874o2;

        /* renamed from: o3 */
        private InterfaceC12341a<PurchaseService> f32875o3;

        /* renamed from: p */
        private InterfaceC12341a<InterfaceC13381s2.InterfaceC13382a> f32876p;

        /* renamed from: p0 */
        private InterfaceC12341a<InterfaceC13387t1.InterfaceC13388a> f32877p0;

        /* renamed from: p1 */
        private InterfaceC12341a<Dispatcher> f32878p1;

        /* renamed from: p2 */
        private InterfaceC12341a<SearchCatalogResponsesAgent> f32879p2;

        /* renamed from: p3 */
        private InterfaceC12341a<PurchasesManager> f32880p3;

        /* renamed from: q */
        private InterfaceC12341a<InterfaceC13265g0.InterfaceC13266a> f32881q;

        /* renamed from: q0 */
        private InterfaceC12341a<InterfaceC13411w1.InterfaceC13412a> f32882q0;

        /* renamed from: q1 */
        private InterfaceC12341a<ConnectionPool> f32883q1;

        /* renamed from: q2 */
        private InterfaceC12341a<UserService> f32884q2;

        /* renamed from: q3 */
        private InterfaceC12341a<PushNotificationsManager> f32885q3;

        /* renamed from: r */
        private InterfaceC12341a<InterfaceC13329m2.InterfaceC13330a> f32886r;

        /* renamed from: r0 */
        private InterfaceC12341a<InterfaceC13401v0.InterfaceC13402a> f32887r0;

        /* renamed from: r1 */
        private InterfaceC12341a<OkHttpClient.C5510a> f32888r1;

        /* renamed from: r2 */
        private InterfaceC12341a<SimpleDateFormat> f32889r2;

        /* renamed from: s */
        private InterfaceC12341a<InterfaceC13207a1.InterfaceC13208a> f32890s;

        /* renamed from: s0 */
        private InterfaceC12341a<InterfaceC13409w0.InterfaceC13410a> f32891s0;

        /* renamed from: s1 */
        private InterfaceC12341a<PingoDoceApp> f32892s1;

        /* renamed from: s2 */
        private InterfaceC12341a<SimpleDateFormat> f32893s2;

        /* renamed from: t */
        private InterfaceC12341a<InterfaceC13237d1.InterfaceC13238a> f32894t;

        /* renamed from: t0 */
        private InterfaceC12341a<InterfaceC13403v1.InterfaceC13404a> f32895t0;

        /* renamed from: t1 */
        private InterfaceC12341a<KeyGenParameterSpec> f32896t1;

        /* renamed from: t2 */
        private InterfaceC12341a<UserProfileAgent> f32897t2;

        /* renamed from: u */
        private InterfaceC12341a<InterfaceC13227c1.InterfaceC13228a> f32898u;

        /* renamed from: u0 */
        private InterfaceC12341a<InterfaceC13385t0.InterfaceC13386a> f32899u0;

        /* renamed from: u1 */
        private InterfaceC12341a<SharedPreferences> f32900u1;

        /* renamed from: u2 */
        private InterfaceC12341a<ConsentsService> f32901u2;

        /* renamed from: v */
        private InterfaceC12341a<InterfaceC13217b1.InterfaceC13218a> f32902v;

        /* renamed from: v0 */
        private InterfaceC12341a<InterfaceC13353p0.InterfaceC13354a> f32903v0;

        /* renamed from: v1 */
        private InterfaceC12341a<OAuthSharedPrefs> f32904v1;

        /* renamed from: v2 */
        private InterfaceC12341a<ConsentsAgent> f32905v2;

        /* renamed from: w */
        private InterfaceC12341a<InterfaceC13431z.InterfaceC13432a> f32906w;

        /* renamed from: w0 */
        private InterfaceC12341a<InterfaceC13389t2.InterfaceC13390a> f32907w0;

        /* renamed from: w1 */
        private InterfaceC12341a<HttpLoggingInterceptor> f32908w1;

        /* renamed from: w2 */
        private InterfaceC12341a<ConsentsManager> f32909w2;

        /* renamed from: x */
        private InterfaceC12341a<InterfaceC13205a0.InterfaceC13206a> f32910x;

        /* renamed from: x0 */
        private InterfaceC12341a<InterfaceC13361q0.InterfaceC13362a> f32911x0;

        /* renamed from: x1 */
        private InterfaceC12341a<InterfaceC5503w> f32912x1;

        /* renamed from: x2 */
        private InterfaceC12341a<BannerService> f32913x2;

        /* renamed from: y */
        private InterfaceC12341a<InterfaceC13423y.InterfaceC13424a> f32914y;

        /* renamed from: y0 */
        private InterfaceC12341a<InterfaceC13307k1.InterfaceC13308a> f32915y0;

        /* renamed from: y1 */
        private InterfaceC12341a<OkHttpClient> f32916y1;

        /* renamed from: y2 */
        private InterfaceC12341a<C5649a> f32917y2;

        /* renamed from: z */
        private InterfaceC12341a<InterfaceC13277h1.InterfaceC13278a> f32918z;

        /* renamed from: z0 */
        private InterfaceC12341a<InterfaceC13327m1.InterfaceC13328a> f32919z0;

        /* renamed from: z1 */
        private InterfaceC12341a<String> f32920z1;

        /* renamed from: z2 */
        private InterfaceC12341a<BannersAgent> f32921z2;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$a */
        /* loaded from: classes2.dex */
        public class C12637a implements InterfaceC12341a<InterfaceC13279h2.InterfaceC13280a> {
            C12637a() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13279h2.InterfaceC13280a mo42226get() {
                return new C12833m6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$a0 */
        /* loaded from: classes2.dex */
        public class C12638a0 implements InterfaceC12341a<InterfaceC13329m2.InterfaceC13330a> {
            C12638a0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13329m2.InterfaceC13330a mo42226get() {
                return new C12762e7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$a1 */
        /* loaded from: classes2.dex */
        public class C12639a1 implements InterfaceC12341a<InterfaceC13343o.InterfaceC13344a> {
            C12639a1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13343o.InterfaceC13344a mo42226get() {
                return new C12764f0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$a2 */
        /* loaded from: classes2.dex */
        public class C12640a2 implements InterfaceC12341a<InterfaceC13317l1.InterfaceC13318a> {
            C12640a2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13317l1.InterfaceC13318a mo42226get() {
                return new C12867q4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$a3 */
        /* loaded from: classes2.dex */
        public class C12641a3 implements InterfaceC12341a<InterfaceC13337n1.InterfaceC13338a> {
            C12641a3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13337n1.InterfaceC13338a mo42226get() {
                return new C12903u4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$b */
        /* loaded from: classes2.dex */
        public class C12642b implements InterfaceC12341a<InterfaceC13229c2.InterfaceC13230a> {
            C12642b() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13229c2.InterfaceC13230a mo42226get() {
                return new C12761e6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$b0 */
        /* loaded from: classes2.dex */
        public class C12643b0 implements InterfaceC12341a<InterfaceC13207a1.InterfaceC13208a> {
            C12643b0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13207a1.InterfaceC13208a mo42226get() {
                return new C12848o3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$b1 */
        /* loaded from: classes2.dex */
        public class C12644b1 implements InterfaceC12341a<InterfaceC13333n.InterfaceC13334a> {
            C12644b1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13333n.InterfaceC13334a mo42226get() {
                return new C12627d0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$b2 */
        /* loaded from: classes2.dex */
        public class C12645b2 implements InterfaceC12341a<InterfaceC13285i0.InterfaceC13286a> {
            C12645b2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13285i0.InterfaceC13286a mo42226get() {
                return new C12619c2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$b3 */
        /* loaded from: classes2.dex */
        public class C12646b3 implements InterfaceC12341a<InterfaceC13355p1.InterfaceC13356a> {
            C12646b3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13355p1.InterfaceC13356a mo42226get() {
                return new C12939y4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$c */
        /* loaded from: classes2.dex */
        public class C12647c implements InterfaceC12341a<InterfaceC13283i.InterfaceC13284a> {
            C12647c() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13283i.InterfaceC13284a mo42226get() {
                return new C12907v(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$c0 */
        /* loaded from: classes2.dex */
        public class C12648c0 implements InterfaceC12341a<InterfaceC13237d1.InterfaceC13238a> {
            C12648c0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13237d1.InterfaceC13238a mo42226get() {
                return new C12902u3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$c1 */
        /* loaded from: classes2.dex */
        public class C12649c1 implements InterfaceC12341a<InterfaceC13243e.InterfaceC13244a> {
            C12649c1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13243e.InterfaceC13244a mo42226get() {
                return new C12853p(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$c2 */
        /* loaded from: classes2.dex */
        public class C12650c2 implements InterfaceC12341a<InterfaceC13209a2.InterfaceC13210a> {
            C12650c2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13209a2.InterfaceC13210a mo42226get() {
                return new C12603a6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$c3 */
        /* loaded from: classes2.dex */
        public class C12651c3 implements InterfaceC12341a<InterfaceC13383t.InterfaceC13384a> {
            C12651c3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13383t.InterfaceC13384a mo42226get() {
                return new C12836n0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$d */
        /* loaded from: classes2.dex */
        public class C12652d implements InterfaceC12341a<InterfaceC13399v.InterfaceC13400a> {
            C12652d() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13399v.InterfaceC13400a mo42226get() {
                return new C12872r0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$d0 */
        /* loaded from: classes2.dex */
        public class C12653d0 implements InterfaceC12341a<InterfaceC13363q1.InterfaceC13364a> {
            C12653d0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13363q1.InterfaceC13364a mo42226get() {
                return new C12760e5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$d1 */
        /* loaded from: classes2.dex */
        public class C12654d1 implements InterfaceC12341a<InterfaceC13253f.InterfaceC13254a> {
            C12654d1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13253f.InterfaceC13254a mo42226get() {
                return new C12835n(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$d2 */
        /* loaded from: classes2.dex */
        public class C12655d2 implements InterfaceC12341a<InterfaceC13387t1.InterfaceC13388a> {
            C12655d2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13387t1.InterfaceC13388a mo42226get() {
                return new C12832m5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$d3 */
        /* loaded from: classes2.dex */
        public class C12656d3 implements InterfaceC12341a<InterfaceC13319l2.InterfaceC13320a> {
            C12656d3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13319l2.InterfaceC13320a mo42226get() {
                return new C12624c7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$e */
        /* loaded from: classes2.dex */
        public class C12657e implements InterfaceC12341a<InterfaceC13293j.InterfaceC13294a> {
            C12657e() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13293j.InterfaceC13294a mo42226get() {
                return new C12943z(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$e0 */
        /* loaded from: classes2.dex */
        public class C12658e0 implements InterfaceC12341a<InterfaceC13227c1.InterfaceC13228a> {
            C12658e0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13227c1.InterfaceC13228a mo42226get() {
                return new C12884s3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$e1 */
        /* loaded from: classes2.dex */
        public class C12659e1 implements InterfaceC12341a<InterfaceC13421x2.InterfaceC13422a> {
            C12659e1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13421x2.InterfaceC13422a mo42226get() {
                return new C12942y7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$e2 */
        /* loaded from: classes2.dex */
        public class C12660e2 implements InterfaceC12341a<InterfaceC13411w1.InterfaceC13412a> {
            C12660e2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13411w1.InterfaceC13412a mo42226get() {
                return new C12886s5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$e3 */
        /* loaded from: classes2.dex */
        public class C12661e3 implements InterfaceC12341a<InterfaceC13213b.InterfaceC13214a> {
            C12661e3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13213b.InterfaceC13214a mo42226get() {
                return new C12616c(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$f */
        /* loaded from: classes2.dex */
        public class C12662f implements InterfaceC12341a<InterfaceC13261f3.InterfaceC13262a> {
            C12662f() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13261f3.InterfaceC13262a mo42226get() {
                return new C12599a2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$f0 */
        /* loaded from: classes2.dex */
        public class C12663f0 implements InterfaceC12341a<InterfaceC13217b1.InterfaceC13218a> {
            C12663f0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13217b1.InterfaceC13218a mo42226get() {
                return new C12866q3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$f1 */
        /* loaded from: classes2.dex */
        public class C12664f1 implements InterfaceC12341a<InterfaceC13429y2.InterfaceC13430a> {
            C12664f1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13429y2.InterfaceC13430a mo42226get() {
                return new C12605a8(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$f2 */
        /* loaded from: classes2.dex */
        public class C12665f2 implements InterfaceC12341a<InterfaceC13401v0.InterfaceC13402a> {
            C12665f2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13401v0.InterfaceC13402a mo42226get() {
                return new C12620c3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$f3 */
        /* loaded from: classes2.dex */
        public class C12666f3 implements InterfaceC12341a<InterfaceC13239d2.InterfaceC13240a> {
            C12666f3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13239d2.InterfaceC13240a mo42226get() {
                return new C12779g6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$g */
        /* loaded from: classes2.dex */
        public class C12667g implements InterfaceC12341a<InterfaceC13311k3.InterfaceC13312a> {
            C12667g() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13311k3.InterfaceC13312a mo42226get() {
                return new C12849o4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$g0 */
        /* loaded from: classes2.dex */
        public class C12668g0 implements InterfaceC12341a<InterfaceC13431z.InterfaceC13432a> {
            C12668g0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13431z.InterfaceC13432a mo42226get() {
                return new C12765f1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$g1 */
        /* loaded from: classes2.dex */
        public class C12669g1 implements InterfaceC12341a<InterfaceC13263g.InterfaceC13264a> {
            C12669g1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13263g.InterfaceC13264a mo42226get() {
                return new C12871r(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$g2 */
        /* loaded from: classes2.dex */
        public class C12670g2 implements InterfaceC12341a<InterfaceC13295j0.InterfaceC13296a> {
            C12670g2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13295j0.InterfaceC13296a mo42226get() {
                return new C12829m2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$g3 */
        /* loaded from: classes2.dex */
        public class C12671g3 implements InterfaceC12341a<InterfaceC13299j2.InterfaceC13300a> {
            C12671g3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13299j2.InterfaceC13300a mo42226get() {
                return new C12905u6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$h */
        /* loaded from: classes2.dex */
        public class C12672h implements InterfaceC12341a<InterfaceC13251e3.InterfaceC13252a> {
            C12672h() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13251e3.InterfaceC13252a mo42226get() {
                return new C12918w1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$h0 */
        /* loaded from: classes2.dex */
        public class C12673h0 implements InterfaceC12341a<InterfaceC13205a0.InterfaceC13206a> {
            C12673h0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13205a0.InterfaceC13206a mo42226get() {
                return new C12783h1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$h1 */
        /* loaded from: classes2.dex */
        public class C12674h1 implements InterfaceC12341a<InterfaceC13437z2.InterfaceC13438a> {
            C12674h1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13437z2.InterfaceC13438a mo42226get() {
                return new C12625c8(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$h2 */
        /* loaded from: classes2.dex */
        public class C12675h2 implements InterfaceC12341a<InterfaceC13409w0.InterfaceC13410a> {
            C12675h2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13409w0.InterfaceC13410a mo42226get() {
                return new C12904u5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$h3 */
        /* loaded from: classes2.dex */
        public class C12676h3 implements InterfaceC12341a<InterfaceC13309k2.InterfaceC13310a> {
            C12676h3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13309k2.InterfaceC13310a mo42226get() {
                return new C12923w6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$i */
        /* loaded from: classes2.dex */
        public class C12677i implements InterfaceC12341a<InterfaceC13221b3.InterfaceC13222a> {
            C12677i() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13221b3.InterfaceC13222a mo42226get() {
                return new C12925x(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$i0 */
        /* loaded from: classes2.dex */
        public class C12678i0 implements InterfaceC12341a<InterfaceC13423y.InterfaceC13424a> {
            C12678i0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13423y.InterfaceC13424a mo42226get() {
                return new C12628d1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$i1 */
        /* loaded from: classes2.dex */
        public class C12679i1 implements InterfaceC12341a<InterfaceC13375s.InterfaceC13376a> {
            C12679i1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13375s.InterfaceC13376a mo42226get() {
                return new C12818l0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$i2 */
        /* loaded from: classes2.dex */
        public class C12680i2 implements InterfaceC12341a<InterfaceC13403v1.InterfaceC13404a> {
            C12680i2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13403v1.InterfaceC13404a mo42226get() {
                return new C12868q5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$i3 */
        /* loaded from: classes2.dex */
        public class C12681i3 implements InterfaceC12341a<InterfaceC13259f2.InterfaceC13260a> {
            C12681i3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13259f2.InterfaceC13260a mo42226get() {
                return new C12887s6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$j */
        /* loaded from: classes2.dex */
        public class C12682j implements InterfaceC12341a<InterfaceC13211a3.InterfaceC13212a> {
            C12682j() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13211a3.InterfaceC13212a mo42226get() {
                return new C12781h(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$j0 */
        /* loaded from: classes2.dex */
        public class C12683j0 implements InterfaceC12341a<InterfaceC13277h1.InterfaceC13278a> {
            C12683j0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13277h1.InterfaceC13278a mo42226get() {
                return new C12759e4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$j1 */
        /* loaded from: classes2.dex */
        public class C12684j1 implements InterfaceC12341a<InterfaceC13351p.InterfaceC13352a> {
            C12684j1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13351p.InterfaceC13352a mo42226get() {
                return new C12782h0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$j2 */
        /* loaded from: classes2.dex */
        public class C12685j2 implements InterfaceC12341a<InterfaceC13385t0.InterfaceC13386a> {
            C12685j2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13385t0.InterfaceC13386a mo42226get() {
                return new C12937y2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$j3 */
        /* loaded from: classes2.dex */
        public class C12686j3 implements InterfaceC12341a<InterfaceC13269g2.InterfaceC13270a> {
            C12686j3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13269g2.InterfaceC13270a mo42226get() {
                return new C12815k6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$k */
        /* loaded from: classes2.dex */
        public class C12687k implements InterfaceC12341a<InterfaceC13357p2.InterfaceC13358a> {
            C12687k() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13357p2.InterfaceC13358a mo42226get() {
                return new C12795i4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$k0 */
        /* loaded from: classes2.dex */
        public class C12688k0 implements InterfaceC12341a<InterfaceC13365q2.InterfaceC13366a> {
            C12688k0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13365q2.InterfaceC13366a mo42226get() {
                return new C12816k7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$k1 */
        /* loaded from: classes2.dex */
        public class C12689k1 implements InterfaceC12341a<InterfaceC13223c.InterfaceC13224a> {
            C12689k1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13223c.InterfaceC13224a mo42226get() {
                return new C12763f(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$k2 */
        /* loaded from: classes2.dex */
        public class C12690k2 implements InterfaceC12341a<InterfaceC13353p0.InterfaceC13354a> {
            C12690k2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13353p0.InterfaceC13354a mo42226get() {
                return new C12865q2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$k3 */
        /* loaded from: classes2.dex */
        public class C12691k3 implements InterfaceC12341a<InterfaceC13249e2.InterfaceC13250a> {
            C12691k3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13249e2.InterfaceC13250a mo42226get() {
                return new C12797i6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$l */
        /* loaded from: classes2.dex */
        public class C12692l implements InterfaceC12341a<InterfaceC13301j3.InterfaceC13302a> {
            C12692l() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13301j3.InterfaceC13302a mo42226get() {
                return new C12777g4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$l0 */
        /* loaded from: classes2.dex */
        public class C12693l0 implements InterfaceC12341a<InterfaceC13373r2.InterfaceC13374a> {
            C12693l0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13373r2.InterfaceC13374a mo42226get() {
                return new C12834m7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$l1 */
        /* loaded from: classes2.dex */
        public class C12694l1 implements InterfaceC12341a<InterfaceC13335n0.InterfaceC13336a> {
            C12694l1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13335n0.InterfaceC13336a mo42226get() {
                return new C12811k2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$l2 */
        /* loaded from: classes2.dex */
        public class C12695l2 implements InterfaceC12341a<InterfaceC13389t2.InterfaceC13390a> {
            C12695l2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13389t2.InterfaceC13390a mo42226get() {
                return new C12870q7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$l3 */
        /* loaded from: classes2.dex */
        public class C12696l3 implements InterfaceC12341a<InterfaceC13219b2.InterfaceC13220a> {
            C12696l3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13219b2.InterfaceC13220a mo42226get() {
                return new C12623c6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$m */
        /* loaded from: classes2.dex */
        public class C12697m implements InterfaceC12341a<InterfaceC13231c3.InterfaceC13232a> {
            C12697m() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13231c3.InterfaceC13232a mo42226get() {
                return new C12926x0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$m0 */
        /* loaded from: classes2.dex */
        public class C12698m0 implements InterfaceC12341a<InterfaceC13247e1.InterfaceC13248a> {
            C12698m0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13247e1.InterfaceC13248a mo42226get() {
                return new C12920w3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$m1 */
        /* loaded from: classes2.dex */
        public class C12699m1 implements InterfaceC12341a<InterfaceC13203a.InterfaceC13204a> {
            C12699m1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13203a.InterfaceC13204a mo42226get() {
                return new C12596a(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$m2 */
        /* loaded from: classes2.dex */
        public class C12700m2 implements InterfaceC12341a<InterfaceC13361q0.InterfaceC13362a> {
            C12700m2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13361q0.InterfaceC13362a mo42226get() {
                return new C12883s2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$m3 */
        /* loaded from: classes2.dex */
        public class C12701m3 implements InterfaceC12341a<InterfaceC13289i2.InterfaceC13290a> {
            C12701m3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13289i2.InterfaceC13290a mo42226get() {
                return new C12851o6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$n */
        /* loaded from: classes2.dex */
        public class C12702n implements InterfaceC12341a<InterfaceC13241d3.InterfaceC13242a> {
            C12702n() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13241d3.InterfaceC13242a mo42226get() {
                return new C12944z0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$n0 */
        /* loaded from: classes2.dex */
        public class C12703n0 implements InterfaceC12341a<InterfaceC13397u2.InterfaceC13398a> {
            C12703n0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13397u2.InterfaceC13398a mo42226get() {
                return new C12888s7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$n1 */
        /* loaded from: classes2.dex */
        public class C12704n1 implements InterfaceC12341a<InterfaceC13395u1.InterfaceC13396a> {
            C12704n1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13395u1.InterfaceC13396a mo42226get() {
                return new C12850o5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$n2 */
        /* loaded from: classes2.dex */
        public class C12705n2 implements InterfaceC12341a<InterfaceC13307k1.InterfaceC13308a> {
            C12705n2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13307k1.InterfaceC13308a mo42226get() {
                return new C12831m4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$n3 */
        /* loaded from: classes2.dex */
        public class C12706n3 implements InterfaceC12341a<InterfaceC13419x1.InterfaceC13420a> {
            C12706n3() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13419x1.InterfaceC13420a mo42226get() {
                return new C12922w5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$o */
        /* loaded from: classes2.dex */
        public class C12707o implements InterfaceC12341a<InterfaceC13271g3.InterfaceC13272a> {
            C12707o() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13271g3.InterfaceC13272a mo42226get() {
                return new C12602a5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$o0 */
        /* loaded from: classes2.dex */
        public class C12708o0 implements InterfaceC12341a<InterfaceC13417x0.InterfaceC13418a> {
            C12708o0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13417x0.InterfaceC13418a mo42226get() {
                return new C12758e3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$o1 */
        /* loaded from: classes2.dex */
        public class C12709o1 implements InterfaceC12341a<InterfaceC13339n2.InterfaceC13340a> {
            C12709o1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13339n2.InterfaceC13340a mo42226get() {
                return new C12780g7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$o2 */
        /* loaded from: classes2.dex */
        public class C12710o2 implements InterfaceC12341a<InterfaceC13327m1.InterfaceC13328a> {
            C12710o2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13327m1.InterfaceC13328a mo42226get() {
                return new C12885s4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$p */
        /* loaded from: classes2.dex */
        public class C12711p implements InterfaceC12341a<InterfaceC13281h3.InterfaceC13282a> {
            C12711p() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13281h3.InterfaceC13282a mo42226get() {
                return new C12622c5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$p0 */
        /* loaded from: classes2.dex */
        public class C12712p0 implements InterfaceC12341a<InterfaceC13405v2.InterfaceC13406a> {
            C12712p0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13405v2.InterfaceC13406a mo42226get() {
                return new C12906u7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$p1 */
        /* loaded from: classes2.dex */
        public class C12713p1 implements InterfaceC12341a<InterfaceC13367r.InterfaceC13368a> {
            C12713p1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13367r.InterfaceC13368a mo42226get() {
                return new C12800j0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$p2 */
        /* loaded from: classes2.dex */
        public class C12714p2 implements InterfaceC12341a<InterfaceC13275h0.InterfaceC13276a> {
            C12714p2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13275h0.InterfaceC13276a mo42226get() {
                return new C12936y1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$q */
        /* loaded from: classes2.dex */
        public class C12715q implements InterfaceC12341a<InterfaceC13321l3.InterfaceC13322a> {
            C12715q() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13321l3.InterfaceC13322a mo42226get() {
                return new C12941y6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$q0 */
        /* loaded from: classes2.dex */
        public class C12716q0 implements InterfaceC12341a<InterfaceC13413w2.InterfaceC13414a> {
            C12716q0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13413w2.InterfaceC13414a mo42226get() {
                return new C12924w7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$q1 */
        /* loaded from: classes2.dex */
        public class C12717q1 implements InterfaceC12341a<InterfaceC13379s1.InterfaceC13380a> {
            C12717q1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13379s1.InterfaceC13380a mo42226get() {
                return new C12814k5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$q2 */
        /* loaded from: classes2.dex */
        public class C12718q2 implements InterfaceC12341a<InterfaceC13325m0.InterfaceC13326a> {
            C12718q2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13325m0.InterfaceC13326a mo42226get() {
                return new C12793i2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$r */
        /* loaded from: classes2.dex */
        public class C12719r implements InterfaceC12341a<InterfaceC13331m3.InterfaceC13332a> {
            C12719r() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13331m3.InterfaceC13332a mo42226get() {
                return new C12604a7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$r0 */
        /* loaded from: classes2.dex */
        public class C12720r0 implements InterfaceC12341a<InterfaceC13433z0.InterfaceC13434a> {
            C12720r0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13433z0.InterfaceC13434a mo42226get() {
                return new C12830m3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$r1 */
        /* loaded from: classes2.dex */
        public class C12721r1 implements InterfaceC12341a<InterfaceC13415x.InterfaceC13416a> {
            C12721r1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13415x.InterfaceC13416a mo42226get() {
                return new C12608b1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$r2 */
        /* loaded from: classes2.dex */
        public class C12722r2 implements InterfaceC12341a<InterfaceC13349o2.InterfaceC13350a> {
            C12722r2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13349o2.InterfaceC13350a mo42226get() {
                return new C12798i7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$s */
        /* loaded from: classes2.dex */
        public class C12723s implements InterfaceC12341a<InterfaceC13291i3.InterfaceC13292a> {
            C12723s() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13291i3.InterfaceC13292a mo42226get() {
                return new C12869q6(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$s0 */
        /* loaded from: classes2.dex */
        public class C12724s0 implements InterfaceC12341a<InterfaceC13287i1.InterfaceC13288a> {
            C12724s0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13287i1.InterfaceC13288a mo42226get() {
                return new C12601a4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$s1 */
        /* loaded from: classes2.dex */
        public class C12725s1 implements InterfaceC12341a<InterfaceC13425y0.InterfaceC13426a> {
            C12725s1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13425y0.InterfaceC13426a mo42226get() {
                return new C12776g3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$s2 */
        /* loaded from: classes2.dex */
        public class C12726s2 implements InterfaceC12341a<InterfaceC13273h.InterfaceC13274a> {
            C12726s2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13273h.InterfaceC13274a mo42226get() {
                return new C12889t(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$t */
        /* loaded from: classes2.dex */
        public class C12727t implements InterfaceC12341a<InterfaceC13341n3.InterfaceC13342a> {
            C12727t() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13341n3.InterfaceC13342a mo42226get() {
                return new C12778g5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$t0 */
        /* loaded from: classes2.dex */
        public class C12728t0 implements InterfaceC12341a<InterfaceC13313l.InterfaceC13314a> {
            C12728t0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13313l.InterfaceC13314a mo42226get() {
                return new C12794i3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$t1 */
        /* loaded from: classes2.dex */
        public class C12729t1 implements InterfaceC12341a<InterfaceC13393u0.InterfaceC13394a> {
            C12729t1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13393u0.InterfaceC13394a mo42226get() {
                return new C12600a3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$t2 */
        /* loaded from: classes2.dex */
        public class C12730t2 implements InterfaceC12341a<InterfaceC13435z1.InterfaceC13436a> {
            C12730t2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13435z1.InterfaceC13436a mo42226get() {
                return new C12890t0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$u */
        /* loaded from: classes2.dex */
        public class C12731u implements InterfaceC12341a<InterfaceC13391u.InterfaceC13392a> {
            C12731u() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13391u.InterfaceC13392a mo42226get() {
                return new C12854p0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$u0 */
        /* loaded from: classes2.dex */
        public class C12732u0 implements InterfaceC12341a<InterfaceC13303k.InterfaceC13304a> {
            C12732u0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13303k.InterfaceC13304a mo42226get() {
                return new C12812k3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$u1 */
        /* loaded from: classes2.dex */
        public class C12733u1 implements InterfaceC12341a<InterfaceC13215b0.InterfaceC13216a> {
            C12733u1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13215b0.InterfaceC13216a mo42226get() {
                return new C12801j1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$u2 */
        /* loaded from: classes2.dex */
        public class C12734u2 implements InterfaceC12341a<InterfaceC13407w.InterfaceC13408a> {
            C12734u2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13407w.InterfaceC13408a mo42226get() {
                return new C12908v0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$v */
        /* loaded from: classes2.dex */
        public class C12735v implements InterfaceC12341a<InterfaceC13305k0.InterfaceC13306a> {
            C12735v() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13305k0.InterfaceC13306a mo42226get() {
                return new C12757e2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$v0 */
        /* loaded from: classes2.dex */
        public class C12736v0 implements InterfaceC12341a<InterfaceC13257f1.InterfaceC13258a> {
            C12736v0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13257f1.InterfaceC13258a mo42226get() {
                return new C12938y3(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$v1 */
        /* loaded from: classes2.dex */
        public class C12737v1 implements InterfaceC12341a<InterfaceC13315l0.InterfaceC13316a> {
            C12737v1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13315l0.InterfaceC13316a mo42226get() {
                return new C12775g2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$v2 */
        /* loaded from: classes2.dex */
        public class C12738v2 implements InterfaceC12341a<InterfaceC13347o1.InterfaceC13348a> {
            C12738v2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13347o1.InterfaceC13348a mo42226get() {
                return new C12921w4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$w */
        /* loaded from: classes2.dex */
        public class C12739w implements InterfaceC12341a<InterfaceC13297j1.InterfaceC13298a> {
            C12739w() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13297j1.InterfaceC13298a mo42226get() {
                return new C12813k4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$w0 */
        /* loaded from: classes2.dex */
        public class C12740w0 implements InterfaceC12341a<InterfaceC13267g1.InterfaceC13268a> {
            C12740w0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13267g1.InterfaceC13268a mo42226get() {
                return new C12621c4(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$w1 */
        /* loaded from: classes2.dex */
        public class C12741w1 implements InterfaceC12341a<InterfaceC13245e0.InterfaceC13246a> {
            C12741w1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13245e0.InterfaceC13246a mo42226get() {
                return new C12855p1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$w2 */
        /* loaded from: classes2.dex */
        public class C12742w2 implements InterfaceC12341a<InterfaceC13345o0.InterfaceC13346a> {
            C12742w2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13345o0.InterfaceC13346a mo42226get() {
                return new C12847o2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$x */
        /* loaded from: classes2.dex */
        public class C12743x implements InterfaceC12341a<InterfaceC13371r1.InterfaceC13372a> {
            C12743x() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13371r1.InterfaceC13372a mo42226get() {
                return new C12796i5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$x0 */
        /* loaded from: classes2.dex */
        public class C12744x0 implements InterfaceC12341a<InterfaceC13323m.InterfaceC13324a> {
            C12744x0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13323m.InterfaceC13324a mo42226get() {
                return new C12607b0(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$x1 */
        /* loaded from: classes2.dex */
        public class C12745x1 implements InterfaceC12341a<InterfaceC13235d0.InterfaceC13236a> {
            C12745x1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13235d0.InterfaceC13236a mo42226get() {
                return new C12837n1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$x2 */
        /* loaded from: classes2.dex */
        public class C12746x2 implements InterfaceC12341a<InterfaceC13377s0.InterfaceC13378a> {
            C12746x2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13377s0.InterfaceC13378a mo42226get() {
                return new C12919w2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$y */
        /* loaded from: classes2.dex */
        public class C12747y implements InterfaceC12341a<InterfaceC13381s2.InterfaceC13382a> {
            C12747y() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13381s2.InterfaceC13382a mo42226get() {
                return new C12852o7(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$y0 */
        /* loaded from: classes2.dex */
        public class C12748y0 implements InterfaceC12341a<InterfaceC13359q.InterfaceC13360a> {
            C12748y0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13359q.InterfaceC13360a mo42226get() {
                return new C12817l(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$y1 */
        /* loaded from: classes2.dex */
        public class C12749y1 implements InterfaceC12341a<InterfaceC13255f0.InterfaceC13256a> {
            C12749y1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13255f0.InterfaceC13256a mo42226get() {
                return new C12873r1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$y2 */
        /* loaded from: classes2.dex */
        public class C12750y2 implements InterfaceC12341a<InterfaceC13369r0.InterfaceC13370a> {
            C12750y2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13369r0.InterfaceC13370a mo42226get() {
                return new C12901u2(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$z */
        /* loaded from: classes2.dex */
        public class C12751z implements InterfaceC12341a<InterfaceC13265g0.InterfaceC13266a> {
            C12751z() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13265g0.InterfaceC13266a mo42226get() {
                return new C12900u1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$z0 */
        /* loaded from: classes2.dex */
        public class C12752z0 implements InterfaceC12341a<InterfaceC13427y1.InterfaceC13428a> {
            C12752z0() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13427y1.InterfaceC13428a mo42226get() {
                return new C12940y5(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$z1 */
        /* loaded from: classes2.dex */
        public class C12753z1 implements InterfaceC12341a<InterfaceC13225c0.InterfaceC13226a> {
            C12753z1() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13225c0.InterfaceC13226a mo42226get() {
                return new C12819l1(C12636e.this.f32801a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaggerAppComponent.java */
        /* renamed from: xg.x$e$z2 */
        /* loaded from: classes2.dex */
        public class C12754z2 implements InterfaceC12341a<InterfaceC13233d.InterfaceC13234a> {
            C12754z2() {
            }

            @Override // p445xc.InterfaceC12341a
            /* renamed from: a */
            public InterfaceC13233d.InterfaceC13234a mo42226get() {
                return new C12799j(C12636e.this.f32801a);
            }
        }

        private C12636e(PingoDoceApp pingoDoceApp) {
            this.f32801a = this;
            m2749Z(pingoDoceApp);
            m2748a0(pingoDoceApp);
            m2746b0(pingoDoceApp);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public DispatchingAndroidInjector<Object> m2750Y() {
            return C4772d.m26653a(m2740e0(), Collections.emptyMap());
        }

        /* renamed from: Z */
        private void m2749Z(PingoDoceApp pingoDoceApp) {
            this.f32806b = new C12653d0();
            this.f32811c = new C12708o0();
            this.f32816d = new C12752z0();
            this.f32821e = new C12689k1();
            this.f32826f = new C12737v1();
            this.f32831g = new C12670g2();
            this.f32836h = new C12722r2();
            this.f32841i = new C12651c3();
            this.f32846j = new C12706n3();
            this.f32851k = new C12687k();
            this.f32856l = new C12731u();
            this.f32861m = new C12735v();
            this.f32866n = new C12739w();
            this.f32871o = new C12743x();
            this.f32876p = new C12747y();
            this.f32881q = new C12751z();
            this.f32886r = new C12638a0();
            this.f32890s = new C12643b0();
            this.f32894t = new C12648c0();
            this.f32898u = new C12658e0();
            this.f32902v = new C12663f0();
            this.f32906w = new C12668g0();
            this.f32910x = new C12673h0();
            this.f32914y = new C12678i0();
            this.f32918z = new C12683j0();
            this.f32697A = new C12688k0();
            this.f32701B = new C12693l0();
            this.f32705C = new C12698m0();
            this.f32709D = new C12703n0();
            this.f32713E = new C12712p0();
            this.f32717F = new C12716q0();
            this.f32721G = new C12720r0();
            this.f32725H = new C12724s0();
            this.f32729I = new C12728t0();
            this.f32733J = new C12732u0();
            this.f32737K = new C12736v0();
            this.f32741L = new C12740w0();
            this.f32745M = new C12744x0();
            this.f32749N = new C12748y0();
            this.f32753O = new C12639a1();
            this.f32757P = new C12644b1();
            this.f32761Q = new C12649c1();
            this.f32765R = new C12654d1();
            this.f32769S = new C12659e1();
            this.f32773T = new C12664f1();
            this.f32777U = new C12669g1();
            this.f32781V = new C12674h1();
            this.f32785W = new C12679i1();
            this.f32789X = new C12684j1();
            this.f32793Y = new C12694l1();
            this.f32797Z = new C12699m1();
            this.f32802a0 = new C12704n1();
            this.f32807b0 = new C12709o1();
            this.f32812c0 = new C12713p1();
            this.f32817d0 = new C12717q1();
            this.f32822e0 = new C12721r1();
            this.f32827f0 = new C12725s1();
            this.f32832g0 = new C12729t1();
            this.f32837h0 = new C12733u1();
            this.f32842i0 = new C12741w1();
            this.f32847j0 = new C12745x1();
            this.f32852k0 = new C12749y1();
            this.f32857l0 = new C12753z1();
            this.f32862m0 = new C12640a2();
            this.f32867n0 = new C12645b2();
            this.f32872o0 = new C12650c2();
            this.f32877p0 = new C12655d2();
            this.f32882q0 = new C12660e2();
            this.f32887r0 = new C12665f2();
            this.f32891s0 = new C12675h2();
            this.f32895t0 = new C12680i2();
            this.f32899u0 = new C12685j2();
            this.f32903v0 = new C12690k2();
            this.f32907w0 = new C12695l2();
            this.f32911x0 = new C12700m2();
            this.f32915y0 = new C12705n2();
            this.f32919z0 = new C12710o2();
            this.f32698A0 = new C12714p2();
            this.f32702B0 = new C12718q2();
            this.f32706C0 = new C12726s2();
            this.f32710D0 = new C12730t2();
            this.f32714E0 = new C12734u2();
            this.f32718F0 = new C12738v2();
            this.f32722G0 = new C12742w2();
            this.f32726H0 = new C12746x2();
            this.f32730I0 = new C12750y2();
            this.f32734J0 = new C12754z2();
            this.f32738K0 = new C12641a3();
            this.f32742L0 = new C12646b3();
            this.f32746M0 = new C12656d3();
            this.f32750N0 = new C12661e3();
            this.f32754O0 = new C12666f3();
            this.f32758P0 = new C12671g3();
            this.f32762Q0 = new C12676h3();
            this.f32766R0 = new C12681i3();
            this.f32770S0 = new C12686j3();
            this.f32774T0 = new C12691k3();
            this.f32778U0 = new C12696l3();
            this.f32782V0 = new C12701m3();
            this.f32786W0 = new C12637a();
        }

        /* renamed from: a0 */
        private void m2748a0(PingoDoceApp pingoDoceApp) {
            this.f32790X0 = new C12642b();
            this.f32794Y0 = new C12647c();
            this.f32798Z0 = new C12652d();
            this.f32803a1 = new C12657e();
            this.f32808b1 = new C12662f();
            this.f32813c1 = new C12667g();
            this.f32818d1 = new C12672h();
            this.f32823e1 = new C12677i();
            this.f32828f1 = new C12682j();
            this.f32833g1 = new C12692l();
            this.f32838h1 = new C12697m();
            this.f32843i1 = new C12702n();
            this.f32848j1 = new C12707o();
            this.f32853k1 = new C12711p();
            this.f32858l1 = new C12715q();
            this.f32863m1 = new C12719r();
            this.f32868n1 = new C12723s();
            this.f32873o1 = new C12727t();
            this.f32878p1 = C11613b.m4596a(C5045j.m25821a());
            InterfaceC12341a<ConnectionPool> m4596a = C11613b.m4596a(C5035c.m25845a());
            this.f32883q1 = m4596a;
            this.f32888r1 = C5041f.m25833a(this.f32878p1, m4596a);
            this.f32892s1 = C11615d.m4594a(pingoDoceApp);
            InterfaceC12341a<KeyGenParameterSpec> m4596a2 = C11613b.m4596a(C12522q.m2913a());
            this.f32896t1 = m4596a2;
            InterfaceC12341a<SharedPreferences> m4596a3 = C11613b.m4596a(C12533r.m2909a(this.f32892s1, m4596a2));
            this.f32900u1 = m4596a3;
            this.f32904v1 = C11613b.m4596a(C10177b.m8856a(m4596a3));
            this.f32908w1 = C11613b.m4596a(C5037d.m25841a());
            InterfaceC12341a<InterfaceC5503w> m4596a4 = C11613b.m4596a(C12440i.m2939a(this.f32892s1));
            this.f32912x1 = m4596a4;
            this.f32916y1 = C11613b.m4596a(C5043h.m25827a(this.f32888r1, this.f32904v1, this.f32908w1, m4596a4));
            InterfaceC12341a<String> m4596a5 = C11613b.m4596a(C5039e.m25837a());
            this.f32920z1 = m4596a5;
            this.f32699A1 = C11613b.m4596a(C5048l.m25814a(this.f32916y1, m4596a5));
            InterfaceC12341a<ResourcesProvider> m4596a6 = C11613b.m4596a(C12543s.m2906a(this.f32892s1));
            this.f32703B1 = m4596a6;
            C2127b m34608a = C2127b.m34608a(this.f32699A1, m4596a6);
            this.f32707C1 = m34608a;
            this.f32711D1 = C11613b.m4596a(C10605b.m7571a(m34608a, this.f32904v1));
            this.f32715E1 = C11613b.m4596a(C12429h.m2943a());
            this.f32719F1 = C11613b.m4596a(C12575v.m2895a(this.f32892s1));
            InterfaceC12341a<SharedPreferences> m4596a7 = C11613b.m4596a(C12482m.m2925a(this.f32892s1, this.f32896t1));
            this.f32723G1 = m4596a7;
            this.f32727H1 = C11613b.m4596a(C5666l.m23374a(this.f32719F1, m4596a7));
            this.f32731I1 = C11613b.m4596a(C5672p.m23366a(this.f32719F1, this.f32723G1));
            this.f32735J1 = C11613b.m4596a(C5657f.m23384a(this.f32719F1, this.f32723G1));
            InterfaceC12341a<C5682w> m4596a8 = C11613b.m4596a(C5684x.m23348a(this.f32719F1, this.f32723G1));
            this.f32739K1 = m4596a8;
            C5517b m23801a = C5517b.m23801a(this.f32904v1, this.f32727H1, this.f32731I1, this.f32735J1, m4596a8);
            this.f32743L1 = m23801a;
            InterfaceC12341a<InterfaceC5503w> m4596a9 = C11613b.m4596a(C12450j.m2936a(this.f32711D1, m23801a));
            this.f32747M1 = m4596a9;
            this.f32751N1 = C11613b.m4596a(C5042g.m25830a(this.f32888r1, this.f32904v1, this.f32711D1, this.f32908w1, this.f32715E1, m4596a9, this.f32912x1));
            InterfaceC12341a<String> m4596a10 = C11613b.m4596a(C5033b.m25849a());
            this.f32755O1 = m4596a10;
            this.f32759P1 = C11613b.m4596a(C5047k.m25817a(this.f32751N1, m4596a10));
            this.f32763Q1 = C11613b.m4596a(C12502o.m2919a(this.f32892s1));
            InterfaceC12341a<AppEventsLogger> m4596a11 = C11613b.m4596a(C12492n.m2922a(this.f32892s1));
            this.f32767R1 = m4596a11;
            InterfaceC12341a<AnalyticsManager> m4596a12 = C11613b.m4596a(C12376c.m2961a(this.f32763Q1, m4596a11));
            this.f32771S1 = m4596a12;
            this.f32775T1 = C11258b.m5599a(this.f32759P1, this.f32703B1, m4596a12);
            this.f32779U1 = C11345v.m5385a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32783V1 = C11321n.m5445a(this.f32759P1, this.f32703B1, this.f32771S1);
            InterfaceC12341a<OnboardingFlowDataSharedPreferences> m4596a13 = C11613b.m4596a(C8622b.m14988a(this.f32719F1));
            this.f32787W1 = m4596a13;
            this.f32791X1 = C11613b.m4596a(C7423t0.m18469a(this.f32719F1, m4596a13));
            this.f32795Y1 = C11613b.m4596a(C7476z.m18409a(this.f32723G1));
            C11290h0 m5519a = C11290h0.m5519a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32799Z1 = m5519a;
            this.f32804a2 = C11613b.m4596a(C4842p.m26493a(m5519a, this.f32727H1));
            this.f32809b2 = C11289h.m5522a(this.f32759P1, this.f32703B1, this.f32771S1);
            InterfaceC12341a<C5652c> m4596a14 = C11613b.m4596a(C5654d.m23387a(this.f32719F1));
            this.f32814c2 = m4596a14;
            this.f32819d2 = C11613b.m4596a(C4818e.m26539a(this.f32809b2, m4596a14));
            this.f32824e2 = C11304j.m5489a(this.f32759P1, this.f32703B1, this.f32771S1);
            InterfaceC12341a<C5658g> m4596a15 = C11613b.m4596a(C5660h.m23381a(this.f32719F1, this.f32723G1));
            this.f32829f2 = m4596a15;
            this.f32834g2 = C11613b.m4596a(C4824g.m26530a(this.f32824e2, m4596a15));
            this.f32839h2 = C11613b.m4596a(C4826i.m26525a(this.f32824e2, this.f32735J1));
            InterfaceC12341a<C5667m> m4596a16 = C11613b.m4596a(C5669n.m23369a(this.f32719F1));
            this.f32844i2 = m4596a16;
            this.f32849j2 = C11613b.m4596a(C4844r.m26487a(this.f32809b2, m4596a16));
            C11337r m5407a = C11337r.m5407a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32854k2 = m5407a;
            this.f32859l2 = C11613b.m4596a(C4847t.m26478a(m5407a, this.f32731I1));
            InterfaceC12341a<C5673q> m4596a17 = C11613b.m4596a(C5675r.m23363a(this.f32719F1));
            this.f32864m2 = m4596a17;
            this.f32869n2 = C11613b.m4596a(C4850w.m26472a(this.f32809b2, m4596a17));
            InterfaceC12341a<C5676s> m4596a18 = C11613b.m4596a(C5678t.m23358a(this.f32719F1));
            this.f32874o2 = m4596a18;
            this.f32879p2 = C11613b.m4596a(C4852y.m26467a(this.f32809b2, m4596a18));
            this.f32884q2 = C11319l0.m5452a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32889r2 = C11613b.m4596a(C12553t.m2903a());
            InterfaceC12341a<SimpleDateFormat> m4596a19 = C11613b.m4596a(C12386d.m2958a());
            this.f32893s2 = m4596a19;
            this.f32897t2 = C11613b.m4596a(C4816c0.m26544a(this.f32884q2, this.f32739K1, this.f32889r2, m4596a19));
            C11318l m5455a = C11318l.m5455a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32901u2 = m5455a;
            InterfaceC12341a<ConsentsAgent> m4596a20 = C11613b.m4596a(C4838n.m26504a(m5455a));
            this.f32905v2 = m4596a20;
            this.f32909w2 = C11613b.m4596a(C7422t.m18472a(this.f32901u2, m4596a20, this.f32795Y1));
            this.f32913x2 = C11273d.m5564a(this.f32759P1, this.f32703B1, this.f32771S1);
            InterfaceC12341a<C5649a> m4596a21 = C11613b.m4596a(C5651b.m23390a(this.f32719F1));
            this.f32917y2 = m4596a21;
            InterfaceC12341a<BannersAgent> m4596a22 = C11613b.m4596a(C4815c.m26547a(this.f32913x2, m4596a21));
            this.f32921z2 = m4596a22;
            this.f32700A2 = C11613b.m4596a(C7279g.m18809a(this.f32775T1, this.f32779U1, this.f32783V1, this.f32791X1, this.f32795Y1, this.f32904v1, this.f32711D1, this.f32804a2, this.f32819d2, this.f32834g2, this.f32839h2, this.f32849j2, this.f32859l2, this.f32869n2, this.f32879p2, this.f32897t2, this.f32909w2, m4596a22));
            this.f32704B2 = C11613b.m4596a(C12471l.m2929a());
            this.f32708C2 = C11613b.m4596a(C12460k.m2933a());
            this.f32712D2 = C11613b.m4596a(C12418g.m2947a());
            this.f32716E2 = C11613b.m4596a(C7233d.m18906a(this.f32791X1));
            this.f32720F2 = C11613b.m4596a(C12512p.m2916a(this.f32892s1));
            this.f32724G2 = C11613b.m4596a(C7399r1.m18573a(this.f32719F1));
            InterfaceC12341a<C5679u> m4596a23 = C11613b.m4596a(C5681v.m23355a(this.f32719F1, this.f32723G1));
            this.f32728H2 = m4596a23;
            InterfaceC12341a<StoresAgent> m4596a24 = C11613b.m4596a(C4794a0.m26589a(this.f32799Z1, m4596a23));
            this.f32732I2 = m4596a24;
            this.f32736J2 = C11613b.m4596a(C7309k1.m18745a(this.f32799Z1, this.f32804a2, this.f32897t2, m4596a24, this.f32700A2, this.f32849j2, this.f32819d2, this.f32921z2, this.f32869n2, this.f32879p2));
            InterfaceC12341a<C7405s1> m4596a25 = C11613b.m4596a(C7424t1.m18466a(this.f32884q2, this.f32791X1, this.f32897t2, this.f32739K1));
            this.f32740K2 = m4596a25;
            this.f32744L2 = C11613b.m4596a(C7342m.m18700a(this.f32703B1, this.f32809b2, m4596a25, this.f32859l2, this.f32804a2, this.f32819d2, this.f32879p2, this.f32869n2, this.f32849j2, this.f32897t2, this.f32839h2));
            this.f32748M2 = C11274d0.m5561a(this.f32759P1, this.f32703B1, this.f32771S1);
            InterfaceC12341a<SimpleDateFormat> m4596a26 = C11613b.m4596a(C12564u.m2899a());
            this.f32752N2 = m4596a26;
            this.f32756O2 = C11613b.m4596a(C7281g1.m18803a(this.f32748M2, this.f32791X1, this.f32795Y1, this.f32859l2, this.f32897t2, m4596a26));
            InterfaceC12341a<C5661i> m4596a27 = C11613b.m4596a(C5663j.m23377a(this.f32719F1, this.f32723G1));
            this.f32760P2 = m4596a27;
            InterfaceC12341a<CoachmarksAgent> m4596a28 = C11613b.m4596a(C4836l.m26509a(m4596a27, this.f32719F1));
            this.f32764Q2 = m4596a28;
            this.f32768R2 = C11613b.m4596a(C7397r.m18579a(m4596a28, this.f32859l2, this.f32897t2));
            this.f32772S2 = C11279f0.m5546a(this.f32759P1, this.f32703B1, this.f32771S1);
        }

        /* renamed from: b0 */
        private void m2746b0(PingoDoceApp pingoDoceApp) {
            InterfaceC12341a<C8223b> m4596a = C11613b.m4596a(C12397e.m2954a());
            this.f32776T2 = m4596a;
            InterfaceC12341a<LoyaltyCardManager> m4596a2 = C11613b.m4596a(C7234d0.m18903a(this.f32854k2, this.f32859l2, this.f32791X1, m4596a, this.f32897t2, this.f32839h2));
            this.f32780U2 = m4596a2;
            this.f32784V2 = C11613b.m4596a(C7295i1.m18778a(this.f32772S2, this.f32711D1, m4596a2, this.f32897t2));
            C11350x m5372a = C11350x.m5372a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32788W2 = m5372a;
            this.f32792X2 = C11613b.m4596a(C7372o0.m18633a(m5372a, this.f32711D1));
            this.f32796Y2 = C11613b.m4596a(C7308k0.m18748a(this.f32779U1, this.f32711D1, this.f32795Y1, this.f32787W1, this.f32897t2));
            InterfaceC12341a<OkHttpClient> m4596a3 = C11613b.m4596a(C5044i.m25824a(this.f32888r1, this.f32908w1, this.f32912x1));
            this.f32800Z2 = m4596a3;
            InterfaceC12341a<Retrofit> m4596a4 = C11613b.m4596a(C5049m.m25811a(m4596a3, this.f32755O1));
            this.f32805a3 = m4596a4;
            C11354z m5360a = C11354z.m5360a(this.f32759P1, m4596a4, this.f32703B1, this.f32771S1);
            this.f32810b3 = m5360a;
            this.f32815c3 = C11613b.m4596a(C7398r0.m18576a(m5360a));
            InterfaceC12341a<C0577e> m4596a5 = C11613b.m4596a(C12408f.m2950a(this.f32892s1));
            this.f32820d3 = m4596a5;
            this.f32825e3 = C11613b.m4596a(C7307k.m18751a(this.f32795Y1, m4596a5));
            C11326p m5432a = C11326p.m5432a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32830f3 = m5432a;
            this.f32835g3 = C11613b.m4596a(C7466w.m18436a(m5432a));
            C11339t m5400a = C11339t.m5400a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32840h3 = m5400a;
            this.f32845i3 = C11613b.m4596a(C7280g0.m18806a(m5400a));
            this.f32850j3 = C11613b.m4596a(C7376p.m18629a(this.f32834g2, this.f32839h2, this.f32897t2, this.f32859l2, this.f32849j2, this.f32879p2, this.f32869n2, this.f32921z2));
            this.f32855k3 = C11613b.m4596a(C7293i.m18781a(this.f32921z2, this.f32804a2, this.f32897t2, this.f32839h2));
            C11305j0 m5486a = C11305j0.m5486a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32860l3 = m5486a;
            this.f32865m3 = C11613b.m4596a(C7363n1.m18656a(m5486a, this.f32791X1));
            this.f32870n3 = C11613b.m4596a(C7199a1.m18956a(this.f32791X1));
            C11259b0 m5596a = C11259b0.m5596a(this.f32759P1, this.f32703B1, this.f32771S1);
            this.f32875o3 = m5596a;
            this.f32880p3 = C11613b.m4596a(C7467w0.m18433a(m5596a, this.f32791X1));
            this.f32885q3 = C11613b.m4596a(C7475y0.m18412a(this.f32703B1, this.f32771S1));
        }

        /* renamed from: d0 */
        private PingoDoceApp m2742d0(PingoDoceApp pingoDoceApp) {
            C4771c.m26654a(pingoDoceApp, m2750Y());
            C2129b.m34605a(pingoDoceApp, this.f32700A2.mo42226get());
            return pingoDoceApp;
        }

        /* renamed from: e0 */
        private Map<Class<?>, InterfaceC12341a<InterfaceC4768a.InterfaceC4769a<?>>> m2740e0() {
            return C11616e.m4592b(C4906j.f13380A0).m4591c(PushNotificationDispatcherActivity.class, this.f32806b).m4591c(NotificationLandingActivity.class, this.f32811c).m4591c(SplashActivity.class, this.f32816d).m4591c(AppWalkThroughActivity.class, this.f32821e).m4591c(IntroActivity.class, this.f32826f).m4591c(LoginPhoneActivity.class, this.f32831g).m4591c(UpdatePhoneActivity.class, this.f32836h).m4591c(CreatePhoneActivity.class, this.f32841i).m4591c(SmsValidationActivity.class, this.f32846j).m4591c(PhoneUpdateSmsValidationActivity.class, this.f32851k).m4591c(CreatePinActivity.class, this.f32856l).m4591c(InsertPinActivity.class, this.f32861m).m4591c(PinRecoverActivity.class, this.f32866n).m4591c(RecoverPinActivity.class, this.f32871o).m4591c(ValidatePinForUpdatePhoneActivity.class, this.f32876p).m4591c(FetchTermsAndConditionsActivity.class, this.f32881q).m4591c(TermsAndConditionsActivity.class, this.f32886r).m4591c(OnboardingEmailActivity.class, this.f32890s).m4591c(OnboardingNifActivity.class, this.f32894t).m4591c(OnboardingMyPdActivity.class, this.f32898u).m4591c(OnboardingEmailSentActivity.class, this.f32902v).m4591c(EditEmailActivity.class, this.f32906w).m4591c(EditNifActivity.class, this.f32910x).m4591c(EditBirthDateActivity.class, this.f32914y).m4591c(OnboardingSuccessActivity.class, this.f32918z).m4591c(UserDataInsertActivity.class, this.f32697A).m4591c(UserDataUpdateActivity.class, this.f32701B).m4591c(OnboardingNotificationActivity.class, this.f32705C).m4591c(VirtualCardDataConfirmationActivity.class, this.f32709D).m4591c(VirtualCardPreferencesActivity.class, this.f32713E).m4591c(VirtualCardSuccessActivity.class, this.f32717F).m4591c(OnboardingCardTutorialActivity.class, this.f32721G).m4591c(OnboardingOwnerInV2Activity.class, this.f32725H).m4591c(OnboardingCardQuestionActivity.class, this.f32729I).m4591c(OnboardingCardRegistrationActivity.class, this.f32733J).m4591c(OnboardingOtherUserCardTutorialActivity.class, this.f32737K).m4591c(OnboardingResumeActivity.class, this.f32741L).m4591c(CardRegistrationActivity.class, this.f32745M).m4591c(AvailableCardsResumeActivity.class, this.f32749N).m4591c(CardRegistrationResumeActivity.class, this.f32753O).m4591c(CardRegistrationLandingActivity.class, this.f32757P).m4591c(BabyClubUpdateActivity.class, this.f32761Q).m4591c(BabyClubHomeActivity.class, this.f32765R).m4591c(WineClubHomeActivity.class, this.f32769S).m4591c(WineClubUpdateActivity.class, this.f32773T).m4591c(BabyClubWelcomeActivity.class, this.f32777U).m4591c(WineClubWelcomeActivity.class, this.f32781V).m4591c(ClubActivity.class, this.f32785W).m4591c(CardRegistrationStatusActivity.class, this.f32789X).m4591c(LoggedAccountActivity.class, this.f32793Y).m4591c(AnonymousAccountActivity.class, this.f32797Z).m4591c(SettingsActivity.class, this.f32802a0).m4591c(TermsOfUseActivity.class, this.f32807b0).m4591c(ChangePinActivity.class, this.f32812c0).m4591c(ReplacePinActivity.class, this.f32817d0).m4591c(DeleteAccountActivity.class, this.f32822e0).m4591c(NotificationsActivity.class, this.f32827f0).m4591c(MadeForYouActivity.class, this.f32832g0).m4591c(ElectronicInvoiceActivity.class, this.f32837h0).m4591c(ElectronicInvoicePhoneActivity.class, this.f32842i0).m4591c(ElectronicInvoiceEmailActivity.class, this.f32847j0).m4591c(ElectronicInvoiceStatusActivity.class, this.f32852k0).m4591c(ElectronicInvoiceEditEmailActivity.class, this.f32857l0).m4591c(ProfileActivity.class, this.f32862m0).m4591c(HomeActivity.class, this.f32867n0).m4591c(TailoredForYouActivity.class, this.f32872o0).m4591c(SearchActivity.class, this.f32877p0).m4591c(ShoppingListActivity.class, this.f32882q0).m4591c(ManualSortShoppingListActivity.class, this.f32887r0).m4591c(ShoppingListsActivity.class, this.f32891s0).m4591c(SharedWithActivity.class, this.f32895t0).m4591c(LoyaltyRemovedActivity.class, this.f32899u0).m4591c(LoyaltyCardActivity.class, this.f32903v0).m4591c(VersionControlActivity.class, this.f32907w0).m4591c(LoyaltyCardInvitesActivity.class, this.f32911x0).m4591c(ProductDetailActivity.class, this.f32915y0).m4591c(PromotionActivity.class, this.f32919z0).m4591c(FlyerActivity.class, this.f32698A0).m4591c(LockActivity.class, this.f32702B0).m4591c(BannerDetailActivity.class, this.f32706C0).m4591c(DefaultStoreActivity.class, this.f32710D0).m4591c(DefaultStoreDetailActivity.class, this.f32714E0).m4591c(PurchaseListActivity.class, this.f32718F0).m4591c(LoyaltyActivity.class, this.f32722G0).m4591c(LoyaltyPendingActivity.class, this.f32726H0).m4591c(LoyaltyIntroActivity.class, this.f32730I0).m4591c(AssociationsActivity.class, this.f32734J0).m4591c(PurchaseDetailActivity.class, this.f32738K0).m4591c(PurchaseProductsActivity.class, this.f32742L0).m4591c(TakeAwayWalkThroughActivity.class, this.f32746M0).m4591c(AnonymousSessionTakeAwayLandingActivity.class, this.f32750N0).m4591c(TakeAwayLandingActivity.class, this.f32754O0).m4591c(TakeAwayStoreActivity.class, this.f32758P0).m4591c(TakeAwayStoreDetailActivity.class, this.f32762Q0).m4591c(TakeAwayProductsActivity.class, this.f32766R0).m4591c(TakeAwayMenuDetailActivity.class, this.f32770S0).m4591c(TakeAwayMealDetailActivity.class, this.f32774T0).m4591c(TakeAwayCheckoutSuccessActivity.class, this.f32778U0).m4591c(TakeAwayOrderListActivity.class, this.f32782V0).m4591c(TakeAwayOrderDetailActivity.class, this.f32786W0).m4591c(TakeAwayEditEmailActivity.class, this.f32790X0).m4591c(BenefitsActivity.class, this.f32794Y0).m4591c(DebugActivity.class, this.f32798Z0).m4591c(CacheActivity.class, this.f32803a1).m4591c(FlyersFragment.class, this.f32808b1).m4591c(ProductListFragment.class, this.f32813c1).m4591c(FiltersBottomSheetFragment.class, this.f32818d1).m4591c(BenefitsDetailsBottomSheetFragment.class, this.f32823e1).m4591c(C5076a.class, this.f32828f1).m4591c(C5518a.class, this.f32833g1).m4591c(DefaultStoreListFragment.class, this.f32838h1).m4591c(DefaultStoreMapFragment.class, this.f32843i1).m4591c(PurchasesChartFragment.class, this.f32848j1).m4591c(PurchasesRecentFragment.class, this.f32853k1).m4591c(TakeAwayStoreListFragment.class, this.f32858l1).m4591c(TakeAwayStoreMapFragment.class, this.f32863m1).m4591c(TakeAwayProductListFragment.class, this.f32868n1).m4591c(PushNotificationMessagingService.class, this.f32873o1).m4593a();
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c0 */
        public void mo2889c(PingoDoceApp pingoDoceApp) {
            m2742d0(pingoDoceApp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e0 */
    /* loaded from: classes2.dex */
    public static final class C12755e0 implements InterfaceC13333n {

        /* renamed from: a */
        private final C12636e f33040a;

        /* renamed from: b */
        private InterfaceC12341a<CardRegistrationLandingActivity> f33041b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33042c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33043d;

        /* renamed from: e */
        private C13937d f33044e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33045f;

        private C12755e0(C12636e c12636e, CardRegistrationLandingActivity cardRegistrationLandingActivity) {
            this.f33040a = c12636e;
            m2600b(cardRegistrationLandingActivity);
        }

        /* renamed from: b */
        private void m2600b(CardRegistrationLandingActivity cardRegistrationLandingActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(cardRegistrationLandingActivity);
            this.f33041b = m4594a;
            this.f33042c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33040a.f32704B2, this.f33040a.f32708C2, this.f33040a.f32712D2));
            this.f33043d = C11613b.m4596a(C5975c.m22544a(this.f33040a.f32703B1));
            C13937d m47a = C13937d.m47a(this.f33040a.f32703B1, this.f33040a.f32796Y2, this.f33040a.f32740K2, this.f33040a.f32740K2);
            this.f33044e = m47a;
            this.f33045f = C13938e.m44b(m47a);
        }

        /* renamed from: d */
        private CardRegistrationLandingActivity m2598d(CardRegistrationLandingActivity cardRegistrationLandingActivity) {
            C11205c.m5751a(cardRegistrationLandingActivity, this.f33040a.m2750Y());
            C5921e.m22726a(cardRegistrationLandingActivity, this.f33042c.mo42226get());
            C13872m.m123d(cardRegistrationLandingActivity, this.f33043d.mo42226get());
            C13872m.m125b(cardRegistrationLandingActivity, (AuthManager) this.f33040a.f32700A2.mo42226get());
            C13872m.m126a(cardRegistrationLandingActivity, (AppRatingManager) this.f33040a.f32716E2.mo42226get());
            C13872m.m124c(cardRegistrationLandingActivity, (InterfaceC3954c) this.f33040a.f32720F2.mo42226get());
            C13934b.m58a(cardRegistrationLandingActivity, m2596f());
            return cardRegistrationLandingActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2597e() {
            return Collections.singletonMap(CardRegistrationLandingViewModel.class, (InterfaceC6657b) this.f33045f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2596f() {
            return new ViewModelFactoryByInjection(m2597e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CardRegistrationLandingActivity cardRegistrationLandingActivity) {
            m2598d(cardRegistrationLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e1 */
    /* loaded from: classes2.dex */
    public static final class C12756e1 implements InterfaceC13423y {

        /* renamed from: a */
        private final C12636e f33046a;

        /* renamed from: b */
        private InterfaceC12341a<EditBirthDateActivity> f33047b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33048c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33049d;

        /* renamed from: e */
        private C6664e f33050e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33051f;

        private C12756e1(C12636e c12636e, EditBirthDateActivity editBirthDateActivity) {
            this.f33046a = c12636e;
            m2595b(editBirthDateActivity);
        }

        /* renamed from: b */
        private void m2595b(EditBirthDateActivity editBirthDateActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(editBirthDateActivity);
            this.f33047b = m4594a;
            this.f33048c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33046a.f32704B2, this.f33046a.f32708C2, this.f33046a.f32712D2));
            this.f33049d = C11613b.m4596a(C5975c.m22544a(this.f33046a.f32703B1));
            C6664e m20358a = C6664e.m20358a(this.f33046a.f32703B1, this.f33046a.f32740K2);
            this.f33050e = m20358a;
            this.f33051f = C6665f.m20354c(m20358a);
        }

        /* renamed from: d */
        private EditBirthDateActivity m2593d(EditBirthDateActivity editBirthDateActivity) {
            C11205c.m5751a(editBirthDateActivity, this.f33046a.m2750Y());
            C5921e.m22726a(editBirthDateActivity, this.f33048c.mo42226get());
            C13872m.m123d(editBirthDateActivity, this.f33049d.mo42226get());
            C13872m.m125b(editBirthDateActivity, (AuthManager) this.f33046a.f32700A2.mo42226get());
            C13872m.m126a(editBirthDateActivity, (AppRatingManager) this.f33046a.f32716E2.mo42226get());
            C13872m.m124c(editBirthDateActivity, (InterfaceC3954c) this.f33046a.f32720F2.mo42226get());
            C6663c.m20361a(editBirthDateActivity, m2591f());
            return editBirthDateActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2592e() {
            return Collections.singletonMap(EditBirthDateViewModel.class, (InterfaceC6657b) this.f33051f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2591f() {
            return new ViewModelFactoryByInjection(m2592e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(EditBirthDateActivity editBirthDateActivity) {
            m2593d(editBirthDateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e2 */
    /* loaded from: classes2.dex */
    public static final class C12757e2 implements InterfaceC13305k0.InterfaceC13306a {

        /* renamed from: a */
        private final C12636e f33052a;

        private C12757e2(C12636e c12636e) {
            this.f33052a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13305k0 mo2891c(InsertPinActivity insertPinActivity) {
            C11617f.m4590a(insertPinActivity);
            return new C12766f2(this.f33052a, insertPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e3 */
    /* loaded from: classes2.dex */
    public static final class C12758e3 implements InterfaceC13417x0.InterfaceC13418a {

        /* renamed from: a */
        private final C12636e f33053a;

        private C12758e3(C12636e c12636e) {
            this.f33053a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13417x0 mo2891c(NotificationLandingActivity notificationLandingActivity) {
            C11617f.m4590a(notificationLandingActivity);
            return new C12767f3(this.f33053a, notificationLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e4 */
    /* loaded from: classes2.dex */
    public static final class C12759e4 implements InterfaceC13277h1.InterfaceC13278a {

        /* renamed from: a */
        private final C12636e f33054a;

        private C12759e4(C12636e c12636e) {
            this.f33054a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13277h1 mo2891c(OnboardingSuccessActivity onboardingSuccessActivity) {
            C11617f.m4590a(onboardingSuccessActivity);
            return new C12768f4(this.f33054a, onboardingSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e5 */
    /* loaded from: classes2.dex */
    public static final class C12760e5 implements InterfaceC13363q1.InterfaceC13364a {

        /* renamed from: a */
        private final C12636e f33055a;

        private C12760e5(C12636e c12636e) {
            this.f33055a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13363q1 mo2891c(PushNotificationDispatcherActivity pushNotificationDispatcherActivity) {
            C11617f.m4590a(pushNotificationDispatcherActivity);
            return new C12769f5(this.f33055a, pushNotificationDispatcherActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e6 */
    /* loaded from: classes2.dex */
    public static final class C12761e6 implements InterfaceC13229c2.InterfaceC13230a {

        /* renamed from: a */
        private final C12636e f33056a;

        private C12761e6(C12636e c12636e) {
            this.f33056a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13229c2 mo2891c(TakeAwayEditEmailActivity takeAwayEditEmailActivity) {
            C11617f.m4590a(takeAwayEditEmailActivity);
            return new C12770f6(this.f33056a, takeAwayEditEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$e7 */
    /* loaded from: classes2.dex */
    public static final class C12762e7 implements InterfaceC13329m2.InterfaceC13330a {

        /* renamed from: a */
        private final C12636e f33057a;

        private C12762e7(C12636e c12636e) {
            this.f33057a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13329m2 mo2891c(TermsAndConditionsActivity termsAndConditionsActivity) {
            C11617f.m4590a(termsAndConditionsActivity);
            return new C12771f7(this.f33057a, termsAndConditionsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f */
    /* loaded from: classes2.dex */
    public static final class C12763f implements InterfaceC13223c.InterfaceC13224a {

        /* renamed from: a */
        private final C12636e f33058a;

        private C12763f(C12636e c12636e) {
            this.f33058a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13223c mo2891c(AppWalkThroughActivity appWalkThroughActivity) {
            C11617f.m4590a(appWalkThroughActivity);
            return new C12772g(this.f33058a, appWalkThroughActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f0 */
    /* loaded from: classes2.dex */
    public static final class C12764f0 implements InterfaceC13343o.InterfaceC13344a {

        /* renamed from: a */
        private final C12636e f33059a;

        private C12764f0(C12636e c12636e) {
            this.f33059a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13343o mo2891c(CardRegistrationResumeActivity cardRegistrationResumeActivity) {
            C11617f.m4590a(cardRegistrationResumeActivity);
            return new C12773g0(this.f33059a, cardRegistrationResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f1 */
    /* loaded from: classes2.dex */
    public static final class C12765f1 implements InterfaceC13431z.InterfaceC13432a {

        /* renamed from: a */
        private final C12636e f33060a;

        private C12765f1(C12636e c12636e) {
            this.f33060a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13431z mo2891c(EditEmailActivity editEmailActivity) {
            C11617f.m4590a(editEmailActivity);
            return new C12774g1(this.f33060a, editEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f2 */
    /* loaded from: classes2.dex */
    public static final class C12766f2 implements InterfaceC13305k0 {

        /* renamed from: a */
        private final C12636e f33061a;

        /* renamed from: b */
        private InterfaceC12341a<InsertPinActivity> f33062b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33063c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33064d;

        /* renamed from: e */
        private C8646d f33065e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33066f;

        private C12766f2(C12636e c12636e, InsertPinActivity insertPinActivity) {
            this.f33061a = c12636e;
            m2581b(insertPinActivity);
        }

        /* renamed from: b */
        private void m2581b(InsertPinActivity insertPinActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(insertPinActivity);
            this.f33062b = m4594a;
            this.f33063c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33061a.f32704B2, this.f33061a.f32708C2, this.f33061a.f32712D2));
            this.f33064d = C11613b.m4596a(C5975c.m22544a(this.f33061a.f32703B1));
            C8646d m14908a = C8646d.m14908a(this.f33061a.f32703B1, this.f33061a.f32700A2, this.f33061a.f32820d3, this.f33061a.f32815c3, this.f33061a.f32711D1, this.f33061a.f32771S1, this.f33061a.f32825e3, this.f33061a.f32756O2, this.f33061a.f32740K2, this.f33061a.f32740K2);
            this.f33065e = m14908a;
            this.f33066f = C8647e.m14904c(m14908a);
        }

        /* renamed from: d */
        private InsertPinActivity m2579d(InsertPinActivity insertPinActivity) {
            C11205c.m5751a(insertPinActivity, this.f33061a.m2750Y());
            C5921e.m22726a(insertPinActivity, this.f33063c.mo42226get());
            C13872m.m123d(insertPinActivity, this.f33064d.mo42226get());
            C13872m.m125b(insertPinActivity, (AuthManager) this.f33061a.f32700A2.mo42226get());
            C13872m.m126a(insertPinActivity, (AppRatingManager) this.f33061a.f32716E2.mo42226get());
            C13872m.m124c(insertPinActivity, (InterfaceC3954c) this.f33061a.f32720F2.mo42226get());
            C8638b.m14935a(insertPinActivity, m2577f());
            return insertPinActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2578e() {
            return Collections.singletonMap(InsertPinViewModel.class, (InterfaceC6657b) this.f33066f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2577f() {
            return new ViewModelFactoryByInjection(m2578e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(InsertPinActivity insertPinActivity) {
            m2579d(insertPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f3 */
    /* loaded from: classes2.dex */
    public static final class C12767f3 implements InterfaceC13417x0 {

        /* renamed from: a */
        private final C12636e f33067a;

        private C12767f3(C12636e c12636e, NotificationLandingActivity notificationLandingActivity) {
            this.f33067a = c12636e;
        }

        /* renamed from: c */
        private NotificationLandingActivity m2575c(NotificationLandingActivity notificationLandingActivity) {
            C11205c.m5751a(notificationLandingActivity, this.f33067a.m2750Y());
            C5135b.m25578b(notificationLandingActivity, (C7405s1) this.f33067a.f32740K2.mo42226get());
            C5135b.m25579a(notificationLandingActivity, (PrefsManager) this.f33067a.f32791X1.mo42226get());
            return notificationLandingActivity;
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: b */
        public void mo2889c(NotificationLandingActivity notificationLandingActivity) {
            m2575c(notificationLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f4 */
    /* loaded from: classes2.dex */
    public static final class C12768f4 implements InterfaceC13277h1 {

        /* renamed from: a */
        private final C12636e f33068a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingSuccessActivity> f33069b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33070c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33071d;

        /* renamed from: e */
        private C2177e f33072e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33073f;

        private C12768f4(C12636e c12636e, OnboardingSuccessActivity onboardingSuccessActivity) {
            this.f33068a = c12636e;
            m2574b(onboardingSuccessActivity);
        }

        /* renamed from: b */
        private void m2574b(OnboardingSuccessActivity onboardingSuccessActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingSuccessActivity);
            this.f33069b = m4594a;
            this.f33070c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33068a.f32704B2, this.f33068a.f32708C2, this.f33068a.f32712D2));
            this.f33071d = C11613b.m4596a(C5975c.m22544a(this.f33068a.f32703B1));
            C2177e m34505a = C2177e.m34505a(this.f33068a.f32703B1, this.f33068a.f32771S1, this.f33068a.f32740K2);
            this.f33072e = m34505a;
            this.f33073f = C2178f.m34501c(m34505a);
        }

        /* renamed from: d */
        private OnboardingSuccessActivity m2572d(OnboardingSuccessActivity onboardingSuccessActivity) {
            C11205c.m5751a(onboardingSuccessActivity, this.f33068a.m2750Y());
            C5921e.m22726a(onboardingSuccessActivity, this.f33070c.mo42226get());
            C13872m.m123d(onboardingSuccessActivity, this.f33071d.mo42226get());
            C13872m.m125b(onboardingSuccessActivity, (AuthManager) this.f33068a.f32700A2.mo42226get());
            C13872m.m126a(onboardingSuccessActivity, (AppRatingManager) this.f33068a.f32716E2.mo42226get());
            C13872m.m124c(onboardingSuccessActivity, (InterfaceC3954c) this.f33068a.f32720F2.mo42226get());
            C2173b.m34516a(onboardingSuccessActivity, m2570f());
            return onboardingSuccessActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2571e() {
            return Collections.singletonMap(OnboardingSuccessViewModel.class, (InterfaceC6657b) this.f33073f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2570f() {
            return new ViewModelFactoryByInjection(m2571e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingSuccessActivity onboardingSuccessActivity) {
            m2572d(onboardingSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f5 */
    /* loaded from: classes2.dex */
    public static final class C12769f5 implements InterfaceC13363q1 {

        /* renamed from: a */
        private final C12636e f33074a;

        /* renamed from: b */
        private InterfaceC12341a<PushNotificationDispatcherActivity> f33075b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33076c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33077d;

        /* renamed from: e */
        private C5143f f33078e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33079f;

        private C12769f5(C12636e c12636e, PushNotificationDispatcherActivity pushNotificationDispatcherActivity) {
            this.f33074a = c12636e;
            m2569b(pushNotificationDispatcherActivity);
        }

        /* renamed from: b */
        private void m2569b(PushNotificationDispatcherActivity pushNotificationDispatcherActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(pushNotificationDispatcherActivity);
            this.f33075b = m4594a;
            this.f33076c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33074a.f32704B2, this.f33074a.f32708C2, this.f33074a.f32712D2));
            this.f33077d = C11613b.m4596a(C5975c.m22544a(this.f33074a.f32703B1));
            C5143f m25565a = C5143f.m25565a(this.f33074a.f32703B1, this.f33074a.f32736J2, this.f33074a.f32744L2, this.f33074a.f32740K2);
            this.f33078e = m25565a;
            this.f33079f = C5144g.m25561c(m25565a);
        }

        /* renamed from: d */
        private PushNotificationDispatcherActivity m2567d(PushNotificationDispatcherActivity pushNotificationDispatcherActivity) {
            C11205c.m5751a(pushNotificationDispatcherActivity, this.f33074a.m2750Y());
            C5921e.m22726a(pushNotificationDispatcherActivity, this.f33076c.mo42226get());
            C13872m.m123d(pushNotificationDispatcherActivity, this.f33077d.mo42226get());
            C13872m.m125b(pushNotificationDispatcherActivity, (AuthManager) this.f33074a.f32700A2.mo42226get());
            C13872m.m126a(pushNotificationDispatcherActivity, (AppRatingManager) this.f33074a.f32716E2.mo42226get());
            C13872m.m124c(pushNotificationDispatcherActivity, (InterfaceC3954c) this.f33074a.f32720F2.mo42226get());
            C5136d.m25576a(pushNotificationDispatcherActivity, (TransactionCacheManager) this.f33074a.f32724G2.mo42226get());
            C5136d.m25575b(pushNotificationDispatcherActivity, m2565f());
            return pushNotificationDispatcherActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2566e() {
            return Collections.singletonMap(PushNotificationDispatcherViewModel.class, (InterfaceC6657b) this.f33079f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2565f() {
            return new ViewModelFactoryByInjection(m2566e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PushNotificationDispatcherActivity pushNotificationDispatcherActivity) {
            m2567d(pushNotificationDispatcherActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f6 */
    /* loaded from: classes2.dex */
    public static final class C12770f6 implements InterfaceC13229c2 {

        /* renamed from: a */
        private final C12636e f33080a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayEditEmailActivity> f33081b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33082c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33083d;

        /* renamed from: e */
        private C10642d f33084e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33085f;

        private C12770f6(C12636e c12636e, TakeAwayEditEmailActivity takeAwayEditEmailActivity) {
            this.f33080a = c12636e;
            m2564b(takeAwayEditEmailActivity);
        }

        /* renamed from: b */
        private void m2564b(TakeAwayEditEmailActivity takeAwayEditEmailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayEditEmailActivity);
            this.f33081b = m4594a;
            this.f33082c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33080a.f32704B2, this.f33080a.f32708C2, this.f33080a.f32712D2));
            this.f33083d = C11613b.m4596a(C5975c.m22544a(this.f33080a.f32703B1));
            C10642d m7428a = C10642d.m7428a(this.f33080a.f32703B1, this.f33080a.f32771S1, this.f33080a.f32740K2);
            this.f33084e = m7428a;
            this.f33085f = C10643e.m7424c(m7428a);
        }

        /* renamed from: d */
        private TakeAwayEditEmailActivity m2562d(TakeAwayEditEmailActivity takeAwayEditEmailActivity) {
            C11205c.m5751a(takeAwayEditEmailActivity, this.f33080a.m2750Y());
            C5921e.m22726a(takeAwayEditEmailActivity, this.f33082c.mo42226get());
            C13872m.m123d(takeAwayEditEmailActivity, this.f33083d.mo42226get());
            C13872m.m125b(takeAwayEditEmailActivity, (AuthManager) this.f33080a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayEditEmailActivity, (AppRatingManager) this.f33080a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayEditEmailActivity, (InterfaceC3954c) this.f33080a.f32720F2.mo42226get());
            C10641b.m7431a(takeAwayEditEmailActivity, m2560f());
            return takeAwayEditEmailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2561e() {
            return Collections.singletonMap(TakeAwayEditEmailViewModel.class, (InterfaceC6657b) this.f33085f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2560f() {
            return new ViewModelFactoryByInjection(m2561e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayEditEmailActivity takeAwayEditEmailActivity) {
            m2562d(takeAwayEditEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$f7 */
    /* loaded from: classes2.dex */
    public static final class C12771f7 implements InterfaceC13329m2 {

        /* renamed from: a */
        private final C12636e f33086a;

        /* renamed from: b */
        private InterfaceC12341a<TermsAndConditionsActivity> f33087b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33088c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33089d;

        /* renamed from: e */
        private C4863d f33090e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33091f;

        private C12771f7(C12636e c12636e, TermsAndConditionsActivity termsAndConditionsActivity) {
            this.f33086a = c12636e;
            m2559b(termsAndConditionsActivity);
        }

        /* renamed from: b */
        private void m2559b(TermsAndConditionsActivity termsAndConditionsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(termsAndConditionsActivity);
            this.f33087b = m4594a;
            this.f33088c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33086a.f32704B2, this.f33086a.f32708C2, this.f33086a.f32712D2));
            this.f33089d = C11613b.m4596a(C5975c.m22544a(this.f33086a.f32703B1));
            C4863d m26435a = C4863d.m26435a(this.f33086a.f32703B1, this.f33086a.f32740K2);
            this.f33090e = m26435a;
            this.f33091f = C4864e.m26431c(m26435a);
        }

        /* renamed from: d */
        private TermsAndConditionsActivity m2557d(TermsAndConditionsActivity termsAndConditionsActivity) {
            C11205c.m5751a(termsAndConditionsActivity, this.f33086a.m2750Y());
            C5921e.m22726a(termsAndConditionsActivity, this.f33088c.mo42226get());
            C13872m.m123d(termsAndConditionsActivity, this.f33089d.mo42226get());
            C13872m.m125b(termsAndConditionsActivity, (AuthManager) this.f33086a.f32700A2.mo42226get());
            C13872m.m126a(termsAndConditionsActivity, (AppRatingManager) this.f33086a.f32716E2.mo42226get());
            C13872m.m124c(termsAndConditionsActivity, (InterfaceC3954c) this.f33086a.f32720F2.mo42226get());
            C4862b.m26437a(termsAndConditionsActivity, m2555f());
            return termsAndConditionsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2556e() {
            return Collections.singletonMap(WebViewModel.class, (InterfaceC6657b) this.f33091f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2555f() {
            return new ViewModelFactoryByInjection(m2556e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TermsAndConditionsActivity termsAndConditionsActivity) {
            m2557d(termsAndConditionsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g */
    /* loaded from: classes2.dex */
    public static final class C12772g implements InterfaceC13223c {

        /* renamed from: a */
        private final C12636e f33092a;

        /* renamed from: b */
        private InterfaceC12341a<AppWalkThroughActivity> f33093b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33094c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33095d;

        /* renamed from: e */
        private C5961j f33096e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33097f;

        private C12772g(C12636e c12636e, AppWalkThroughActivity appWalkThroughActivity) {
            this.f33092a = c12636e;
            m2554b(appWalkThroughActivity);
        }

        /* renamed from: b */
        private void m2554b(AppWalkThroughActivity appWalkThroughActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(appWalkThroughActivity);
            this.f33093b = m4594a;
            this.f33094c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33092a.f32704B2, this.f33092a.f32708C2, this.f33092a.f32712D2));
            this.f33095d = C11613b.m4596a(C5975c.m22544a(this.f33092a.f32703B1));
            C5961j m22585a = C5961j.m22585a(this.f33092a.f32703B1, this.f33092a.f32768R2, this.f33092a.f32740K2);
            this.f33096e = m22585a;
            this.f33097f = C5962k.m22581c(m22585a);
        }

        /* renamed from: d */
        private AppWalkThroughActivity m2552d(AppWalkThroughActivity appWalkThroughActivity) {
            C11205c.m5751a(appWalkThroughActivity, this.f33092a.m2750Y());
            C5921e.m22726a(appWalkThroughActivity, this.f33094c.mo42226get());
            C13872m.m123d(appWalkThroughActivity, this.f33095d.mo42226get());
            C13872m.m125b(appWalkThroughActivity, (AuthManager) this.f33092a.f32700A2.mo42226get());
            C13872m.m126a(appWalkThroughActivity, (AppRatingManager) this.f33092a.f32716E2.mo42226get());
            C13872m.m124c(appWalkThroughActivity, (InterfaceC3954c) this.f33092a.f32720F2.mo42226get());
            C5958b.m22600a(appWalkThroughActivity, m2550f());
            return appWalkThroughActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2551e() {
            return Collections.singletonMap(AppWalkThroughViewModel.class, (InterfaceC6657b) this.f33097f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2550f() {
            return new ViewModelFactoryByInjection(m2551e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(AppWalkThroughActivity appWalkThroughActivity) {
            m2552d(appWalkThroughActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g0 */
    /* loaded from: classes2.dex */
    public static final class C12773g0 implements InterfaceC13343o {

        /* renamed from: a */
        private final C12636e f33098a;

        /* renamed from: b */
        private InterfaceC12341a<CardRegistrationResumeActivity> f33099b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33100c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33101d;

        /* renamed from: e */
        private C1939l f33102e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33103f;

        private C12773g0(C12636e c12636e, CardRegistrationResumeActivity cardRegistrationResumeActivity) {
            this.f33098a = c12636e;
            m2549b(cardRegistrationResumeActivity);
        }

        /* renamed from: b */
        private void m2549b(CardRegistrationResumeActivity cardRegistrationResumeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(cardRegistrationResumeActivity);
            this.f33099b = m4594a;
            this.f33100c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33098a.f32704B2, this.f33098a.f32708C2, this.f33098a.f32712D2));
            this.f33101d = C11613b.m4596a(C5975c.m22544a(this.f33098a.f32703B1));
            C1939l m35090a = C1939l.m35090a(this.f33098a.f32703B1, this.f33098a.f32780U2, this.f33098a.f32740K2, this.f33098a.f32771S1, this.f33098a.f32740K2);
            this.f33102e = m35090a;
            this.f33103f = C1940m.m35086c(m35090a);
        }

        /* renamed from: d */
        private CardRegistrationResumeActivity m2547d(CardRegistrationResumeActivity cardRegistrationResumeActivity) {
            C11205c.m5751a(cardRegistrationResumeActivity, this.f33098a.m2750Y());
            C5921e.m22726a(cardRegistrationResumeActivity, this.f33100c.mo42226get());
            C13872m.m123d(cardRegistrationResumeActivity, this.f33101d.mo42226get());
            C13872m.m125b(cardRegistrationResumeActivity, (AuthManager) this.f33098a.f32700A2.mo42226get());
            C13872m.m126a(cardRegistrationResumeActivity, (AppRatingManager) this.f33098a.f32716E2.mo42226get());
            C13872m.m124c(cardRegistrationResumeActivity, (InterfaceC3954c) this.f33098a.f32720F2.mo42226get());
            C1935i.m35100a(cardRegistrationResumeActivity, m2545f());
            return cardRegistrationResumeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2546e() {
            return Collections.singletonMap(CardRegistrationResumeViewModel.class, (InterfaceC6657b) this.f33103f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2545f() {
            return new ViewModelFactoryByInjection(m2546e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CardRegistrationResumeActivity cardRegistrationResumeActivity) {
            m2547d(cardRegistrationResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g1 */
    /* loaded from: classes2.dex */
    public static final class C12774g1 implements InterfaceC13431z {

        /* renamed from: a */
        private final C12636e f33104a;

        /* renamed from: b */
        private InterfaceC12341a<EditEmailActivity> f33105b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33106c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33107d;

        /* renamed from: e */
        private C7057d f33108e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33109f;

        private C12774g1(C12636e c12636e, EditEmailActivity editEmailActivity) {
            this.f33104a = c12636e;
            m2544b(editEmailActivity);
        }

        /* renamed from: b */
        private void m2544b(EditEmailActivity editEmailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(editEmailActivity);
            this.f33105b = m4594a;
            this.f33106c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33104a.f32704B2, this.f33104a.f32708C2, this.f33104a.f32712D2));
            this.f33107d = C11613b.m4596a(C5975c.m22544a(this.f33104a.f32703B1));
            C7057d m19425a = C7057d.m19425a(this.f33104a.f32703B1, this.f33104a.f32835g3, this.f33104a.f32771S1, this.f33104a.f32740K2);
            this.f33108e = m19425a;
            this.f33109f = C7058e.m19421c(m19425a);
        }

        /* renamed from: d */
        private EditEmailActivity m2542d(EditEmailActivity editEmailActivity) {
            C11205c.m5751a(editEmailActivity, this.f33104a.m2750Y());
            C5921e.m22726a(editEmailActivity, this.f33106c.mo42226get());
            C13872m.m123d(editEmailActivity, this.f33107d.mo42226get());
            C13872m.m125b(editEmailActivity, (AuthManager) this.f33104a.f32700A2.mo42226get());
            C13872m.m126a(editEmailActivity, (AppRatingManager) this.f33104a.f32716E2.mo42226get());
            C13872m.m124c(editEmailActivity, (InterfaceC3954c) this.f33104a.f32720F2.mo42226get());
            C7055b.m19428a(editEmailActivity, m2540f());
            return editEmailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2541e() {
            return Collections.singletonMap(EditEmailViewModel.class, (InterfaceC6657b) this.f33109f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2540f() {
            return new ViewModelFactoryByInjection(m2541e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(EditEmailActivity editEmailActivity) {
            m2542d(editEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g2 */
    /* loaded from: classes2.dex */
    public static final class C12775g2 implements InterfaceC13315l0.InterfaceC13316a {

        /* renamed from: a */
        private final C12636e f33110a;

        private C12775g2(C12636e c12636e) {
            this.f33110a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13315l0 mo2891c(IntroActivity introActivity) {
            C11617f.m4590a(introActivity);
            return new C12784h2(this.f33110a, introActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g3 */
    /* loaded from: classes2.dex */
    public static final class C12776g3 implements InterfaceC13425y0.InterfaceC13426a {

        /* renamed from: a */
        private final C12636e f33111a;

        private C12776g3(C12636e c12636e) {
            this.f33111a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13425y0 mo2891c(NotificationsActivity notificationsActivity) {
            C11617f.m4590a(notificationsActivity);
            return new C12785h3(this.f33111a, notificationsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g4 */
    /* loaded from: classes2.dex */
    public static final class C12777g4 implements InterfaceC13301j3.InterfaceC13302a {

        /* renamed from: a */
        private final C12636e f33112a;

        private C12777g4(C12636e c12636e) {
            this.f33112a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13301j3 mo2891c(C5518a c5518a) {
            C11617f.m4590a(c5518a);
            return new C12786h4(this.f33112a, c5518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g5 */
    /* loaded from: classes2.dex */
    public static final class C12778g5 implements InterfaceC13341n3.InterfaceC13342a {

        /* renamed from: a */
        private final C12636e f33113a;

        private C12778g5(C12636e c12636e) {
            this.f33113a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13341n3 mo2891c(PushNotificationMessagingService pushNotificationMessagingService) {
            C11617f.m4590a(pushNotificationMessagingService);
            return new C12787h5(this.f33113a, pushNotificationMessagingService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g6 */
    /* loaded from: classes2.dex */
    public static final class C12779g6 implements InterfaceC13239d2.InterfaceC13240a {

        /* renamed from: a */
        private final C12636e f33114a;

        private C12779g6(C12636e c12636e) {
            this.f33114a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13239d2 mo2891c(TakeAwayLandingActivity takeAwayLandingActivity) {
            C11617f.m4590a(takeAwayLandingActivity);
            return new C12788h6(this.f33114a, takeAwayLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$g7 */
    /* loaded from: classes2.dex */
    public static final class C12780g7 implements InterfaceC13339n2.InterfaceC13340a {

        /* renamed from: a */
        private final C12636e f33115a;

        private C12780g7(C12636e c12636e) {
            this.f33115a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13339n2 mo2891c(TermsOfUseActivity termsOfUseActivity) {
            C11617f.m4590a(termsOfUseActivity);
            return new C12789h7(this.f33115a, termsOfUseActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h */
    /* loaded from: classes2.dex */
    public static final class C12781h implements InterfaceC13211a3.InterfaceC13212a {

        /* renamed from: a */
        private final C12636e f33116a;

        private C12781h(C12636e c12636e) {
            this.f33116a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13211a3 mo2891c(C5076a c5076a) {
            C11617f.m4590a(c5076a);
            return new C12790i(this.f33116a, c5076a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h0 */
    /* loaded from: classes2.dex */
    public static final class C12782h0 implements InterfaceC13351p.InterfaceC13352a {

        /* renamed from: a */
        private final C12636e f33117a;

        private C12782h0(C12636e c12636e) {
            this.f33117a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13351p mo2891c(CardRegistrationStatusActivity cardRegistrationStatusActivity) {
            C11617f.m4590a(cardRegistrationStatusActivity);
            return new C12791i0(this.f33117a, cardRegistrationStatusActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h1 */
    /* loaded from: classes2.dex */
    public static final class C12783h1 implements InterfaceC13205a0.InterfaceC13206a {

        /* renamed from: a */
        private final C12636e f33118a;

        private C12783h1(C12636e c12636e) {
            this.f33118a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13205a0 mo2891c(EditNifActivity editNifActivity) {
            C11617f.m4590a(editNifActivity);
            return new C12792i1(this.f33118a, editNifActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h2 */
    /* loaded from: classes2.dex */
    public static final class C12784h2 implements InterfaceC13315l0 {

        /* renamed from: a */
        private final C12636e f33119a;

        /* renamed from: b */
        private InterfaceC12341a<IntroActivity> f33120b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33121c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33122d;

        /* renamed from: e */
        private C5130e f33123e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33124f;

        private C12784h2(C12636e c12636e, IntroActivity introActivity) {
            this.f33119a = c12636e;
            m2530b(introActivity);
        }

        /* renamed from: b */
        private void m2530b(IntroActivity introActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(introActivity);
            this.f33120b = m4594a;
            this.f33121c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33119a.f32704B2, this.f33119a.f32708C2, this.f33119a.f32712D2));
            this.f33122d = C11613b.m4596a(C5975c.m22544a(this.f33119a.f32703B1));
            C5130e m25594a = C5130e.m25594a(this.f33119a.f32703B1, this.f33119a.f32771S1, this.f33119a.f32909w2, this.f33119a.f32740K2, this.f33119a.f32740K2);
            this.f33123e = m25594a;
            this.f33124f = C5131f.m25590c(m25594a);
        }

        /* renamed from: d */
        private IntroActivity m2528d(IntroActivity introActivity) {
            C11205c.m5751a(introActivity, this.f33119a.m2750Y());
            C5921e.m22726a(introActivity, this.f33121c.mo42226get());
            C13872m.m123d(introActivity, this.f33122d.mo42226get());
            C13872m.m125b(introActivity, (AuthManager) this.f33119a.f32700A2.mo42226get());
            C13872m.m126a(introActivity, (AppRatingManager) this.f33119a.f32716E2.mo42226get());
            C13872m.m124c(introActivity, (InterfaceC3954c) this.f33119a.f32720F2.mo42226get());
            C5126b.m25611a(introActivity, m2526f());
            return introActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2527e() {
            return Collections.singletonMap(IntroViewModel.class, (InterfaceC6657b) this.f33124f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2526f() {
            return new ViewModelFactoryByInjection(m2527e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(IntroActivity introActivity) {
            m2528d(introActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h3 */
    /* loaded from: classes2.dex */
    public static final class C12785h3 implements InterfaceC13425y0 {

        /* renamed from: a */
        private final C12636e f33125a;

        /* renamed from: b */
        private InterfaceC12341a<NotificationsActivity> f33126b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33127c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33128d;

        /* renamed from: e */
        private C10896s f33129e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33130f;

        private C12785h3(C12636e c12636e, NotificationsActivity notificationsActivity) {
            this.f33125a = c12636e;
            m2525b(notificationsActivity);
        }

        /* renamed from: b */
        private void m2525b(NotificationsActivity notificationsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(notificationsActivity);
            this.f33126b = m4594a;
            this.f33127c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33125a.f32704B2, this.f33125a.f32708C2, this.f33125a.f32712D2));
            this.f33128d = C11613b.m4596a(C5975c.m22544a(this.f33125a.f32703B1));
            C10896s m6790a = C10896s.m6790a(this.f33125a.f32703B1, this.f33125a.f32740K2, this.f33125a.f32700A2, this.f33125a.f32780U2, this.f33125a.f32740K2);
            this.f33129e = m6790a;
            this.f33130f = C10897t.m6786c(m6790a);
        }

        /* renamed from: d */
        private NotificationsActivity m2523d(NotificationsActivity notificationsActivity) {
            C11205c.m5751a(notificationsActivity, this.f33125a.m2750Y());
            C5921e.m22726a(notificationsActivity, this.f33127c.mo42226get());
            C13872m.m123d(notificationsActivity, this.f33128d.mo42226get());
            C13872m.m125b(notificationsActivity, (AuthManager) this.f33125a.f32700A2.mo42226get());
            C13872m.m126a(notificationsActivity, (AppRatingManager) this.f33125a.f32716E2.mo42226get());
            C13872m.m124c(notificationsActivity, (InterfaceC3954c) this.f33125a.f32720F2.mo42226get());
            C10879b.m6791a(notificationsActivity, m2521f());
            return notificationsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2522e() {
            return Collections.singletonMap(NotificationsViewModel.class, (InterfaceC6657b) this.f33130f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2521f() {
            return new ViewModelFactoryByInjection(m2522e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(NotificationsActivity notificationsActivity) {
            m2523d(notificationsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h4 */
    /* loaded from: classes2.dex */
    public static final class C12786h4 implements InterfaceC13301j3 {

        /* renamed from: a */
        private final C12636e f33131a;

        /* renamed from: b */
        private C4855d f33132b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33133c;

        private C12786h4(C12636e c12636e, C5518a c5518a) {
            this.f33131a = c12636e;
            m2520b(c5518a);
        }

        /* renamed from: b */
        private void m2520b(C5518a c5518a) {
            C4855d m26459a = C4855d.m26459a(this.f33131a.f32703B1, this.f33131a.f32780U2, this.f33131a.f32740K2);
            this.f33132b = m26459a;
            this.f33133c = C4856e.m26455c(m26459a);
        }

        /* renamed from: d */
        private C5518a m2518d(C5518a c5518a) {
            C11207e.m5748a(c5518a, this.f33131a.m2750Y());
            C5521b.m23793a(c5518a, m2516f());
            return c5518a;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2517e() {
            return Collections.singletonMap(AssociationsViewModel.class, (InterfaceC6657b) this.f33133c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2516f() {
            return new ViewModelFactoryByInjection(m2517e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(C5518a c5518a) {
            m2518d(c5518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h5 */
    /* loaded from: classes2.dex */
    public static final class C12787h5 implements InterfaceC13341n3 {

        /* renamed from: a */
        private final C12636e f33134a;

        private C12787h5(C12636e c12636e, PushNotificationMessagingService pushNotificationMessagingService) {
            this.f33134a = c12636e;
        }

        /* renamed from: c */
        private PushNotificationMessagingService m2514c(PushNotificationMessagingService pushNotificationMessagingService) {
            C5145h.m25560a(pushNotificationMessagingService, (AuthManager) this.f33134a.f32700A2.mo42226get());
            C5145h.m25559b(pushNotificationMessagingService, (PushNotificationsManager) this.f33134a.f32885q3.mo42226get());
            return pushNotificationMessagingService;
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: b */
        public void mo2889c(PushNotificationMessagingService pushNotificationMessagingService) {
            m2514c(pushNotificationMessagingService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h6 */
    /* loaded from: classes2.dex */
    public static final class C12788h6 implements InterfaceC13239d2 {

        /* renamed from: a */
        private final C12636e f33135a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayLandingActivity> f33136b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33137c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33138d;

        /* renamed from: e */
        private C9773m f33139e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33140f;

        /* renamed from: g */
        private C7483b f33141g;

        /* renamed from: h */
        private InterfaceC12341a<Object> f33142h;

        private C12788h6(C12636e c12636e, TakeAwayLandingActivity takeAwayLandingActivity) {
            this.f33135a = c12636e;
            m2513b(takeAwayLandingActivity);
        }

        /* renamed from: b */
        private void m2513b(TakeAwayLandingActivity takeAwayLandingActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayLandingActivity);
            this.f33136b = m4594a;
            this.f33137c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33135a.f32704B2, this.f33135a.f32708C2, this.f33135a.f32712D2));
            this.f33138d = C11613b.m4596a(C5975c.m22544a(this.f33135a.f32703B1));
            C9773m m9997a = C9773m.m9997a(this.f33135a.f32703B1, this.f33135a.f32771S1, this.f33135a.f32865m3, this.f33135a.f32740K2, this.f33135a.f32736J2, this.f33135a.f32768R2, this.f33135a.f32740K2);
            this.f33139e = m9997a;
            this.f33140f = C9774n.m9993c(m9997a);
            C7483b m18388a = C7483b.m18388a(this.f33135a.f32703B1, this.f33135a.f32756O2, this.f33135a.f32865m3, this.f33135a.f32740K2);
            this.f33141g = m18388a;
            this.f33142h = C7484c.m18384c(m18388a);
        }

        /* renamed from: d */
        private TakeAwayLandingActivity m2511d(TakeAwayLandingActivity takeAwayLandingActivity) {
            C11205c.m5751a(takeAwayLandingActivity, this.f33135a.m2750Y());
            C5921e.m22726a(takeAwayLandingActivity, this.f33137c.mo42226get());
            C13872m.m123d(takeAwayLandingActivity, this.f33138d.mo42226get());
            C13872m.m125b(takeAwayLandingActivity, (AuthManager) this.f33135a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayLandingActivity, (AppRatingManager) this.f33135a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayLandingActivity, (InterfaceC3954c) this.f33135a.f32720F2.mo42226get());
            C7909c.m17604a(takeAwayLandingActivity, m2509f());
            C9767g.m9998a(takeAwayLandingActivity, m2509f());
            return takeAwayLandingActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2510e() {
            return C11616e.m4592b(2).m4591c(TakeAwayLandingViewModel.class, (InterfaceC6657b) this.f33140f.mo42226get()).m4591c(BottomNavigationViewModel.class, (InterfaceC6657b) this.f33142h.mo42226get()).m4593a();
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2509f() {
            return new ViewModelFactoryByInjection(m2510e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayLandingActivity takeAwayLandingActivity) {
            m2511d(takeAwayLandingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$h7 */
    /* loaded from: classes2.dex */
    public static final class C12789h7 implements InterfaceC13339n2 {

        /* renamed from: a */
        private final C12636e f33143a;

        /* renamed from: b */
        private C12153e f33144b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33145c;

        private C12789h7(C12636e c12636e, TermsOfUseActivity termsOfUseActivity) {
            this.f33143a = c12636e;
            m2508b(termsOfUseActivity);
        }

        /* renamed from: b */
        private void m2508b(TermsOfUseActivity termsOfUseActivity) {
            C12153e m3533a = C12153e.m3533a(this.f33143a.f32703B1, this.f33143a.f32909w2, this.f33143a.f32740K2);
            this.f33144b = m3533a;
            this.f33145c = C12154f.m3529c(m3533a);
        }

        /* renamed from: d */
        private TermsOfUseActivity m2506d(TermsOfUseActivity termsOfUseActivity) {
            C11205c.m5751a(termsOfUseActivity, this.f33143a.m2750Y());
            C12152c.m3535a(termsOfUseActivity, m2504f());
            return termsOfUseActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2505e() {
            return Collections.singletonMap(TermsOfUseViewModel.class, (InterfaceC6657b) this.f33145c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2504f() {
            return new ViewModelFactoryByInjection(m2505e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TermsOfUseActivity termsOfUseActivity) {
            m2506d(termsOfUseActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i */
    /* loaded from: classes2.dex */
    public static final class C12790i implements InterfaceC13211a3 {

        /* renamed from: a */
        private final C12636e f33146a;

        /* renamed from: b */
        private C4855d f33147b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33148c;

        private C12790i(C12636e c12636e, C5076a c5076a) {
            this.f33146a = c12636e;
            m2503b(c5076a);
        }

        /* renamed from: b */
        private void m2503b(C5076a c5076a) {
            C4855d m26459a = C4855d.m26459a(this.f33146a.f32703B1, this.f33146a.f32780U2, this.f33146a.f32740K2);
            this.f33147b = m26459a;
            this.f33148c = C4856e.m26455c(m26459a);
        }

        /* renamed from: d */
        private C5076a m2501d(C5076a c5076a) {
            C11207e.m5748a(c5076a, this.f33146a.m2750Y());
            C5079b.m25727a(c5076a, m2499f());
            return c5076a;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2500e() {
            return Collections.singletonMap(AssociationsViewModel.class, (InterfaceC6657b) this.f33148c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2499f() {
            return new ViewModelFactoryByInjection(m2500e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(C5076a c5076a) {
            m2501d(c5076a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i0 */
    /* loaded from: classes2.dex */
    public static final class C12791i0 implements InterfaceC13351p {

        /* renamed from: a */
        private final C12636e f33149a;

        /* renamed from: b */
        private InterfaceC12341a<CardRegistrationStatusActivity> f33150b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33151c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33152d;

        /* renamed from: e */
        private C2171d f33153e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33154f;

        private C12791i0(C12636e c12636e, CardRegistrationStatusActivity cardRegistrationStatusActivity) {
            this.f33149a = c12636e;
            m2498b(cardRegistrationStatusActivity);
        }

        /* renamed from: b */
        private void m2498b(CardRegistrationStatusActivity cardRegistrationStatusActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(cardRegistrationStatusActivity);
            this.f33150b = m4594a;
            this.f33151c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33149a.f32704B2, this.f33149a.f32708C2, this.f33149a.f32712D2));
            this.f33152d = C11613b.m4596a(C5975c.m22544a(this.f33149a.f32703B1));
            C2171d m34522a = C2171d.m34522a(this.f33149a.f32703B1, this.f33149a.f32780U2, this.f33149a.f32771S1, this.f33149a.f32740K2, this.f33149a.f32740K2);
            this.f33153e = m34522a;
            this.f33154f = C2172e.m34518c(m34522a);
        }

        /* renamed from: d */
        private CardRegistrationStatusActivity m2496d(CardRegistrationStatusActivity cardRegistrationStatusActivity) {
            C11205c.m5751a(cardRegistrationStatusActivity, this.f33149a.m2750Y());
            C5921e.m22726a(cardRegistrationStatusActivity, this.f33151c.mo42226get());
            C13872m.m123d(cardRegistrationStatusActivity, this.f33152d.mo42226get());
            C13872m.m125b(cardRegistrationStatusActivity, (AuthManager) this.f33149a.f32700A2.mo42226get());
            C13872m.m126a(cardRegistrationStatusActivity, (AppRatingManager) this.f33149a.f32716E2.mo42226get());
            C13872m.m124c(cardRegistrationStatusActivity, (InterfaceC3954c) this.f33149a.f32720F2.mo42226get());
            C2168b.m34537a(cardRegistrationStatusActivity, m2494f());
            return cardRegistrationStatusActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2495e() {
            return Collections.singletonMap(CardRegistrationStatusViewModel.class, (InterfaceC6657b) this.f33154f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2494f() {
            return new ViewModelFactoryByInjection(m2495e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CardRegistrationStatusActivity cardRegistrationStatusActivity) {
            m2496d(cardRegistrationStatusActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i1 */
    /* loaded from: classes2.dex */
    public static final class C12792i1 implements InterfaceC13205a0 {

        /* renamed from: a */
        private final C12636e f33155a;

        /* renamed from: b */
        private InterfaceC12341a<EditNifActivity> f33156b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33157c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33158d;

        /* renamed from: e */
        private C7480d f33159e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33160f;

        private C12792i1(C12636e c12636e, EditNifActivity editNifActivity) {
            this.f33155a = c12636e;
            m2493b(editNifActivity);
        }

        /* renamed from: b */
        private void m2493b(EditNifActivity editNifActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(editNifActivity);
            this.f33156b = m4594a;
            this.f33157c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33155a.f32704B2, this.f33155a.f32708C2, this.f33155a.f32712D2));
            this.f33158d = C11613b.m4596a(C5975c.m22544a(this.f33155a.f32703B1));
            C7480d m18399a = C7480d.m18399a(this.f33155a.f32703B1, this.f33155a.f32845i3, this.f33155a.f32771S1, this.f33155a.f32740K2);
            this.f33159e = m18399a;
            this.f33160f = C7481e.m18395c(m18399a);
        }

        /* renamed from: d */
        private EditNifActivity m2491d(EditNifActivity editNifActivity) {
            C11205c.m5751a(editNifActivity, this.f33155a.m2750Y());
            C5921e.m22726a(editNifActivity, this.f33157c.mo42226get());
            C13872m.m123d(editNifActivity, this.f33158d.mo42226get());
            C13872m.m125b(editNifActivity, (AuthManager) this.f33155a.f32700A2.mo42226get());
            C13872m.m126a(editNifActivity, (AppRatingManager) this.f33155a.f32716E2.mo42226get());
            C13872m.m124c(editNifActivity, (InterfaceC3954c) this.f33155a.f32720F2.mo42226get());
            C7478b.m18402a(editNifActivity, m2489f());
            return editNifActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2490e() {
            return Collections.singletonMap(EditNifViewModel.class, (InterfaceC6657b) this.f33160f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2489f() {
            return new ViewModelFactoryByInjection(m2490e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(EditNifActivity editNifActivity) {
            m2491d(editNifActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i2 */
    /* loaded from: classes2.dex */
    public static final class C12793i2 implements InterfaceC13325m0.InterfaceC13326a {

        /* renamed from: a */
        private final C12636e f33161a;

        private C12793i2(C12636e c12636e) {
            this.f33161a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13325m0 mo2891c(LockActivity lockActivity) {
            C11617f.m4590a(lockActivity);
            return new C12802j2(this.f33161a, lockActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i3 */
    /* loaded from: classes2.dex */
    public static final class C12794i3 implements InterfaceC13313l.InterfaceC13314a {

        /* renamed from: a */
        private final C12636e f33162a;

        private C12794i3(C12636e c12636e) {
            this.f33162a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13313l mo2891c(OnboardingCardQuestionActivity onboardingCardQuestionActivity) {
            C11617f.m4590a(onboardingCardQuestionActivity);
            return new C12803j3(this.f33162a, onboardingCardQuestionActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i4 */
    /* loaded from: classes2.dex */
    public static final class C12795i4 implements InterfaceC13357p2.InterfaceC13358a {

        /* renamed from: a */
        private final C12636e f33163a;

        private C12795i4(C12636e c12636e) {
            this.f33163a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13357p2 mo2891c(PhoneUpdateSmsValidationActivity phoneUpdateSmsValidationActivity) {
            C11617f.m4590a(phoneUpdateSmsValidationActivity);
            return new C12804j4(this.f33163a, phoneUpdateSmsValidationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i5 */
    /* loaded from: classes2.dex */
    public static final class C12796i5 implements InterfaceC13371r1.InterfaceC13372a {

        /* renamed from: a */
        private final C12636e f33164a;

        private C12796i5(C12636e c12636e) {
            this.f33164a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13371r1 mo2891c(RecoverPinActivity recoverPinActivity) {
            C11617f.m4590a(recoverPinActivity);
            return new C12805j5(this.f33164a, recoverPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i6 */
    /* loaded from: classes2.dex */
    public static final class C12797i6 implements InterfaceC13249e2.InterfaceC13250a {

        /* renamed from: a */
        private final C12636e f33165a;

        private C12797i6(C12636e c12636e) {
            this.f33165a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13249e2 mo2891c(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            C11617f.m4590a(takeAwayMealDetailActivity);
            return new C12806j6(this.f33165a, takeAwayMealDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$i7 */
    /* loaded from: classes2.dex */
    public static final class C12798i7 implements InterfaceC13349o2.InterfaceC13350a {

        /* renamed from: a */
        private final C12636e f33166a;

        private C12798i7(C12636e c12636e) {
            this.f33166a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13349o2 mo2891c(UpdatePhoneActivity updatePhoneActivity) {
            C11617f.m4590a(updatePhoneActivity);
            return new C12807j7(this.f33166a, updatePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j */
    /* loaded from: classes2.dex */
    public static final class C12799j implements InterfaceC13233d.InterfaceC13234a {

        /* renamed from: a */
        private final C12636e f33167a;

        private C12799j(C12636e c12636e) {
            this.f33167a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13233d mo2891c(AssociationsActivity associationsActivity) {
            C11617f.m4590a(associationsActivity);
            return new C12808k(this.f33167a, associationsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j0 */
    /* loaded from: classes2.dex */
    public static final class C12800j0 implements InterfaceC13367r.InterfaceC13368a {

        /* renamed from: a */
        private final C12636e f33168a;

        private C12800j0(C12636e c12636e) {
            this.f33168a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13367r mo2891c(ChangePinActivity changePinActivity) {
            C11617f.m4590a(changePinActivity);
            return new C12809k0(this.f33168a, changePinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j1 */
    /* loaded from: classes2.dex */
    public static final class C12801j1 implements InterfaceC13215b0.InterfaceC13216a {

        /* renamed from: a */
        private final C12636e f33169a;

        private C12801j1(C12636e c12636e) {
            this.f33169a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13215b0 mo2891c(ElectronicInvoiceActivity electronicInvoiceActivity) {
            C11617f.m4590a(electronicInvoiceActivity);
            return new C12810k1(this.f33169a, electronicInvoiceActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j2 */
    /* loaded from: classes2.dex */
    public static final class C12802j2 implements InterfaceC13325m0 {

        /* renamed from: a */
        private final C12636e f33170a;

        /* renamed from: b */
        private InterfaceC12341a<LockActivity> f33171b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33172c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33173d;

        /* renamed from: e */
        private C5572u f33174e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33175f;

        private C12802j2(C12636e c12636e, LockActivity lockActivity) {
            this.f33170a = c12636e;
            m2479b(lockActivity);
        }

        /* renamed from: b */
        private void m2479b(LockActivity lockActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(lockActivity);
            this.f33171b = m4594a;
            this.f33172c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33170a.f32704B2, this.f33170a.f32708C2, this.f33170a.f32712D2));
            this.f33173d = C11613b.m4596a(C5975c.m22544a(this.f33170a.f32703B1));
            C5572u m23734a = C5572u.m23734a(this.f33170a.f32703B1, this.f33170a.f32740K2, this.f33170a.f32784V2, this.f33170a.f32909w2, C5584e.m23704a(), this.f33170a.f32700A2, this.f33170a.f32796Y2, this.f33170a.f32756O2, this.f33170a.f32744L2, this.f33170a.f32780U2, this.f33170a.f32736J2, this.f33170a.f32740K2);
            this.f33174e = m23734a;
            this.f33175f = C5573v.m23730c(m23734a);
        }

        /* renamed from: d */
        private LockActivity m2477d(LockActivity lockActivity) {
            C11205c.m5751a(lockActivity, this.f33170a.m2750Y());
            C5921e.m22726a(lockActivity, this.f33172c.mo42226get());
            C13872m.m123d(lockActivity, this.f33173d.mo42226get());
            C13872m.m125b(lockActivity, (AuthManager) this.f33170a.f32700A2.mo42226get());
            C13872m.m126a(lockActivity, (AppRatingManager) this.f33170a.f32716E2.mo42226get());
            C13872m.m124c(lockActivity, (InterfaceC3954c) this.f33170a.f32720F2.mo42226get());
            C5566n.m23736a(lockActivity, m2475f());
            return lockActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2476e() {
            return Collections.singletonMap(LockViewModel.class, (InterfaceC6657b) this.f33175f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2475f() {
            return new ViewModelFactoryByInjection(m2476e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LockActivity lockActivity) {
            m2477d(lockActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j3 */
    /* loaded from: classes2.dex */
    public static final class C12803j3 implements InterfaceC13313l {

        /* renamed from: a */
        private final C12636e f33176a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingCardQuestionActivity> f33177b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33178c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33179d;

        /* renamed from: e */
        private C12182e f33180e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33181f;

        private C12803j3(C12636e c12636e, OnboardingCardQuestionActivity onboardingCardQuestionActivity) {
            this.f33176a = c12636e;
            m2474b(onboardingCardQuestionActivity);
        }

        /* renamed from: b */
        private void m2474b(OnboardingCardQuestionActivity onboardingCardQuestionActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingCardQuestionActivity);
            this.f33177b = m4594a;
            this.f33178c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33176a.f32704B2, this.f33176a.f32708C2, this.f33176a.f32712D2));
            this.f33179d = C11613b.m4596a(C5975c.m22544a(this.f33176a.f32703B1));
            C12182e m3452a = C12182e.m3452a(this.f33176a.f32703B1, this.f33176a.f32771S1, this.f33176a.f32740K2);
            this.f33180e = m3452a;
            this.f33181f = C12183f.m3448c(m3452a);
        }

        /* renamed from: d */
        private OnboardingCardQuestionActivity m2472d(OnboardingCardQuestionActivity onboardingCardQuestionActivity) {
            C11205c.m5751a(onboardingCardQuestionActivity, this.f33176a.m2750Y());
            C5921e.m22726a(onboardingCardQuestionActivity, this.f33178c.mo42226get());
            C13872m.m123d(onboardingCardQuestionActivity, this.f33179d.mo42226get());
            C13872m.m125b(onboardingCardQuestionActivity, (AuthManager) this.f33176a.f32700A2.mo42226get());
            C13872m.m126a(onboardingCardQuestionActivity, (AppRatingManager) this.f33176a.f32716E2.mo42226get());
            C13872m.m124c(onboardingCardQuestionActivity, (InterfaceC3954c) this.f33176a.f32720F2.mo42226get());
            C12177b.m3464a(onboardingCardQuestionActivity, m2470f());
            return onboardingCardQuestionActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2471e() {
            return Collections.singletonMap(OnboardingCardQuestionViewModel.class, (InterfaceC6657b) this.f33181f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2470f() {
            return new ViewModelFactoryByInjection(m2471e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingCardQuestionActivity onboardingCardQuestionActivity) {
            m2472d(onboardingCardQuestionActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j4 */
    /* loaded from: classes2.dex */
    public static final class C12804j4 implements InterfaceC13357p2 {

        /* renamed from: a */
        private final C12636e f33182a;

        /* renamed from: b */
        private InterfaceC12341a<PhoneUpdateSmsValidationActivity> f33183b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33184c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33185d;

        /* renamed from: e */
        private C10238d f33186e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33187f;

        private C12804j4(C12636e c12636e, PhoneUpdateSmsValidationActivity phoneUpdateSmsValidationActivity) {
            this.f33182a = c12636e;
            m2469b(phoneUpdateSmsValidationActivity);
        }

        /* renamed from: b */
        private void m2469b(PhoneUpdateSmsValidationActivity phoneUpdateSmsValidationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(phoneUpdateSmsValidationActivity);
            this.f33183b = m4594a;
            this.f33184c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33182a.f32704B2, this.f33182a.f32708C2, this.f33182a.f32712D2));
            this.f33185d = C11613b.m4596a(C5975c.m22544a(this.f33182a.f32703B1));
            C10238d m8435a = C10238d.m8435a(this.f33182a.f32703B1, this.f33182a.f32792X2, this.f33182a.f32771S1, this.f33182a.f32740K2);
            this.f33186e = m8435a;
            this.f33187f = C10239e.m8431c(m8435a);
        }

        /* renamed from: d */
        private PhoneUpdateSmsValidationActivity m2467d(PhoneUpdateSmsValidationActivity phoneUpdateSmsValidationActivity) {
            C11205c.m5751a(phoneUpdateSmsValidationActivity, this.f33182a.m2750Y());
            C5921e.m22726a(phoneUpdateSmsValidationActivity, this.f33184c.mo42226get());
            C13872m.m123d(phoneUpdateSmsValidationActivity, this.f33185d.mo42226get());
            C13872m.m125b(phoneUpdateSmsValidationActivity, (AuthManager) this.f33182a.f32700A2.mo42226get());
            C13872m.m126a(phoneUpdateSmsValidationActivity, (AppRatingManager) this.f33182a.f32716E2.mo42226get());
            C13872m.m124c(phoneUpdateSmsValidationActivity, (InterfaceC3954c) this.f33182a.f32720F2.mo42226get());
            C10234b.m8443a(phoneUpdateSmsValidationActivity, m2465f());
            return phoneUpdateSmsValidationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2466e() {
            return Collections.singletonMap(PhoneUpdateSmsValidationViewModel.class, (InterfaceC6657b) this.f33187f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2465f() {
            return new ViewModelFactoryByInjection(m2466e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PhoneUpdateSmsValidationActivity phoneUpdateSmsValidationActivity) {
            m2467d(phoneUpdateSmsValidationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j5 */
    /* loaded from: classes2.dex */
    public static final class C12805j5 implements InterfaceC13371r1 {

        /* renamed from: a */
        private final C12636e f33188a;

        /* renamed from: b */
        private InterfaceC12341a<RecoverPinActivity> f33189b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33190c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33191d;

        /* renamed from: e */
        private C8099d f33192e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33193f;

        private C12805j5(C12636e c12636e, RecoverPinActivity recoverPinActivity) {
            this.f33188a = c12636e;
            m2464b(recoverPinActivity);
        }

        /* renamed from: b */
        private void m2464b(RecoverPinActivity recoverPinActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(recoverPinActivity);
            this.f33189b = m4594a;
            this.f33190c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33188a.f32704B2, this.f33188a.f32708C2, this.f33188a.f32712D2));
            this.f33191d = C11613b.m4596a(C5975c.m22544a(this.f33188a.f32703B1));
            C8099d m16898a = C8099d.m16898a(this.f33188a.f32703B1, this.f33188a.f32700A2, this.f33188a.f32820d3, this.f33188a.f32825e3, this.f33188a.f32711D1, this.f33188a.f32795Y1, this.f33188a.f32815c3, this.f33188a.f32771S1, this.f33188a.f32740K2, this.f33188a.f32740K2);
            this.f33192e = m16898a;
            this.f33193f = C8100e.m16894c(m16898a);
        }

        /* renamed from: d */
        private RecoverPinActivity m2462d(RecoverPinActivity recoverPinActivity) {
            C11205c.m5751a(recoverPinActivity, this.f33188a.m2750Y());
            C5921e.m22726a(recoverPinActivity, this.f33190c.mo42226get());
            C13872m.m123d(recoverPinActivity, this.f33191d.mo42226get());
            C13872m.m125b(recoverPinActivity, (AuthManager) this.f33188a.f32700A2.mo42226get());
            C13872m.m126a(recoverPinActivity, (AppRatingManager) this.f33188a.f32716E2.mo42226get());
            C13872m.m124c(recoverPinActivity, (InterfaceC3954c) this.f33188a.f32720F2.mo42226get());
            C8096b.m16910a(recoverPinActivity, m2460f());
            return recoverPinActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2461e() {
            return Collections.singletonMap(RecoverPinViewModel.class, (InterfaceC6657b) this.f33193f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2460f() {
            return new ViewModelFactoryByInjection(m2461e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(RecoverPinActivity recoverPinActivity) {
            m2462d(recoverPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j6 */
    /* loaded from: classes2.dex */
    public static final class C12806j6 implements InterfaceC13249e2 {

        /* renamed from: a */
        private final C12636e f33194a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayMealDetailActivity> f33195b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33196c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33197d;

        /* renamed from: e */
        private C2182g f33198e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33199f;

        private C12806j6(C12636e c12636e, TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            this.f33194a = c12636e;
            m2459b(takeAwayMealDetailActivity);
        }

        /* renamed from: b */
        private void m2459b(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayMealDetailActivity);
            this.f33195b = m4594a;
            this.f33196c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33194a.f32704B2, this.f33194a.f32708C2, this.f33194a.f32712D2));
            this.f33197d = C11613b.m4596a(C5975c.m22544a(this.f33194a.f32703B1));
            C2182g m34492a = C2182g.m34492a(this.f33194a.f32703B1, this.f33194a.f32771S1, this.f33194a.f32865m3, this.f33194a.f32740K2);
            this.f33198e = m34492a;
            this.f33199f = C2183h.m34488c(m34492a);
        }

        /* renamed from: d */
        private TakeAwayMealDetailActivity m2457d(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            C11205c.m5751a(takeAwayMealDetailActivity, this.f33194a.m2750Y());
            C5921e.m22726a(takeAwayMealDetailActivity, this.f33196c.mo42226get());
            C13872m.m123d(takeAwayMealDetailActivity, this.f33197d.mo42226get());
            C13872m.m125b(takeAwayMealDetailActivity, (AuthManager) this.f33194a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayMealDetailActivity, (AppRatingManager) this.f33194a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayMealDetailActivity, (InterfaceC3954c) this.f33194a.f32720F2.mo42226get());
            C2180c.m34499a(takeAwayMealDetailActivity, m2455f());
            return takeAwayMealDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2456e() {
            return Collections.singletonMap(TakeAwayProductDetailViewModel.class, (InterfaceC6657b) this.f33199f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2455f() {
            return new ViewModelFactoryByInjection(m2456e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            m2457d(takeAwayMealDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$j7 */
    /* loaded from: classes2.dex */
    public static final class C12807j7 implements InterfaceC13349o2 {

        /* renamed from: a */
        private final C12636e f33200a;

        /* renamed from: b */
        private InterfaceC12341a<UpdatePhoneActivity> f33201b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33202c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33203d;

        /* renamed from: e */
        private C7497i f33204e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33205f;

        private C12807j7(C12636e c12636e, UpdatePhoneActivity updatePhoneActivity) {
            this.f33200a = c12636e;
            m2454b(updatePhoneActivity);
        }

        /* renamed from: b */
        private void m2454b(UpdatePhoneActivity updatePhoneActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(updatePhoneActivity);
            this.f33201b = m4594a;
            this.f33202c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33200a.f32704B2, this.f33200a.f32708C2, this.f33200a.f32712D2));
            this.f33203d = C11613b.m4596a(C5975c.m22544a(this.f33200a.f32703B1));
            C7497i m18351a = C7497i.m18351a(this.f33200a.f32703B1, this.f33200a.f32792X2, this.f33200a.f32771S1, this.f33200a.f32740K2);
            this.f33204e = m18351a;
            this.f33205f = C7498j.m18347c(m18351a);
        }

        /* renamed from: d */
        private UpdatePhoneActivity m2452d(UpdatePhoneActivity updatePhoneActivity) {
            C11205c.m5751a(updatePhoneActivity, this.f33200a.m2750Y());
            C5921e.m22726a(updatePhoneActivity, this.f33202c.mo42226get());
            C13872m.m123d(updatePhoneActivity, this.f33203d.mo42226get());
            C13872m.m125b(updatePhoneActivity, (AuthManager) this.f33200a.f32700A2.mo42226get());
            C13872m.m126a(updatePhoneActivity, (AppRatingManager) this.f33200a.f32716E2.mo42226get());
            C13872m.m124c(updatePhoneActivity, (InterfaceC3954c) this.f33200a.f32720F2.mo42226get());
            C7495g.m18354a(updatePhoneActivity, m2450f());
            return updatePhoneActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2451e() {
            return Collections.singletonMap(UpdatePhoneViewModel.class, (InterfaceC6657b) this.f33205f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2450f() {
            return new ViewModelFactoryByInjection(m2451e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(UpdatePhoneActivity updatePhoneActivity) {
            m2452d(updatePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k */
    /* loaded from: classes2.dex */
    public static final class C12808k implements InterfaceC13233d {

        /* renamed from: a */
        private final C12636e f33206a;

        /* renamed from: b */
        private InterfaceC12341a<AssociationsActivity> f33207b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33208c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33209d;

        /* renamed from: e */
        private C4855d f33210e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33211f;

        private C12808k(C12636e c12636e, AssociationsActivity associationsActivity) {
            this.f33206a = c12636e;
            m2449b(associationsActivity);
        }

        /* renamed from: b */
        private void m2449b(AssociationsActivity associationsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(associationsActivity);
            this.f33207b = m4594a;
            this.f33208c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33206a.f32704B2, this.f33206a.f32708C2, this.f33206a.f32712D2));
            this.f33209d = C11613b.m4596a(C5975c.m22544a(this.f33206a.f32703B1));
            C4855d m26459a = C4855d.m26459a(this.f33206a.f32703B1, this.f33206a.f32780U2, this.f33206a.f32740K2);
            this.f33210e = m26459a;
            this.f33211f = C4856e.m26455c(m26459a);
        }

        /* renamed from: d */
        private AssociationsActivity m2447d(AssociationsActivity associationsActivity) {
            C11205c.m5751a(associationsActivity, this.f33206a.m2750Y());
            C5921e.m22726a(associationsActivity, this.f33208c.mo42226get());
            C13872m.m123d(associationsActivity, this.f33209d.mo42226get());
            C13872m.m125b(associationsActivity, (AuthManager) this.f33206a.f32700A2.mo42226get());
            C13872m.m126a(associationsActivity, (AppRatingManager) this.f33206a.f32716E2.mo42226get());
            C13872m.m124c(associationsActivity, (InterfaceC3954c) this.f33206a.f32720F2.mo42226get());
            C4854b.m26461a(associationsActivity, m2445f());
            return associationsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2446e() {
            return Collections.singletonMap(AssociationsViewModel.class, (InterfaceC6657b) this.f33211f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2445f() {
            return new ViewModelFactoryByInjection(m2446e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(AssociationsActivity associationsActivity) {
            m2447d(associationsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k0 */
    /* loaded from: classes2.dex */
    public static final class C12809k0 implements InterfaceC13367r {

        /* renamed from: a */
        private final C12636e f33212a;

        /* renamed from: b */
        private InterfaceC12341a<ChangePinActivity> f33213b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33214c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33215d;

        /* renamed from: e */
        private C11356d f33216e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33217f;

        private C12809k0(C12636e c12636e, ChangePinActivity changePinActivity) {
            this.f33212a = c12636e;
            m2444b(changePinActivity);
        }

        /* renamed from: b */
        private void m2444b(ChangePinActivity changePinActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(changePinActivity);
            this.f33213b = m4594a;
            this.f33214c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33212a.f32704B2, this.f33212a.f32708C2, this.f33212a.f32712D2));
            this.f33215d = C11613b.m4596a(C5975c.m22544a(this.f33212a.f32703B1));
            C11356d m5355a = C11356d.m5355a(this.f33212a.f32703B1, this.f33212a.f32700A2, this.f33212a.f32820d3, this.f33212a.f32825e3, this.f33212a.f32815c3, this.f33212a.f32711D1, this.f33212a.f32771S1, this.f33212a.f32740K2);
            this.f33216e = m5355a;
            this.f33217f = C11357e.m5351c(m5355a);
        }

        /* renamed from: d */
        private ChangePinActivity m2442d(ChangePinActivity changePinActivity) {
            C11205c.m5751a(changePinActivity, this.f33212a.m2750Y());
            C5921e.m22726a(changePinActivity, this.f33214c.mo42226get());
            C13872m.m123d(changePinActivity, this.f33215d.mo42226get());
            C13872m.m125b(changePinActivity, (AuthManager) this.f33212a.f32700A2.mo42226get());
            C13872m.m126a(changePinActivity, (AppRatingManager) this.f33212a.f32716E2.mo42226get());
            C13872m.m124c(changePinActivity, (InterfaceC3954c) this.f33212a.f32720F2.mo42226get());
            C11355b.m5356a(changePinActivity, m2440f());
            return changePinActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2441e() {
            return Collections.singletonMap(ChangePinViewModel.class, (InterfaceC6657b) this.f33217f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2440f() {
            return new ViewModelFactoryByInjection(m2441e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ChangePinActivity changePinActivity) {
            m2442d(changePinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k1 */
    /* loaded from: classes2.dex */
    public static final class C12810k1 implements InterfaceC13215b0 {

        /* renamed from: a */
        private final C12636e f33218a;

        /* renamed from: b */
        private InterfaceC12341a<ElectronicInvoiceActivity> f33219b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33220c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33221d;

        /* renamed from: e */
        private C8630e f33222e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33223f;

        private C12810k1(C12636e c12636e, ElectronicInvoiceActivity electronicInvoiceActivity) {
            this.f33218a = c12636e;
            m2439b(electronicInvoiceActivity);
        }

        /* renamed from: b */
        private void m2439b(ElectronicInvoiceActivity electronicInvoiceActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(electronicInvoiceActivity);
            this.f33219b = m4594a;
            this.f33220c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33218a.f32704B2, this.f33218a.f32708C2, this.f33218a.f32712D2));
            this.f33221d = C11613b.m4596a(C5975c.m22544a(this.f33218a.f32703B1));
            C8630e m14977a = C8630e.m14977a(this.f33218a.f32703B1, this.f33218a.f32780U2, this.f33218a.f32740K2);
            this.f33222e = m14977a;
            this.f33223f = C8631f.m14973c(m14977a);
        }

        /* renamed from: d */
        private ElectronicInvoiceActivity m2437d(ElectronicInvoiceActivity electronicInvoiceActivity) {
            C11205c.m5751a(electronicInvoiceActivity, this.f33218a.m2750Y());
            C5921e.m22726a(electronicInvoiceActivity, this.f33220c.mo42226get());
            C13872m.m123d(electronicInvoiceActivity, this.f33221d.mo42226get());
            C13872m.m125b(electronicInvoiceActivity, (AuthManager) this.f33218a.f32700A2.mo42226get());
            C13872m.m126a(electronicInvoiceActivity, (AppRatingManager) this.f33218a.f32716E2.mo42226get());
            C13872m.m124c(electronicInvoiceActivity, (InterfaceC3954c) this.f33218a.f32720F2.mo42226get());
            C8623b.m14984a(electronicInvoiceActivity, m2435f());
            return electronicInvoiceActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2436e() {
            return Collections.singletonMap(ElectronicInvoiceViewModel.class, (InterfaceC6657b) this.f33223f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2435f() {
            return new ViewModelFactoryByInjection(m2436e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ElectronicInvoiceActivity electronicInvoiceActivity) {
            m2437d(electronicInvoiceActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k2 */
    /* loaded from: classes2.dex */
    public static final class C12811k2 implements InterfaceC13335n0.InterfaceC13336a {

        /* renamed from: a */
        private final C12636e f33224a;

        private C12811k2(C12636e c12636e) {
            this.f33224a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13335n0 mo2891c(LoggedAccountActivity loggedAccountActivity) {
            C11617f.m4590a(loggedAccountActivity);
            return new C12820l2(this.f33224a, loggedAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k3 */
    /* loaded from: classes2.dex */
    public static final class C12812k3 implements InterfaceC13303k.InterfaceC13304a {

        /* renamed from: a */
        private final C12636e f33225a;

        private C12812k3(C12636e c12636e) {
            this.f33225a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13303k mo2891c(OnboardingCardRegistrationActivity onboardingCardRegistrationActivity) {
            C11617f.m4590a(onboardingCardRegistrationActivity);
            return new C12821l3(this.f33225a, onboardingCardRegistrationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k4 */
    /* loaded from: classes2.dex */
    public static final class C12813k4 implements InterfaceC13297j1.InterfaceC13298a {

        /* renamed from: a */
        private final C12636e f33226a;

        private C12813k4(C12636e c12636e) {
            this.f33226a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13297j1 mo2891c(PinRecoverActivity pinRecoverActivity) {
            C11617f.m4590a(pinRecoverActivity);
            return new C12822l4(this.f33226a, pinRecoverActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k5 */
    /* loaded from: classes2.dex */
    public static final class C12814k5 implements InterfaceC13379s1.InterfaceC13380a {

        /* renamed from: a */
        private final C12636e f33227a;

        private C12814k5(C12636e c12636e) {
            this.f33227a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13379s1 mo2891c(ReplacePinActivity replacePinActivity) {
            C11617f.m4590a(replacePinActivity);
            return new C12823l5(this.f33227a, replacePinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k6 */
    /* loaded from: classes2.dex */
    public static final class C12815k6 implements InterfaceC13269g2.InterfaceC13270a {

        /* renamed from: a */
        private final C12636e f33228a;

        private C12815k6(C12636e c12636e) {
            this.f33228a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13269g2 mo2891c(TakeAwayMenuDetailActivity takeAwayMenuDetailActivity) {
            C11617f.m4590a(takeAwayMenuDetailActivity);
            return new C12824l6(this.f33228a, takeAwayMenuDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$k7 */
    /* loaded from: classes2.dex */
    public static final class C12816k7 implements InterfaceC13365q2.InterfaceC13366a {

        /* renamed from: a */
        private final C12636e f33229a;

        private C12816k7(C12636e c12636e) {
            this.f33229a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13365q2 mo2891c(UserDataInsertActivity userDataInsertActivity) {
            C11617f.m4590a(userDataInsertActivity);
            return new C12825l7(this.f33229a, userDataInsertActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l */
    /* loaded from: classes2.dex */
    public static final class C12817l implements InterfaceC13359q.InterfaceC13360a {

        /* renamed from: a */
        private final C12636e f33230a;

        private C12817l(C12636e c12636e) {
            this.f33230a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13359q mo2891c(AvailableCardsResumeActivity availableCardsResumeActivity) {
            C11617f.m4590a(availableCardsResumeActivity);
            return new C12826m(this.f33230a, availableCardsResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l0 */
    /* loaded from: classes2.dex */
    public static final class C12818l0 implements InterfaceC13375s.InterfaceC13376a {

        /* renamed from: a */
        private final C12636e f33231a;

        private C12818l0(C12636e c12636e) {
            this.f33231a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13375s mo2891c(ClubActivity clubActivity) {
            C11617f.m4590a(clubActivity);
            return new C12827m0(this.f33231a, clubActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l1 */
    /* loaded from: classes2.dex */
    public static final class C12819l1 implements InterfaceC13225c0.InterfaceC13226a {

        /* renamed from: a */
        private final C12636e f33232a;

        private C12819l1(C12636e c12636e) {
            this.f33232a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13225c0 mo2891c(ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity) {
            C11617f.m4590a(electronicInvoiceEditEmailActivity);
            return new C12828m1(this.f33232a, electronicInvoiceEditEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l2 */
    /* loaded from: classes2.dex */
    public static final class C12820l2 implements InterfaceC13335n0 {

        /* renamed from: a */
        private final C12636e f33233a;

        /* renamed from: b */
        private InterfaceC12341a<LoggedAccountActivity> f33234b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33235c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33236d;

        /* renamed from: e */
        private C1922r f33237e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33238f;

        private C12820l2(C12636e c12636e, LoggedAccountActivity loggedAccountActivity) {
            this.f33233a = c12636e;
            m2425b(loggedAccountActivity);
        }

        /* renamed from: b */
        private void m2425b(LoggedAccountActivity loggedAccountActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loggedAccountActivity);
            this.f33234b = m4594a;
            this.f33235c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33233a.f32704B2, this.f33233a.f32708C2, this.f33233a.f32712D2));
            this.f33236d = C11613b.m4596a(C5975c.m22544a(this.f33233a.f32703B1));
            C1922r m35143a = C1922r.m35143a(this.f33233a.f32703B1, this.f33233a.f32780U2, this.f33233a.f32740K2, this.f33233a.f32850j3, this.f33233a.f32740K2);
            this.f33237e = m35143a;
            this.f33238f = C1923s.m35139c(m35143a);
        }

        /* renamed from: d */
        private LoggedAccountActivity m2423d(LoggedAccountActivity loggedAccountActivity) {
            C11205c.m5751a(loggedAccountActivity, this.f33233a.m2750Y());
            C5921e.m22726a(loggedAccountActivity, this.f33235c.mo42226get());
            C13872m.m123d(loggedAccountActivity, this.f33236d.mo42226get());
            C13872m.m125b(loggedAccountActivity, (AuthManager) this.f33233a.f32700A2.mo42226get());
            C13872m.m126a(loggedAccountActivity, (AppRatingManager) this.f33233a.f32716E2.mo42226get());
            C13872m.m124c(loggedAccountActivity, (InterfaceC3954c) this.f33233a.f32720F2.mo42226get());
            C1913i.m35144a(loggedAccountActivity, m2421f());
            return loggedAccountActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2422e() {
            return Collections.singletonMap(LoggedAccountViewModel.class, (InterfaceC6657b) this.f33238f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2421f() {
            return new ViewModelFactoryByInjection(m2422e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoggedAccountActivity loggedAccountActivity) {
            m2423d(loggedAccountActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l3 */
    /* loaded from: classes2.dex */
    public static final class C12821l3 implements InterfaceC13303k {

        /* renamed from: a */
        private final C12636e f33239a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingCardRegistrationActivity> f33240b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33241c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33242d;

        /* renamed from: e */
        private C12187j f33243e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33244f;

        private C12821l3(C12636e c12636e, OnboardingCardRegistrationActivity onboardingCardRegistrationActivity) {
            this.f33239a = c12636e;
            m2420b(onboardingCardRegistrationActivity);
        }

        /* renamed from: b */
        private void m2420b(OnboardingCardRegistrationActivity onboardingCardRegistrationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingCardRegistrationActivity);
            this.f33240b = m4594a;
            this.f33241c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33239a.f32704B2, this.f33239a.f32708C2, this.f33239a.f32712D2));
            this.f33242d = C11613b.m4596a(C5975c.m22544a(this.f33239a.f32703B1));
            C12187j m3442a = C12187j.m3442a(this.f33239a.f32703B1, this.f33239a.f32796Y2, this.f33239a.f32771S1, this.f33239a.f32740K2);
            this.f33243e = m3442a;
            this.f33244f = C12188k.m3438c(m3442a);
        }

        /* renamed from: d */
        private OnboardingCardRegistrationActivity m2418d(OnboardingCardRegistrationActivity onboardingCardRegistrationActivity) {
            C11205c.m5751a(onboardingCardRegistrationActivity, this.f33239a.m2750Y());
            C5921e.m22726a(onboardingCardRegistrationActivity, this.f33241c.mo42226get());
            C13872m.m123d(onboardingCardRegistrationActivity, this.f33242d.mo42226get());
            C13872m.m125b(onboardingCardRegistrationActivity, (AuthManager) this.f33239a.f32700A2.mo42226get());
            C13872m.m126a(onboardingCardRegistrationActivity, (AppRatingManager) this.f33239a.f32716E2.mo42226get());
            C13872m.m124c(onboardingCardRegistrationActivity, (InterfaceC3954c) this.f33239a.f32720F2.mo42226get());
            C12184h.m3446a(onboardingCardRegistrationActivity, m2416f());
            return onboardingCardRegistrationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2417e() {
            return Collections.singletonMap(OnboardingCardRegistrationViewModel.class, (InterfaceC6657b) this.f33244f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2416f() {
            return new ViewModelFactoryByInjection(m2417e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingCardRegistrationActivity onboardingCardRegistrationActivity) {
            m2418d(onboardingCardRegistrationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l4 */
    /* loaded from: classes2.dex */
    public static final class C12822l4 implements InterfaceC13297j1 {

        /* renamed from: a */
        private final C12636e f33245a;

        /* renamed from: b */
        private InterfaceC12341a<PinRecoverActivity> f33246b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33247c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33248d;

        /* renamed from: e */
        private C9759d f33249e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33250f;

        private C12822l4(C12636e c12636e, PinRecoverActivity pinRecoverActivity) {
            this.f33245a = c12636e;
            m2415b(pinRecoverActivity);
        }

        /* renamed from: b */
        private void m2415b(PinRecoverActivity pinRecoverActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(pinRecoverActivity);
            this.f33246b = m4594a;
            this.f33247c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33245a.f32704B2, this.f33245a.f32708C2, this.f33245a.f32712D2));
            this.f33248d = C11613b.m4596a(C5975c.m22544a(this.f33245a.f32703B1));
            C9759d m10007a = C9759d.m10007a(this.f33245a.f32703B1, this.f33245a.f32700A2, this.f33245a.f32815c3, this.f33245a.f32835g3, this.f33245a.f32740K2, this.f33245a.f32740K2);
            this.f33249e = m10007a;
            this.f33250f = C9760e.m10003c(m10007a);
        }

        /* renamed from: d */
        private PinRecoverActivity m2413d(PinRecoverActivity pinRecoverActivity) {
            C11205c.m5751a(pinRecoverActivity, this.f33245a.m2750Y());
            C5921e.m22726a(pinRecoverActivity, this.f33247c.mo42226get());
            C13872m.m123d(pinRecoverActivity, this.f33248d.mo42226get());
            C13872m.m125b(pinRecoverActivity, (AuthManager) this.f33245a.f32700A2.mo42226get());
            C13872m.m126a(pinRecoverActivity, (AppRatingManager) this.f33245a.f32716E2.mo42226get());
            C13872m.m124c(pinRecoverActivity, (InterfaceC3954c) this.f33245a.f32720F2.mo42226get());
            C9757b.m10008a(pinRecoverActivity, m2411f());
            return pinRecoverActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2412e() {
            return Collections.singletonMap(PinRecoverViewModel.class, (InterfaceC6657b) this.f33250f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2411f() {
            return new ViewModelFactoryByInjection(m2412e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PinRecoverActivity pinRecoverActivity) {
            m2413d(pinRecoverActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l5 */
    /* loaded from: classes2.dex */
    public static final class C12823l5 implements InterfaceC13379s1 {

        /* renamed from: a */
        private final C12636e f33251a;

        /* renamed from: b */
        private InterfaceC12341a<ReplacePinActivity> f33252b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33253c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33254d;

        /* renamed from: e */
        private C11361i f33255e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33256f;

        private C12823l5(C12636e c12636e, ReplacePinActivity replacePinActivity) {
            this.f33251a = c12636e;
            m2410b(replacePinActivity);
        }

        /* renamed from: b */
        private void m2410b(ReplacePinActivity replacePinActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(replacePinActivity);
            this.f33252b = m4594a;
            this.f33253c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33251a.f32704B2, this.f33251a.f32708C2, this.f33251a.f32712D2));
            this.f33254d = C11613b.m4596a(C5975c.m22544a(this.f33251a.f32703B1));
            C11361i m5340a = C11361i.m5340a(this.f33251a.f32703B1, this.f33251a.f32700A2, this.f33251a.f32711D1, this.f33251a.f32820d3, this.f33251a.f32825e3, this.f33251a.f32815c3, this.f33251a.f32771S1, this.f33251a.f32740K2);
            this.f33255e = m5340a;
            this.f33256f = C11362j.m5336c(m5340a);
        }

        /* renamed from: d */
        private ReplacePinActivity m2408d(ReplacePinActivity replacePinActivity) {
            C11205c.m5751a(replacePinActivity, this.f33251a.m2750Y());
            C5921e.m22726a(replacePinActivity, this.f33253c.mo42226get());
            C13872m.m123d(replacePinActivity, this.f33254d.mo42226get());
            C13872m.m125b(replacePinActivity, (AuthManager) this.f33251a.f32700A2.mo42226get());
            C13872m.m126a(replacePinActivity, (AppRatingManager) this.f33251a.f32716E2.mo42226get());
            C13872m.m124c(replacePinActivity, (InterfaceC3954c) this.f33251a.f32720F2.mo42226get());
            C11358g.m5349a(replacePinActivity, m2406f());
            return replacePinActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2407e() {
            return Collections.singletonMap(ReplacePinViewModel.class, (InterfaceC6657b) this.f33256f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2406f() {
            return new ViewModelFactoryByInjection(m2407e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ReplacePinActivity replacePinActivity) {
            m2408d(replacePinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l6 */
    /* loaded from: classes2.dex */
    public static final class C12824l6 implements InterfaceC13269g2 {

        /* renamed from: a */
        private final C12636e f33257a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayMenuDetailActivity> f33258b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33259c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33260d;

        /* renamed from: e */
        private C2182g f33261e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33262f;

        private C12824l6(C12636e c12636e, TakeAwayMenuDetailActivity takeAwayMenuDetailActivity) {
            this.f33257a = c12636e;
            m2405b(takeAwayMenuDetailActivity);
        }

        /* renamed from: b */
        private void m2405b(TakeAwayMenuDetailActivity takeAwayMenuDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayMenuDetailActivity);
            this.f33258b = m4594a;
            this.f33259c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33257a.f32704B2, this.f33257a.f32708C2, this.f33257a.f32712D2));
            this.f33260d = C11613b.m4596a(C5975c.m22544a(this.f33257a.f32703B1));
            C2182g m34492a = C2182g.m34492a(this.f33257a.f32703B1, this.f33257a.f32771S1, this.f33257a.f32865m3, this.f33257a.f32740K2);
            this.f33261e = m34492a;
            this.f33262f = C2183h.m34488c(m34492a);
        }

        /* renamed from: d */
        private TakeAwayMenuDetailActivity m2403d(TakeAwayMenuDetailActivity takeAwayMenuDetailActivity) {
            C11205c.m5751a(takeAwayMenuDetailActivity, this.f33257a.m2750Y());
            C5921e.m22726a(takeAwayMenuDetailActivity, this.f33259c.mo42226get());
            C13872m.m123d(takeAwayMenuDetailActivity, this.f33260d.mo42226get());
            C13872m.m125b(takeAwayMenuDetailActivity, (AuthManager) this.f33257a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayMenuDetailActivity, (AppRatingManager) this.f33257a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayMenuDetailActivity, (InterfaceC3954c) this.f33257a.f32720F2.mo42226get());
            C2181e.m34497a(takeAwayMenuDetailActivity, m2401f());
            return takeAwayMenuDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2402e() {
            return Collections.singletonMap(TakeAwayProductDetailViewModel.class, (InterfaceC6657b) this.f33262f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2401f() {
            return new ViewModelFactoryByInjection(m2402e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayMenuDetailActivity takeAwayMenuDetailActivity) {
            m2403d(takeAwayMenuDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$l7 */
    /* loaded from: classes2.dex */
    public static final class C12825l7 implements InterfaceC13365q2 {

        /* renamed from: a */
        private final C12636e f33263a;

        /* renamed from: b */
        private InterfaceC12341a<UserDataInsertActivity> f33264b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33265c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33266d;

        /* renamed from: e */
        private C5133d f33267e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33268f;

        private C12825l7(C12636e c12636e, UserDataInsertActivity userDataInsertActivity) {
            this.f33263a = c12636e;
            m2400b(userDataInsertActivity);
        }

        /* renamed from: b */
        private void m2400b(UserDataInsertActivity userDataInsertActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(userDataInsertActivity);
            this.f33264b = m4594a;
            this.f33265c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33263a.f32704B2, this.f33263a.f32708C2, this.f33263a.f32712D2));
            this.f33266d = C11613b.m4596a(C5975c.m22544a(this.f33263a.f32703B1));
            C5133d m25585a = C5133d.m25585a(this.f33263a.f32703B1, this.f33263a.f32771S1, this.f33263a.f32740K2);
            this.f33267e = m25585a;
            this.f33268f = C5134e.m25581c(m25585a);
        }

        /* renamed from: d */
        private UserDataInsertActivity m2398d(UserDataInsertActivity userDataInsertActivity) {
            C11205c.m5751a(userDataInsertActivity, this.f33263a.m2750Y());
            C5921e.m22726a(userDataInsertActivity, this.f33265c.mo42226get());
            C13872m.m123d(userDataInsertActivity, this.f33266d.mo42226get());
            C13872m.m125b(userDataInsertActivity, (AuthManager) this.f33263a.f32700A2.mo42226get());
            C13872m.m126a(userDataInsertActivity, (AppRatingManager) this.f33263a.f32716E2.mo42226get());
            C13872m.m124c(userDataInsertActivity, (InterfaceC3954c) this.f33263a.f32720F2.mo42226get());
            C5132b.m25588a(userDataInsertActivity, m2396f());
            return userDataInsertActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2397e() {
            return Collections.singletonMap(UserDataInsertViewModel.class, (InterfaceC6657b) this.f33268f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2396f() {
            return new ViewModelFactoryByInjection(m2397e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(UserDataInsertActivity userDataInsertActivity) {
            m2398d(userDataInsertActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m */
    /* loaded from: classes2.dex */
    public static final class C12826m implements InterfaceC13359q {

        /* renamed from: a */
        private final C12636e f33269a;

        /* renamed from: b */
        private InterfaceC12341a<AvailableCardsResumeActivity> f33270b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33271c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33272d;

        /* renamed from: e */
        private C1933f f33273e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33274f;

        private C12826m(C12636e c12636e, AvailableCardsResumeActivity availableCardsResumeActivity) {
            this.f33269a = c12636e;
            m2395b(availableCardsResumeActivity);
        }

        /* renamed from: b */
        private void m2395b(AvailableCardsResumeActivity availableCardsResumeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(availableCardsResumeActivity);
            this.f33270b = m4594a;
            this.f33271c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33269a.f32704B2, this.f33269a.f32708C2, this.f33269a.f32712D2));
            this.f33272d = C11613b.m4596a(C5975c.m22544a(this.f33269a.f32703B1));
            C1933f m35106a = C1933f.m35106a(this.f33269a.f32703B1, this.f33269a.f32771S1, this.f33269a.f32780U2, this.f33269a.f32740K2, this.f33269a.f32740K2);
            this.f33273e = m35106a;
            this.f33274f = C1934g.m35102c(m35106a);
        }

        /* renamed from: d */
        private AvailableCardsResumeActivity m2393d(AvailableCardsResumeActivity availableCardsResumeActivity) {
            C11205c.m5751a(availableCardsResumeActivity, this.f33269a.m2750Y());
            C5921e.m22726a(availableCardsResumeActivity, this.f33271c.mo42226get());
            C13872m.m123d(availableCardsResumeActivity, this.f33272d.mo42226get());
            C13872m.m125b(availableCardsResumeActivity, (AuthManager) this.f33269a.f32700A2.mo42226get());
            C13872m.m126a(availableCardsResumeActivity, (AppRatingManager) this.f33269a.f32716E2.mo42226get());
            C13872m.m124c(availableCardsResumeActivity, (InterfaceC3954c) this.f33269a.f32720F2.mo42226get());
            C1928b.m35121a(availableCardsResumeActivity, m2391f());
            return availableCardsResumeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2392e() {
            return Collections.singletonMap(AvailableCardsResumeViewModel.class, (InterfaceC6657b) this.f33274f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2391f() {
            return new ViewModelFactoryByInjection(m2392e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(AvailableCardsResumeActivity availableCardsResumeActivity) {
            m2393d(availableCardsResumeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m0 */
    /* loaded from: classes2.dex */
    public static final class C12827m0 implements InterfaceC13375s {

        /* renamed from: a */
        private final C12636e f33275a;

        /* renamed from: b */
        private InterfaceC12341a<ClubActivity> f33276b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33277c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33278d;

        /* renamed from: e */
        private C5953i f33279e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33280f;

        private C12827m0(C12636e c12636e, ClubActivity clubActivity) {
            this.f33275a = c12636e;
            m2390b(clubActivity);
        }

        /* renamed from: b */
        private void m2390b(ClubActivity clubActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(clubActivity);
            this.f33276b = m4594a;
            this.f33277c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33275a.f32704B2, this.f33275a.f32708C2, this.f33275a.f32712D2));
            this.f33278d = C11613b.m4596a(C5975c.m22544a(this.f33275a.f32703B1));
            C5953i m22616a = C5953i.m22616a(this.f33275a.f32703B1, this.f33275a.f32850j3, this.f33275a.f32771S1, this.f33275a.f32740K2);
            this.f33279e = m22616a;
            this.f33280f = C5954j.m22612c(m22616a);
        }

        /* renamed from: d */
        private ClubActivity m2388d(ClubActivity clubActivity) {
            C11205c.m5751a(clubActivity, this.f33275a.m2750Y());
            C5921e.m22726a(clubActivity, this.f33277c.mo42226get());
            C13872m.m123d(clubActivity, this.f33278d.mo42226get());
            C13872m.m125b(clubActivity, (AuthManager) this.f33275a.f32700A2.mo42226get());
            C13872m.m126a(clubActivity, (AppRatingManager) this.f33275a.f32716E2.mo42226get());
            C13872m.m124c(clubActivity, (InterfaceC3954c) this.f33275a.f32720F2.mo42226get());
            C5946d.m22635a(clubActivity, m2386f());
            return clubActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2387e() {
            return Collections.singletonMap(ClubViewModel.class, (InterfaceC6657b) this.f33280f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2386f() {
            return new ViewModelFactoryByInjection(m2387e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ClubActivity clubActivity) {
            m2388d(clubActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m1 */
    /* loaded from: classes2.dex */
    public static final class C12828m1 implements InterfaceC13225c0 {

        /* renamed from: a */
        private final C12636e f33281a;

        /* renamed from: b */
        private InterfaceC12341a<ElectronicInvoiceEditEmailActivity> f33282b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33283c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33284d;

        /* renamed from: e */
        private C9733d f33285e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33286f;

        private C12828m1(C12636e c12636e, ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity) {
            this.f33281a = c12636e;
            m2385b(electronicInvoiceEditEmailActivity);
        }

        /* renamed from: b */
        private void m2385b(ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(electronicInvoiceEditEmailActivity);
            this.f33282b = m4594a;
            this.f33283c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33281a.f32704B2, this.f33281a.f32708C2, this.f33281a.f32712D2));
            this.f33284d = C11613b.m4596a(C5975c.m22544a(this.f33281a.f32703B1));
            C9733d m10084a = C9733d.m10084a(this.f33281a.f32703B1, this.f33281a.f32771S1, this.f33281a.f32740K2);
            this.f33285e = m10084a;
            this.f33286f = C9734e.m10080c(m10084a);
        }

        /* renamed from: d */
        private ElectronicInvoiceEditEmailActivity m2383d(ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity) {
            C11205c.m5751a(electronicInvoiceEditEmailActivity, this.f33281a.m2750Y());
            C5921e.m22726a(electronicInvoiceEditEmailActivity, this.f33283c.mo42226get());
            C13872m.m123d(electronicInvoiceEditEmailActivity, this.f33284d.mo42226get());
            C13872m.m125b(electronicInvoiceEditEmailActivity, (AuthManager) this.f33281a.f32700A2.mo42226get());
            C13872m.m126a(electronicInvoiceEditEmailActivity, (AppRatingManager) this.f33281a.f32716E2.mo42226get());
            C13872m.m124c(electronicInvoiceEditEmailActivity, (InterfaceC3954c) this.f33281a.f32720F2.mo42226get());
            C9732b.m10087a(electronicInvoiceEditEmailActivity, m2381f());
            return electronicInvoiceEditEmailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2382e() {
            return Collections.singletonMap(ElectronicInvoiceEditEmailViewModel.class, (InterfaceC6657b) this.f33286f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2381f() {
            return new ViewModelFactoryByInjection(m2382e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ElectronicInvoiceEditEmailActivity electronicInvoiceEditEmailActivity) {
            m2383d(electronicInvoiceEditEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m2 */
    /* loaded from: classes2.dex */
    public static final class C12829m2 implements InterfaceC13295j0.InterfaceC13296a {

        /* renamed from: a */
        private final C12636e f33287a;

        private C12829m2(C12636e c12636e) {
            this.f33287a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13295j0 mo2891c(LoginPhoneActivity loginPhoneActivity) {
            C11617f.m4590a(loginPhoneActivity);
            return new C12838n2(this.f33287a, loginPhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m3 */
    /* loaded from: classes2.dex */
    public static final class C12830m3 implements InterfaceC13433z0.InterfaceC13434a {

        /* renamed from: a */
        private final C12636e f33288a;

        private C12830m3(C12636e c12636e) {
            this.f33288a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13433z0 mo2891c(OnboardingCardTutorialActivity onboardingCardTutorialActivity) {
            C11617f.m4590a(onboardingCardTutorialActivity);
            return new C12839n3(this.f33288a, onboardingCardTutorialActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m4 */
    /* loaded from: classes2.dex */
    public static final class C12831m4 implements InterfaceC13307k1.InterfaceC13308a {

        /* renamed from: a */
        private final C12636e f33289a;

        private C12831m4(C12636e c12636e) {
            this.f33289a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13307k1 mo2891c(ProductDetailActivity productDetailActivity) {
            C11617f.m4590a(productDetailActivity);
            return new C12840n4(this.f33289a, productDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m5 */
    /* loaded from: classes2.dex */
    public static final class C12832m5 implements InterfaceC13387t1.InterfaceC13388a {

        /* renamed from: a */
        private final C12636e f33290a;

        private C12832m5(C12636e c12636e) {
            this.f33290a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13387t1 mo2891c(SearchActivity searchActivity) {
            C11617f.m4590a(searchActivity);
            return new C12841n5(this.f33290a, searchActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m6 */
    /* loaded from: classes2.dex */
    public static final class C12833m6 implements InterfaceC13279h2.InterfaceC13280a {

        /* renamed from: a */
        private final C12636e f33291a;

        private C12833m6(C12636e c12636e) {
            this.f33291a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13279h2 mo2891c(TakeAwayOrderDetailActivity takeAwayOrderDetailActivity) {
            C11617f.m4590a(takeAwayOrderDetailActivity);
            return new C12842n6(this.f33291a, takeAwayOrderDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$m7 */
    /* loaded from: classes2.dex */
    public static final class C12834m7 implements InterfaceC13373r2.InterfaceC13374a {

        /* renamed from: a */
        private final C12636e f33292a;

        private C12834m7(C12636e c12636e) {
            this.f33292a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13373r2 mo2891c(UserDataUpdateActivity userDataUpdateActivity) {
            C11617f.m4590a(userDataUpdateActivity);
            return new C12843n7(this.f33292a, userDataUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n */
    /* loaded from: classes2.dex */
    public static final class C12835n implements InterfaceC13253f.InterfaceC13254a {

        /* renamed from: a */
        private final C12636e f33293a;

        private C12835n(C12636e c12636e) {
            this.f33293a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13253f mo2891c(BabyClubHomeActivity babyClubHomeActivity) {
            C11617f.m4590a(babyClubHomeActivity);
            return new C12844o(this.f33293a, babyClubHomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n0 */
    /* loaded from: classes2.dex */
    public static final class C12836n0 implements InterfaceC13383t.InterfaceC13384a {

        /* renamed from: a */
        private final C12636e f33294a;

        private C12836n0(C12636e c12636e) {
            this.f33294a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13383t mo2891c(CreatePhoneActivity createPhoneActivity) {
            C11617f.m4590a(createPhoneActivity);
            return new C12845o0(this.f33294a, createPhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n1 */
    /* loaded from: classes2.dex */
    public static final class C12837n1 implements InterfaceC13235d0.InterfaceC13236a {

        /* renamed from: a */
        private final C12636e f33295a;

        private C12837n1(C12636e c12636e) {
            this.f33295a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13235d0 mo2891c(ElectronicInvoiceEmailActivity electronicInvoiceEmailActivity) {
            C11617f.m4590a(electronicInvoiceEmailActivity);
            return new C12846o1(this.f33295a, electronicInvoiceEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n2 */
    /* loaded from: classes2.dex */
    public static final class C12838n2 implements InterfaceC13295j0 {

        /* renamed from: a */
        private final C12636e f33296a;

        /* renamed from: b */
        private InterfaceC12341a<LoginPhoneActivity> f33297b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33298c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33299d;

        /* renamed from: e */
        private C7931e f33300e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33301f;

        private C12838n2(C12636e c12636e, LoginPhoneActivity loginPhoneActivity) {
            this.f33296a = c12636e;
            m2371b(loginPhoneActivity);
        }

        /* renamed from: b */
        private void m2371b(LoginPhoneActivity loginPhoneActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loginPhoneActivity);
            this.f33297b = m4594a;
            this.f33298c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33296a.f32704B2, this.f33296a.f32708C2, this.f33296a.f32712D2));
            this.f33299d = C11613b.m4596a(C5975c.m22544a(this.f33296a.f32703B1));
            C7931e m17527a = C7931e.m17527a(this.f33296a.f32703B1, this.f33296a.f32909w2, this.f33296a.f32784V2, this.f33296a.f32771S1, this.f33296a.f32740K2);
            this.f33300e = m17527a;
            this.f33301f = C7932f.m17523c(m17527a);
        }

        /* renamed from: d */
        private LoginPhoneActivity m2369d(LoginPhoneActivity loginPhoneActivity) {
            C11205c.m5751a(loginPhoneActivity, this.f33296a.m2750Y());
            C5921e.m22726a(loginPhoneActivity, this.f33298c.mo42226get());
            C13872m.m123d(loginPhoneActivity, this.f33299d.mo42226get());
            C13872m.m125b(loginPhoneActivity, (AuthManager) this.f33296a.f32700A2.mo42226get());
            C13872m.m126a(loginPhoneActivity, (AppRatingManager) this.f33296a.f32716E2.mo42226get());
            C13872m.m124c(loginPhoneActivity, (InterfaceC3954c) this.f33296a.f32720F2.mo42226get());
            C7926c.m17546a(loginPhoneActivity, m2367f());
            return loginPhoneActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2368e() {
            return Collections.singletonMap(LoginPhoneViewModel.class, (InterfaceC6657b) this.f33301f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2367f() {
            return new ViewModelFactoryByInjection(m2368e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoginPhoneActivity loginPhoneActivity) {
            m2369d(loginPhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n3 */
    /* loaded from: classes2.dex */
    public static final class C12839n3 implements InterfaceC13433z0 {

        /* renamed from: a */
        private final C12636e f33302a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingCardTutorialActivity> f33303b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33304c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33305d;

        /* renamed from: e */
        private C12192o f33306e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33307f;

        private C12839n3(C12636e c12636e, OnboardingCardTutorialActivity onboardingCardTutorialActivity) {
            this.f33302a = c12636e;
            m2366b(onboardingCardTutorialActivity);
        }

        /* renamed from: b */
        private void m2366b(OnboardingCardTutorialActivity onboardingCardTutorialActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingCardTutorialActivity);
            this.f33303b = m4594a;
            this.f33304c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33302a.f32704B2, this.f33302a.f32708C2, this.f33302a.f32712D2));
            this.f33305d = C11613b.m4596a(C5975c.m22544a(this.f33302a.f32703B1));
            C12192o m3432a = C12192o.m3432a(this.f33302a.f32703B1, this.f33302a.f32740K2);
            this.f33306e = m3432a;
            this.f33307f = C12193p.m3428c(m3432a);
        }

        /* renamed from: d */
        private OnboardingCardTutorialActivity m2364d(OnboardingCardTutorialActivity onboardingCardTutorialActivity) {
            C11205c.m5751a(onboardingCardTutorialActivity, this.f33302a.m2750Y());
            C5921e.m22726a(onboardingCardTutorialActivity, this.f33304c.mo42226get());
            C13872m.m123d(onboardingCardTutorialActivity, this.f33305d.mo42226get());
            C13872m.m125b(onboardingCardTutorialActivity, (AuthManager) this.f33302a.f32700A2.mo42226get());
            C13872m.m126a(onboardingCardTutorialActivity, (AppRatingManager) this.f33302a.f32716E2.mo42226get());
            C13872m.m124c(onboardingCardTutorialActivity, (InterfaceC3954c) this.f33302a.f32720F2.mo42226get());
            C12189l.m3437a(onboardingCardTutorialActivity, m2362f());
            return onboardingCardTutorialActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2363e() {
            return Collections.singletonMap(OnboardingCardTutorialViewModel.class, (InterfaceC6657b) this.f33307f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2362f() {
            return new ViewModelFactoryByInjection(m2363e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingCardTutorialActivity onboardingCardTutorialActivity) {
            m2364d(onboardingCardTutorialActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n4 */
    /* loaded from: classes2.dex */
    public static final class C12840n4 implements InterfaceC13307k1 {

        /* renamed from: a */
        private final C12636e f33308a;

        /* renamed from: b */
        private InterfaceC12341a<ProductDetailActivity> f33309b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33310c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33311d;

        /* renamed from: e */
        private C2166j f33312e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33313f;

        private C12840n4(C12636e c12636e, ProductDetailActivity productDetailActivity) {
            this.f33308a = c12636e;
            m2361b(productDetailActivity);
        }

        /* renamed from: b */
        private void m2361b(ProductDetailActivity productDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(productDetailActivity);
            this.f33309b = m4594a;
            this.f33310c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33308a.f32704B2, this.f33308a.f32708C2, this.f33308a.f32712D2));
            this.f33311d = C11613b.m4596a(C5975c.m22544a(this.f33308a.f32703B1));
            C2166j m34544a = C2166j.m34544a(this.f33308a.f32703B1, this.f33308a.f32756O2, this.f33308a.f32724G2, this.f33308a.f32744L2, this.f33308a.f32740K2);
            this.f33312e = m34544a;
            this.f33313f = C2167k.m34540c(m34544a);
        }

        /* renamed from: d */
        private ProductDetailActivity m2359d(ProductDetailActivity productDetailActivity) {
            C11205c.m5751a(productDetailActivity, this.f33308a.m2750Y());
            C5921e.m22726a(productDetailActivity, this.f33310c.mo42226get());
            C13872m.m123d(productDetailActivity, this.f33311d.mo42226get());
            C13872m.m125b(productDetailActivity, (AuthManager) this.f33308a.f32700A2.mo42226get());
            C13872m.m126a(productDetailActivity, (AppRatingManager) this.f33308a.f32716E2.mo42226get());
            C13872m.m124c(productDetailActivity, (InterfaceC3954c) this.f33308a.f32720F2.mo42226get());
            C2161h.m34571a(productDetailActivity, (TransactionCacheManager) this.f33308a.f32724G2.mo42226get());
            C2161h.m34570b(productDetailActivity, m2357f());
            return productDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2358e() {
            return Collections.singletonMap(ProductDetailViewModel.class, (InterfaceC6657b) this.f33313f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2357f() {
            return new ViewModelFactoryByInjection(m2358e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ProductDetailActivity productDetailActivity) {
            m2359d(productDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n5 */
    /* loaded from: classes2.dex */
    public static final class C12841n5 implements InterfaceC13387t1 {

        /* renamed from: a */
        private final C12636e f33314a;

        /* renamed from: b */
        private InterfaceC12341a<SearchActivity> f33315b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33316c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33317d;

        /* renamed from: e */
        private C5552y f33318e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33319f;

        private C12841n5(C12636e c12636e, SearchActivity searchActivity) {
            this.f33314a = c12636e;
            m2356b(searchActivity);
        }

        /* renamed from: b */
        private void m2356b(SearchActivity searchActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(searchActivity);
            this.f33315b = m4594a;
            this.f33316c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33314a.f32704B2, this.f33314a.f32708C2, this.f33314a.f32712D2));
            this.f33317d = C11613b.m4596a(C5975c.m22544a(this.f33314a.f32703B1));
            C5552y m23744a = C5552y.m23744a(this.f33314a.f32703B1, this.f33314a.f32756O2, this.f33314a.f32744L2, this.f33314a.f32870n3, this.f33314a.f32740K2);
            this.f33318e = m23744a;
            this.f33319f = C5553z.m23740c(m23744a);
        }

        /* renamed from: d */
        private SearchActivity m2354d(SearchActivity searchActivity) {
            C11205c.m5751a(searchActivity, this.f33314a.m2750Y());
            C5921e.m22726a(searchActivity, this.f33316c.mo42226get());
            C13872m.m123d(searchActivity, this.f33317d.mo42226get());
            C13872m.m125b(searchActivity, (AuthManager) this.f33314a.f32700A2.mo42226get());
            C13872m.m126a(searchActivity, (AppRatingManager) this.f33314a.f32716E2.mo42226get());
            C13872m.m124c(searchActivity, (InterfaceC3954c) this.f33314a.f32720F2.mo42226get());
            C5549v.m23746a(searchActivity, (TransactionCacheManager) this.f33314a.f32724G2.mo42226get());
            C5549v.m23745b(searchActivity, m2352f());
            return searchActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2353e() {
            return Collections.singletonMap(SearchViewModel.class, (InterfaceC6657b) this.f33319f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2352f() {
            return new ViewModelFactoryByInjection(m2353e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(SearchActivity searchActivity) {
            m2354d(searchActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n6 */
    /* loaded from: classes2.dex */
    public static final class C12842n6 implements InterfaceC13279h2 {

        /* renamed from: a */
        private final C12636e f33320a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayOrderDetailActivity> f33321b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33322c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33323d;

        /* renamed from: e */
        private C10972f f33324e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33325f;

        private C12842n6(C12636e c12636e, TakeAwayOrderDetailActivity takeAwayOrderDetailActivity) {
            this.f33320a = c12636e;
            m2351b(takeAwayOrderDetailActivity);
        }

        /* renamed from: b */
        private void m2351b(TakeAwayOrderDetailActivity takeAwayOrderDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayOrderDetailActivity);
            this.f33321b = m4594a;
            this.f33322c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33320a.f32704B2, this.f33320a.f32708C2, this.f33320a.f32712D2));
            this.f33323d = C11613b.m4596a(C5975c.m22544a(this.f33320a.f32703B1));
            C10972f m6687a = C10972f.m6687a(this.f33320a.f32703B1, this.f33320a.f32865m3, this.f33320a.f32740K2);
            this.f33324e = m6687a;
            this.f33325f = C10973g.m6683c(m6687a);
        }

        /* renamed from: d */
        private TakeAwayOrderDetailActivity m2349d(TakeAwayOrderDetailActivity takeAwayOrderDetailActivity) {
            C11205c.m5751a(takeAwayOrderDetailActivity, this.f33320a.m2750Y());
            C5921e.m22726a(takeAwayOrderDetailActivity, this.f33322c.mo42226get());
            C13872m.m123d(takeAwayOrderDetailActivity, this.f33323d.mo42226get());
            C13872m.m125b(takeAwayOrderDetailActivity, (AuthManager) this.f33320a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayOrderDetailActivity, (AppRatingManager) this.f33320a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayOrderDetailActivity, (InterfaceC3954c) this.f33320a.f32720F2.mo42226get());
            C10968c.m6700a(takeAwayOrderDetailActivity, m2347f());
            return takeAwayOrderDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2348e() {
            return Collections.singletonMap(TakeAwayOrderDetailViewModel.class, (InterfaceC6657b) this.f33325f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2347f() {
            return new ViewModelFactoryByInjection(m2348e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayOrderDetailActivity takeAwayOrderDetailActivity) {
            m2349d(takeAwayOrderDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$n7 */
    /* loaded from: classes2.dex */
    public static final class C12843n7 implements InterfaceC13373r2 {

        /* renamed from: a */
        private final C12636e f33326a;

        /* renamed from: b */
        private InterfaceC12341a<UserDataUpdateActivity> f33327b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33328c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33329d;

        /* renamed from: e */
        private C5575d f33330e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33331f;

        private C12843n7(C12636e c12636e, UserDataUpdateActivity userDataUpdateActivity) {
            this.f33326a = c12636e;
            m2346b(userDataUpdateActivity);
        }

        /* renamed from: b */
        private void m2346b(UserDataUpdateActivity userDataUpdateActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(userDataUpdateActivity);
            this.f33327b = m4594a;
            this.f33328c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33326a.f32704B2, this.f33326a.f32708C2, this.f33326a.f32712D2));
            this.f33329d = C11613b.m4596a(C5975c.m22544a(this.f33326a.f32703B1));
            C5575d m23724a = C5575d.m23724a(this.f33326a.f32703B1, this.f33326a.f32771S1, this.f33326a.f32740K2);
            this.f33330e = m23724a;
            this.f33331f = C5576e.m23720c(m23724a);
        }

        /* renamed from: d */
        private UserDataUpdateActivity m2344d(UserDataUpdateActivity userDataUpdateActivity) {
            C11205c.m5751a(userDataUpdateActivity, this.f33326a.m2750Y());
            C5921e.m22726a(userDataUpdateActivity, this.f33328c.mo42226get());
            C13872m.m123d(userDataUpdateActivity, this.f33329d.mo42226get());
            C13872m.m125b(userDataUpdateActivity, (AuthManager) this.f33326a.f32700A2.mo42226get());
            C13872m.m126a(userDataUpdateActivity, (AppRatingManager) this.f33326a.f32716E2.mo42226get());
            C13872m.m124c(userDataUpdateActivity, (InterfaceC3954c) this.f33326a.f32720F2.mo42226get());
            C5574b.m23727a(userDataUpdateActivity, m2342f());
            return userDataUpdateActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2343e() {
            return Collections.singletonMap(UserDataUpdateViewModel.class, (InterfaceC6657b) this.f33331f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2342f() {
            return new ViewModelFactoryByInjection(m2343e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(UserDataUpdateActivity userDataUpdateActivity) {
            m2344d(userDataUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o */
    /* loaded from: classes2.dex */
    public static final class C12844o implements InterfaceC13253f {

        /* renamed from: a */
        private final C12636e f33332a;

        /* renamed from: b */
        private InterfaceC12341a<BabyClubHomeActivity> f33333b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33334c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33335d;

        /* renamed from: e */
        private C6165i f33336e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33337f;

        private C12844o(C12636e c12636e, BabyClubHomeActivity babyClubHomeActivity) {
            this.f33332a = c12636e;
            m2341b(babyClubHomeActivity);
        }

        /* renamed from: b */
        private void m2341b(BabyClubHomeActivity babyClubHomeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(babyClubHomeActivity);
            this.f33333b = m4594a;
            this.f33334c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33332a.f32704B2, this.f33332a.f32708C2, this.f33332a.f32712D2));
            this.f33335d = C11613b.m4596a(C5975c.m22544a(this.f33332a.f32703B1));
            C6165i m22023a = C6165i.m22023a(this.f33332a.f32703B1, this.f33332a.f32850j3, this.f33332a.f32771S1, this.f33332a.f32740K2);
            this.f33336e = m22023a;
            this.f33337f = C6166j.m22019c(m22023a);
        }

        /* renamed from: d */
        private BabyClubHomeActivity m2339d(BabyClubHomeActivity babyClubHomeActivity) {
            C11205c.m5751a(babyClubHomeActivity, this.f33332a.m2750Y());
            C5921e.m22726a(babyClubHomeActivity, this.f33334c.mo42226get());
            C13872m.m123d(babyClubHomeActivity, this.f33335d.mo42226get());
            C13872m.m125b(babyClubHomeActivity, (AuthManager) this.f33332a.f32700A2.mo42226get());
            C13872m.m126a(babyClubHomeActivity, (AppRatingManager) this.f33332a.f32716E2.mo42226get());
            C13872m.m124c(babyClubHomeActivity, (InterfaceC3954c) this.f33332a.f32720F2.mo42226get());
            C6163g.m22024a(babyClubHomeActivity, m2337f());
            return babyClubHomeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2338e() {
            return Collections.singletonMap(BabyClubHomeViewModel.class, (InterfaceC6657b) this.f33337f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2337f() {
            return new ViewModelFactoryByInjection(m2338e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BabyClubHomeActivity babyClubHomeActivity) {
            m2339d(babyClubHomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o0 */
    /* loaded from: classes2.dex */
    public static final class C12845o0 implements InterfaceC13383t {

        /* renamed from: a */
        private final C12636e f33338a;

        /* renamed from: b */
        private InterfaceC12341a<CreatePhoneActivity> f33339b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33340c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33341d;

        /* renamed from: e */
        private C7493d f33342e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33343f;

        private C12845o0(C12636e c12636e, CreatePhoneActivity createPhoneActivity) {
            this.f33338a = c12636e;
            m2336b(createPhoneActivity);
        }

        /* renamed from: b */
        private void m2336b(CreatePhoneActivity createPhoneActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(createPhoneActivity);
            this.f33339b = m4594a;
            this.f33340c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33338a.f32704B2, this.f33338a.f32708C2, this.f33338a.f32712D2));
            this.f33341d = C11613b.m4596a(C5975c.m22544a(this.f33338a.f32703B1));
            C7493d m18361a = C7493d.m18361a(this.f33338a.f32703B1, this.f33338a.f32792X2, this.f33338a.f32771S1, this.f33338a.f32740K2);
            this.f33342e = m18361a;
            this.f33343f = C7494e.m18357c(m18361a);
        }

        /* renamed from: d */
        private CreatePhoneActivity m2334d(CreatePhoneActivity createPhoneActivity) {
            C11205c.m5751a(createPhoneActivity, this.f33338a.m2750Y());
            C5921e.m22726a(createPhoneActivity, this.f33340c.mo42226get());
            C13872m.m123d(createPhoneActivity, this.f33341d.mo42226get());
            C13872m.m125b(createPhoneActivity, (AuthManager) this.f33338a.f32700A2.mo42226get());
            C13872m.m126a(createPhoneActivity, (AppRatingManager) this.f33338a.f32716E2.mo42226get());
            C13872m.m124c(createPhoneActivity, (InterfaceC3954c) this.f33338a.f32720F2.mo42226get());
            C7491b.m18364a(createPhoneActivity, m2332f());
            return createPhoneActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2333e() {
            return Collections.singletonMap(CreatePhoneViewModel.class, (InterfaceC6657b) this.f33343f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2332f() {
            return new ViewModelFactoryByInjection(m2333e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CreatePhoneActivity createPhoneActivity) {
            m2334d(createPhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o1 */
    /* loaded from: classes2.dex */
    public static final class C12846o1 implements InterfaceC13235d0 {

        /* renamed from: a */
        private final C12636e f33344a;

        /* renamed from: b */
        private InterfaceC12341a<ElectronicInvoiceEmailActivity> f33345b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33346c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33347d;

        /* renamed from: e */
        private C9737i f33348e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33349f;

        private C12846o1(C12636e c12636e, ElectronicInvoiceEmailActivity electronicInvoiceEmailActivity) {
            this.f33344a = c12636e;
            m2331b(electronicInvoiceEmailActivity);
        }

        /* renamed from: b */
        private void m2331b(ElectronicInvoiceEmailActivity electronicInvoiceEmailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(electronicInvoiceEmailActivity);
            this.f33345b = m4594a;
            this.f33346c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33344a.f32704B2, this.f33344a.f32708C2, this.f33344a.f32712D2));
            this.f33347d = C11613b.m4596a(C5975c.m22544a(this.f33344a.f32703B1));
            C9737i m10076a = C9737i.m10076a(this.f33344a.f32703B1, this.f33344a.f32740K2, this.f33344a.f32780U2, this.f33344a.f32771S1, this.f33344a.f32740K2);
            this.f33348e = m10076a;
            this.f33349f = C9738j.m10072c(m10076a);
        }

        /* renamed from: d */
        private ElectronicInvoiceEmailActivity m2329d(ElectronicInvoiceEmailActivity electronicInvoiceEmailActivity) {
            C11205c.m5751a(electronicInvoiceEmailActivity, this.f33344a.m2750Y());
            C5921e.m22726a(electronicInvoiceEmailActivity, this.f33346c.mo42226get());
            C13872m.m123d(electronicInvoiceEmailActivity, this.f33347d.mo42226get());
            C13872m.m125b(electronicInvoiceEmailActivity, (AuthManager) this.f33344a.f32700A2.mo42226get());
            C13872m.m126a(electronicInvoiceEmailActivity, (AppRatingManager) this.f33344a.f32716E2.mo42226get());
            C13872m.m124c(electronicInvoiceEmailActivity, (InterfaceC3954c) this.f33344a.f32720F2.mo42226get());
            C9735g.m10078a(electronicInvoiceEmailActivity, m2327f());
            return electronicInvoiceEmailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2328e() {
            return Collections.singletonMap(ElectronicInvoiceEmailViewModel.class, (InterfaceC6657b) this.f33349f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2327f() {
            return new ViewModelFactoryByInjection(m2328e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ElectronicInvoiceEmailActivity electronicInvoiceEmailActivity) {
            m2329d(electronicInvoiceEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o2 */
    /* loaded from: classes2.dex */
    public static final class C12847o2 implements InterfaceC13345o0.InterfaceC13346a {

        /* renamed from: a */
        private final C12636e f33350a;

        private C12847o2(C12636e c12636e) {
            this.f33350a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13345o0 mo2891c(LoyaltyActivity loyaltyActivity) {
            C11617f.m4590a(loyaltyActivity);
            return new C12856p2(this.f33350a, loyaltyActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o3 */
    /* loaded from: classes2.dex */
    public static final class C12848o3 implements InterfaceC13207a1.InterfaceC13208a {

        /* renamed from: a */
        private final C12636e f33351a;

        private C12848o3(C12636e c12636e) {
            this.f33351a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13207a1 mo2891c(OnboardingEmailActivity onboardingEmailActivity) {
            C11617f.m4590a(onboardingEmailActivity);
            return new C12857p3(this.f33351a, onboardingEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o4 */
    /* loaded from: classes2.dex */
    public static final class C12849o4 implements InterfaceC13311k3.InterfaceC13312a {

        /* renamed from: a */
        private final C12636e f33352a;

        private C12849o4(C12636e c12636e) {
            this.f33352a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13311k3 mo2891c(ProductListFragment productListFragment) {
            C11617f.m4590a(productListFragment);
            return new C12858p4(this.f33352a, productListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o5 */
    /* loaded from: classes2.dex */
    public static final class C12850o5 implements InterfaceC13395u1.InterfaceC13396a {

        /* renamed from: a */
        private final C12636e f33353a;

        private C12850o5(C12636e c12636e) {
            this.f33353a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13395u1 mo2891c(SettingsActivity settingsActivity) {
            C11617f.m4590a(settingsActivity);
            return new C12859p5(this.f33353a, settingsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o6 */
    /* loaded from: classes2.dex */
    public static final class C12851o6 implements InterfaceC13289i2.InterfaceC13290a {

        /* renamed from: a */
        private final C12636e f33354a;

        private C12851o6(C12636e c12636e) {
            this.f33354a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13289i2 mo2891c(TakeAwayOrderListActivity takeAwayOrderListActivity) {
            C11617f.m4590a(takeAwayOrderListActivity);
            return new C12860p6(this.f33354a, takeAwayOrderListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$o7 */
    /* loaded from: classes2.dex */
    public static final class C12852o7 implements InterfaceC13381s2.InterfaceC13382a {

        /* renamed from: a */
        private final C12636e f33355a;

        private C12852o7(C12636e c12636e) {
            this.f33355a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13381s2 mo2891c(ValidatePinForUpdatePhoneActivity validatePinForUpdatePhoneActivity) {
            C11617f.m4590a(validatePinForUpdatePhoneActivity);
            return new C12861p7(this.f33355a, validatePinForUpdatePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p */
    /* loaded from: classes2.dex */
    public static final class C12853p implements InterfaceC13243e.InterfaceC13244a {

        /* renamed from: a */
        private final C12636e f33356a;

        private C12853p(C12636e c12636e) {
            this.f33356a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13243e mo2891c(BabyClubUpdateActivity babyClubUpdateActivity) {
            C11617f.m4590a(babyClubUpdateActivity);
            return new C12862q(this.f33356a, babyClubUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p0 */
    /* loaded from: classes2.dex */
    public static final class C12854p0 implements InterfaceC13391u.InterfaceC13392a {

        /* renamed from: a */
        private final C12636e f33357a;

        private C12854p0(C12636e c12636e) {
            this.f33357a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13391u mo2891c(CreatePinActivity createPinActivity) {
            C11617f.m4590a(createPinActivity);
            return new C12863q0(this.f33357a, createPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p1 */
    /* loaded from: classes2.dex */
    public static final class C12855p1 implements InterfaceC13245e0.InterfaceC13246a {

        /* renamed from: a */
        private final C12636e f33358a;

        private C12855p1(C12636e c12636e) {
            this.f33358a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13245e0 mo2891c(ElectronicInvoicePhoneActivity electronicInvoicePhoneActivity) {
            C11617f.m4590a(electronicInvoicePhoneActivity);
            return new C12864q1(this.f33358a, electronicInvoicePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p2 */
    /* loaded from: classes2.dex */
    public static final class C12856p2 implements InterfaceC13345o0 {

        /* renamed from: a */
        private final C12636e f33359a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyActivity> f33360b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33361c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33362d;

        /* renamed from: e */
        private C2134f f33363e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33364f;

        private C12856p2(C12636e c12636e, LoyaltyActivity loyaltyActivity) {
            this.f33359a = c12636e;
            m2317b(loyaltyActivity);
        }

        /* renamed from: b */
        private void m2317b(LoyaltyActivity loyaltyActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyActivity);
            this.f33360b = m4594a;
            this.f33361c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33359a.f32704B2, this.f33359a.f32708C2, this.f33359a.f32712D2));
            this.f33362d = C11613b.m4596a(C5975c.m22544a(this.f33359a.f32703B1));
            C2134f m34601a = C2134f.m34601a(this.f33359a.f32703B1, this.f33359a.f32780U2, this.f33359a.f32771S1, this.f33359a.f32740K2);
            this.f33363e = m34601a;
            this.f33364f = C2135g.m34597c(m34601a);
        }

        /* renamed from: d */
        private LoyaltyActivity m2315d(LoyaltyActivity loyaltyActivity) {
            C11205c.m5751a(loyaltyActivity, this.f33359a.m2750Y());
            C5921e.m22726a(loyaltyActivity, this.f33361c.mo42226get());
            C13872m.m123d(loyaltyActivity, this.f33362d.mo42226get());
            C13872m.m125b(loyaltyActivity, (AuthManager) this.f33359a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyActivity, (AppRatingManager) this.f33359a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyActivity, (InterfaceC3954c) this.f33359a.f32720F2.mo42226get());
            C2130b.m34602a(loyaltyActivity, m2313f());
            return loyaltyActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2314e() {
            return Collections.singletonMap(LoyaltyViewModel.class, (InterfaceC6657b) this.f33364f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2313f() {
            return new ViewModelFactoryByInjection(m2314e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyActivity loyaltyActivity) {
            m2315d(loyaltyActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p3 */
    /* loaded from: classes2.dex */
    public static final class C12857p3 implements InterfaceC13207a1 {

        /* renamed from: a */
        private final C12636e f33365a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingEmailActivity> f33366b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33367c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33368d;

        /* renamed from: e */
        private C10961d f33369e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33370f;

        private C12857p3(C12636e c12636e, OnboardingEmailActivity onboardingEmailActivity) {
            this.f33365a = c12636e;
            m2312b(onboardingEmailActivity);
        }

        /* renamed from: b */
        private void m2312b(OnboardingEmailActivity onboardingEmailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingEmailActivity);
            this.f33366b = m4594a;
            this.f33367c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33365a.f32704B2, this.f33365a.f32708C2, this.f33365a.f32712D2));
            this.f33368d = C11613b.m4596a(C5975c.m22544a(this.f33365a.f32703B1));
            C10961d m6718a = C10961d.m6718a(this.f33365a.f32703B1, this.f33365a.f32835g3, this.f33365a.f32771S1, this.f33365a.f32796Y2, this.f33365a.f32740K2);
            this.f33369e = m6718a;
            this.f33370f = C10962e.m6714c(m6718a);
        }

        /* renamed from: d */
        private OnboardingEmailActivity m2310d(OnboardingEmailActivity onboardingEmailActivity) {
            C11205c.m5751a(onboardingEmailActivity, this.f33365a.m2750Y());
            C5921e.m22726a(onboardingEmailActivity, this.f33367c.mo42226get());
            C13872m.m123d(onboardingEmailActivity, this.f33368d.mo42226get());
            C13872m.m125b(onboardingEmailActivity, (AuthManager) this.f33365a.f32700A2.mo42226get());
            C13872m.m126a(onboardingEmailActivity, (AppRatingManager) this.f33365a.f32716E2.mo42226get());
            C13872m.m124c(onboardingEmailActivity, (InterfaceC3954c) this.f33365a.f32720F2.mo42226get());
            C10959b.m6722a(onboardingEmailActivity, m2308f());
            return onboardingEmailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2309e() {
            return Collections.singletonMap(OnboardingEmailViewModel.class, (InterfaceC6657b) this.f33370f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2308f() {
            return new ViewModelFactoryByInjection(m2309e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingEmailActivity onboardingEmailActivity) {
            m2310d(onboardingEmailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p4 */
    /* loaded from: classes2.dex */
    public static final class C12858p4 implements InterfaceC13311k3 {

        /* renamed from: a */
        private final C12636e f33371a;

        /* renamed from: b */
        private C4880d f33372b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33373c;

        private C12858p4(C12636e c12636e, ProductListFragment productListFragment) {
            this.f33371a = c12636e;
            m2307b(productListFragment);
        }

        /* renamed from: b */
        private void m2307b(ProductListFragment productListFragment) {
            C4880d m26393a = C4880d.m26393a(this.f33371a.f32703B1, this.f33371a.f32756O2, this.f33371a.f32744L2, this.f33371a.f32740K2);
            this.f33372b = m26393a;
            this.f33373c = C4881e.m26389c(m26393a);
        }

        /* renamed from: d */
        private ProductListFragment m2305d(ProductListFragment productListFragment) {
            C11207e.m5748a(productListFragment, this.f33371a.m2750Y());
            C4882f.m26388a(productListFragment, (TransactionCacheManager) this.f33371a.f32724G2.mo42226get());
            C4882f.m26387b(productListFragment, m2303f());
            return productListFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2304e() {
            return Collections.singletonMap(ProductListFragmentViewModel.class, (InterfaceC6657b) this.f33373c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2303f() {
            return new ViewModelFactoryByInjection(m2304e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ProductListFragment productListFragment) {
            m2305d(productListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p5 */
    /* loaded from: classes2.dex */
    public static final class C12859p5 implements InterfaceC13395u1 {

        /* renamed from: a */
        private final C12636e f33374a;

        /* renamed from: b */
        private InterfaceC12341a<SettingsActivity> f33375b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33376c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33377d;

        /* renamed from: e */
        private C7901o f33378e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33379f;

        private C12859p5(C12636e c12636e, SettingsActivity settingsActivity) {
            this.f33374a = c12636e;
            m2302b(settingsActivity);
        }

        /* renamed from: b */
        private void m2302b(SettingsActivity settingsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(settingsActivity);
            this.f33375b = m4594a;
            this.f33376c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33374a.f32704B2, this.f33374a.f32708C2, this.f33374a.f32712D2));
            this.f33377d = C11613b.m4596a(C5975c.m22544a(this.f33374a.f32703B1));
            C7901o m17624a = C7901o.m17624a(this.f33374a.f32703B1, this.f33374a.f32780U2, this.f33374a.f32700A2, this.f33374a.f32909w2, this.f33374a.f32825e3, this.f33374a.f32791X1, this.f33374a.f32768R2, this.f33374a.f32740K2, this.f33374a.f32740K2);
            this.f33378e = m17624a;
            this.f33379f = C7902p.m17620c(m17624a);
        }

        /* renamed from: d */
        private SettingsActivity m2300d(SettingsActivity settingsActivity) {
            C11205c.m5751a(settingsActivity, this.f33374a.m2750Y());
            C5921e.m22726a(settingsActivity, this.f33376c.mo42226get());
            C13872m.m123d(settingsActivity, this.f33377d.mo42226get());
            C13872m.m125b(settingsActivity, (AuthManager) this.f33374a.f32700A2.mo42226get());
            C13872m.m126a(settingsActivity, (AppRatingManager) this.f33374a.f32716E2.mo42226get());
            C13872m.m124c(settingsActivity, (InterfaceC3954c) this.f33374a.f32720F2.mo42226get());
            C7890d.m17625a(settingsActivity, m2298f());
            return settingsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2299e() {
            return Collections.singletonMap(SettingsViewModel.class, (InterfaceC6657b) this.f33379f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2298f() {
            return new ViewModelFactoryByInjection(m2299e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(SettingsActivity settingsActivity) {
            m2300d(settingsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p6 */
    /* loaded from: classes2.dex */
    public static final class C12860p6 implements InterfaceC13289i2 {

        /* renamed from: a */
        private final C12636e f33380a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayOrderListActivity> f33381b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33382c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33383d;

        /* renamed from: e */
        private C11401e f33384e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33385f;

        private C12860p6(C12636e c12636e, TakeAwayOrderListActivity takeAwayOrderListActivity) {
            this.f33380a = c12636e;
            m2297b(takeAwayOrderListActivity);
        }

        /* renamed from: b */
        private void m2297b(TakeAwayOrderListActivity takeAwayOrderListActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayOrderListActivity);
            this.f33381b = m4594a;
            this.f33382c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33380a.f32704B2, this.f33380a.f32708C2, this.f33380a.f32712D2));
            this.f33383d = C11613b.m4596a(C5975c.m22544a(this.f33380a.f32703B1));
            C11401e m5229a = C11401e.m5229a(this.f33380a.f32703B1, this.f33380a.f32865m3, this.f33380a.f32740K2);
            this.f33384e = m5229a;
            this.f33385f = C11402f.m5225c(m5229a);
        }

        /* renamed from: d */
        private TakeAwayOrderListActivity m2295d(TakeAwayOrderListActivity takeAwayOrderListActivity) {
            C11205c.m5751a(takeAwayOrderListActivity, this.f33380a.m2750Y());
            C5921e.m22726a(takeAwayOrderListActivity, this.f33382c.mo42226get());
            C13872m.m123d(takeAwayOrderListActivity, this.f33383d.mo42226get());
            C13872m.m125b(takeAwayOrderListActivity, (AuthManager) this.f33380a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayOrderListActivity, (AppRatingManager) this.f33380a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayOrderListActivity, (InterfaceC3954c) this.f33380a.f32720F2.mo42226get());
            C11398c.m5239a(takeAwayOrderListActivity, m2293f());
            return takeAwayOrderListActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2294e() {
            return Collections.singletonMap(TakeAwayOrderListViewModel.class, (InterfaceC6657b) this.f33385f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2293f() {
            return new ViewModelFactoryByInjection(m2294e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayOrderListActivity takeAwayOrderListActivity) {
            m2295d(takeAwayOrderListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$p7 */
    /* loaded from: classes2.dex */
    public static final class C12861p7 implements InterfaceC13381s2 {

        /* renamed from: a */
        private final C12636e f33386a;

        /* renamed from: b */
        private InterfaceC12341a<ValidatePinForUpdatePhoneActivity> f33387b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33388c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33389d;

        /* renamed from: e */
        private C7502n f33390e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33391f;

        private C12861p7(C12636e c12636e, ValidatePinForUpdatePhoneActivity validatePinForUpdatePhoneActivity) {
            this.f33386a = c12636e;
            m2292b(validatePinForUpdatePhoneActivity);
        }

        /* renamed from: b */
        private void m2292b(ValidatePinForUpdatePhoneActivity validatePinForUpdatePhoneActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(validatePinForUpdatePhoneActivity);
            this.f33387b = m4594a;
            this.f33388c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33386a.f32704B2, this.f33386a.f32708C2, this.f33386a.f32712D2));
            this.f33389d = C11613b.m4596a(C5975c.m22544a(this.f33386a.f32703B1));
            C7502n m18335a = C7502n.m18335a(this.f33386a.f32703B1, this.f33386a.f32700A2, this.f33386a.f32820d3, this.f33386a.f32825e3, this.f33386a.f32711D1, this.f33386a.f32792X2, this.f33386a.f32815c3, this.f33386a.f32771S1, this.f33386a.f32740K2);
            this.f33390e = m18335a;
            this.f33391f = C7503o.m18331c(m18335a);
        }

        /* renamed from: d */
        private ValidatePinForUpdatePhoneActivity m2290d(ValidatePinForUpdatePhoneActivity validatePinForUpdatePhoneActivity) {
            C11205c.m5751a(validatePinForUpdatePhoneActivity, this.f33386a.m2750Y());
            C5921e.m22726a(validatePinForUpdatePhoneActivity, this.f33388c.mo42226get());
            C13872m.m123d(validatePinForUpdatePhoneActivity, this.f33389d.mo42226get());
            C13872m.m125b(validatePinForUpdatePhoneActivity, (AuthManager) this.f33386a.f32700A2.mo42226get());
            C13872m.m126a(validatePinForUpdatePhoneActivity, (AppRatingManager) this.f33386a.f32716E2.mo42226get());
            C13872m.m124c(validatePinForUpdatePhoneActivity, (InterfaceC3954c) this.f33386a.f32720F2.mo42226get());
            C7499l.m18345a(validatePinForUpdatePhoneActivity, m2288f());
            return validatePinForUpdatePhoneActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2289e() {
            return Collections.singletonMap(ValidatePinForUpdatePhoneViewModel.class, (InterfaceC6657b) this.f33391f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2288f() {
            return new ViewModelFactoryByInjection(m2289e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ValidatePinForUpdatePhoneActivity validatePinForUpdatePhoneActivity) {
            m2290d(validatePinForUpdatePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q */
    /* loaded from: classes2.dex */
    public static final class C12862q implements InterfaceC13243e {

        /* renamed from: a */
        private final C12636e f33392a;

        /* renamed from: b */
        private InterfaceC12341a<BabyClubUpdateActivity> f33393b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33394c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33395d;

        /* renamed from: e */
        private C12353b f33396e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33397f;

        private C12862q(C12636e c12636e, BabyClubUpdateActivity babyClubUpdateActivity) {
            this.f33392a = c12636e;
            m2287b(babyClubUpdateActivity);
        }

        /* renamed from: b */
        private void m2287b(BabyClubUpdateActivity babyClubUpdateActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(babyClubUpdateActivity);
            this.f33393b = m4594a;
            this.f33394c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33392a.f32704B2, this.f33392a.f32708C2, this.f33392a.f32712D2));
            this.f33395d = C11613b.m4596a(C5975c.m22544a(this.f33392a.f32703B1));
            C12353b m2987a = C12353b.m2987a(this.f33392a.f32850j3, this.f33392a.f32909w2, this.f33392a.f32771S1, this.f33392a.f32703B1, this.f33392a.f32740K2);
            this.f33396e = m2987a;
            this.f33397f = C12354c.m2984b(m2987a);
        }

        /* renamed from: d */
        private BabyClubUpdateActivity m2285d(BabyClubUpdateActivity babyClubUpdateActivity) {
            C11205c.m5751a(babyClubUpdateActivity, this.f33392a.m2750Y());
            C5921e.m22726a(babyClubUpdateActivity, this.f33394c.mo42226get());
            C13872m.m123d(babyClubUpdateActivity, this.f33395d.mo42226get());
            C13872m.m125b(babyClubUpdateActivity, (AuthManager) this.f33392a.f32700A2.mo42226get());
            C13872m.m126a(babyClubUpdateActivity, (AppRatingManager) this.f33392a.f32716E2.mo42226get());
            C13872m.m124c(babyClubUpdateActivity, (InterfaceC3954c) this.f33392a.f32720F2.mo42226get());
            C6168m.m22016a(babyClubUpdateActivity, m2283f());
            return babyClubUpdateActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2284e() {
            return Collections.singletonMap(BabyClubUpdateViewModel.class, (InterfaceC6657b) this.f33397f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2283f() {
            return new ViewModelFactoryByInjection(m2284e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BabyClubUpdateActivity babyClubUpdateActivity) {
            m2285d(babyClubUpdateActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q0 */
    /* loaded from: classes2.dex */
    public static final class C12863q0 implements InterfaceC13391u {

        /* renamed from: a */
        private final C12636e f33398a;

        /* renamed from: b */
        private InterfaceC12341a<CreatePinActivity> f33399b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33400c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33401d;

        /* renamed from: e */
        private C0204d f33402e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33403f;

        private C12863q0(C12636e c12636e, CreatePinActivity createPinActivity) {
            this.f33398a = c12636e;
            m2282b(createPinActivity);
        }

        /* renamed from: b */
        private void m2282b(CreatePinActivity createPinActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(createPinActivity);
            this.f33399b = m4594a;
            this.f33400c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33398a.f32704B2, this.f33398a.f32708C2, this.f33398a.f32712D2));
            this.f33401d = C11613b.m4596a(C5975c.m22544a(this.f33398a.f32703B1));
            C0204d m41583a = C0204d.m41583a(this.f33398a.f32703B1, this.f33398a.f32700A2, this.f33398a.f32820d3, this.f33398a.f32825e3, this.f33398a.f32815c3, this.f33398a.f32711D1, this.f33398a.f32771S1, this.f33398a.f32740K2, this.f33398a.f32740K2);
            this.f33402e = m41583a;
            this.f33403f = C0205e.m41579c(m41583a);
        }

        /* renamed from: d */
        private CreatePinActivity m2280d(CreatePinActivity createPinActivity) {
            C11205c.m5751a(createPinActivity, this.f33398a.m2750Y());
            C5921e.m22726a(createPinActivity, this.f33400c.mo42226get());
            C13872m.m123d(createPinActivity, this.f33401d.mo42226get());
            C13872m.m125b(createPinActivity, (AuthManager) this.f33398a.f32700A2.mo42226get());
            C13872m.m126a(createPinActivity, (AppRatingManager) this.f33398a.f32716E2.mo42226get());
            C13872m.m124c(createPinActivity, (InterfaceC3954c) this.f33398a.f32720F2.mo42226get());
            C0202b.m41588a(createPinActivity, m2278f());
            return createPinActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2279e() {
            return Collections.singletonMap(CreatePinViewModel.class, (InterfaceC6657b) this.f33403f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2278f() {
            return new ViewModelFactoryByInjection(m2279e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(CreatePinActivity createPinActivity) {
            m2280d(createPinActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q1 */
    /* loaded from: classes2.dex */
    public static final class C12864q1 implements InterfaceC13245e0 {

        /* renamed from: a */
        private final C12636e f33404a;

        /* renamed from: b */
        private InterfaceC12341a<ElectronicInvoicePhoneActivity> f33405b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33406c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33407d;

        /* renamed from: e */
        private C9905d f33408e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33409f;

        private C12864q1(C12636e c12636e, ElectronicInvoicePhoneActivity electronicInvoicePhoneActivity) {
            this.f33404a = c12636e;
            m2277b(electronicInvoicePhoneActivity);
        }

        /* renamed from: b */
        private void m2277b(ElectronicInvoicePhoneActivity electronicInvoicePhoneActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(electronicInvoicePhoneActivity);
            this.f33405b = m4594a;
            this.f33406c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33404a.f32704B2, this.f33404a.f32708C2, this.f33404a.f32712D2));
            this.f33407d = C11613b.m4596a(C5975c.m22544a(this.f33404a.f32703B1));
            C9905d m9732a = C9905d.m9732a(this.f33404a.f32703B1, this.f33404a.f32780U2, this.f33404a.f32771S1, this.f33404a.f32740K2);
            this.f33408e = m9732a;
            this.f33409f = C9906e.m9728c(m9732a);
        }

        /* renamed from: d */
        private ElectronicInvoicePhoneActivity m2275d(ElectronicInvoicePhoneActivity electronicInvoicePhoneActivity) {
            C11205c.m5751a(electronicInvoicePhoneActivity, this.f33404a.m2750Y());
            C5921e.m22726a(electronicInvoicePhoneActivity, this.f33406c.mo42226get());
            C13872m.m123d(electronicInvoicePhoneActivity, this.f33407d.mo42226get());
            C13872m.m125b(electronicInvoicePhoneActivity, (AuthManager) this.f33404a.f32700A2.mo42226get());
            C13872m.m126a(electronicInvoicePhoneActivity, (AppRatingManager) this.f33404a.f32716E2.mo42226get());
            C13872m.m124c(electronicInvoicePhoneActivity, (InterfaceC3954c) this.f33404a.f32720F2.mo42226get());
            C9900b.m9736a(electronicInvoicePhoneActivity, m2273f());
            return electronicInvoicePhoneActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2274e() {
            return Collections.singletonMap(ElectronicInvoicePhoneViewModel.class, (InterfaceC6657b) this.f33409f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2273f() {
            return new ViewModelFactoryByInjection(m2274e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ElectronicInvoicePhoneActivity electronicInvoicePhoneActivity) {
            m2275d(electronicInvoicePhoneActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q2 */
    /* loaded from: classes2.dex */
    public static final class C12865q2 implements InterfaceC13353p0.InterfaceC13354a {

        /* renamed from: a */
        private final C12636e f33410a;

        private C12865q2(C12636e c12636e) {
            this.f33410a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13353p0 mo2891c(LoyaltyCardActivity loyaltyCardActivity) {
            C11617f.m4590a(loyaltyCardActivity);
            return new C12874r2(this.f33410a, loyaltyCardActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q3 */
    /* loaded from: classes2.dex */
    public static final class C12866q3 implements InterfaceC13217b1.InterfaceC13218a {

        /* renamed from: a */
        private final C12636e f33411a;

        private C12866q3(C12636e c12636e) {
            this.f33411a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13217b1 mo2891c(OnboardingEmailSentActivity onboardingEmailSentActivity) {
            C11617f.m4590a(onboardingEmailSentActivity);
            return new C12875r3(this.f33411a, onboardingEmailSentActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q4 */
    /* loaded from: classes2.dex */
    public static final class C12867q4 implements InterfaceC13317l1.InterfaceC13318a {

        /* renamed from: a */
        private final C12636e f33412a;

        private C12867q4(C12636e c12636e) {
            this.f33412a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13317l1 mo2891c(ProfileActivity profileActivity) {
            C11617f.m4590a(profileActivity);
            return new C12876r4(this.f33412a, profileActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q5 */
    /* loaded from: classes2.dex */
    public static final class C12868q5 implements InterfaceC13403v1.InterfaceC13404a {

        /* renamed from: a */
        private final C12636e f33413a;

        private C12868q5(C12636e c12636e) {
            this.f33413a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13403v1 mo2891c(SharedWithActivity sharedWithActivity) {
            C11617f.m4590a(sharedWithActivity);
            return new C12877r5(this.f33413a, sharedWithActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q6 */
    /* loaded from: classes2.dex */
    public static final class C12869q6 implements InterfaceC13291i3.InterfaceC13292a {

        /* renamed from: a */
        private final C12636e f33414a;

        private C12869q6(C12636e c12636e) {
            this.f33414a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13291i3 mo2891c(TakeAwayProductListFragment takeAwayProductListFragment) {
            C11617f.m4590a(takeAwayProductListFragment);
            return new C12878r6(this.f33414a, takeAwayProductListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$q7 */
    /* loaded from: classes2.dex */
    public static final class C12870q7 implements InterfaceC13389t2.InterfaceC13390a {

        /* renamed from: a */
        private final C12636e f33415a;

        private C12870q7(C12636e c12636e) {
            this.f33415a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13389t2 mo2891c(VersionControlActivity versionControlActivity) {
            C11617f.m4590a(versionControlActivity);
            return new C12879r7(this.f33415a, versionControlActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r */
    /* loaded from: classes2.dex */
    public static final class C12871r implements InterfaceC13263g.InterfaceC13264a {

        /* renamed from: a */
        private final C12636e f33416a;

        private C12871r(C12636e c12636e) {
            this.f33416a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13263g mo2891c(BabyClubWelcomeActivity babyClubWelcomeActivity) {
            C11617f.m4590a(babyClubWelcomeActivity);
            return new C12880s(this.f33416a, babyClubWelcomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r0 */
    /* loaded from: classes2.dex */
    public static final class C12872r0 implements InterfaceC13399v.InterfaceC13400a {

        /* renamed from: a */
        private final C12636e f33417a;

        private C12872r0(C12636e c12636e) {
            this.f33417a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13399v mo2891c(DebugActivity debugActivity) {
            C11617f.m4590a(debugActivity);
            return new C12881s0(this.f33417a, debugActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r1 */
    /* loaded from: classes2.dex */
    public static final class C12873r1 implements InterfaceC13255f0.InterfaceC13256a {

        /* renamed from: a */
        private final C12636e f33418a;

        private C12873r1(C12636e c12636e) {
            this.f33418a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13255f0 mo2891c(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
            C11617f.m4590a(electronicInvoiceStatusActivity);
            return new C12882s1(this.f33418a, electronicInvoiceStatusActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r2 */
    /* loaded from: classes2.dex */
    public static final class C12874r2 implements InterfaceC13353p0 {

        /* renamed from: a */
        private final C12636e f33419a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyCardActivity> f33420b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33421c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33422d;

        /* renamed from: e */
        private C10911f f33423e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33424f;

        private C12874r2(C12636e c12636e, LoyaltyCardActivity loyaltyCardActivity) {
            this.f33419a = c12636e;
            m2263b(loyaltyCardActivity);
        }

        /* renamed from: b */
        private void m2263b(LoyaltyCardActivity loyaltyCardActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyCardActivity);
            this.f33420b = m4594a;
            this.f33421c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33419a.f32704B2, this.f33419a.f32708C2, this.f33419a.f32712D2));
            this.f33422d = C11613b.m4596a(C5975c.m22544a(this.f33419a.f32703B1));
            C10911f m6756a = C10911f.m6756a(this.f33419a.f32703B1, C5584e.m23704a(), this.f33419a.f32780U2, this.f33419a.f32740K2);
            this.f33423e = m6756a;
            this.f33424f = C10912g.m6752c(m6756a);
        }

        /* renamed from: d */
        private LoyaltyCardActivity m2261d(LoyaltyCardActivity loyaltyCardActivity) {
            C11205c.m5751a(loyaltyCardActivity, this.f33419a.m2750Y());
            C5921e.m22726a(loyaltyCardActivity, this.f33421c.mo42226get());
            C13872m.m123d(loyaltyCardActivity, this.f33422d.mo42226get());
            C13872m.m125b(loyaltyCardActivity, (AuthManager) this.f33419a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyCardActivity, (AppRatingManager) this.f33419a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyCardActivity, (InterfaceC3954c) this.f33419a.f32720F2.mo42226get());
            C10899c.m6781a(loyaltyCardActivity, m2259f());
            return loyaltyCardActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2260e() {
            return Collections.singletonMap(LoyaltyCardViewModel.class, (InterfaceC6657b) this.f33424f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2259f() {
            return new ViewModelFactoryByInjection(m2260e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyCardActivity loyaltyCardActivity) {
            m2261d(loyaltyCardActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r3 */
    /* loaded from: classes2.dex */
    public static final class C12875r3 implements InterfaceC13217b1 {

        /* renamed from: a */
        private final C12636e f33425a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingEmailSentActivity> f33426b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33427c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33428d;

        /* renamed from: e */
        private C11395g f33429e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33430f;

        private C12875r3(C12636e c12636e, OnboardingEmailSentActivity onboardingEmailSentActivity) {
            this.f33425a = c12636e;
            m2258b(onboardingEmailSentActivity);
        }

        /* renamed from: b */
        private void m2258b(OnboardingEmailSentActivity onboardingEmailSentActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingEmailSentActivity);
            this.f33426b = m4594a;
            this.f33427c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33425a.f32704B2, this.f33425a.f32708C2, this.f33425a.f32712D2));
            this.f33428d = C11613b.m4596a(C5975c.m22544a(this.f33425a.f32703B1));
            C11395g m5245a = C11395g.m5245a(this.f33425a.f32703B1, this.f33425a.f32771S1, this.f33425a.f32835g3, this.f33425a.f32796Y2, this.f33425a.f32740K2);
            this.f33429e = m5245a;
            this.f33430f = C11396h.m5241c(m5245a);
        }

        /* renamed from: d */
        private OnboardingEmailSentActivity m2256d(OnboardingEmailSentActivity onboardingEmailSentActivity) {
            C11205c.m5751a(onboardingEmailSentActivity, this.f33425a.m2750Y());
            C5921e.m22726a(onboardingEmailSentActivity, this.f33427c.mo42226get());
            C13872m.m123d(onboardingEmailSentActivity, this.f33428d.mo42226get());
            C13872m.m125b(onboardingEmailSentActivity, (AuthManager) this.f33425a.f32700A2.mo42226get());
            C13872m.m126a(onboardingEmailSentActivity, (AppRatingManager) this.f33425a.f32716E2.mo42226get());
            C13872m.m124c(onboardingEmailSentActivity, (InterfaceC3954c) this.f33425a.f32720F2.mo42226get());
            C11381b.m5280a(onboardingEmailSentActivity, m2254f());
            return onboardingEmailSentActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2255e() {
            return Collections.singletonMap(OnboardingEmailSentViewModel.class, (InterfaceC6657b) this.f33430f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2254f() {
            return new ViewModelFactoryByInjection(m2255e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingEmailSentActivity onboardingEmailSentActivity) {
            m2256d(onboardingEmailSentActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r4 */
    /* loaded from: classes2.dex */
    public static final class C12876r4 implements InterfaceC13317l1 {

        /* renamed from: a */
        private final C12636e f33431a;

        /* renamed from: b */
        private InterfaceC12341a<ProfileActivity> f33432b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33433c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33434d;

        /* renamed from: e */
        private C6472o f33435e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33436f;

        private C12876r4(C12636e c12636e, ProfileActivity profileActivity) {
            this.f33431a = c12636e;
            m2253b(profileActivity);
        }

        /* renamed from: b */
        private void m2253b(ProfileActivity profileActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(profileActivity);
            this.f33432b = m4594a;
            this.f33433c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33431a.f32704B2, this.f33431a.f32708C2, this.f33431a.f32712D2));
            this.f33434d = C11613b.m4596a(C5975c.m22544a(this.f33431a.f32703B1));
            C6472o m20845a = C6472o.m20845a(this.f33431a.f32703B1, this.f33431a.f32740K2, this.f33431a.f32780U2, this.f33431a.f32740K2);
            this.f33435e = m20845a;
            this.f33436f = C6473p.m20841c(m20845a);
        }

        /* renamed from: d */
        private ProfileActivity m2251d(ProfileActivity profileActivity) {
            C11205c.m5751a(profileActivity, this.f33431a.m2750Y());
            C5921e.m22726a(profileActivity, this.f33433c.mo42226get());
            C13872m.m123d(profileActivity, this.f33434d.mo42226get());
            C13872m.m125b(profileActivity, (AuthManager) this.f33431a.f32700A2.mo42226get());
            C13872m.m126a(profileActivity, (AppRatingManager) this.f33431a.f32716E2.mo42226get());
            C13872m.m124c(profileActivity, (InterfaceC3954c) this.f33431a.f32720F2.mo42226get());
            C6465h.m20846a(profileActivity, m2249f());
            return profileActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2250e() {
            return Collections.singletonMap(ProfileViewModel.class, (InterfaceC6657b) this.f33436f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2249f() {
            return new ViewModelFactoryByInjection(m2250e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ProfileActivity profileActivity) {
            m2251d(profileActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r5 */
    /* loaded from: classes2.dex */
    public static final class C12877r5 implements InterfaceC13403v1 {

        /* renamed from: a */
        private final C12636e f33437a;

        /* renamed from: b */
        private InterfaceC12341a<SharedWithActivity> f33438b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33439c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33440d;

        /* renamed from: e */
        private C7944j f33441e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33442f;

        private C12877r5(C12636e c12636e, SharedWithActivity sharedWithActivity) {
            this.f33437a = c12636e;
            m2248b(sharedWithActivity);
        }

        /* renamed from: b */
        private void m2248b(SharedWithActivity sharedWithActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(sharedWithActivity);
            this.f33438b = m4594a;
            this.f33439c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33437a.f32704B2, this.f33437a.f32708C2, this.f33437a.f32712D2));
            this.f33440d = C11613b.m4596a(C5975c.m22544a(this.f33437a.f32703B1));
            C7944j m17497a = C7944j.m17497a(this.f33437a.f32703B1, this.f33437a.f32756O2, this.f33437a.f32768R2, this.f33437a.f32740K2);
            this.f33441e = m17497a;
            this.f33442f = C7945k.m17493c(m17497a);
        }

        /* renamed from: d */
        private SharedWithActivity m2246d(SharedWithActivity sharedWithActivity) {
            C11205c.m5751a(sharedWithActivity, this.f33437a.m2750Y());
            C5921e.m22726a(sharedWithActivity, this.f33439c.mo42226get());
            C13872m.m123d(sharedWithActivity, this.f33440d.mo42226get());
            C13872m.m125b(sharedWithActivity, (AuthManager) this.f33437a.f32700A2.mo42226get());
            C13872m.m126a(sharedWithActivity, (AppRatingManager) this.f33437a.f32716E2.mo42226get());
            C13872m.m124c(sharedWithActivity, (InterfaceC3954c) this.f33437a.f32720F2.mo42226get());
            C7937f.m17517a(sharedWithActivity, m2244f());
            return sharedWithActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2245e() {
            return Collections.singletonMap(SharedWithViewModel.class, (InterfaceC6657b) this.f33442f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2244f() {
            return new ViewModelFactoryByInjection(m2245e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(SharedWithActivity sharedWithActivity) {
            m2246d(sharedWithActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r6 */
    /* loaded from: classes2.dex */
    public static final class C12878r6 implements InterfaceC13291i3 {

        /* renamed from: a */
        private final C12636e f33443a;

        /* renamed from: b */
        private C0223g f33444b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33445c;

        private C12878r6(C12636e c12636e, TakeAwayProductListFragment takeAwayProductListFragment) {
            this.f33443a = c12636e;
            m2243b(takeAwayProductListFragment);
        }

        /* renamed from: b */
        private void m2243b(TakeAwayProductListFragment takeAwayProductListFragment) {
            C0223g m41521a = C0223g.m41521a(this.f33443a.f32703B1, this.f33443a.f32771S1, this.f33443a.f32865m3, this.f33443a.f32740K2);
            this.f33444b = m41521a;
            this.f33445c = C0224h.m41517c(m41521a);
        }

        /* renamed from: d */
        private TakeAwayProductListFragment m2241d(TakeAwayProductListFragment takeAwayProductListFragment) {
            C11207e.m5748a(takeAwayProductListFragment, this.f33443a.m2750Y());
            C0225i.m41516a(takeAwayProductListFragment, m2239f());
            return takeAwayProductListFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2240e() {
            return Collections.singletonMap(TakeAwayProductListFragmentViewModel.class, (InterfaceC6657b) this.f33445c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2239f() {
            return new ViewModelFactoryByInjection(m2240e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayProductListFragment takeAwayProductListFragment) {
            m2241d(takeAwayProductListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$r7 */
    /* loaded from: classes2.dex */
    public static final class C12879r7 implements InterfaceC13389t2 {

        /* renamed from: a */
        private final C12636e f33446a;

        /* renamed from: b */
        private InterfaceC12341a<VersionControlActivity> f33447b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33448c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33449d;

        /* renamed from: e */
        private C8094f f33450e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33451f;

        private C12879r7(C12636e c12636e, VersionControlActivity versionControlActivity) {
            this.f33446a = c12636e;
            m2238b(versionControlActivity);
        }

        /* renamed from: b */
        private void m2238b(VersionControlActivity versionControlActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(versionControlActivity);
            this.f33447b = m4594a;
            this.f33448c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33446a.f32704B2, this.f33446a.f32708C2, this.f33446a.f32712D2));
            this.f33449d = C11613b.m4596a(C5975c.m22544a(this.f33446a.f32703B1));
            C8094f m16916a = C8094f.m16916a(this.f33446a.f32703B1, this.f33446a.f32740K2);
            this.f33450e = m16916a;
            this.f33451f = C8095g.m16912c(m16916a);
        }

        /* renamed from: d */
        private VersionControlActivity m2236d(VersionControlActivity versionControlActivity) {
            C11205c.m5751a(versionControlActivity, this.f33446a.m2750Y());
            C5921e.m22726a(versionControlActivity, this.f33448c.mo42226get());
            C13872m.m123d(versionControlActivity, this.f33449d.mo42226get());
            C13872m.m125b(versionControlActivity, (AuthManager) this.f33446a.f32700A2.mo42226get());
            C13872m.m126a(versionControlActivity, (AppRatingManager) this.f33446a.f32716E2.mo42226get());
            C13872m.m124c(versionControlActivity, (InterfaceC3954c) this.f33446a.f32720F2.mo42226get());
            C8093d.m16917a(versionControlActivity, m2234f());
            return versionControlActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2235e() {
            return Collections.singletonMap(VersionControlViewModel.class, (InterfaceC6657b) this.f33451f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2234f() {
            return new ViewModelFactoryByInjection(m2235e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(VersionControlActivity versionControlActivity) {
            m2236d(versionControlActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s */
    /* loaded from: classes2.dex */
    public static final class C12880s implements InterfaceC13263g {

        /* renamed from: a */
        private final C12636e f33452a;

        /* renamed from: b */
        private InterfaceC12341a<BabyClubWelcomeActivity> f33453b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33454c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33455d;

        /* renamed from: e */
        private C6181x f33456e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33457f;

        private C12880s(C12636e c12636e, BabyClubWelcomeActivity babyClubWelcomeActivity) {
            this.f33452a = c12636e;
            m2233b(babyClubWelcomeActivity);
        }

        /* renamed from: b */
        private void m2233b(BabyClubWelcomeActivity babyClubWelcomeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(babyClubWelcomeActivity);
            this.f33453b = m4594a;
            this.f33454c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33452a.f32704B2, this.f33452a.f32708C2, this.f33452a.f32712D2));
            this.f33455d = C11613b.m4596a(C5975c.m22544a(this.f33452a.f32703B1));
            C6181x m21975a = C6181x.m21975a(this.f33452a.f32703B1, this.f33452a.f32850j3, this.f33452a.f32771S1, this.f33452a.f32740K2);
            this.f33456e = m21975a;
            this.f33457f = C6182y.m21971c(m21975a);
        }

        /* renamed from: d */
        private BabyClubWelcomeActivity m2231d(BabyClubWelcomeActivity babyClubWelcomeActivity) {
            C11205c.m5751a(babyClubWelcomeActivity, this.f33452a.m2750Y());
            C5921e.m22726a(babyClubWelcomeActivity, this.f33454c.mo42226get());
            C13872m.m123d(babyClubWelcomeActivity, this.f33455d.mo42226get());
            C13872m.m125b(babyClubWelcomeActivity, (AuthManager) this.f33452a.f32700A2.mo42226get());
            C13872m.m126a(babyClubWelcomeActivity, (AppRatingManager) this.f33452a.f32716E2.mo42226get());
            C13872m.m124c(babyClubWelcomeActivity, (InterfaceC3954c) this.f33452a.f32720F2.mo42226get());
            C6176t.m21985a(babyClubWelcomeActivity, m2229f());
            return babyClubWelcomeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2230e() {
            return Collections.singletonMap(BabyClubWelcomeViewModel.class, (InterfaceC6657b) this.f33457f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2229f() {
            return new ViewModelFactoryByInjection(m2230e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BabyClubWelcomeActivity babyClubWelcomeActivity) {
            m2231d(babyClubWelcomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s0 */
    /* loaded from: classes2.dex */
    public static final class C12881s0 implements InterfaceC13399v {

        /* renamed from: a */
        private final C12636e f33458a;

        /* renamed from: b */
        private InterfaceC12341a<DebugActivity> f33459b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33460c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33461d;

        /* renamed from: e */
        private C9755c f33462e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33463f;

        private C12881s0(C12636e c12636e, DebugActivity debugActivity) {
            this.f33458a = c12636e;
            m2228b(debugActivity);
        }

        /* renamed from: b */
        private void m2228b(DebugActivity debugActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(debugActivity);
            this.f33459b = m4594a;
            this.f33460c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33458a.f32704B2, this.f33458a.f32708C2, this.f33458a.f32712D2));
            this.f33461d = C11613b.m4596a(C5975c.m22544a(this.f33458a.f32703B1));
            C9755c m10014a = C9755c.m10014a(this.f33458a.f32703B1, this.f33458a.f32711D1, this.f33458a.f32740K2, this.f33458a.f32904v1, this.f33458a.f32780U2, this.f33458a.f32768R2, this.f33458a.f32736J2, this.f33458a.f32740K2);
            this.f33462e = m10014a;
            this.f33463f = C9756d.m10010c(m10014a);
        }

        /* renamed from: d */
        private DebugActivity m2226d(DebugActivity debugActivity) {
            C11205c.m5751a(debugActivity, this.f33458a.m2750Y());
            C5921e.m22726a(debugActivity, this.f33460c.mo42226get());
            C13872m.m123d(debugActivity, this.f33461d.mo42226get());
            C13872m.m125b(debugActivity, (AuthManager) this.f33458a.f32700A2.mo42226get());
            C13872m.m126a(debugActivity, (AppRatingManager) this.f33458a.f32716E2.mo42226get());
            C13872m.m124c(debugActivity, (InterfaceC3954c) this.f33458a.f32720F2.mo42226get());
            C13805p.m158a(debugActivity, m2224f());
            return debugActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2225e() {
            return Collections.singletonMap(DebugViewModel.class, (InterfaceC6657b) this.f33463f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2224f() {
            return new ViewModelFactoryByInjection(m2225e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DebugActivity debugActivity) {
            m2226d(debugActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s1 */
    /* loaded from: classes2.dex */
    public static final class C12882s1 implements InterfaceC13255f0 {

        /* renamed from: a */
        private final C12636e f33464a;

        /* renamed from: b */
        private InterfaceC12341a<ElectronicInvoiceStatusActivity> f33465b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33466c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33467d;

        /* renamed from: e */
        private C10218g f33468e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33469f;

        private C12882s1(C12636e c12636e, ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
            this.f33464a = c12636e;
            m2223b(electronicInvoiceStatusActivity);
        }

        /* renamed from: b */
        private void m2223b(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(electronicInvoiceStatusActivity);
            this.f33465b = m4594a;
            this.f33466c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33464a.f32704B2, this.f33464a.f32708C2, this.f33464a.f32712D2));
            this.f33467d = C11613b.m4596a(C5975c.m22544a(this.f33464a.f32703B1));
            C10218g m8484a = C10218g.m8484a(this.f33464a.f32703B1, this.f33464a.f32780U2, this.f33464a.f32740K2);
            this.f33468e = m8484a;
            this.f33469f = C10219h.m8480c(m8484a);
        }

        /* renamed from: d */
        private ElectronicInvoiceStatusActivity m2221d(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
            C11205c.m5751a(electronicInvoiceStatusActivity, this.f33464a.m2750Y());
            C5921e.m22726a(electronicInvoiceStatusActivity, this.f33466c.mo42226get());
            C13872m.m123d(electronicInvoiceStatusActivity, this.f33467d.mo42226get());
            C13872m.m125b(electronicInvoiceStatusActivity, (AuthManager) this.f33464a.f32700A2.mo42226get());
            C13872m.m126a(electronicInvoiceStatusActivity, (AppRatingManager) this.f33464a.f32716E2.mo42226get());
            C13872m.m124c(electronicInvoiceStatusActivity, (InterfaceC3954c) this.f33464a.f32720F2.mo42226get());
            C10210d.m8501a(electronicInvoiceStatusActivity, m2219f());
            return electronicInvoiceStatusActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2220e() {
            return Collections.singletonMap(ElectronicInvoiceStatusViewModel.class, (InterfaceC6657b) this.f33469f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2219f() {
            return new ViewModelFactoryByInjection(m2220e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ElectronicInvoiceStatusActivity electronicInvoiceStatusActivity) {
            m2221d(electronicInvoiceStatusActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s2 */
    /* loaded from: classes2.dex */
    public static final class C12883s2 implements InterfaceC13361q0.InterfaceC13362a {

        /* renamed from: a */
        private final C12636e f33470a;

        private C12883s2(C12636e c12636e) {
            this.f33470a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13361q0 mo2891c(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
            C11617f.m4590a(loyaltyCardInvitesActivity);
            return new C12892t2(this.f33470a, loyaltyCardInvitesActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s3 */
    /* loaded from: classes2.dex */
    public static final class C12884s3 implements InterfaceC13227c1.InterfaceC13228a {

        /* renamed from: a */
        private final C12636e f33471a;

        private C12884s3(C12636e c12636e) {
            this.f33471a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13227c1 mo2891c(OnboardingMyPdActivity onboardingMyPdActivity) {
            C11617f.m4590a(onboardingMyPdActivity);
            return new C12893t3(this.f33471a, onboardingMyPdActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s4 */
    /* loaded from: classes2.dex */
    public static final class C12885s4 implements InterfaceC13327m1.InterfaceC13328a {

        /* renamed from: a */
        private final C12636e f33472a;

        private C12885s4(C12636e c12636e) {
            this.f33472a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13327m1 mo2891c(PromotionActivity promotionActivity) {
            C11617f.m4590a(promotionActivity);
            return new C12894t4(this.f33472a, promotionActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s5 */
    /* loaded from: classes2.dex */
    public static final class C12886s5 implements InterfaceC13411w1.InterfaceC13412a {

        /* renamed from: a */
        private final C12636e f33473a;

        private C12886s5(C12636e c12636e) {
            this.f33473a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13411w1 mo2891c(ShoppingListActivity shoppingListActivity) {
            C11617f.m4590a(shoppingListActivity);
            return new C12895t5(this.f33473a, shoppingListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s6 */
    /* loaded from: classes2.dex */
    public static final class C12887s6 implements InterfaceC13259f2.InterfaceC13260a {

        /* renamed from: a */
        private final C12636e f33474a;

        private C12887s6(C12636e c12636e) {
            this.f33474a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13259f2 mo2891c(TakeAwayProductsActivity takeAwayProductsActivity) {
            C11617f.m4590a(takeAwayProductsActivity);
            return new C12896t6(this.f33474a, takeAwayProductsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$s7 */
    /* loaded from: classes2.dex */
    public static final class C12888s7 implements InterfaceC13397u2.InterfaceC13398a {

        /* renamed from: a */
        private final C12636e f33475a;

        private C12888s7(C12636e c12636e) {
            this.f33475a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13397u2 mo2891c(VirtualCardDataConfirmationActivity virtualCardDataConfirmationActivity) {
            C11617f.m4590a(virtualCardDataConfirmationActivity);
            return new C12897t7(this.f33475a, virtualCardDataConfirmationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t */
    /* loaded from: classes2.dex */
    public static final class C12889t implements InterfaceC13273h.InterfaceC13274a {

        /* renamed from: a */
        private final C12636e f33476a;

        private C12889t(C12636e c12636e) {
            this.f33476a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13273h mo2891c(BannerDetailActivity bannerDetailActivity) {
            C11617f.m4590a(bannerDetailActivity);
            return new C12898u(this.f33476a, bannerDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t0 */
    /* loaded from: classes2.dex */
    public static final class C12890t0 implements InterfaceC13435z1.InterfaceC13436a {

        /* renamed from: a */
        private final C12636e f33477a;

        private C12890t0(C12636e c12636e) {
            this.f33477a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13435z1 mo2891c(DefaultStoreActivity defaultStoreActivity) {
            C11617f.m4590a(defaultStoreActivity);
            return new C12899u0(this.f33477a, defaultStoreActivity);
        }
    }

    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t1 */
    /* loaded from: classes2.dex */
    private static final class C12891t1 implements InterfaceC12355a.InterfaceC12356a {
        private C12891t1() {
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: a */
        public InterfaceC12355a mo2891c(PingoDoceApp pingoDoceApp) {
            C11617f.m4590a(pingoDoceApp);
            return new C12636e(pingoDoceApp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t2 */
    /* loaded from: classes2.dex */
    public static final class C12892t2 implements InterfaceC13361q0 {

        /* renamed from: a */
        private final C12636e f33478a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyCardInvitesActivity> f33479b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33480c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33481d;

        /* renamed from: e */
        private C12163g f33482e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33483f;

        private C12892t2(C12636e c12636e, LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
            this.f33478a = c12636e;
            m2209b(loyaltyCardInvitesActivity);
        }

        /* renamed from: b */
        private void m2209b(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyCardInvitesActivity);
            this.f33479b = m4594a;
            this.f33480c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33478a.f32704B2, this.f33478a.f32708C2, this.f33478a.f32712D2));
            this.f33481d = C11613b.m4596a(C5975c.m22544a(this.f33478a.f32703B1));
            C12163g m3506a = C12163g.m3506a(this.f33478a.f32703B1, this.f33478a.f32780U2, this.f33478a.f32791X1, this.f33478a.f32768R2, this.f33478a.f32740K2);
            this.f33482e = m3506a;
            this.f33483f = C12164h.m3502c(m3506a);
        }

        /* renamed from: d */
        private LoyaltyCardInvitesActivity m2207d(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
            C11205c.m5751a(loyaltyCardInvitesActivity, this.f33478a.m2750Y());
            C5921e.m22726a(loyaltyCardInvitesActivity, this.f33480c.mo42226get());
            C13872m.m123d(loyaltyCardInvitesActivity, this.f33481d.mo42226get());
            C13872m.m125b(loyaltyCardInvitesActivity, (AuthManager) this.f33478a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyCardInvitesActivity, (AppRatingManager) this.f33478a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyCardInvitesActivity, (InterfaceC3954c) this.f33478a.f32720F2.mo42226get());
            C12158e.m3526a(loyaltyCardInvitesActivity, m2205f());
            return loyaltyCardInvitesActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2206e() {
            return Collections.singletonMap(LoyaltyCardInvitesViewModel.class, (InterfaceC6657b) this.f33483f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2205f() {
            return new ViewModelFactoryByInjection(m2206e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyCardInvitesActivity loyaltyCardInvitesActivity) {
            m2207d(loyaltyCardInvitesActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t3 */
    /* loaded from: classes2.dex */
    public static final class C12893t3 implements InterfaceC13227c1 {

        /* renamed from: a */
        private final C12636e f33484a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingMyPdActivity> f33485b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33486c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33487d;

        /* renamed from: e */
        private C13010d f33488e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33489f;

        private C12893t3(C12636e c12636e, OnboardingMyPdActivity onboardingMyPdActivity) {
            this.f33484a = c12636e;
            m2204b(onboardingMyPdActivity);
        }

        /* renamed from: b */
        private void m2204b(OnboardingMyPdActivity onboardingMyPdActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingMyPdActivity);
            this.f33485b = m4594a;
            this.f33486c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33484a.f32704B2, this.f33484a.f32708C2, this.f33484a.f32712D2));
            this.f33487d = C11613b.m4596a(C5975c.m22544a(this.f33484a.f32703B1));
            C13010d m1928a = C13010d.m1928a(this.f33484a.f32703B1, this.f33484a.f32909w2, this.f33484a.f32740K2);
            this.f33488e = m1928a;
            this.f33489f = C13011e.m1925b(m1928a);
        }

        /* renamed from: d */
        private OnboardingMyPdActivity m2202d(OnboardingMyPdActivity onboardingMyPdActivity) {
            C11205c.m5751a(onboardingMyPdActivity, this.f33484a.m2750Y());
            C5921e.m22726a(onboardingMyPdActivity, this.f33486c.mo42226get());
            C13872m.m123d(onboardingMyPdActivity, this.f33487d.mo42226get());
            C13872m.m125b(onboardingMyPdActivity, (AuthManager) this.f33484a.f32700A2.mo42226get());
            C13872m.m126a(onboardingMyPdActivity, (AppRatingManager) this.f33484a.f32716E2.mo42226get());
            C13872m.m124c(onboardingMyPdActivity, (InterfaceC3954c) this.f33484a.f32720F2.mo42226get());
            C13006b.m1938a(onboardingMyPdActivity, m2200f());
            return onboardingMyPdActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2201e() {
            return Collections.singletonMap(OnboardingMyPdViewModel.class, (InterfaceC6657b) this.f33489f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2200f() {
            return new ViewModelFactoryByInjection(m2201e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingMyPdActivity onboardingMyPdActivity) {
            m2202d(onboardingMyPdActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t4 */
    /* loaded from: classes2.dex */
    public static final class C12894t4 implements InterfaceC13327m1 {

        /* renamed from: a */
        private final C12636e f33490a;

        /* renamed from: b */
        private InterfaceC12341a<PromotionActivity> f33491b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33492c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33493d;

        /* renamed from: e */
        private C5713h f33494e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33495f;

        /* renamed from: g */
        private C7483b f33496g;

        /* renamed from: h */
        private InterfaceC12341a<Object> f33497h;

        private C12894t4(C12636e c12636e, PromotionActivity promotionActivity) {
            this.f33490a = c12636e;
            m2199b(promotionActivity);
        }

        /* renamed from: b */
        private void m2199b(PromotionActivity promotionActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(promotionActivity);
            this.f33491b = m4594a;
            this.f33492c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33490a.f32704B2, this.f33490a.f32708C2, this.f33490a.f32712D2));
            this.f33493d = C11613b.m4596a(C5975c.m22544a(this.f33490a.f32703B1));
            C5713h m23286a = C5713h.m23286a(this.f33490a.f32703B1, this.f33490a.f32756O2, this.f33490a.f32744L2, this.f33490a.f32740K2);
            this.f33494e = m23286a;
            this.f33495f = C5714i.m23282c(m23286a);
            C7483b m18388a = C7483b.m18388a(this.f33490a.f32703B1, this.f33490a.f32756O2, this.f33490a.f32865m3, this.f33490a.f32740K2);
            this.f33496g = m18388a;
            this.f33497h = C7484c.m18384c(m18388a);
        }

        /* renamed from: d */
        private PromotionActivity m2197d(PromotionActivity promotionActivity) {
            C11205c.m5751a(promotionActivity, this.f33490a.m2750Y());
            C5921e.m22726a(promotionActivity, this.f33492c.mo42226get());
            C13872m.m123d(promotionActivity, this.f33493d.mo42226get());
            C13872m.m125b(promotionActivity, (AuthManager) this.f33490a.f32700A2.mo42226get());
            C13872m.m126a(promotionActivity, (AppRatingManager) this.f33490a.f32716E2.mo42226get());
            C13872m.m124c(promotionActivity, (InterfaceC3954c) this.f33490a.f32720F2.mo42226get());
            C7909c.m17604a(promotionActivity, m2195f());
            C5712f.m23288b(promotionActivity, (StoreManager) this.f33490a.f32736J2.mo42226get());
            C5712f.m23289a(promotionActivity, m2195f());
            return promotionActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2196e() {
            return C11616e.m4592b(2).m4591c(PromotionViewModel.class, (InterfaceC6657b) this.f33495f.mo42226get()).m4591c(BottomNavigationViewModel.class, (InterfaceC6657b) this.f33497h.mo42226get()).m4593a();
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2195f() {
            return new ViewModelFactoryByInjection(m2196e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PromotionActivity promotionActivity) {
            m2197d(promotionActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t5 */
    /* loaded from: classes2.dex */
    public static final class C12895t5 implements InterfaceC13411w1 {

        /* renamed from: a */
        private final C12636e f33498a;

        /* renamed from: b */
        private InterfaceC12341a<ShoppingListActivity> f33499b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33500c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33501d;

        /* renamed from: e */
        private C6705f1 f33502e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33503f;

        private C12895t5(C12636e c12636e, ShoppingListActivity shoppingListActivity) {
            this.f33498a = c12636e;
            m2194b(shoppingListActivity);
        }

        /* renamed from: b */
        private void m2194b(ShoppingListActivity shoppingListActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(shoppingListActivity);
            this.f33499b = m4594a;
            this.f33500c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33498a.f32704B2, this.f33498a.f32708C2, this.f33498a.f32712D2));
            this.f33501d = C11613b.m4596a(C5975c.m22544a(this.f33498a.f32703B1));
            C6705f1 m20272a = C6705f1.m20272a(this.f33498a.f32703B1, this.f33498a.f32756O2, this.f33498a.f32744L2, this.f33498a.f32865m3, this.f33498a.f32768R2, this.f33498a.f32736J2, this.f33498a.f32740K2);
            this.f33502e = m20272a;
            this.f33503f = C6708g1.m20268c(m20272a);
        }

        /* renamed from: d */
        private ShoppingListActivity m2192d(ShoppingListActivity shoppingListActivity) {
            C11205c.m5751a(shoppingListActivity, this.f33498a.m2750Y());
            C5921e.m22726a(shoppingListActivity, this.f33500c.mo42226get());
            C13872m.m123d(shoppingListActivity, this.f33501d.mo42226get());
            C13872m.m125b(shoppingListActivity, (AuthManager) this.f33498a.f32700A2.mo42226get());
            C13872m.m126a(shoppingListActivity, (AppRatingManager) this.f33498a.f32716E2.mo42226get());
            C13872m.m124c(shoppingListActivity, (InterfaceC3954c) this.f33498a.f32720F2.mo42226get());
            C6701e0.m20273b(shoppingListActivity, (StoreManager) this.f33498a.f32736J2.mo42226get());
            C6701e0.m20274a(shoppingListActivity, m2190f());
            return shoppingListActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2191e() {
            return Collections.singletonMap(ShoppingListViewModel.class, (InterfaceC6657b) this.f33503f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2190f() {
            return new ViewModelFactoryByInjection(m2191e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ShoppingListActivity shoppingListActivity) {
            m2192d(shoppingListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t6 */
    /* loaded from: classes2.dex */
    public static final class C12896t6 implements InterfaceC13259f2 {

        /* renamed from: a */
        private final C12636e f33504a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayProductsActivity> f33505b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33506c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33507d;

        /* renamed from: e */
        private C0237s f33508e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33509f;

        private C12896t6(C12636e c12636e, TakeAwayProductsActivity takeAwayProductsActivity) {
            this.f33504a = c12636e;
            m2189b(takeAwayProductsActivity);
        }

        /* renamed from: b */
        private void m2189b(TakeAwayProductsActivity takeAwayProductsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayProductsActivity);
            this.f33505b = m4594a;
            this.f33506c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33504a.f32704B2, this.f33504a.f32708C2, this.f33504a.f32712D2));
            this.f33507d = C11613b.m4596a(C5975c.m22544a(this.f33504a.f32703B1));
            C0237s m41498a = C0237s.m41498a(this.f33504a.f32703B1, this.f33504a.f32771S1, this.f33504a.f32865m3, this.f33504a.f32740K2);
            this.f33508e = m41498a;
            this.f33509f = C0238t.m41494c(m41498a);
        }

        /* renamed from: d */
        private TakeAwayProductsActivity m2187d(TakeAwayProductsActivity takeAwayProductsActivity) {
            C11205c.m5751a(takeAwayProductsActivity, this.f33504a.m2750Y());
            C5921e.m22726a(takeAwayProductsActivity, this.f33506c.mo42226get());
            C13872m.m123d(takeAwayProductsActivity, this.f33507d.mo42226get());
            C13872m.m125b(takeAwayProductsActivity, (AuthManager) this.f33504a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayProductsActivity, (AppRatingManager) this.f33504a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayProductsActivity, (InterfaceC3954c) this.f33504a.f32720F2.mo42226get());
            C0232q.m41514a(takeAwayProductsActivity, m2185f());
            return takeAwayProductsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2186e() {
            return Collections.singletonMap(TakeAwayProductsViewModel.class, (InterfaceC6657b) this.f33509f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2185f() {
            return new ViewModelFactoryByInjection(m2186e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayProductsActivity takeAwayProductsActivity) {
            m2187d(takeAwayProductsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$t7 */
    /* loaded from: classes2.dex */
    public static final class C12897t7 implements InterfaceC13397u2 {

        /* renamed from: a */
        private final C12636e f33510a;

        /* renamed from: b */
        private InterfaceC12341a<VirtualCardDataConfirmationActivity> f33511b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33512c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33513d;

        /* renamed from: e */
        private C13449f f33514e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33515f;

        private C12897t7(C12636e c12636e, VirtualCardDataConfirmationActivity virtualCardDataConfirmationActivity) {
            this.f33510a = c12636e;
            m2184b(virtualCardDataConfirmationActivity);
        }

        /* renamed from: b */
        private void m2184b(VirtualCardDataConfirmationActivity virtualCardDataConfirmationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(virtualCardDataConfirmationActivity);
            this.f33511b = m4594a;
            this.f33512c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33510a.f32704B2, this.f33510a.f32708C2, this.f33510a.f32712D2));
            this.f33513d = C11613b.m4596a(C5975c.m22544a(this.f33510a.f32703B1));
            C13449f m1381a = C13449f.m1381a(this.f33510a.f32703B1, this.f33510a.f32740K2, this.f33510a.f32740K2);
            this.f33514e = m1381a;
            this.f33515f = C13450g.m1378b(m1381a);
        }

        /* renamed from: d */
        private VirtualCardDataConfirmationActivity m2182d(VirtualCardDataConfirmationActivity virtualCardDataConfirmationActivity) {
            C11205c.m5751a(virtualCardDataConfirmationActivity, this.f33510a.m2750Y());
            C5921e.m22726a(virtualCardDataConfirmationActivity, this.f33512c.mo42226get());
            C13872m.m123d(virtualCardDataConfirmationActivity, this.f33513d.mo42226get());
            C13872m.m125b(virtualCardDataConfirmationActivity, (AuthManager) this.f33510a.f32700A2.mo42226get());
            C13872m.m126a(virtualCardDataConfirmationActivity, (AppRatingManager) this.f33510a.f32716E2.mo42226get());
            C13872m.m124c(virtualCardDataConfirmationActivity, (InterfaceC3954c) this.f33510a.f32720F2.mo42226get());
            C13445b.m1396a(virtualCardDataConfirmationActivity, m2180f());
            return virtualCardDataConfirmationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2181e() {
            return Collections.singletonMap(VirtualCardDataConfirmationViewModel.class, (InterfaceC6657b) this.f33515f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2180f() {
            return new ViewModelFactoryByInjection(m2181e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(VirtualCardDataConfirmationActivity virtualCardDataConfirmationActivity) {
            m2182d(virtualCardDataConfirmationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u */
    /* loaded from: classes2.dex */
    public static final class C12898u implements InterfaceC13273h {

        /* renamed from: a */
        private final C12636e f33516a;

        /* renamed from: b */
        private InterfaceC12341a<BannerDetailActivity> f33517b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33518c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33519d;

        /* renamed from: e */
        private C12988f f33520e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33521f;

        private C12898u(C12636e c12636e, BannerDetailActivity bannerDetailActivity) {
            this.f33516a = c12636e;
            m2179b(bannerDetailActivity);
        }

        /* renamed from: b */
        private void m2179b(BannerDetailActivity bannerDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(bannerDetailActivity);
            this.f33517b = m4594a;
            this.f33518c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33516a.f32704B2, this.f33516a.f32708C2, this.f33516a.f32712D2));
            this.f33519d = C11613b.m4596a(C5975c.m22544a(this.f33516a.f32703B1));
            C12988f m2003a = C12988f.m2003a(this.f33516a.f32703B1, this.f33516a.f32736J2, this.f33516a.f32744L2, this.f33516a.f32771S1, this.f33516a.f32850j3, this.f33516a.f32740K2);
            this.f33520e = m2003a;
            this.f33521f = C12989g.m2000b(m2003a);
        }

        /* renamed from: d */
        private BannerDetailActivity m2177d(BannerDetailActivity bannerDetailActivity) {
            C11205c.m5751a(bannerDetailActivity, this.f33516a.m2750Y());
            C5921e.m22726a(bannerDetailActivity, this.f33518c.mo42226get());
            C13872m.m123d(bannerDetailActivity, this.f33519d.mo42226get());
            C13872m.m125b(bannerDetailActivity, (AuthManager) this.f33516a.f32700A2.mo42226get());
            C13872m.m126a(bannerDetailActivity, (AppRatingManager) this.f33516a.f32716E2.mo42226get());
            C13872m.m124c(bannerDetailActivity, (InterfaceC3954c) this.f33516a.f32720F2.mo42226get());
            C12982c.m2020a(bannerDetailActivity, (TransactionCacheManager) this.f33516a.f32724G2.mo42226get());
            C12982c.m2019b(bannerDetailActivity, m2175f());
            return bannerDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2176e() {
            return Collections.singletonMap(BannerDetailViewModel.class, (InterfaceC6657b) this.f33521f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2175f() {
            return new ViewModelFactoryByInjection(m2176e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BannerDetailActivity bannerDetailActivity) {
            m2177d(bannerDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u0 */
    /* loaded from: classes2.dex */
    public static final class C12899u0 implements InterfaceC13435z1 {

        /* renamed from: a */
        private final C12636e f33522a;

        /* renamed from: b */
        private InterfaceC12341a<DefaultStoreActivity> f33523b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33524c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33525d;

        /* renamed from: e */
        private C11379e f33526e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33527f;

        private C12899u0(C12636e c12636e, DefaultStoreActivity defaultStoreActivity) {
            this.f33522a = c12636e;
            m2174b(defaultStoreActivity);
        }

        /* renamed from: b */
        private void m2174b(DefaultStoreActivity defaultStoreActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(defaultStoreActivity);
            this.f33523b = m4594a;
            this.f33524c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33522a.f32704B2, this.f33522a.f32708C2, this.f33522a.f32712D2));
            this.f33525d = C11613b.m4596a(C5975c.m22544a(this.f33522a.f32703B1));
            C11379e m5287a = C11379e.m5287a(this.f33522a.f32703B1, this.f33522a.f32736J2, this.f33522a.f32740K2);
            this.f33526e = m5287a;
            this.f33527f = C11380f.m5283c(m5287a);
        }

        /* renamed from: d */
        private DefaultStoreActivity m2172d(DefaultStoreActivity defaultStoreActivity) {
            C11205c.m5751a(defaultStoreActivity, this.f33522a.m2750Y());
            C5921e.m22726a(defaultStoreActivity, this.f33524c.mo42226get());
            C13872m.m123d(defaultStoreActivity, this.f33525d.mo42226get());
            C13872m.m125b(defaultStoreActivity, (AuthManager) this.f33522a.f32700A2.mo42226get());
            C13872m.m126a(defaultStoreActivity, (AppRatingManager) this.f33522a.f32716E2.mo42226get());
            C13872m.m124c(defaultStoreActivity, (InterfaceC3954c) this.f33522a.f32720F2.mo42226get());
            C11369b.m5307a(defaultStoreActivity, m2170f());
            return defaultStoreActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2171e() {
            return Collections.singletonMap(DefaultStoreViewModel.class, (InterfaceC6657b) this.f33527f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2170f() {
            return new ViewModelFactoryByInjection(m2171e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DefaultStoreActivity defaultStoreActivity) {
            m2172d(defaultStoreActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u1 */
    /* loaded from: classes2.dex */
    public static final class C12900u1 implements InterfaceC13265g0.InterfaceC13266a {

        /* renamed from: a */
        private final C12636e f33528a;

        private C12900u1(C12636e c12636e) {
            this.f33528a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13265g0 mo2891c(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity) {
            C11617f.m4590a(fetchTermsAndConditionsActivity);
            return new C12909v1(this.f33528a, fetchTermsAndConditionsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u2 */
    /* loaded from: classes2.dex */
    public static final class C12901u2 implements InterfaceC13369r0.InterfaceC13370a {

        /* renamed from: a */
        private final C12636e f33529a;

        private C12901u2(C12636e c12636e) {
            this.f33529a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13369r0 mo2891c(LoyaltyIntroActivity loyaltyIntroActivity) {
            C11617f.m4590a(loyaltyIntroActivity);
            return new C12910v2(this.f33529a, loyaltyIntroActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u3 */
    /* loaded from: classes2.dex */
    public static final class C12902u3 implements InterfaceC13237d1.InterfaceC13238a {

        /* renamed from: a */
        private final C12636e f33530a;

        private C12902u3(C12636e c12636e) {
            this.f33530a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13237d1 mo2891c(OnboardingNifActivity onboardingNifActivity) {
            C11617f.m4590a(onboardingNifActivity);
            return new C12911v3(this.f33530a, onboardingNifActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u4 */
    /* loaded from: classes2.dex */
    public static final class C12903u4 implements InterfaceC13337n1.InterfaceC13338a {

        /* renamed from: a */
        private final C12636e f33531a;

        private C12903u4(C12636e c12636e) {
            this.f33531a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13337n1 mo2891c(PurchaseDetailActivity purchaseDetailActivity) {
            C11617f.m4590a(purchaseDetailActivity);
            return new C12912v4(this.f33531a, purchaseDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u5 */
    /* loaded from: classes2.dex */
    public static final class C12904u5 implements InterfaceC13409w0.InterfaceC13410a {

        /* renamed from: a */
        private final C12636e f33532a;

        private C12904u5(C12636e c12636e) {
            this.f33532a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13409w0 mo2891c(ShoppingListsActivity shoppingListsActivity) {
            C11617f.m4590a(shoppingListsActivity);
            return new C12913v5(this.f33532a, shoppingListsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u6 */
    /* loaded from: classes2.dex */
    public static final class C12905u6 implements InterfaceC13299j2.InterfaceC13300a {

        /* renamed from: a */
        private final C12636e f33533a;

        private C12905u6(C12636e c12636e) {
            this.f33533a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13299j2 mo2891c(TakeAwayStoreActivity takeAwayStoreActivity) {
            C11617f.m4590a(takeAwayStoreActivity);
            return new C12914v6(this.f33533a, takeAwayStoreActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$u7 */
    /* loaded from: classes2.dex */
    public static final class C12906u7 implements InterfaceC13405v2.InterfaceC13406a {

        /* renamed from: a */
        private final C12636e f33534a;

        private C12906u7(C12636e c12636e) {
            this.f33534a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13405v2 mo2891c(VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
            C11617f.m4590a(virtualCardPreferencesActivity);
            return new C12915v7(this.f33534a, virtualCardPreferencesActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v */
    /* loaded from: classes2.dex */
    public static final class C12907v implements InterfaceC13283i.InterfaceC13284a {

        /* renamed from: a */
        private final C12636e f33535a;

        private C12907v(C12636e c12636e) {
            this.f33535a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13283i mo2891c(BenefitsActivity benefitsActivity) {
            C11617f.m4590a(benefitsActivity);
            return new C12916w(this.f33535a, benefitsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v0 */
    /* loaded from: classes2.dex */
    public static final class C12908v0 implements InterfaceC13407w.InterfaceC13408a {

        /* renamed from: a */
        private final C12636e f33536a;

        private C12908v0(C12636e c12636e) {
            this.f33536a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13407w mo2891c(DefaultStoreDetailActivity defaultStoreDetailActivity) {
            C11617f.m4590a(defaultStoreDetailActivity);
            return new C12917w0(this.f33536a, defaultStoreDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v1 */
    /* loaded from: classes2.dex */
    public static final class C12909v1 implements InterfaceC13265g0 {

        /* renamed from: a */
        private final C12636e f33537a;

        /* renamed from: b */
        private InterfaceC12341a<FetchTermsAndConditionsActivity> f33538b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33539c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33540d;

        /* renamed from: e */
        private C1904b f33541e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33542f;

        private C12909v1(C12636e c12636e, FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity) {
            this.f33537a = c12636e;
            m2160b(fetchTermsAndConditionsActivity);
        }

        /* renamed from: b */
        private void m2160b(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(fetchTermsAndConditionsActivity);
            this.f33538b = m4594a;
            this.f33539c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33537a.f32704B2, this.f33537a.f32708C2, this.f33537a.f32712D2));
            this.f33540d = C11613b.m4596a(C5975c.m22544a(this.f33537a.f32703B1));
            C1904b m35151a = C1904b.m35151a(this.f33537a.f32703B1, this.f33537a.f32909w2, this.f33537a.f32740K2);
            this.f33541e = m35151a;
            this.f33542f = C1905c.m35147c(m35151a);
        }

        /* renamed from: d */
        private FetchTermsAndConditionsActivity m2158d(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity) {
            C11205c.m5751a(fetchTermsAndConditionsActivity, this.f33537a.m2750Y());
            C5921e.m22726a(fetchTermsAndConditionsActivity, this.f33539c.mo42226get());
            C13872m.m123d(fetchTermsAndConditionsActivity, this.f33540d.mo42226get());
            C13872m.m125b(fetchTermsAndConditionsActivity, (AuthManager) this.f33537a.f32700A2.mo42226get());
            C13872m.m126a(fetchTermsAndConditionsActivity, (AppRatingManager) this.f33537a.f32716E2.mo42226get());
            C13872m.m124c(fetchTermsAndConditionsActivity, (InterfaceC3954c) this.f33537a.f32720F2.mo42226get());
            C6688c.m20278a(fetchTermsAndConditionsActivity, m2156f());
            return fetchTermsAndConditionsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2157e() {
            return Collections.singletonMap(FetchTermsAndConditionsViewModel.class, (InterfaceC6657b) this.f33542f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2156f() {
            return new ViewModelFactoryByInjection(m2157e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(FetchTermsAndConditionsActivity fetchTermsAndConditionsActivity) {
            m2158d(fetchTermsAndConditionsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v2 */
    /* loaded from: classes2.dex */
    public static final class C12910v2 implements InterfaceC13369r0 {

        /* renamed from: a */
        private final C12636e f33543a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyIntroActivity> f33544b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33545c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33546d;

        /* renamed from: e */
        private C5688e f33547e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33548f;

        private C12910v2(C12636e c12636e, LoyaltyIntroActivity loyaltyIntroActivity) {
            this.f33543a = c12636e;
            m2155b(loyaltyIntroActivity);
        }

        /* renamed from: b */
        private void m2155b(LoyaltyIntroActivity loyaltyIntroActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyIntroActivity);
            this.f33544b = m4594a;
            this.f33545c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33543a.f32704B2, this.f33543a.f32708C2, this.f33543a.f32712D2));
            this.f33546d = C11613b.m4596a(C5975c.m22544a(this.f33543a.f32703B1));
            C5688e m23343a = C5688e.m23343a(this.f33543a.f32703B1, this.f33543a.f32780U2, this.f33543a.f32771S1, this.f33543a.f32740K2);
            this.f33547e = m23343a;
            this.f33548f = C5689f.m23339c(m23343a);
        }

        /* renamed from: d */
        private LoyaltyIntroActivity m2153d(LoyaltyIntroActivity loyaltyIntroActivity) {
            C11205c.m5751a(loyaltyIntroActivity, this.f33543a.m2750Y());
            C5921e.m22726a(loyaltyIntroActivity, this.f33545c.mo42226get());
            C13872m.m123d(loyaltyIntroActivity, this.f33546d.mo42226get());
            C13872m.m125b(loyaltyIntroActivity, (AuthManager) this.f33543a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyIntroActivity, (AppRatingManager) this.f33543a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyIntroActivity, (InterfaceC3954c) this.f33543a.f32720F2.mo42226get());
            C5685b.m23344a(loyaltyIntroActivity, m2151f());
            return loyaltyIntroActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2152e() {
            return Collections.singletonMap(LoyaltyIntroViewModel.class, (InterfaceC6657b) this.f33548f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2151f() {
            return new ViewModelFactoryByInjection(m2152e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyIntroActivity loyaltyIntroActivity) {
            m2153d(loyaltyIntroActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v3 */
    /* loaded from: classes2.dex */
    public static final class C12911v3 implements InterfaceC13237d1 {

        /* renamed from: a */
        private final C12636e f33549a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingNifActivity> f33550b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33551c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33552d;

        /* renamed from: e */
        private C13475d f33553e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33554f;

        private C12911v3(C12636e c12636e, OnboardingNifActivity onboardingNifActivity) {
            this.f33549a = c12636e;
            m2150b(onboardingNifActivity);
        }

        /* renamed from: b */
        private void m2150b(OnboardingNifActivity onboardingNifActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingNifActivity);
            this.f33550b = m4594a;
            this.f33551c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33549a.f32704B2, this.f33549a.f32708C2, this.f33549a.f32712D2));
            this.f33552d = C11613b.m4596a(C5975c.m22544a(this.f33549a.f32703B1));
            C13475d m1311a = C13475d.m1311a(this.f33549a.f32703B1, this.f33549a.f32845i3, this.f33549a.f32796Y2, this.f33549a.f32835g3, this.f33549a.f32771S1, this.f33549a.f32740K2);
            this.f33553e = m1311a;
            this.f33554f = C13476e.m1308b(m1311a);
        }

        /* renamed from: d */
        private OnboardingNifActivity m2148d(OnboardingNifActivity onboardingNifActivity) {
            C11205c.m5751a(onboardingNifActivity, this.f33549a.m2750Y());
            C5921e.m22726a(onboardingNifActivity, this.f33551c.mo42226get());
            C13872m.m123d(onboardingNifActivity, this.f33552d.mo42226get());
            C13872m.m125b(onboardingNifActivity, (AuthManager) this.f33549a.f32700A2.mo42226get());
            C13872m.m126a(onboardingNifActivity, (AppRatingManager) this.f33549a.f32716E2.mo42226get());
            C13872m.m124c(onboardingNifActivity, (InterfaceC3954c) this.f33549a.f32720F2.mo42226get());
            C13468b.m1325a(onboardingNifActivity, m2146f());
            return onboardingNifActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2147e() {
            return Collections.singletonMap(OnboardingNifViewModel.class, (InterfaceC6657b) this.f33554f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2146f() {
            return new ViewModelFactoryByInjection(m2147e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingNifActivity onboardingNifActivity) {
            m2148d(onboardingNifActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v4 */
    /* loaded from: classes2.dex */
    public static final class C12912v4 implements InterfaceC13337n1 {

        /* renamed from: a */
        private final C12636e f33555a;

        /* renamed from: b */
        private InterfaceC12341a<PurchaseDetailActivity> f33556b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33557c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33558d;

        /* renamed from: e */
        private C5972h f33559e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33560f;

        private C12912v4(C12636e c12636e, PurchaseDetailActivity purchaseDetailActivity) {
            this.f33555a = c12636e;
            m2145b(purchaseDetailActivity);
        }

        /* renamed from: b */
        private void m2145b(PurchaseDetailActivity purchaseDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(purchaseDetailActivity);
            this.f33556b = m4594a;
            this.f33557c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33555a.f32704B2, this.f33555a.f32708C2, this.f33555a.f32712D2));
            this.f33558d = C11613b.m4596a(C5975c.m22544a(this.f33555a.f32703B1));
            C5972h m22552a = C5972h.m22552a(this.f33555a.f32703B1, this.f33555a.f32880p3, this.f33555a.f32740K2);
            this.f33559e = m22552a;
            this.f33560f = C5973i.m22548c(m22552a);
        }

        /* renamed from: d */
        private PurchaseDetailActivity m2143d(PurchaseDetailActivity purchaseDetailActivity) {
            C11205c.m5751a(purchaseDetailActivity, this.f33555a.m2750Y());
            C5921e.m22726a(purchaseDetailActivity, this.f33557c.mo42226get());
            C13872m.m123d(purchaseDetailActivity, this.f33558d.mo42226get());
            C13872m.m125b(purchaseDetailActivity, (AuthManager) this.f33555a.f32700A2.mo42226get());
            C13872m.m126a(purchaseDetailActivity, (AppRatingManager) this.f33555a.f32716E2.mo42226get());
            C13872m.m124c(purchaseDetailActivity, (InterfaceC3954c) this.f33555a.f32720F2.mo42226get());
            C5965d.m22577a(purchaseDetailActivity, m2141f());
            return purchaseDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2142e() {
            return Collections.singletonMap(PurchaseDetailViewModel.class, (InterfaceC6657b) this.f33560f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2141f() {
            return new ViewModelFactoryByInjection(m2142e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PurchaseDetailActivity purchaseDetailActivity) {
            m2143d(purchaseDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v5 */
    /* loaded from: classes2.dex */
    public static final class C12913v5 implements InterfaceC13409w0 {

        /* renamed from: a */
        private final C12636e f33561a;

        /* renamed from: b */
        private InterfaceC12341a<ShoppingListsActivity> f33562b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33563c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33564d;

        /* renamed from: e */
        private C7537o f33565e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33566f;

        private C12913v5(C12636e c12636e, ShoppingListsActivity shoppingListsActivity) {
            this.f33561a = c12636e;
            m2140b(shoppingListsActivity);
        }

        /* renamed from: b */
        private void m2140b(ShoppingListsActivity shoppingListsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(shoppingListsActivity);
            this.f33562b = m4594a;
            this.f33563c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33561a.f32704B2, this.f33561a.f32708C2, this.f33561a.f32712D2));
            this.f33564d = C11613b.m4596a(C5975c.m22544a(this.f33561a.f32703B1));
            C7537o m18260a = C7537o.m18260a(this.f33561a.f32703B1, this.f33561a.f32756O2, this.f33561a.f32740K2, this.f33561a.f32740K2);
            this.f33565e = m18260a;
            this.f33566f = C7538p.m18256c(m18260a);
        }

        /* renamed from: d */
        private ShoppingListsActivity m2138d(ShoppingListsActivity shoppingListsActivity) {
            C11205c.m5751a(shoppingListsActivity, this.f33561a.m2750Y());
            C5921e.m22726a(shoppingListsActivity, this.f33563c.mo42226get());
            C13872m.m123d(shoppingListsActivity, this.f33564d.mo42226get());
            C13872m.m125b(shoppingListsActivity, (AuthManager) this.f33561a.f32700A2.mo42226get());
            C13872m.m126a(shoppingListsActivity, (AppRatingManager) this.f33561a.f32716E2.mo42226get());
            C13872m.m124c(shoppingListsActivity, (InterfaceC3954c) this.f33561a.f32720F2.mo42226get());
            C9488a.m10994b(shoppingListsActivity, (EncryptedPrefsManager) this.f33561a.f32795Y1.mo42226get());
            C9488a.m10995a(shoppingListsActivity, m2136f());
            return shoppingListsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2137e() {
            return Collections.singletonMap(C7517n.class, (InterfaceC6657b) this.f33566f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2136f() {
            return new ViewModelFactoryByInjection(m2137e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(ShoppingListsActivity shoppingListsActivity) {
            m2138d(shoppingListsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v6 */
    /* loaded from: classes2.dex */
    public static final class C12914v6 implements InterfaceC13299j2 {

        /* renamed from: a */
        private final C12636e f33567a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayStoreActivity> f33568b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33569c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33570d;

        /* renamed from: e */
        private C12207e f33571e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33572f;

        private C12914v6(C12636e c12636e, TakeAwayStoreActivity takeAwayStoreActivity) {
            this.f33567a = c12636e;
            m2135b(takeAwayStoreActivity);
        }

        /* renamed from: b */
        private void m2135b(TakeAwayStoreActivity takeAwayStoreActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayStoreActivity);
            this.f33568b = m4594a;
            this.f33569c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33567a.f32704B2, this.f33567a.f32708C2, this.f33567a.f32712D2));
            this.f33570d = C11613b.m4596a(C5975c.m22544a(this.f33567a.f32703B1));
            C12207e m3393a = C12207e.m3393a(this.f33567a.f32703B1, this.f33567a.f32865m3, this.f33567a.f32736J2, this.f33567a.f32740K2);
            this.f33571e = m3393a;
            this.f33572f = C12208f.m3389c(m3393a);
        }

        /* renamed from: d */
        private TakeAwayStoreActivity m2133d(TakeAwayStoreActivity takeAwayStoreActivity) {
            C11205c.m5751a(takeAwayStoreActivity, this.f33567a.m2750Y());
            C5921e.m22726a(takeAwayStoreActivity, this.f33569c.mo42226get());
            C13872m.m123d(takeAwayStoreActivity, this.f33570d.mo42226get());
            C13872m.m125b(takeAwayStoreActivity, (AuthManager) this.f33567a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayStoreActivity, (AppRatingManager) this.f33567a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayStoreActivity, (InterfaceC3954c) this.f33567a.f32720F2.mo42226get());
            C12202b.m3409a(takeAwayStoreActivity, m2131f());
            return takeAwayStoreActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2132e() {
            return Collections.singletonMap(TakeAwayStoreViewModel.class, (InterfaceC6657b) this.f33572f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2131f() {
            return new ViewModelFactoryByInjection(m2132e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayStoreActivity takeAwayStoreActivity) {
            m2133d(takeAwayStoreActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$v7 */
    /* loaded from: classes2.dex */
    public static final class C12915v7 implements InterfaceC13405v2 {

        /* renamed from: a */
        private final C12636e f33573a;

        /* renamed from: b */
        private InterfaceC12341a<VirtualCardPreferencesActivity> f33574b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33575c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33576d;

        /* renamed from: e */
        private C13458l f33577e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33578f;

        private C12915v7(C12636e c12636e, VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
            this.f33573a = c12636e;
            m2130b(virtualCardPreferencesActivity);
        }

        /* renamed from: b */
        private void m2130b(VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(virtualCardPreferencesActivity);
            this.f33574b = m4594a;
            this.f33575c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33573a.f32704B2, this.f33573a.f32708C2, this.f33573a.f32712D2));
            this.f33576d = C11613b.m4596a(C5975c.m22544a(this.f33573a.f32703B1));
            C13458l m1354a = C13458l.m1354a(this.f33573a.f32703B1, this.f33573a.f32780U2, this.f33573a.f32740K2);
            this.f33577e = m1354a;
            this.f33578f = C13459m.m1351b(m1354a);
        }

        /* renamed from: d */
        private VirtualCardPreferencesActivity m2128d(VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
            C11205c.m5751a(virtualCardPreferencesActivity, this.f33573a.m2750Y());
            C5921e.m22726a(virtualCardPreferencesActivity, this.f33575c.mo42226get());
            C13872m.m123d(virtualCardPreferencesActivity, this.f33576d.mo42226get());
            C13872m.m125b(virtualCardPreferencesActivity, (AuthManager) this.f33573a.f32700A2.mo42226get());
            C13872m.m126a(virtualCardPreferencesActivity, (AppRatingManager) this.f33573a.f32716E2.mo42226get());
            C13872m.m124c(virtualCardPreferencesActivity, (InterfaceC3954c) this.f33573a.f32720F2.mo42226get());
            C13451i.m1375a(virtualCardPreferencesActivity, m2126f());
            return virtualCardPreferencesActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2127e() {
            return Collections.singletonMap(VirtualCardPreferencesViewModel.class, (InterfaceC6657b) this.f33578f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2126f() {
            return new ViewModelFactoryByInjection(m2127e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(VirtualCardPreferencesActivity virtualCardPreferencesActivity) {
            m2128d(virtualCardPreferencesActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w */
    /* loaded from: classes2.dex */
    public static final class C12916w implements InterfaceC13283i {

        /* renamed from: a */
        private final C12636e f33579a;

        /* renamed from: b */
        private InterfaceC12341a<BenefitsActivity> f33580b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33581c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33582d;

        /* renamed from: e */
        private C5109s f33583e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33584f;

        private C12916w(C12636e c12636e, BenefitsActivity benefitsActivity) {
            this.f33579a = c12636e;
            m2125b(benefitsActivity);
        }

        /* renamed from: b */
        private void m2125b(BenefitsActivity benefitsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(benefitsActivity);
            this.f33580b = m4594a;
            this.f33581c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33579a.f32704B2, this.f33579a.f32708C2, this.f33579a.f32712D2));
            this.f33582d = C11613b.m4596a(C5975c.m22544a(this.f33579a.f32703B1));
            C5109s m25680a = C5109s.m25680a(this.f33579a.f32703B1, this.f33579a.f32855k3, this.f33579a.f32780U2, this.f33579a.f32736J2, this.f33579a.f32740K2);
            this.f33583e = m25680a;
            this.f33584f = C5110t.m25676c(m25680a);
        }

        /* renamed from: d */
        private BenefitsActivity m2123d(BenefitsActivity benefitsActivity) {
            C11205c.m5751a(benefitsActivity, this.f33579a.m2750Y());
            C5921e.m22726a(benefitsActivity, this.f33581c.mo42226get());
            C13872m.m123d(benefitsActivity, this.f33582d.mo42226get());
            C13872m.m125b(benefitsActivity, (AuthManager) this.f33579a.f32700A2.mo42226get());
            C13872m.m126a(benefitsActivity, (AppRatingManager) this.f33579a.f32716E2.mo42226get());
            C13872m.m124c(benefitsActivity, (InterfaceC3954c) this.f33579a.f32720F2.mo42226get());
            C5088j.m25725a(benefitsActivity, m2121f());
            return benefitsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2122e() {
            return Collections.singletonMap(BenefitsViewModel.class, (InterfaceC6657b) this.f33584f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2121f() {
            return new ViewModelFactoryByInjection(m2122e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BenefitsActivity benefitsActivity) {
            m2123d(benefitsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w0 */
    /* loaded from: classes2.dex */
    public static final class C12917w0 implements InterfaceC13407w {

        /* renamed from: a */
        private final C12636e f33585a;

        /* renamed from: b */
        private InterfaceC12341a<DefaultStoreDetailActivity> f33586b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33587c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33588d;

        /* renamed from: e */
        private C12173d f33589e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33590f;

        private C12917w0(C12636e c12636e, DefaultStoreDetailActivity defaultStoreDetailActivity) {
            this.f33585a = c12636e;
            m2120b(defaultStoreDetailActivity);
        }

        /* renamed from: b */
        private void m2120b(DefaultStoreDetailActivity defaultStoreDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(defaultStoreDetailActivity);
            this.f33586b = m4594a;
            this.f33587c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33585a.f32704B2, this.f33585a.f32708C2, this.f33585a.f32712D2));
            this.f33588d = C11613b.m4596a(C5975c.m22544a(this.f33585a.f32703B1));
            C12173d m3481a = C12173d.m3481a(this.f33585a.f32703B1, this.f33585a.f32724G2, this.f33585a.f32736J2, this.f33585a.f32740K2);
            this.f33589e = m3481a;
            this.f33590f = C12174e.m3477c(m3481a);
        }

        /* renamed from: d */
        private DefaultStoreDetailActivity m2118d(DefaultStoreDetailActivity defaultStoreDetailActivity) {
            C11205c.m5751a(defaultStoreDetailActivity, this.f33585a.m2750Y());
            C5921e.m22726a(defaultStoreDetailActivity, this.f33587c.mo42226get());
            C13872m.m123d(defaultStoreDetailActivity, this.f33588d.mo42226get());
            C13872m.m125b(defaultStoreDetailActivity, (AuthManager) this.f33585a.f32700A2.mo42226get());
            C13872m.m126a(defaultStoreDetailActivity, (AppRatingManager) this.f33585a.f32716E2.mo42226get());
            C13872m.m124c(defaultStoreDetailActivity, (InterfaceC3954c) this.f33585a.f32720F2.mo42226get());
            C6681b.m20295a(defaultStoreDetailActivity, (TransactionCacheManager) this.f33585a.f32724G2.mo42226get());
            C12169b.m3490a(defaultStoreDetailActivity, m2116f());
            return defaultStoreDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2117e() {
            return Collections.singletonMap(DefaultStoreDetailViewModel.class, (InterfaceC6657b) this.f33590f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2116f() {
            return new ViewModelFactoryByInjection(m2117e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DefaultStoreDetailActivity defaultStoreDetailActivity) {
            m2118d(defaultStoreDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w1 */
    /* loaded from: classes2.dex */
    public static final class C12918w1 implements InterfaceC13251e3.InterfaceC13252a {

        /* renamed from: a */
        private final C12636e f33591a;

        private C12918w1(C12636e c12636e) {
            this.f33591a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13251e3 mo2891c(FiltersBottomSheetFragment filtersBottomSheetFragment) {
            C11617f.m4590a(filtersBottomSheetFragment);
            return new C12927x1(this.f33591a, filtersBottomSheetFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w2 */
    /* loaded from: classes2.dex */
    public static final class C12919w2 implements InterfaceC13377s0.InterfaceC13378a {

        /* renamed from: a */
        private final C12636e f33592a;

        private C12919w2(C12636e c12636e) {
            this.f33592a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13377s0 mo2891c(LoyaltyPendingActivity loyaltyPendingActivity) {
            C11617f.m4590a(loyaltyPendingActivity);
            return new C12928x2(this.f33592a, loyaltyPendingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w3 */
    /* loaded from: classes2.dex */
    public static final class C12920w3 implements InterfaceC13247e1.InterfaceC13248a {

        /* renamed from: a */
        private final C12636e f33593a;

        private C12920w3(C12636e c12636e) {
            this.f33593a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13247e1 mo2891c(OnboardingNotificationActivity onboardingNotificationActivity) {
            C11617f.m4590a(onboardingNotificationActivity);
            return new C12929x3(this.f33593a, onboardingNotificationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w4 */
    /* loaded from: classes2.dex */
    public static final class C12921w4 implements InterfaceC13347o1.InterfaceC13348a {

        /* renamed from: a */
        private final C12636e f33594a;

        private C12921w4(C12636e c12636e) {
            this.f33594a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13347o1 mo2891c(PurchaseListActivity purchaseListActivity) {
            C11617f.m4590a(purchaseListActivity);
            return new C12930x4(this.f33594a, purchaseListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w5 */
    /* loaded from: classes2.dex */
    public static final class C12922w5 implements InterfaceC13419x1.InterfaceC13420a {

        /* renamed from: a */
        private final C12636e f33595a;

        private C12922w5(C12636e c12636e) {
            this.f33595a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13419x1 mo2891c(SmsValidationActivity smsValidationActivity) {
            C11617f.m4590a(smsValidationActivity);
            return new C12931x5(this.f33595a, smsValidationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w6 */
    /* loaded from: classes2.dex */
    public static final class C12923w6 implements InterfaceC13309k2.InterfaceC13310a {

        /* renamed from: a */
        private final C12636e f33596a;

        private C12923w6(C12636e c12636e) {
            this.f33596a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13309k2 mo2891c(TakeAwayStoreDetailActivity takeAwayStoreDetailActivity) {
            C11617f.m4590a(takeAwayStoreDetailActivity);
            return new C12932x6(this.f33596a, takeAwayStoreDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$w7 */
    /* loaded from: classes2.dex */
    public static final class C12924w7 implements InterfaceC13413w2.InterfaceC13414a {

        /* renamed from: a */
        private final C12636e f33597a;

        private C12924w7(C12636e c12636e) {
            this.f33597a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13413w2 mo2891c(VirtualCardSuccessActivity virtualCardSuccessActivity) {
            C11617f.m4590a(virtualCardSuccessActivity);
            return new C12933x7(this.f33597a, virtualCardSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x */
    /* loaded from: classes2.dex */
    public static final class C12925x implements InterfaceC13221b3.InterfaceC13222a {

        /* renamed from: a */
        private final C12636e f33598a;

        private C12925x(C12636e c12636e) {
            this.f33598a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13221b3 mo2891c(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
            C11617f.m4590a(benefitsDetailsBottomSheetFragment);
            return new C12934y(this.f33598a, benefitsDetailsBottomSheetFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x0 */
    /* loaded from: classes2.dex */
    public static final class C12926x0 implements InterfaceC13231c3.InterfaceC13232a {

        /* renamed from: a */
        private final C12636e f33599a;

        private C12926x0(C12636e c12636e) {
            this.f33599a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13231c3 mo2891c(DefaultStoreListFragment defaultStoreListFragment) {
            C11617f.m4590a(defaultStoreListFragment);
            return new C12935y0(this.f33599a, defaultStoreListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x1 */
    /* loaded from: classes2.dex */
    public static final class C12927x1 implements InterfaceC13251e3 {

        /* renamed from: a */
        private final C12636e f33600a;

        private C12927x1(C12636e c12636e, FiltersBottomSheetFragment filtersBottomSheetFragment) {
            this.f33600a = c12636e;
        }

        /* renamed from: b */
        private fj.FiltersBottomSheetFragment m2106b() {
            return new fj.FiltersBottomSheetFragment((ResourcesProvider) this.f33600a.f32703B1.mo42226get(), (C7256f1) this.f33600a.f32756O2.mo42226get(), (C7310l) this.f33600a.f32744L2.mo42226get());
        }

        /* renamed from: d */
        private FiltersBottomSheetFragment m2104d(FiltersBottomSheetFragment filtersBottomSheetFragment) {
            C5537i.m23778a(filtersBottomSheetFragment, this.f33600a.m2750Y());
            C5537i.m23777b(filtersBottomSheetFragment, m2106b());
            return filtersBottomSheetFragment;
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(FiltersBottomSheetFragment filtersBottomSheetFragment) {
            m2104d(filtersBottomSheetFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x2 */
    /* loaded from: classes2.dex */
    public static final class C12928x2 implements InterfaceC13377s0 {

        /* renamed from: a */
        private final C12636e f33601a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyPendingActivity> f33602b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33603c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33604d;

        /* renamed from: e */
        private C5942d f33605e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33606f;

        private C12928x2(C12636e c12636e, LoyaltyPendingActivity loyaltyPendingActivity) {
            this.f33601a = c12636e;
            m2103b(loyaltyPendingActivity);
        }

        /* renamed from: b */
        private void m2103b(LoyaltyPendingActivity loyaltyPendingActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyPendingActivity);
            this.f33602b = m4594a;
            this.f33603c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33601a.f32704B2, this.f33601a.f32708C2, this.f33601a.f32712D2));
            this.f33604d = C11613b.m4596a(C5975c.m22544a(this.f33601a.f32703B1));
            C5942d m22641a = C5942d.m22641a(this.f33601a.f32703B1, this.f33601a.f32780U2, this.f33601a.f32740K2);
            this.f33605e = m22641a;
            this.f33606f = C5943e.m22637c(m22641a);
        }

        /* renamed from: d */
        private LoyaltyPendingActivity m2101d(LoyaltyPendingActivity loyaltyPendingActivity) {
            C11205c.m5751a(loyaltyPendingActivity, this.f33601a.m2750Y());
            C5921e.m22726a(loyaltyPendingActivity, this.f33603c.mo42226get());
            C13872m.m123d(loyaltyPendingActivity, this.f33604d.mo42226get());
            C13872m.m125b(loyaltyPendingActivity, (AuthManager) this.f33601a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyPendingActivity, (AppRatingManager) this.f33601a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyPendingActivity, (InterfaceC3954c) this.f33601a.f32720F2.mo42226get());
            C5937b.m22644a(loyaltyPendingActivity, m2099f());
            return loyaltyPendingActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2100e() {
            return Collections.singletonMap(LoyaltyPendingViewModel.class, (InterfaceC6657b) this.f33606f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2099f() {
            return new ViewModelFactoryByInjection(m2100e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyPendingActivity loyaltyPendingActivity) {
            m2101d(loyaltyPendingActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x3 */
    /* loaded from: classes2.dex */
    public static final class C12929x3 implements InterfaceC13247e1 {

        /* renamed from: a */
        private final C12636e f33607a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingNotificationActivity> f33608b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33609c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33610d;

        /* renamed from: e */
        private C13948f f33611e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33612f;

        private C12929x3(C12636e c12636e, OnboardingNotificationActivity onboardingNotificationActivity) {
            this.f33607a = c12636e;
            m2098b(onboardingNotificationActivity);
        }

        /* renamed from: b */
        private void m2098b(OnboardingNotificationActivity onboardingNotificationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingNotificationActivity);
            this.f33608b = m4594a;
            this.f33609c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33607a.f32704B2, this.f33607a.f32708C2, this.f33607a.f32712D2));
            this.f33610d = C11613b.m4596a(C5975c.m22544a(this.f33607a.f32703B1));
            C13948f m17a = C13948f.m17a(this.f33607a.f32703B1, this.f33607a.f32700A2, this.f33607a.f32740K2, this.f33607a.f32791X1, this.f33607a.f32796Y2, this.f33607a.f32771S1, this.f33607a.f32740K2);
            this.f33611e = m17a;
            this.f33612f = C13949g.m13b(m17a);
        }

        /* renamed from: d */
        private OnboardingNotificationActivity m2096d(OnboardingNotificationActivity onboardingNotificationActivity) {
            C11205c.m5751a(onboardingNotificationActivity, this.f33607a.m2750Y());
            C5921e.m22726a(onboardingNotificationActivity, this.f33609c.mo42226get());
            C13872m.m123d(onboardingNotificationActivity, this.f33610d.mo42226get());
            C13872m.m125b(onboardingNotificationActivity, (AuthManager) this.f33607a.f32700A2.mo42226get());
            C13872m.m126a(onboardingNotificationActivity, (AppRatingManager) this.f33607a.f32716E2.mo42226get());
            C13872m.m124c(onboardingNotificationActivity, (InterfaceC3954c) this.f33607a.f32720F2.mo42226get());
            C13939b.m41a(onboardingNotificationActivity, m2094f());
            return onboardingNotificationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2095e() {
            return Collections.singletonMap(OnboardingNotificationViewModel.class, (InterfaceC6657b) this.f33612f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2094f() {
            return new ViewModelFactoryByInjection(m2095e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingNotificationActivity onboardingNotificationActivity) {
            m2096d(onboardingNotificationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x4 */
    /* loaded from: classes2.dex */
    public static final class C12930x4 implements InterfaceC13347o1 {

        /* renamed from: a */
        private final C12636e f33613a;

        /* renamed from: b */
        private InterfaceC12341a<PurchaseListActivity> f33614b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33615c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33616d;

        /* renamed from: e */
        private C6202k f33617e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33618f;

        private C12930x4(C12636e c12636e, PurchaseListActivity purchaseListActivity) {
            this.f33613a = c12636e;
            m2093b(purchaseListActivity);
        }

        /* renamed from: b */
        private void m2093b(PurchaseListActivity purchaseListActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(purchaseListActivity);
            this.f33614b = m4594a;
            this.f33615c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33613a.f32704B2, this.f33613a.f32708C2, this.f33613a.f32712D2));
            this.f33616d = C11613b.m4596a(C5975c.m22544a(this.f33613a.f32703B1));
            C6202k m21913a = C6202k.m21913a(this.f33613a.f32703B1, this.f33613a.f32780U2, this.f33613a.f32880p3, this.f33613a.f32740K2);
            this.f33617e = m21913a;
            this.f33618f = C6203l.m21909c(m21913a);
        }

        /* renamed from: d */
        private PurchaseListActivity m2091d(PurchaseListActivity purchaseListActivity) {
            C11205c.m5751a(purchaseListActivity, this.f33613a.m2750Y());
            C5921e.m22726a(purchaseListActivity, this.f33615c.mo42226get());
            C13872m.m123d(purchaseListActivity, this.f33616d.mo42226get());
            C13872m.m125b(purchaseListActivity, (AuthManager) this.f33613a.f32700A2.mo42226get());
            C13872m.m126a(purchaseListActivity, (AppRatingManager) this.f33613a.f32716E2.mo42226get());
            C13872m.m124c(purchaseListActivity, (InterfaceC3954c) this.f33613a.f32720F2.mo42226get());
            C6188f.m21955a(purchaseListActivity, m2089f());
            return purchaseListActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2090e() {
            return Collections.singletonMap(PurchaseListViewModel.class, (InterfaceC6657b) this.f33618f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2089f() {
            return new ViewModelFactoryByInjection(m2090e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PurchaseListActivity purchaseListActivity) {
            m2091d(purchaseListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x5 */
    /* loaded from: classes2.dex */
    public static final class C12931x5 implements InterfaceC13419x1 {

        /* renamed from: a */
        private final C12636e f33619a;

        /* renamed from: b */
        private InterfaceC12341a<SmsValidationActivity> f33620b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33621c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33622d;

        /* renamed from: e */
        private C10639d f33623e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33624f;

        private C12931x5(C12636e c12636e, SmsValidationActivity smsValidationActivity) {
            this.f33619a = c12636e;
            m2088b(smsValidationActivity);
        }

        /* renamed from: b */
        private void m2088b(SmsValidationActivity smsValidationActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(smsValidationActivity);
            this.f33620b = m4594a;
            this.f33621c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33619a.f32704B2, this.f33619a.f32708C2, this.f33619a.f32712D2));
            this.f33622d = C11613b.m4596a(C5975c.m22544a(this.f33619a.f32703B1));
            C10639d m7437a = C10639d.m7437a(this.f33619a.f32703B1, this.f33619a.f32711D1, this.f33619a.f32784V2, this.f33619a.f32796Y2, this.f33619a.f32780U2, this.f33619a.f32815c3, this.f33619a.f32771S1, this.f33619a.f32740K2);
            this.f33623e = m7437a;
            this.f33624f = C10640e.m7433c(m7437a);
        }

        /* renamed from: d */
        private SmsValidationActivity m2086d(SmsValidationActivity smsValidationActivity) {
            C11205c.m5751a(smsValidationActivity, this.f33619a.m2750Y());
            C5921e.m22726a(smsValidationActivity, this.f33621c.mo42226get());
            C13872m.m123d(smsValidationActivity, this.f33622d.mo42226get());
            C13872m.m125b(smsValidationActivity, (AuthManager) this.f33619a.f32700A2.mo42226get());
            C13872m.m126a(smsValidationActivity, (AppRatingManager) this.f33619a.f32716E2.mo42226get());
            C13872m.m124c(smsValidationActivity, (InterfaceC3954c) this.f33619a.f32720F2.mo42226get());
            C10635b.m7449a(smsValidationActivity, m2084f());
            return smsValidationActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2085e() {
            return Collections.singletonMap(SmsValidationViewModel.class, (InterfaceC6657b) this.f33624f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2084f() {
            return new ViewModelFactoryByInjection(m2085e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(SmsValidationActivity smsValidationActivity) {
            m2086d(smsValidationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x6 */
    /* loaded from: classes2.dex */
    public static final class C12932x6 implements InterfaceC13309k2 {

        /* renamed from: a */
        private final C12636e f33625a;

        /* renamed from: b */
        private InterfaceC12341a<TakeAwayStoreDetailActivity> f33626b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33627c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33628d;

        /* renamed from: e */
        private C13013d f33629e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33630f;

        private C12932x6(C12636e c12636e, TakeAwayStoreDetailActivity takeAwayStoreDetailActivity) {
            this.f33625a = c12636e;
            m2083b(takeAwayStoreDetailActivity);
        }

        /* renamed from: b */
        private void m2083b(TakeAwayStoreDetailActivity takeAwayStoreDetailActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(takeAwayStoreDetailActivity);
            this.f33626b = m4594a;
            this.f33627c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33625a.f32704B2, this.f33625a.f32708C2, this.f33625a.f32712D2));
            this.f33628d = C11613b.m4596a(C5975c.m22544a(this.f33625a.f32703B1));
            C13013d m1919a = C13013d.m1919a(this.f33625a.f32703B1, this.f33625a.f32724G2, this.f33625a.f32865m3, this.f33625a.f32740K2);
            this.f33629e = m1919a;
            this.f33630f = C13014e.m1916b(m1919a);
        }

        /* renamed from: d */
        private TakeAwayStoreDetailActivity m2081d(TakeAwayStoreDetailActivity takeAwayStoreDetailActivity) {
            C11205c.m5751a(takeAwayStoreDetailActivity, this.f33625a.m2750Y());
            C5921e.m22726a(takeAwayStoreDetailActivity, this.f33627c.mo42226get());
            C13872m.m123d(takeAwayStoreDetailActivity, this.f33628d.mo42226get());
            C13872m.m125b(takeAwayStoreDetailActivity, (AuthManager) this.f33625a.f32700A2.mo42226get());
            C13872m.m126a(takeAwayStoreDetailActivity, (AppRatingManager) this.f33625a.f32716E2.mo42226get());
            C13872m.m124c(takeAwayStoreDetailActivity, (InterfaceC3954c) this.f33625a.f32720F2.mo42226get());
            C6681b.m20295a(takeAwayStoreDetailActivity, (TransactionCacheManager) this.f33625a.f32724G2.mo42226get());
            C13012b.m1922a(takeAwayStoreDetailActivity, m2079f());
            return takeAwayStoreDetailActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2080e() {
            return Collections.singletonMap(TakeAwayStoreDetailViewModel.class, (InterfaceC6657b) this.f33630f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2079f() {
            return new ViewModelFactoryByInjection(m2080e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayStoreDetailActivity takeAwayStoreDetailActivity) {
            m2081d(takeAwayStoreDetailActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$x7 */
    /* loaded from: classes2.dex */
    public static final class C12933x7 implements InterfaceC13413w2 {

        /* renamed from: a */
        private final C12636e f33631a;

        /* renamed from: b */
        private InterfaceC12341a<VirtualCardSuccessActivity> f33632b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33633c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33634d;

        /* renamed from: e */
        private C13463r f33635e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33636f;

        private C12933x7(C12636e c12636e, VirtualCardSuccessActivity virtualCardSuccessActivity) {
            this.f33631a = c12636e;
            m2078b(virtualCardSuccessActivity);
        }

        /* renamed from: b */
        private void m2078b(VirtualCardSuccessActivity virtualCardSuccessActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(virtualCardSuccessActivity);
            this.f33632b = m4594a;
            this.f33633c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33631a.f32704B2, this.f33631a.f32708C2, this.f33631a.f32712D2));
            this.f33634d = C11613b.m4596a(C5975c.m22544a(this.f33631a.f32703B1));
            C13463r m1342a = C13463r.m1342a(this.f33631a.f32703B1, this.f33631a.f32771S1, this.f33631a.f32740K2);
            this.f33635e = m1342a;
            this.f33636f = C13464s.m1339b(m1342a);
        }

        /* renamed from: d */
        private VirtualCardSuccessActivity m2076d(VirtualCardSuccessActivity virtualCardSuccessActivity) {
            C11205c.m5751a(virtualCardSuccessActivity, this.f33631a.m2750Y());
            C5921e.m22726a(virtualCardSuccessActivity, this.f33633c.mo42226get());
            C13872m.m123d(virtualCardSuccessActivity, this.f33634d.mo42226get());
            C13872m.m125b(virtualCardSuccessActivity, (AuthManager) this.f33631a.f32700A2.mo42226get());
            C13872m.m126a(virtualCardSuccessActivity, (AppRatingManager) this.f33631a.f32716E2.mo42226get());
            C13872m.m124c(virtualCardSuccessActivity, (InterfaceC3954c) this.f33631a.f32720F2.mo42226get());
            C13460o.m1348a(virtualCardSuccessActivity, m2074f());
            return virtualCardSuccessActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2075e() {
            return Collections.singletonMap(VirtualCardSuccessViewModel.class, (InterfaceC6657b) this.f33636f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2074f() {
            return new ViewModelFactoryByInjection(m2075e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(VirtualCardSuccessActivity virtualCardSuccessActivity) {
            m2076d(virtualCardSuccessActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y */
    /* loaded from: classes2.dex */
    public static final class C12934y implements InterfaceC13221b3 {

        /* renamed from: a */
        private final C12636e f33637a;

        private C12934y(C12636e c12636e, BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
            this.f33637a = c12636e;
        }

        /* renamed from: b */
        private fi.BenefitsDetailsBottomSheetFragment m2073b() {
            return new fi.BenefitsDetailsBottomSheetFragment((ResourcesProvider) this.f33637a.f32703B1.mo42226get(), new C5580d());
        }

        /* renamed from: d */
        private BenefitsDetailsBottomSheetFragment m2071d(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
            C5525d.m23791b(benefitsDetailsBottomSheetFragment, m2073b());
            C5525d.m23792a(benefitsDetailsBottomSheetFragment, this.f33637a.m2750Y());
            return benefitsDetailsBottomSheetFragment;
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
            m2071d(benefitsDetailsBottomSheetFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y0 */
    /* loaded from: classes2.dex */
    public static final class C12935y0 implements InterfaceC13231c3 {

        /* renamed from: a */
        private final C12636e f33638a;

        /* renamed from: b */
        private C11379e f33639b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33640c;

        private C12935y0(C12636e c12636e, DefaultStoreListFragment defaultStoreListFragment) {
            this.f33638a = c12636e;
            m2070b(defaultStoreListFragment);
        }

        /* renamed from: b */
        private void m2070b(DefaultStoreListFragment defaultStoreListFragment) {
            C11379e m5287a = C11379e.m5287a(this.f33638a.f32703B1, this.f33638a.f32736J2, this.f33638a.f32740K2);
            this.f33639b = m5287a;
            this.f33640c = C11380f.m5283c(m5287a);
        }

        /* renamed from: d */
        private DefaultStoreListFragment m2068d(DefaultStoreListFragment defaultStoreListFragment) {
            C11207e.m5748a(defaultStoreListFragment, this.f33638a.m2750Y());
            C13005b.m1941a(defaultStoreListFragment, (TransactionCacheManager) this.f33638a.f32724G2.mo42226get());
            C13005b.m1940b(defaultStoreListFragment, m2066f());
            return defaultStoreListFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2067e() {
            return Collections.singletonMap(DefaultStoreViewModel.class, (InterfaceC6657b) this.f33640c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2066f() {
            return new ViewModelFactoryByInjection(m2067e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(DefaultStoreListFragment defaultStoreListFragment) {
            m2068d(defaultStoreListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y1 */
    /* loaded from: classes2.dex */
    public static final class C12936y1 implements InterfaceC13275h0.InterfaceC13276a {

        /* renamed from: a */
        private final C12636e f33641a;

        private C12936y1(C12636e c12636e) {
            this.f33641a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13275h0 mo2891c(FlyerActivity flyerActivity) {
            C11617f.m4590a(flyerActivity);
            return new C12945z1(this.f33641a, flyerActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y2 */
    /* loaded from: classes2.dex */
    public static final class C12937y2 implements InterfaceC13385t0.InterfaceC13386a {

        /* renamed from: a */
        private final C12636e f33642a;

        private C12937y2(C12636e c12636e) {
            this.f33642a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13385t0 mo2891c(LoyaltyRemovedActivity loyaltyRemovedActivity) {
            C11617f.m4590a(loyaltyRemovedActivity);
            return new C12946z2(this.f33642a, loyaltyRemovedActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y3 */
    /* loaded from: classes2.dex */
    public static final class C12938y3 implements InterfaceC13257f1.InterfaceC13258a {

        /* renamed from: a */
        private final C12636e f33643a;

        private C12938y3(C12636e c12636e) {
            this.f33643a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13257f1 mo2891c(OnboardingOtherUserCardTutorialActivity onboardingOtherUserCardTutorialActivity) {
            C11617f.m4590a(onboardingOtherUserCardTutorialActivity);
            return new C12947z3(this.f33643a, onboardingOtherUserCardTutorialActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y4 */
    /* loaded from: classes2.dex */
    public static final class C12939y4 implements InterfaceC13355p1.InterfaceC13356a {

        /* renamed from: a */
        private final C12636e f33644a;

        private C12939y4(C12636e c12636e) {
            this.f33644a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13355p1 mo2891c(PurchaseProductsActivity purchaseProductsActivity) {
            C11617f.m4590a(purchaseProductsActivity);
            return new C12948z4(this.f33644a, purchaseProductsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y5 */
    /* loaded from: classes2.dex */
    public static final class C12940y5 implements InterfaceC13427y1.InterfaceC13428a {

        /* renamed from: a */
        private final C12636e f33645a;

        private C12940y5(C12636e c12636e) {
            this.f33645a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13427y1 mo2891c(SplashActivity splashActivity) {
            C11617f.m4590a(splashActivity);
            return new C12949z5(this.f33645a, splashActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y6 */
    /* loaded from: classes2.dex */
    public static final class C12941y6 implements InterfaceC13321l3.InterfaceC13322a {

        /* renamed from: a */
        private final C12636e f33646a;

        private C12941y6(C12636e c12636e) {
            this.f33646a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13321l3 mo2891c(TakeAwayStoreListFragment takeAwayStoreListFragment) {
            C11617f.m4590a(takeAwayStoreListFragment);
            return new C12950z6(this.f33646a, takeAwayStoreListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$y7 */
    /* loaded from: classes2.dex */
    public static final class C12942y7 implements InterfaceC13421x2.InterfaceC13422a {

        /* renamed from: a */
        private final C12636e f33647a;

        private C12942y7(C12636e c12636e) {
            this.f33647a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13421x2 mo2891c(WineClubHomeActivity wineClubHomeActivity) {
            C11617f.m4590a(wineClubHomeActivity);
            return new C12951z7(this.f33647a, wineClubHomeActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z */
    /* loaded from: classes2.dex */
    public static final class C12943z implements InterfaceC13293j.InterfaceC13294a {

        /* renamed from: a */
        private final C12636e f33648a;

        private C12943z(C12636e c12636e) {
            this.f33648a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13293j mo2891c(CacheActivity cacheActivity) {
            C11617f.m4590a(cacheActivity);
            return new C12597a0(this.f33648a, cacheActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z0 */
    /* loaded from: classes2.dex */
    public static final class C12944z0 implements InterfaceC13241d3.InterfaceC13242a {

        /* renamed from: a */
        private final C12636e f33649a;

        private C12944z0(C12636e c12636e) {
            this.f33649a = c12636e;
        }

        @Override // dagger.android.InterfaceC4768a.InterfaceC4769a
        /* renamed from: c */
        public InterfaceC13241d3 mo2891c(DefaultStoreMapFragment defaultStoreMapFragment) {
            C11617f.m4590a(defaultStoreMapFragment);
            return new C12598a1(this.f33649a, defaultStoreMapFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z1 */
    /* loaded from: classes2.dex */
    public static final class C12945z1 implements InterfaceC13275h0 {

        /* renamed from: a */
        private final C12636e f33650a;

        /* renamed from: b */
        private InterfaceC12341a<FlyerActivity> f33651b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33652c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33653d;

        /* renamed from: e */
        private C10232h f33654e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33655f;

        private C12945z1(C12636e c12636e, FlyerActivity flyerActivity) {
            this.f33650a = c12636e;
            m2056b(flyerActivity);
        }

        /* renamed from: b */
        private void m2056b(FlyerActivity flyerActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(flyerActivity);
            this.f33651b = m4594a;
            this.f33652c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33650a.f32704B2, this.f33650a.f32708C2, this.f33650a.f32712D2));
            this.f33653d = C11613b.m4596a(C5975c.m22544a(this.f33650a.f32703B1));
            C10232h m8449a = C10232h.m8449a(this.f33650a.f32703B1, this.f33650a.f32756O2, this.f33650a.f32744L2, this.f33650a.f32740K2);
            this.f33654e = m8449a;
            this.f33655f = C10233i.m8445c(m8449a);
        }

        /* renamed from: d */
        private FlyerActivity m2054d(FlyerActivity flyerActivity) {
            C11205c.m5751a(flyerActivity, this.f33650a.m2750Y());
            C5921e.m22726a(flyerActivity, this.f33652c.mo42226get());
            C13872m.m123d(flyerActivity, this.f33653d.mo42226get());
            C13872m.m125b(flyerActivity, (AuthManager) this.f33650a.f32700A2.mo42226get());
            C13872m.m126a(flyerActivity, (AppRatingManager) this.f33650a.f32716E2.mo42226get());
            C13872m.m124c(flyerActivity, (InterfaceC3954c) this.f33650a.f32720F2.mo42226get());
            C10231f.m8453d(flyerActivity, (StoreManager) this.f33650a.f32736J2.mo42226get());
            C10231f.m8455b(flyerActivity, (TransactionCacheManager) this.f33650a.f32724G2.mo42226get());
            C10231f.m8456a(flyerActivity, (AnalyticsManager) this.f33650a.f32771S1.mo42226get());
            C10231f.m8454c(flyerActivity, m2052f());
            return flyerActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2053e() {
            return Collections.singletonMap(FlyerViewModel.class, (InterfaceC6657b) this.f33655f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2052f() {
            return new ViewModelFactoryByInjection(m2053e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(FlyerActivity flyerActivity) {
            m2054d(flyerActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z2 */
    /* loaded from: classes2.dex */
    public static final class C12946z2 implements InterfaceC13385t0 {

        /* renamed from: a */
        private final C12636e f33656a;

        /* renamed from: b */
        private InterfaceC12341a<LoyaltyRemovedActivity> f33657b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33658c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33659d;

        /* renamed from: e */
        private C10630e f33660e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33661f;

        private C12946z2(C12636e c12636e, LoyaltyRemovedActivity loyaltyRemovedActivity) {
            this.f33656a = c12636e;
            m2051b(loyaltyRemovedActivity);
        }

        /* renamed from: b */
        private void m2051b(LoyaltyRemovedActivity loyaltyRemovedActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(loyaltyRemovedActivity);
            this.f33657b = m4594a;
            this.f33658c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33656a.f32704B2, this.f33656a.f32708C2, this.f33656a.f32712D2));
            this.f33659d = C11613b.m4596a(C5975c.m22544a(this.f33656a.f32703B1));
            C10630e m7463a = C10630e.m7463a(this.f33656a.f32703B1, this.f33656a.f32740K2);
            this.f33660e = m7463a;
            this.f33661f = C10631f.m7459c(m7463a);
        }

        /* renamed from: d */
        private LoyaltyRemovedActivity m2049d(LoyaltyRemovedActivity loyaltyRemovedActivity) {
            C11205c.m5751a(loyaltyRemovedActivity, this.f33656a.m2750Y());
            C5921e.m22726a(loyaltyRemovedActivity, this.f33658c.mo42226get());
            C13872m.m123d(loyaltyRemovedActivity, this.f33659d.mo42226get());
            C13872m.m125b(loyaltyRemovedActivity, (AuthManager) this.f33656a.f32700A2.mo42226get());
            C13872m.m126a(loyaltyRemovedActivity, (AppRatingManager) this.f33656a.f32716E2.mo42226get());
            C13872m.m124c(loyaltyRemovedActivity, (InterfaceC3954c) this.f33656a.f32720F2.mo42226get());
            C10627b.m7464a(loyaltyRemovedActivity, m2047f());
            return loyaltyRemovedActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2048e() {
            return Collections.singletonMap(LoyaltyRemovedViewModel.class, (InterfaceC6657b) this.f33661f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2047f() {
            return new ViewModelFactoryByInjection(m2048e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(LoyaltyRemovedActivity loyaltyRemovedActivity) {
            m2049d(loyaltyRemovedActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z3 */
    /* loaded from: classes2.dex */
    public static final class C12947z3 implements InterfaceC13257f1 {

        /* renamed from: a */
        private final C12636e f33662a;

        /* renamed from: b */
        private InterfaceC12341a<OnboardingOtherUserCardTutorialActivity> f33663b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33664c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33665d;

        /* renamed from: e */
        private C12197u f33666e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33667f;

        private C12947z3(C12636e c12636e, OnboardingOtherUserCardTutorialActivity onboardingOtherUserCardTutorialActivity) {
            this.f33662a = c12636e;
            m2046b(onboardingOtherUserCardTutorialActivity);
        }

        /* renamed from: b */
        private void m2046b(OnboardingOtherUserCardTutorialActivity onboardingOtherUserCardTutorialActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(onboardingOtherUserCardTutorialActivity);
            this.f33663b = m4594a;
            this.f33664c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33662a.f32704B2, this.f33662a.f32708C2, this.f33662a.f32712D2));
            this.f33665d = C11613b.m4596a(C5975c.m22544a(this.f33662a.f32703B1));
            C12197u m3418a = C12197u.m3418a(this.f33662a.f32703B1, this.f33662a.f32771S1, this.f33662a.f32740K2);
            this.f33666e = m3418a;
            this.f33667f = C12198v.m3414c(m3418a);
        }

        /* renamed from: d */
        private OnboardingOtherUserCardTutorialActivity m2044d(OnboardingOtherUserCardTutorialActivity onboardingOtherUserCardTutorialActivity) {
            C11205c.m5751a(onboardingOtherUserCardTutorialActivity, this.f33662a.m2750Y());
            C5921e.m22726a(onboardingOtherUserCardTutorialActivity, this.f33664c.mo42226get());
            C13872m.m123d(onboardingOtherUserCardTutorialActivity, this.f33665d.mo42226get());
            C13872m.m125b(onboardingOtherUserCardTutorialActivity, (AuthManager) this.f33662a.f32700A2.mo42226get());
            C13872m.m126a(onboardingOtherUserCardTutorialActivity, (AppRatingManager) this.f33662a.f32716E2.mo42226get());
            C13872m.m124c(onboardingOtherUserCardTutorialActivity, (InterfaceC3954c) this.f33662a.f32720F2.mo42226get());
            C12194r.m3426a(onboardingOtherUserCardTutorialActivity, m2042f());
            return onboardingOtherUserCardTutorialActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2043e() {
            return Collections.singletonMap(OnboardingOtherUserCardTutorialViewModel.class, (InterfaceC6657b) this.f33667f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2042f() {
            return new ViewModelFactoryByInjection(m2043e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(OnboardingOtherUserCardTutorialActivity onboardingOtherUserCardTutorialActivity) {
            m2044d(onboardingOtherUserCardTutorialActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z4 */
    /* loaded from: classes2.dex */
    public static final class C12948z4 implements InterfaceC13355p1 {

        /* renamed from: a */
        private final C12636e f33668a;

        /* renamed from: b */
        private InterfaceC12341a<PurchaseProductsActivity> f33669b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33670c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33671d;

        /* renamed from: e */
        private C6534j f33672e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33673f;

        private C12948z4(C12636e c12636e, PurchaseProductsActivity purchaseProductsActivity) {
            this.f33668a = c12636e;
            m2041b(purchaseProductsActivity);
        }

        /* renamed from: b */
        private void m2041b(PurchaseProductsActivity purchaseProductsActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(purchaseProductsActivity);
            this.f33669b = m4594a;
            this.f33670c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33668a.f32704B2, this.f33668a.f32708C2, this.f33668a.f32712D2));
            this.f33671d = C11613b.m4596a(C5975c.m22544a(this.f33668a.f32703B1));
            C6534j m20683a = C6534j.m20683a(this.f33668a.f32703B1, this.f33668a.f32756O2, this.f33668a.f32880p3, this.f33668a.f32740K2);
            this.f33672e = m20683a;
            this.f33673f = C6535k.m20679c(m20683a);
        }

        /* renamed from: d */
        private PurchaseProductsActivity m2039d(PurchaseProductsActivity purchaseProductsActivity) {
            C11205c.m5751a(purchaseProductsActivity, this.f33668a.m2750Y());
            C5921e.m22726a(purchaseProductsActivity, this.f33670c.mo42226get());
            C13872m.m123d(purchaseProductsActivity, this.f33671d.mo42226get());
            C13872m.m125b(purchaseProductsActivity, (AuthManager) this.f33668a.f32700A2.mo42226get());
            C13872m.m126a(purchaseProductsActivity, (AppRatingManager) this.f33668a.f32716E2.mo42226get());
            C13872m.m124c(purchaseProductsActivity, (InterfaceC3954c) this.f33668a.f32720F2.mo42226get());
            C6527d.m20706a(purchaseProductsActivity, m2037f());
            return purchaseProductsActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2038e() {
            return Collections.singletonMap(PurchaseProductsViewModel.class, (InterfaceC6657b) this.f33673f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2037f() {
            return new ViewModelFactoryByInjection(m2038e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(PurchaseProductsActivity purchaseProductsActivity) {
            m2039d(purchaseProductsActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z5 */
    /* loaded from: classes2.dex */
    public static final class C12949z5 implements InterfaceC13427y1 {

        /* renamed from: a */
        private final C12636e f33674a;

        /* renamed from: b */
        private InterfaceC12341a<SplashActivity> f33675b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33676c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33677d;

        /* renamed from: e */
        private C5706d f33678e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33679f;

        private C12949z5(C12636e c12636e, SplashActivity splashActivity) {
            this.f33674a = c12636e;
            m2036b(splashActivity);
        }

        /* renamed from: b */
        private void m2036b(SplashActivity splashActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(splashActivity);
            this.f33675b = m4594a;
            this.f33676c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33674a.f32704B2, this.f33674a.f32708C2, this.f33674a.f32712D2));
            this.f33677d = C11613b.m4596a(C5975c.m22544a(this.f33674a.f32703B1));
            C5706d m23295a = C5706d.m23295a(this.f33674a.f32703B1, this.f33674a.f32700A2, this.f33674a.f32756O2, this.f33674a.f32724G2, this.f33674a.f32768R2, this.f33674a.f32740K2, this.f33674a.f32740K2);
            this.f33678e = m23295a;
            this.f33679f = C5707e.m23291c(m23295a);
        }

        /* renamed from: d */
        private SplashActivity m2034d(SplashActivity splashActivity) {
            C11205c.m5751a(splashActivity, this.f33674a.m2750Y());
            C5921e.m22726a(splashActivity, this.f33676c.mo42226get());
            C13872m.m123d(splashActivity, this.f33677d.mo42226get());
            C13872m.m125b(splashActivity, (AuthManager) this.f33674a.f32700A2.mo42226get());
            C13872m.m126a(splashActivity, (AppRatingManager) this.f33674a.f32716E2.mo42226get());
            C13872m.m124c(splashActivity, (InterfaceC3954c) this.f33674a.f32720F2.mo42226get());
            C5702b.m23304a(splashActivity, (AnalyticsManager) this.f33674a.f32771S1.mo42226get());
            C5702b.m23303b(splashActivity, m2032f());
            return splashActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2033e() {
            return Collections.singletonMap(SplashViewModel.class, (InterfaceC6657b) this.f33679f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2032f() {
            return new ViewModelFactoryByInjection(m2033e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(SplashActivity splashActivity) {
            m2034d(splashActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z6 */
    /* loaded from: classes2.dex */
    public static final class C12950z6 implements InterfaceC13321l3 {

        /* renamed from: a */
        private final C12636e f33680a;

        /* renamed from: b */
        private C12207e f33681b;

        /* renamed from: c */
        private InterfaceC12341a<Object> f33682c;

        private C12950z6(C12636e c12636e, TakeAwayStoreListFragment takeAwayStoreListFragment) {
            this.f33680a = c12636e;
            m2031b(takeAwayStoreListFragment);
        }

        /* renamed from: b */
        private void m2031b(TakeAwayStoreListFragment takeAwayStoreListFragment) {
            C12207e m3393a = C12207e.m3393a(this.f33680a.f32703B1, this.f33680a.f32865m3, this.f33680a.f32736J2, this.f33680a.f32740K2);
            this.f33681b = m3393a;
            this.f33682c = C12208f.m3389c(m3393a);
        }

        /* renamed from: d */
        private TakeAwayStoreListFragment m2029d(TakeAwayStoreListFragment takeAwayStoreListFragment) {
            C11207e.m5748a(takeAwayStoreListFragment, this.f33680a.m2750Y());
            C13479b.m1296a(takeAwayStoreListFragment, (TransactionCacheManager) this.f33680a.f32724G2.mo42226get());
            C13479b.m1295b(takeAwayStoreListFragment, m2027f());
            return takeAwayStoreListFragment;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2028e() {
            return Collections.singletonMap(TakeAwayStoreViewModel.class, (InterfaceC6657b) this.f33682c.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2027f() {
            return new ViewModelFactoryByInjection(m2028e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(TakeAwayStoreListFragment takeAwayStoreListFragment) {
            m2029d(takeAwayStoreListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppComponent.java */
    /* renamed from: xg.x$z7 */
    /* loaded from: classes2.dex */
    public static final class C12951z7 implements InterfaceC13421x2 {

        /* renamed from: a */
        private final C12636e f33683a;

        /* renamed from: b */
        private InterfaceC12341a<WineClubHomeActivity> f33684b;

        /* renamed from: c */
        private InterfaceC12341a<UiWidgets> f33685c;

        /* renamed from: d */
        private InterfaceC12341a<SnackBarWidget> f33686d;

        /* renamed from: e */
        private C6490j f33687e;

        /* renamed from: f */
        private InterfaceC12341a<Object> f33688f;

        private C12951z7(C12636e c12636e, WineClubHomeActivity wineClubHomeActivity) {
            this.f33683a = c12636e;
            m2026b(wineClubHomeActivity);
        }

        /* renamed from: b */
        private void m2026b(WineClubHomeActivity wineClubHomeActivity) {
            InterfaceC11614c m4594a = C11615d.m4594a(wineClubHomeActivity);
            this.f33684b = m4594a;
            this.f33685c = C11613b.m4596a(C7049i.m19480a(m4594a, this.f33683a.f32704B2, this.f33683a.f32708C2, this.f33683a.f32712D2));
            this.f33686d = C11613b.m4596a(C5975c.m22544a(this.f33683a.f32703B1));
            C6490j m20830a = C6490j.m20830a(this.f33683a.f32703B1, this.f33683a.f32850j3, this.f33683a.f32771S1, this.f33683a.f32740K2);
            this.f33687e = m20830a;
            this.f33688f = C6493k.m20817c(m20830a);
        }

        /* renamed from: d */
        private WineClubHomeActivity m2024d(WineClubHomeActivity wineClubHomeActivity) {
            C11205c.m5751a(wineClubHomeActivity, this.f33683a.m2750Y());
            C5921e.m22726a(wineClubHomeActivity, this.f33685c.mo42226get());
            C13872m.m123d(wineClubHomeActivity, this.f33686d.mo42226get());
            C13872m.m125b(wineClubHomeActivity, (AuthManager) this.f33683a.f32700A2.mo42226get());
            C13872m.m126a(wineClubHomeActivity, (AppRatingManager) this.f33683a.f32716E2.mo42226get());
            C13872m.m124c(wineClubHomeActivity, (InterfaceC3954c) this.f33683a.f32720F2.mo42226get());
            C6479d.m20833b(wineClubHomeActivity, m2022f());
            C6479d.m20834a(wineClubHomeActivity, (ClubManager) this.f33683a.f32850j3.mo42226get());
            return wineClubHomeActivity;
        }

        /* renamed from: e */
        private Map<Class<? extends AbstractC1468o0>, InterfaceC6657b<? extends AbstractC1468o0>> m2023e() {
            return Collections.singletonMap(WineClubHomeViewModel.class, (InterfaceC6657b) this.f33688f.mo42226get());
        }

        /* renamed from: f */
        private ViewModelFactoryByInjection m2022f() {
            return new ViewModelFactoryByInjection(m2023e());
        }

        @Override // dagger.android.InterfaceC4768a
        /* renamed from: c */
        public void mo2889c(WineClubHomeActivity wineClubHomeActivity) {
            m2024d(wineClubHomeActivity);
        }
    }

    /* renamed from: a */
    public static InterfaceC12355a.InterfaceC12356a m2892a() {
        return new C12891t1();
    }
}
