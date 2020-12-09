package com.nbprog.usefullextensionlibrary

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.nbprog.usefullextensionlibrary.test", appContext.packageName)
    }

    @Test
    fun isEmailValidTest() {
        val invalidEmail = "invalidEmail"
        val invalidEmail2 = "invalidEmail@.com"
        val invalidEmail3 = "!231correctEmail231@123.pl"
        val correctEmail = "correctEmail231@jlk.pl"
        val correctEmail2 = "231correctEmail231@123.cl"

        assertEquals(invalidEmail.isEmailValid(), false)
        assertEquals(invalidEmail2.isEmailValid(), false)
        assertEquals(invalidEmail3.isEmailValid(), false)

        assertEquals(correctEmail.isEmailValid(), true)
        assertEquals(correctEmail2.isEmailValid(), true)
    }

    @Test
    fun isNullTest() {
        val imNull = null
        val imNotNull = ""
        assertEquals(imNull.isNull(), true)
        assertEquals(imNotNull.isNull(), false)
    }
}