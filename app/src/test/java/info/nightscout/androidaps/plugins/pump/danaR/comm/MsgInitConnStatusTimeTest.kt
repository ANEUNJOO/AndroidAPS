package info.nightscout.androidaps.plugins.pump.danaR.comm

import info.nightscout.androidaps.interfaces.CommandQueueProvider
import info.nightscout.androidaps.plugins.bus.RxBusWrapper
import info.nightscout.androidaps.plugins.configBuilder.ConfigBuilderPlugin
import info.nightscout.androidaps.danar.DanaRPlugin
import info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin
import info.nightscout.androidaps.danar.comm.MsgInitConnStatusTime
import info.nightscout.androidaps.utils.resources.ResourceHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
@PrepareForTest(info.nightscout.androidaps.danaRKorean.DanaRKoreanPlugin::class, info.nightscout.androidaps.danar.DanaRPlugin::class, ConfigBuilderPlugin::class)
class MsgInitConnStatusTimeTest : DanaRTestBase() {

    @Mock lateinit var resourceHelper: ResourceHelper
    @Mock lateinit var danaRPlugin: DanaRPlugin
    @Mock lateinit var danaRKoreanPlugin: DanaRKoreanPlugin
    @Mock lateinit var configBuilderPlugin: ConfigBuilderPlugin
    @Mock lateinit var commandQueue: CommandQueueProvider

    @Test fun runTest() {
<<<<<<< HEAD
        val packet = MsgInitConnStatusTime(aapsLogger, RxBusWrapper(aapsSchedulers), resourceHelper, danaRPump, danaRPlugin, danaRKoreanPlugin, configBuilderPlugin, commandQueue, dateUtil)
=======
        val packet = MsgInitConnStatusTime(aapsLogger, RxBusWrapper(), resourceHelper, danaPump, danaRPlugin, danaRKoreanPlugin, configBuilderPlugin, commandQueue, dateUtil)
>>>>>>> origin/dev

        // test message decoding
        packet.handleMessage(createArray(20, 1.toByte()))
        Assert.assertEquals(false, packet.failed)
        // message smaller than 10
        packet.handleMessage(createArray(15, 1.toByte()))
        Assert.assertEquals(true, packet.failed)
    }
}