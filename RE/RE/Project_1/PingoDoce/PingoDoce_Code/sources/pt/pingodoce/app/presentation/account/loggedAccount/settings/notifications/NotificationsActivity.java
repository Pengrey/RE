package pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12018t1;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import p494zh.C13808a1;
import p494zh.C13813b1;
import p494zh.C13818c1;
import p494zh.C13823d1;
import p494zh.C13828e1;
import p494zh.C13832f1;
import p494zh.C13923y0;
import p494zh.C13927z0;
import pe.C8617d;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity;

/* compiled from: NotificationsActivity.kt */
/* loaded from: classes2.dex */
public final class NotificationsActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23529f0;

    /* compiled from: NotificationsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$a */
    /* loaded from: classes2.dex */
    static final class C8899a extends AbstractC6438m implements InterfaceC6097a {
        C8899a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(NotificationsActivity.this.m13224k1(), NotificationsActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8900b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ NotificationsViewModel f23532x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$a */
        /* loaded from: classes2.dex */
        public static final class C8901a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23533w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23534x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8901a(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23533w = notificationsActivity;
                this.f23534x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13208a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13205d(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13207b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13204e(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13205d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13118m1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13204e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13118m1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23533w);
                NotificationsActivity notificationsActivity = this.f23533w;
                final NotificationsViewModel notificationsViewModel = this.f23534x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_flyer_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8901a.m13205d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8901a.m13204e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$b */
        /* loaded from: classes2.dex */
        public static final class C8902b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23535w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23536x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8902b(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23535w = notificationsActivity;
                this.f23536x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13203a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13200d(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13202b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13199e(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13200d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13114p1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13199e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13114p1().mo166p(Boolean.FALSE);
                notificationsViewModel.m13128e1();
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23535w);
                NotificationsActivity notificationsActivity = this.f23535w;
                final NotificationsViewModel notificationsViewModel = this.f23536x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_manual_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8902b.m13200d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8902b.m13199e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$c */
        /* loaded from: classes2.dex */
        public static final class C8903c extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23537w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23538x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8903c(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23537w = notificationsActivity;
                this.f23538x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13198a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13195d(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13197b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13194e(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13195d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13120k1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13194e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13120k1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23537w);
                NotificationsActivity notificationsActivity = this.f23537w;
                final NotificationsViewModel notificationsViewModel = this.f23538x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_benefits_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8903c.m13195d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8903c.m13194e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$d */
        /* loaded from: classes2.dex */
        public static final class C8904d extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23539w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23540x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8904d(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23539w = notificationsActivity;
                this.f23540x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13193a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13190d(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13192b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13189e(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13190d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13115o1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13189e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13115o1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23539w);
                NotificationsActivity notificationsActivity = this.f23539w;
                final NotificationsViewModel notificationsViewModel = this.f23540x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_pub_online_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8904d.m13190d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8904d.m13189e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$e */
        /* loaded from: classes2.dex */
        public static final class C8905e extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23541w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23542x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8905e(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23541w = notificationsActivity;
                this.f23542x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13188a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13184e(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13187b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13185d(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13185d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13112r1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13184e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13112r1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23541w);
                NotificationsActivity notificationsActivity = this.f23541w;
                final NotificationsViewModel notificationsViewModel = this.f23542x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_sms_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8905e.m13185d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8905e.m13184e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$f */
        /* loaded from: classes2.dex */
        public static final class C8906f extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23543w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23544x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8906f(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23543w = notificationsActivity;
                this.f23544x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13183a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13179e(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13182b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13180d(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13180d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13119l1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13179e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13119l1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23543w);
                NotificationsActivity notificationsActivity = this.f23543w;
                final NotificationsViewModel notificationsViewModel = this.f23544x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_email_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8906f.m13180d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8906f.m13179e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$g */
        /* loaded from: classes2.dex */
        public static final class C8907g extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23545w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23546x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8907g(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23545w = notificationsActivity;
                this.f23546x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13178a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13174e(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13177b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13175d(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13175d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13111s1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13174e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13111s1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23545w);
                NotificationsActivity notificationsActivity = this.f23545w;
                final NotificationsViewModel notificationsViewModel = this.f23546x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_orders_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8907g.m13175d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8907g.m13174e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationsActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$b$h */
        /* loaded from: classes2.dex */
        public static final class C8908h extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ NotificationsActivity f23547w;

            /* renamed from: x */
            final /* synthetic */ NotificationsViewModel f23548x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8908h(NotificationsActivity notificationsActivity, NotificationsViewModel notificationsViewModel) {
                super(0);
                this.f23547w = notificationsActivity;
                this.f23548x = notificationsViewModel;
            }

            /* renamed from: a */
            public static /* synthetic */ void m13173a(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13169e(notificationsViewModel, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m13172b(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                m13170d(notificationsViewModel, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m13170d(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13113q1().mo166p(Boolean.TRUE);
                notificationsViewModel.m13110t1().mo166p(Boolean.valueOf(notificationsViewModel.m13108u1()));
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m13169e(NotificationsViewModel notificationsViewModel, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(notificationsViewModel, "$viewModel");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                notificationsViewModel.m13113q1().mo166p(Boolean.FALSE);
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23547w);
                NotificationsActivity notificationsActivity = this.f23547w;
                final NotificationsViewModel notificationsViewModel = this.f23548x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_notifiations_confirmation, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_generic_header));
                ((TextView) inflate.findViewById(C2336R.C2338id.const_body)).setText(notificationsActivity.getString(C2336R.string.lbl_notification_confirmation_bottom_sheet_shopping_list_body));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.not_ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8908h.m13170d(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.ok_MaterialButton)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NotificationsActivity.C8900b.C8908h.m13169e(NotificationsViewModel.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8900b(NotificationsViewModel notificationsViewModel) {
            super(1);
            this.f23532x = notificationsViewModel;
        }

        /* renamed from: b */
        private static final DialogC3502a m13216b(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: c */
        private static final DialogC3502a m13215c(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: d */
        private static final DialogC3502a m13214d(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: e */
        private static final DialogC3502a m13213e(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: f */
        private static final DialogC3502a m13212f(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: g */
        private static final DialogC3502a m13211g(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: h */
        private static final DialogC3502a m13210h(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: i */
        private static final DialogC3502a m13209i(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: a */
        public final void m13217a(C13182l c13182l) {
            InterfaceC13178g m1464a;
            InterfaceC13178g m1464a2;
            InterfaceC13178g m1464a3;
            InterfaceC13178g m1464a4;
            InterfaceC13178g m1464a5;
            InterfaceC13178g m1464a6;
            InterfaceC13178g m1464a7;
            InterfaceC13178g m1464a8;
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13828e1) {
                m1464a8 = LazyJVM.m1464a(new C8905e(NotificationsActivity.this, this.f23532x));
                m13216b(m1464a8).show();
            } else if (interfaceC7186c instanceof C13923y0) {
                m1464a7 = LazyJVM.m1464a(new C8906f(NotificationsActivity.this, this.f23532x));
                m13215c(m1464a7).show();
            } else if (interfaceC7186c instanceof C13823d1) {
                m1464a6 = LazyJVM.m1464a(new C8907g(NotificationsActivity.this, this.f23532x));
                m13214d(m1464a6).show();
            } else if (interfaceC7186c instanceof C13832f1) {
                m1464a5 = LazyJVM.m1464a(new C8908h(NotificationsActivity.this, this.f23532x));
                m13213e(m1464a5).show();
            } else if (interfaceC7186c instanceof C13927z0) {
                m1464a4 = LazyJVM.m1464a(new C8901a(NotificationsActivity.this, this.f23532x));
                m13212f(m1464a4).show();
            } else if (interfaceC7186c instanceof C13813b1) {
                m1464a3 = LazyJVM.m1464a(new C8902b(NotificationsActivity.this, this.f23532x));
                m13211g(m1464a3).show();
            } else if (interfaceC7186c instanceof C13808a1) {
                m1464a2 = LazyJVM.m1464a(new C8903c(NotificationsActivity.this, this.f23532x));
                m13210h(m1464a2).show();
            } else if (interfaceC7186c instanceof C13818c1) {
                m1464a = LazyJVM.m1464a(new C8904d(NotificationsActivity.this, this.f23532x));
                m13209i(m1464a).show();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13217a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: NotificationsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8909c implements UiWidgets.InterfaceC7044a {
        C8909c() {
        }

        /* renamed from: a */
        public void m13168a(boolean z) {
            if (z) {
                return;
            }
            NotificationsActivity.m13226i1(NotificationsActivity.this);
        }
    }

    /* renamed from: i1 */
    public static final /* synthetic */ void m13226i1(NotificationsActivity notificationsActivity) {
        notificationsActivity.m13220n1();
    }

    /* renamed from: m1 */
    private final void m13222m1() {
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        String string = getString(C2336R.string.dialog_notifications_title);
        Intrinsics.checkIfNull(string, "getString(R.string.dialog_notifications_title)");
        String string2 = getString(C2336R.string.dialog_notifications_message);
        Intrinsics.checkIfNull(string2, "getString(R.string.dialog_notifications_message)");
        uiEventsLiveData.m19520j(string, string2, getString(C2336R.string.dialog_notifications_positive_label), getString(C2336R.string.dialog_notifications_negative_label), new C8909c());
    }

    /* renamed from: n1 */
    private final void m13220n1() {
        super.onBackPressed();
    }

    /* renamed from: G0 */
    protected int m13230G0() {
        return C2336R.string.lbl_settings_notifications;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13229J0() {
        return C6450z.m20906b(NotificationsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13228K0() {
        return new C8899a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: k1 */
    public final ViewModelFactoryByInjection m13224k1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23529f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m13227P0(AbstractC12018t1 abstractC12018t1, NotificationsViewModel notificationsViewModel) {
        Intrinsics.isThisObjectNull(abstractC12018t1, "binding");
        Intrinsics.isThisObjectNull(notificationsViewModel, "viewModel");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8900b(notificationsViewModel)));
    }

    /* renamed from: n */
    public boolean m13221n() {
        return true;
    }

    public void onBackPressed() {
        if (Intrinsics.equals(((NotificationsViewModel) m22758I0()).m13121j1().mo172f(), Boolean.TRUE)) {
            m13222m1();
        } else {
            m13220n1();
        }
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_notifications;
    }
}
