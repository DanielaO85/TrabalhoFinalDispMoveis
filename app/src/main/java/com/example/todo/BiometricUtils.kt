package com.example.todo

class BiometricUtils {

//    @RequiresApi(Build.VERSION_CODES.P)
//    fun authenticateWithBiometrics(activity: AppCompatActivity) {
//        val biometricManager = BiometricManager.from(activity)
//
//        if (biometricManager.canAuthenticate() == BiometricManager.BIOMETRIC_SUCCESS) {
//            val executor = ContextCompat.getMainExecutor(activity)
//            val biometricPrompt = BiometricPrompt(
//                activity,
//                executor,
//                object : BiometricPrompt.AuthenticationCallback() {
//                    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
//                        // Sucesso
//                    }
//                })
//
//            val promptInfo = BiometricPrompt.PromptInfo.Builder()
//                .setTitle("Autenticação Biométrica")
//                .setNegativeButtonText("Cancelar")
//                .build()
//
//            biometricPrompt.authenticate(promptInfo)
//        }
//    }
}