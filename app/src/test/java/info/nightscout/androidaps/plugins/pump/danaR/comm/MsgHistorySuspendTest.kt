package info.nightscout.androidaps.plugins.pump.danaR.comm

import info.nightscout.androidaps.danar.comm.MsgHistorySuspend
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MsgHistorySuspendTest : DanaRTestBase() {

    @Test fun runTest() {
<<<<<<< HEAD
        val packet = MsgHistorySuspend(aapsLogger, RxBusWrapper(aapsSchedulers), dateUtil)
=======
        val packet = MsgHistorySuspend(aapsLogger, RxBusWrapper(), dateUtil, databaseHelper)
>>>>>>> origin/dev
        // nothing left to test
    }
}