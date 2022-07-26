package dev.atick.compose.ui.login

import androidx.compose.runtime.Composable
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.atick.core.ui.BaseComposeFragment

@AndroidEntryPoint
class LoginFragment : BaseComposeFragment() {

    @Composable
    override fun ComposeUi() {
        LoginScreen()
    }

    private fun navigateToConnectionFragment() {
        findNavController().navigate(
            LoginFragmentDirections.actionLoginFragmentToConnectionFragment()
        )
    }
}