package com.monteiro.guessmovie;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class GCMNotificationIntentService extends FirebaseMessagingService {
// Sets an ID for the notification, so it can be updated


    public GCMNotificationIntentService() {
        super();
    }


    @Override
    public void onMessageReceived(RemoteMessage message) {

    }}
