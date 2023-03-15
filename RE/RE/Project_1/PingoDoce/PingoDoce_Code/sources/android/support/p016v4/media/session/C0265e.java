package android.support.p016v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
class C0265e {

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0266a {
        /* renamed from: a */
        void mo41406a(Object obj);

        /* renamed from: b */
        void mo41405b(int i, int i2, int i3, int i4, int i5);

        /* renamed from: c */
        void mo41404c(Object obj);

        /* renamed from: d */
        void mo41403d(String str, Bundle bundle);

        /* renamed from: n */
        void mo41402n(CharSequence charSequence);

        /* renamed from: o */
        void mo41401o();

        /* renamed from: u */
        void mo41400u(Bundle bundle);

        /* renamed from: w */
        void mo41399w(List<?> list);
    }

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$b */
    /* loaded from: classes.dex */
    static class C0267b<T extends InterfaceC0266a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f602a;

        public C0267b(T t) {
            this.f602a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f602a.mo41405b(playbackInfo.getPlaybackType(), C0268c.m41397b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m41451a(bundle);
            this.f602a.mo41400u(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f602a.mo41406a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f602a.mo41404c(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f602a.mo41399w(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f602a.mo41402n(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f602a.mo41401o();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m41451a(bundle);
            this.f602a.mo41403d(str, bundle);
        }
    }

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$c */
    /* loaded from: classes.dex */
    public static class C0268c {
        /* renamed from: a */
        public static AudioAttributes m41398a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m41397b(Object obj) {
            return m41396c(m41398a(obj));
        }

        /* renamed from: c */
        private static int m41396c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage != 13) {
                switch (usage) {
                    case 2:
                        return 0;
                    case 3:
                        return 8;
                    case 4:
                        return 4;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return 5;
                    case 6:
                        return 2;
                    default:
                        return 3;
                }
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static Object m41407a(InterfaceC0266a interfaceC0266a) {
        return new C0267b(interfaceC0266a);
    }
}
