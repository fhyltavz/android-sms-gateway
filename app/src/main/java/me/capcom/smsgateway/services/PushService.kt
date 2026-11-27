package me.capcom.smsgateway.services

import android.content.Context
import me.capcom.smsgateway.modules.gateway.workers.RegistrationWorker

/**
 * MyQR SMS Sender has no Firebase: the gateway reaches the phone over SSE only.
 * Registration still runs, just without a push token.
 */
object PushService {
    fun register(context: Context) {
        RegistrationWorker.start(context, null)
    }
}
