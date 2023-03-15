package android.support.p016v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.C0265e;
import android.support.p016v4.media.session.InterfaceC0256a;
import android.support.p016v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0261c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f598a;

    /* renamed from: b */
    InterfaceC0256a f599b;

    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    private static class C0262a implements C0265e.InterfaceC0266a {

        /* renamed from: a */
        private final WeakReference<AbstractC0261c> f600a;

        C0262a(AbstractC0261c abstractC0261c) {
            this.f600a = new WeakReference<>(abstractC0261c);
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: a */
        public void mo41406a(Object obj) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41427c(MediaMetadataCompat.m41478a(obj));
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: b */
        public void mo41405b(int i, int i2, int i3, int i4, int i5) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41429a(new C0264d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: c */
        public void mo41404c(Object obj) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c == null || abstractC0261c.f599b != null) {
                return;
            }
            abstractC0261c.m41426d(PlaybackStateCompat.m41437a(obj));
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: d */
        public void mo41403d(String str, Bundle bundle) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                if (abstractC0261c.f599b == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0261c.m41422h(str, bundle);
                }
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: n */
        public void mo41402n(CharSequence charSequence) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41424f(charSequence);
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: o */
        public void mo41401o() {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41423g();
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: u */
        public void mo41400u(Bundle bundle) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41428b(bundle);
            }
        }

        @Override // android.support.p016v4.media.session.C0265e.InterfaceC0266a
        /* renamed from: w */
        public void mo41399w(List<?> list) {
            AbstractC0261c abstractC0261c = this.f600a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41425e(MediaSessionCompat.QueueItem.m41449b(list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class BinderC0263b extends InterfaceC0256a.AbstractBinderC0257a {

        /* renamed from: a */
        private final WeakReference<AbstractC0261c> f601a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC0263b(AbstractC0261c abstractC0261c) {
            this.f601a = new WeakReference<>(abstractC0261c);
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: A0 */
        public void mo41420A0(int i) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: E */
        public void mo41419E(String str, Bundle bundle) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(1, str, bundle);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: E0 */
        public void mo41418E0() throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(13, null, null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: I */
        public void mo41417I(boolean z) throws RemoteException {
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: J1 */
        public void mo41416J1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(2, playbackStateCompat, null);
            }
        }

        /* renamed from: R1 */
        public void mo41415R1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(4, parcelableVolumeInfo != null ? new C0264d(parcelableVolumeInfo.f576w, parcelableVolumeInfo.f577x, parcelableVolumeInfo.f578y, parcelableVolumeInfo.f579z, parcelableVolumeInfo.f575A) : null, null);
            }
        }

        /* renamed from: T */
        public void mo41414T(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: g0 */
        public void mo41413g0(int i) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(9, Integer.valueOf(i), null);
            }
        }

        /* renamed from: n */
        public void mo41412n(CharSequence charSequence) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(6, charSequence, null);
            }
        }

        /* renamed from: o */
        public void mo41411o() throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(8, null, null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: t1 */
        public void mo41410t1(boolean z) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(11, Boolean.valueOf(z), null);
            }
        }

        /* renamed from: u */
        public void mo41409u(Bundle bundle) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(7, bundle, null);
            }
        }

        /* renamed from: w */
        public void mo41408w(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            AbstractC0261c abstractC0261c = this.f601a.get();
            if (abstractC0261c != null) {
                abstractC0261c.m41421i(5, list, null);
            }
        }
    }

    public AbstractC0261c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f598a = C0265e.m41407a(new C0262a(this));
        } else {
            this.f599b = new BinderC0263b(this);
        }
    }

    /* renamed from: a */
    public void m41429a(C0264d c0264d) {
    }

    /* renamed from: b */
    public void m41428b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m41421i(8, null, null);
    }

    /* renamed from: c */
    public void m41427c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m41426d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m41425e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m41424f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m41423g() {
    }

    /* renamed from: h */
    public void m41422h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m41421i(int i, Object obj, Bundle bundle) {
    }
}
