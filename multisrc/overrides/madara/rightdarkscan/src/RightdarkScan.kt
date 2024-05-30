package eu.kanade.tachiyomi.revived.es.rightdarkscan

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.network.interceptor.rateLimit
import java.text.SimpleDateFormat
import java.util.Locale

class RightdarkScan : Madara(
    "Rightdark Scan",
    "https://rightdark-scan.com",
    "es",
    SimpleDateFormat("MMMM dd, yyyy", Locale("es")),
) {
    override val client = super.client.newBuilder()
        .rateLimit(2, 1)
        .build()

    override val useNewChapterEndpoint = true
}
