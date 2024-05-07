package com.nabiha.awalkerja.features.authFeatures.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nabiha.awalkerja.data.datastore.PreferenceDatastore
import com.nabiha.awalkerja.domain.usecase.AuthUseCase
import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.nabiha.awalkerja.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authUseCase: AuthUseCase,
    private val preferenceDatastore: PreferenceDatastore
): ViewModel(){

    private val _loginUiState = MutableStateFlow<LoginUiState>(LoginUiState.Loading)
    val loginUiState get() = _loginUiState.asStateFlow()
    fun fetchLogin(login: LoginRequest){
        viewModelScope.launch {
            authUseCase.login(login).collect{response->
                when(response){
                    is Result.Error -> _loginUiState.value =
                        LoginUiState.Error(response.message)
                    is Result.Loading -> _loginUiState.value = LoginUiState.Loading
                    is Result.Success -> {
                        _loginUiState.value = LoginUiState.Success(response.data)
                        preferenceDatastore.setToken(response.data.token)
                    }
                }
            }
        }
    }


}

sealed interface LoginUiState{
    object Loading : LoginUiState
    data class Success(val data: LoginResponse): LoginUiState
    data class Error(val message:String) : LoginUiState
}