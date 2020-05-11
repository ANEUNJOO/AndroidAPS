package info.nightscout.androidaps.plugins.pump.danaR.comm

import info.nightscout.androidaps.danar.comm.MsgInitConnStatusBolus
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import info.nightscout.androidaps.utils.resources.ResourceHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MsgInitConnStatusBolusTest : DanaRTestBase() {

    @Mock lateinit var resourceHelper: ResourceHelper

    @Test fun runTest() {
<<<<<<< HEAD
        val packet = MsgInitConnStatusBolus(aapsLogger, RxBusWrapper(aapsSchedulers), resourceHelper, danaRPump)
=======
        val packet = MsgInitConnStatusBolus(aapsLogger, RxBusWrapper(), resourceHelper, danaPump)
>>>>>>> origin/dev

        // test message decoding
        var array = ByteArray(100)

        // message bigger than 22
        packet.handleMessage(array)
        Assert.assertEquals(true, packet.failed)
        array = ByteArray(20)
        putByteToArray(array, 0, 1)
        packet.handleMessage(array)
        Assert.assertEquals(true, danaPump.isExtendedBolusEnabled)
    }
}