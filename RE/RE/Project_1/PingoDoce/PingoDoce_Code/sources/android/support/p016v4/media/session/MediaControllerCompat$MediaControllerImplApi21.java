package android.support.p016v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.AbstractC0261c;
import android.support.p016v4.media.session.InterfaceC0258b;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0901f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f564a;

    /* renamed from: b */
    private final List<AbstractC0261c> f565b;

    /* renamed from: c */
    private HashMap<AbstractC0261c, BinderC0249a> f566c;

    /* renamed from: d */
    final MediaSessionCompat.Token f567d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* loaded from: classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: w */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f568w;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f568w.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f564a) {
                mediaControllerCompat$MediaControllerImplApi21.f567d.m41443b(InterfaceC0258b.AbstractBinderC0259a.m41431s(C0901f.m39227a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f567d.m41442c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m41452a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0249a extends AbstractC0261c.BinderC0263b {
        BinderC0249a(AbstractC0261c abstractC0261c) {
            super(abstractC0261c);
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: R1 */
        public void mo41415R1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: T */
        public void mo41414T(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: n */
        public void mo41412n(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: o */
        public void mo41411o() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: u */
        public void mo41409u(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.AbstractC0261c.BinderC0263b, android.support.p016v4.media.session.InterfaceC0256a
        /* renamed from: w */
        public void mo41408w(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m41452a() {
        if (this.f567d.m41444a() == null) {
            return;
        }
        for (AbstractC0261c abstractC0261c : this.f565b) {
            BinderC0249a binderC0249a = new BinderC0249a(abstractC0261c);
            this.f566c.put(abstractC0261c, binderC0249a);
            abstractC0261c.f599b = binderC0249a;
            try {
                this.f567d.m41444a().mo41430O(binderC0249a);
                abstractC0261c.m41421i(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        this.f565b.clear();
    }
}
