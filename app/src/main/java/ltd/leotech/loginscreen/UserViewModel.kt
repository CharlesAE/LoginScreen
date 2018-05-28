package ltd.leotech.loginscreen

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class UserViewModel: ViewModel(){

    val username: MutableLiveData<String> = MutableLiveData()
    val password : MutableLiveData<String> = MutableLiveData()

    fun login(login: String){
        username.value = "Welcome, user :  "+login
    }
}