package ltd.leotech.loginscreen

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var userVM : UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userVM = ViewModelProviders.of(this).get(UserViewModel::class.java)

        loginUser(userVM.username)
    }

    private fun loginUser(username: MutableLiveData<String>){
        username.observe(this, Observer {
            welcomeMessage.text = it
        })

        btn_login.setOnClickListener {
            userVM.login(txt_username.text.toString())
        }
    }
}
