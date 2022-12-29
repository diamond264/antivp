package kr.ac.kaist.nmsl.antivp.core

enum class EventType(val value: Int) {
    CALL_RINGING(1),
    CALL_OFFHOOK(2),
    CALL_IDLE(3),
    SMS_RCVD(4),
    TEXT_TRANSCRIBED(5),
    PHISHING_CALL_DETECTED(6),
    PHISHING_APP_DETECTED(7),

    ;

    companion object {
        fun valueOf(value: Int): EventType? = EventType.values().find { it.value == value }
    }

}