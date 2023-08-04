package com.homebody.features.support

sealed class SupportTypes {
    data object AboutUs: SupportTypes()
    data object TermsAndConditions: SupportTypes()
    data object TermsOfUse: SupportTypes()
    data object FAQs: SupportTypes()
    data object PrivacyNotice: SupportTypes()
}