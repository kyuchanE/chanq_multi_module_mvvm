package dev.kyu.user

import androidx.activity.viewModels
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.kyu.ui.BaseActivity
import dev.kyu.user.databinding.ActivityUserInfoBinding
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UserInfoActivity : BaseActivity<ActivityUserInfoBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_user_info

    private var cntUser: Int = 1

    private val userViewModel by viewModels<UserViewModel>()

    override fun initView() {
        observeViewModel()

        with(binding.etUserCnt) {
            doAfterTextChanged {
                if (this.text.isNotEmpty()) {
                    cntUser = this.text.toString().toInt()
                }
            }
        }

        binding.btnUser.setOnClickListener {
            try {
                userViewModel.getUserRepo(cntUser)
            }    catch (e: Exception) {

            }

        }
    }

    private fun observeViewModel() {
        lifecycleScope.launch {
            userViewModel.userRepo.collect {
                var str = ""
                it.forEach {
                    str += "${it.name.first} , "
                }
                binding.tvUser.text = str
            }
        }
    }

}