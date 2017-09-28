package org.vld.sdp.structural

import org.mockito.Mockito.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AdapterTest {

    @Test
    @DisplayName("Given a Xiaomi phone and Xiaomi phone adapter. When switch on phone. Then the Xiaomi phone is turned on")
    fun givenXiaomiPhoneAndAdapter_whenSwitchOnPhone_thenTurnOnXiaomiPhone() {
        // Given
        val mockedXiaomiPhone: XiaomiPhone = mock(XiaomiPhone::class.java)
        val phone: Phone = XiaomiPhoneAdapter(mockedXiaomiPhone)
        // When
        // client works with the Xiaomi phone through the Phone interface and the Xiaomi phone adapter
        phone.switchOn()
        // Then
        // `XiaomiPhone::turnOn()` method is called
        verify(mockedXiaomiPhone).turnOn()
    }

}